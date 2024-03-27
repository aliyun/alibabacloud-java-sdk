// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddInstanceRequest extends TeaModel {
    @NameInMap("DataLinkName")
    public String dataLinkName;

    @NameInMap("DatabasePassword")
    public String databasePassword;

    @NameInMap("DatabaseUser")
    public String databaseUser;

    @NameInMap("DbaId")
    public Long dbaId;

    @NameInMap("DdlOnline")
    public Integer ddlOnline;

    @NameInMap("EcsInstanceId")
    public String ecsInstanceId;

    @NameInMap("EcsRegion")
    public String ecsRegion;

    @NameInMap("EnableSellCommon")
    public String enableSellCommon;

    @NameInMap("EnableSellSitd")
    public String enableSellSitd;

    @NameInMap("EnableSellStable")
    public String enableSellStable;

    @NameInMap("EnableSellTrust")
    public String enableSellTrust;

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

    @NameInMap("UseSsl")
    public Integer useSsl;

    @NameInMap("VpcId")
    public String vpcId;

    public static AddInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddInstanceRequest self = new AddInstanceRequest();
        return TeaModel.build(map, self);
    }

    public AddInstanceRequest setDataLinkName(String dataLinkName) {
        this.dataLinkName = dataLinkName;
        return this;
    }
    public String getDataLinkName() {
        return this.dataLinkName;
    }

    public AddInstanceRequest setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
        return this;
    }
    public String getDatabasePassword() {
        return this.databasePassword;
    }

    public AddInstanceRequest setDatabaseUser(String databaseUser) {
        this.databaseUser = databaseUser;
        return this;
    }
    public String getDatabaseUser() {
        return this.databaseUser;
    }

    public AddInstanceRequest setDbaId(Long dbaId) {
        this.dbaId = dbaId;
        return this;
    }
    public Long getDbaId() {
        return this.dbaId;
    }

    public AddInstanceRequest setDdlOnline(Integer ddlOnline) {
        this.ddlOnline = ddlOnline;
        return this;
    }
    public Integer getDdlOnline() {
        return this.ddlOnline;
    }

    public AddInstanceRequest setEcsInstanceId(String ecsInstanceId) {
        this.ecsInstanceId = ecsInstanceId;
        return this;
    }
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
    }

    public AddInstanceRequest setEcsRegion(String ecsRegion) {
        this.ecsRegion = ecsRegion;
        return this;
    }
    public String getEcsRegion() {
        return this.ecsRegion;
    }

    public AddInstanceRequest setEnableSellCommon(String enableSellCommon) {
        this.enableSellCommon = enableSellCommon;
        return this;
    }
    public String getEnableSellCommon() {
        return this.enableSellCommon;
    }

    public AddInstanceRequest setEnableSellSitd(String enableSellSitd) {
        this.enableSellSitd = enableSellSitd;
        return this;
    }
    public String getEnableSellSitd() {
        return this.enableSellSitd;
    }

    public AddInstanceRequest setEnableSellStable(String enableSellStable) {
        this.enableSellStable = enableSellStable;
        return this;
    }
    public String getEnableSellStable() {
        return this.enableSellStable;
    }

    public AddInstanceRequest setEnableSellTrust(String enableSellTrust) {
        this.enableSellTrust = enableSellTrust;
        return this;
    }
    public String getEnableSellTrust() {
        return this.enableSellTrust;
    }

    public AddInstanceRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public AddInstanceRequest setExportTimeout(Integer exportTimeout) {
        this.exportTimeout = exportTimeout;
        return this;
    }
    public Integer getExportTimeout() {
        return this.exportTimeout;
    }

    public AddInstanceRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public AddInstanceRequest setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    public AddInstanceRequest setInstanceSource(String instanceSource) {
        this.instanceSource = instanceSource;
        return this;
    }
    public String getInstanceSource() {
        return this.instanceSource;
    }

    public AddInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public AddInstanceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public AddInstanceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public AddInstanceRequest setQueryTimeout(Integer queryTimeout) {
        this.queryTimeout = queryTimeout;
        return this;
    }
    public Integer getQueryTimeout() {
        return this.queryTimeout;
    }

    public AddInstanceRequest setSafeRule(String safeRule) {
        this.safeRule = safeRule;
        return this;
    }
    public String getSafeRule() {
        return this.safeRule;
    }

    public AddInstanceRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public AddInstanceRequest setSkipTest(Boolean skipTest) {
        this.skipTest = skipTest;
        return this;
    }
    public Boolean getSkipTest() {
        return this.skipTest;
    }

    public AddInstanceRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public AddInstanceRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public AddInstanceRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public AddInstanceRequest setUseDsql(Integer useDsql) {
        this.useDsql = useDsql;
        return this;
    }
    public Integer getUseDsql() {
        return this.useDsql;
    }

    public AddInstanceRequest setUseSsl(Integer useSsl) {
        this.useSsl = useSsl;
        return this;
    }
    public Integer getUseSsl() {
        return this.useSsl;
    }

    public AddInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
