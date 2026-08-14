// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. <strong>ClientToken</strong> can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform full data migration or initial full data synchronization. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong>: no.</li>
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
     * <li><strong>false</strong>: no.</li>
     * <li><strong>true</strong>: yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DataSynchronization")
    public Boolean dataSynchronization;

    /**
     * <p>The modified synchronization objects, in JSON format. For more information about the definition, see <a href="https://help.aliyun.com/document_detail/209545.html">Objects of DTS tasks</a>.</p>
     * <ul>
     * <li>The original DbList is overwritten by the new DbList. Make sure that the new DbList contains all the objects that need to be synchronized. Otherwise, synchronization objects may be lost. Modify this parameter with caution.</li>
     * <li>Call <a href="https://help.aliyun.com/document_detail/208925.html">DescribeDtsJobDetail</a> to query the current synchronization objects before you modify them based on your business requirements. For example, if the current objects are tables A and B, and you want to add table C, specify tables A, B, and C in this parameter.</li>
     * <li>The maximum size of DbList is 1 MB.</li>
     * <li>If DbList contains filter conditions, the total length of DbList (including filter conditions) cannot exceed 1 MB.</li>
     * <li>For distributed tasks (such as migration or synchronization tasks whose source is PolarDB-X 1.0), DbList is split based on physical shards and multiple subtasks are generated. The maximum size of DbList for each subtask is 1 MB.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dtstest&quot;:{&quot;name&quot;:&quot;dtstest&quot;,&quot;all&quot;:true}}</p>
     */
    @NameInMap("DbList")
    public String dbListShrink;

    /**
     * <p>The instance ID of the data synchronization instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsbi6e22ay243****</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The ID of the synchronization task. You can call <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> to query the task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>fpx1149rw7p***</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>A field dedicated to T+1 business scenarios. This is an ETL operator and a business-specific field.</p>
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
     * <p>The OSS URL of the synchronization file.</p>
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
     * <p>The method used to modify the synchronization task. If this parameter is not specified, the synchronization objects are modified by default. Set this parameter to UPDATE_RESERVED to modify reserved parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>UPDATE_RESERVED</p>
     */
    @NameInMap("ModifyTypeEnum")
    public String modifyTypeEnum;

    /**
     * <p>The region in which the instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The reserved parameters of DTS. The update method is append rather than overwrite. The value is in the MAP JSON format. You can specify this parameter to meet special requirements, such as whether to automatically start a precheck. The usage is similar to that of the Reserve parameter. For details, see <a href="https://help.aliyun.com/document_detail/273111.html">Reserve parameter description</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;definer&quot;: false,&quot;syncArchitecture&quot;: &quot;oneway&quot;,&quot;whitelist.dms.online.ddl.enable&quot;: false,&quot;destSSL&quot;: &quot;0&quot;,&quot;triggerMode&quot;: &quot;manual&quot;,&quot;sqlparser.dms.original.ddl&quot;: true,&quot;whitelist.ghost.online.ddl.enable&quot;: false,&quot;privilegeMigration&quot;: false,&quot;maxRetryTime&quot;: 43200,&quot;srcSSL&quot;: &quot;0&quot;,&quot;autoStartModulesAfterConfig&quot;: &quot;none&quot;}</p>
     */
    @NameInMap("Reserved")
    public String reserved;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to perform schema migration or initial schema synchronization. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong>: no.</li>
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
     * <li><strong>Forward</strong>: forward.</li>
     * <li><strong>Reverse</strong>: reverse.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Default value: <strong>Forward</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>This parameter is required only when the synchronization topology of the data synchronization instance is two-way synchronization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Forward</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    /**
     * <p>Specifies whether this is a seamless integration (zero-ETL) node. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong>: no.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ZeroEtlJob")
    public Boolean zeroEtlJob;

    public static ModifyDtsJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobShrinkRequest self = new ModifyDtsJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDtsJobShrinkRequest setDataInitialization(Boolean dataInitialization) {
        this.dataInitialization = dataInitialization;
        return this;
    }
    public Boolean getDataInitialization() {
        return this.dataInitialization;
    }

    public ModifyDtsJobShrinkRequest setDataSynchronization(Boolean dataSynchronization) {
        this.dataSynchronization = dataSynchronization;
        return this;
    }
    public Boolean getDataSynchronization() {
        return this.dataSynchronization;
    }

    public ModifyDtsJobShrinkRequest setDbListShrink(String dbListShrink) {
        this.dbListShrink = dbListShrink;
        return this;
    }
    public String getDbListShrink() {
        return this.dbListShrink;
    }

    public ModifyDtsJobShrinkRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ModifyDtsJobShrinkRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ModifyDtsJobShrinkRequest setEtlOperatorColumnReference(String etlOperatorColumnReference) {
        this.etlOperatorColumnReference = etlOperatorColumnReference;
        return this;
    }
    public String getEtlOperatorColumnReference() {
        return this.etlOperatorColumnReference;
    }

    public ModifyDtsJobShrinkRequest setFileOssUrl(String fileOssUrl) {
        this.fileOssUrl = fileOssUrl;
        return this;
    }
    public String getFileOssUrl() {
        return this.fileOssUrl;
    }

    public ModifyDtsJobShrinkRequest setFilterTableName(String filterTableName) {
        this.filterTableName = filterTableName;
        return this;
    }
    public String getFilterTableName() {
        return this.filterTableName;
    }

    public ModifyDtsJobShrinkRequest setModifyTypeEnum(String modifyTypeEnum) {
        this.modifyTypeEnum = modifyTypeEnum;
        return this;
    }
    public String getModifyTypeEnum() {
        return this.modifyTypeEnum;
    }

    public ModifyDtsJobShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDtsJobShrinkRequest setReserved(String reserved) {
        this.reserved = reserved;
        return this;
    }
    public String getReserved() {
        return this.reserved;
    }

    public ModifyDtsJobShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyDtsJobShrinkRequest setStructureInitialization(Boolean structureInitialization) {
        this.structureInitialization = structureInitialization;
        return this;
    }
    public Boolean getStructureInitialization() {
        return this.structureInitialization;
    }

    public ModifyDtsJobShrinkRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public ModifyDtsJobShrinkRequest setZeroEtlJob(Boolean zeroEtlJob) {
        this.zeroEtlJob = zeroEtlJob;
        return this;
    }
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

}
