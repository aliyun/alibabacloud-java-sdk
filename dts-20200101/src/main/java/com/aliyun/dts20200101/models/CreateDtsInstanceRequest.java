// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateDtsInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically renew the DTS instance when it expires. Valid values:</p>
     * <br>
     * <p>*   **false**: does not automatically renew the DTS instance when it expires. This is the default value.</p>
     * <p>*   **true**: automatically renews the DTS instance when it expires.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to automatically start the task after the DTS instance is purchased. Valid values:</p>
     * <br>
     * <p>*   **false**: does not automatically start the task after the DTS instance is purchased. This is the default value.</p>
     * <p>*   **true**: automatically starts the task after the DTS instance is purchased.</p>
     */
    @NameInMap("AutoStart")
    public Boolean autoStart;

    /**
     * <p>The specifications of the extract, transform, and load (ETL) instance. The unit is compute unit (CU). One CU is equal to 1 vCPU and 4 GB of memory. The value of this parameter must be an integer greater than or equal to 2.</p>
     */
    @NameInMap("ComputeUnit")
    public Integer computeUnit;

    /**
     * <p>The number of private custom ApsaraDB RDS instances in a PolarDB-X instance. Default value: **1**.</p>
     * <br>
     * <p>>  You must specify this parameter only if the **SourceEndpointEngineName** parameter is set to **drds**.</p>
     */
    @NameInMap("DatabaseCount")
    public Integer databaseCount;

    /**
     * <p>The database engine of the destination instance.</p>
     * <br>
     * <p>*   **MySQL**: ApsaraDB RDS for MySQL instance or self-managed MySQL database</p>
     * <p>*   **PolarDB**: PolarDB for MySQL cluster</p>
     * <p>*   **polardb_o**: PolarDB for Oracle cluster</p>
     * <p>*   **polardb_pg**: PolarDB for PostgreSQL cluster</p>
     * <p>*   **Redis**: ApsaraDB for Redis instance or self-managed Redis database</p>
     * <p>*   **DRDS**: PolarDB-X 1.0 or PolarDB-X 2.0 instance</p>
     * <p>*   **PostgreSQL**: self-managed PostgreSQL database</p>
     * <p>*   **odps**: MaxCompute project</p>
     * <p>*   **oracle**: self-managed Oracle database</p>
     * <p>*   **mongodb**: ApsaraDB for MongoDB instance or self-managed MongoDB database</p>
     * <p>*   **tidb**: TiDB database</p>
     * <p>*   **ADS**: AnalyticDB for MySQL V2.0 cluster</p>
     * <p>*   **ADB30**: AnalyticDB for MySQL V3.0 cluster</p>
     * <p>*   **Greenplum**: AnalyticDB for PostgreSQL instance</p>
     * <p>*   **MSSQL**: ApsaraDB RDS for SQL Server instance or self-managed SQL Server database</p>
     * <p>*   **kafka**: Message Queue for Apache Kafka instance or self-managed Kafka cluster</p>
     * <p>*   **DataHub**: DataHub project</p>
     * <p>*   **DB2**: self-managed Db2 for LUW database</p>
     * <p>*   **as400**: AS/400</p>
     * <p>*   **Tablestore**: Tablestore instance</p>
     * <br>
     * <p>> </p>
     * <p>*   The default value is **MySQL**.</p>
     * <p>*   For more information about the supported source and destination databases, see [Overview of data synchronization scenarios](https://help.aliyun.com/document_detail/130744.html) and [Overview of data migration scenarios](https://help.aliyun.com/document_detail/26618.html).</p>
     * <p>*   You must specify one of this parameter and the **JobId** parameter.</p>
     */
    @NameInMap("DestinationEndpointEngineName")
    public String destinationEndpointEngineName;

    /**
     * <p>The ID of the region in which the destination instance resides. For more information, see [List of supported regions](https://help.aliyun.com/document_detail/141033.html).</p>
     * <br>
     * <p>>  You must specify one of this parameter and the **JobId** parameter.</p>
     */
    @NameInMap("DestinationRegion")
    public String destinationRegion;

    /**
     * <p>The number of DTS units (DUs) that are assigned to a DTS task that is run on a DTS dedicated cluster. Valid values: **1** to **100**.</p>
     * <br>
     * <p>> </p>
     * <p>*   The value of this parameter must be within the range of the number of DUs available for the DTS dedicated cluster.</p>
     */
    @NameInMap("Du")
    public Integer du;

    /**
     * <p>The billing type for a change tracking instance. Valid values: ONLY_CONFIGURATION_FEE and CONFIGURATION_FEE_AND_DATA_FEE. ONLY_CONFIGURATION_FEE: charges only configuration fees. CONFIGURATION_FEE_AND_DATA_FEE: charges configuration fees and data traffic fees.</p>
     */
    @NameInMap("FeeType")
    public String feeType;

    /**
     * <p>The instance class.</p>
     * <br>
     * <p>*   DTS supports the following instance classes for a data migration instance: **xxlarge**, **xlarge**, **large**, **medium**, and **small**.</p>
     * <p>*   DTS supports the following instance classes for a data synchronization instance: **large**, **medium**, **small**, and **micro**.</p>
     * <br>
     * <p>>  For more information about the test performance of each instance class, see [Specifications of data migration instances](https://help.aliyun.com/document_detail/26606.html) and [Specifications of data synchronization instances](https://help.aliyun.com/document_detail/26605.html).</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The ID of the task. You can call the **ConfigureDtsJob** operation to obtain the task ID from the **DtsJobId** parameter.</p>
     * <br>
     * <p>>  If this parameter is specified, you do not need to specify the **SourceRegion**, **DestinationRegion**, **Type**, **SourceEndpointEngineName**, or **DestinationEndpointEngineName** parameter. Even if these parameters are specified, the value of the **JobId** parameter takes precedence.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("MaxDu")
    public Double maxDu;

    @NameInMap("MinDu")
    public Double minDu;

    /**
     * <p>The billing method. Valid values:</p>
     * <br>
     * <p>*   **PrePaid**: subscription</p>
     * <p>*   **PostPaid**: pay-as-you-go</p>
     * <br>
     * <p>>  This parameter must be specified.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit of the subscription duration. Valid values: **Year** and **Month**.</p>
     * <br>
     * <p>>  You must specify this parameter only if the **PayType** parameter is set to **PrePaid**.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The number of DTS instances that you want to purchase.</p>
     * <br>
     * <p>>  Only a single instance can be purchased each time.</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    /**
     * <p>The ID of the region in which the DTS instance resides. For more information, see [List of supported regions](https://help.aliyun.com/document_detail/141033.html).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The database engine of the source instance.</p>
     * <br>
     * <p>*   **MySQL**: ApsaraDB RDS for MySQL instance or self-managed MySQL database</p>
     * <p>*   **PolarDB**: PolarDB for MySQL cluster</p>
     * <p>*   **polardb_o**: PolarDB for Oracle cluster</p>
     * <p>*   **polardb_pg**: PolarDB for PostgreSQL cluster</p>
     * <p>*   **Redis**: ApsaraDB for Redis instance or self-managed Redis database</p>
     * <p>*   **DRDS**: PolarDB-X 1.0 or PolarDB-X 2.0 instance</p>
     * <p>*   **PostgreSQL**: self-managed PostgreSQL database</p>
     * <p>*   **odps**: MaxCompute project</p>
     * <p>*   **oracle**: self-managed Oracle database</p>
     * <p>*   **mongodb**: ApsaraDB for MongoDB instance or self-managed MongoDB database</p>
     * <p>*   **tidb**: TiDB database</p>
     * <p>*   **ADS**: AnalyticDB for MySQL V2.0 cluster</p>
     * <p>*   **ADB30**: AnalyticDB for MySQL V3.0 cluster</p>
     * <p>*   **Greenplum**: AnalyticDB for PostgreSQL instance</p>
     * <p>*   **MSSQL**: ApsaraDB RDS for SQL Server instance or self-managed SQL Server database</p>
     * <p>*   **kafka**: Message Queue for Apache Kafka instance or self-managed Kafka cluster</p>
     * <p>*   **DataHub**: DataHub project</p>
     * <p>*   **DB2**: self-managed Db2 for LUW database</p>
     * <p>*   **as400**: AS/400</p>
     * <p>*   **Tablestore**: Tablestore instance</p>
     * <br>
     * <p>> </p>
     * <p>*   The default value is **MySQL**.</p>
     * <p>*   For more information about the supported source and destination databases, see [Overview of data synchronization scenarios](https://help.aliyun.com/document_detail/130744.html) and [Overview of data migration scenarios](https://help.aliyun.com/document_detail/26618.html).</p>
     * <p>*   You must specify one of this parameter and the **JobId** parameter.</p>
     */
    @NameInMap("SourceEndpointEngineName")
    public String sourceEndpointEngineName;

    /**
     * <p>The ID of the region in which the source instance resides. For more information, see [List of supported regions](https://help.aliyun.com/document_detail/141033.html).</p>
     * <br>
     * <p>>  You must specify one of this parameter and the **JobId** parameter.</p>
     */
    @NameInMap("SourceRegion")
    public String sourceRegion;

    /**
     * <p>The synchronization topology. Valid values:</p>
     * <br>
     * <p>*   **oneway**: one-way synchronization. This is the default value.</p>
     * <p>*   **bidirectional**: two-way synchronization.</p>
     */
    @NameInMap("SyncArchitecture")
    public String syncArchitecture;

    /**
     * <p>The type of the DTS instance. Valid values:</p>
     * <br>
     * <p>*   **MIGRATION**: data migration instance</p>
     * <br>
     * <p>*   **SYNC**: data synchronization instance</p>
     * <br>
     * <p>*   **SUBSCRIBE**: change tracking instance</p>
     * <br>
     * <p>> You must specify one of this parameter and the **JobId** parameter.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The subscription duration.</p>
     * <br>
     * <p>*   Valid values if the **Period** parameter is set to **Month**: 1, 2, 3, 4, 5, 6, 7, 8, and 9.</p>
     * <br>
     * <p>*   Valid values if the **Period** parameter is set to **Year**: 1, 2, 3, and 5.</p>
     * <br>
     * <p>> *   You must specify this parameter only if the **PayType** parameter is set to **PrePaid**.</p>
     * <p>   *   You can set the **Period** parameter to specify the unit of the subscription duration.</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    public static CreateDtsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDtsInstanceRequest self = new CreateDtsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDtsInstanceRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateDtsInstanceRequest setAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    public CreateDtsInstanceRequest setComputeUnit(Integer computeUnit) {
        this.computeUnit = computeUnit;
        return this;
    }
    public Integer getComputeUnit() {
        return this.computeUnit;
    }

    public CreateDtsInstanceRequest setDatabaseCount(Integer databaseCount) {
        this.databaseCount = databaseCount;
        return this;
    }
    public Integer getDatabaseCount() {
        return this.databaseCount;
    }

    public CreateDtsInstanceRequest setDestinationEndpointEngineName(String destinationEndpointEngineName) {
        this.destinationEndpointEngineName = destinationEndpointEngineName;
        return this;
    }
    public String getDestinationEndpointEngineName() {
        return this.destinationEndpointEngineName;
    }

    public CreateDtsInstanceRequest setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }
    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    public CreateDtsInstanceRequest setDu(Integer du) {
        this.du = du;
        return this;
    }
    public Integer getDu() {
        return this.du;
    }

    public CreateDtsInstanceRequest setFeeType(String feeType) {
        this.feeType = feeType;
        return this;
    }
    public String getFeeType() {
        return this.feeType;
    }

    public CreateDtsInstanceRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public CreateDtsInstanceRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateDtsInstanceRequest setMaxDu(Double maxDu) {
        this.maxDu = maxDu;
        return this;
    }
    public Double getMaxDu() {
        return this.maxDu;
    }

    public CreateDtsInstanceRequest setMinDu(Double minDu) {
        this.minDu = minDu;
        return this;
    }
    public Double getMinDu() {
        return this.minDu;
    }

    public CreateDtsInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDtsInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateDtsInstanceRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public CreateDtsInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDtsInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDtsInstanceRequest setSourceEndpointEngineName(String sourceEndpointEngineName) {
        this.sourceEndpointEngineName = sourceEndpointEngineName;
        return this;
    }
    public String getSourceEndpointEngineName() {
        return this.sourceEndpointEngineName;
    }

    public CreateDtsInstanceRequest setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    public CreateDtsInstanceRequest setSyncArchitecture(String syncArchitecture) {
        this.syncArchitecture = syncArchitecture;
        return this;
    }
    public String getSyncArchitecture() {
        return this.syncArchitecture;
    }

    public CreateDtsInstanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDtsInstanceRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

}
