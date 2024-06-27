// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateDtsInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically renew the DTS instance when it expires. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: does not automatically renew the DTS instance when it expires. This is the default value.</li>
     * <li><strong>true</strong>: automatically renews the DTS instance when it expires.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to automatically start the task after the DTS instance is purchased. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: does not automatically start the task after the DTS instance is purchased. This is the default value.</li>
     * <li><strong>true</strong>: automatically starts the task after the DTS instance is purchased.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoStart")
    public Boolean autoStart;

    /**
     * <p>The specifications of the extract, transform, and load (ETL) instance. The unit is compute unit (CU). One CU is equal to 1 vCPU and 4 GB of memory. The value of this parameter must be an integer greater than or equal to 2.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ComputeUnit")
    public Integer computeUnit;

    /**
     * <p>The number of private custom ApsaraDB RDS instances in a PolarDB-X instance. Default value: <strong>1</strong>.</p>
     * <blockquote>
     * <p> You must specify this parameter only if the <strong>SourceEndpointEngineName</strong> parameter is set to <strong>drds</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DatabaseCount")
    public Integer databaseCount;

    /**
     * <p>The database engine of the destination instance.</p>
     * <ul>
     * <li><strong>MySQL</strong>: ApsaraDB RDS for MySQL instance or self-managed MySQL database</li>
     * <li><strong>PolarDB</strong>: PolarDB for MySQL cluster</li>
     * <li><strong>polardb_o</strong>: PolarDB for Oracle cluster</li>
     * <li><strong>polardb_pg</strong>: PolarDB for PostgreSQL cluster</li>
     * <li><strong>Redis</strong>: ApsaraDB for Redis instance or self-managed Redis database</li>
     * <li><strong>DRDS</strong>: PolarDB-X 1.0 or PolarDB-X 2.0 instance</li>
     * <li><strong>PostgreSQL</strong>: self-managed PostgreSQL database</li>
     * <li><strong>odps</strong>: MaxCompute project</li>
     * <li><strong>oracle</strong>: self-managed Oracle database</li>
     * <li><strong>mongodb</strong>: ApsaraDB for MongoDB instance or self-managed MongoDB database</li>
     * <li><strong>tidb</strong>: TiDB database</li>
     * <li><strong>ADS</strong>: AnalyticDB for MySQL V2.0 cluster</li>
     * <li><strong>ADB30</strong>: AnalyticDB for MySQL V3.0 cluster</li>
     * <li><strong>Greenplum</strong>: AnalyticDB for PostgreSQL instance</li>
     * <li><strong>MSSQL</strong>: ApsaraDB RDS for SQL Server instance or self-managed SQL Server database</li>
     * <li><strong>kafka</strong>: Message Queue for Apache Kafka instance or self-managed Kafka cluster</li>
     * <li><strong>DataHub</strong>: DataHub project</li>
     * <li><strong>DB2</strong>: self-managed Db2 for LUW database</li>
     * <li><strong>as400</strong>: AS/400</li>
     * <li><strong>Tablestore</strong>: Tablestore instance</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>The default value is <strong>MySQL</strong>.</li>
     * <li>For more information about the supported source and destination databases, see <a href="https://help.aliyun.com/document_detail/130744.html">Overview of data synchronization scenarios</a> and <a href="https://help.aliyun.com/document_detail/26618.html">Overview of data migration scenarios</a>.</li>
     * <li>You must specify one of this parameter and the <strong>JobId</strong> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DestinationEndpointEngineName")
    public String destinationEndpointEngineName;

    /**
     * <p>The ID of the region in which the destination instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * <blockquote>
     * <p> You must specify one of this parameter and the <strong>JobId</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DestinationRegion")
    public String destinationRegion;

    /**
     * <p>The number of DTS units (DUs) that are assigned to a DTS task that is run on a DTS dedicated cluster. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>The value of this parameter must be within the range of the number of DUs available for the DTS dedicated cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Du")
    public Integer du;

    /**
     * <p>The billing type for a change tracking instance. Valid values: ONLY_CONFIGURATION_FEE and CONFIGURATION_FEE_AND_DATA_FEE. ONLY_CONFIGURATION_FEE: charges only configuration fees. CONFIGURATION_FEE_AND_DATA_FEE: charges configuration fees and data traffic fees.</p>
     * 
     * <strong>example:</strong>
     * <p>ONLY_CONFIGURATION_FEE</p>
     */
    @NameInMap("FeeType")
    public String feeType;

    /**
     * <p>The instance class.</p>
     * <ul>
     * <li>DTS supports the following instance classes for a data migration instance: <strong>xxlarge</strong>, <strong>xlarge</strong>, <strong>large</strong>, <strong>medium</strong>, and <strong>small</strong>.</li>
     * <li>DTS supports the following instance classes for a data synchronization instance: <strong>large</strong>, <strong>medium</strong>, <strong>small</strong>, and <strong>micro</strong>.</li>
     * </ul>
     * <blockquote>
     * <p> For more information about the test performance of each instance class, see <a href="https://help.aliyun.com/document_detail/26606.html">Specifications of data migration instances</a> and <a href="https://help.aliyun.com/document_detail/26605.html">Specifications of data synchronization instances</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>xxlarge</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The ID of the task. You can call the <strong>ConfigureDtsJob</strong> operation to obtain the task ID from the <strong>DtsJobId</strong> parameter.</p>
     * <blockquote>
     * <p> If this parameter is specified, you do not need to specify the <strong>SourceRegion</strong>, <strong>DestinationRegion</strong>, <strong>Type</strong>, <strong>SourceEndpointEngineName</strong>, or <strong>DestinationEndpointEngineName</strong> parameter. Even if these parameters are specified, the value of the <strong>JobId</strong> parameter takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>bi6e22ay243****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("MaxDu")
    public Double maxDu;

    @NameInMap("MinDu")
    public Double minDu;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go</li>
     * </ul>
     * <blockquote>
     * <p> This parameter must be specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit of the subscription duration. Valid values: <strong>Year</strong> and <strong>Month</strong>.</p>
     * <blockquote>
     * <p> You must specify this parameter only if the <strong>PayType</strong> parameter is set to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The number of DTS instances that you want to purchase.</p>
     * <blockquote>
     * <p> Only a single instance can be purchased each time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    /**
     * <p>The ID of the region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The database engine of the source instance.</p>
     * <ul>
     * <li><strong>MySQL</strong>: ApsaraDB RDS for MySQL instance or self-managed MySQL database</li>
     * <li><strong>PolarDB</strong>: PolarDB for MySQL cluster</li>
     * <li><strong>polardb_o</strong>: PolarDB for Oracle cluster</li>
     * <li><strong>polardb_pg</strong>: PolarDB for PostgreSQL cluster</li>
     * <li><strong>Redis</strong>: ApsaraDB for Redis instance or self-managed Redis database</li>
     * <li><strong>DRDS</strong>: PolarDB-X 1.0 or PolarDB-X 2.0 instance</li>
     * <li><strong>PostgreSQL</strong>: self-managed PostgreSQL database</li>
     * <li><strong>odps</strong>: MaxCompute project</li>
     * <li><strong>oracle</strong>: self-managed Oracle database</li>
     * <li><strong>mongodb</strong>: ApsaraDB for MongoDB instance or self-managed MongoDB database</li>
     * <li><strong>tidb</strong>: TiDB database</li>
     * <li><strong>ADS</strong>: AnalyticDB for MySQL V2.0 cluster</li>
     * <li><strong>ADB30</strong>: AnalyticDB for MySQL V3.0 cluster</li>
     * <li><strong>Greenplum</strong>: AnalyticDB for PostgreSQL instance</li>
     * <li><strong>MSSQL</strong>: ApsaraDB RDS for SQL Server instance or self-managed SQL Server database</li>
     * <li><strong>kafka</strong>: Message Queue for Apache Kafka instance or self-managed Kafka cluster</li>
     * <li><strong>DataHub</strong>: DataHub project</li>
     * <li><strong>DB2</strong>: self-managed Db2 for LUW database</li>
     * <li><strong>as400</strong>: AS/400</li>
     * <li><strong>Tablestore</strong>: Tablestore instance</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>The default value is <strong>MySQL</strong>.</li>
     * <li>For more information about the supported source and destination databases, see <a href="https://help.aliyun.com/document_detail/130744.html">Overview of data synchronization scenarios</a> and <a href="https://help.aliyun.com/document_detail/26618.html">Overview of data migration scenarios</a>.</li>
     * <li>You must specify one of this parameter and the <strong>JobId</strong> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MYSQL</p>
     */
    @NameInMap("SourceEndpointEngineName")
    public String sourceEndpointEngineName;

    /**
     * <p>The ID of the region in which the source instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * <blockquote>
     * <p> You must specify one of this parameter and the <strong>JobId</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceRegion")
    public String sourceRegion;

    /**
     * <p>The synchronization topology. Valid values:</p>
     * <ul>
     * <li><strong>oneway</strong>: one-way synchronization. This is the default value.</li>
     * <li><strong>bidirectional</strong>: two-way synchronization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oneway</p>
     */
    @NameInMap("SyncArchitecture")
    public String syncArchitecture;

    /**
     * <p>The type of the DTS instance. Valid values:</p>
     * <ul>
     * <li><p><strong>MIGRATION</strong>: data migration instance</p>
     * </li>
     * <li><p><strong>SYNC</strong>: data synchronization instance</p>
     * </li>
     * <li><p><strong>SUBSCRIBE</strong>: change tracking instance</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You must specify one of this parameter and the <strong>JobId</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SYNC</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The subscription duration.</p>
     * <ul>
     * <li><p>Valid values if the <strong>Period</strong> parameter is set to <strong>Month</strong>: 1, 2, 3, 4, 5, 6, 7, 8, and 9.</p>
     * </li>
     * <li><p>Valid values if the <strong>Period</strong> parameter is set to <strong>Year</strong>: 1, 2, 3, and 5.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You must specify this parameter only if the <strong>PayType</strong> parameter is set to <strong>PrePaid</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>You can set the <strong>Period</strong> parameter to specify the unit of the subscription duration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
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
