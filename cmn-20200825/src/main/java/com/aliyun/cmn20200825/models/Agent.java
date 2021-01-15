// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class Agent extends TeaModel {
    // 探针Id
    @NameInMap("AgentId")
    public String agentId;

    // 探针名称
    @NameInMap("AgentName")
    public String agentName;

    // 探针版本
    @NameInMap("AgentVersion")
    public String agentVersion;

    // cpu使用率
    @NameInMap("CpuUsage")
    public String cpuUsage;

    // 磁盘利用率
    @NameInMap("DiskUsage")
    public String diskUsage;

    // 更新时间
    @NameInMap("GmtModify")
    public String gmtModify;

    // 探针IP
    @NameInMap("Ip")
    public String ip;

    // 系统版本
    @NameInMap("KernelVersion")
    public String kernelVersion;

    // 内存使用率
    @NameInMap("MemoryUsage")
    public String memoryUsage;

    // 安全域
    @NameInMap("SecurityDomain")
    public String securityDomain;

    // 探针状态
    @NameInMap("Status")
    public String status;

    public static Agent build(java.util.Map<String, ?> map) throws Exception {
        Agent self = new Agent();
        return TeaModel.build(map, self);
    }

    public Agent setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public Agent setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public Agent setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public Agent setCpuUsage(String cpuUsage) {
        this.cpuUsage = cpuUsage;
        return this;
    }
    public String getCpuUsage() {
        return this.cpuUsage;
    }

    public Agent setDiskUsage(String diskUsage) {
        this.diskUsage = diskUsage;
        return this;
    }
    public String getDiskUsage() {
        return this.diskUsage;
    }

    public Agent setGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
        return this;
    }
    public String getGmtModify() {
        return this.gmtModify;
    }

    public Agent setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public Agent setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
        return this;
    }
    public String getKernelVersion() {
        return this.kernelVersion;
    }

    public Agent setMemoryUsage(String memoryUsage) {
        this.memoryUsage = memoryUsage;
        return this;
    }
    public String getMemoryUsage() {
        return this.memoryUsage;
    }

    public Agent setSecurityDomain(String securityDomain) {
        this.securityDomain = securityDomain;
        return this;
    }
    public String getSecurityDomain() {
        return this.securityDomain;
    }

    public Agent setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
