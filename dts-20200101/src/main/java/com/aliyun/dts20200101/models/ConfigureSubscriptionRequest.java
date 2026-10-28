// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSubscriptionRequest extends TeaModel {
    /**
     * <p>The start time of the change tracking task. The value is a UNIX timestamp in seconds.</p>
     * <blockquote>
     * <p>You can use a search engine to obtain a UNIX timestamp converter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1616902385</p>
     */
    @NameInMap("Checkpoint")
    public String checkpoint;

    /**
     * <p>The objects to be tracked. The value is a JSON string. For more information, see <a href="https://help.aliyun.com/document_detail/209545.html">Specify the objects to be migrated, synchronized, or tracked</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dtstest&quot;:{&quot;name&quot;:&quot;dtstest&quot;,&quot;all&quot;:true}}</p>
     */
    @NameInMap("DbList")
    public String dbList;

    /**
     * <p>The ID of the dedicated DTS cluster. This parameter is used to schedule the change tracking task to a specified dedicated DTS cluster.</p>
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
     * <li>This parameter is supported only on the China site. Only mobile phone numbers in the Chinese mainland are supported, and you can specify up to 10 mobile phone numbers.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The international site does not support mobile phone alerts. You can only <a href="https://help.aliyun.com/document_detail/175876.html">configure alert rules for DTS tasks by using CloudMonitor</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1361234****,1371234****</p>
     */
    @NameInMap("DelayPhone")
    public String delayPhone;

    /**
     * <p>The threshold for triggering a latency alert. The value must be an integer in seconds. You can set the threshold based on your business requirements. Set the threshold to 10 seconds or more to avoid latency fluctuations caused by network or database loads.</p>
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
     * <p>The environment tag of the DTS instance. Valid values:</p>
     * <ul>
     * <li><strong>normal</strong>: <strong>Normal</strong>.</li>
     * <li><strong>online</strong>: <strong>Online</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
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
     * <p>Specify a name that reflects the business purpose to facilitate subsequent identification. The name does not need to be unique.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL change tracking</p>
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
     * <li>This parameter is supported only on the China site. Only mobile phone numbers in the Chinese mainland are supported, and you can specify up to 10 mobile phone numbers.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The international site does not support mobile phone alerts. You can only <a href="https://help.aliyun.com/document_detail/175876.html">configure alert rules for DTS tasks by using CloudMonitor</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1361234****,1371234****</p>
     */
    @NameInMap("ErrorPhone")
    public String errorPhone;

    /**
     * <p>The maximum number of DUs for the serverless instance. Valid values: 2, 4, 8, and 16.
     * &lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This feature is not supported. Do not specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("MaxDu")
    public Double maxDu;

    /**
     * <p>The minimum number of DUs for the serverless instance. Valid values: 1, 2, 4, 8, and 16.
     * &lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This feature is not supported. Do not specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinDu")
    public Double minDu;

    /**
     * <p>The region where the change tracking instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The reserved parameters of DTS. The value is a JSON string. You can specify this parameter to supplement the information about the source and destination databases, such as the data storage format of the destination Kafka database and the CEN instance ID. For more information, see the metric description in <a href="https://help.aliyun.com/document_detail/176470.html">Reserve metric description</a>.</p>
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
     * <p>The name of the database to be tracked.</p>
     * 
     * <strong>example:</strong>
     * <p>dtstestdata</p>
     */
    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    /**
     * <p>The type of the source database. Valid values: <strong>MySQL</strong>, <strong>PostgreSQL</strong>, and <strong>Oracle</strong>.</p>
     * <blockquote>
     * <p>If the source database is a self-managed database, this parameter is required.</p>
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
     * <p>This parameter is available and required only when the source database is a self-managed database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.16.8*.***</p>
     */
    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    /**
     * <p>The source instance ID.</p>
     * <blockquote>
     * <p>This parameter is active and required only when the instance type of the source database is ApsaraDB RDS for MySQL, PolarDB-X 1.0, or PolarDB for MySQL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1zc3iyqe3qw****</p>
     */
    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    /**
     * <p>The instance type of the source database. Valid values:</p>
     * <ul>
     * <li><strong>RDS</strong>: ApsaraDB RDS.</li>
     * <li><strong>PolarDB</strong>: PolarDB for MySQL.</li>
     * <li><strong>DRDS</strong>: PolarDB-X 1.0.</li>
     * <li><strong>LocalInstance</strong>: A self-managed database with a public IP address.</li>
     * <li><strong>ECS</strong>: A self-managed database hosted on Elastic Compute Service (ECS).</li>
     * <li><strong>Express</strong>: A self-managed database connected over an Express Connect circuit.</li>
     * <li><strong>CEN</strong>: A self-managed database connected over a Cloud Enterprise Network (CEN) instance.</li>
     * <li><strong>dg</strong>: A self-managed database connected over a database gateway.</li>
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
     * <p>This parameter is available and required only when the source database is a self-managed Oracle database and the Oracle database is not a Real Application Cluster (RAC) instance.</p>
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
     * <p>This parameter is available and required only when you configure a change tracking task across Alibaba Cloud accounts.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>140692647406****</p>
     */
    @NameInMap("SourceEndpointOwnerID")
    public String sourceEndpointOwnerID;

    /**
     * <p>The password of the database account of the source instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Test123456</p>
     */
    @NameInMap("SourceEndpointPassword")
    public String sourceEndpointPassword;

    /**
     * <p>The service port number of the source database.</p>
     * <blockquote>
     * <p>This parameter is available and required only when the source database is a self-managed database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("SourceEndpointPort")
    public String sourceEndpointPort;

    /**
     * <p>The region where the source instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * <blockquote>
     * <p>If the source instance is a self-managed database with a public IP address, you can set this parameter to <strong>cn-hangzhou</strong> or the ID of the region that is closest to the self-managed database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    /**
     * <p>The RAM role that is authorized to access the source instance. If the source instance and the change tracking task belong to different Alibaba Cloud accounts, you must specify this parameter to authorize the Alibaba Cloud account that owns the change tracking task to access the source instance.</p>
     * <blockquote>
     * <p>For more information about the required permissions and authorization methods, see <a href="https://help.aliyun.com/document_detail/48468.html">Configure RAM authorization for cross-account data migration or synchronization</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ram-for-dts</p>
     */
    @NameInMap("SourceEndpointRole")
    public String sourceEndpointRole;

    /**
     * <p>The database account of the source instance.</p>
     * <blockquote>
     * <p>The required permissions vary based on the database to be tracked. For more information, see the permissions required for the database account in <a href="https://help.aliyun.com/document_detail/212653.html">Prepare the database accounts for change tracking</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
     */
    @NameInMap("SourceEndpointUserName")
    public String sourceEndpointUserName;

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
     * <p>The path of the private key of the client certificate when the source database is connected over SSL.</p>
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
     * <p>The password of the private key of the client certificate when the source database is connected over SSL.</p>
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
     * <p>Specifies whether to track DDL statements. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes. This is the default value.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SubscriptionDataTypeDDL")
    public Boolean subscriptionDataTypeDDL;

    /**
     * <p>Specifies whether to track DML statements. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes. This is the default value.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SubscriptionDataTypeDML")
    public Boolean subscriptionDataTypeDML;

    /**
     * <p>The network type of the change tracking task. Set the value to <strong>vpc</strong>, which specifies a virtual private cloud (VPC).</p>
     * <blockquote>
     * <ul>
     * <li>If you specify this parameter, the change tracking task is defined as a new version. You must also correctly set the <strong>SubscriptionInstanceVPCId</strong> and <strong>SubscriptionInstanceVSwitchID</strong> parameters. If you do not specify this parameter, the change tracking task is defined as a legacy version.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>Legacy change tracking tasks support tracking data from self-managed MySQL databases, ApsaraDB RDS for MySQL instances, and PolarDB-X 1.0 instances. New change tracking tasks support tracking data from self-managed MySQL databases, ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and Oracle databases.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("SubscriptionInstanceNetworkType")
    public String subscriptionInstanceNetworkType;

    /**
     * <p>The VPC ID of the change tracking instance.</p>
     * <blockquote>
     * <p>This parameter is available and required only when <strong>SubscriptionInstanceNetworkType</strong> is set to <strong>vpc</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1vwnn14rqpyiczj****</p>
     */
    @NameInMap("SubscriptionInstanceVPCId")
    public String subscriptionInstanceVPCId;

    /**
     * <p>The vSwitch ID of the change tracking instance.</p>
     * <blockquote>
     * <p>This parameter is available and required only when <strong>SubscriptionInstanceNetworkType</strong> is set to <strong>vpc</strong>.</p>
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
