// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateDtsInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal upon expiration. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: no. This is the default value.</li>
     * <li><strong>true</strong>: yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to automatically start the task after the purchase is completed. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: no. This is the default value.</li>
     * <li><strong>true</strong>: yes.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when a valid task ID is specified for the <strong>JobId</strong> parameter and this parameter is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoStart")
    public Boolean autoStart;

    /**
     * <p>The specifications of the ETL node. Unit: compute unit (CU). 1 CU equals 1 vCPU and 4 GB of memory. The value must be an integer greater than or equal to 2.
     * &lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>If you specify this parameter, the <a href="https://help.aliyun.com/document_detail/212324.html">ETL feature</a> is enabled to perform data cleaning and transformation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ComputeUnit")
    public Integer computeUnit;

    /**
     * <p>The number of private custom ApsaraDB RDS instances in PolarDB-X. Default value: <strong>1</strong>.</p>
     * <blockquote>
     * <p>This parameter is required only when the <strong>SourceEndpointEngineName</strong> parameter is set to <strong>drds</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DatabaseCount")
    public Integer databaseCount;

    /**
     * <p>The database engine type of the destination instance. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong>: MySQL database, including ApsaraDB RDS for MySQL and self-managed MySQL databases.</li>
     * <li><strong>PolarDB</strong>: PolarDB for MySQL.</li>
     * <li><strong>polardb_o</strong>: PolarDB O DPI engine.</li>
     * <li><strong>polardb_pg</strong>: PolarDB for PostgreSQL.</li>
     * <li><strong>Redis</strong>: Redis database, including Tair (Redis OSS-Compatible) and self-managed Redis databases.</li>
     * <li><strong>DRDS</strong>: cloud-native distributed database PolarDB-X 1.0 and 2.0.</li>
     * <li><strong>PostgreSQL</strong>: self-managed PostgreSQL database.</li>
     * <li><strong>odps</strong>: MaxCompute.</li>
     * <li><strong>oracle</strong>: self-managed Oracle database.</li>
     * <li><strong>mongodb</strong>: MongoDB database, including ApsaraDB for MongoDB and self-managed MongoDB databases.</li>
     * <li><strong>tidb</strong>: TiDB database.</li>
     * <li><strong>ADS</strong>: cloud-native data warehouse AnalyticDB MySQL 2.0.</li>
     * <li><strong>ADB30</strong>: cloud-native data warehouse AnalyticDB MySQL 3.0.</li>
     * <li><strong>Greenplum</strong>: cloud-native data warehouse AnalyticDB PostgreSQL.</li>
     * <li><strong>MSSQL</strong>: SQL Server database, including ApsaraDB RDS for SQL Server and self-managed SQL Server databases.</li>
     * <li><strong>kafka</strong>: Kafka database, including MSMQ Kafka Edition and self-managed Kafka clusters.</li>
     * <li><strong>DataHub</strong>: DataHub.</li>
     * <li><strong>DB2</strong>: self-managed Db2 for LUW database.</li>
     * <li><strong>as400</strong>: AS/400.</li>
     * <li><strong>Tablestore</strong>: Tablestore.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Default value: <strong>MySQL</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>For more information about the supported source and destination databases, see <a href="https://help.aliyun.com/document_detail/130744.html">Supported databases, initial synchronization types, and synchronization topology</a> and <a href="https://help.aliyun.com/document_detail/26618.html">Supported databases and migration types</a>.</li>
     * <li>You must specify this parameter or the <strong>JobId</strong> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DestinationEndpointEngineName")
    public String destinationEndpointEngineName;

    /**
     * <p>The region of the destination instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * <blockquote>
     * <p>You must specify this parameter or the <strong>JobId</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DestinationRegion")
    public String destinationRegion;

    /**
     * <p>The region to which the instance belongs. The value must be the same as the value of the <strong>RegionId</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DtsRegion")
    public String dtsRegion;

    /**
     * <p>The number of DUs allocated to the DTS task in the dedicated DTS cluster. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>The specified value must not exceed the number of available DUs in the dedicated DTS cluster.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>For more information about dedicated DTS clusters, see <a href="https://help.aliyun.com/document_detail/417481.html">What is a dedicated DTS cluster?</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Du")
    public Integer du;

    /**
     * <p>The billing type for change tracking. Valid values:</p>
     * <ul>
     * <li><strong>ONLY_CONFIGURATION_FEE</strong>: Only configuration fees are charged, and data traffic fees are waived.</li>
     * <li><strong>CONFIGURATION_FEE_AND_DATA_FEE</strong>: Data traffic fees are charged in addition to configuration fees.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ONLY_CONFIGURATION_FEE</p>
     */
    @NameInMap("FeeType")
    public String feeType;

    @NameInMap("InsightModule")
    public Boolean insightModule;

    /**
     * <p>The specifications of the data migration or data synchronization instance.</p>
     * <ul>
     * <li>Valid values for data migration instances: <strong>xxlarge</strong>, <strong>xlarge</strong>, <strong>large</strong>, <strong>medium</strong>, and <strong>small</strong>.</li>
     * <li>Valid values for data synchronization instances: <strong>large</strong>, <strong>medium</strong>, <strong>small</strong>, and <strong>micro</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about the performance of different specifications, see <a href="https://help.aliyun.com/document_detail/26606.html">Specifications of data migration links</a> and <a href="https://help.aliyun.com/document_detail/26605.html">Specifications of data synchronization links</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>xxlarge</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The task ID (<strong>DtsJobId</strong>) returned by the <strong>ConfigureDtsJob</strong> operation.</p>
     * <blockquote>
     * <p>If you specify this parameter, you do not need to specify the <strong>SourceRegion</strong>, <strong>DestinationRegion</strong>, <strong>Type</strong>, <strong>SourceEndpointEngineName</strong>, or <strong>DestinationEndpointEngineName</strong> parameters. Even if you specify them, the configurations in the <strong>JobId</strong> parameter prevail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>bi6e22ay243****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The maximum number of DUs.</p>
     * <blockquote>
     * <p>This parameter is supported only for serverless instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("MaxDu")
    public Double maxDu;

    /**
     * <p>The minimum number of DUs.</p>
     * <blockquote>
     * <p>This parameter is supported only for serverless instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinDu")
    public Double minDu;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription.</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
     * </ul>
     * <blockquote>
     * <p>Note: This parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The billing method for a subscription instance. Valid values: <strong>Year</strong> and <strong>Month</strong>.</p>
     * <blockquote>
     * <p>This parameter is valid and required only when the <strong>PayType</strong> parameter is set to <strong>PrePaid</strong> (upfront).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The number of instances that you want to purchase.</p>
     * <blockquote>
     * <p>You can purchase only one instance in a single call.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    /**
     * <p>The region of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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
     * <p>The database engine type of the source instance. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong>: MySQL database, including ApsaraDB RDS for MySQL and self-managed MySQL databases.</li>
     * <li><strong>PolarDB</strong>: PolarDB for MySQL.</li>
     * <li><strong>polardb_o</strong>: PolarDB O DPI engine.</li>
     * <li><strong>polardb_pg</strong>: PolarDB for PostgreSQL.</li>
     * <li><strong>Redis</strong>: Redis database, including Tair (Redis OSS-Compatible) and self-managed Redis databases.</li>
     * <li><strong>DRDS</strong>: cloud-native distributed database PolarDB-X 1.0 and 2.0.</li>
     * <li><strong>PostgreSQL</strong>: self-managed PostgreSQL database.</li>
     * <li><strong>odps</strong>: MaxCompute.</li>
     * <li><strong>oracle</strong>: self-managed Oracle database.</li>
     * <li><strong>mongodb</strong>: MongoDB database, including ApsaraDB for MongoDB and self-managed MongoDB databases.</li>
     * <li><strong>tidb</strong>: TiDB database.</li>
     * <li><strong>ADS</strong>: cloud-native data warehouse AnalyticDB MySQL 2.0.</li>
     * <li><strong>ADB30</strong>: cloud-native data warehouse AnalyticDB MySQL 3.0.</li>
     * <li><strong>Greenplum</strong>: cloud-native data warehouse AnalyticDB PostgreSQL.</li>
     * <li><strong>MSSQL</strong>: SQL Server database, including ApsaraDB RDS for SQL Server and self-managed SQL Server databases.</li>
     * <li><strong>kafka</strong>: Kafka database, including MSMQ Kafka Edition and self-managed Kafka clusters.</li>
     * <li><strong>DataHub</strong>: DataHub.</li>
     * <li><strong>DB2</strong>: self-managed Db2 for LUW database.</li>
     * <li><strong>as400</strong>: AS/400.</li>
     * <li><strong>Tablestore</strong>: Tablestore.</li>
     * <li><strong>OceanBase</strong>: OceanBase (MySQL mode). Only data migration instances are supported.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Default value: <strong>MySQL</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>For more information about the supported source and destination databases, see <a href="https://help.aliyun.com/document_detail/130744.html">Supported databases, initial synchronization types, and synchronization topology</a> and <a href="https://help.aliyun.com/document_detail/26618.html">Supported databases and migration types</a>.</li>
     * <li>You must specify this parameter or the <strong>JobId</strong> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("SourceEndpointEngineName")
    public String sourceEndpointEngineName;

    /**
     * <p>The region of the source instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * <blockquote>
     * <p>You must specify this parameter or the <strong>JobId</strong> parameter.</p>
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
     * <p>The instance type. Valid values:</p>
     * <ul>
     * <li><strong>MIGRATION</strong>: data migration.</li>
     * <li><strong>SYNC</strong>: data synchronization.</li>
     * <li><strong>SUBSCRIBE</strong>: change tracking.<blockquote>
     * <p>You must specify this parameter or the <strong>JobId</strong> parameter.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SYNC</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The subscription duration of the instance.</p>
     * <ul>
     * <li>Valid values when the <strong>Period</strong> parameter is set to <strong>Month</strong>: 1, 2, 3, 4, 5, 6, 7, 8, and 9.</li>
     * <li>Valid values when the <strong>Period</strong> parameter is set to <strong>Year</strong>: 1, 2, 3, and 5.<blockquote>
     * <ul>
     * <li>This parameter is valid and required only when the <strong>PayType</strong> parameter is set to <strong>PrePaid</strong> (upfront).</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>You can specify the billing method for the subscription instance in the <strong>Period</strong> parameter.</li>
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

    public CreateDtsInstanceRequest setDtsRegion(String dtsRegion) {
        this.dtsRegion = dtsRegion;
        return this;
    }
    public String getDtsRegion() {
        return this.dtsRegion;
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

    public CreateDtsInstanceRequest setInsightModule(Boolean insightModule) {
        this.insightModule = insightModule;
        return this;
    }
    public Boolean getInsightModule() {
        return this.insightModule;
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
