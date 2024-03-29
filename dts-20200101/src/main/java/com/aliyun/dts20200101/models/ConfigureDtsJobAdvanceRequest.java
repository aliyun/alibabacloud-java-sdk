// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureDtsJobAdvanceRequest extends TeaModel {
    /**
     * <p>The type of the task. Valid values:</p>
     * <br>
     * <p>*   **MIGRATION**: data migration task</p>
     * <p>*   **SYNC**: data synchronization task</p>
     */
    @NameInMap("Checkpoint")
    public String checkpoint;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("DataCheckConfigure")
    public String dataCheckConfigure;

    /**
     * <p>The objects that you want to migrate or synchronize. The value is a JSON string. For more information, see [Objects of DTS tasks](~~209545~~).</p>
     */
    @NameInMap("DataInitialization")
    public Boolean dataInitialization;

    /**
     * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to add more configurations of the source or destination instance to the DTS task. For example, you can specify the data storage format of the destination Kafka database and the ID of the CEN instance. For more information, see [Reserve](~~273111~~).</p>
     */
    @NameInMap("DataSynchronization")
    public Boolean dataSynchronization;

    /**
     * <p>The start offset of incremental data migration or synchronization. The value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("DbList")
    public String dbList;

    /**
     * <p>The data verification task for a data migration or synchronization instance. The value is a JSON string that indicates parameter limits or alert configurations. For more information, see [DataCheckConfigure](~~459023~~).</p>
     */
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    /**
     * <p>Specifies whether to monitor the task status. Valid values:</p>
     * <br>
     * <p>*   **true**: monitors the task status.</p>
     * <p>*   **false**: does not monitor the task status.</p>
     */
    @NameInMap("DelayNotice")
    public Boolean delayNotice;

    /**
     * <p>Specifies whether to monitor the task latency. Valid values:</p>
     * <br>
     * <p>*   **true**: monitors the task latency.</p>
     * <p>*   **false**: does not monitor the task latency.</p>
     */
    @NameInMap("DelayPhone")
    public String delayPhone;

    /**
     * <p>The mobile numbers that receive status-related alerts. Separate multiple mobile numbers with commas (,).</p>
     * <br>
     * <p>> </p>
     * <p>*   This parameter is available only for China site (aliyun.com) users. Only mobile numbers in the Chinese mainland are supported. Up to 10 mobile numbers can be specified.</p>
     * <p>*   International site (alibabacloud.com) users cannot receive alerts by using mobile phones, but can [set alert rules for DTS tasks in the CloudMonitor console](~~175876~~).</p>
     */
    @NameInMap("DelayRuleTime")
    public Long delayRuleTime;

    @NameInMap("DestCaCertificateOssUrl")
    public String destCaCertificateOssUrl;

    @NameInMap("DestCaCertificatePassword")
    public String destCaCertificatePassword;

    /**
     * <p>The password of the destination database account.</p>
     * <br>
     * <p>>  If the destination database is a MaxCompute project, you must specify the AccessKey secret of your Alibaba Cloud account. For information about how to obtain your AccessKey pair, see [Create an AccessKey pair](~~116401~~).</p>
     */
    @NameInMap("DestinationEndpointDataBaseName")
    public String destinationEndpointDataBaseName;

    /**
     * <p>The IP address of the destination instance.</p>
     * <br>
     * <p>>  If the **DestinationEndpointInstanceType** parameter is set to **OTHER**, **EXPRESS**, **DG**, or **CEN**, this parameter is available and required.</p>
     */
    @NameInMap("DestinationEndpointEngineName")
    public String destinationEndpointEngineName;

    /**
     * <p>The name of the database to which the objects migrated to the destination instance belong.</p>
     * <br>
     * <p>> </p>
     * <p>*   If the destination instance is a PolarDB for Oracle cluster, an AnalyticDB for PostgreSQL instance, a PostgreSQL database, a MaxCompute project, or a MongoDB database, this parameter is available and required.</p>
     * <p>*   If the destination instance is a MaxCompute project, you must specify the ID of the MaxCompute project.</p>
     */
    @NameInMap("DestinationEndpointIP")
    public String destinationEndpointIP;

    /**
     * <p>The ID of the region in which the destination instance resides. For more information, see [List of supported regions](~~141033~~).</p>
     * <br>
     * <p>>  If the destination instance is an Alibaba Cloud database instance, this parameter is required.</p>
     */
    @NameInMap("DestinationEndpointInstanceID")
    public String destinationEndpointInstanceID;

    /**
     * <p>The database engine of the destination instance. Valid values:</p>
     * <br>
     * <p>*   **MySQL**: ApsaraDB RDS for MySQL instance or self-managed MySQL database</p>
     * <p>*   **MARIADB**: ApsaraDB RDS for MariaDB instance</p>
     * <p>*   **PolarDB**: PolarDB for MySQL cluster</p>
     * <p>*   **POLARDB_O**: PolarDB for Oracle cluster</p>
     * <p>*   **POLARDBX10**: PolarDB-X 1.0 instance</p>
     * <p>*   **POLARDBX20**: PolarDB-X 2.0 instance</p>
     * <p>*   **ORACLE**: self-managed Oracle database</p>
     * <p>*   **POSTGRESQL**: ApsaraDB RDS for PostgreSQL instance or self-managed PostgreSQL database</p>
     * <p>*   **MSSQL**: ApsaraDB RDS for SQL Server instance or self-managed SQL Server database</p>
     * <p>*   **ADS**: AnalyticDB for MySQL V2.0 cluster</p>
     * <p>*   **ADB30**: AnalyticDB for MySQL V3.0 cluster</p>
     * <p>*   **MONGODB**: ApsaraDB for MongoDB instance or self-managed MongoDB database</p>
     * <p>*   **GREENPLUM**: AnalyticDB for PostgreSQL instance</p>
     * <p>*   **KAFKA**: Message Queue for Apache Kafka instance or self-managed Kafka cluster</p>
     * <p>*   **DATAHUB**: DataHub project</p>
     * <p>*   **DB2**: self-managed Db2 for LUW database</p>
     * <p>*   **AS400**: self-managed Db2 for i database</p>
     * <p>*   **ODPS**: MaxCompute project</p>
     * <p>*   **Tablestore**: Tablestore instance</p>
     * <p>*   **ELK**: Elasticsearch cluster</p>
     * <p>*   **REDIS**: ApsaraDB for Redis instance or self-managed Redis database</p>
     * <br>
     * <p>> </p>
     * <p>*   Default value: **MYSQL**.</p>
     * <p>*   If the DestinationEndpointEngineName parameter is set to **KAFKA**, **MONGODB**, or **PolarDB**, you must also specify the database information in the Reserve parameter. For more information, see [Reserve](~~273111~~).</p>
     */
    @NameInMap("DestinationEndpointInstanceType")
    public String destinationEndpointInstanceType;

    /**
     * <p>The ID of the data migration or synchronization task.</p>
     * <br>
     * <p>>  You must specify at least one of the DtsJobId and **DtsInstanceId** parameters. You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.</p>
     */
    @NameInMap("DestinationEndpointOracleSID")
    public String destinationEndpointOracleSID;

    @NameInMap("DestinationEndpointOwnerID")
    public String destinationEndpointOwnerID;

    /**
     * <p>Specifies whether to perform full data migration or synchronization. Default value: true. Valid values:</p>
     * <br>
     * <p>*   **true**: performs full data migration or synchronization.</p>
     * <p>*   **false**: does not perform full data migration or synchronization.</p>
     */
    @NameInMap("DestinationEndpointPassword")
    public String destinationEndpointPassword;

    /**
     * <p>The database account of the destination database.</p>
     * <br>
     * <p>> </p>
     * <p>*   In most cases, this parameter is required.</p>
     * <p>*   The permissions that are required for the database account vary with the migration or synchronization scenario. For more information, see [Prepare the database accounts for data migration](~~175878~~) or [Prepare the database accounts for data synchronization](~~213152~~).</p>
     * <p>*   If the destination database is a MaxCompute project, you must specify the AccessKey ID of your Alibaba Cloud account. For information about how to obtain your AccessKey pair, see [Create an AccessKey pair](~~116401~~).</p>
     */
    @NameInMap("DestinationEndpointPort")
    public String destinationEndpointPort;

    /**
     * <p>The database service port of the destination instance.</p>
     * <br>
     * <p>>  If the destination instance is a self-managed database, this parameter is available and required.</p>
     */
    @NameInMap("DestinationEndpointRegion")
    public String destinationEndpointRegion;

    @NameInMap("DestinationEndpointRole")
    public String destinationEndpointRole;

    /**
     * <p>Specifies whether to perform schema migration or synchronization. Default value: true. Valid values:</p>
     * <br>
     * <p>*   **true**: performs schema migration or synchronization.</p>
     * <p>*   **false**: does not perform schema migration or synchronization.</p>
     */
    @NameInMap("DestinationEndpointUserName")
    public String destinationEndpointUserName;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DisasterRecoveryJob")
    public Boolean disasterRecoveryJob;

    @NameInMap("DtsBisLabel")
    public String dtsBisLabel;

    /**
     * <p>The threshold for triggering latency-related alerts. Unit: seconds. The value must be an integer. You can set the threshold based on your business needs. To prevent jitters caused by network and database overloads, we recommend that you set the threshold to more than 10 seconds.</p>
     * <br>
     * <p>>  If the **DelayNotice** parameter is set to **true**, this parameter is required.</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The mobile numbers that receive latency-related alerts. Separate multiple mobile numbers with commas (,).</p>
     * <br>
     * <p>> </p>
     * <p>*   This parameter is available only for China site (aliyun.com) users. Only mobile numbers in the Chinese mainland are supported. Up to 10 mobile numbers can be specified.</p>
     * <p>*   International site (alibabacloud.com) users cannot receive alerts by using mobile phones, but can [set alert rules for DTS tasks in the CloudMonitor console](~~175876~~).</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The ID of the source instance.</p>
     * <br>
     * <p>If the source instance is an Alibaba Cloud database instance, you must specify the ID of the database instance. For example, if the source instance is an ApsaraDB RDS for MySQL instance, you must specify the ID of the ApsaraDB RDS for MySQL instance.</p>
     * <br>
     * <p>If the source instance is a self-managed database, the value of this parameter varies with the value of the **SourceEndpointInstanceType** parameter.****</p>
     * <br>
     * <p>*   If the SourceEndpointInstanceType parameter is set to **ECS**, you must specify the ID of the ECS instance.</p>
     * <p>*   If the SourceEndpointInstanceType parameter is set to **DG**, you must specify the ID of the database gateway.</p>
     * <p>*   If the SourceEndpointInstanceType parameter is set to **EXPRESS** or **CEN**, you must specify the ID of the VPC that is connected to the source instance.</p>
     * <br>
     * <p>>  If the SourceEndpointInstanceType parameter is set to **CEN**, you must also specify the ID of the CEN instance in the Reserve parameter. For more information, see [Reserve](~~273111~~).</p>
     */
    @NameInMap("DtsJobName")
    public String dtsJobName;

    /**
     * <p>The ID of the region in which the DTS instance resides. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("ErrorNotice")
    public Boolean errorNotice;

    /**
     * <p>The synchronization direction. Valid values:</p>
     * <br>
     * <p>*   **Forward**: Data is synchronized from the source database to the destination database.</p>
     * <p>*   **Reverse**: Data is synchronized from the destination database to the source database.</p>
     * <br>
     * <p>> </p>
     * <p>*   Default value: **Forward**.</p>
     * <p>*   The value **Reverse** takes effect only if the topology of the data synchronization task is two-way synchronization.</p>
     */
    @NameInMap("ErrorPhone")
    public String errorPhone;

    /**
     * <p>Specifies whether the instance is a disaster recovery instance.</p>
     * <br>
     * <p>*   **true**: The instance is a disaster recovery instance.</p>
     * <p>*   **false**: The instance is not a disaster recovery instance.</p>
     */
    @NameInMap("FileOssUrl")
    public java.io.InputStream fileOssUrlObject;

    /**
     * <p>The ID of the data migration or synchronization instance.</p>
     * <br>
     * <p>>  You must specify at least one of the **DtsJobId** and DtsInstanceId parameters. You can call the [DescribeDtsJobs](~~209702~~) operation to query the instance ID.</p>
     */
    @NameInMap("JobType")
    public String jobType;

    @NameInMap("MaxDu")
    public Double maxDu;

    @NameInMap("MinDu")
    public Double minDu;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The URL of the Object Storage Service (OSS) bucket that stores the files related to the DTS task.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The SID of the Oracle database.</p>
     * <br>
     * <p>>  If the **DestinationEndpointEngineName** parameter is set to **ORACLE** and the **Oracle** database is deployed in a non-RAC architecture, this parameter is available and required.</p>
     */
    @NameInMap("Reserve")
    public String reserve;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The password of the source database account.</p>
     */
    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    /**
     * <p>The IP address of the source instance.</p>
     * <br>
     * <p>>  If the **SourceEndpointInstanceType** parameter is set to **OTHER**, **EXPRESS**, **DG**, or **CEN**, this parameter is available and required.</p>
     */
    @NameInMap("SourceEndpointEngineName")
    public String sourceEndpointEngineName;

    /**
     * <p>The system ID (SID) of the Oracle database.</p>
     * <br>
     * <p>>  If the **SourceEndpointEngineName** parameter is set to **ORACLE** and the **Oracle** database is deployed in an architecture that is not a Real Application Cluster (RAC), this parameter is available and required.</p>
     */
    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    /**
     * <p>The ID of the region in which the source instance resides. For more information, see [List of supported regions](~~141033~~).</p>
     * <br>
     * <p>>  If the source instance is an Alibaba Cloud database instance, this parameter is required.</p>
     */
    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    /**
     * <p>The database engine of the source instance. Valid values:</p>
     * <br>
     * <p>*   **MYSQL**: ApsaraDB RDS for MySQL instance or self-managed MySQL database</p>
     * <p>*   **MARIADB**: ApsaraDB RDS for MariaDB instance</p>
     * <p>*   **PolarDB**: PolarDB for MySQL cluster</p>
     * <p>*   **POLARDB_O**: PolarDB for Oracle cluster</p>
     * <p>*   **POLARDBX10**: PolarDB-X 1.0 instance</p>
     * <p>*   **POLARDBX20**: PolarDB-X 2.0 instance</p>
     * <p>*   **ORACLE**: self-managed Oracle database</p>
     * <p>*   **POSTGRESQL**: ApsaraDB RDS for PostgreSQL instance or self-managed PostgreSQL database</p>
     * <p>*   **MSSQL**: ApsaraDB RDS for SQL Server instance or self-managed SQL Server database</p>
     * <p>*   **MONGODB**: ApsaraDB for MongoDB instance or self-managed MongoDB database</p>
     * <p>*   **DB2**: self-managed Db2 for LUW database</p>
     * <p>*   **AS400**: self-managed Db2 for i database</p>
     * <p>*   **DMSPOLARDB**: DMS logical database</p>
     * <p>*   **HBASE**: self-managed HBase database</p>
     * <p>*   **TERADATA**: Teradata database</p>
     * <p>*   **TiDB**: TiDB database</p>
     * <p>*   **REDIS**: ApsaraDB for Redis instance or self-managed Redis database</p>
     * <br>
     * <p>> </p>
     * <p>*   Default value: **MYSQL**.</p>
     * <p>*   If the SourceEndpointEngineName parameter is set to **MONGODB**, you must also specify the architecture type of the MongoDB database in the Reserve parameter. For more information, see [Reserve](~~273111~~).</p>
     */
    @NameInMap("SourceEndpointInstanceType")
    public String sourceEndpointInstanceType;

    /**
     * <p>The database account of the source database.</p>
     * <br>
     * <p>> </p>
     * <p>*   In most cases, this parameter is required.</p>
     * <p>*   The permissions that are required for the database account vary with the migration or synchronization scenario. For more information, see [Prepare the database accounts for data migration](~~175878~~) or [Prepare the database accounts for data synchronization](~~213152~~).</p>
     */
    @NameInMap("SourceEndpointOracleSID")
    public String sourceEndpointOracleSID;

    /**
     * <p>The type of the destination instance. Valid values:</p>
     * <br>
     * <p>**Alibaba Cloud database instances**</p>
     * <br>
     * <p>*   **RDS**: ApsaraDB RDS for MySQL instance, ApsaraDB RDS for SQL Server instance, ApsaraDB RDS for PostgreSQL instance, or ApsaraDB RDS for MariaDB instance</p>
     * <p>*   **PolarDB**: PolarDB for MySQL cluster</p>
     * <p>*   **POLARDBX10**: PolarDB-X 1.0 instance</p>
     * <p>*   **POLARDBX20**: PolarDB-X 2.0 instance</p>
     * <p>*   **REDIS**: ApsaraDB for Redis instance</p>
     * <p>*   **ADS**: AnalyticDB for MySQL V2.0 cluster or AnalyticDB for MySQL V3.0 cluster</p>
     * <p>*   **MONGODB**: ApsaraDB for MongoDB instance</p>
     * <p>*   **GREENPLUM**: AnalyticDB for PostgreSQL instance</p>
     * <p>*   **DATAHUB**: DataHub project</p>
     * <p>*   **ELK**: Elasticsearch cluster</p>
     * <p>*   **Tablestore**: Tablestore instance</p>
     * <p>*   **ODPS**: MaxCompute project</p>
     * <br>
     * <p>**Self-managed databases**</p>
     * <br>
     * <p>*   **OTHER**: self-managed database with a public IP address</p>
     * <p>*   **ECS**: self-managed database hosted on an ECS instance</p>
     * <p>*   **EXPRESS**: self-managed database connected over Express Connect</p>
     * <p>*   **CEN**: self-managed database connected over CEN</p>
     * <p>*   **DG**: self-managed database connected over Database Gateway</p>
     * <br>
     * <p>> </p>
     * <p>*   If the destination instance is a PolarDB for Oracle cluster, you must set this parameter to **OTHER** or **EXPRESS** because you can use a PolarDB for Oracle cluster only as a self-managed database connected over the Internet or Express Connect.</p>
     * <p>*   If the destination instance is a Message Queue for Apache Kafka instance, you must set this parameter to **ECS** or **EXPRESS** because you can use a Message Queue for Apache Kafka instance only as a self-managed database connected over ECS or Express Connect.</p>
     * <p>*   For more information, see [Supported databases](~~176064~~).</p>
     * <p>*   If the destination instance is a self-managed database, you must deploy the network environment for the database. For more information, see [Preparation overview](~~146958~~).</p>
     */
    @NameInMap("SourceEndpointOwnerID")
    public String sourceEndpointOwnerID;

    /**
     * <p>The name of the RAM role configured for the Alibaba Cloud account that owns the source instance.</p>
     * <br>
     * <p>>  This parameter is required when you migrate or synchronize data across different Alibaba Cloud accounts. For information about the permissions and authorization methods of the RAM role, see [Configure RAM authorization for cross-account data migration and synchronization](~~48468~~).</p>
     */
    @NameInMap("SourceEndpointPassword")
    public String sourceEndpointPassword;

    /**
     * <p>The name of the database to which the objects to be migrated in the source instance belong.</p>
     * <br>
     * <p>>  If the source instance is a PolarDB for Oracle cluster, a PostgreSQL database, or a MongoDB database, this parameter is available and required.</p>
     */
    @NameInMap("SourceEndpointPort")
    public String sourceEndpointPort;

    /**
     * <p>The database service port of the source instance.</p>
     * <br>
     * <p>>  If the source instance is a self-managed database, this parameter is available and required.</p>
     */
    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    /**
     * <p>The ID of the destination instance.</p>
     * <br>
     * <p>If the destination instance is an Alibaba Cloud database instance, you must specify the ID of the database instance. For example, if the destination instance is an ApsaraDB RDS for MySQL instance, you must specify the ID of the ApsaraDB RDS for MySQL instance.</p>
     * <br>
     * <p>If the destination instance is a self-managed database, the value of this parameter varies with the value of the **DestinationEndpointInstanceType** parameter.****</p>
     * <br>
     * <p>*   If the DestinationEndpointInstanceType parameter is set to **ECS**, you must specify the ID of the ECS instance.</p>
     * <p>*   If the DestinationEndpointInstanceType parameter is set to **DG**, you must specify the ID of the database gateway.</p>
     * <p>*   If the DestinationEndpointInstanceType parameter is set to **EXPRESS** or **CEN**, you must specify the ID of the VPC that is connected to the source instance.</p>
     * <br>
     * <p>>  If the DestinationEndpointInstanceType parameter is set to **CEN**, you must also specify the ID of the CEN instance in the Reserve parameter. For more information, see [Reserve](~~273111~~).</p>
     */
    @NameInMap("SourceEndpointRole")
    public String sourceEndpointRole;

    /**
     * <p>The ID of the Alibaba Cloud account to which the source instance belongs.</p>
     * <br>
     * <p>>  You can specify this parameter to migrate or synchronize data across different Alibaba Cloud accounts. In this case, you must specify the **SourceEndpointRole** parameter.</p>
     */
    @NameInMap("SourceEndpointUserName")
    public String sourceEndpointUserName;

    /**
     * <p>数据投递链路交换机实例id</p>
     */
    @NameInMap("SourceEndpointVSwitchID")
    public String sourceEndpointVSwitchID;

    @NameInMap("SrcCaCertificateOssUrl")
    public String srcCaCertificateOssUrl;

    @NameInMap("SrcCaCertificatePassword")
    public String srcCaCertificatePassword;

    /**
     * <p>Specifies whether to perform incremental data migration or synchronization. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **false**: does not perform incremental data migration or synchronization.</p>
     * <p>*   **true**: performs incremental data migration or synchronization.</p>
     */
    @NameInMap("StructureInitialization")
    public Boolean structureInitialization;

    /**
     * <p>The ID of the DTS dedicated cluster on which the task runs.</p>
     * <br>
     * <p>>  If this parameter is specified, the task is scheduled to the specified DTS dedicated cluster.</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    public static ConfigureDtsJobAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureDtsJobAdvanceRequest self = new ConfigureDtsJobAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureDtsJobAdvanceRequest setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public String getCheckpoint() {
        return this.checkpoint;
    }

    public ConfigureDtsJobAdvanceRequest setDataCheckConfigure(String dataCheckConfigure) {
        this.dataCheckConfigure = dataCheckConfigure;
        return this;
    }
    public String getDataCheckConfigure() {
        return this.dataCheckConfigure;
    }

    public ConfigureDtsJobAdvanceRequest setDataInitialization(Boolean dataInitialization) {
        this.dataInitialization = dataInitialization;
        return this;
    }
    public Boolean getDataInitialization() {
        return this.dataInitialization;
    }

    public ConfigureDtsJobAdvanceRequest setDataSynchronization(Boolean dataSynchronization) {
        this.dataSynchronization = dataSynchronization;
        return this;
    }
    public Boolean getDataSynchronization() {
        return this.dataSynchronization;
    }

    public ConfigureDtsJobAdvanceRequest setDbList(String dbList) {
        this.dbList = dbList;
        return this;
    }
    public String getDbList() {
        return this.dbList;
    }

    public ConfigureDtsJobAdvanceRequest setDedicatedClusterId(String dedicatedClusterId) {
        this.dedicatedClusterId = dedicatedClusterId;
        return this;
    }
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    public ConfigureDtsJobAdvanceRequest setDelayNotice(Boolean delayNotice) {
        this.delayNotice = delayNotice;
        return this;
    }
    public Boolean getDelayNotice() {
        return this.delayNotice;
    }

    public ConfigureDtsJobAdvanceRequest setDelayPhone(String delayPhone) {
        this.delayPhone = delayPhone;
        return this;
    }
    public String getDelayPhone() {
        return this.delayPhone;
    }

    public ConfigureDtsJobAdvanceRequest setDelayRuleTime(Long delayRuleTime) {
        this.delayRuleTime = delayRuleTime;
        return this;
    }
    public Long getDelayRuleTime() {
        return this.delayRuleTime;
    }

    public ConfigureDtsJobAdvanceRequest setDestCaCertificateOssUrl(String destCaCertificateOssUrl) {
        this.destCaCertificateOssUrl = destCaCertificateOssUrl;
        return this;
    }
    public String getDestCaCertificateOssUrl() {
        return this.destCaCertificateOssUrl;
    }

    public ConfigureDtsJobAdvanceRequest setDestCaCertificatePassword(String destCaCertificatePassword) {
        this.destCaCertificatePassword = destCaCertificatePassword;
        return this;
    }
    public String getDestCaCertificatePassword() {
        return this.destCaCertificatePassword;
    }

    public ConfigureDtsJobAdvanceRequest setDestinationEndpointDataBaseName(String destinationEndpointDataBaseName) {
        this.destinationEndpointDataBaseName = destinationEndpointDataBaseName;
        return this;
    }
    public String getDestinationEndpointDataBaseName() {
        return this.destinationEndpointDataBaseName;
    }

    public ConfigureDtsJobAdvanceRequest setDestinationEndpointEngineName(String destinationEndpointEngineName) {
        this.destinationEndpointEngineName = destinationEndpointEngineName;
        return this;
    }
    public String getDestinationEndpointEngineName() {
        return this.destinationEndpointEngineName;
    }

    public ConfigureDtsJobAdvanceRequest setDestinationEndpointIP(String destinationEndpointIP) {
        this.destinationEndpointIP = destinationEndpointIP;
        return this;
    }
    public String getDestinationEndpointIP() {
        return this.destinationEndpointIP;
    }

    public ConfigureDtsJobAdvanceRequest setDestinationEndpointInstanceID(String destinationEndpointInstanceID) {
        this.destinationEndpointInstanceID = destinationEndpointInstanceID;
        return this;
    }
    public String getDestinationEndpointInstanceID() {
        return this.destinationEndpointInstanceID;
    }

    public ConfigureDtsJobAdvanceRequest setDestinationEndpointInstanceType(String destinationEndpointInstanceType) {
        this.destinationEndpointInstanceType = destinationEndpointInstanceType;
        return this;
    }
    public String getDestinationEndpointInstanceType() {
        return this.destinationEndpointInstanceType;
    }

    public ConfigureDtsJobAdvanceRequest setDestinationEndpointOracleSID(String destinationEndpointOracleSID) {
        this.destinationEndpointOracleSID = destinationEndpointOracleSID;
        return this;
    }
    public String getDestinationEndpointOracleSID() {
        return this.destinationEndpointOracleSID;
    }

    public ConfigureDtsJobAdvanceRequest setDestinationEndpointOwnerID(String destinationEndpointOwnerID) {
        this.destinationEndpointOwnerID = destinationEndpointOwnerID;
        return this;
    }
    public String getDestinationEndpointOwnerID() {
        return this.destinationEndpointOwnerID;
    }

    public ConfigureDtsJobAdvanceRequest setDestinationEndpointPassword(String destinationEndpointPassword) {
        this.destinationEndpointPassword = destinationEndpointPassword;
        return this;
    }
    public String getDestinationEndpointPassword() {
        return this.destinationEndpointPassword;
    }

    public ConfigureDtsJobAdvanceRequest setDestinationEndpointPort(String destinationEndpointPort) {
        this.destinationEndpointPort = destinationEndpointPort;
        return this;
    }
    public String getDestinationEndpointPort() {
        return this.destinationEndpointPort;
    }

    public ConfigureDtsJobAdvanceRequest setDestinationEndpointRegion(String destinationEndpointRegion) {
        this.destinationEndpointRegion = destinationEndpointRegion;
        return this;
    }
    public String getDestinationEndpointRegion() {
        return this.destinationEndpointRegion;
    }

    public ConfigureDtsJobAdvanceRequest setDestinationEndpointRole(String destinationEndpointRole) {
        this.destinationEndpointRole = destinationEndpointRole;
        return this;
    }
    public String getDestinationEndpointRole() {
        return this.destinationEndpointRole;
    }

    public ConfigureDtsJobAdvanceRequest setDestinationEndpointUserName(String destinationEndpointUserName) {
        this.destinationEndpointUserName = destinationEndpointUserName;
        return this;
    }
    public String getDestinationEndpointUserName() {
        return this.destinationEndpointUserName;
    }

    public ConfigureDtsJobAdvanceRequest setDisasterRecoveryJob(Boolean disasterRecoveryJob) {
        this.disasterRecoveryJob = disasterRecoveryJob;
        return this;
    }
    public Boolean getDisasterRecoveryJob() {
        return this.disasterRecoveryJob;
    }

    public ConfigureDtsJobAdvanceRequest setDtsBisLabel(String dtsBisLabel) {
        this.dtsBisLabel = dtsBisLabel;
        return this;
    }
    public String getDtsBisLabel() {
        return this.dtsBisLabel;
    }

    public ConfigureDtsJobAdvanceRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ConfigureDtsJobAdvanceRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ConfigureDtsJobAdvanceRequest setDtsJobName(String dtsJobName) {
        this.dtsJobName = dtsJobName;
        return this;
    }
    public String getDtsJobName() {
        return this.dtsJobName;
    }

    public ConfigureDtsJobAdvanceRequest setErrorNotice(Boolean errorNotice) {
        this.errorNotice = errorNotice;
        return this;
    }
    public Boolean getErrorNotice() {
        return this.errorNotice;
    }

    public ConfigureDtsJobAdvanceRequest setErrorPhone(String errorPhone) {
        this.errorPhone = errorPhone;
        return this;
    }
    public String getErrorPhone() {
        return this.errorPhone;
    }

    public ConfigureDtsJobAdvanceRequest setFileOssUrlObject(java.io.InputStream fileOssUrlObject) {
        this.fileOssUrlObject = fileOssUrlObject;
        return this;
    }
    public java.io.InputStream getFileOssUrlObject() {
        return this.fileOssUrlObject;
    }

    public ConfigureDtsJobAdvanceRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ConfigureDtsJobAdvanceRequest setMaxDu(Double maxDu) {
        this.maxDu = maxDu;
        return this;
    }
    public Double getMaxDu() {
        return this.maxDu;
    }

    public ConfigureDtsJobAdvanceRequest setMinDu(Double minDu) {
        this.minDu = minDu;
        return this;
    }
    public Double getMinDu() {
        return this.minDu;
    }

    public ConfigureDtsJobAdvanceRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ConfigureDtsJobAdvanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigureDtsJobAdvanceRequest setReserve(String reserve) {
        this.reserve = reserve;
        return this;
    }
    public String getReserve() {
        return this.reserve;
    }

    public ConfigureDtsJobAdvanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ConfigureDtsJobAdvanceRequest setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
        this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
        return this;
    }
    public String getSourceEndpointDatabaseName() {
        return this.sourceEndpointDatabaseName;
    }

    public ConfigureDtsJobAdvanceRequest setSourceEndpointEngineName(String sourceEndpointEngineName) {
        this.sourceEndpointEngineName = sourceEndpointEngineName;
        return this;
    }
    public String getSourceEndpointEngineName() {
        return this.sourceEndpointEngineName;
    }

    public ConfigureDtsJobAdvanceRequest setSourceEndpointIP(String sourceEndpointIP) {
        this.sourceEndpointIP = sourceEndpointIP;
        return this;
    }
    public String getSourceEndpointIP() {
        return this.sourceEndpointIP;
    }

    public ConfigureDtsJobAdvanceRequest setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
        this.sourceEndpointInstanceID = sourceEndpointInstanceID;
        return this;
    }
    public String getSourceEndpointInstanceID() {
        return this.sourceEndpointInstanceID;
    }

    public ConfigureDtsJobAdvanceRequest setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
        this.sourceEndpointInstanceType = sourceEndpointInstanceType;
        return this;
    }
    public String getSourceEndpointInstanceType() {
        return this.sourceEndpointInstanceType;
    }

    public ConfigureDtsJobAdvanceRequest setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
        this.sourceEndpointOracleSID = sourceEndpointOracleSID;
        return this;
    }
    public String getSourceEndpointOracleSID() {
        return this.sourceEndpointOracleSID;
    }

    public ConfigureDtsJobAdvanceRequest setSourceEndpointOwnerID(String sourceEndpointOwnerID) {
        this.sourceEndpointOwnerID = sourceEndpointOwnerID;
        return this;
    }
    public String getSourceEndpointOwnerID() {
        return this.sourceEndpointOwnerID;
    }

    public ConfigureDtsJobAdvanceRequest setSourceEndpointPassword(String sourceEndpointPassword) {
        this.sourceEndpointPassword = sourceEndpointPassword;
        return this;
    }
    public String getSourceEndpointPassword() {
        return this.sourceEndpointPassword;
    }

    public ConfigureDtsJobAdvanceRequest setSourceEndpointPort(String sourceEndpointPort) {
        this.sourceEndpointPort = sourceEndpointPort;
        return this;
    }
    public String getSourceEndpointPort() {
        return this.sourceEndpointPort;
    }

    public ConfigureDtsJobAdvanceRequest setSourceEndpointRegion(String sourceEndpointRegion) {
        this.sourceEndpointRegion = sourceEndpointRegion;
        return this;
    }
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    public ConfigureDtsJobAdvanceRequest setSourceEndpointRole(String sourceEndpointRole) {
        this.sourceEndpointRole = sourceEndpointRole;
        return this;
    }
    public String getSourceEndpointRole() {
        return this.sourceEndpointRole;
    }

    public ConfigureDtsJobAdvanceRequest setSourceEndpointUserName(String sourceEndpointUserName) {
        this.sourceEndpointUserName = sourceEndpointUserName;
        return this;
    }
    public String getSourceEndpointUserName() {
        return this.sourceEndpointUserName;
    }

    public ConfigureDtsJobAdvanceRequest setSourceEndpointVSwitchID(String sourceEndpointVSwitchID) {
        this.sourceEndpointVSwitchID = sourceEndpointVSwitchID;
        return this;
    }
    public String getSourceEndpointVSwitchID() {
        return this.sourceEndpointVSwitchID;
    }

    public ConfigureDtsJobAdvanceRequest setSrcCaCertificateOssUrl(String srcCaCertificateOssUrl) {
        this.srcCaCertificateOssUrl = srcCaCertificateOssUrl;
        return this;
    }
    public String getSrcCaCertificateOssUrl() {
        return this.srcCaCertificateOssUrl;
    }

    public ConfigureDtsJobAdvanceRequest setSrcCaCertificatePassword(String srcCaCertificatePassword) {
        this.srcCaCertificatePassword = srcCaCertificatePassword;
        return this;
    }
    public String getSrcCaCertificatePassword() {
        return this.srcCaCertificatePassword;
    }

    public ConfigureDtsJobAdvanceRequest setStructureInitialization(Boolean structureInitialization) {
        this.structureInitialization = structureInitialization;
        return this;
    }
    public Boolean getStructureInitialization() {
        return this.structureInitialization;
    }

    public ConfigureDtsJobAdvanceRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

}
