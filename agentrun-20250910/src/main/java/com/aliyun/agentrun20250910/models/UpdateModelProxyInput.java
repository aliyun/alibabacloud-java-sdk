// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateModelProxyInput extends TeaModel {
    @NameInMap("armsConfiguration")
    public ArmsConfiguration armsConfiguration;

    @NameInMap("credentialName")
    public String credentialName;

    @NameInMap("description")
    public String description;

    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    @NameInMap("proxyConfig")
    public ProxyConfig proxyConfig;

    public static UpdateModelProxyInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelProxyInput self = new UpdateModelProxyInput();
        return TeaModel.build(map, self);
    }

    public UpdateModelProxyInput setArmsConfiguration(ArmsConfiguration armsConfiguration) {
        this.armsConfiguration = armsConfiguration;
        return this;
    }
    public ArmsConfiguration getArmsConfiguration() {
        return this.armsConfiguration;
    }

    public UpdateModelProxyInput setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public UpdateModelProxyInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateModelProxyInput setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public UpdateModelProxyInput setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    public UpdateModelProxyInput setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public UpdateModelProxyInput setProxyConfig(ProxyConfig proxyConfig) {
        this.proxyConfig = proxyConfig;
        return this;
    }
    public ProxyConfig getProxyConfig() {
        return this.proxyConfig;
    }

}
