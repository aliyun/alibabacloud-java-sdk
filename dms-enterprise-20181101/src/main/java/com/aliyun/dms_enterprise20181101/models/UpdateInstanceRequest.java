// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    @NameInMap("DataLinkName")
    public String dataLinkName;

    @NameInMap("DatabasePassword")
    public String databasePassword;

    @NameInMap("DatabaseUser")
    public String databaseUser;

    @NameInMap("DbaId")
    public String dbaId;

    @NameInMap("DdlOnline")
    public Integer ddlOnline;

    @NameInMap("EcsInstanceId")
    public String ecsInstanceId;

    @NameInMap("EcsRegion")
    public String ecsRegion;

    @NameInMap("EnableSellSitd")
    public String enableSellSitd;

    @NameInMap("EnvType")
    public String envType;

    @NameInMap("ExportTimeout")
    public Integer exportTimeout;

    @NameInMap("Host")
    public String host;

    @NameInMap("InstanceAlias")
    public String instanceAlias;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceSource")
    public String instanceSource;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("QueryTimeout")
    public Integer queryTimeout;

    @NameInMap("SafeRuleId")
    public String safeRuleId;

    @NameInMap("Sid")
    public String sid;

    @NameInMap("SkipTest")
    public Boolean skipTest;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("TemplateType")
    public String templateType;

    @NameInMap("Tid")
    public Long tid;

    @NameInMap("UseDsql")
    public Integer useDsql;

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
