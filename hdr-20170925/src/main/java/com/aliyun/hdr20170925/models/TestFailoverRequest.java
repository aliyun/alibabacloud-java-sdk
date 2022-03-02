// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class TestFailoverRequest extends TeaModel {
    // 演练实例绑定的弹性公网IP ID
    @NameInMap("EipAddressId")
    public String eipAddressId;

    // 演练实例的CPU核数
    @NameInMap("RecoveryCpu")
    public Integer recoveryCpu;

    // 演练的实例名称
    @NameInMap("RecoveryInstanceName")
    public String recoveryInstanceName;

    // 演练的实例规格，未指定时按照指定的CPU核数、内存大小自动寻找可用规格
    @NameInMap("RecoveryInstanceType")
    public String recoveryInstanceType;

    // 演练实例的IP
    @NameInMap("RecoveryIpAddress")
    public String recoveryIpAddress;

    // 演练实例的内存大小，单位MB
    @NameInMap("RecoveryMemory")
    public Long recoveryMemory;

    // 演练实例所在的VSwitch ID
    @NameInMap("RecoveryNetwork")
    public String recoveryNetwork;

    // 演练实例使用的恢复点ID
    @NameInMap("RecoveryPointId")
    public String recoveryPointId;

    @NameInMap("RecoveryPointTime")
    public Long recoveryPointTime;

    // 演练实例启动后执行脚本
    @NameInMap("RecoveryPostScriptContent")
    public String recoveryPostScriptContent;

    // 演练实例启动后执行脚本类型，可选项：SHELL
    @NameInMap("RecoveryPostScriptType")
    public String recoveryPostScriptType;

    // 演练实例是否保留源机的IP（需要演练所在的VSwitch包含相应网段）
    @NameInMap("RecoveryReserveIp")
    public Boolean recoveryReserveIp;

    // 演练实例是否使用DHCP指定IP
    @NameInMap("RecoveryUseDhcp")
    public Boolean recoveryUseDhcp;

    // 演练实例是否使用ESSD类型的云盘
    @NameInMap("RecoveryUseEssd")
    public Boolean recoveryUseEssd;

    // 演练实例是否使用SSD类型的云盘
    @NameInMap("RecoveryUseSsd")
    public Boolean recoveryUseSsd;

    @NameInMap("SecurityToken")
    public String securityToken;

    // 受保护服务器ID
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
