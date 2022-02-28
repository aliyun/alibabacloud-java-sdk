// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReversedRegisterServerRequest extends TeaModel {
    @NameInMap("AgentVersion")
    public String agentVersion;

    @NameInMap("BootMode")
    public String bootMode;

    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("Disks")
    public String disks;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("Hostname")
    public String hostname;

    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("Memory")
    public Long memory;

    @NameInMap("OsDetail")
    public String osDetail;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("UserUid")
    public Long userUid;

    @NameInMap("Volumes")
    public String volumes;

    public static ReversedRegisterServerRequest build(java.util.Map<String, ?> map) throws Exception {
        ReversedRegisterServerRequest self = new ReversedRegisterServerRequest();
        return TeaModel.build(map, self);
    }

    public ReversedRegisterServerRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public ReversedRegisterServerRequest setBootMode(String bootMode) {
        this.bootMode = bootMode;
        return this;
    }
    public String getBootMode() {
        return this.bootMode;
    }

    public ReversedRegisterServerRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public ReversedRegisterServerRequest setDisks(String disks) {
        this.disks = disks;
        return this;
    }
    public String getDisks() {
        return this.disks;
    }

    public ReversedRegisterServerRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ReversedRegisterServerRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public ReversedRegisterServerRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public ReversedRegisterServerRequest setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

    public ReversedRegisterServerRequest setOsDetail(String osDetail) {
        this.osDetail = osDetail;
        return this;
    }
    public String getOsDetail() {
        return this.osDetail;
    }

    public ReversedRegisterServerRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public ReversedRegisterServerRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReversedRegisterServerRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public ReversedRegisterServerRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

    public ReversedRegisterServerRequest setVolumes(String volumes) {
        this.volumes = volumes;
        return this;
    }
    public String getVolumes() {
        return this.volumes;
    }

}
