// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RegisterInstanceRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InstanceSource")
    public String instanceSource;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("EnvType")
    public String envType;

    @NameInMap("EcsInstanceId")
    public String ecsInstanceId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("EcsRegion")
    public String ecsRegion;

    @NameInMap("Host")
    public String host;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("Sid")
    public String sid;

    @NameInMap("DatabaseUser")
    public String databaseUser;

    @NameInMap("DatabasePassword")
    public String databasePassword;

    @NameInMap("InstanceAlias")
    public String instanceAlias;

    @NameInMap("DbaUid")
    public Long dbaUid;

    @NameInMap("SafeRule")
    public String safeRule;

    @NameInMap("QueryTimeout")
    public Integer queryTimeout;

    @NameInMap("ExportTimeout")
    public Integer exportTimeout;

    @NameInMap("DataLinkName")
    public String dataLinkName;

    @NameInMap("DdlOnline")
    public Integer ddlOnline;

    @NameInMap("UseDsql")
    public Integer useDsql;

    @NameInMap("SkipTest")
    public Boolean skipTest;

    public static RegisterInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterInstanceRequest self = new RegisterInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RegisterInstanceRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public RegisterInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public RegisterInstanceRequest setInstanceSource(String instanceSource) {
        this.instanceSource = instanceSource;
        return this;
    }
    public String getInstanceSource() {
        return this.instanceSource;
    }

    public RegisterInstanceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public RegisterInstanceRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public RegisterInstanceRequest setEcsInstanceId(String ecsInstanceId) {
        this.ecsInstanceId = ecsInstanceId;
        return this;
    }
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
    }

    public RegisterInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public RegisterInstanceRequest setEcsRegion(String ecsRegion) {
        this.ecsRegion = ecsRegion;
        return this;
    }
    public String getEcsRegion() {
        return this.ecsRegion;
    }

    public RegisterInstanceRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public RegisterInstanceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public RegisterInstanceRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public RegisterInstanceRequest setDatabaseUser(String databaseUser) {
        this.databaseUser = databaseUser;
        return this;
    }
    public String getDatabaseUser() {
        return this.databaseUser;
    }

    public RegisterInstanceRequest setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
        return this;
    }
    public String getDatabasePassword() {
        return this.databasePassword;
    }

    public RegisterInstanceRequest setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    public RegisterInstanceRequest setDbaUid(Long dbaUid) {
        this.dbaUid = dbaUid;
        return this;
    }
    public Long getDbaUid() {
        return this.dbaUid;
    }

    public RegisterInstanceRequest setSafeRule(String safeRule) {
        this.safeRule = safeRule;
        return this;
    }
    public String getSafeRule() {
        return this.safeRule;
    }

    public RegisterInstanceRequest setQueryTimeout(Integer queryTimeout) {
        this.queryTimeout = queryTimeout;
        return this;
    }
    public Integer getQueryTimeout() {
        return this.queryTimeout;
    }

    public RegisterInstanceRequest setExportTimeout(Integer exportTimeout) {
        this.exportTimeout = exportTimeout;
        return this;
    }
    public Integer getExportTimeout() {
        return this.exportTimeout;
    }

    public RegisterInstanceRequest setDataLinkName(String dataLinkName) {
        this.dataLinkName = dataLinkName;
        return this;
    }
    public String getDataLinkName() {
        return this.dataLinkName;
    }

    public RegisterInstanceRequest setDdlOnline(Integer ddlOnline) {
        this.ddlOnline = ddlOnline;
        return this;
    }
    public Integer getDdlOnline() {
        return this.ddlOnline;
    }

    public RegisterInstanceRequest setUseDsql(Integer useDsql) {
        this.useDsql = useDsql;
        return this;
    }
    public Integer getUseDsql() {
        return this.useDsql;
    }

    public RegisterInstanceRequest setSkipTest(Boolean skipTest) {
        this.skipTest = skipTest;
        return this;
    }
    public Boolean getSkipTest() {
        return this.skipTest;
    }

}
