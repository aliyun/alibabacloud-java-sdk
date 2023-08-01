// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sApplicationConfigRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can query the application ID by calling the ListApplication operation. For more information, see [ListApplication](~~423162~~).</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the cluster. You can query the cluster ID by calling the ListCluster operation. For more information, see [ListCluster](~~411844~~).</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The maximum number of CPU cores allowed for each application instance when the application is running. The value 0 indicates that no limit is set on CPU cores.</p>
     */
    @NameInMap("CpuLimit")
    public String cpuLimit;

    /**
     * <p>The number of CPU cores requested for each application instance when the application is running. Unit: cores. We recommend that you set this parameter. The value 0 indicates that no limit is set on CPU cores.</p>
     * <br>
     * <p>> You must set this parameter together with the CpuLimit parameter. Make sure that the value of this parameter does not exceed that of the CpuLimit parameter.</p>
     */
    @NameInMap("CpuRequest")
    public String cpuRequest;

    /**
     * <p>The maximum size of space required by ephemeral storage. Unit: GB. The value 0 indicates that no limit is set on the ephemeral storage space.</p>
     */
    @NameInMap("EphemeralStorageLimit")
    public String ephemeralStorageLimit;

    /**
     * <p>The minimum size of space required by ephemeral storage. Unit: GB. The value 0 indicates that no limit is set on the ephemeral storage space.</p>
     * <br>
     * <p>> You must set this parameter together with the EphemeralStorageLimit parameter. Make sure that the value of this parameter does not exceed that of the EphemeralStorageLimit parameter.</p>
     */
    @NameInMap("EphemeralStorageRequest")
    public String ephemeralStorageRequest;

    /**
     * <p>The maximum number of CPU cores allowed. The value 0 indicates that no limit is set on CPU cores.</p>
     */
    @NameInMap("McpuLimit")
    public String mcpuLimit;

    /**
     * <p>The minimum number of CPU cores required. Unit: cores. The value 0 indicates that no limit is set on CPU cores.</p>
     * <br>
     * <p>> You must set this parameter together with the CpuLimit parameter. Make sure that the value of this parameter does not exceed that of the CpuLimit parameter.</p>
     */
    @NameInMap("McpuRequest")
    public String mcpuRequest;

    /**
     * <p>The maximum size of memory allowed for each application instance when the application is running. Unit: MB. The value 0 indicates that no limit is set on the memory size.</p>
     */
    @NameInMap("MemoryLimit")
    public String memoryLimit;

    /**
     * <p>The size of memory requested for each application instance when the application is running. Unit: MB. We recommend that you set this parameter. If you do not want to apply for a memory quota, set this parameter to 0.</p>
     * <br>
     * <p>> You must set this parameter together with the MemoryLimit parameter. Make sure that the value of this parameter does not exceed that of the MemoryLimit parameter.</p>
     */
    @NameInMap("MemoryRequest")
    public String memoryRequest;

    /**
     * <p>The timeout period of the change process. Valid values: 1 to 1800. Default value: 600. Unit: seconds.</p>
     */
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

    public UpdateK8sApplicationConfigRequest setEphemeralStorageLimit(String ephemeralStorageLimit) {
        this.ephemeralStorageLimit = ephemeralStorageLimit;
        return this;
    }
    public String getEphemeralStorageLimit() {
        return this.ephemeralStorageLimit;
    }

    public UpdateK8sApplicationConfigRequest setEphemeralStorageRequest(String ephemeralStorageRequest) {
        this.ephemeralStorageRequest = ephemeralStorageRequest;
        return this;
    }
    public String getEphemeralStorageRequest() {
        return this.ephemeralStorageRequest;
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
