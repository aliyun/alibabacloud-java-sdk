// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sApplicationConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CpuLimit")
    public String cpuLimit;

    @NameInMap("CpuRequest")
    public String cpuRequest;

    @NameInMap("McpuLimit")
    public String mcpuLimit;

    @NameInMap("McpuRequest")
    public String mcpuRequest;

    @NameInMap("MemoryLimit")
    public String memoryLimit;

    @NameInMap("MemoryRequest")
    public String memoryRequest;

    @NameInMap("Timeout")
    public Integer timeout;

    public static UpdateK8sApplicationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sApplicationConfigRequest self = new UpdateK8sApplicationConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateK8sApplicationConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateK8sApplicationConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateK8sApplicationConfigRequest setCpuLimit(String cpuLimit) {
        this.cpuLimit = cpuLimit;
        return this;
    }
    public String getCpuLimit() {
        return this.cpuLimit;
    }

    public UpdateK8sApplicationConfigRequest setCpuRequest(String cpuRequest) {
        this.cpuRequest = cpuRequest;
        return this;
    }
    public String getCpuRequest() {
        return this.cpuRequest;
    }

    public UpdateK8sApplicationConfigRequest setMcpuLimit(String mcpuLimit) {
        this.mcpuLimit = mcpuLimit;
        return this;
    }
    public String getMcpuLimit() {
        return this.mcpuLimit;
    }

    public UpdateK8sApplicationConfigRequest setMcpuRequest(String mcpuRequest) {
        this.mcpuRequest = mcpuRequest;
        return this;
    }
    public String getMcpuRequest() {
        return this.mcpuRequest;
    }

    public UpdateK8sApplicationConfigRequest setMemoryLimit(String memoryLimit) {
        this.memoryLimit = memoryLimit;
        return this;
    }
    public String getMemoryLimit() {
        return this.memoryLimit;
    }

    public UpdateK8sApplicationConfigRequest setMemoryRequest(String memoryRequest) {
        this.memoryRequest = memoryRequest;
        return this;
    }
    public String getMemoryRequest() {
        return this.memoryRequest;
    }

    public UpdateK8sApplicationConfigRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
