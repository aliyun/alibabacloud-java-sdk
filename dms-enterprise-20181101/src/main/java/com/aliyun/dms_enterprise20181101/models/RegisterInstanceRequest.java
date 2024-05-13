// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RegisterInstanceRequest extends TeaModel {
    /**
     * <p>The name of the database link for cross-database queries.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter is required if UseDsql is set to 1.</p>
     * <br>
     * <p>*   The name can contain only lowercase letters and underscores (_).</p>
     * <br>
     * <p>*   The name must be unique within a tenant.</p>
     */
    @NameInMap("DataLinkName")
    public String dataLinkName;

    /**
     * <p>The password that is used to log on to the database.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatabasePassword")
    public String databasePassword;

    /**
     * <p>The account that is used to log on to the database.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatabaseUser")
    public String databaseUser;

    /**
     * <p>The ID of the user who assumes the DBA role of the database instance. You can call the [ListUsers](https://help.aliyun.com/document_detail/141938.html) or [GetInstance](https://help.aliyun.com/document_detail/141567.html) operation to query the user ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DbaUid")
    public Long dbaUid;

    /**
     * <p>The ID of the user who assumes the DBA role of the database instance. If the user ID is a non-numeric value such as a role or an account, you can use this parameter to replace DbaUid.</p>
     */
    @NameInMap("DbaUidByString")
    public String dbaUidByString;

    /**
     * <p>Specifies whether to enable the lock-free schema change feature for the database instance. Valid values:</p>
     * <br>
     * <p>*   **0**: disables the lock-free schema change feature.</p>
     * <p>*   **1**: uses the online DDL of MySQL first.</p>
     * <p>*   **2**: uses the lock-free schema change feature of DMS first.</p>
     * <br>
     * <p>> Supported database types: ApsaraDB RDS for MySQL, PolarDB for MySQL, ApsaraDB MyBase for MySQL, and third-party MySQL databases.</p>
     */
    @NameInMap("DdlOnline")
    public Integer ddlOnline;

    /**
     * <p>The ID of the ECS instance on which the database instance is deployed.</p>
     * <br>
     * <p>> This parameter is required if the InstanceSource parameter is set to ECS_OWN.</p>
     */
    @NameInMap("EcsInstanceId")
    public String ecsInstanceId;

    /**
     * <p>The ID of the region in which the database instance resides.</p>
     * <br>
     * <p>> This parameter is required if the InstanceSource parameter is set to RDS, ECS_OWN, or VPC_IDC.</p>
     */
    @NameInMap("EcsRegion")
    public String ecsRegion;

    /**
     * <p>*   **Y:** enables the sensitive data protection feature</p>
     * <p>*   **NULL or other:** disables the sensitive data protection feature</p>
     */
    @NameInMap("EnableSellSitd")
    public String enableSellSitd;

    /**
     * <p>The type of the environment in which the database instance is deployed. Valid values:</p>
     * <br>
     * <p>*   product: production environment</p>
     * <p>*   dev: development environment</p>
     * <p>*   pre: pre-release environment</p>
     * <p>*   test: test environment</p>
     * <p>*   sit: system integration testing (SIT) environment</p>
     * <p>*   uat: user acceptance testing (UAT) environment</p>
     * <p>*   pet: stress testing environment</p>
     * <p>*   stag: staging environment</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The timeout period for exporting data from the database instance. Unit: seconds.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExportTimeout")
    public Integer exportTimeout;

    /**
     * <p>The host address that is used to connect to the database instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The alias of the database instance. Specify an alias that can help you identify the database instance in DMS.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceAlias")
    public String instanceAlias;

    /**
     * <p>The source of the database instance. Valid values:</p>
     * <br>
     * <p>*   **PUBLIC_OWN:** a self-managed database instance that is deployed on the Internet</p>
     * <p>*   **RDS:** an ApsaraDB RDS instance</p>
     * <p>*   **ECS_OWN:** a self-managed database that is deployed on an Elastic Compute Service (ECS) instance</p>
     * <p>*   **VPC_IDC:** a self-managed database instance that is deployed in a data center connected over a virtual private cloud (VPC)</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceSource")
    public String instanceSource;

    /**
     * <p>The type of the database. For more information about the valid values of this parameter, see [DbType parameter](https://help.aliyun.com/document_detail/198106.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The network type of the database instance. Valid values:</p>
     * <br>
     * <p>*   **CLASSIC:** classic network</p>
     * <p>*   **VPC:** VPC</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The port that is used to connect to the database instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The timeout period for querying data in the database instance. Unit: seconds.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueryTimeout")
    public Integer queryTimeout;

    /**
     * <p>The name of the security rule set (GroupName) for the database instance. You can call the [ListStandardGroups](https://help.aliyun.com/document_detail/417891.html) or [GetInstance](https://help.aliyun.com/document_detail/141567.html) operation to query the name of the security rule set.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SafeRule")
    public String safeRule;

    /**
     * <p>The system ID (SID) of the database.</p>
     * <br>
     * <p>> This parameter is required if the InstanceType parameter is set to ORACLE.</p>
     */
    @NameInMap("Sid")
    public String sid;

    /**
     * <p>Specifies whether to skip the connectivity test. Valid values:</p>
     * <br>
     * <p>*   **true:** skips the connectivity test</p>
     * <p>*   **false:** does not skip the connectivity test</p>
     */
    @NameInMap("SkipTest")
    public Boolean skipTest;

    /**
     * <p>The ID of the classification template. You can call the [ListClassificationTemplates](https://help.aliyun.com/document_detail/460613.html) operation to query the template ID.</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The type of the classification template. You can call the [ListClassificationTemplates](https://help.aliyun.com/document_detail/460613.html) operation to query the template type.</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>Specifies whether to enable the cross-database query feature for the database instance. Valid values:</p>
     * <br>
     * <p>*   **0**: disables the cross-database query feature.</p>
     * <p>*   **1**: enables the cross-database query feature.</p>
     * <br>
     * <p>> Supported database types: MySQL, SQL Server, PostgreSQL, PolarDB for PostgreSQL (compatible with Oracle), and ApsaraDB for Redis.</p>
     */
    @NameInMap("UseDsql")
    public Integer useDsql;

    /**
     * <p>The ID of the VPC to which the database instance belongs.</p>
     * <br>
     * <p>> This parameter is required if the InstanceSource parameter is set to VPC_IDC.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static RegisterInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterInstanceRequest self = new RegisterInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RegisterInstanceRequest setDataLinkName(String dataLinkName) {
        this.dataLinkName = dataLinkName;
        return this;
    }
    public String getDataLinkName() {
        return this.dataLinkName;
    }

    public RegisterInstanceRequest setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
        return this;
    }
    public String getDatabasePassword() {
        return this.databasePassword;
    }

    public RegisterInstanceRequest setDatabaseUser(String databaseUser) {
        this.databaseUser = databaseUser;
        return this;
    }
    public String getDatabaseUser() {
        return this.databaseUser;
    }

    public RegisterInstanceRequest setDbaUid(Long dbaUid) {
        this.dbaUid = dbaUid;
        return this;
    }
    public Long getDbaUid() {
        return this.dbaUid;
    }

    public RegisterInstanceRequest setDbaUidByString(String dbaUidByString) {
        this.dbaUidByString = dbaUidByString;
        return this;
    }
    public String getDbaUidByString() {
        return this.dbaUidByString;
    }

    public RegisterInstanceRequest setDdlOnline(Integer ddlOnline) {
        this.ddlOnline = ddlOnline;
        return this;
    }
    public Integer getDdlOnline() {
        return this.ddlOnline;
    }

    public RegisterInstanceRequest setEcsInstanceId(String ecsInstanceId) {
        this.ecsInstanceId = ecsInstanceId;
        return this;
    }
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
    }

    public RegisterInstanceRequest setEcsRegion(String ecsRegion) {
        this.ecsRegion = ecsRegion;
        return this;
    }
    public String getEcsRegion() {
        return this.ecsRegion;
    }

    public RegisterInstanceRequest setEnableSellSitd(String enableSellSitd) {
        this.enableSellSitd = enableSellSitd;
        return this;
    }
    public String getEnableSellSitd() {
        return this.enableSellSitd;
    }

    public RegisterInstanceRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public RegisterInstanceRequest setExportTimeout(Integer exportTimeout) {
        this.exportTimeout = exportTimeout;
        return this;
    }
    public Integer getExportTimeout() {
        return this.exportTimeout;
    }

    public RegisterInstanceRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public RegisterInstanceRequest setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    public RegisterInstanceRequest setInstanceSource(String instanceSource) {
        this.instanceSource = instanceSource;
        return this;
    }
    public String getInstanceSource() {
        return this.instanceSource;
    }

    public RegisterInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public RegisterInstanceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public RegisterInstanceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public RegisterInstanceRequest setQueryTimeout(Integer queryTimeout) {
        this.queryTimeout = queryTimeout;
        return this;
    }
    public Integer getQueryTimeout() {
        return this.queryTimeout;
    }

    public RegisterInstanceRequest setSafeRule(String safeRule) {
        this.safeRule = safeRule;
        return this;
    }
    public String getSafeRule() {
        return this.safeRule;
    }

    public RegisterInstanceRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public RegisterInstanceRequest setSkipTest(Boolean skipTest) {
        this.skipTest = skipTest;
        return this;
    }
    public Boolean getSkipTest() {
        return this.skipTest;
    }

    public RegisterInstanceRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public RegisterInstanceRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public RegisterInstanceRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public RegisterInstanceRequest setUseDsql(Integer useDsql) {
        this.useDsql = useDsql;
        return this;
    }
    public Integer getUseDsql() {
        return this.useDsql;
    }

    public RegisterInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
