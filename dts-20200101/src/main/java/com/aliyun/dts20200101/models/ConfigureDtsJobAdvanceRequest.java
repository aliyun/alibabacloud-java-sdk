// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureDtsJobAdvanceRequest extends TeaModel {
    /**
     * <p>The start offset for incremental data migration or the synchronization checkpoint, in UNIX timestamp format. Unit: seconds.</p>
     * <blockquote>
     * <p>If you specify the <strong>Checkpoint</strong> parameter, you must ensure that no other running DTS instances use the same source database as the destination DTS instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1610540493</p>
     */
    @NameInMap("Checkpoint")
    public String checkpoint;

    /**
     * <p>The parameters for the data validation task, in JSON character string format, such as parameter limits and alert configuration. For more information, see <a href="https://help.aliyun.com/document_detail/459023.html">DataCheckConfigure metric description</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;fullCheckModel&quot;:1,&quot;fullCheckRatio&quot;:20,&quot;checkMaximumHourEnable&quot;:1,&quot;checkMaximumHour&quot;:1,&quot;fullCheckErrorNotice&quot;:true,&quot;fullCheckValidFailNotice&quot;:true,&quot;fullCheckNoticeValue&quot;:8,&quot;incrementalCheckErrorNotice&quot;:true,&quot;incrementalCheckValidFailNotice&quot;:true,&quot;incrementalCheckValidFailNoticeTimes&quot;:2,&quot;incrementalCheckValidFailNoticePeriod&quot;:1,&quot;incrementalCheckValidFailNoticeValue&quot;:1,&quot;incrementalCheckDelayNotice&quot;:true,&quot;incrementalCheckDelayNoticeTimes&quot;:2,&quot;incrementalCheckDelayNoticePeriod&quot;:1,&quot;incrementalCheckDelayNoticeValue&quot;:60,&quot;fullDataCheck&quot;:true,&quot;incrementalDataCheck&quot;:true,&quot;dataCheckNoticePhone&quot;:&quot;13126800****&quot;,&quot;dataCheckDbList&quot;:{&quot;dts&quot;:{&quot;name&quot;:&quot;dts&quot;,&quot;all&quot;:true}}}</p>
     */
    @NameInMap("DataCheckConfigure")
    public String dataCheckConfigure;

    /**
     * <p>Specifies whether to perform full data migration or initial full data synchronization. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes. This is the default value.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * <blockquote>
     * <p>If <strong>JobType</strong> is set to <strong>CHECK</strong>, you can only set this parameter to <strong>false</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DataInitialization")
    public Boolean dataInitialization;

    /**
     * <p>Specifies whether to perform incremental data migration or synchronization. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: No. This is the default value.</li>
     * <li><strong>true</strong>: Yes.</li>
     * </ul>
     * <blockquote>
     * <p>If <strong>JobType</strong> is set to <strong>CHECK</strong>, you can only set this parameter to <strong>false</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DataSynchronization")
    public Boolean dataSynchronization;

    /**
     * <p>The objects to be migrated or synchronized, in JSON format. For more information, see <a href="https://help.aliyun.com/document_detail/209545.html">Object definitions for migration, synchronization, and change tracking</a>.</p>
     * <ul>
     * <li>The DbList parameter supports up to 1 MB of data.</li>
     * <li>If DbList contains filter conditions, the total length of DbList including the filter conditions can be up to 1 MB.</li>
     * <li>For distributed tasks such as migration or synchronization tasks where the source is PolarDB-X 1.0, DbList is split based on physical table shards to generate multiple subtasks. The DbList of each subtask supports up to 1 MB of data.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dtstest&quot;:{&quot;name&quot;:&quot;dtstest&quot;,&quot;all&quot;:true}}</p>
     */
    @NameInMap("DbList")
    public String dbList;

    /**
     * <p>The ID of the dedicated DTS cluster.</p>
     * <blockquote>
     * <p>When the ID of a dedicated cluster is specified, the task is scheduled to the corresponding cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtscluster_atyl3b5214uk***</p>
     */
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    /**
     * <p>Specifies whether to monitor the latency status. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DelayNotice")
    public Boolean delayNotice;

    /**
     * <p>The mobile phone numbers of the contacts to receive latency alerts. Separate multiple mobile phone numbers with commas (,).</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is supported only on the China site and supports only mobile phone numbers in the Chinese mainland. You can specify up to 10 mobile phone numbers.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The international site does not support mobile phone alerts. You can only <a href="https://help.aliyun.com/document_detail/175876.html">set alert rules for DTS tasks through CloudMonitor</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1361234****,1371234****</p>
     */
    @NameInMap("DelayPhone")
    public String delayPhone;

    /**
     * <p>The threshold for triggering latency alerts. Unit: seconds. The value must be an integer. You can set the threshold based on your business requirements. We recommend that you set the threshold to more than 10 seconds to avoid latency fluctuations caused by network or database loads.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>DelayNotice</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("DelayRuleTime")
    public Long delayRuleTime;

    /**
     * <p>The path of the CA certificate when the destination database is connected over SSL.</p>
     * <blockquote>
     * <p>This feature is not supported. Do not specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DestCaCertificateOssUrl")
    public String destCaCertificateOssUrl;

    /**
     * <p>The password of the CA certificate when the destination database is connected over SSL.</p>
     * <blockquote>
     * <p>This feature is not supported. Do not specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DestCaCertificatePassword")
    public String destCaCertificatePassword;

    /**
     * <p>The path of the client certificate when the destination database is connected over SSL.</p>
     * <blockquote>
     * <p>This feature is not supported. Do not specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DestClientCertOssUrl")
    public String destClientCertOssUrl;

    /**
     * <p>The path of the client certificate private key when the destination database is connected over SSL.</p>
     * <blockquote>
     * <p>This feature is not supported. Do not specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DestClientKeyOssUrl")
    public String destClientKeyOssUrl;

    /**
     * <p>The password of the client certificate private key when the destination database is connected over SSL.</p>
     * <blockquote>
     * <p>This feature is not supported. Do not specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DestClientPassword")
    public String destClientPassword;

    /**
     * <p>The primary vSwitch at the destination end of the VPC NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DestPrimaryVswId")
    public String destPrimaryVswId;

    /**
     * <p>The secondary vSwitch at the destination end of the VPC NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DestSecondaryVswId")
    public String destSecondaryVswId;

    /**
     * <p>The name of the database to which the migration objects belong in the destination instance.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is available and required only when the destination instance or the database engine of the destination instance is PolarDB for PostgreSQL (Compatible with Oracle), AnalyticDB for PostgreSQL, PostgreSQL, MaxCompute, or MongoDB.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If the destination database is MaxCompute, you must specify the name of the MaxCompute project.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dtstestdata</p>
     */
    @NameInMap("DestinationEndpointDataBaseName")
    public String destinationEndpointDataBaseName;

    /**
     * <p>The database type of the destination instance. Valid values:</p>
     * <ul>
     * <li><strong>MYSQL</strong>: MySQL database, including ApsaraDB RDS for MySQL and self-managed MySQL.</li>
     * <li><strong>MARIADB</strong>: ApsaraDB RDS for MariaDB.</li>
     * <li><strong>PolarDB</strong>: PolarDB for MySQL.</li>
     * <li><strong>POLARDB_O</strong>: PolarDB for PostgreSQL (Compatible with Oracle).</li>
     * <li><strong>POLARDBX10</strong>: PolarDB-X 1.0 (formerly DRDS).</li>
     * <li><strong>POLARDBX20</strong>: cloud-native distributed database PolarDB-X 2.0.</li>
     * <li><strong>ORACLE</strong>: Self-managed Oracle database.</li>
     * <li><strong>PostgreSQL</strong>: PostgreSQL database, including ApsaraDB RDS for PostgreSQL and self-managed PostgreSQL.</li>
     * <li><strong>MSSQL</strong>: SQL Server database, including ApsaraDB RDS for SQL Server and self-managed SQL Server.</li>
     * <li><strong>ADS</strong>: AnalyticDB for MySQL V2.0.</li>
     * <li><strong>ADB30</strong>: AnalyticDB for MySQL V3.0.</li>
     * <li><strong>MONGODB</strong>: MongoDB database, including self-managed MongoDB and ApsaraDB for MongoDB.</li>
     * <li><strong>ROCKETMQ</strong>: MSMQ RocketMQ.</li>
     * <li><strong>GREENPLUM</strong>: AnalyticDB for PostgreSQL.</li>
     * <li><strong>KAFKA</strong>: Kafka database, including MSMQ for Kafka and self-managed Kafka.</li>
     * <li><strong>DATAHUB</strong>: DataHub.</li>
     * <li><strong>DB2</strong>: Self-managed Db2 for LUW database.</li>
     * <li><strong>AS400</strong>: Self-managed Db2 for i database.</li>
     * <li><strong>ODPS</strong>: MaxCompute.</li>
     * <li><strong>Tablestore</strong>: Tablestore.</li>
     * <li><strong>ELK</strong>: Alibaba Cloud retrieve and analysis service Elasticsearch.</li>
     * <li><strong>REDIS</strong>: Redis database, including self-managed Redis and Tair (Redis OSS-Compatible).</li>
     * <li><strong>LINDORM</strong>: cloud-native multi-model database Lindorm.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Default value: <strong>MYSQL</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If the database type of the destination instance is set to <strong>KAFKA</strong>, <strong>MONGODB</strong>, or <strong>PolarDB</strong>, you must also specify some information in the reserved parameter Reserve. For more information about the configuration method, see <a href="https://help.aliyun.com/document_detail/273111.html">Reserve metric description</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MYSQL</p>
     */
    @NameInMap("DestinationEndpointEngineName")
    public String destinationEndpointEngineName;

    /**
     * <p>The IP address of the destination instance.</p>
     * <blockquote>
     * <p>This parameter is available and required only when <strong>DestinationEndpointInstanceType</strong> is set to <strong>OTHER</strong>, <strong>EXPRESS</strong>, <strong>DG</strong>, or <strong>CEN</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><code>172.16.**.**</code>*</p>
     */
    @NameInMap("DestinationEndpointIP")
    public String destinationEndpointIP;

    /**
     * <p>The instance ID of the destination instance.</p>
     * <p>If the destination instance is an ApsaraDB database such as ApsaraDB RDS for MySQL, you must specify the instance ID of the ApsaraDB database.</p>
     * <p>If the destination instance is a self-managed database, the value of this parameter varies based on the value of <strong>DestinationEndpointInstanceType</strong>. For example:</p>
     * <ul>
     * <li>If <strong>DestinationEndpointInstanceType</strong> is set to <strong>ECS</strong>, specify the instance ID of the ECS instance.</li>
     * <li>If <strong>DestinationEndpointInstanceType</strong> is set to <strong>DG</strong>, specify the instance ID of the database gateway.</li>
     * <li>If <strong>DestinationEndpointInstanceType</strong> is set to <strong>EXPRESS</strong> or <strong>CEN</strong>, specify the instance ID of the VPC that is connected to the source database.</li>
     * </ul>
     * <blockquote>
     * <p>If the value is <strong>CEN</strong>, you must also specify the instance ID of the CEN instance in the reserved parameter Reserve. For more information about the configuration method, see <a href="https://help.aliyun.com/document_detail/273111.html">Reserve metric description</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1opxu1zkhn00gzv****</p>
     */
    @NameInMap("DestinationEndpointInstanceID")
    public String destinationEndpointInstanceID;

    /**
     * <p>The target instance type. Valid values:</p>
     * <p><strong>Alibaba Cloud databases</strong></p>
     * <ul>
     * <li><strong>RDS</strong>: ApsaraDB RDS for MySQL, ApsaraDB RDS for SQL Server, ApsaraDB RDS for PostgreSQL, or ApsaraDB RDS for MariaDB.</li>
     * <li><strong>PolarDB</strong>: PolarDB for MySQL.</li>
     * <li><strong>DISTRIBUTED_POLARDBX10</strong>: PolarDB-X 1.0 (formerly DRDS).</li>
     * <li><strong>POLARDBX20</strong>: PolarDB-X 2.0.</li>
     * <li><strong>REDIS</strong>: Tair (Redis OSS-Compatible).</li>
     * <li><strong>ADS</strong>: AnalyticDB for MySQL V2.0 or V3.0.</li>
     * <li><strong>MONGODB</strong>: ApsaraDB for MongoDB.</li>
     * <li><strong>ROCKETMQ</strong>: ApsaraDB for RocketMQ.</li>
     * <li><strong>GREENPLUM</strong>: AnalyticDB for PostgreSQL.</li>
     * <li><strong>DATAHUB</strong>: DataHub, the Alibaba Cloud streaming data processing platform.</li>
     * <li><strong>ELK</strong>: Alibaba Cloud retrieve and analysis service Elasticsearch.</li>
     * <li><strong>Tablestore</strong>: Tablestore.</li>
     * <li><strong>ODPS</strong>: MaxCompute.</li>
     * <li><strong>LINDORM</strong>: cloud-native multi-model database Lindorm.</li>
     * </ul>
     * <p><strong>Self-managed databases</strong></p>
     * <ul>
     * <li><strong>OTHER</strong>: Self-managed database with a public IP address.</li>
     * <li><strong>ECS</strong>: Self-managed database hosted on ECS.</li>
     * <li><strong>EXPRESS</strong>: Self-managed database connected over Express Connect.</li>
     * <li><strong>CEN</strong>: Self-managed database connected over CEN.</li>
     * <li><strong>DG</strong>: Self-managed database connected over Database Gateway.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If the destination instance is a PolarDB for PostgreSQL (Compatible with Oracle) cluster, you must set this parameter to <strong>OTHER</strong> or <strong>EXPRESS</strong> to treat it as a self-managed database and connect it over a public IP address or Express Connect.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If the destination instance is MSMQ for Kafka, you must set this parameter to <strong>ECS</strong> or <strong>EXPRESS</strong> to treat it as a self-managed database and connect it over ECS or Express Connect.</li>
     * <li>For more information about the supported source and destination databases, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/131497.html">Supported databases</a>&lt;props=&quot;intl&quot;&gt;<a href="https://help.aliyun.com/document_detail/176064.html">Supported source and destination databases</a>.</li>
     * <li>If the destination instance is a self-managed database, you must execute the corresponding preparations. For more information, see <a href="https://help.aliyun.com/document_detail/146958.html">Preparations overview</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EXPRESS</p>
     */
    @NameInMap("DestinationEndpointInstanceType")
    public String destinationEndpointInstanceType;

    /**
     * <p>The SID of the Oracle database.</p>
     * <blockquote>
     * <p>This parameter is available and required only when <strong>DestinationEndpointEngineName</strong> is set to <strong>Oracle</strong> and the <strong>Oracle</strong> database is a non-RAC instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testsid</p>
     */
    @NameInMap("DestinationEndpointOracleSID")
    public String destinationEndpointOracleSID;

    /**
     * <p>The Alibaba Cloud account ID to which the destination ApsaraDB RDS for MySQL instance belongs.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter can be configured only when the destination instance is ApsaraDB RDS for MySQL.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>Specifying this parameter indicates that you execute cross-Alibaba Cloud account data migration or synchronization. You must also specify the <strong>DestinationEndpointRole</strong> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>140692647406****</p>
     */
    @NameInMap("DestinationEndpointOwnerID")
    public String destinationEndpointOwnerID;

    /**
     * <p>The password of the database account of the destination database.</p>
     * <blockquote>
     * <p>If the destination database is MaxCompute, you must specify the AccessKey secret of the Alibaba Cloud account. For more information about how to obtain an AccessKey secret, see <a href="https://help.aliyun.com/document_detail/116401.html">Create an AccessKey pair</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Test123456</p>
     */
    @NameInMap("DestinationEndpointPassword")
    public String destinationEndpointPassword;

    /**
     * <p>The database service port of the destination instance.</p>
     * <blockquote>
     * <p>This parameter is available and required only when the destination instance is a self-managed database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("DestinationEndpointPort")
    public String destinationEndpointPort;

    /**
     * <p>The area of the destination instance. For details, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * <blockquote>
     * <p>This parameter is required if the destination instance is an ApsaraDB database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DestinationEndpointRegion")
    public String destinationEndpointRegion;

    /**
     * <p>The name of the role configured for the Alibaba Cloud account to which the destination instance belongs.</p>
     * <blockquote>
     * <p>This parameter is required when you migrate or synchronize data across Alibaba Cloud accounts. For more information about the permissions required for the role and the authorization method, see <a href="https://help.aliyun.com/document_detail/48468.html">Configure RAM authorization for cross-account data migration or synchronization</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ram-for-dts</p>
     */
    @NameInMap("DestinationEndpointRole")
    public String destinationEndpointRole;

    /**
     * <p>The database account of the destination database.</p>
     * <blockquote>
     * <ul>
     * <li>In most cases, you must specify the database account of the destination database.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The permissions required for migrating or synchronizing data vary based on the database. For more information about the permission requirements, see <a href="https://help.aliyun.com/document_detail/175878.html">Prepare database accounts for data migration</a> and <a href="https://help.aliyun.com/document_detail/213152.html">Prepare database accounts for data synchronization</a>.</li>
     * <li>If the destination database is MaxCompute, you must specify the AccessKey ID of the Alibaba Cloud account. For more information about how to obtain an AccessKey ID, see <a href="https://help.aliyun.com/document_detail/116401.html">Create an AccessKey pair</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
     */
    @NameInMap("DestinationEndpointUserName")
    public String destinationEndpointUserName;

    /**
     * <p>Specifies whether the instance is a disaster recovery instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisasterRecoveryJob")
    public Boolean disasterRecoveryJob;

    /**
     * <p>The environment tag of the DTS instance. Valid values:</p>
     * <ul>
     * <li><strong>normal</strong>: Normal.</li>
     * <li><strong>online</strong>: Online.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DtsBisLabel")
    public String dtsBisLabel;

    /**
     * <p>The ID of the data migration or synchronization instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the instance ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtsk2gm967v16f****</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The ID of the data migration or synchronization task.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the task ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>k2gm967v16f****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The name of the DTS instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rdsmysql_to_mysql</p>
     */
    @NameInMap("DtsJobName")
    public String dtsJobName;

    /**
     * <p>Specifies whether to monitor the exception status. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ErrorNotice")
    public Boolean errorNotice;

    /**
     * <p>The mobile phone numbers of the contacts to receive exception alerts. Separate multiple mobile phone numbers with commas (,).</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is supported only on the China site and supports only mobile phone numbers in the Chinese mainland. You can specify up to 10 mobile phone numbers.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The international site does not support mobile phone alerts. You can only <a href="https://help.aliyun.com/document_detail/175876.html">set alert rules for DTS tasks through CloudMonitor</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1361234****,1371234****</p>
     */
    @NameInMap("ErrorPhone")
    public String errorPhone;

    /**
     * <p>The OSS URL of the task file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://db-list-os-file.oss-cn-shanghai.aliyuncs.com/8e42_121852**********_79dd3aeabe2f43cdb">http://db-list-os-file.oss-cn-shanghai.aliyuncs.com/8e42_121852**********_79dd3aeabe2f43cdb</a>**************</p>
     */
    @NameInMap("FileOssUrl")
    public java.io.InputStream fileOssUrlObject;

    /**
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li><strong>MIGRATION</strong>: data migration.</li>
     * <li><strong>SYNC</strong>: data synchronization.</li>
     * <li><strong>CHECK</strong>: data validation (purchased separately).</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If the value is <strong>MIGRATION</strong> or <strong>SYNC</strong>, you can also configure a data validation node in the migration or synchronization instance.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>To configure a data validation node, you must also configure the <strong>DataCheckConfigure</strong> parameter.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SYNC</p>
     */
    @NameInMap("JobType")
    public String jobType;

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

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The region of the DTS instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The reserved parameter of DTS, in JSON character string format. You can specify this parameter to supplement the information about the source and destination databases, such as the data storage format of the destination Kafka database, the instance ID of the CEN instance, and the ETL feature configuration. For more information, see <a href="https://help.aliyun.com/document_detail/273111.html">Reserve metric description</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{      &quot;srcInstanceId&quot;: &quot;cen-9kqshqum*******&quot;  }</p>
     */
    @NameInMap("Reserve")
    public String reserve;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the database to which the migration objects belong in the source instance.</p>
     * <blockquote>
     * <p>This parameter is available and required only when the source instance or the database engine of the source instance is PolarDB for PostgreSQL (Compatible with Oracle), PostgreSQL, or MongoDB.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtstestdatabase</p>
     */
    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    /**
     * <p>The database type of the source instance. Valid values:</p>
     * <ul>
     * <li><strong>MYSQL</strong>: MySQL database, including ApsaraDB RDS for MySQL and self-managed MySQL.</li>
     * <li><strong>MARIADB</strong>: ApsaraDB RDS for MariaDB.</li>
     * <li><strong>PolarDB</strong>: PolarDB for MySQL.</li>
     * <li><strong>POLARDB_O</strong>: PolarDB for PostgreSQL (Compatible with Oracle).</li>
     * <li><strong>POLARDBX10</strong>: PolarDB-X 1.0 (formerly DRDS).</li>
     * <li><strong>POLARDBX20</strong>: cloud-native distributed database PolarDB-X 2.0.</li>
     * <li><strong>ADB30</strong>: AnalyticDB for MySQL V3.0.</li>
     * <li><strong>ORACLE</strong>: Self-managed Oracle database.</li>
     * <li><strong>POSTGRESQL</strong>: PostgreSQL database, including ApsaraDB RDS for PostgreSQL and self-managed PostgreSQL.</li>
     * <li><strong>MSSQL</strong>: SQL Server database, including ApsaraDB RDS for SQL Server and self-managed SQL Server.</li>
     * <li><strong>MONGODB</strong>: MongoDB database, including self-managed MongoDB and ApsaraDB for MongoDB.</li>
     * <li><strong>DB2</strong>: Self-managed Db2 for LUW database.</li>
     * <li><strong>AS400</strong>: Self-managed Db2 for i database.</li>
     * <li><strong>DMSPOLARDB</strong>: DMS logical database.</li>
     * <li><strong>HBASE</strong>: Self-managed HBase database.</li>
     * <li><strong>TERADATA</strong>: Teradata database.</li>
     * <li><strong>TiDB</strong>: TiDB database.</li>
     * <li><strong>REDIS</strong>: Redis database, including self-managed Redis and Tair (Redis OSS-Compatible).</li>
     * <li><strong>LINDORM</strong>: cloud-native multi-model database Lindorm.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Default value: <strong>MYSQL</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If the database type of the source instance is set to <strong>MONGODB</strong>, you must also specify some information in the reserved parameter Reserve. For more information about the configuration method, see <a href="https://help.aliyun.com/document_detail/273111.html">Reserve metric description</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MYSQL</p>
     */
    @NameInMap("SourceEndpointEngineName")
    public String sourceEndpointEngineName;

    /**
     * <p>The IP address of the source instance.</p>
     * <blockquote>
     * <p>This parameter is available and required only when <strong>SourceEndpointInstanceType</strong> is set to <strong>OTHER</strong>, <strong>EXPRESS</strong>, <strong>DG</strong>, or <strong>CEN</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><code>172.16.**.**</code>*</p>
     */
    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    /**
     * <p>The instance ID of the source instance.</p>
     * <p>If the source instance is an ApsaraDB database such as ApsaraDB RDS for MySQL, you must specify the instance ID of the ApsaraDB database.</p>
     * <p>If the source instance is a self-managed database, the value of this parameter varies based on the value of <strong>SourceEndpointInstanceType</strong>. For example:</p>
     * <ul>
     * <li>If <strong>SourceEndpointInstanceType</strong> is set to <strong>ECS</strong>, specify the instance ID of the ECS instance.</li>
     * <li>If <strong>SourceEndpointInstanceType</strong> is set to <strong>DG</strong>, specify the instance ID of the database gateway.</li>
     * <li>If <strong>SourceEndpointInstanceType</strong> is set to <strong>EXPRESS</strong> or <strong>CEN</strong>, specify the instance ID of the VPC that is connected to the source database.</li>
     * </ul>
     * <blockquote>
     * <p>If the value is <strong>CEN</strong>, you must also specify the instance ID of the CEN instance in the reserved parameter Reserve. For more information about the configuration method, see <a href="https://help.aliyun.com/document_detail/273111.html">Reserve metric description</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1imrtn6fq7h****</p>
     */
    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    /**
     * <p>The type of the source instance. Valid values:</p>
     * <p><strong>Alibaba Cloud databases</strong></p>
     * <ul>
     * <li><strong>RDS</strong>: ApsaraDB RDS for MySQL, ApsaraDB RDS for SQL Server, ApsaraDB RDS for PostgreSQL, or ApsaraDB RDS for MariaDB.</li>
     * <li><strong>PolarDB</strong>: PolarDB for MySQL.</li>
     * <li><strong>ADS</strong>: AnalyticDB for MySQL.</li>
     * <li><strong>REDIS</strong>: Tair (Redis® OSS-Compatible).</li>
     * <li><strong>DISTRIBUTED_POLARDBX10</strong>: PolarDB-X 1.0 (formerly DRDS).</li>
     * <li><strong>POLARDBX20</strong>: PolarDB-X 2.0.</li>
     * <li><strong>MONGODB</strong>: ApsaraDB for MongoDB.</li>
     * <li><strong>DISTRIBUTED_DMSLOGICDB</strong>: Data Management (DMS) logical database.</li>
     * <li><strong>LINDORM</strong>: Lindorm.</li>
     * </ul>
     * <p><strong>Self-managed databases</strong></p>
     * <ul>
     * <li><strong>OTHER</strong>: A self-managed database with a public IP address.</li>
     * <li><strong>ECS</strong>: A self-managed database hosted on an ECS instance.</li>
     * <li><strong>EXPRESS</strong>: A self-managed database connected over an Express Connect circuit.</li>
     * <li><strong>CEN</strong>: A self-managed database connected over a Cloud Enterprise Network (CEN) instance.</li>
     * <li><strong>DG</strong>: A self-managed database connected over a database gateway.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If the source instance is a PolarDB for PostgreSQL (Oracle-Compatible) cluster, set this parameter to <strong>OTHER</strong> or <strong>EXPRESS</strong>. The cluster is treated as a self-managed database and is connected by using a public IP address or an Express Connect circuit.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>For more information about the supported source and destination databases, see <a href="https://help.aliyun.com/document_detail/131497.html">Supported databases</a>.</li>
     * <li>If the source instance is a self-managed database, you must also complete the corresponding preparations. For more information, see <a href="https://help.aliyun.com/document_detail/130607.html">Preparations overview</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("SourceEndpointInstanceType")
    public String sourceEndpointInstanceType;

    /**
     * <p>The system ID (SID) of the Oracle database.</p>
     * <blockquote>
     * <p>This parameter is available and required only when <strong>SourceEndpointEngineName</strong> is set to <strong>Oracle</strong> and the <strong>Oracle</strong> database is a non-RAC instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testsid</p>
     */
    @NameInMap("SourceEndpointOracleSID")
    public String sourceEndpointOracleSID;

    /**
     * <p>The Alibaba Cloud account ID to which the source instance belongs.</p>
     * <blockquote>
     * <p>Specifying this parameter indicates that you execute cross-Alibaba Cloud account data migration or synchronization. You must also specify the <strong>SourceEndpointRole</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>140692647406****</p>
     */
    @NameInMap("SourceEndpointOwnerID")
    public String sourceEndpointOwnerID;

    /**
     * <p>The password of the database account of the source database.</p>
     * 
     * <strong>example:</strong>
     * <p>Test123456</p>
     */
    @NameInMap("SourceEndpointPassword")
    public String sourceEndpointPassword;

    /**
     * <p>The database service port of the source instance.</p>
     * <blockquote>
     * <p>This parameter is available and required only when the source instance is a self-managed database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("SourceEndpointPort")
    public String sourceEndpointPort;

    /**
     * <p>The area of the source instance. For details, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * <blockquote>
     * <p>This parameter is required if the source instance is an ApsaraDB database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    /**
     * <p>The name of the role configured for the Alibaba Cloud account to which the source instance belongs.</p>
     * <blockquote>
     * <p>This parameter is required when you migrate or synchronize data across Alibaba Cloud accounts. For more information about the permissions required for the role and the authorization method, see <a href="https://help.aliyun.com/document_detail/48468.html">Configure RAM authorization for cross-account data migration or synchronization</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ram-for-dts</p>
     */
    @NameInMap("SourceEndpointRole")
    public String sourceEndpointRole;

    /**
     * <p>The database account of the source database.</p>
     * <blockquote>
     * <ul>
     * <li>In most cases, you must specify the database account of the source database.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The permissions required for migrating or synchronizing data vary based on the database. For more information about the permission requirements, see <a href="https://help.aliyun.com/document_detail/175878.html">Prepare database accounts for data migration</a> and <a href="https://help.aliyun.com/document_detail/213152.html">Prepare database accounts for data synchronization</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
     */
    @NameInMap("SourceEndpointUserName")
    public String sourceEndpointUserName;

    /**
     * <p>The instance ID of the vSwitch for the data delivery link.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp10df3mxae6lpmku****</p>
     */
    @NameInMap("SourceEndpointVSwitchID")
    public String sourceEndpointVSwitchID;

    /**
     * <p>The path of the CA certificate when the source database is connected over SSL.</p>
     * <blockquote>
     * <p>This feature is not supported. Do not specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SrcCaCertificateOssUrl")
    public String srcCaCertificateOssUrl;

    /**
     * <p>The password of the CA certificate when the source database is connected over SSL.</p>
     * <blockquote>
     * <p>This feature is not supported. Do not specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SrcCaCertificatePassword")
    public String srcCaCertificatePassword;

    /**
     * <p>The path of the client certificate when the source database is connected over SSL.</p>
     * <blockquote>
     * <p>This feature is not supported. Do not specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SrcClientCertOssUrl")
    public String srcClientCertOssUrl;

    /**
     * <p>The path of the client certificate private key when the source database is connected over SSL.</p>
     * <blockquote>
     * <p>This feature is not supported. Do not specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SrcClientKeyOssUrl")
    public String srcClientKeyOssUrl;

    /**
     * <p>The password of the client certificate private key when the source database is connected over SSL.</p>
     * <blockquote>
     * <p>This feature is not supported. Do not specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SrcClientPassword")
    public String srcClientPassword;

    /**
     * <p>The primary vSwitch at the source end of the VPC NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SrcPrimaryVswId")
    public String srcPrimaryVswId;

    /**
     * <p>The secondary vSwitch at the source end of the VPC NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SrcSecondaryVswId")
    public String srcSecondaryVswId;

    /**
     * <p>Specifies whether to perform schema migration or initial schema synchronization. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes. This is the default value.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * <blockquote>
     * <p>If <strong>JobType</strong> is set to <strong>CHECK</strong>, you can only set this parameter to <strong>false</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("StructureInitialization")
    public Boolean structureInitialization;

    /**
     * <p>The synchronization direction. Valid values:</p>
     * <ul>
     * <li><strong>Forward</strong>: Forward.</li>
     * <li><strong>Reverse</strong>: Reverse.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Default value: <strong>Forward</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>This parameter takes effect only when the synchronization topology of the synchronization task is two-way and this parameter is set to <strong>Reverse</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Forward</p>
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

    public ConfigureDtsJobAdvanceRequest setDestClientCertOssUrl(String destClientCertOssUrl) {
        this.destClientCertOssUrl = destClientCertOssUrl;
        return this;
    }
    public String getDestClientCertOssUrl() {
        return this.destClientCertOssUrl;
    }

    public ConfigureDtsJobAdvanceRequest setDestClientKeyOssUrl(String destClientKeyOssUrl) {
        this.destClientKeyOssUrl = destClientKeyOssUrl;
        return this;
    }
    public String getDestClientKeyOssUrl() {
        return this.destClientKeyOssUrl;
    }

    public ConfigureDtsJobAdvanceRequest setDestClientPassword(String destClientPassword) {
        this.destClientPassword = destClientPassword;
        return this;
    }
    public String getDestClientPassword() {
        return this.destClientPassword;
    }

    public ConfigureDtsJobAdvanceRequest setDestPrimaryVswId(String destPrimaryVswId) {
        this.destPrimaryVswId = destPrimaryVswId;
        return this;
    }
    public String getDestPrimaryVswId() {
        return this.destPrimaryVswId;
    }

    public ConfigureDtsJobAdvanceRequest setDestSecondaryVswId(String destSecondaryVswId) {
        this.destSecondaryVswId = destSecondaryVswId;
        return this;
    }
    public String getDestSecondaryVswId() {
        return this.destSecondaryVswId;
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

    public ConfigureDtsJobAdvanceRequest setSrcClientCertOssUrl(String srcClientCertOssUrl) {
        this.srcClientCertOssUrl = srcClientCertOssUrl;
        return this;
    }
    public String getSrcClientCertOssUrl() {
        return this.srcClientCertOssUrl;
    }

    public ConfigureDtsJobAdvanceRequest setSrcClientKeyOssUrl(String srcClientKeyOssUrl) {
        this.srcClientKeyOssUrl = srcClientKeyOssUrl;
        return this;
    }
    public String getSrcClientKeyOssUrl() {
        return this.srcClientKeyOssUrl;
    }

    public ConfigureDtsJobAdvanceRequest setSrcClientPassword(String srcClientPassword) {
        this.srcClientPassword = srcClientPassword;
        return this;
    }
    public String getSrcClientPassword() {
        return this.srcClientPassword;
    }

    public ConfigureDtsJobAdvanceRequest setSrcPrimaryVswId(String srcPrimaryVswId) {
        this.srcPrimaryVswId = srcPrimaryVswId;
        return this;
    }
    public String getSrcPrimaryVswId() {
        return this.srcPrimaryVswId;
    }

    public ConfigureDtsJobAdvanceRequest setSrcSecondaryVswId(String srcSecondaryVswId) {
        this.srcSecondaryVswId = srcSecondaryVswId;
        return this;
    }
    public String getSrcSecondaryVswId() {
        return this.srcSecondaryVswId;
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
