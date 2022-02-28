// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class RegisterServerRequest extends TeaModel {
    @NameInMap("AgentPort")
    public Integer agentPort;

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

    @NameInMap("SiteId")
    public String siteId;

    @NameInMap("UserUid")
    public Long userUid;

    @NameInMap("Volumes")
    public String volumes;

    public static RegisterServerRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterServerRequest self = new RegisterServerRequest();
        return TeaModel.build(map, self);
    }

    public RegisterServerRequest setAgentPort(Integer agentPort) {
        this.agentPort = agentPort;
        return this;
    }
    public Integer getAgentPort() {
        return this.agentPort;
    }

    public RegisterServerRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public RegisterServerRequest setBootMode(String bootMode) {
        this.bootMode = bootMode;
        return this;
    }
    public String getBootMode() {
        return this.bootMode;
    }

    public RegisterServerRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public RegisterServerRequest setDisks(String disks) {
        this.disks = disks;
        return this;
    }
    public String getDisks() {
        return this.disks;
    }

    public RegisterServerRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public RegisterServerRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public RegisterServerRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public RegisterServerRequest setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

    public RegisterServerRequest setOsDetail(String osDetail) {
        this.osDetail = osDetail;
        return this;
    }
    public String getOsDetail() {
        return this.osDetail;
    }

    public RegisterServerRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public RegisterServerRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RegisterServerRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public RegisterServerRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public RegisterServerRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

    public RegisterServerRequest setVolumes(String volumes) {
        this.volumes = volumes;
        return this;
    }
    public String getVolumes() {
        return this.volumes;
    }

}
