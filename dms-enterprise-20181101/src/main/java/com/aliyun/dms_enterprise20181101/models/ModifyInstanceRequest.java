// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ModifyInstanceRequest extends TeaModel {
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

    @NameInMap("InstanceId")
    public String instanceId;

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
