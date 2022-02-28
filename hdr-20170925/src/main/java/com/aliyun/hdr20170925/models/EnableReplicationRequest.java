// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class EnableReplicationRequest extends TeaModel {
    @NameInMap("AppConsistentPointPolicy")
    public String appConsistentPointPolicy;

    @NameInMap("AutoResynchronize")
    public Boolean autoResynchronize;

    @NameInMap("CrashConsistentPointPolicy")
    public String crashConsistentPointPolicy;

    @NameInMap("RecoveryNetwork")
    public String recoveryNetwork;

    @NameInMap("ReplicationNetwork")
    public String replicationNetwork;

    @NameInMap("ReplicationUseEssd")
    public Boolean replicationUseEssd;

    @NameInMap("ReplicationUseSsd")
    public Boolean replicationUseSsd;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("ShadowInstanceType")
    public String shadowInstanceType;

    public static EnableReplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableReplicationRequest self = new EnableReplicationRequest();
        return TeaModel.build(map, self);
    }

    public EnableReplicationRequest setAppConsistentPointPolicy(String appConsistentPointPolicy) {
        this.appConsistentPointPolicy = appConsistentPointPolicy;
        return this;
    }
    public String getAppConsistentPointPolicy() {
        return this.appConsistentPointPolicy;
    }

    public EnableReplicationRequest setAutoResynchronize(Boolean autoResynchronize) {
        this.autoResynchronize = autoResynchronize;
        return this;
    }
    public Boolean getAutoResynchronize() {
        return this.autoResynchronize;
    }

    public EnableReplicationRequest setCrashConsistentPointPolicy(String crashConsistentPointPolicy) {
        this.crashConsistentPointPolicy = crashConsistentPointPolicy;
        return this;
    }
    public String getCrashConsistentPointPolicy() {
        return this.crashConsistentPointPolicy;
    }

    public EnableReplicationRequest setRecoveryNetwork(String recoveryNetwork) {
        this.recoveryNetwork = recoveryNetwork;
        return this;
    }
    public String getRecoveryNetwork() {
        return this.recoveryNetwork;
    }

    public EnableReplicationRequest setReplicationNetwork(String replicationNetwork) {
        this.replicationNetwork = replicationNetwork;
        return this;
    }
    public String getReplicationNetwork() {
        return this.replicationNetwork;
    }

    public EnableReplicationRequest setReplicationUseEssd(Boolean replicationUseEssd) {
        this.replicationUseEssd = replicationUseEssd;
        return this;
    }
    public Boolean getReplicationUseEssd() {
        return this.replicationUseEssd;
    }

    public EnableReplicationRequest setReplicationUseSsd(Boolean replicationUseSsd) {
        this.replicationUseSsd = replicationUseSsd;
        return this;
    }
    public Boolean getReplicationUseSsd() {
        return this.replicationUseSsd;
    }

    public EnableReplicationRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public EnableReplicationRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public EnableReplicationRequest setShadowInstanceType(String shadowInstanceType) {
        this.shadowInstanceType = shadowInstanceType;
        return this;
    }
    public String getShadowInstanceType() {
        return this.shadowInstanceType;
    }

}
