// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateConfigRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // A reserved parameter.
    @NameInMap("AutopurgePurgeInterval")
    public String autopurgePurgeInterval;

    // A reserved parameter.
    @NameInMap("AutopurgeSnapRetainCount")
    public String autopurgeSnapRetainCount;

    // The ID of the instance.
    @NameInMap("ClusterId")
    public String clusterId;

    // Specifies whether to enable RAM authentication for a configuration center. This parameter is valid for Nacos instances. Valid values:
    // 
    // *   `true`: yes
    // *   `false`: no
    // 
    // > Before you set this parameter, you must call the QueryConfig operation to obtain the ConfigAuthSupported parameter value to check whether the instance supports this feature.
    @NameInMap("ConfigAuthEnabled")
    public Boolean configAuthEnabled;

    // Specifies whether to enable configuration encryption for a configuration center. This parameter is valid for Nacos instances. Valid values:
    // 
    // *   `true`: yes
    // *   `false`: no
    // 
    // > Before you set this parameter, you must call the QueryConfig operation to obtain the ConfigSecretSupported parameter value to check whether the instance supports this feature.
    @NameInMap("ConfigSecretEnabled")
    public Boolean configSecretEnabled;

    // The format of the configuration. Supported formats include TEXT, JSON, XML, and HTML.
    @NameInMap("ConfigType")
    public String configType;

    // The maximum connection duration of the instance. This parameter is valid for ZooKeeper instances. Unit: seconds.
    @NameInMap("InitLimit")
    public String initLimit;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The maximum amount of data on each node. This parameter is valid for ZooKeeper instances. The default maximum data amount on each node is 1 megabyte. Unit: bytes.
    @NameInMap("JuteMaxbuffer")
    public String juteMaxbuffer;

    // Specifies whether to enable Mesh Configuration Protocol (MCP). This parameter is valid for Nacos instances. Valid values:
    // 
    // *   `true`: yes
    // *   `false`: no
    // 
    // > Before you set this parameter, you must call the QueryConfig operation to obtain the MCPSupported parameter value to check whether the instance supports this feature.
    @NameInMap("MCPEnabled")
    public Boolean MCPEnabled;

    // The number of connections between a client and a server. This parameter is valid for ZooKeeper instances.\
    // If this parameter is set to 0, no limits are imposed on the number of connections.
    @NameInMap("MaxClientCnxns")
    public String maxClientCnxns;

    // The maximum timeout period. This parameter is valid for ZooKeeper instances. Unit: seconds.
    @NameInMap("MaxSessionTimeout")
    public String maxSessionTimeout;

    // The minimum timeout period. This parameter is valid for ZooKeeper instances. Unit: seconds.
    @NameInMap("MinSessionTimeout")
    public String minSessionTimeout;

    // Specifies whether to enable RAM authentication for a registry. This parameter is valid for Nacos instances. Valid values:
    // 
    // *   `true`: yes
    // *   `false`: no
    // 
    // > Before you set this parameter, you must call the QueryConfig operation to obtain the NamingAuthSupported parameter value to check whether the instance supports this feature.
    @NameInMap("NamingAuthEnabled")
    public Boolean namingAuthEnabled;

    // Specifies whether to enable super permissions. This parameter is valid for ZooKeeper instances. Valid values:
    // 
    // *   `true`: yes
    // *   `false`: no
    @NameInMap("OpenSuperAcl")
    public String openSuperAcl;

    // The password that corresponds to the username.
    // 
    // > You must specify this parameter if OpenSuperAcl is set to true.
    @NameInMap("PassWord")
    public String passWord;

    // The extended request parameter in the JSON format.
    @NameInMap("RequestPars")
    public String requestPars;

    // The frequency for generating snapshots. This parameter is valid for ZooKeeper instances.
    @NameInMap("SnapshotCount")
    public String snapshotCount;

    // The connection timeout period of the instance. This parameter is valid for ZooKeeper instances. Unit: seconds.
    @NameInMap("SyncLimit")
    public String syncLimit;

    // The time unit. This parameter is valid for ZooKeeper instances. Default value: 2000. Unit: milliseconds.
    @NameInMap("TickTime")
    public String tickTime;

    // The name of the user.
    // 
    // > You must specify this parameter if OpenSuperAcl is set to true.
    @NameInMap("UserName")
    public String userName;

    public static UpdateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigRequest self = new UpdateConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateConfigRequest setAutopurgePurgeInterval(String autopurgePurgeInterval) {
        this.autopurgePurgeInterval = autopurgePurgeInterval;
        return this;
    }
    public String getAutopurgePurgeInterval() {
        return this.autopurgePurgeInterval;
    }

    public UpdateConfigRequest setAutopurgeSnapRetainCount(String autopurgeSnapRetainCount) {
        this.autopurgeSnapRetainCount = autopurgeSnapRetainCount;
        return this;
    }
    public String getAutopurgeSnapRetainCount() {
        return this.autopurgeSnapRetainCount;
    }

    public UpdateConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateConfigRequest setConfigAuthEnabled(Boolean configAuthEnabled) {
        this.configAuthEnabled = configAuthEnabled;
        return this;
    }
    public Boolean getConfigAuthEnabled() {
        return this.configAuthEnabled;
    }

    public UpdateConfigRequest setConfigSecretEnabled(Boolean configSecretEnabled) {
        this.configSecretEnabled = configSecretEnabled;
        return this;
    }
    public Boolean getConfigSecretEnabled() {
        return this.configSecretEnabled;
    }

    public UpdateConfigRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public UpdateConfigRequest setInitLimit(String initLimit) {
        this.initLimit = initLimit;
        return this;
    }
    public String getInitLimit() {
        return this.initLimit;
    }

    public UpdateConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateConfigRequest setJuteMaxbuffer(String juteMaxbuffer) {
        this.juteMaxbuffer = juteMaxbuffer;
        return this;
    }
    public String getJuteMaxbuffer() {
        return this.juteMaxbuffer;
    }

    public UpdateConfigRequest setMCPEnabled(Boolean MCPEnabled) {
        this.MCPEnabled = MCPEnabled;
        return this;
    }
    public Boolean getMCPEnabled() {
        return this.MCPEnabled;
    }

    public UpdateConfigRequest setMaxClientCnxns(String maxClientCnxns) {
        this.maxClientCnxns = maxClientCnxns;
        return this;
    }
    public String getMaxClientCnxns() {
        return this.maxClientCnxns;
    }

    public UpdateConfigRequest setMaxSessionTimeout(String maxSessionTimeout) {
        this.maxSessionTimeout = maxSessionTimeout;
        return this;
    }
    public String getMaxSessionTimeout() {
        return this.maxSessionTimeout;
    }

    public UpdateConfigRequest setMinSessionTimeout(String minSessionTimeout) {
        this.minSessionTimeout = minSessionTimeout;
        return this;
    }
    public String getMinSessionTimeout() {
        return this.minSessionTimeout;
    }

    public UpdateConfigRequest setNamingAuthEnabled(Boolean namingAuthEnabled) {
        this.namingAuthEnabled = namingAuthEnabled;
        return this;
    }
    public Boolean getNamingAuthEnabled() {
        return this.namingAuthEnabled;
    }

    public UpdateConfigRequest setOpenSuperAcl(String openSuperAcl) {
        this.openSuperAcl = openSuperAcl;
        return this;
    }
    public String getOpenSuperAcl() {
        return this.openSuperAcl;
    }

    public UpdateConfigRequest setPassWord(String passWord) {
        this.passWord = passWord;
        return this;
    }
    public String getPassWord() {
        return this.passWord;
    }

    public UpdateConfigRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public UpdateConfigRequest setSnapshotCount(String snapshotCount) {
        this.snapshotCount = snapshotCount;
        return this;
    }
    public String getSnapshotCount() {
        return this.snapshotCount;
    }

    public UpdateConfigRequest setSyncLimit(String syncLimit) {
        this.syncLimit = syncLimit;
        return this;
    }
    public String getSyncLimit() {
        return this.syncLimit;
    }

    public UpdateConfigRequest setTickTime(String tickTime) {
        this.tickTime = tickTime;
        return this;
    }
    public String getTickTime() {
        return this.tickTime;
    }

    public UpdateConfigRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
