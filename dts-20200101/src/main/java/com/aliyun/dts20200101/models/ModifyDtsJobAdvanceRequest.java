// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobAdvanceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The **ClientToken** parameter can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DataInitialization")
    public Boolean dataInitialization;

    @NameInMap("DataSynchronization")
    public Boolean dataSynchronization;

    /**
     * <p>The objects of the data synchronization task after modification. The value is a JSON string. For more information, see [Objects of DTS tasks](~~209545~~).</p>
     * <br>
     * <p>>  Before you call the ModifyDtsJob operation, we recommend that you call the [DescribeDtsJobDetail](~~208925~~) to query the current objects of the data synchronization task. Then, you can specify the new objects based on your business requirements. For example, if the current objects are Table A and Table B and you need to add Table C, you must specify Table A, Table B, and Table C for this parameter.</p>
     */
    @NameInMap("DbList")
    public java.util.Map<String, ?> dbList;

    /**
     * <p>The ID of the data synchronization instance.</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The operator that is related to the extract, transform, and load (ETL) feature and dedicated to T+1 business.</p>
     */
    @NameInMap("EtlOperatorColumnReference")
    public String etlOperatorColumnReference;

    /**
     * <p>The endpoint of the Object Storage Service (OSS) bucket in which the files to be synchronized are stored.</p>
     */
    @NameInMap("FileOssUrl")
    public java.io.InputStream fileOssUrlObject;

    /**
     * <p>The name of the table to be filtered.</p>
     */
    @NameInMap("FilterTableName")
    public String filterTableName;

    /**
     * <p>The method that is used to modify the data synchronization task. If you do not specify the parameter, the objects of the data synchronization task are modified by default. If you specify UPDATE_RESERVED for the parameter, the reserved parameters are modified.</p>
     */
    @NameInMap("ModifyTypeEnum")
    public String modifyTypeEnum;

    /**
     * <p>The ID of the region in which the data synchronization instance resides. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The reserved parameters of the data synchronization task. You can add reserved parameters instead of overwriting the existing reserved parameters. The value of the parameter is a MAP JSON string. You can specify this parameter to meet special requirements, such as specifying whether to automatically start the precheck of the data synchronization task. For more information, see [MigrationReserved](~~176470~~).</p>
     */
    @NameInMap("Reserved")
    public String reserved;

    @NameInMap("StructureInitialization")
    public Boolean structureInitialization;

    /**
     * <p>The synchronization direction. Valid values:</p>
     * <br>
     * <p>*   **Forward**: Data is synchronized from the source database to the destination database.</p>
     * <p>*   **Reverse**: Data is synchronized from the destination database to the source database.</p>
     * <br>
     * <p>> </p>
     * <p>*   Default value: **Forward**.</p>
     * <p>*   This parameter is required only if the topology of the data synchronization instance is two-way synchronization.</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    public static ModifyDtsJobAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobAdvanceRequest self = new ModifyDtsJobAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobAdvanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDtsJobAdvanceRequest setDataInitialization(Boolean dataInitialization) {
        this.dataInitialization = dataInitialization;
        return this;
    }
    public Boolean getDataInitialization() {
        return this.dataInitialization;
    }

    public ModifyDtsJobAdvanceRequest setDataSynchronization(Boolean dataSynchronization) {
        this.dataSynchronization = dataSynchronization;
        return this;
    }
    public Boolean getDataSynchronization() {
        return this.dataSynchronization;
    }

    public ModifyDtsJobAdvanceRequest setDbList(java.util.Map<String, ?> dbList) {
        this.dbList = dbList;
        return this;
    }
    public java.util.Map<String, ?> getDbList() {
        return this.dbList;
    }

    public ModifyDtsJobAdvanceRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ModifyDtsJobAdvanceRequest setEtlOperatorColumnReference(String etlOperatorColumnReference) {
        this.etlOperatorColumnReference = etlOperatorColumnReference;
        return this;
    }
    public String getEtlOperatorColumnReference() {
        return this.etlOperatorColumnReference;
    }

    public ModifyDtsJobAdvanceRequest setFileOssUrlObject(java.io.InputStream fileOssUrlObject) {
        this.fileOssUrlObject = fileOssUrlObject;
        return this;
    }
    public java.io.InputStream getFileOssUrlObject() {
        return this.fileOssUrlObject;
    }

    public ModifyDtsJobAdvanceRequest setFilterTableName(String filterTableName) {
        this.filterTableName = filterTableName;
        return this;
    }
    public String getFilterTableName() {
        return this.filterTableName;
    }

    public ModifyDtsJobAdvanceRequest setModifyTypeEnum(String modifyTypeEnum) {
        this.modifyTypeEnum = modifyTypeEnum;
        return this;
    }
    public String getModifyTypeEnum() {
        return this.modifyTypeEnum;
    }

    public ModifyDtsJobAdvanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDtsJobAdvanceRequest setReserved(String reserved) {
        this.reserved = reserved;
        return this;
    }
    public String getReserved() {
        return this.reserved;
    }

    public ModifyDtsJobAdvanceRequest setStructureInitialization(Boolean structureInitialization) {
        this.structureInitialization = structureInitialization;
        return this;
    }
    public Boolean getStructureInitialization() {
        return this.structureInitialization;
    }

    public ModifyDtsJobAdvanceRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

}
