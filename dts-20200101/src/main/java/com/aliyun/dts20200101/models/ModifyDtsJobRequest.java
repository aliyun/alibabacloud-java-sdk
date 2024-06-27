// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The <strong>ClientToken</strong> parameter can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform full data migration or synchronization. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DataInitialization")
    public Boolean dataInitialization;

    /**
     * <p>Specifies whether to perform incremental data migration or synchronization. Valid values:</p>
     * <ul>
     * <li><strong>false</strong></li>
     * <li><strong>true</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DataSynchronization")
    public Boolean dataSynchronization;

    /**
     * <p>The objects of the data synchronization task after modification. The value must be a JSON string. For more information, see <a href="https://help.aliyun.com/document_detail/209545.html">Objects of DTS tasks</a>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The new value of DbList overwrites the original value. Make sure that all the objects that you want to synchronize are specified. Otherwise, some objects may be lost. Specify this parameter with caution.</p>
     * </li>
     * <li><p>Before you call the ModifyDtsJob operation, we recommend that you call the <a href="https://help.aliyun.com/document_detail/208925.html">DescribeDtsJobDetail</a> operation to query the current objects of the data synchronization task. Then, you can specify the new objects based on your business requirements. For example, if the current objects are Table A and Table B and you need to add Table C, you must specify Table A, Table B, and Table C for this parameter.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dtstest&quot;:{&quot;name&quot;:&quot;dtstest&quot;,&quot;all&quot;:true}}</p>
     */
    @NameInMap("DbList")
    public java.util.Map<String, ?> dbList;

    /**
     * <p>The ID of the data synchronization instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsbi6e22ay243****</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The synchronization task ID. You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>fpx1149rw7p***</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The operator that is related to the extract, transform, and load (ETL) feature and dedicated to T+1 business.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;configKeyMap&quot;: [
     *     {
     *       &quot;moduleCode&quot;: &quot;03&quot;,
     *       &quot;etlOperatorColumnReference&quot;: &quot;etlOperatorColumnReference&quot;,
     *       &quot;etlOperatorSetting&quot;: &quot;etlOperatorSetting&quot;
     *     },
     *     {
     *       &quot;moduleCode&quot;: &quot;07&quot;,
     *       &quot;etlOperatorColumnReference&quot;: &quot;etlOperatorColumnReference&quot;,
     *       &quot;etlOperatorSetting&quot;: &quot;etlOperatorSetting&quot;
     *     }
     *   ],
     *   &quot;amp.increment.replicator.compare.all.columns.enable&quot;: false,
     *   &quot;srcNetType&quot;: &quot;VPC&quot;,
     *   &quot;etlOperatorColumnReference&quot;: {
     *     &quot;MODIFY_TIME&quot;: [
     *       {
     *         &quot;datasynchron.test_timing_user_000&quot;: &quot;user_create_date&quot;
     *       },
     *       {
     *         &quot;datasynchron.test_timing_user_001&quot;: &quot;user_create_date&quot;
     *       },
     *       {
     *         &quot;datasynchron.test_timing_user_002&quot;: &quot;user_create_date&quot;
     *       },
     *       {
     *         &quot;datasynchron.test_timing_user_003&quot;: &quot;user_create_date&quot;
     *       }
     *     ]
     *   },
     *   &quot;destNetType&quot;: &quot;VPC&quot;,
     *   &quot;originalSrcDbInst&quot;: &quot;sg-sit-db2-primary.mysql.polardb.rds.aliyuncs.com&quot;,
     *   &quot;etlOperatorSetting&quot;: &quot;adb_time_travel&quot;,
     *   &quot;sjobUseJobTask&quot;: &quot;1&quot;,
     *   &quot;srcVpcNetMappingInst&quot;: &quot;172.19.XXX.XXX:4261&quot;,
     *   &quot;destVpcNetMappingInst&quot;: &quot;172.19.XXX.XXX:4260&quot;,
     *   &quot;useJobTask&quot;: &quot;1&quot;
     * }</p>
     */
    @NameInMap("EtlOperatorColumnReference")
    public String etlOperatorColumnReference;

    /**
     * <p>The endpoint of the Object Storage Service (OSS) bucket in which the files to be synchronized are stored.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://db-list-os-file.oss-cn-shanghai.aliyuncs.com/8e42_12185******43989">http://db-list-os-file.oss-cn-shanghai.aliyuncs.com/8e42_12185******43989</a>_************</p>
     */
    @NameInMap("FileOssUrl")
    public String fileOssUrl;

    /**
     * <p>The name of the table to be filtered.</p>
     * 
     * <strong>example:</strong>
     * <p>testtable</p>
     */
    @NameInMap("FilterTableName")
    public String filterTableName;

    /**
     * <p>The method that is used to modify the data synchronization task. If you do not specify the parameter, the objects of the data synchronization task are modified by default. If you specify UPDATE_RESERVED for the parameter, the reserved parameters are modified.</p>
     * 
     * <strong>example:</strong>
     * <p>UPDATE_RESERVED</p>
     */
    @NameInMap("ModifyTypeEnum")
    public String modifyTypeEnum;

    /**
     * <p>The ID of the region in which the data synchronization instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The reserved parameters of the data synchronization task. You can add reserved parameters instead of overwriting the existing reserved parameters. The value of the parameter is a MAP JSON string. You can specify this parameter to meet special requirements, such as specifying whether to automatically start the precheck of the data synchronization task. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;srcHostPorts\&quot;:\&quot;\&quot;,\&quot;whitelist.dms.online.ddl.enable\&quot;:false,\&quot;filterDDL\&quot;:false,\&quot;sqlparser.dms.original.ddl\&quot;:true,\&quot;srcOracleType\&quot;:\&quot;sid\&quot;,\&quot;maxRetryTime\&quot;:43200,\&quot;destSSL\&quot;:\&quot;0\&quot;,\&quot;destOracleType\&quot;:\&quot;sid\&quot;,\&quot;srcSSL\&quot;:\&quot;0\&quot;,\&quot;dbListCaseChangeMode\&quot;:\&quot;default\&quot;,\&quot;SourceEngineVersion\&quot;:\&quot;8.0.18\&quot;,\&quot;srcNetType\&quot;:\&quot;VPC\&quot;,\&quot;destNetType\&quot;:\&quot;VPC\&quot;,\&quot;srcVpcNetMappingInst\&quot;:\&quot;172.16.1**.<strong>:10803\&quot;,\&quot;destVpcNetMappingInst\&quot;:\&quot;172.16.1</strong>.**:11077\&quot;,\&quot;useJobTask\&quot;:\&quot;1\&quot;}</p>
     */
    @NameInMap("Reserved")
    public String reserved;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to perform schema migration or synchronization. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("StructureInitialization")
    public Boolean structureInitialization;

    /**
     * <p>The synchronization direction. Valid values:</p>
     * <ul>
     * <li><strong>Forward</strong>: Data is synchronized from the source database to the destination database.</li>
     * <li><strong>Reverse</strong>: Data is synchronized from the destination database to the source database.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Default value: <strong>Forward</strong>.</li>
     * <li>This parameter is required only if the topology of the data synchronization instance is two-way synchronization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Forward</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    @NameInMap("ZeroEtlJob")
    public Boolean zeroEtlJob;

    public static ModifyDtsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobRequest self = new ModifyDtsJobRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDtsJobRequest setDataInitialization(Boolean dataInitialization) {
        this.dataInitialization = dataInitialization;
        return this;
    }
    public Boolean getDataInitialization() {
        return this.dataInitialization;
    }

    public ModifyDtsJobRequest setDataSynchronization(Boolean dataSynchronization) {
        this.dataSynchronization = dataSynchronization;
        return this;
    }
    public Boolean getDataSynchronization() {
        return this.dataSynchronization;
    }

    public ModifyDtsJobRequest setDbList(java.util.Map<String, ?> dbList) {
        this.dbList = dbList;
        return this;
    }
    public java.util.Map<String, ?> getDbList() {
        return this.dbList;
    }

    public ModifyDtsJobRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ModifyDtsJobRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ModifyDtsJobRequest setEtlOperatorColumnReference(String etlOperatorColumnReference) {
        this.etlOperatorColumnReference = etlOperatorColumnReference;
        return this;
    }
    public String getEtlOperatorColumnReference() {
        return this.etlOperatorColumnReference;
    }

    public ModifyDtsJobRequest setFileOssUrl(String fileOssUrl) {
        this.fileOssUrl = fileOssUrl;
        return this;
    }
    public String getFileOssUrl() {
        return this.fileOssUrl;
    }

    public ModifyDtsJobRequest setFilterTableName(String filterTableName) {
        this.filterTableName = filterTableName;
        return this;
    }
    public String getFilterTableName() {
        return this.filterTableName;
    }

    public ModifyDtsJobRequest setModifyTypeEnum(String modifyTypeEnum) {
        this.modifyTypeEnum = modifyTypeEnum;
        return this;
    }
    public String getModifyTypeEnum() {
        return this.modifyTypeEnum;
    }

    public ModifyDtsJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDtsJobRequest setReserved(String reserved) {
        this.reserved = reserved;
        return this;
    }
    public String getReserved() {
        return this.reserved;
    }

    public ModifyDtsJobRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyDtsJobRequest setStructureInitialization(Boolean structureInitialization) {
        this.structureInitialization = structureInitialization;
        return this;
    }
    public Boolean getStructureInitialization() {
        return this.structureInitialization;
    }

    public ModifyDtsJobRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public ModifyDtsJobRequest setZeroEtlJob(Boolean zeroEtlJob) {
        this.zeroEtlJob = zeroEtlJob;
        return this;
    }
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

}
