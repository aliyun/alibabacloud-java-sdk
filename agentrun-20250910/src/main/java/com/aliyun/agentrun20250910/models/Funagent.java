// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class Funagent extends TeaModel {
    @NameInMap("adminName")
    public String adminName;

    /**
     * <p>敏感；响应中应脱敏</p>
     */
    @NameInMap("adminSecret")
    public String adminSecret;

    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>ISO 8601</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("dbConnections")
    public Integer dbConnections;

    @NameInMap("dbHost")
    public String dbHost;

    @NameInMap("dbName")
    public String dbName;

    /**
     * <p>敏感；响应中应脱敏</p>
     */
    @NameInMap("dbPassword")
    public String dbPassword;

    @NameInMap("dbPort")
    public Integer dbPort;

    @NameInMap("dbType")
    public String dbType;

    @NameInMap("dbUsername")
    public String dbUsername;

    @NameInMap("description")
    public String description;

    @NameInMap("endpoint")
    public String endpoint;

    /**
     * <p>UUID 字符串</p>
     */
    @NameInMap("funagentId")
    public String funagentId;

    @NameInMap("funagentName")
    public String funagentName;

    @NameInMap("imageUrl")
    public String imageUrl;

    @NameInMap("memory")
    public Integer memory;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("replicas")
    public Integer replicas;

    @NameInMap("securityGroupId")
    public String securityGroupId;

    @NameInMap("status")
    public String status;

    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>ISO 8601</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    @NameInMap("version")
    public String version;

    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <p>与存储一致时为 JSON 字符串</p>
     */
    @NameInMap("vswitchIds")
    public String vswitchIds;

    public static Funagent build(java.util.Map<String, ?> map) throws Exception {
        Funagent self = new Funagent();
        return TeaModel.build(map, self);
    }

    public Funagent setAdminName(String adminName) {
        this.adminName = adminName;
        return this;
    }
    public String getAdminName() {
        return this.adminName;
    }

    public Funagent setAdminSecret(String adminSecret) {
        this.adminSecret = adminSecret;
        return this;
    }
    public String getAdminSecret() {
        return this.adminSecret;
    }

    public Funagent setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public Funagent setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Funagent setDbConnections(Integer dbConnections) {
        this.dbConnections = dbConnections;
        return this;
    }
    public Integer getDbConnections() {
        return this.dbConnections;
    }

    public Funagent setDbHost(String dbHost) {
        this.dbHost = dbHost;
        return this;
    }
    public String getDbHost() {
        return this.dbHost;
    }

    public Funagent setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public Funagent setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }
    public String getDbPassword() {
        return this.dbPassword;
    }

    public Funagent setDbPort(Integer dbPort) {
        this.dbPort = dbPort;
        return this;
    }
    public Integer getDbPort() {
        return this.dbPort;
    }

    public Funagent setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public Funagent setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
        return this;
    }
    public String getDbUsername() {
        return this.dbUsername;
    }

    public Funagent setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Funagent setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public Funagent setFunagentId(String funagentId) {
        this.funagentId = funagentId;
        return this;
    }
    public String getFunagentId() {
        return this.funagentId;
    }

    public Funagent setFunagentName(String funagentName) {
        this.funagentName = funagentName;
        return this;
    }
    public String getFunagentName() {
        return this.funagentName;
    }

    public Funagent setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public Funagent setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public Funagent setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public Funagent setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public Funagent setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public Funagent setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Funagent setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public Funagent setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public Funagent setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public Funagent setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public Funagent setVswitchIds(String vswitchIds) {
        this.vswitchIds = vswitchIds;
        return this;
    }
    public String getVswitchIds() {
        return this.vswitchIds;
    }

}
