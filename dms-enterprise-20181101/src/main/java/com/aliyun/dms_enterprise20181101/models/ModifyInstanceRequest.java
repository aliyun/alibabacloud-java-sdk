// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ModifyInstanceRequest extends TeaModel {
    /**
     * <p>The name of the database link for cross-database queries.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This property must be specified when UseDsql is set to 1.</p>
     * </li>
     * <li><p>The name can contain only lowercase letters and underscores (_).</p>
     * </li>
     * <li><p>The name must be unique within a tenant.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dblink_test</p>
     */
    @NameInMap("DataLinkName")
    public String dataLinkName;

    /**
     * <p>The password of the account that is used to log on to the database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test***</p>
     */
    @NameInMap("DatabasePassword")
    public String databasePassword;

    /**
     * <p>The account that is used to log on to the database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>testsdb</p>
     */
    @NameInMap("DatabaseUser")
    public String databaseUser;

    /**
     * <p>The ID of the user who assumes the database administrator (DBA) role. You can call the <a href="https://help.aliyun.com/document_detail/141938.html">ListUsers</a> or <a href="https://help.aliyun.com/document_detail/141567.html">GetInstance</a> operation to obtain the value of this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>27****</p>
     */
    @NameInMap("DbaId")
    public Long dbaId;

    /**
     * <p>Specifies whether to enable lock-free schema change. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Disable Lock-free Schema Change.</li>
     * <li><strong>1</strong>: MySQL native online DDL first.</li>
     * <li><strong>2</strong>: DMS native online DDL first.</li>
     * </ul>
     * <blockquote>
     * <p>Supported databases include ApsaraDB RDS for MySQL, PolarDB for MySQL, ApsaraDB MyBase for MySQL, and third-party MySQL databases.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DdlOnline")
    public Integer ddlOnline;

    /**
     * <p>The ID of the ECS instance.</p>
     * <blockquote>
     * <p> This parameter is required if InstanceSource is set to ECS_OWN.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>i-2zei9gs1t7h8l7ac****</p>
     */
    @NameInMap("EcsInstanceId")
    public String ecsInstanceId;

    /**
     * <p>The region in which the ECS instance resides.</p>
     * <blockquote>
     * <p> This parameter is required if InstanceSource is set to RDS, ECS_OWN, or VPC_IDC.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("EcsRegion")
    public String ecsRegion;

    /**
     * <p>Specifies whether to enable Security Collaboration for the database instance. Valid values:</p>
     * <ul>
     * <li>Y: Enable.</li>
     * <li>N: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("EnableSellCommon")
    public String enableSellCommon;

    /**
     * <p>Specifies whether to enable sensitive data protection. Valid values:</p>
     * <ul>
     * <li>Y: Enable.</li>
     * <li>N: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("EnableSellSitd")
    public String enableSellSitd;

    /**
     * <p>Specifies whether to enable Stable Change for the database instance. Valid values:</p>
     * <ul>
     * <li>Y: Enable.</li>
     * <li>N: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NULL</p>
     */
    @NameInMap("EnableSellStable")
    public String enableSellStable;

    /**
     * <p>Specifies whether to enable the security hosting feature for the database instance. Valid values:</p>
     * <ul>
     * <li>Y: Enable.</li>
     * <li>N: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("EnableSellTrust")
    public String enableSellTrust;

    /**
     * <p>The type of the environment in which the database instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>product</strong>: production environment.</li>
     * <li><strong>dev</strong>: development environment.</li>
     * <li><strong>pre</strong>: pre-release environment.</li>
     * <li><strong>test</strong>: test environment.</li>
     * <li><strong>sit</strong>: system integration testing (SIT) environment.</li>
     * <li><strong>uat</strong>: user acceptance testing (UAT) environment.</li>
     * <li><strong>pet</strong>: stress testing environment.</li>
     * <li><strong>stag</strong>: staging environment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dev</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The timeout period for exporting data from the database instance. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("ExportTimeout")
    public Integer exportTimeout;

    /**
     * <p>The endpoint that is used to connect to the database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XXX.0.56</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The alias of the database instance. Specify an alias that can help you quickly identify the database instance in Data Management (DMS).</p>
     * 
     * <strong>example:</strong>
     * <p>instance_test</p>
     */
    @NameInMap("InstanceAlias")
    public String instanceAlias;

    /**
     * <p>The ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/141936.html">ListInstances</a> or <a href="https://help.aliyun.com/document_detail/141567.html">GetInstance</a> operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>183****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The source of the database instance. Valid values:</p>
     * <ul>
     * <li><strong>PUBLIC_OWN</strong>: a self-managed database instance that is deployed on the Internet.</li>
     * <li><strong>RDS</strong>: an ApsaraDB RDS instance.</li>
     * <li><strong>ECS_OWN</strong>: a self-managed database instance that is deployed on an Elastic Compute Service (ECS) instance.</li>
     * <li><strong>VPC_IDC</strong>: a self-managed database instance that is deployed in a data center connected over a virtual private cloud (VPC).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("InstanceSource")
    public String instanceSource;

    /**
     * <p>The type of the database instance. For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The network type of the database instance. Valid values:</p>
     * <ul>
     * <li><strong>CLASSIC</strong>: the classic network.</li>
     * <li><strong>VPC</strong>: VPC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The port that is used to connect to the database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The timeout period for querying data from the database instance. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>7200</p>
     */
    @NameInMap("QueryTimeout")
    public Integer queryTimeout;

    /**
     * <p>The name of the security rule set for the database instance. This parameter is required if Security Collaboration is enabled. You can call the<a href="https://help.aliyun.com/document_detail/465940.html">ListStandardGroups</a> or <a href="https://help.aliyun.com/document_detail/465826.html">GetInstance</a> operation to obtain the name of the security rule set from GroupName.</p>
     */
    @NameInMap("SafeRule")
    public String safeRule;

    /**
     * <p>The system ID (SID) of the database instance.</p>
     * <blockquote>
     * <p>This parameter is required if InstanceType is set to ORACLE.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testSid</p>
     */
    @NameInMap("Sid")
    public String sid;

    /**
     * <p>Specifies whether to skip the connectivity test. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SkipTest")
    public Boolean skipTest;

    /**
     * <p>The ID of the classification and grading template. You can call the <a href="https://help.aliyun.com/document_detail/465947.html">ListClassificationTemplates</a> operation to query the template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31***</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The type of the classification and grading template. You can call the <a href="https://help.aliyun.com/document_detail/465947.html">ListClassificationTemplates</a> operation to query the template type.</p>
     * 
     * <strong>example:</strong>
     * <p>INNER</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>You can move the pointer over the profile picture in the upper-right corner of the DMS console to obtain the tenant ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23****</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>Specifies whether to enable cross-instance query for the database instance. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Disables cross-database query.</li>
     * <li><strong>1</strong>: Enables cross-database query.</li>
     * </ul>
     * <blockquote>
     * <p>Supported databases include MySQL, SQL Server, PostgreSQL, PolarDB for Oracle, and Redis.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UseDsql")
    public Integer useDsql;

    /**
     * <p>Specifies whether to allow Data Management Service (DMS) to connect to the database instance by using SSL connections. Before you use SSL connections, make sure that the SSL encryption feature is enabled for the database instance. Valid values:</p>
     * <ul>
     * <li><strong>0</strong> (default): DMS automatically checks whether self-negotiation is enabled for the database instance. DMS automatically checks whether the SSL encryption feature is enabled for the database instance. If the SSL encryption feature is enabled, DMS connects to the database instance by using SSL connections. Otherwise, DMS connects to the database instance without encryption.</li>
     * <li><strong>1</strong>: DMS connects to the database instance by using SSL connections. This value is invalid if the SSL encryption feature is disabled for the database instance.</li>
     * <li><strong>-1</strong>: DMS does not connect to the database instance by using SSL connections.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is available only for a MySQL or Redis database instance.</p>
     * </li>
     * <li><p>SSL encrypts network connections at the transport layer to improve the security and integrity of data in transmission. However, SSL increases the response time of network connections.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("UseSsl")
    public Integer useSsl;

    /**
     * <p>The VPC ID.</p>
     * <blockquote>
     * <p> This parameter is required if InstanceSource is set to VPC_IDC.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp10wnlcmor****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ModifyInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceRequest self = new ModifyInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceRequest setDataLinkName(String dataLinkName) {
        this.dataLinkName = dataLinkName;
        return this;
    }
    public String getDataLinkName() {
        return this.dataLinkName;
    }

    public ModifyInstanceRequest setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
        return this;
    }
    public String getDatabasePassword() {
        return this.databasePassword;
    }

    public ModifyInstanceRequest setDatabaseUser(String databaseUser) {
        this.databaseUser = databaseUser;
        return this;
    }
    public String getDatabaseUser() {
        return this.databaseUser;
    }

    public ModifyInstanceRequest setDbaId(Long dbaId) {
        this.dbaId = dbaId;
        return this;
    }
    public Long getDbaId() {
        return this.dbaId;
    }

    public ModifyInstanceRequest setDdlOnline(Integer ddlOnline) {
        this.ddlOnline = ddlOnline;
        return this;
    }
    public Integer getDdlOnline() {
        return this.ddlOnline;
    }

    public ModifyInstanceRequest setEcsInstanceId(String ecsInstanceId) {
        this.ecsInstanceId = ecsInstanceId;
        return this;
    }
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
    }

    public ModifyInstanceRequest setEcsRegion(String ecsRegion) {
        this.ecsRegion = ecsRegion;
        return this;
    }
    public String getEcsRegion() {
        return this.ecsRegion;
    }

    public ModifyInstanceRequest setEnableSellCommon(String enableSellCommon) {
        this.enableSellCommon = enableSellCommon;
        return this;
    }
    public String getEnableSellCommon() {
        return this.enableSellCommon;
    }

    public ModifyInstanceRequest setEnableSellSitd(String enableSellSitd) {
        this.enableSellSitd = enableSellSitd;
        return this;
    }
    public String getEnableSellSitd() {
        return this.enableSellSitd;
    }

    public ModifyInstanceRequest setEnableSellStable(String enableSellStable) {
        this.enableSellStable = enableSellStable;
        return this;
    }
    public String getEnableSellStable() {
        return this.enableSellStable;
    }

    public ModifyInstanceRequest setEnableSellTrust(String enableSellTrust) {
        this.enableSellTrust = enableSellTrust;
        return this;
    }
    public String getEnableSellTrust() {
        return this.enableSellTrust;
    }

    public ModifyInstanceRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ModifyInstanceRequest setExportTimeout(Integer exportTimeout) {
        this.exportTimeout = exportTimeout;
        return this;
    }
    public Integer getExportTimeout() {
        return this.exportTimeout;
    }

    public ModifyInstanceRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public ModifyInstanceRequest setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    public ModifyInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceRequest setInstanceSource(String instanceSource) {
        this.instanceSource = instanceSource;
        return this;
    }
    public String getInstanceSource() {
        return this.instanceSource;
    }

    public ModifyInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyInstanceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public ModifyInstanceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ModifyInstanceRequest setQueryTimeout(Integer queryTimeout) {
        this.queryTimeout = queryTimeout;
        return this;
    }
    public Integer getQueryTimeout() {
        return this.queryTimeout;
    }

    public ModifyInstanceRequest setSafeRule(String safeRule) {
        this.safeRule = safeRule;
        return this;
    }
    public String getSafeRule() {
        return this.safeRule;
    }

    public ModifyInstanceRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public ModifyInstanceRequest setSkipTest(Boolean skipTest) {
        this.skipTest = skipTest;
        return this;
    }
    public Boolean getSkipTest() {
        return this.skipTest;
    }

    public ModifyInstanceRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public ModifyInstanceRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public ModifyInstanceRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ModifyInstanceRequest setUseDsql(Integer useDsql) {
        this.useDsql = useDsql;
        return this;
    }
    public Integer getUseDsql() {
        return this.useDsql;
    }

    public ModifyInstanceRequest setUseSsl(Integer useSsl) {
        this.useSsl = useSsl;
        return this;
    }
    public Integer getUseSsl() {
        return this.useSsl;
    }

    public ModifyInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
