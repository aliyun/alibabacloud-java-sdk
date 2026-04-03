// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateFunagentInput extends TeaModel {
    @NameInMap("adminName")
    public String adminName;

    /**
     * <p>敏感字段</p>
     */
    @NameInMap("adminSecret")
    public String adminSecret;

    @NameInMap("cpu")
    public Float cpu;

    @NameInMap("dbConnections")
    public Integer dbConnections;

    @NameInMap("dbHost")
    public String dbHost;

    @NameInMap("dbInstanceId")
    public String dbInstanceId;

    @NameInMap("dbName")
    public String dbName;

    /**
     * <p>敏感字段</p>
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

    @NameInMap("memory")
    public Integer memory;

    @NameInMap("replicas")
    public Integer replicas;

    @NameInMap("version")
    public String version;

    public static UpdateFunagentInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateFunagentInput self = new UpdateFunagentInput();
        return TeaModel.build(map, self);
    }

    public UpdateFunagentInput setAdminName(String adminName) {
        this.adminName = adminName;
        return this;
    }
    public String getAdminName() {
        return this.adminName;
    }

    public UpdateFunagentInput setAdminSecret(String adminSecret) {
        this.adminSecret = adminSecret;
        return this;
    }
    public String getAdminSecret() {
        return this.adminSecret;
    }

    public UpdateFunagentInput setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public UpdateFunagentInput setDbConnections(Integer dbConnections) {
        this.dbConnections = dbConnections;
        return this;
    }
    public Integer getDbConnections() {
        return this.dbConnections;
    }

    public UpdateFunagentInput setDbHost(String dbHost) {
        this.dbHost = dbHost;
        return this;
    }
    public String getDbHost() {
        return this.dbHost;
    }

    public UpdateFunagentInput setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public UpdateFunagentInput setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public UpdateFunagentInput setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }
    public String getDbPassword() {
        return this.dbPassword;
    }

    public UpdateFunagentInput setDbPort(Integer dbPort) {
        this.dbPort = dbPort;
        return this;
    }
    public Integer getDbPort() {
        return this.dbPort;
    }

    public UpdateFunagentInput setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public UpdateFunagentInput setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
        return this;
    }
    public String getDbUsername() {
        return this.dbUsername;
    }

    public UpdateFunagentInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateFunagentInput setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public UpdateFunagentInput setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public UpdateFunagentInput setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
