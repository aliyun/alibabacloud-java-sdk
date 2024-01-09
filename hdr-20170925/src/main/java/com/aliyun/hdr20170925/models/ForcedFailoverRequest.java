// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ForcedFailoverRequest extends TeaModel {
    @NameInMap("EipAddressId")
    public String eipAddressId;

    @NameInMap("RecoveryCpu")
    public Integer recoveryCpu;

    @NameInMap("RecoveryEssdPerformanceLevel")
    public String recoveryEssdPerformanceLevel;

    @NameInMap("RecoveryInstanceName")
    public String recoveryInstanceName;

    @NameInMap("RecoveryInstanceType")
    public String recoveryInstanceType;

    @NameInMap("RecoveryIpAddress")
    public String recoveryIpAddress;

    @NameInMap("RecoveryMemory")
    public Long recoveryMemory;

    @NameInMap("RecoveryNetwork")
    public String recoveryNetwork;

    @NameInMap("RecoveryPointId")
    public String recoveryPointId;

    @NameInMap("RecoveryPointTime")
    public Long recoveryPointTime;

    @NameInMap("RecoveryPostScriptContent")
    public String recoveryPostScriptContent;

    @NameInMap("RecoveryPostScriptType")
    public String recoveryPostScriptType;

    @NameInMap("RecoveryReserveIp")
    public Boolean recoveryReserveIp;

    @NameInMap("RecoveryUseDhcp")
    public Boolean recoveryUseDhcp;

    @NameInMap("RecoveryUseEssd")
    public Boolean recoveryUseEssd;

    @NameInMap("RecoveryUseSsd")
    public Boolean recoveryUseSsd;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerId")
    public String serverId;

    public static ForcedFailoverRequest build(java.util.Map<String, ?> map) throws Exception {
        ForcedFailoverRequest self = new ForcedFailoverRequest();
        return TeaModel.build(map, self);
    }

    public ForcedFailoverRequest setEipAddressId(String eipAddressId) {
        this.eipAddressId = eipAddressId;
        return this;
    }
    public String getEipAddressId() {
        return this.eipAddressId;
    }

    public ForcedFailoverRequest setRecoveryCpu(Integer recoveryCpu) {
        this.recoveryCpu = recoveryCpu;
        return this;
    }
    public Integer getRecoveryCpu() {
        return this.recoveryCpu;
    }

    public ForcedFailoverRequest setRecoveryEssdPerformanceLevel(String recoveryEssdPerformanceLevel) {
        this.recoveryEssdPerformanceLevel = recoveryEssdPerformanceLevel;
        return this;
    }
    public String getRecoveryEssdPerformanceLevel() {
        return this.recoveryEssdPerformanceLevel;
    }

    public ForcedFailoverRequest setRecoveryInstanceName(String recoveryInstanceName) {
        this.recoveryInstanceName = recoveryInstanceName;
        return this;
    }
    public String getRecoveryInstanceName() {
        return this.recoveryInstanceName;
    }

    public ForcedFailoverRequest setRecoveryInstanceType(String recoveryInstanceType) {
        this.recoveryInstanceType = recoveryInstanceType;
        return this;
    }
    public String getRecoveryInstanceType() {
        return this.recoveryInstanceType;
    }

    public ForcedFailoverRequest setRecoveryIpAddress(String recoveryIpAddress) {
        this.recoveryIpAddress = recoveryIpAddress;
        return this;
    }
    public String getRecoveryIpAddress() {
        return this.recoveryIpAddress;
    }

    public ForcedFailoverRequest setRecoveryMemory(Long recoveryMemory) {
        this.recoveryMemory = recoveryMemory;
        return this;
    }
    public Long getRecoveryMemory() {
        return this.recoveryMemory;
    }

    public ForcedFailoverRequest setRecoveryNetwork(String recoveryNetwork) {
        this.recoveryNetwork = recoveryNetwork;
        return this;
    }
    public String getRecoveryNetwork() {
        return this.recoveryNetwork;
    }

    public ForcedFailoverRequest setRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
        return this;
    }
    public String getRecoveryPointId() {
        return this.recoveryPointId;
    }

    public ForcedFailoverRequest setRecoveryPointTime(Long recoveryPointTime) {
        this.recoveryPointTime = recoveryPointTime;
        return this;
    }
    public Long getRecoveryPointTime() {
        return this.recoveryPointTime;
    }

    public ForcedFailoverRequest setRecoveryPostScriptContent(String recoveryPostScriptContent) {
        this.recoveryPostScriptContent = recoveryPostScriptContent;
        return this;
    }
    public String getRecoveryPostScriptContent() {
        return this.recoveryPostScriptContent;
    }

    public ForcedFailoverRequest setRecoveryPostScriptType(String recoveryPostScriptType) {
        this.recoveryPostScriptType = recoveryPostScriptType;
        return this;
    }
    public String getRecoveryPostScriptType() {
        return this.recoveryPostScriptType;
    }

    public ForcedFailoverRequest setRecoveryReserveIp(Boolean recoveryReserveIp) {
        this.recoveryReserveIp = recoveryReserveIp;
        return this;
    }
    public Boolean getRecoveryReserveIp() {
        return this.recoveryReserveIp;
    }

    public ForcedFailoverRequest setRecoveryUseDhcp(Boolean recoveryUseDhcp) {
        this.recoveryUseDhcp = recoveryUseDhcp;
        return this;
    }
    public Boolean getRecoveryUseDhcp() {
        return this.recoveryUseDhcp;
    }

    public ForcedFailoverRequest setRecoveryUseEssd(Boolean recoveryUseEssd) {
        this.recoveryUseEssd = recoveryUseEssd;
        return this;
    }
    public Boolean getRecoveryUseEssd() {
        return this.recoveryUseEssd;
    }

    public ForcedFailoverRequest setRecoveryUseSsd(Boolean recoveryUseSsd) {
        this.recoveryUseSsd = recoveryUseSsd;
        return this;
    }
    public Boolean getRecoveryUseSsd() {
        return this.recoveryUseSsd;
    }

    public ForcedFailoverRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ForcedFailoverRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
