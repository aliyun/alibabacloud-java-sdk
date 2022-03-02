// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class EnableReplicationRequest extends TeaModel {
    // 恢复点策略
    @NameInMap("CrashConsistentPointPolicy")
    public String crashConsistentPointPolicy;

    // 恢复网络VSwitch ID
    @NameInMap("RecoveryNetwork")
    public String recoveryNetwork;

    // 复制网络VSwitch ID
    @NameInMap("ReplicationNetwork")
    public String replicationNetwork;

    // 复影实例是否使用ESSD云盘
    @NameInMap("ReplicationUseEssd")
    public Boolean replicationUseEssd;

    // 复影实例是否使用SSD云盘
    @NameInMap("ReplicationUseSsd")
    public Boolean replicationUseSsd;

    // 受保护服务器ID
    @NameInMap("ServerId")
    public String serverId;

    public static EnableReplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableReplicationRequest self = new EnableReplicationRequest();
        return TeaModel.build(map, self);
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

    public EnableReplicationRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
