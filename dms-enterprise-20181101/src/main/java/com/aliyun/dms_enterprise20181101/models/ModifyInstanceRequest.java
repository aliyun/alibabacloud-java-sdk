// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ModifyInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dblink_test</p>
     */
    @NameInMap("DataLinkName")
    public String dataLinkName;

    /**
     * <strong>example:</strong>
     * <p>test***</p>
     */
    @NameInMap("DatabasePassword")
    public String databasePassword;

    /**
     * <strong>example:</strong>
     * <p>testsdb</p>
     */
    @NameInMap("DatabaseUser")
    public String databaseUser;

    /**
     * <strong>example:</strong>
     * <p>27****</p>
     */
    @NameInMap("DbaId")
    public Long dbaId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DdlOnline")
    public Integer ddlOnline;

    /**
     * <strong>example:</strong>
     * <p>i-2zei9gs1t7h8l7ac****</p>
     */
    @NameInMap("EcsInstanceId")
    public String ecsInstanceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("EcsRegion")
    public String ecsRegion;

    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("EnableSellCommon")
    public String enableSellCommon;

    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("EnableSellSitd")
    public String enableSellSitd;

    /**
     * <strong>example:</strong>
     * <p>NULL</p>
     */
    @NameInMap("EnableSellStable")
    public String enableSellStable;

    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("EnableSellTrust")
    public String enableSellTrust;

    /**
     * <strong>example:</strong>
     * <p>dev</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("ExportTimeout")
    public Integer exportTimeout;

    /**
     * <strong>example:</strong>
     * <p>192.XXX.0.56</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <strong>example:</strong>
     * <p>instance_test</p>
     */
    @NameInMap("InstanceAlias")
    public String instanceAlias;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>183****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("InstanceSource")
    public String instanceSource;

    /**
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <strong>example:</strong>
     * <p>7200</p>
     */
    @NameInMap("QueryTimeout")
    public Integer queryTimeout;

    @NameInMap("SafeRule")
    public String safeRule;

    /**
     * <strong>example:</strong>
     * <p>testSid</p>
     */
    @NameInMap("Sid")
    public String sid;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SkipTest")
    public Boolean skipTest;

    /**
     * <strong>example:</strong>
     * <p>31***</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <strong>example:</strong>
     * <p>INNER</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <strong>example:</strong>
     * <p>23****</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UseDsql")
    public Integer useDsql;

    @NameInMap("UseSsl")
    public Integer useSsl;

    /**
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
