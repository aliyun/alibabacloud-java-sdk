// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateBrowserInput extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("browserName")
    public String browserName;

    /**
     * <p>CPU资源配置（单位：核）</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    @NameInMap("credentialId")
    public String credentialId;

    @NameInMap("description")
    public String description;

    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>内存资源配置（单位：MB）</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>会话的空闲超时时间，单位为秒。实例没有会话请求后处于空闲状态，空闲态为闲置计费模式，超过此超时时间后会话自动过期，不可继续使用</p>
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
