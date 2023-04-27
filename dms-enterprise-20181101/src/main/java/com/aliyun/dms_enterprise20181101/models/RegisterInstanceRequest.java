// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RegisterInstanceRequest extends TeaModel {
    @NameInMap("DataLinkName")
    public String dataLinkName;

    @NameInMap("DatabasePassword")
    public String databasePassword;

    @NameInMap("DatabaseUser")
    public String databaseUser;

    @NameInMap("DbaUid")
    public Long dbaUid;

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

    @NameInMap("InstanceSource")
    public String instanceSource;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("QueryTimeout")
    public Integer queryTimeout;

    @NameInMap("SafeRule")
    public String safeRule;

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
