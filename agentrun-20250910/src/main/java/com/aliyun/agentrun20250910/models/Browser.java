// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class Browser extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>browser-1234567890abcdef</p>
     */
    @NameInMap("browserId")
    public String browserId;

    /**
     * <strong>example:</strong>
     * <p>my-browser</p>
     */
    @NameInMap("browserName")
    public String browserName;

    /**
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <strong>example:</strong>
     * <p>2025-01-10T10:30:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <strong>example:</strong>
     * <p>cred-1234567890abcdef</p>
     */
    @NameInMap("credentialId")
    public String credentialId;

    /**
     * <strong>example:</strong>
     * <p>Web automation browser for testing</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::1760720386195983:role/BrowserExecutionRole</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <strong>example:</strong>
     * <p>2025-01-10T11:45:00Z</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    /**
     * <p>内存资源配置（单位：MB）</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("memory")
    public Integer memory;

    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    @NameInMap("recording")
    public BrowserRecordingConfiguration recording;

    /**
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>当前状态的原因说明（如适用）</p>
     * 
     * <strong>example:</strong>
     * <p>Browser is ready for use</p>
     */
    @NameInMap("statusReason")
    public String statusReason;

    /**
     * <strong>example:</strong>
     * <p>tenant-1234567890abcdef</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static Browser build(java.util.Map<String, ?> map) throws Exception {
        Browser self = new Browser();
        return TeaModel.build(map, self);
    }

    public Browser setBrowserId(String browserId) {
        this.browserId = browserId;
        return this;
    }
    public String getBrowserId() {
        return this.browserId;
    }

    public Browser setBrowserName(String browserName) {
        this.browserName = browserName;
        return this;
    }
    public String getBrowserName() {
        return this.browserName;
    }

    public Browser setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public Browser setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Browser setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public Browser setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Browser setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public Browser setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public Browser setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public Browser setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public Browser setRecording(BrowserRecordingConfiguration recording) {
        this.recording = recording;
        return this;
    }
    public BrowserRecordingConfiguration getRecording() {
        return this.recording;
    }

    public Browser setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Browser setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public Browser setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
