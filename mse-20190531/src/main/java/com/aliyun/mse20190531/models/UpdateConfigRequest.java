// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateConfigRequest extends TeaModel {
    @NameInMap("RequestPars")
    public String requestPars;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ConfigType")
    public String configType;

    @NameInMap("TickTime")
    public String tickTime;

    @NameInMap("InitLimit")
    public String initLimit;

    @NameInMap("SyncLimit")
    public String syncLimit;

    @NameInMap("MaxClientCnxns")
    public String maxClientCnxns;

    @NameInMap("OpenSuperAcl")
    public String openSuperAcl;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("PassWord")
    public String passWord;

    @NameInMap("JuteMaxbuffer")
    public String juteMaxbuffer;

    @NameInMap("AutopurgePurgeInterval")
    public String autopurgePurgeInterval;

    @NameInMap("AutopurgeSnapRetainCount")
    public String autopurgeSnapRetainCount;

    @NameInMap("ConfigAuthEnabled")
    public Boolean configAuthEnabled;

    @NameInMap("MCPEnabled")
    public Boolean MCPEnabled;

    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigRequest self = new UpdateConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public UpdateConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateConfigRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public UpdateConfigRequest setTickTime(String tickTime) {
        this.tickTime = tickTime;
        return this;
    }
    public String getTickTime() {
        return this.tickTime;
    }

    public UpdateConfigRequest setInitLimit(String initLimit) {
        this.initLimit = initLimit;
        return this;
    }
    public String getInitLimit() {
        return this.initLimit;
    }

    public UpdateConfigRequest setSyncLimit(String syncLimit) {
        this.syncLimit = syncLimit;
        return this;
    }
    public String getSyncLimit() {
        return this.syncLimit;
    }

    public UpdateConfigRequest setMaxClientCnxns(String maxClientCnxns) {
        this.maxClientCnxns = maxClientCnxns;
        return this;
    }
    public String getMaxClientCnxns() {
        return this.maxClientCnxns;
    }

    public UpdateConfigRequest setOpenSuperAcl(String openSuperAcl) {
        this.openSuperAcl = openSuperAcl;
        return this;
    }
    public String getOpenSuperAcl() {
        return this.openSuperAcl;
    }

    public UpdateConfigRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public UpdateConfigRequest setPassWord(String passWord) {
        this.passWord = passWord;
        return this;
    }
    public String getPassWord() {
        return this.passWord;
    }

    public UpdateConfigRequest setJuteMaxbuffer(String juteMaxbuffer) {
        this.juteMaxbuffer = juteMaxbuffer;
        return this;
    }
    public String getJuteMaxbuffer() {
        return this.juteMaxbuffer;
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

    public UpdateConfigRequest setConfigAuthEnabled(Boolean configAuthEnabled) {
        this.configAuthEnabled = configAuthEnabled;
        return this;
    }
    public Boolean getConfigAuthEnabled() {
        return this.configAuthEnabled;
    }

    public UpdateConfigRequest setMCPEnabled(Boolean MCPEnabled) {
        this.MCPEnabled = MCPEnabled;
        return this;
    }
    public Boolean getMCPEnabled() {
        return this.MCPEnabled;
    }

    public UpdateConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
