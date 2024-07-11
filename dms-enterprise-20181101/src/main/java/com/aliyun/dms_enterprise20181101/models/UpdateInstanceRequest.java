// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    /**
     * <p>The name of the database link for cross-database queries.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is required if UseDsql is set to 1.</p>
     * </li>
     * <li><p>The name can contain only lowercase letters and underscores (_).</p>
     * </li>
     * <li><p>The name must be unique within a tenant.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>datalink_test</p>
     */
    @NameInMap("DataLinkName")
    public String dataLinkName;

    /**
     * <p>The password that is used to log on to the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DatabasePassword")
    public String databasePassword;

    /**
     * <p>The account that is used to log on to the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbuser</p>
     */
    @NameInMap("DatabaseUser")
    public String databaseUser;

    /**
     * <p>The ID of the user who assumes the database administrator (DBA) role of the database instance. You can call the <a href="https://help.aliyun.com/document_detail/141938.html">ListUsers</a> or <a href="https://help.aliyun.com/document_detail/141567.html">GetInstance</a> operation to query the user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>27****</p>
     */
    @NameInMap("DbaId")
    public String dbaId;

    /**
     * <p>Specifies whether to enable the lock-free schema change feature for the database instance. Valid values:</p>
     * <ul>
     * <li><strong>0:</strong> disables the lock-free schema change feature.</li>
     * <li><strong>1</strong>: uses the online DDL of MySQL first.</li>
     * <li><strong>2</strong>: uses the lock-free schema change feature of DMS first.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DdlOnline")
    public Integer ddlOnline;

    /**
     * <p>The ID of the ECS instance on which the database instance is deployed.</p>
     * <blockquote>
     * <p>This parameter is required if the InstanceSource parameter is set to ECS_OWN.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>i-2zei9gs1t7h8l7ac****</p>
     */
    @NameInMap("EcsInstanceId")
    public String ecsInstanceId;

    /**
     * <p>The ID of the region in which the database instance resides.</p>
     * <blockquote>
     * <p>This parameter is required if InstanceSource is set to RDS, ECS_OWN, and VPC_IDC.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("EcsRegion")
    public String ecsRegion;

    /**
     * <ul>
     * <li><strong>Y:</strong> enables the sensitive data protection feature</li>
     * <li><strong>N:</strong> disables the sensitive data protection feature</li>
     * <li><strong>NULL or other:</strong> does not update the status of the sensitive data protection feature</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("EnableSellSitd")
    public String enableSellSitd;

    /**
     * <p>The type of the environment in which the database instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>product:</strong> production environment</li>
     * <li><strong>dev:</strong> development environment</li>
     * <li><strong>pre:</strong> pre-release environment</li>
     * <li><strong>test:</strong> test environment</li>
     * <li><strong>sit:</strong> system integration testing (SIT) environment</li>
     * <li><strong>uat:</strong> user acceptance testing (UAT) environment</li>
     * <li><strong>pet:</strong> stress testing environment</li>
     * <li><strong>stag:</strong> staging environment</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>product</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The timeout period for exporting data from the database instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("ExportTimeout")
    public Integer exportTimeout;

    /**
     * <p>The host address that is used to connect to the database instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XXX.0.56</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The alias of the database instance. Specify an alias that can help you identify the database instance in DMS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance_test</p>
     */
    @NameInMap("InstanceAlias")
    public String instanceAlias;

    /**
     * <p>The ID of the database instance. You can call the <a href="https://help.aliyun.com/document_detail/141567.html">GetInstance</a> operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>126****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The source of the database instance. Valid values:</p>
     * <ul>
     * <li><strong>PUBLIC_OWN:</strong> a self-managed database instance that is deployed on the Internet</li>
     * <li><strong>RDS:</strong> an ApsaraDB RDS instance</li>
     * <li><strong>ECS_OWN:</strong> a self-managed database that is deployed on an Elastic Compute Service (ECS) instance</li>
     * <li><strong>VPC_IDC:</strong> a self-managed database instance that is deployed in a data center connected over a virtual private cloud (VPC)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_OWN</p>
     */
    @NameInMap("InstanceSource")
    public String instanceSource;

    /**
     * <p>The type of the database. For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The port that is used to connect to the database instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The timeout period for querying data in the database instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("QueryTimeout")
    public Integer queryTimeout;

    /**
     * <p>The name of the security rule set (GroupName) for the instance. You can call the <a href="https://help.aliyun.com/document_detail/417891.html">ListStandardGroups</a> or <a href="https://help.aliyun.com/document_detail/141567.html">GetInstance</a> operation to query the name of the security rule set.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3****</p>
     */
    @NameInMap("SafeRuleId")
    public String safeRuleId;

    /**
     * <p>The system ID (SID) of the database instance.</p>
     * <blockquote>
     * <p>This parameter is required if the InstanceType parameter is set to ORACLE.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("Sid")
    public String sid;

    /**
     * <p>Specifies whether to skip the connectivity test. Valid values:</p>
     * <ul>
     * <li><strong>true:</strong> skips the connectivity test</li>
     * <li><strong>false:</strong> does not skip the connectivity test</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SkipTest")
    public Boolean skipTest;

    /**
     * <p>The ID of the classification template. You can call the <a href="https://help.aliyun.com/document_detail/460613.html">ListClassificationTemplates</a> operation to query the template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The type of the classification template. You can call the <a href="https://help.aliyun.com/document_detail/460613.html">ListClassificationTemplates</a> operation to query the template type.</p>
     * 
     * <strong>example:</strong>
     * <p>INNER</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to query the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>Specifies whether to enable the cross-database query feature for the database instance. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disables the cross-database query feature.</li>
     * <li><strong>1</strong>: enables the cross-database query feature.</li>
     * </ul>
     * <blockquote>
     * <p>Supported database types: MySQL, SQL Server, PostgreSQL, PolarDB for PostgreSQL (compatible with Oracle), and ApsaraDB for Redis.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("UseDsql")
    public Integer useDsql;

    /**
     * <p>The ID of the VPC to which the database instance belongs.</p>
     * <blockquote>
     * <p>This parameter is required if the InstanceSource parameter is set to VPC_IDC.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static UpdateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceRequest self = new UpdateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceRequest setDataLinkName(String dataLinkName) {
        this.dataLinkName = dataLinkName;
        return this;
    }
    public String getDataLinkName() {
        return this.dataLinkName;
    }

    public UpdateInstanceRequest setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
        return this;
    }
    public String getDatabasePassword() {
        return this.databasePassword;
    }

    public UpdateInstanceRequest setDatabaseUser(String databaseUser) {
        this.databaseUser = databaseUser;
        return this;
    }
    public String getDatabaseUser() {
        return this.databaseUser;
    }

    public UpdateInstanceRequest setDbaId(String dbaId) {
        this.dbaId = dbaId;
        return this;
    }
    public String getDbaId() {
        return this.dbaId;
    }

    public UpdateInstanceRequest setDdlOnline(Integer ddlOnline) {
        this.ddlOnline = ddlOnline;
        return this;
    }
    public Integer getDdlOnline() {
        return this.ddlOnline;
    }

    public UpdateInstanceRequest setEcsInstanceId(String ecsInstanceId) {
        this.ecsInstanceId = ecsInstanceId;
        return this;
    }
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
    }

    public UpdateInstanceRequest setEcsRegion(String ecsRegion) {
        this.ecsRegion = ecsRegion;
        return this;
    }
    public String getEcsRegion() {
        return this.ecsRegion;
    }

    public UpdateInstanceRequest setEnableSellSitd(String enableSellSitd) {
        this.enableSellSitd = enableSellSitd;
        return this;
    }
    public String getEnableSellSitd() {
        return this.enableSellSitd;
    }

    public UpdateInstanceRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public UpdateInstanceRequest setExportTimeout(Integer exportTimeout) {
        this.exportTimeout = exportTimeout;
        return this;
    }
    public Integer getExportTimeout() {
        return this.exportTimeout;
    }

    public UpdateInstanceRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public UpdateInstanceRequest setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    public UpdateInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceRequest setInstanceSource(String instanceSource) {
        this.instanceSource = instanceSource;
        return this;
    }
    public String getInstanceSource() {
        return this.instanceSource;
    }

    public UpdateInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public UpdateInstanceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public UpdateInstanceRequest setQueryTimeout(Integer queryTimeout) {
        this.queryTimeout = queryTimeout;
        return this;
    }
    public Integer getQueryTimeout() {
        return this.queryTimeout;
    }

    public UpdateInstanceRequest setSafeRuleId(String safeRuleId) {
        this.safeRuleId = safeRuleId;
        return this;
    }
    public String getSafeRuleId() {
        return this.safeRuleId;
    }

    public UpdateInstanceRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public UpdateInstanceRequest setSkipTest(Boolean skipTest) {
        this.skipTest = skipTest;
        return this;
    }
    public Boolean getSkipTest() {
        return this.skipTest;
    }

    public UpdateInstanceRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public UpdateInstanceRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public UpdateInstanceRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public UpdateInstanceRequest setUseDsql(Integer useDsql) {
        this.useDsql = useDsql;
        return this;
    }
    public Integer getUseDsql() {
        return this.useDsql;
    }

    public UpdateInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
