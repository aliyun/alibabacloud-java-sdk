// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSubscriptionRequest extends TeaModel {
    /**
     * <p>The UNIX timestamp that represents the start time of change tracking. Unit: seconds.</p>
     * <br>
     * <p>>  You can use a search engine to obtain a UNIX timestamp converter.</p>
     */
    @NameInMap("Checkpoint")
    public String checkpoint;

    /**
     * <p>The objects for which you want to track data changes. The value must be a JSON string. For more information, see [Objects of DTS tasks](~~209545~~).</p>
     */
    @NameInMap("DbList")
    public String dbList;

    /**
     * <p>The ID of the DTS dedicated cluster on which the change tracking task is scheduled to run.</p>
     */
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    /**
     * <p>Specifies whether to monitor the task latency. Valid values:</p>
     * <br>
     * <p>*   **true**: monitors the task latency.</p>
     * <p>*   **false**: does not monitor the task latency.</p>
     */
    @NameInMap("DelayNotice")
    public Boolean delayNotice;

    /**
     * <p>The mobile numbers to which latency-related alerts are sent. Separate multiple mobile numbers with commas (,).</p>
     * <br>
     * <p>> </p>
     * <p>*   This parameter is available only for users of the China site (aliyun.com). Only mobile numbers in the Chinese mainland are supported. You can specify up to 10 mobile numbers.</p>
     * <p>*   Users of the international site (alibabacloud.com) cannot receive alerts by using mobile phones, but can [configure alert rules for DTS tasks in the CloudMonitor console](~~175876~~).</p>
     */
    @NameInMap("DelayPhone")
    public String delayPhone;

    /**
     * <p>The threshold for triggering latency-related alerts. Unit: seconds. The value must be an integer. You can set the threshold based on your business needs. To prevent jitters caused by network and database overloads, we recommend that you set the threshold to more than 10 seconds.</p>
     * <br>
     * <p>>  If the **DelayNotice** parameter is set to **true**, this parameter is required.</p>
     */
    @NameInMap("DelayRuleTime")
    public Long delayRuleTime;

    @NameInMap("DtsBisLabel")
    public String dtsBisLabel;

    /**
     * <p>The ID of the change tracking instance. You can call the [DescribeDtsJobs](~~209702~~) operation to query the instance ID.</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The ID of the change tracking task. You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The name of the change tracking task.</p>
     * <br>
     * <p>>  We recommend that you specify a descriptive name for easy identification. You do not need to use a unique name.</p>
     */
    @NameInMap("DtsJobName")
    public String dtsJobName;

    /**
     * <p>Specifies whether to monitor the task status. Valid values:</p>
     * <br>
     * <p>*   **true**: monitors the task status.</p>
     * <p>*   **false**: does not monitor the task status.</p>
     */
    @NameInMap("ErrorNotice")
    public Boolean errorNotice;

    /**
     * <p>The mobile numbers to which status-related alerts are sent. Separate multiple mobile numbers with commas (,).</p>
     * <br>
     * <p>> </p>
     * <p>*   This parameter is available only for users of the China site (aliyun.com). Only mobile numbers in the Chinese mainland are supported. You can specify up to 10 mobile numbers.</p>
     * <p>*   Users of the international site (alibabacloud.com) cannot receive alerts by using mobile phones, but can [configure alert rules for DTS tasks in the CloudMonitor console](~~175876~~).</p>
     */
    @NameInMap("ErrorPhone")
    public String errorPhone;

    /**
     * <p>The ID of the region in which the Data Transmission Service (DTS) instance resides. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The reserved parameter of DTS. The value must be a JSON string. You can specify this parameter to add more configurations of the source or destination database to the DTS task. For example, you can specify the data storage format of the destination Kafka database and the ID of the CEN instance. For more information, see [MigrationReserved](~~176470~~).</p>
     */
    @NameInMap("Reserve")
    public String reserve;

    /**
     * <p>The name of the source database.</p>
     */
    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    /**
     * <p>The engine of the source database. Valid values: **MySQL**, **PostgreSQL**, and **Oracle**.</p>
     * <br>
     * <p>>  If the source database is a self-managed database, you must specify this parameter.</p>
     */
    @NameInMap("SourceEndpointEngineName")
    public String sourceEndpointEngineName;

    /**
     * <p>The endpoint of the source database.</p>
     * <br>
     * <p>>  This parameter is required only when the source database is a self-managed database.</p>
     */
    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    /**
     * <p>The ID of the source database.</p>
     * <br>
     * <p>>  This parameter is required only when the source database is an ApsaraDB RDS for MySQL instance, a PolarDB-X 1.0 instance, or a PolarDB for MySQL cluster.</p>
     */
    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    /**
     * <p>The type of the source database. Valid values:</p>
     * <br>
     * <p>*   **RDS**: ApsaraDB RDS for MySQL instance</p>
     * <p>*   **PolarDB**: PolarDB for MySQL cluster</p>
     * <p>*   **DRDS**: PolarDB-X 1.0 instance</p>
     * <p>*   **LocalInstance**: self-managed database with a public IP address</p>
     * <p>*   **ECS**: self-managed database hosted on an Elastic Compute Service (ECS) instance</p>
     * <p>*   **Express**: self-managed database connected over Express Connect</p>
     * <p>*   **CEN**: self-managed database connected over Cloud Enterprise Network (CEN)</p>
     * <p>*   **dg**: self-managed database connected over Database Gateway</p>
     */
    @NameInMap("SourceEndpointInstanceType")
    public String sourceEndpointInstanceType;

    /**
     * <p>The system ID (SID) of the Oracle database.</p>
     * <br>
     * <p>>  This parameter is required only when the source database is a self-managed Oracle database and is not deployed in the Real Application Clusters (RAC) architecture.</p>
     */
    @NameInMap("SourceEndpointOracleSID")
    public String sourceEndpointOracleSID;

    /**
     * <p>The ID of the Alibaba Cloud account to which the source database belongs.</p>
     * <br>
     * <p>>  This parameter is required only when you track data changes across different Alibaba Cloud accounts.</p>
     */
    @NameInMap("SourceEndpointOwnerID")
    public String sourceEndpointOwnerID;

    /**
     * <p>The password of the account that is used to connect to the source database.</p>
     */
    @NameInMap("SourceEndpointPassword")
    public String sourceEndpointPassword;

    /**
     * <p>The service port number of the source database.</p>
     * <br>
     * <p>>  This parameter is required only when the source database is a self-managed database.</p>
     */
    @NameInMap("SourceEndpointPort")
    public String sourceEndpointPort;

    /**
     * <p>The ID of the region in which the source database resides. For more information, see [List of supported regions](~~141033~~).</p>
     * <br>
     * <p>>  If the source database is a self-managed database with a public IP address, you can set the value of this parameter to **cn-hangzhou** or the ID of the region that is closest to the region in which the self-managed database resides.</p>
     */
    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    /**
     * <p>The RAM role that is authorized to access the source database. This parameter is required if the source database does not belong to the Alibaba Cloud account that you use to configure the change tracking task. In this case, you must authorize the Alibaba Cloud account to access the source database by using a RAM role.</p>
     * <br>
     * <p>>  For more information about the permissions that are required for the RAM role and how to grant the permissions to the RAM role, see [Configure RAM authorization for cross-account data migration and synchronization](~~48468~~).</p>
     */
    @NameInMap("SourceEndpointRole")
    public String sourceEndpointRole;

    /**
     * <p>The username of the account that is used to connect to the source database.</p>
     * <br>
     * <p>>  The permissions that are required for the database account vary with the change tracking scenario. For more information, see [Prepare the source database account for change tracking](~~212653~~).</p>
     */
    @NameInMap("SourceEndpointUserName")
    public String sourceEndpointUserName;

    /**
     * <p>Specifies whether to track DDL statements. Default value: true. Valid values:</p>
     * <br>
     * <p>*   **true**: tracks DDL statements.</p>
     * <p>*   **false**: does not track DDL statements.</p>
     */
    @NameInMap("SubscriptionDataTypeDDL")
    public Boolean subscriptionDataTypeDDL;

    /**
     * <p>Specifies whether to track DML statements. Default value: true. Valid values:</p>
     * <br>
     * <p>*   **true**: tracks DML statements.</p>
     * <p>*   **false**: does not track DML statements.</p>
     */
    @NameInMap("SubscriptionDataTypeDML")
    public Boolean subscriptionDataTypeDML;

    /**
     * <p>The network type of the change tracking task. Set the value to **vpc**. A value of vpc indicates the Virtual Private Cloud (VPC) network type.</p>
     * <br>
     * <p>> </p>
     * <p>*   To use the new version of the change tracking feature, you must specify the SubscriptionInstanceNetworkType parameter. You must also specify the **SubscriptionInstanceVPCId** and **SubscriptionInstanceVSwitchID** parameters. If you do not specify the SubscriptionInstanceNetworkType parameter, the previous version of the change tracking feature is used.</p>
     * <p>*   The previous version of the change tracking feature supports self-managed MySQL databases, ApsaraDB RDS for MySQL instances, and PolarDB-X 1.0 instances. The new version of the change tracking feature supports self-managed MySQL databases, ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and Oracle databases.</p>
     */
    @NameInMap("SubscriptionInstanceNetworkType")
    public String subscriptionInstanceNetworkType;

    /**
     * <p>The ID of the VPC in which the change tracking instance is deployed.</p>
     * <br>
     * <p>>  This parameter is required only when the **SubscriptionInstanceNetworkType** parameter is set to **vpc**.</p>
     */
    @NameInMap("SubscriptionInstanceVPCId")
    public String subscriptionInstanceVPCId;

    /**
     * <p>The ID of the vSwitch in the specified VPC.</p>
     * <br>
     * <p>>  This parameter is required only when the **SubscriptionInstanceNetworkType** parameter is set to **vpc**.</p>
     */
    @NameInMap("SubscriptionInstanceVSwitchId")
    public String subscriptionInstanceVSwitchId;

    public static ConfigureSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSubscriptionRequest self = new ConfigureSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureSubscriptionRequest setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public String getCheckpoint() {
        return this.checkpoint;
    }

    public ConfigureSubscriptionRequest setDbList(String dbList) {
        this.dbList = dbList;
        return this;
    }
    public String getDbList() {
        return this.dbList;
    }

    public ConfigureSubscriptionRequest setDedicatedClusterId(String dedicatedClusterId) {
        this.dedicatedClusterId = dedicatedClusterId;
        return this;
    }
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    public ConfigureSubscriptionRequest setDelayNotice(Boolean delayNotice) {
        this.delayNotice = delayNotice;
        return this;
    }
    public Boolean getDelayNotice() {
        return this.delayNotice;
    }

    public ConfigureSubscriptionRequest setDelayPhone(String delayPhone) {
        this.delayPhone = delayPhone;
        return this;
    }
    public String getDelayPhone() {
        return this.delayPhone;
    }

    public ConfigureSubscriptionRequest setDelayRuleTime(Long delayRuleTime) {
        this.delayRuleTime = delayRuleTime;
        return this;
    }
    public Long getDelayRuleTime() {
        return this.delayRuleTime;
    }

    public ConfigureSubscriptionRequest setDtsBisLabel(String dtsBisLabel) {
        this.dtsBisLabel = dtsBisLabel;
        return this;
    }
    public String getDtsBisLabel() {
        return this.dtsBisLabel;
    }

    public ConfigureSubscriptionRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ConfigureSubscriptionRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ConfigureSubscriptionRequest setDtsJobName(String dtsJobName) {
        this.dtsJobName = dtsJobName;
        return this;
    }
    public String getDtsJobName() {
        return this.dtsJobName;
    }

    public ConfigureSubscriptionRequest setErrorNotice(Boolean errorNotice) {
        this.errorNotice = errorNotice;
        return this;
    }
    public Boolean getErrorNotice() {
        return this.errorNotice;
    }

    public ConfigureSubscriptionRequest setErrorPhone(String errorPhone) {
        this.errorPhone = errorPhone;
        return this;
    }
    public String getErrorPhone() {
        return this.errorPhone;
    }

    public ConfigureSubscriptionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigureSubscriptionRequest setReserve(String reserve) {
        this.reserve = reserve;
        return this;
    }
    public String getReserve() {
        return this.reserve;
    }

    public ConfigureSubscriptionRequest setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
        this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
        return this;
    }
    public String getSourceEndpointDatabaseName() {
        return this.sourceEndpointDatabaseName;
    }

    public ConfigureSubscriptionRequest setSourceEndpointEngineName(String sourceEndpointEngineName) {
        this.sourceEndpointEngineName = sourceEndpointEngineName;
        return this;
    }
    public String getSourceEndpointEngineName() {
        return this.sourceEndpointEngineName;
    }

    public ConfigureSubscriptionRequest setSourceEndpointIP(String sourceEndpointIP) {
        this.sourceEndpointIP = sourceEndpointIP;
        return this;
    }
    public String getSourceEndpointIP() {
        return this.sourceEndpointIP;
    }

    public ConfigureSubscriptionRequest setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
        this.sourceEndpointInstanceID = sourceEndpointInstanceID;
        return this;
    }
    public String getSourceEndpointInstanceID() {
        return this.sourceEndpointInstanceID;
    }

    public ConfigureSubscriptionRequest setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
        this.sourceEndpointInstanceType = sourceEndpointInstanceType;
        return this;
    }
    public String getSourceEndpointInstanceType() {
        return this.sourceEndpointInstanceType;
    }

    public ConfigureSubscriptionRequest setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
        this.sourceEndpointOracleSID = sourceEndpointOracleSID;
        return this;
    }
    public String getSourceEndpointOracleSID() {
        return this.sourceEndpointOracleSID;
    }

    public ConfigureSubscriptionRequest setSourceEndpointOwnerID(String sourceEndpointOwnerID) {
        this.sourceEndpointOwnerID = sourceEndpointOwnerID;
        return this;
    }
    public String getSourceEndpointOwnerID() {
        return this.sourceEndpointOwnerID;
    }

    public ConfigureSubscriptionRequest setSourceEndpointPassword(String sourceEndpointPassword) {
        this.sourceEndpointPassword = sourceEndpointPassword;
        return this;
    }
    public String getSourceEndpointPassword() {
        return this.sourceEndpointPassword;
    }

    public ConfigureSubscriptionRequest setSourceEndpointPort(String sourceEndpointPort) {
        this.sourceEndpointPort = sourceEndpointPort;
        return this;
    }
    public String getSourceEndpointPort() {
        return this.sourceEndpointPort;
    }

    public ConfigureSubscriptionRequest setSourceEndpointRegion(String sourceEndpointRegion) {
        this.sourceEndpointRegion = sourceEndpointRegion;
        return this;
    }
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    public ConfigureSubscriptionRequest setSourceEndpointRole(String sourceEndpointRole) {
        this.sourceEndpointRole = sourceEndpointRole;
        return this;
    }
    public String getSourceEndpointRole() {
        return this.sourceEndpointRole;
    }

    public ConfigureSubscriptionRequest setSourceEndpointUserName(String sourceEndpointUserName) {
        this.sourceEndpointUserName = sourceEndpointUserName;
        return this;
    }
    public String getSourceEndpointUserName() {
        return this.sourceEndpointUserName;
    }

    public ConfigureSubscriptionRequest setSubscriptionDataTypeDDL(Boolean subscriptionDataTypeDDL) {
        this.subscriptionDataTypeDDL = subscriptionDataTypeDDL;
        return this;
    }
    public Boolean getSubscriptionDataTypeDDL() {
        return this.subscriptionDataTypeDDL;
    }

    public ConfigureSubscriptionRequest setSubscriptionDataTypeDML(Boolean subscriptionDataTypeDML) {
        this.subscriptionDataTypeDML = subscriptionDataTypeDML;
        return this;
    }
    public Boolean getSubscriptionDataTypeDML() {
        return this.subscriptionDataTypeDML;
    }

    public ConfigureSubscriptionRequest setSubscriptionInstanceNetworkType(String subscriptionInstanceNetworkType) {
        this.subscriptionInstanceNetworkType = subscriptionInstanceNetworkType;
        return this;
    }
    public String getSubscriptionInstanceNetworkType() {
        return this.subscriptionInstanceNetworkType;
    }

    public ConfigureSubscriptionRequest setSubscriptionInstanceVPCId(String subscriptionInstanceVPCId) {
        this.subscriptionInstanceVPCId = subscriptionInstanceVPCId;
        return this;
    }
    public String getSubscriptionInstanceVPCId() {
        return this.subscriptionInstanceVPCId;
    }

    public ConfigureSubscriptionRequest setSubscriptionInstanceVSwitchId(String subscriptionInstanceVSwitchId) {
        this.subscriptionInstanceVSwitchId = subscriptionInstanceVSwitchId;
        return this;
    }
    public String getSubscriptionInstanceVSwitchId() {
        return this.subscriptionInstanceVSwitchId;
    }

}
