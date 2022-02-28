// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class FailbackRequest extends TeaModel {
    @NameInMap("RecoveryComputeResource")
    public String recoveryComputeResource;

    @NameInMap("RecoveryCpu")
    public Integer recoveryCpu;

    @NameInMap("RecoveryDatastore")
    public String recoveryDatastore;

    @NameInMap("RecoveryDns")
    public String recoveryDns;

    @NameInMap("RecoveryGateway")
    public String recoveryGateway;

    @NameInMap("RecoveryInfrastructureId")
    public String recoveryInfrastructureId;

    @NameInMap("RecoveryInstanceName")
    public String recoveryInstanceName;

    @NameInMap("RecoveryInstanceType")
    public String recoveryInstanceType;

    @NameInMap("RecoveryIpAddress")
    public String recoveryIpAddress;

    @NameInMap("RecoveryLocation")
    public String recoveryLocation;

    @NameInMap("RecoveryMemory")
    public Long recoveryMemory;

    @NameInMap("RecoveryNetMask")
    public String recoveryNetMask;

    @NameInMap("RecoveryNetwork")
    public String recoveryNetwork;

    @NameInMap("RecoveryPointId")
    public String recoveryPointId;

    @NameInMap("RecoveryPostScriptContent")
    public String recoveryPostScriptContent;

    @NameInMap("RecoveryPostScriptType")
    public String recoveryPostScriptType;

    @NameInMap("RecoveryReserveIp")
    public Boolean recoveryReserveIp;

    @NameInMap("RecoveryUseDhcp")
    public Boolean recoveryUseDhcp;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("UserUid")
    public Long userUid;

    public static FailbackRequest build(java.util.Map<String, ?> map) throws Exception {
        FailbackRequest self = new FailbackRequest();
        return TeaModel.build(map, self);
    }

    public FailbackRequest setRecoveryComputeResource(String recoveryComputeResource) {
        this.recoveryComputeResource = recoveryComputeResource;
        return this;
    }
    public String getRecoveryComputeResource() {
        return this.recoveryComputeResource;
    }

    public FailbackRequest setRecoveryCpu(Integer recoveryCpu) {
        this.recoveryCpu = recoveryCpu;
        return this;
    }
    public Integer getRecoveryCpu() {
        return this.recoveryCpu;
    }

    public FailbackRequest setRecoveryDatastore(String recoveryDatastore) {
        this.recoveryDatastore = recoveryDatastore;
        return this;
    }
    public String getRecoveryDatastore() {
        return this.recoveryDatastore;
    }

    public FailbackRequest setRecoveryDns(String recoveryDns) {
        this.recoveryDns = recoveryDns;
        return this;
    }
    public String getRecoveryDns() {
        return this.recoveryDns;
    }

    public FailbackRequest setRecoveryGateway(String recoveryGateway) {
        this.recoveryGateway = recoveryGateway;
        return this;
    }
    public String getRecoveryGateway() {
        return this.recoveryGateway;
    }

    public FailbackRequest setRecoveryInfrastructureId(String recoveryInfrastructureId) {
        this.recoveryInfrastructureId = recoveryInfrastructureId;
        return this;
    }
    public String getRecoveryInfrastructureId() {
        return this.recoveryInfrastructureId;
    }

    public FailbackRequest setRecoveryInstanceName(String recoveryInstanceName) {
        this.recoveryInstanceName = recoveryInstanceName;
        return this;
    }
    public String getRecoveryInstanceName() {
        return this.recoveryInstanceName;
    }

    public FailbackRequest setRecoveryInstanceType(String recoveryInstanceType) {
        this.recoveryInstanceType = recoveryInstanceType;
        return this;
    }
    public String getRecoveryInstanceType() {
        return this.recoveryInstanceType;
    }

    public FailbackRequest setRecoveryIpAddress(String recoveryIpAddress) {
        this.recoveryIpAddress = recoveryIpAddress;
        return this;
    }
    public String getRecoveryIpAddress() {
        return this.recoveryIpAddress;
    }

    public FailbackRequest setRecoveryLocation(String recoveryLocation) {
        this.recoveryLocation = recoveryLocation;
        return this;
    }
    public String getRecoveryLocation() {
        return this.recoveryLocation;
    }

    public FailbackRequest setRecoveryMemory(Long recoveryMemory) {
        this.recoveryMemory = recoveryMemory;
        return this;
    }
    public Long getRecoveryMemory() {
        return this.recoveryMemory;
    }

    public FailbackRequest setRecoveryNetMask(String recoveryNetMask) {
        this.recoveryNetMask = recoveryNetMask;
        return this;
    }
    public String getRecoveryNetMask() {
        return this.recoveryNetMask;
    }

    public FailbackRequest setRecoveryNetwork(String recoveryNetwork) {
        this.recoveryNetwork = recoveryNetwork;
        return this;
    }
    public String getRecoveryNetwork() {
        return this.recoveryNetwork;
    }

    public FailbackRequest setRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
        return this;
    }
    public String getRecoveryPointId() {
        return this.recoveryPointId;
    }

    public FailbackRequest setRecoveryPostScriptContent(String recoveryPostScriptContent) {
        this.recoveryPostScriptContent = recoveryPostScriptContent;
        return this;
    }
    public String getRecoveryPostScriptContent() {
        return this.recoveryPostScriptContent;
    }

    public FailbackRequest setRecoveryPostScriptType(String recoveryPostScriptType) {
        this.recoveryPostScriptType = recoveryPostScriptType;
        return this;
    }
    public String getRecoveryPostScriptType() {
        return this.recoveryPostScriptType;
    }

    public FailbackRequest setRecoveryReserveIp(Boolean recoveryReserveIp) {
        this.recoveryReserveIp = recoveryReserveIp;
        return this;
    }
    public Boolean getRecoveryReserveIp() {
        return this.recoveryReserveIp;
    }

    public FailbackRequest setRecoveryUseDhcp(Boolean recoveryUseDhcp) {
        this.recoveryUseDhcp = recoveryUseDhcp;
        return this;
    }
    public Boolean getRecoveryUseDhcp() {
        return this.recoveryUseDhcp;
    }

    public FailbackRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public FailbackRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public FailbackRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
