// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReversedEnableReplicationRequest extends TeaModel {
    /**
     * <p>-</p>
     */
    @NameInMap("AppConsistentPointPolicy")
    public String appConsistentPointPolicy;

    /**
     * <p>-</p>
     */
    @NameInMap("CrashConsistentPointPolicy")
    public String crashConsistentPointPolicy;

    @NameInMap("RecoveryNetwork")
    public String recoveryNetwork;

    /**
     * <p>-</p>
     */
    @NameInMap("ReplicationComputeResource")
    public String replicationComputeResource;

    /**
     * <p>-</p>
     */
    @NameInMap("ReplicationDatastore")
    public String replicationDatastore;

    /**
     * <p>-</p>
     */
    @NameInMap("ReplicationDns")
    public String replicationDns;

    /**
     * <p>-</p>
     */
    @NameInMap("ReplicationGateway")
    public String replicationGateway;

    @NameInMap("ReplicationInfrastructureId")
    public String replicationInfrastructureId;

    /**
     * <p>-</p>
     */
    @NameInMap("ReplicationIpAddress")
    public String replicationIpAddress;

    /**
     * <p>-</p>
     */
    @NameInMap("ReplicationLocation")
    public String replicationLocation;

    /**
     * <p>-</p>
     */
    @NameInMap("ReplicationNetMask")
    public String replicationNetMask;

    @NameInMap("ReplicationNetwork")
    public String replicationNetwork;

    /**
     * <p>-</p>
     */
    @NameInMap("ReplicationUseDhcp")
    public Boolean replicationUseDhcp;

    @NameInMap("ReplicationUseOriginalInstance")
    public Boolean replicationUseOriginalInstance;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerId")
    public String serverId;

    /**
     * <p>-</p>
     */
    @NameInMap("ShadowInstanceType")
    public String shadowInstanceType;

    public static ReversedEnableReplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ReversedEnableReplicationRequest self = new ReversedEnableReplicationRequest();
        return TeaModel.build(map, self);
    }

    public ReversedEnableReplicationRequest setAppConsistentPointPolicy(String appConsistentPointPolicy) {
        this.appConsistentPointPolicy = appConsistentPointPolicy;
        return this;
    }
    public String getAppConsistentPointPolicy() {
        return this.appConsistentPointPolicy;
    }

    public ReversedEnableReplicationRequest setCrashConsistentPointPolicy(String crashConsistentPointPolicy) {
        this.crashConsistentPointPolicy = crashConsistentPointPolicy;
        return this;
    }
    public String getCrashConsistentPointPolicy() {
        return this.crashConsistentPointPolicy;
    }

    public ReversedEnableReplicationRequest setRecoveryNetwork(String recoveryNetwork) {
        this.recoveryNetwork = recoveryNetwork;
        return this;
    }
    public String getRecoveryNetwork() {
        return this.recoveryNetwork;
    }

    public ReversedEnableReplicationRequest setReplicationComputeResource(String replicationComputeResource) {
        this.replicationComputeResource = replicationComputeResource;
        return this;
    }
    public String getReplicationComputeResource() {
        return this.replicationComputeResource;
    }

    public ReversedEnableReplicationRequest setReplicationDatastore(String replicationDatastore) {
        this.replicationDatastore = replicationDatastore;
        return this;
    }
    public String getReplicationDatastore() {
        return this.replicationDatastore;
    }

    public ReversedEnableReplicationRequest setReplicationDns(String replicationDns) {
        this.replicationDns = replicationDns;
        return this;
    }
    public String getReplicationDns() {
        return this.replicationDns;
    }

    public ReversedEnableReplicationRequest setReplicationGateway(String replicationGateway) {
        this.replicationGateway = replicationGateway;
        return this;
    }
    public String getReplicationGateway() {
        return this.replicationGateway;
    }

    public ReversedEnableReplicationRequest setReplicationInfrastructureId(String replicationInfrastructureId) {
        this.replicationInfrastructureId = replicationInfrastructureId;
        return this;
    }
    public String getReplicationInfrastructureId() {
        return this.replicationInfrastructureId;
    }

    public ReversedEnableReplicationRequest setReplicationIpAddress(String replicationIpAddress) {
        this.replicationIpAddress = replicationIpAddress;
        return this;
    }
    public String getReplicationIpAddress() {
        return this.replicationIpAddress;
    }

    public ReversedEnableReplicationRequest setReplicationLocation(String replicationLocation) {
        this.replicationLocation = replicationLocation;
        return this;
    }
    public String getReplicationLocation() {
        return this.replicationLocation;
    }

    public ReversedEnableReplicationRequest setReplicationNetMask(String replicationNetMask) {
        this.replicationNetMask = replicationNetMask;
        return this;
    }
    public String getReplicationNetMask() {
        return this.replicationNetMask;
    }

    public ReversedEnableReplicationRequest setReplicationNetwork(String replicationNetwork) {
        this.replicationNetwork = replicationNetwork;
        return this;
    }
    public String getReplicationNetwork() {
        return this.replicationNetwork;
    }

    public ReversedEnableReplicationRequest setReplicationUseDhcp(Boolean replicationUseDhcp) {
        this.replicationUseDhcp = replicationUseDhcp;
        return this;
    }
    public Boolean getReplicationUseDhcp() {
        return this.replicationUseDhcp;
    }

    public ReversedEnableReplicationRequest setReplicationUseOriginalInstance(Boolean replicationUseOriginalInstance) {
        this.replicationUseOriginalInstance = replicationUseOriginalInstance;
        return this;
    }
    public Boolean getReplicationUseOriginalInstance() {
        return this.replicationUseOriginalInstance;
    }

    public ReversedEnableReplicationRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReversedEnableReplicationRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public ReversedEnableReplicationRequest setShadowInstanceType(String shadowInstanceType) {
        this.shadowInstanceType = shadowInstanceType;
        return this;
    }
    public String getShadowInstanceType() {
        return this.shadowInstanceType;
    }

}
