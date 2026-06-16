// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateBrowserInput extends TeaModel {
    /**
     * <p>The name of the browser.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-browser</p>
     */
    @NameInMap("browserName")
    public String browserName;

    /**
     * <p>The CPU cores to allocate to the browser instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>The credential ID used for authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>cred-1234567890abcdef</p>
     */
    @NameInMap("credentialId")
    public String credentialId;

    /**
     * <p>A description of the browser instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Web automation browser for testing</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The ARN of the execution role.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1760720386195983:role/BrowserExecutionRole</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>The memory (in MB) to allocate to the browser instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <p>The network configuration for the browser instance.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>The idle time in seconds before a session expires. When a session is idle, the instance enters an idle billing mode.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("sessionIdleTimeoutSeconds")
    public Integer sessionIdleTimeoutSeconds;

    public static CreateBrowserInput build(java.util.Map<String, ?> map) throws Exception {
        CreateBrowserInput self = new CreateBrowserInput();
        return TeaModel.build(map, self);
    }

    public CreateBrowserInput setBrowserName(String browserName) {
        this.browserName = browserName;
        return this;
    }
    public String getBrowserName() {
        return this.browserName;
    }

    public CreateBrowserInput setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public CreateBrowserInput setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public CreateBrowserInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBrowserInput setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public CreateBrowserInput setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CreateBrowserInput setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public CreateBrowserInput setSessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
        this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
        return this;
    }
    public Integer getSessionIdleTimeoutSeconds() {
        return this.sessionIdleTimeoutSeconds;
    }

}
