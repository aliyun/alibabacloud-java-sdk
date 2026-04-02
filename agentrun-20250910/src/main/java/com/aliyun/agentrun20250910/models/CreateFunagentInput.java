// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateFunagentInput extends TeaModel {
    /**
     * <p><code>string</code>，必填</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("adminName")
    public String adminName;

    /**
     * <p><code>string</code>，必填</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("adminSecret")
    public String adminSecret;

    /**
     * <p><code>float64</code>，必填</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p><code>int32</code>，必填</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("dbConnections")
    public Integer dbConnections;

    /**
     * <p><code>string</code>，必填</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("dbHost")
    public String dbHost;

    /**
     * <p><code>string</code>，必填</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("dbName")
    public String dbName;

    /**
     * <p><code>string</code>，必填</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("dbPassword")
    public String dbPassword;

    /**
     * <p><code>int32</code>，必填</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("dbPort")
    public Integer dbPort;

    /**
     * <p><code>string</code>，必填</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("dbType")
    public String dbType;

    /**
     * <p><code>string</code>，必填</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("dbUsername")
    public String dbUsername;

    /**
     * <p><code>string</code>，必填</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p><code>string</code>，必填</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("funAgentName")
    public String funAgentName;

    /**
     * <p><code>int32</code>，必填</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <p>可选； <code>omitempty</code></p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p><code>int32</code>，必填</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("replicas")
    public Integer replicas;

    /**
     * <p><code>string</code>，必填</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("securityGroupId")
    public String securityGroupId;

    /**
     * <p><code>string</code>，必填</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <p><code>string</code>，必填；JSON 数组 [{vswitchId, zoneId}]（core 解码为 <code>*string</code> 但校验非空）</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("vswitchIds")
    public String vswitchIds;

    public static CreateFunagentInput build(java.util.Map<String, ?> map) throws Exception {
        CreateFunagentInput self = new CreateFunagentInput();
        return TeaModel.build(map, self);
    }

    public CreateFunagentInput setAdminName(String adminName) {
        this.adminName = adminName;
        return this;
    }
    public String getAdminName() {
        return this.adminName;
    }

    public CreateFunagentInput setAdminSecret(String adminSecret) {
        this.adminSecret = adminSecret;
        return this;
    }
    public String getAdminSecret() {
        return this.adminSecret;
    }

    public CreateFunagentInput setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public CreateFunagentInput setDbConnections(Integer dbConnections) {
        this.dbConnections = dbConnections;
        return this;
    }
    public Integer getDbConnections() {
        return this.dbConnections;
    }

    public CreateFunagentInput setDbHost(String dbHost) {
        this.dbHost = dbHost;
        return this;
    }
    public String getDbHost() {
        return this.dbHost;
    }

    public CreateFunagentInput setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateFunagentInput setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }
    public String getDbPassword() {
        return this.dbPassword;
    }

    public CreateFunagentInput setDbPort(Integer dbPort) {
        this.dbPort = dbPort;
        return this;
    }
    public Integer getDbPort() {
        return this.dbPort;
    }

    public CreateFunagentInput setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public CreateFunagentInput setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
        return this;
    }
    public String getDbUsername() {
        return this.dbUsername;
    }

    public CreateFunagentInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFunagentInput setFunAgentName(String funAgentName) {
        this.funAgentName = funAgentName;
        return this;
    }
    public String getFunAgentName() {
        return this.funAgentName;
    }

    public CreateFunagentInput setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CreateFunagentInput setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateFunagentInput setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public CreateFunagentInput setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateFunagentInput setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateFunagentInput setVswitchIds(String vswitchIds) {
        this.vswitchIds = vswitchIds;
        return this;
    }
    public String getVswitchIds() {
        return this.vswitchIds;
    }

}
