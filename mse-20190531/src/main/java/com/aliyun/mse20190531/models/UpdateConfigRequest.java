// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateConfigRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AutopurgePurgeInterval")
    public String autopurgePurgeInterval;

    @NameInMap("AutopurgeSnapRetainCount")
    public String autopurgeSnapRetainCount;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ConfigAuthEnabled")
    public Boolean configAuthEnabled;

    @NameInMap("ConfigSecretEnabled")
    public Boolean configSecretEnabled;

    @NameInMap("ConfigType")
    public String configType;

    @NameInMap("EurekaSupported")
    public Boolean eurekaSupported;

    @NameInMap("ExtendedTypesEnable")
    public String extendedTypesEnable;

    @NameInMap("InitLimit")
    public String initLimit;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JuteMaxbuffer")
    public String juteMaxbuffer;

    @NameInMap("MCPEnabled")
    public Boolean MCPEnabled;

    @NameInMap("MaxClientCnxns")
    public String maxClientCnxns;

    @NameInMap("MaxSessionTimeout")
    public String maxSessionTimeout;

    @NameInMap("MinSessionTimeout")
    public String minSessionTimeout;

    @NameInMap("NamingAuthEnabled")
    public Boolean namingAuthEnabled;

    @NameInMap("OpenSuperAcl")
    public String openSuperAcl;

    @NameInMap("PassWord")
    public String passWord;

    @NameInMap("RequestPars")
    public String requestPars;

    @NameInMap("SnapshotCount")
    public String snapshotCount;

    @NameInMap("SyncLimit")
    public String syncLimit;

    @NameInMap("TickTime")
    public String tickTime;

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

    public UpdateConfigRequest setEurekaSupported(Boolean eurekaSupported) {
        this.eurekaSupported = eurekaSupported;
        return this;
    }
    public Boolean getEurekaSupported() {
        return this.eurekaSupported;
    }

    public UpdateConfigRequest setExtendedTypesEnable(String extendedTypesEnable) {
        this.extendedTypesEnable = extendedTypesEnable;
        return this;
    }
    public String getExtendedTypesEnable() {
        return this.extendedTypesEnable;
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
