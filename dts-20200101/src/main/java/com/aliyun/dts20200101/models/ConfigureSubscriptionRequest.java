// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSubscriptionRequest extends TeaModel {
    /**
     * <p>The UNIX timestamp that represents the start time of change tracking. Unit: seconds.</p>
     * <blockquote>
     * <p> You can use a search engine to obtain a UNIX timestamp converter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1616902385</p>
     */
    @NameInMap("Checkpoint")
    public String checkpoint;

    /**
     * <p>The objects for which you want to track data changes. The value must be a JSON string. For more information, see <a href="https://help.aliyun.com/document_detail/209545.html">Objects of DTS tasks</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dtstest&quot;:{&quot;name&quot;:&quot;dtstest&quot;,&quot;all&quot;:true}}</p>
     */
    @NameInMap("DbList")
    public String dbList;

    /**
     * <p>The ID of the DTS dedicated cluster on which the change tracking task is scheduled to run.</p>
     * 
     * <strong>example:</strong>
     * <p>dtscluster_atyl3b5214uk***</p>
     */
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    /**
     * <p>Specifies whether to monitor the task latency. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: monitors the task latency.</li>
     * <li><strong>false</strong>: does not monitor the task latency.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DelayNotice")
    public Boolean delayNotice;

    /**
     * <p>The mobile numbers to which latency-related alerts are sent. Separate multiple mobile numbers with commas (,).</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>This parameter is available only for users of the China site (aliyun.com). Only mobile numbers in the Chinese mainland are supported. You can specify up to 10 mobile numbers.</li>
     * <li>Users of the international site (alibabacloud.com) cannot receive alerts by using mobile phones, but can <a href="https://help.aliyun.com/document_detail/175876.html">configure alert rules for DTS tasks in the CloudMonitor console</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1361234****,1371234****</p>
     */
    @NameInMap("DelayPhone")
    public String delayPhone;

    /**
     * <p>The threshold for triggering latency-related alerts. Unit: seconds. The value must be an integer. You can set the threshold based on your business needs. To prevent jitters caused by network and database overloads, we recommend that you set the threshold to more than 10 seconds.</p>
     * <blockquote>
     * <p> If the <strong>DelayNotice</strong> parameter is set to <strong>true</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("DelayRuleTime")
    public Long delayRuleTime;

    @NameInMap("DtsBisLabel")
    public String dtsBisLabel;

    /**
     * <p>The ID of the change tracking instance. You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsy0zz3t13h7d****</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The ID of the change tracking task. You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>y0zz3t13h7d****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The name of the change tracking task.</p>
     * <blockquote>
     * <p> We recommend that you specify a descriptive name for easy identification. You do not need to use a unique name.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DtsJobName")
    public String dtsJobName;

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
    @NameInMap("ErrorNotice")
    public Boolean errorNotice;

    /**
     * <p>The mobile numbers to which status-related alerts are sent. Separate multiple mobile numbers with commas (,).</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>This parameter is available only for users of the China site (aliyun.com). Only mobile numbers in the Chinese mainland are supported. You can specify up to 10 mobile numbers.</li>
     * <li>Users of the international site (alibabacloud.com) cannot receive alerts by using mobile phones, but can <a href="https://help.aliyun.com/document_detail/175876.html">configure alert rules for DTS tasks in the CloudMonitor console</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1361234****,1371234****</p>
     */
    @NameInMap("ErrorPhone")
    public String errorPhone;

    @NameInMap("MaxDu")
    public Double maxDu;

    @NameInMap("MinDu")
    public Double minDu;

    /**
     * <p>The ID of the region in which the Data Transmission Service (DTS) instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The reserved parameter of DTS. The value must be a JSON string. You can specify this parameter to add more configurations of the source or destination database to the DTS task. For example, you can specify the data storage format of the destination Kafka database and the ID of the CEN instance. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{      &quot;srcInstanceId&quot;: &quot;cen-9kqshqum*******&quot;  }</p>
     */
    @NameInMap("Reserve")
    public String reserve;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the source database.</p>
     * 
     * <strong>example:</strong>
     * <p>dtstestdata</p>
     */
    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    /**
     * <p>The engine of the source database. Valid values: <strong>MySQL</strong>, <strong>PostgreSQL</strong>, and <strong>Oracle</strong>.</p>
     * <blockquote>
     * <p> If the source database is a self-managed database, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PostgreSQL</p>
     */
    @NameInMap("SourceEndpointEngineName")
    public String sourceEndpointEngineName;

    /**
     * <p>The endpoint of the source database.</p>
     * <blockquote>
     * <p> This parameter is required only when the source database is a self-managed database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.16.8*.***</p>
     */
    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    /**
     * <p>The ID of the source database.</p>
     * <blockquote>
     * <p> This parameter is required only when the source database is an ApsaraDB RDS for MySQL instance, a PolarDB-X 1.0 instance, or a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1zc3iyqe3qw****</p>
     */
    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    /**
     * <p>The type of the source database. Valid values:</p>
     * <ul>
     * <li><strong>RDS</strong>: ApsaraDB RDS for MySQL instance</li>
     * <li><strong>PolarDB</strong>: PolarDB for MySQL cluster</li>
     * <li><strong>DRDS</strong>: PolarDB-X 1.0 instance</li>
     * <li><strong>LocalInstance</strong>: self-managed database with a public IP address</li>
     * <li><strong>ECS</strong>: self-managed database hosted on an Elastic Compute Service (ECS) instance</li>
     * <li><strong>Express</strong>: self-managed database connected over Express Connect</li>
     * <li><strong>CEN</strong>: self-managed database connected over Cloud Enterprise Network (CEN)</li>
     * <li><strong>dg</strong>: self-managed database connected over Database Gateway</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("SourceEndpointInstanceType")
    public String sourceEndpointInstanceType;

    /**
     * <p>The system ID (SID) of the Oracle database.</p>
     * <blockquote>
     * <p> This parameter is required only when the source database is a self-managed Oracle database and is not deployed in the Real Application Clusters (RAC) architecture.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testsid</p>
     */
    @NameInMap("SourceEndpointOracleSID")
    public String sourceEndpointOracleSID;

    /**
     * <p>The ID of the Alibaba Cloud account to which the source database belongs.</p>
     * <blockquote>
     * <p> This parameter is required only when you track data changes across different Alibaba Cloud accounts.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>140692647406****</p>
     */
    @NameInMap("SourceEndpointOwnerID")
    public String sourceEndpointOwnerID;

    /**
     * <p>The password of the account that is used to connect to the source database.</p>
     * 
     * <strong>example:</strong>
     * <p>Test123456</p>
     */
    @NameInMap("SourceEndpointPassword")
    public String sourceEndpointPassword;

    /**
     * <p>The service port number of the source database.</p>
     * <blockquote>
     * <p> This parameter is required only when the source database is a self-managed database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("SourceEndpointPort")
    public String sourceEndpointPort;

    /**
     * <p>The ID of the region in which the source database resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * <blockquote>
     * <p> If the source database is a self-managed database with a public IP address, you can set the value of this parameter to <strong>cn-hangzhou</strong> or the ID of the region that is closest to the region in which the self-managed database resides.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    /**
     * <p>The RAM role that is authorized to access the source database. This parameter is required if the source database does not belong to the Alibaba Cloud account that you use to configure the change tracking task. In this case, you must authorize the Alibaba Cloud account to access the source database by using a RAM role.</p>
     * <blockquote>
     * <p> For more information about the permissions that are required for the RAM role and how to grant the permissions to the RAM role, see <a href="https://help.aliyun.com/document_detail/48468.html">Configure RAM authorization for cross-account data migration and synchronization</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ram-for-dts</p>
     */
    @NameInMap("SourceEndpointRole")
    public String sourceEndpointRole;

    /**
     * <p>The username of the account that is used to connect to the source database.</p>
     * <blockquote>
     * <p> The permissions that are required for the database account vary with the change tracking scenario. For more information, see <a href="https://help.aliyun.com/document_detail/212653.html">Prepare the source database account for change tracking</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
     */
    @NameInMap("SourceEndpointUserName")
    public String sourceEndpointUserName;

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
     * <p>Specifies whether to track DDL statements. Default value: true. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: tracks DDL statements.</li>
     * <li><strong>false</strong>: does not track DDL statements.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SubscriptionDataTypeDDL")
    public Boolean subscriptionDataTypeDDL;

    /**
     * <p>Specifies whether to track DML statements. Default value: true. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: tracks DML statements.</li>
     * <li><strong>false</strong>: does not track DML statements.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SubscriptionDataTypeDML")
    public Boolean subscriptionDataTypeDML;

    /**
     * <p>The network type of the change tracking task. Set the value to <strong>vpc</strong>. A value of vpc indicates the Virtual Private Cloud (VPC) network type.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>To use the new version of the change tracking feature, you must specify the SubscriptionInstanceNetworkType parameter. You must also specify the <strong>SubscriptionInstanceVPCId</strong> and <strong>SubscriptionInstanceVSwitchID</strong> parameters. If you do not specify the SubscriptionInstanceNetworkType parameter, the previous version of the change tracking feature is used.</li>
     * <li>The previous version of the change tracking feature supports self-managed MySQL databases, ApsaraDB RDS for MySQL instances, and PolarDB-X 1.0 instances. The new version of the change tracking feature supports self-managed MySQL databases, ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and Oracle databases.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("SubscriptionInstanceNetworkType")
    public String subscriptionInstanceNetworkType;

    /**
     * <p>The ID of the VPC in which the change tracking instance is deployed.</p>
     * <blockquote>
     * <p> This parameter is required only when the <strong>SubscriptionInstanceNetworkType</strong> parameter is set to <strong>vpc</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1vwnn14rqpyiczj****</p>
     */
    @NameInMap("SubscriptionInstanceVPCId")
    public String subscriptionInstanceVPCId;

    /**
     * <p>The ID of the vSwitch in the specified VPC.</p>
     * <blockquote>
     * <p> This parameter is required only when the <strong>SubscriptionInstanceNetworkType</strong> parameter is set to <strong>vpc</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp10df3mxae6lpmku****</p>
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

    public ConfigureSubscriptionRequest setMaxDu(Double maxDu) {
        this.maxDu = maxDu;
        return this;
    }
    public Double getMaxDu() {
        return this.maxDu;
    }

    public ConfigureSubscriptionRequest setMinDu(Double minDu) {
        this.minDu = minDu;
        return this;
    }
    public Double getMinDu() {
        return this.minDu;
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

    public ConfigureSubscriptionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public ConfigureSubscriptionRequest setSrcCaCertificateOssUrl(String srcCaCertificateOssUrl) {
        this.srcCaCertificateOssUrl = srcCaCertificateOssUrl;
        return this;
    }
    public String getSrcCaCertificateOssUrl() {
        return this.srcCaCertificateOssUrl;
    }

    public ConfigureSubscriptionRequest setSrcCaCertificatePassword(String srcCaCertificatePassword) {
        this.srcCaCertificatePassword = srcCaCertificatePassword;
        return this;
    }
    public String getSrcCaCertificatePassword() {
        return this.srcCaCertificatePassword;
    }

    public ConfigureSubscriptionRequest setSrcClientCertOssUrl(String srcClientCertOssUrl) {
        this.srcClientCertOssUrl = srcClientCertOssUrl;
        return this;
    }
    public String getSrcClientCertOssUrl() {
        return this.srcClientCertOssUrl;
    }

    public ConfigureSubscriptionRequest setSrcClientKeyOssUrl(String srcClientKeyOssUrl) {
        this.srcClientKeyOssUrl = srcClientKeyOssUrl;
        return this;
    }
    public String getSrcClientKeyOssUrl() {
        return this.srcClientKeyOssUrl;
    }

    public ConfigureSubscriptionRequest setSrcClientPassword(String srcClientPassword) {
        this.srcClientPassword = srcClientPassword;
        return this;
    }
    public String getSrcClientPassword() {
        return this.srcClientPassword;
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
