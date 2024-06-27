// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureDtsJobAdvanceRequest extends TeaModel {
    /**
     * <p>The type of the task. Valid values:</p>
     * <ul>
     * <li><strong>MIGRATION</strong>: data migration task</li>
     * <li><strong>SYNC</strong>: data synchronization task</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1610540493</p>
     */
    @NameInMap("Checkpoint")
    public String checkpoint;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;fullCheckModel&quot;:1,&quot;fullCheckRatio&quot;:20,&quot;checkMaximumHourEnable&quot;:1,&quot;checkMaximumHour&quot;:1,&quot;fullCheckErrorNotice&quot;:true,&quot;fullCheckValidFailNotice&quot;:true,&quot;fullCheckNoticeValue&quot;:8,&quot;incrementalCheckErrorNotice&quot;:true,&quot;incrementalCheckValidFailNotice&quot;:true,&quot;incrementalCheckValidFailNoticeTimes&quot;:2,&quot;incrementalCheckValidFailNoticePeriod&quot;:1,&quot;incrementalCheckValidFailNoticeValue&quot;:1,&quot;incrementalCheckDelayNotice&quot;:true,&quot;incrementalCheckDelayNoticeTimes&quot;:2,&quot;incrementalCheckDelayNoticePeriod&quot;:1,&quot;incrementalCheckDelayNoticeValue&quot;:60,&quot;fullDataCheck&quot;:true,&quot;incrementalDataCheck&quot;:true,&quot;dataCheckNoticePhone&quot;:&quot;13126800****&quot;,&quot;dataCheckDbList&quot;:&quot;{&quot;dts&quot;:{&quot;name&quot;:&quot;dts&quot;,&quot;all&quot;:true}}&quot;}</p>
     */
    @NameInMap("DataCheckConfigure")
    public String dataCheckConfigure;

    /**
     * <p>The objects that you want to migrate or synchronize. The value is a JSON string. For more information, see <a href="https://help.aliyun.com/document_detail/209545.html">Objects of DTS tasks</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DataInitialization")
    public Boolean dataInitialization;

    /**
     * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to add more configurations of the source or destination instance to the DTS task. For example, you can specify the data storage format of the destination Kafka database and the ID of the CEN instance. For more information, see <a href="https://help.aliyun.com/document_detail/273111.html">Reserve</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DataSynchronization")
    public Boolean dataSynchronization;

    /**
     * <p>The start offset of incremental data migration or synchronization. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dtstest&quot;:{&quot;name&quot;:&quot;dtstest&quot;,&quot;all&quot;:true}}</p>
     */
    @NameInMap("DbList")
    public String dbList;

    /**
     * <p>The data verification task for a data migration or synchronization instance. The value is a JSON string that indicates parameter limits or alert configurations. For more information, see <a href="https://help.aliyun.com/document_detail/459023.html">DataCheckConfigure</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>dtscluster_atyl3b5214uk***</p>
     */
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    /**
     * <p>Specifies whether to monitor the task status. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: monitors the task status.</li>
     * <li><strong>false</strong>: does not monitor the task status.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DelayNotice")
    public Boolean delayNotice;

    /**
     * <p>Specifies whether to monitor the task latency. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: monitors the task latency.</li>
     * <li><strong>false</strong>: does not monitor the task latency.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1361234****,1371234****</p>
     */
    @NameInMap("DelayPhone")
    public String delayPhone;

    /**
     * <p>The mobile numbers that receive status-related alerts. Separate multiple mobile numbers with commas (,).</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>This parameter is available only for China site (aliyun.com) users. Only mobile numbers in the Chinese mainland are supported. Up to 10 mobile numbers can be specified.</li>
     * <li>International site (alibabacloud.com) users cannot receive alerts by using mobile phones, but can <a href="https://help.aliyun.com/document_detail/175876.html">set alert rules for DTS tasks in the CloudMonitor console</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("DelayRuleTime")
    public Long delayRuleTime;

    @NameInMap("DestCaCertificateOssUrl")
    public String destCaCertificateOssUrl;

    @NameInMap("DestCaCertificatePassword")
    public String destCaCertificatePassword;

    @NameInMap("DestClientCertOssUrl")
    public String destClientCertOssUrl;

    @NameInMap("DestClientKeyOssUrl")
    public String destClientKeyOssUrl;

    @NameInMap("DestClientPassword")
    public String destClientPassword;

    /**
     * <p>The password of the destination database account.</p>
     * <blockquote>
     * <p> If the destination database is a MaxCompute project, you must specify the AccessKey secret of your Alibaba Cloud account. For information about how to obtain your AccessKey pair, see <a href="https://help.aliyun.com/document_detail/116401.html">Create an AccessKey pair</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtstestdata</p>
     */
    @NameInMap("DestinationEndpointDataBaseName")
    public String destinationEndpointDataBaseName;

    /**
     * <p>The IP address of the destination instance.</p>
     * <blockquote>
     * <p> If the <strong>DestinationEndpointInstanceType</strong> parameter is set to <strong>OTHER</strong>, <strong>EXPRESS</strong>, <strong>DG</strong>, or <strong>CEN</strong>, this parameter is available and required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DestinationEndpointEngineName")
    public String destinationEndpointEngineName;

    /**
     * <p>The name of the database to which the objects migrated to the destination instance belong.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If the destination instance is a PolarDB for Oracle cluster, an AnalyticDB for PostgreSQL instance, a PostgreSQL database, a MaxCompute project, or a MongoDB database, this parameter is available and required.</li>
     * <li>If the destination instance is a MaxCompute project, you must specify the ID of the MaxCompute project.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>172.16.**.***</p>
     */
    @NameInMap("DestinationEndpointIP")
    public String destinationEndpointIP;

    /**
     * <p>The ID of the region in which the destination instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * <blockquote>
     * <p> If the destination instance is an Alibaba Cloud database instance, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1opxu1zkhn00gzv****</p>
     */
    @NameInMap("DestinationEndpointInstanceID")
    public String destinationEndpointInstanceID;

    /**
     * <p>The database engine of the destination instance. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong>: ApsaraDB RDS for MySQL instance or self-managed MySQL database</li>
     * <li><strong>MARIADB</strong>: ApsaraDB RDS for MariaDB instance</li>
     * <li><strong>PolarDB</strong>: PolarDB for MySQL cluster</li>
     * <li><strong>POLARDB_O</strong>: PolarDB for Oracle cluster</li>
     * <li><strong>POLARDBX10</strong>: PolarDB-X 1.0 instance</li>
     * <li><strong>POLARDBX20</strong>: PolarDB-X 2.0 instance</li>
     * <li><strong>ORACLE</strong>: self-managed Oracle database</li>
     * <li><strong>POSTGRESQL</strong>: ApsaraDB RDS for PostgreSQL instance or self-managed PostgreSQL database</li>
     * <li><strong>MSSQL</strong>: ApsaraDB RDS for SQL Server instance or self-managed SQL Server database</li>
     * <li><strong>ADS</strong>: AnalyticDB for MySQL V2.0 cluster</li>
     * <li><strong>ADB30</strong>: AnalyticDB for MySQL V3.0 cluster</li>
     * <li><strong>MONGODB</strong>: ApsaraDB for MongoDB instance or self-managed MongoDB database</li>
     * <li><strong>GREENPLUM</strong>: AnalyticDB for PostgreSQL instance</li>
     * <li><strong>KAFKA</strong>: Message Queue for Apache Kafka instance or self-managed Kafka cluster</li>
     * <li><strong>DATAHUB</strong>: DataHub project</li>
     * <li><strong>DB2</strong>: self-managed Db2 for LUW database</li>
     * <li><strong>AS400</strong>: self-managed Db2 for i database</li>
     * <li><strong>ODPS</strong>: MaxCompute project</li>
     * <li><strong>Tablestore</strong>: Tablestore instance</li>
     * <li><strong>ELK</strong>: Elasticsearch cluster</li>
     * <li><strong>REDIS</strong>: ApsaraDB for Redis instance or self-managed Redis database</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Default value: <strong>MYSQL</strong>.</li>
     * <li>If the DestinationEndpointEngineName parameter is set to <strong>KAFKA</strong>, <strong>MONGODB</strong>, or <strong>PolarDB</strong>, you must also specify the database information in the Reserve parameter. For more information, see <a href="https://help.aliyun.com/document_detail/273111.html">Reserve</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EXPRESS</p>
     */
    @NameInMap("DestinationEndpointInstanceType")
    public String destinationEndpointInstanceType;

    /**
     * <p>The ID of the data migration or synchronization task.</p>
     * <blockquote>
     * <p> You must specify at least one of the DtsJobId and <strong>DtsInstanceId</strong> parameters. You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the task ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testsid</p>
     */
    @NameInMap("DestinationEndpointOracleSID")
    public String destinationEndpointOracleSID;

    @NameInMap("DestinationEndpointOwnerID")
    public String destinationEndpointOwnerID;

    /**
     * <p>Specifies whether to perform full data migration or synchronization. Default value: true. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs full data migration or synchronization.</li>
     * <li><strong>false</strong>: does not perform full data migration or synchronization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Test123456</p>
     */
    @NameInMap("DestinationEndpointPassword")
    public String destinationEndpointPassword;

    /**
     * <p>The database account of the destination database.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>In most cases, this parameter is required.</li>
     * <li>The permissions that are required for the database account vary with the migration or synchronization scenario. For more information, see <a href="https://help.aliyun.com/document_detail/175878.html">Prepare the database accounts for data migration</a> or <a href="https://help.aliyun.com/document_detail/213152.html">Prepare the database accounts for data synchronization</a>.</li>
     * <li>If the destination database is a MaxCompute project, you must specify the AccessKey ID of your Alibaba Cloud account. For information about how to obtain your AccessKey pair, see <a href="https://help.aliyun.com/document_detail/116401.html">Create an AccessKey pair</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("DestinationEndpointPort")
    public String destinationEndpointPort;

    /**
     * <p>The database service port of the destination instance.</p>
     * <blockquote>
     * <p> If the destination instance is a self-managed database, this parameter is available and required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DestinationEndpointRegion")
    public String destinationEndpointRegion;

    @NameInMap("DestinationEndpointRole")
    public String destinationEndpointRole;

    /**
     * <p>Specifies whether to perform schema migration or synchronization. Default value: true. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs schema migration or synchronization.</li>
     * <li><strong>false</strong>: does not perform schema migration or synchronization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
     */
    @NameInMap("DestinationEndpointUserName")
    public String destinationEndpointUserName;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisasterRecoveryJob")
    public Boolean disasterRecoveryJob;

    @NameInMap("DtsBisLabel")
    public String dtsBisLabel;

    /**
     * <p>The threshold for triggering latency-related alerts. Unit: seconds. The value must be an integer. You can set the threshold based on your business needs. To prevent jitters caused by network and database overloads, we recommend that you set the threshold to more than 10 seconds.</p>
     * <blockquote>
     * <p> If the <strong>DelayNotice</strong> parameter is set to <strong>true</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtsk2gm967v16f****</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The mobile numbers that receive latency-related alerts. Separate multiple mobile numbers with commas (,).</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>This parameter is available only for China site (aliyun.com) users. Only mobile numbers in the Chinese mainland are supported. Up to 10 mobile numbers can be specified.</li>
     * <li>International site (alibabacloud.com) users cannot receive alerts by using mobile phones, but can <a href="https://help.aliyun.com/document_detail/175876.html">set alert rules for DTS tasks in the CloudMonitor console</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>k2gm967v16f****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The ID of the source instance.</p>
     * <p>If the source instance is an Alibaba Cloud database instance, you must specify the ID of the database instance. For example, if the source instance is an ApsaraDB RDS for MySQL instance, you must specify the ID of the ApsaraDB RDS for MySQL instance.</p>
     * <p>If the source instance is a self-managed database, the value of this parameter varies with the value of the <strong>SourceEndpointInstanceType</strong> parameter.****</p>
     * <ul>
     * <li>If the SourceEndpointInstanceType parameter is set to <strong>ECS</strong>, you must specify the ID of the ECS instance.</li>
     * <li>If the SourceEndpointInstanceType parameter is set to <strong>DG</strong>, you must specify the ID of the database gateway.</li>
     * <li>If the SourceEndpointInstanceType parameter is set to <strong>EXPRESS</strong> or <strong>CEN</strong>, you must specify the ID of the VPC that is connected to the source instance.</li>
     * </ul>
     * <blockquote>
     * <p> If the SourceEndpointInstanceType parameter is set to <strong>CEN</strong>, you must also specify the ID of the CEN instance in the Reserve parameter. For more information, see <a href="https://help.aliyun.com/document_detail/273111.html">Reserve</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rdsmysql_to_mysql</p>
     */
    @NameInMap("DtsJobName")
    public String dtsJobName;

    /**
     * <p>The ID of the region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ErrorNotice")
    public Boolean errorNotice;

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
     * <li>The value <strong>Reverse</strong> takes effect only if the topology of the data synchronization task is two-way synchronization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1361234****,1371234****</p>
     */
    @NameInMap("ErrorPhone")
    public String errorPhone;

    /**
     * <p>Specifies whether the instance is a disaster recovery instance.</p>
     * <ul>
     * <li><strong>true</strong>: The instance is a disaster recovery instance.</li>
     * <li><strong>false</strong>: The instance is not a disaster recovery instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="http://db-list-os-file.oss-cn-shanghai.aliyuncs.com/8e42_121852**********_79dd3aeabe2f43cdb">http://db-list-os-file.oss-cn-shanghai.aliyuncs.com/8e42_121852**********_79dd3aeabe2f43cdb</a>**************</p>
     */
    @NameInMap("FileOssUrl")
    public java.io.InputStream fileOssUrlObject;

    /**
     * <p>The ID of the data migration or synchronization instance.</p>
     * <blockquote>
     * <p> You must specify at least one of the <strong>DtsJobId</strong> and DtsInstanceId parameters. You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SYNC</p>
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
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The SID of the Oracle database.</p>
     * <blockquote>
     * <p> If the <strong>DestinationEndpointEngineName</strong> parameter is set to <strong>ORACLE</strong> and the <strong>Oracle</strong> database is deployed in a non-RAC architecture, this parameter is available and required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{      &quot;srcInstanceId&quot;: &quot;cen-9kqshqum*******&quot;  }</p>
     */
    @NameInMap("Reserve")
    public String reserve;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The password of the source database account.</p>
     * 
     * <strong>example:</strong>
     * <p>dtstestdatabase</p>
     */
    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    /**
     * <p>The IP address of the source instance.</p>
     * <blockquote>
     * <p> If the <strong>SourceEndpointInstanceType</strong> parameter is set to <strong>OTHER</strong>, <strong>EXPRESS</strong>, <strong>DG</strong>, or <strong>CEN</strong>, this parameter is available and required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MYSQL</p>
     */
    @NameInMap("SourceEndpointEngineName")
    public String sourceEndpointEngineName;

    /**
     * <p>The system ID (SID) of the Oracle database.</p>
     * <blockquote>
     * <p> If the <strong>SourceEndpointEngineName</strong> parameter is set to <strong>ORACLE</strong> and the <strong>Oracle</strong> database is deployed in an architecture that is not a Real Application Cluster (RAC), this parameter is available and required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.16.**.***</p>
     */
    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    /**
     * <p>The ID of the region in which the source instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * <blockquote>
     * <p> If the source instance is an Alibaba Cloud database instance, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1imrtn6fq7h****</p>
     */
    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    /**
     * <p>The database engine of the source instance. Valid values:</p>
     * <ul>
     * <li><strong>MYSQL</strong>: ApsaraDB RDS for MySQL instance or self-managed MySQL database</li>
     * <li><strong>MARIADB</strong>: ApsaraDB RDS for MariaDB instance</li>
     * <li><strong>PolarDB</strong>: PolarDB for MySQL cluster</li>
     * <li><strong>POLARDB_O</strong>: PolarDB for Oracle cluster</li>
     * <li><strong>POLARDBX10</strong>: PolarDB-X 1.0 instance</li>
     * <li><strong>POLARDBX20</strong>: PolarDB-X 2.0 instance</li>
     * <li><strong>ORACLE</strong>: self-managed Oracle database</li>
     * <li><strong>POSTGRESQL</strong>: ApsaraDB RDS for PostgreSQL instance or self-managed PostgreSQL database</li>
     * <li><strong>MSSQL</strong>: ApsaraDB RDS for SQL Server instance or self-managed SQL Server database</li>
     * <li><strong>MONGODB</strong>: ApsaraDB for MongoDB instance or self-managed MongoDB database</li>
     * <li><strong>DB2</strong>: self-managed Db2 for LUW database</li>
     * <li><strong>AS400</strong>: self-managed Db2 for i database</li>
     * <li><strong>DMSPOLARDB</strong>: DMS logical database</li>
     * <li><strong>HBASE</strong>: self-managed HBase database</li>
     * <li><strong>TERADATA</strong>: Teradata database</li>
     * <li><strong>TiDB</strong>: TiDB database</li>
     * <li><strong>REDIS</strong>: ApsaraDB for Redis instance or self-managed Redis database</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Default value: <strong>MYSQL</strong>.</li>
     * <li>If the SourceEndpointEngineName parameter is set to <strong>MONGODB</strong>, you must also specify the architecture type of the MongoDB database in the Reserve parameter. For more information, see <a href="https://help.aliyun.com/document_detail/273111.html">Reserve</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("SourceEndpointInstanceType")
    public String sourceEndpointInstanceType;

    /**
     * <p>The database account of the source database.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>In most cases, this parameter is required.</li>
     * <li>The permissions that are required for the database account vary with the migration or synchronization scenario. For more information, see <a href="https://help.aliyun.com/document_detail/175878.html">Prepare the database accounts for data migration</a> or <a href="https://help.aliyun.com/document_detail/213152.html">Prepare the database accounts for data synchronization</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testsid</p>
     */
    @NameInMap("SourceEndpointOracleSID")
    public String sourceEndpointOracleSID;

    /**
     * <p>The type of the destination instance. Valid values:</p>
     * <p><strong>Alibaba Cloud database instances</strong></p>
     * <ul>
     * <li><strong>RDS</strong>: ApsaraDB RDS for MySQL instance, ApsaraDB RDS for SQL Server instance, ApsaraDB RDS for PostgreSQL instance, or ApsaraDB RDS for MariaDB instance</li>
     * <li><strong>PolarDB</strong>: PolarDB for MySQL cluster</li>
     * <li><strong>POLARDBX10</strong>: PolarDB-X 1.0 instance</li>
     * <li><strong>POLARDBX20</strong>: PolarDB-X 2.0 instance</li>
     * <li><strong>REDIS</strong>: ApsaraDB for Redis instance</li>
     * <li><strong>ADS</strong>: AnalyticDB for MySQL V2.0 cluster or AnalyticDB for MySQL V3.0 cluster</li>
     * <li><strong>MONGODB</strong>: ApsaraDB for MongoDB instance</li>
     * <li><strong>GREENPLUM</strong>: AnalyticDB for PostgreSQL instance</li>
     * <li><strong>DATAHUB</strong>: DataHub project</li>
     * <li><strong>ELK</strong>: Elasticsearch cluster</li>
     * <li><strong>Tablestore</strong>: Tablestore instance</li>
     * <li><strong>ODPS</strong>: MaxCompute project</li>
     * </ul>
     * <p><strong>Self-managed databases</strong></p>
     * <ul>
     * <li><strong>OTHER</strong>: self-managed database with a public IP address</li>
     * <li><strong>ECS</strong>: self-managed database hosted on an ECS instance</li>
     * <li><strong>EXPRESS</strong>: self-managed database connected over Express Connect</li>
     * <li><strong>CEN</strong>: self-managed database connected over CEN</li>
     * <li><strong>DG</strong>: self-managed database connected over Database Gateway</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If the destination instance is a PolarDB for Oracle cluster, you must set this parameter to <strong>OTHER</strong> or <strong>EXPRESS</strong> because you can use a PolarDB for Oracle cluster only as a self-managed database connected over the Internet or Express Connect.</li>
     * <li>If the destination instance is a Message Queue for Apache Kafka instance, you must set this parameter to <strong>ECS</strong> or <strong>EXPRESS</strong> because you can use a Message Queue for Apache Kafka instance only as a self-managed database connected over ECS or Express Connect.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/176064.html">Supported databases</a>.</li>
     * <li>If the destination instance is a self-managed database, you must deploy the network environment for the database. For more information, see <a href="https://help.aliyun.com/document_detail/146958.html">Preparation overview</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>140692647406****</p>
     */
    @NameInMap("SourceEndpointOwnerID")
    public String sourceEndpointOwnerID;

    /**
     * <p>The name of the RAM role configured for the Alibaba Cloud account that owns the source instance.</p>
     * <blockquote>
     * <p> This parameter is required when you migrate or synchronize data across different Alibaba Cloud accounts. For information about the permissions and authorization methods of the RAM role, see <a href="https://help.aliyun.com/document_detail/48468.html">Configure RAM authorization for cross-account data migration and synchronization</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Test123456</p>
     */
    @NameInMap("SourceEndpointPassword")
    public String sourceEndpointPassword;

    /**
     * <p>The name of the database to which the objects to be migrated in the source instance belong.</p>
     * <blockquote>
     * <p> If the source instance is a PolarDB for Oracle cluster, a PostgreSQL database, or a MongoDB database, this parameter is available and required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("SourceEndpointPort")
    public String sourceEndpointPort;

    /**
     * <p>The database service port of the source instance.</p>
     * <blockquote>
     * <p> If the source instance is a self-managed database, this parameter is available and required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    /**
     * <p>The ID of the destination instance.</p>
     * <p>If the destination instance is an Alibaba Cloud database instance, you must specify the ID of the database instance. For example, if the destination instance is an ApsaraDB RDS for MySQL instance, you must specify the ID of the ApsaraDB RDS for MySQL instance.</p>
     * <p>If the destination instance is a self-managed database, the value of this parameter varies with the value of the <strong>DestinationEndpointInstanceType</strong> parameter.****</p>
     * <ul>
     * <li>If the DestinationEndpointInstanceType parameter is set to <strong>ECS</strong>, you must specify the ID of the ECS instance.</li>
     * <li>If the DestinationEndpointInstanceType parameter is set to <strong>DG</strong>, you must specify the ID of the database gateway.</li>
     * <li>If the DestinationEndpointInstanceType parameter is set to <strong>EXPRESS</strong> or <strong>CEN</strong>, you must specify the ID of the VPC that is connected to the source instance.</li>
     * </ul>
     * <blockquote>
     * <p> If the DestinationEndpointInstanceType parameter is set to <strong>CEN</strong>, you must also specify the ID of the CEN instance in the Reserve parameter. For more information, see <a href="https://help.aliyun.com/document_detail/273111.html">Reserve</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ram-for-dts</p>
     */
    @NameInMap("SourceEndpointRole")
    public String sourceEndpointRole;

    /**
     * <p>The ID of the Alibaba Cloud account to which the source instance belongs.</p>
     * <blockquote>
     * <p> You can specify this parameter to migrate or synchronize data across different Alibaba Cloud accounts. In this case, you must specify the <strong>SourceEndpointRole</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
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

    @NameInMap("SrcClientCertOssUrl")
    public String srcClientCertOssUrl;

    @NameInMap("SrcClientKeyOssUrl")
    public String srcClientKeyOssUrl;

    @NameInMap("SrcClientPassword")
    public String srcClientPassword;

    /**
     * <p>Specifies whether to perform incremental data migration or synchronization. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: does not perform incremental data migration or synchronization.</li>
     * <li><strong>true</strong>: performs incremental data migration or synchronization.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("StructureInitialization")
    public Boolean structureInitialization;

    /**
     * <p>The ID of the DTS dedicated cluster on which the task runs.</p>
     * <blockquote>
     * <p> If this parameter is specified, the task is scheduled to the specified DTS dedicated cluster.</p>
     * </blockquote>
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
