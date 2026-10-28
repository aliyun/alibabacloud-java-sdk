// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateGadOrderRequest extends TeaModel {
    /**
     * <p>The number of ApsaraDB RDS for MySQL instances to be created. This parameter is applicable only when you create multiple ApsaraDB RDS for MySQL instances at a time.</p>
     * <p>Valid values: 1 to 20. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Specifies whether to automatically create a proxy. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables automatic creation. By default, a general-purpose proxy is created.</p>
     * </li>
     * <li><p><strong>false</strong>: disables automatic creation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoCreateProxy")
    public Boolean autoCreateProxy;

    /**
     * <p>Specifies whether to enable auto-renewal upon expiration. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: no. This is the default value.</li>
     * <li><strong>true</strong>: yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li>true: enables auto-renewal.</li>
     * <li>false: disables auto-renewal.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The configuration information of Babelfish for ApsaraDB RDS for PostgreSQL.</p>
     * <p>Configuration format: {&quot;babelfishEnabled&quot;:&quot;true&quot;,&quot;migrationMode&quot;:&quot;xxxxxxx&quot;,&quot;masterUsername&quot;:&quot;xxxxxxx&quot;,&quot;masterUserPassword&quot;:&quot;xxxxxxxx&quot;}</p>
     * <p>Parameter descriptions:</p>
     * <ul>
     * <li><strong>babelfishEnabled</strong>: specifies whether to enable Babelfish. Set the value to <strong>true</strong> to enable Babelfish. By default, Babelfish is disabled if this parameter is not configured.</li>
     * <li><strong>migrationMode</strong>: the database mode. Set the value to <strong>single-db</strong> for the single-database mode or <strong>multi-db</strong> for the multi-database mode.</li>
     * <li><strong>masterUsername</strong>: the initial administrator account. The username must be 1 to 63 characters in length and can contain lowercase letters, digits, and underscores (_). It must start with a letter and end with a letter or digit. It cannot start with pg.</li>
     * <li><strong>masterUserPassword</strong>: the password of the administrator account. The password must be 8 to 32 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include <code>! @ # $ % ^ &amp; * () _ + - =</code>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is applicable only to ApsaraDB RDS for PostgreSQL instances. For more information about Babelfish for ApsaraDB RDS for PostgreSQL, see <a href="https://help.aliyun.com/document_detail/428613.html">Babelfish overview</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;isAnalyticReadOnlyIns\&quot;:\&quot;true\&quot;}</p>
     */
    @NameInMap("BabelfishConfig")
    public String babelfishConfig;

    @NameInMap("BpeEnabled")
    public String bpeEnabled;

    /**
     * <p>Specifies whether to enable the I/O performance burst feature for ESSD AutoPL cloud disks. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the feature.</li>
     * <li><strong>false</strong>: disables the feature. This is the default value.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only when StorageType is set to ESSDAUTOPL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>The additional parameter that specifies business information.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The instance edition. Valid values:</p>
     * <p>General instances:
     * Basic: Basic Edition.
     * HighAvailability: high-availability series.
     * cluster: Cluster Edition for MySQL or PostgreSQL.
     * AlwaysOn: Cluster Edition for SQL Server.
     * Finance: RDS Enterprise Edition.
     * Note: This parameter is required when you create an ApsaraDB RDS for SQL Server instance of the RDS Enterprise Edition, Basic Edition Standard, or Basic Edition Enterprise. For example, when you create a Basic Edition instance of the 2022 RDS Enterprise Edition (2022_ent), you must set this parameter to Basic.
     * Serverless instances:
     * serverless_basic: Serverless Basic Edition. This edition is active only for MySQL and PostgreSQL.</p>
     * <p>serverless_standard: Serverless high availability series. This edition is active only for MySQL and PostgreSQL.</p>
     * <p>serverless_ha: SQL Server Serverless high availability series.</p>
     * <p>Note: This parameter is required when PayType is set to Serverless.</p>
     * 
     * <strong>example:</strong>
     * <p>AlwaysOn</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. The portal rewrites this parameter as a random UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gad-x32115vv105f427</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2701832.html">data archiving</a> feature for premium performance disks. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the feature.</li>
     * <li><strong>false</strong>: disables the feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ColdDataEnabled")
    public Boolean coldDataEnabled;

    /**
     * <p>The access mode of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Standard</strong>: standard access mode.</li>
     * <li><strong>Safe</strong>: database proxy mode.</li>
     * </ul>
     * <p>Default value: allocated by the RDS system.</p>
     * <blockquote>
     * <p>SQL Server 2012, 2016, and 2017 support only the standard access mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ConnectionMode")
    public String connectionMode;

    /**
     * <p>The database connection address.</p>
     * 
     * <strong>example:</strong>
     * <p>Mid-end service</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The policy for creating multiple instances at a time. This parameter takes effect only when the <strong>Amount</strong> parameter is set to a value greater than 1. Valid values:</p>
     * <ul>
     * <li><strong>Atomicity</strong> (default): atomicity. All instances in the same batch are created successfully, or if one instance fails to be created, all instances fail to be created.</li>
     * <li><strong>Partial</strong>: non-atomicity. The creation of an instance is not affected by other instances in the same batch.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Atomicity</p>
     */
    @NameInMap("CreateStrategy")
    public String createStrategy;

    /**
     * <p>The instance type. Valid values:</p>
     * <ul>
     * <li><strong>selectdb.xlarge</strong>: 4 cores, 32 GB.</li>
     * <li><strong>selectdb.2xlarge</strong>: 8 cores, 64 GB.</li>
     * <li><strong>selectdb.4xlarge</strong>: 16 cores, 128 GB.</li>
     * <li><strong>selectdb.8xlarge</strong>: 32 cores, 256 GB.</li>
     * <li><strong>selectdb.16xlarge</strong>: 64 cores, 512 GB.</li>
     * <li><strong>selectdb.24xlarge</strong>: 96 cores, 768 GB.</li>
     * <li><strong>selectdb.32xlarge</strong>: 128 cores, 1024 GB.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mssql.x4.medium.e2</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The name of the instance. The name must be 2 to 255 characters in length. It must start with a letter or Chinese character and can contain letters, Chinese characters, digits, and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testInstance</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The network connection type of the instance. Set the value to Intranet, which indicates an internal network connection.</p>
     * 
     * <strong>example:</strong>
     * <p>Intranet</p>
     */
    @NameInMap("DBInstanceNetType")
    public String DBInstanceNetType;

    /**
     * <p>Instance storage capacity of the instance. Instance storage capacity of a read-only instance must be greater than or equal to that of the primary instance. Valid values: See the <strong>Storage Capacity</strong> column in <a href="https://help.aliyun.com/document_detail/145759.html">Read-only instance types</a>. The value must be a multiple of 5. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>local_ssd</strong>: premium local SSD.</li>
     * <li><strong>cloud_ssd</strong>: standard SSD.</li>
     * <li><strong>cloud_essd</strong>: PL1 ESSD.</li>
     * <li><strong>cloud_essd2</strong>: PL2 ESSD.</li>
     * <li><strong>cloud_essd3</strong>: PL3 ESSD.</li>
     * <li><strong>general_essd</strong>: premium performance disk.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If the primary ApsaraDB RDS for MySQL instance uses premium local SSDs, you can set this parameter only to <strong>local_ssd</strong>. If the primary instance uses cloud disks, you can set this parameter only to a cloud disk storage type.</li>
     * <li>ApsaraDB RDS for SQL Server supports only cloud disk storage types.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cloud_auto</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>Specifies whether table names are case-sensitive. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Table names are not case-sensitive. This is the default value.</li>
     * <li><strong>false</strong>: Table names are case-sensitive.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DBIsIgnoreCase")
    public String DBIsIgnoreCase;

    /**
     * <p>The ID of the parameter template. You can call the DescribeParameterGroups operation to query the ID.</p>
     * <blockquote>
     * <p>This parameter is supported only for MySQL and PostgreSQL. If you do not specify this parameter, the default parameter template is used. You can also create a custom parameter template and use it here.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rpg-sys-01040402010***</p>
     */
    @NameInMap("DBParamGroupId")
    public String DBParamGroupId;

    /**
     * <p>The time zone of the instance. This parameter takes effect only when <strong>Engine</strong> is set to <strong>MySQL</strong> or <strong>PostgreSQL</strong>.</p>
     * <ul>
     * <li>When <strong>Engine</strong> is set to <strong>MySQL</strong>:<ul>
     * <li>The parameter settings configure the UTC time zone. Valid values: <strong>-12:59</strong> to <strong>+13:00</strong>.</li>
     * <li>An instance with Premium Local SSDs can use a named time zone, such as Asia/Hong_Kong. For more information about named time zones, see <a href="https://help.aliyun.com/document_detail/297356.html">Named time zones</a>.</li>
     * </ul>
     * </li>
     * <li>When <strong>Engine</strong> is set to <strong>PostgreSQL</strong>:<ul>
     * <li>The parameter settings configure a named time zone. UTC time zones are not supported. For more information about named time zones, see <a href="https://help.aliyun.com/document_detail/297356.html">Named time zones</a>.</li>
     * <li>This parameter can be configured only for PostgreSQL instances that use cloud disks.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You can make parameter settings for the time zone when you purchase a primary instance. Read-only instances do not support time zone Settings and inherit the time zone of the primary instance.</li>
     * <li>If you do not make parameter settings for this parameter, the system selects the default time zone based on the region where the instance is created.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>+08:00</p>
     */
    @NameInMap("DBTimeZone")
    public String DBTimeZone;

    /**
     * <p>The objects to be migrated or synchronized, in JSON format. For more information, see <a href="https://help.aliyun.com/document_detail/209545.html">Description of migration, synchronization, or change tracking objects</a>.</p>
     * <ul>
     * <li>The DbList parameter supports up to 1 MB of data.</li>
     * <li>If DbList contains filter conditions, the total length of DbList, including the filter conditions, cannot exceed 1 MB.</li>
     * <li>For distributed tasks (such as migration or synchronization tasks with PolarDB-X 1.0 as the source), DbList is split based on physical table shards to generate multiple subtasks. The DbList of each subtask supports up to 1 MB of data.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;dtstest\&quot;:{\&quot;name\&quot;:\&quot;dtstest\&quot;,\&quot;all\&quot;:true,\&quot;conflict\&quot;:\&quot;overwrite\&quot;}}</p>
     */
    @NameInMap("DbList")
    public String dbList;

    /**
     * <p>The DbList mode for SQL Server disaster recovery. Set this parameter to 0. Valid values are 0, 1, and 2, and the value must be consistent within the same group.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DbListMode")
    public Integer dbListMode;

    /**
     * <p>The ID of the existing dedicated cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>dhg-4kv98863455z***</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>Specifies whether to enable deletion protection for the resource stack. Valid values:</p>
     * <ul>
     * <li>Enabled: enables deletion protection for the resource stack.</li>
     * <li>Disabled (default): disables deletion protection for the resource stack. In this case, you can release the resource stack by using the console or calling the DeleteStack operation.</li>
     * </ul>
     * <blockquote>
     * <p>The deletion protection settings for a nested resource stack are the same as those for the root resource stack.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>Specifies whether to perform only a precheck. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes. After the precheck succeeds, no changes are made to the instance.</li>
     * <li><strong>false</strong> (default): no. After the precheck succeeds, the database instance of the DTS task is modified and the task is run.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the encryption key. If encryption is disabled, this parameter is empty.</p>
     * <blockquote>
     * <p>After disk encryption is enabled for a cloud disk instance, it cannot be disabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>07609cc3-3109-408f-a35e-c548e776***</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The database engine type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SQLServer</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version of the instance. The valid values vary based on the database engine type.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The network type of the instance. Set the value to <strong>VPC</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>Only VPCs are supported in Alibaba Cloud.</li>
     * <li>If you do not specify this parameter, the default value VPC is used.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>Specifies whether to enable the Buffer Pool Extension (BPE) feature for premium performance disks. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enables the feature.</li>
     * <li><strong>0</strong>: disables the feature.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about the Buffer Pool Extension (BPE) feature, see <a href="https://help.aliyun.com/document_detail/2527067.html">Buffer Pool Extension (BPE)</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IoAccelerationEnabled")
    public String ioAccelerationEnabled;

    /**
     * <p>Specifies whether the primary instance account exists.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MasterAccountExist")
    public Boolean masterAccountExist;

    /**
     * <p>The privileged account of the primary instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gadtest</p>
     */
    @NameInMap("MasterAccountName")
    public String masterAccountName;

    /**
     * <p>The password of the primary instance account.</p>
     * 
     * <strong>example:</strong>
     * <password>
     */
    @NameInMap("MasterAccountPassword")
    public String masterAccountPassword;

    /**
     * <p>This parameter is specific to MongoDB. The architecture type of the primary database. Valid values:</p>
     * <ul>
     * <li>1: replica set.</li>
     * <li>2: sharded cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MasterDatabaseName")
    public String masterDatabaseName;

    /**
     * <p>This parameter is specific to MongoDB. The architecture type of the primary database. Valid values:</p>
     * <ul>
     * <li>1: replica set.</li>
     * <li>2: sharded cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MasterEngineArchType")
    public String masterEngineArchType;

    /**
     * <p>The primary instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-j6c685vh0j0y1k***</p>
     */
    @NameInMap("MasterInstanceId")
    public String masterInstanceId;

    /**
     * <p>The region where the primary instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hongkong</p>
     */
    @NameInMap("MasterRegion")
    public String masterRegion;

    /**
     * <p>The shard account.</p>
     * 
     * <strong>example:</strong>
     * <p>db_test</p>
     */
    @NameInMap("MasterShardAccountName")
    public String masterShardAccountName;

    /**
     * <p>The password of the shard account.</p>
     * 
     * <strong>example:</strong>
     * <password>
     */
    @NameInMap("MasterShardAccountPassword")
    public String masterShardAccountPassword;

    /**
     * <p>Specifies whether to purchase a new secondary instance. If this parameter is set to false, an existing instance is used.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedCreateSlave")
    public Boolean needCreateSlave;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription.</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The billing method for subscription instances. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: yearly.</li>
     * <li><strong>Month</strong>: monthly.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid and required only when the billing method is <strong>PrePaid</strong> (subscription).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The database service port of the destination instance.</p>
     * 
     * <strong>example:</strong>
     * <p>5432</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>Settings for the internal network IP address of the instance. The IP address must be within the IP address range of the specified vSwitch. By default, the system automatically allocates an IP address based on the VpcId and VSwitchId parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>10.60.22.91</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The region ID of the primary instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hongkong</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmx4gs2dcym***</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The global resource descriptor (ARN) for the authorization of the RDS cloud service account by the primary account to access KMS. You can call the CheckCloudResourceAuthorized operation to query the ARN.</p>
     * <blockquote>
     * <p>Notice: When you enable cloud disk encryption, you must specify <strong>RoleARN</strong>.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1929332604914597:role/aliyunr***tanceencryptiondefaultrole</p>
     */
    @NameInMap("RoleARN")
    public String roleARN;

    /**
     * <p>The IP addresses that are added to the whitelist of the instance. Separate multiple IP addresses with commas (,). Note: If you set this parameter to 127.0.0.1, access from all IP addresses is denied. If you set this parameter to 192.168.0.0/24, access from all IP addresses in the 192.168.0.XX format is allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.0/12</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The settings of the Serverless instance. This parameter is required when you create a Serverless instance.</p>
     */
    @NameInMap("ServerlessConfig")
    public CreateGadOrderRequestServerlessConfig serverlessConfig;

    /**
     * <p>Specifies whether the secondary instance account exists.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SlaveAccountExist")
    public Boolean slaveAccountExist;

    /**
     * <p>The account with the same name on the secondary instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gadtest</p>
     */
    @NameInMap("SlaveAccountName")
    public String slaveAccountName;

    /**
     * <p>The password of the secondary instance account.</p>
     * 
     * <strong>example:</strong>
     * <password>
     */
    @NameInMap("SlaveAccountPassword")
    public String slaveAccountPassword;

    /**
     * <p>The name of the secondary database.</p>
     * 
     * <strong>example:</strong>
     * <p>slave_database</p>
     */
    @NameInMap("SlaveDatabaseName")
    public String slaveDatabaseName;

    /**
     * <p>This parameter is specific to MongoDB. The architecture type of the secondary database. Valid values:</p>
     * <ul>
     * <li>1: replica set.</li>
     * <li>2: sharded cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SlaveEngineArchType")
    public String slaveEngineArchType;

    /**
     * <p>The secondary instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4nb481a8qn0b3***</p>
     */
    @NameInMap("SlaveInstanceId")
    public String slaveInstanceId;

    /**
     * <p>Specifies whether the secondary instance is read-only.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SlaveReadOnly")
    public Boolean slaveReadOnly;

    /**
     * <p>The region where the secondary instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-1</p>
     */
    @NameInMap("SlaveRegion")
    public String slaveRegion;

    /**
     * <p>Specifies whether to enable Automatic storage scaling for the Standard Edition cluster. Valid values:</p>
     * <ul>
     * <li>Enable: enables Automatic storage scaling.</li>
     * <li>Disable: shutdown Automatic storage scaling.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disable</p>
     */
    @NameInMap("StorageAutoScale")
    public String storageAutoScale;

    /**
     * <p>The threshold (in percentage) that triggers automatic storage expansion. Valid values:</p>
     * <ul>
     * <li><strong>10</strong></li>
     * <li><strong>20</strong></li>
     * <li><strong>30</strong></li>
     * <li><strong>40</strong></li>
     * <li><strong>50</strong></li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when <strong>StorageAutoScale</strong> is set to <strong>Enable</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("StorageThreshold")
    public Integer storageThreshold;

    /**
     * <p>The Settings for the upper limit of Automatic storage scaling for the Standard Edition cluster. Unit: GB.</p>
     * <blockquote>
     * <p>The maximum value is 32000.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>64000</p>
     */
    @NameInMap("StorageUpperBound")
    public Integer storageUpperBound;

    /**
     * <p>The synchronization account type.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("SyncAccountType")
    public String syncAccountType;

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
     * <p>The conflict resolution policy.</p>
     * 
     * <strong>example:</strong>
     * <p>ignore</p>
     */
    @NameInMap("SyncConflict")
    public String syncConflict;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated and does not need to be configured.</p>
     * 
     * <strong>example:</strong>
     * <p>utf8</p>
     */
    @NameInMap("SystemDBCharset")
    public String systemDBCharset;

    /**
     * <p>The tags of the data migration instance. This parameter is used as a filter. If this parameter is not empty, only the instance tasks that have the specified tags are returned.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateGadOrderRequestTag> tag;

    /**
     * <p>The ID of the host on which the logger instance is created in the dedicated cluster.</p>
     * <p>This parameter is required when you create an RDS Enterprise Edition instance in a dedicated cluster. If you do not specify this parameter, the system automatically allocates a host by default.</p>
     * <ul>
     * <li>You can invoke the DescribeDedicatedHosts operation to query the host information in the dedicated cluster.</li>
     * <li>If no hosts are active, you can invoke the CreateDedicatedHost operation to create a host.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>i-bp****</p>
     */
    @NameInMap("TargetDedicatedHostIdForLog")
    public String targetDedicatedHostIdForLog;

    /**
     * <p>The ID of the host on which the primary instance is created in the dedicated cluster.</p>
     * <p>This parameter is required when you create an instance in a dedicated cluster. If you do not specify this parameter, the system automatically assigns a host.</p>
     * <p>You can call the DescribeDedicatedHosts operation to query the host information in the dedicated cluster.
     * If no hosts are available, you can call the CreateDedicatedHost operation to create a host.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp****</p>
     */
    @NameInMap("TargetDedicatedHostIdForMaster")
    public String targetDedicatedHostIdForMaster;

    /**
     * <p>The ID of the host on which the secondary instance is created in the dedicated cluster.</p>
     * <p>This parameter is required when you create a high availability series or RDS Enterprise Edition instance in a dedicated cluster. If you do not specify this parameter, the system automatically allocates a host by default.</p>
     * <ul>
     * <li>You can invoke the DescribeDedicatedHosts operation to query the host information in the dedicated cluster.</li>
     * <li>If no hosts are active, you can invoke the CreateDedicatedHost operation to create a host.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>i-bp****</p>
     */
    @NameInMap("TargetDedicatedHostIdForSlave")
    public String targetDedicatedHostIdForSlave;

    /**
     * <p>The minor engine version of the ApsaraDB RDS instance. This parameter is required only when you create a MySQL or PostgreSQL instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_postgres_1700_20260***</p>
     */
    @NameInMap("TargetMinorVersion")
    public String targetMinorVersion;

    /**
     * <p>The purchase duration for subscription instances.</p>
     * <ul>
     * <li>When <strong>Period</strong> is set to <strong>Month</strong>, valid values are 1, 2, 3, 4, 5, 6, 7, 8, and 9.</li>
     * <li>When <strong>Period</strong> is set to <strong>Year</strong>, valid values are 1, 2, 3, and 5.<blockquote>
     * <ul>
     * <li>This parameter is valid and required only when <strong>PayType</strong> is set to <strong>PrePaid</strong>.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>For the billing method of subscription instances, you can specify it in the <strong>Period</strong> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The ID of the user backup. You can call the ListUserBackupFiles operation to query the ID. If you specify this parameter, the instance is created based on the user backup.</p>
     * <p>If you specify this parameter, the following limits apply:</p>
     * <ul>
     * <li>The PayType parameter must be set to Postpaid.</li>
     * <li>The Engine parameter must be set to MySQL.</li>
     * <li>The EngineVersion parameter must be set to 5.7.</li>
     * <li>The Category parameter must be set to Basic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>67798****</p>
     */
    @NameInMap("UserBackupId")
    public String userBackupId;

    /**
     * <p>The ID of the vSwitch in the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-wz9gttyapd3i9dmzn***</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-m5ehjekt8mzvyyx5a1***</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The whitelist. To configure multiple IP addresses, separate the IP addresses or CIDR blocks with commas (,) without spaces before or after the commas. Example: <code>192.168.0.1,172.16.213.9</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.1,172.16.213.9</p>
     */
    @NameInMap("WhitelistTemplateList")
    public String whitelistTemplateList;

    /**
     * <p>The zone ID of the primary node.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The zone ID of the secondary node.</p>
     * <ul>
     * <li>If you set this parameter to <strong>Auto</strong>, it indicates a multi-zone deployment and the system automatically selects an active zone for the secondary node.</li>
     * <li>If you set this parameter to the same value as <strong>ZoneId</strong>, it is a single-zone deployment.</li>
     * <li>If you set this parameter to a value different from <strong>ZoneId</strong>, it is a multi-zone deployment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-i</p>
     */
    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    /**
     * <p>The secondary zone 2.</p>
     * <blockquote>
     * <p>This parameter is active only for instances of the RDS Enterprise Edition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu-b</p>
     */
    @NameInMap("ZoneIdSlave2")
    public String zoneIdSlave2;

    public static CreateGadOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGadOrderRequest self = new CreateGadOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateGadOrderRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreateGadOrderRequest setAutoCreateProxy(Boolean autoCreateProxy) {
        this.autoCreateProxy = autoCreateProxy;
        return this;
    }
    public Boolean getAutoCreateProxy() {
        return this.autoCreateProxy;
    }

    public CreateGadOrderRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateGadOrderRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateGadOrderRequest setBabelfishConfig(String babelfishConfig) {
        this.babelfishConfig = babelfishConfig;
        return this;
    }
    public String getBabelfishConfig() {
        return this.babelfishConfig;
    }

    public CreateGadOrderRequest setBpeEnabled(String bpeEnabled) {
        this.bpeEnabled = bpeEnabled;
        return this;
    }
    public String getBpeEnabled() {
        return this.bpeEnabled;
    }

    public CreateGadOrderRequest setBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public CreateGadOrderRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateGadOrderRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateGadOrderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateGadOrderRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateGadOrderRequest setColdDataEnabled(Boolean coldDataEnabled) {
        this.coldDataEnabled = coldDataEnabled;
        return this;
    }
    public Boolean getColdDataEnabled() {
        return this.coldDataEnabled;
    }

    public CreateGadOrderRequest setConnectionMode(String connectionMode) {
        this.connectionMode = connectionMode;
        return this;
    }
    public String getConnectionMode() {
        return this.connectionMode;
    }

    public CreateGadOrderRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public CreateGadOrderRequest setCreateStrategy(String createStrategy) {
        this.createStrategy = createStrategy;
        return this;
    }
    public String getCreateStrategy() {
        return this.createStrategy;
    }

    public CreateGadOrderRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public CreateGadOrderRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CreateGadOrderRequest setDBInstanceNetType(String DBInstanceNetType) {
        this.DBInstanceNetType = DBInstanceNetType;
        return this;
    }
    public String getDBInstanceNetType() {
        return this.DBInstanceNetType;
    }

    public CreateGadOrderRequest setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public CreateGadOrderRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public CreateGadOrderRequest setDBIsIgnoreCase(String DBIsIgnoreCase) {
        this.DBIsIgnoreCase = DBIsIgnoreCase;
        return this;
    }
    public String getDBIsIgnoreCase() {
        return this.DBIsIgnoreCase;
    }

    public CreateGadOrderRequest setDBParamGroupId(String DBParamGroupId) {
        this.DBParamGroupId = DBParamGroupId;
        return this;
    }
    public String getDBParamGroupId() {
        return this.DBParamGroupId;
    }

    public CreateGadOrderRequest setDBTimeZone(String DBTimeZone) {
        this.DBTimeZone = DBTimeZone;
        return this;
    }
    public String getDBTimeZone() {
        return this.DBTimeZone;
    }

    public CreateGadOrderRequest setDbList(String dbList) {
        this.dbList = dbList;
        return this;
    }
    public String getDbList() {
        return this.dbList;
    }

    public CreateGadOrderRequest setDbListMode(Integer dbListMode) {
        this.dbListMode = dbListMode;
        return this;
    }
    public Integer getDbListMode() {
        return this.dbListMode;
    }

    public CreateGadOrderRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public CreateGadOrderRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateGadOrderRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateGadOrderRequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public CreateGadOrderRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateGadOrderRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateGadOrderRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public CreateGadOrderRequest setIoAccelerationEnabled(String ioAccelerationEnabled) {
        this.ioAccelerationEnabled = ioAccelerationEnabled;
        return this;
    }
    public String getIoAccelerationEnabled() {
        return this.ioAccelerationEnabled;
    }

    public CreateGadOrderRequest setMasterAccountExist(Boolean masterAccountExist) {
        this.masterAccountExist = masterAccountExist;
        return this;
    }
    public Boolean getMasterAccountExist() {
        return this.masterAccountExist;
    }

    public CreateGadOrderRequest setMasterAccountName(String masterAccountName) {
        this.masterAccountName = masterAccountName;
        return this;
    }
    public String getMasterAccountName() {
        return this.masterAccountName;
    }

    public CreateGadOrderRequest setMasterAccountPassword(String masterAccountPassword) {
        this.masterAccountPassword = masterAccountPassword;
        return this;
    }
    public String getMasterAccountPassword() {
        return this.masterAccountPassword;
    }

    public CreateGadOrderRequest setMasterDatabaseName(String masterDatabaseName) {
        this.masterDatabaseName = masterDatabaseName;
        return this;
    }
    public String getMasterDatabaseName() {
        return this.masterDatabaseName;
    }

    public CreateGadOrderRequest setMasterEngineArchType(String masterEngineArchType) {
        this.masterEngineArchType = masterEngineArchType;
        return this;
    }
    public String getMasterEngineArchType() {
        return this.masterEngineArchType;
    }

    public CreateGadOrderRequest setMasterInstanceId(String masterInstanceId) {
        this.masterInstanceId = masterInstanceId;
        return this;
    }
    public String getMasterInstanceId() {
        return this.masterInstanceId;
    }

    public CreateGadOrderRequest setMasterRegion(String masterRegion) {
        this.masterRegion = masterRegion;
        return this;
    }
    public String getMasterRegion() {
        return this.masterRegion;
    }

    public CreateGadOrderRequest setMasterShardAccountName(String masterShardAccountName) {
        this.masterShardAccountName = masterShardAccountName;
        return this;
    }
    public String getMasterShardAccountName() {
        return this.masterShardAccountName;
    }

    public CreateGadOrderRequest setMasterShardAccountPassword(String masterShardAccountPassword) {
        this.masterShardAccountPassword = masterShardAccountPassword;
        return this;
    }
    public String getMasterShardAccountPassword() {
        return this.masterShardAccountPassword;
    }

    public CreateGadOrderRequest setNeedCreateSlave(Boolean needCreateSlave) {
        this.needCreateSlave = needCreateSlave;
        return this;
    }
    public Boolean getNeedCreateSlave() {
        return this.needCreateSlave;
    }

    public CreateGadOrderRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateGadOrderRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateGadOrderRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateGadOrderRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateGadOrderRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateGadOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateGadOrderRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateGadOrderRequest setRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }
    public String getRoleARN() {
        return this.roleARN;
    }

    public CreateGadOrderRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateGadOrderRequest setServerlessConfig(CreateGadOrderRequestServerlessConfig serverlessConfig) {
        this.serverlessConfig = serverlessConfig;
        return this;
    }
    public CreateGadOrderRequestServerlessConfig getServerlessConfig() {
        return this.serverlessConfig;
    }

    public CreateGadOrderRequest setSlaveAccountExist(Boolean slaveAccountExist) {
        this.slaveAccountExist = slaveAccountExist;
        return this;
    }
    public Boolean getSlaveAccountExist() {
        return this.slaveAccountExist;
    }

    public CreateGadOrderRequest setSlaveAccountName(String slaveAccountName) {
        this.slaveAccountName = slaveAccountName;
        return this;
    }
    public String getSlaveAccountName() {
        return this.slaveAccountName;
    }

    public CreateGadOrderRequest setSlaveAccountPassword(String slaveAccountPassword) {
        this.slaveAccountPassword = slaveAccountPassword;
        return this;
    }
    public String getSlaveAccountPassword() {
        return this.slaveAccountPassword;
    }

    public CreateGadOrderRequest setSlaveDatabaseName(String slaveDatabaseName) {
        this.slaveDatabaseName = slaveDatabaseName;
        return this;
    }
    public String getSlaveDatabaseName() {
        return this.slaveDatabaseName;
    }

    public CreateGadOrderRequest setSlaveEngineArchType(String slaveEngineArchType) {
        this.slaveEngineArchType = slaveEngineArchType;
        return this;
    }
    public String getSlaveEngineArchType() {
        return this.slaveEngineArchType;
    }

    public CreateGadOrderRequest setSlaveInstanceId(String slaveInstanceId) {
        this.slaveInstanceId = slaveInstanceId;
        return this;
    }
    public String getSlaveInstanceId() {
        return this.slaveInstanceId;
    }

    public CreateGadOrderRequest setSlaveReadOnly(Boolean slaveReadOnly) {
        this.slaveReadOnly = slaveReadOnly;
        return this;
    }
    public Boolean getSlaveReadOnly() {
        return this.slaveReadOnly;
    }

    public CreateGadOrderRequest setSlaveRegion(String slaveRegion) {
        this.slaveRegion = slaveRegion;
        return this;
    }
    public String getSlaveRegion() {
        return this.slaveRegion;
    }

    public CreateGadOrderRequest setStorageAutoScale(String storageAutoScale) {
        this.storageAutoScale = storageAutoScale;
        return this;
    }
    public String getStorageAutoScale() {
        return this.storageAutoScale;
    }

    public CreateGadOrderRequest setStorageThreshold(Integer storageThreshold) {
        this.storageThreshold = storageThreshold;
        return this;
    }
    public Integer getStorageThreshold() {
        return this.storageThreshold;
    }

    public CreateGadOrderRequest setStorageUpperBound(Integer storageUpperBound) {
        this.storageUpperBound = storageUpperBound;
        return this;
    }
    public Integer getStorageUpperBound() {
        return this.storageUpperBound;
    }

    public CreateGadOrderRequest setSyncAccountType(String syncAccountType) {
        this.syncAccountType = syncAccountType;
        return this;
    }
    public String getSyncAccountType() {
        return this.syncAccountType;
    }

    public CreateGadOrderRequest setSyncArchitecture(String syncArchitecture) {
        this.syncArchitecture = syncArchitecture;
        return this;
    }
    public String getSyncArchitecture() {
        return this.syncArchitecture;
    }

    public CreateGadOrderRequest setSyncConflict(String syncConflict) {
        this.syncConflict = syncConflict;
        return this;
    }
    public String getSyncConflict() {
        return this.syncConflict;
    }

    public CreateGadOrderRequest setSystemDBCharset(String systemDBCharset) {
        this.systemDBCharset = systemDBCharset;
        return this;
    }
    public String getSystemDBCharset() {
        return this.systemDBCharset;
    }

    public CreateGadOrderRequest setTag(java.util.List<CreateGadOrderRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateGadOrderRequestTag> getTag() {
        return this.tag;
    }

    public CreateGadOrderRequest setTargetDedicatedHostIdForLog(String targetDedicatedHostIdForLog) {
        this.targetDedicatedHostIdForLog = targetDedicatedHostIdForLog;
        return this;
    }
    public String getTargetDedicatedHostIdForLog() {
        return this.targetDedicatedHostIdForLog;
    }

    public CreateGadOrderRequest setTargetDedicatedHostIdForMaster(String targetDedicatedHostIdForMaster) {
        this.targetDedicatedHostIdForMaster = targetDedicatedHostIdForMaster;
        return this;
    }
    public String getTargetDedicatedHostIdForMaster() {
        return this.targetDedicatedHostIdForMaster;
    }

    public CreateGadOrderRequest setTargetDedicatedHostIdForSlave(String targetDedicatedHostIdForSlave) {
        this.targetDedicatedHostIdForSlave = targetDedicatedHostIdForSlave;
        return this;
    }
    public String getTargetDedicatedHostIdForSlave() {
        return this.targetDedicatedHostIdForSlave;
    }

    public CreateGadOrderRequest setTargetMinorVersion(String targetMinorVersion) {
        this.targetMinorVersion = targetMinorVersion;
        return this;
    }
    public String getTargetMinorVersion() {
        return this.targetMinorVersion;
    }

    public CreateGadOrderRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateGadOrderRequest setUserBackupId(String userBackupId) {
        this.userBackupId = userBackupId;
        return this;
    }
    public String getUserBackupId() {
        return this.userBackupId;
    }

    public CreateGadOrderRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateGadOrderRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateGadOrderRequest setWhitelistTemplateList(String whitelistTemplateList) {
        this.whitelistTemplateList = whitelistTemplateList;
        return this;
    }
    public String getWhitelistTemplateList() {
        return this.whitelistTemplateList;
    }

    public CreateGadOrderRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateGadOrderRequest setZoneIdSlave1(String zoneIdSlave1) {
        this.zoneIdSlave1 = zoneIdSlave1;
        return this;
    }
    public String getZoneIdSlave1() {
        return this.zoneIdSlave1;
    }

    public CreateGadOrderRequest setZoneIdSlave2(String zoneIdSlave2) {
        this.zoneIdSlave2 = zoneIdSlave2;
        return this;
    }
    public String getZoneIdSlave2() {
        return this.zoneIdSlave2;
    }

    public static class CreateGadOrderRequestServerlessConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable the smart pause and start feature for the Serverless instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the feature.</li>
         * <li><strong>false</strong>: disables the feature. This is the default value.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required only for MySQL and PostgreSQL Serverless instances. If no connections are established within 10 minutes, the instance enters the paused state. When a connection is established, the instance is automatically woken up.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoPause")
        public Boolean autoPause;

        /**
         * <p>The maximum number of RDS capacity units (RCUs) for automatic scaling of the instance. Valid values:</p>
         * <ul>
         * <li>MySQL: <strong>1 to 32</strong></li>
         * <li>SQL Server: <strong>2 to 16</strong></li>
         * <li>PostgreSQL: <strong>1 to 14</strong></li>
         * </ul>
         * <blockquote>
         * <p>The value of this parameter must be greater than or equal to the value of <strong>MinCapacity</strong>. Only <strong>integers</strong> are supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxCapacity")
        public Double maxCapacity;

        /**
         * <p>The minimum number of RCUs for automatic scaling of the instance. Valid values:</p>
         * <ul>
         * <li>MySQL: <strong>0.5 to 32</strong></li>
         * <li>SQL Server: <strong>2 to 16</strong> (only integers are supported)</li>
         * <li>PostgreSQL: <strong>0.5 to 14</strong></li>
         * </ul>
         * <blockquote>
         * <p>The value of this parameter must be less than or equal to the value of <strong>MaxCapacity</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinCapacity")
        public Double minCapacity;

        /**
         * <p>Specifies whether to enable forced elastic scaling for the Serverless instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables forced elastic scaling.</li>
         * <li><strong>false</strong>: disables forced elastic scaling. This is the default value.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is required only for MySQL and PostgreSQL Serverless instances. After this parameter is enabled, the instance will be unavailable for 30 to 120 seconds during forced scaling. Use this feature with caution based on your business requirements.</li>
         * <li>Elastic scaling of instance RCUs usually takes effect immediately. However, in some special cases (such as during the execution of large transactions), scaling cannot be completed immediately. In this case, you can enable this parameter to perform forced scaling.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SwitchForce")
        public Boolean switchForce;

        public static CreateGadOrderRequestServerlessConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateGadOrderRequestServerlessConfig self = new CreateGadOrderRequestServerlessConfig();
            return TeaModel.build(map, self);
        }

        public CreateGadOrderRequestServerlessConfig setAutoPause(Boolean autoPause) {
            this.autoPause = autoPause;
            return this;
        }
        public Boolean getAutoPause() {
            return this.autoPause;
        }

        public CreateGadOrderRequestServerlessConfig setMaxCapacity(Double maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Double getMaxCapacity() {
            return this.maxCapacity;
        }

        public CreateGadOrderRequestServerlessConfig setMinCapacity(Double minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }
        public Double getMinCapacity() {
            return this.minCapacity;
        }

        public CreateGadOrderRequestServerlessConfig setSwitchForce(Boolean switchForce) {
            this.switchForce = switchForce;
            return this;
        }
        public Boolean getSwitchForce() {
            return this.switchForce;
        }

    }

    public static class CreateGadOrderRequestTag extends TeaModel {
        /**
         * <p>The tag key. You can call the <a href="https://help.aliyun.com/document_detail/191187.html">ListTagResources</a> operation to query the tag key.</p>
         * <blockquote>
         * <ul>
         * <li>N indicates the sequence number of the tag key. For example, Tag.1.Key indicates the key of the first tag, and Tag.2.Key indicates the key of the second tag. You can specify 1 to 20 tag keys at a time.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>This parameter cannot be set to an empty string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can call the <a href="https://help.aliyun.com/document_detail/191187.html">ListTagResources</a> operation to query the tag value.</p>
         * <blockquote>
         * <ul>
         * <li>N indicates the sequence number of the tag value. For example, Tag.1.Value indicates the value of the first tag, and Tag.2.Value indicates the value of the second tag. You can specify 1 to 20 tag values at a time.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>This parameter can be set to an empty string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testvalue1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateGadOrderRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateGadOrderRequestTag self = new CreateGadOrderRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateGadOrderRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateGadOrderRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
