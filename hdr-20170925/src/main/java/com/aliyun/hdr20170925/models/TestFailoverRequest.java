// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class TestFailoverRequest extends TeaModel {
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

    public static TestFailoverRequest build(java.util.Map<String, ?> map) throws Exception {
        TestFailoverRequest self = new TestFailoverRequest();
        return TeaModel.build(map, self);
    }

    public TestFailoverRequest setEipAddressId(String eipAddressId) {
        this.eipAddressId = eipAddressId;
        return this;
    }
    public String getEipAddressId() {
        return this.eipAddressId;
    }

    public TestFailoverRequest setRecoveryCpu(Integer recoveryCpu) {
        this.recoveryCpu = recoveryCpu;
        return this;
    }
    public Integer getRecoveryCpu() {
        return this.recoveryCpu;
    }

    public TestFailoverRequest setRecoveryEssdPerformanceLevel(String recoveryEssdPerformanceLevel) {
        this.recoveryEssdPerformanceLevel = recoveryEssdPerformanceLevel;
        return this;
    }
    public String getRecoveryEssdPerformanceLevel() {
        return this.recoveryEssdPerformanceLevel;
    }

    public TestFailoverRequest setRecoveryInstanceName(String recoveryInstanceName) {
        this.recoveryInstanceName = recoveryInstanceName;
        return this;
    }
    public String getRecoveryInstanceName() {
        return this.recoveryInstanceName;
    }

    public TestFailoverRequest setRecoveryInstanceType(String recoveryInstanceType) {
        this.recoveryInstanceType = recoveryInstanceType;
        return this;
    }
    public String getRecoveryInstanceType() {
        return this.recoveryInstanceType;
    }

    public TestFailoverRequest setRecoveryIpAddress(String recoveryIpAddress) {
        this.recoveryIpAddress = recoveryIpAddress;
        return this;
    }
    public String getRecoveryIpAddress() {
        return this.recoveryIpAddress;
    }

    public TestFailoverRequest setRecoveryMemory(Long recoveryMemory) {
        this.recoveryMemory = recoveryMemory;
        return this;
    }
    public Long getRecoveryMemory() {
        return this.recoveryMemory;
    }

    public TestFailoverRequest setRecoveryNetwork(String recoveryNetwork) {
        this.recoveryNetwork = recoveryNetwork;
        return this;
    }
    public String getRecoveryNetwork() {
        return this.recoveryNetwork;
    }

    public TestFailoverRequest setRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
        return this;
    }
    public String getRecoveryPointId() {
        return this.recoveryPointId;
    }

    public TestFailoverRequest setRecoveryPointTime(Long recoveryPointTime) {
        this.recoveryPointTime = recoveryPointTime;
        return this;
    }
    public Long getRecoveryPointTime() {
        return this.recoveryPointTime;
    }

    public TestFailoverRequest setRecoveryPostScriptContent(String recoveryPostScriptContent) {
        this.recoveryPostScriptContent = recoveryPostScriptContent;
        return this;
    }
    public String getRecoveryPostScriptContent() {
        return this.recoveryPostScriptContent;
    }

    public TestFailoverRequest setRecoveryPostScriptType(String recoveryPostScriptType) {
        this.recoveryPostScriptType = recoveryPostScriptType;
        return this;
    }
    public String getRecoveryPostScriptType() {
        return this.recoveryPostScriptType;
    }

    public TestFailoverRequest setRecoveryReserveIp(Boolean recoveryReserveIp) {
        this.recoveryReserveIp = recoveryReserveIp;
        return this;
    }
    public Boolean getRecoveryReserveIp() {
        return this.recoveryReserveIp;
    }

    public TestFailoverRequest setRecoveryUseDhcp(Boolean recoveryUseDhcp) {
        this.recoveryUseDhcp = recoveryUseDhcp;
        return this;
    }
    public Boolean getRecoveryUseDhcp() {
        return this.recoveryUseDhcp;
    }

    public TestFailoverRequest setRecoveryUseEssd(Boolean recoveryUseEssd) {
        this.recoveryUseEssd = recoveryUseEssd;
        return this;
    }
    public Boolean getRecoveryUseEssd() {
        return this.recoveryUseEssd;
    }

    public TestFailoverRequest setRecoveryUseSsd(Boolean recoveryUseSsd) {
        this.recoveryUseSsd = recoveryUseSsd;
        return this;
    }
    public Boolean getRecoveryUseSsd() {
        return this.recoveryUseSsd;
    }

    public TestFailoverRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public TestFailoverRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
