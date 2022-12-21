// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    // The name of the data link for cross-database query.
    // 
    // > 
    // *   This parameter is required if the UseDsql parameter is set to 1.
    // *   The name can contain only lowercase letters and underscores (\_).
    // *   The name must be unique within a tenant.
    @NameInMap("DataLinkName")
    public String dataLinkName;

    // The password that is used to log on to the database.
    @NameInMap("DatabasePassword")
    public String databasePassword;

    // The account that is used to log on to the database.
    @NameInMap("DatabaseUser")
    public String databaseUser;

    // The ID of the user who assumes the DBA role of the database instance. You can call the [ListUsers](~~141938~~) or [GetInstance](~~141567~~) operation to obtain the user ID.
    @NameInMap("DbaId")
    public String dbaId;

    // Specifies whether to enable the lock-free schema change feature for the database instance. Valid values:
    // 
    // *   0: The feature is disabled.
    // *   1: The native online DDL feature takes precedence.
    // *   2: The lock-free schema change feature of DMS takes precedence.
    @NameInMap("DdlOnline")
    public Integer ddlOnline;

    // The ID of the ECS instance.
    // 
    // >  This parameter is required if the InstanceSource parameter is set to ECS_OWN.
    @NameInMap("EcsInstanceId")
    public String ecsInstanceId;

    // The ID of the region in which the database instance resides.
    // 
    // >  This parameter is required if the InstanceSource parameter is set to RDS, ECS_OWN, or VPC_IDC.
    @NameInMap("EcsRegion")
    public String ecsRegion;

    @NameInMap("EnableSellSitd")
    public String enableSellSitd;

    // The type of the environment to which the database instance belongs. Valid values:
    // 
    // *   **product**: production environment
    // *   **dev**: development environment
    // *   **pre**: staging environment
    // *   **test**: test environment
    // *   **sit**: system integration testing (SIT) environment
    // *   **uat**: user acceptance testing (UAT) environment
    // *   **pet**: stress testing environment
    // *   **stag**: STAG environment
    @NameInMap("EnvType")
    public String envType;

    // The timeout period for exporting data from the database instance.
    @NameInMap("ExportTimeout")
    public Integer exportTimeout;

    // The host address that is used to connect to the database instance.
    @NameInMap("Host")
    public String host;

    // The alias of the database instance. Specify an alias that can help you identify the database instance in DMS.
    @NameInMap("InstanceAlias")
    public String instanceAlias;

    // The ID of the database instance. You can call the [GetInstance](~~141567~~) operation to obtain the instance ID.
    @NameInMap("InstanceId")
    public String instanceId;

    // The source of the database instance. Valid values:
    // 
    // *   **PUBLIC_OWN**: a self-managed database instance that is deployed on the Internet
    // *   **RDS**: an ApsaraDB RDS instance
    // *   **ECS_OWN**: a self-managed database that is deployed on an Elastic Compute Service (ECS) instance
    // *   **VPC_IDC**: a self-managed database instance that is deployed in a data center connected over a virtual private cloud (VPC)
    @NameInMap("InstanceSource")
    public String instanceSource;

    // The type of the database. For more information about the valid values of this parameter, see [DbType parameter](~~198106~~).
    @NameInMap("InstanceType")
    public String instanceType;

    // The port number that is used to connect to the database instance.
    @NameInMap("Port")
    public Integer port;

    // The timeout period for querying data in the database instance.
    @NameInMap("QueryTimeout")
    public Integer queryTimeout;

    // The ID of the security rule set for the instance. You can call the [ListStandardGroups](~~417891~~) or [GetInstance](~~141567~~) operation to obtain the name of the security rule set that you want to use.
    @NameInMap("SafeRuleId")
    public String safeRuleId;

    // The system ID (SID) of the database instance.
    // 
    // >  This parameter is required if the InstanceType parameter is set to ORACLE.
    @NameInMap("Sid")
    public String sid;

    // Specifies whether to skip connectivity test. Valid values:
    // 
    // *   **true**: The connectivity test is skipped.
    // *   **false**: The connectivity test is not skipped.
    @NameInMap("SkipTest")
    public Boolean skipTest;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("TemplateType")
    public String templateType;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to obtain the tenant ID.
    @NameInMap("Tid")
    public Long tid;

    // Specifies whether to enable the cross-database query feature for the database instance. Valid values:
    // 
    // *   0: The feature is disabled.
    // *   1: The feature is enabled.
    // 
    // >  Supported database types: MySQL, SQL Server, PostgreSQL, PolarDB for Oracle, and ApsaraDB for Redis.
    @NameInMap("UseDsql")
    public Integer useDsql;

    // The ID of the VPC.
    // 
    // >  This parameter is required if the InstanceSource parameter is set to VPC_IDC.
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
