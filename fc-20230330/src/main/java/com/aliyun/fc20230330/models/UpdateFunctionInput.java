// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class UpdateFunctionInput extends TeaModel {
    @NameInMap("code")
    public InputCodeLocation code;

    @NameInMap("cpu")
    public Float cpu;

    @NameInMap("customContainerConfig")
    public CustomContainerConfig customContainerConfig;

    @NameInMap("customDNS")
    public CustomDNS customDNS;

    @NameInMap("customRuntimeConfig")
    public CustomRuntimeConfig customRuntimeConfig;

    @NameInMap("description")
    public String description;

    @NameInMap("diskSize")
    public Integer diskSize;

    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    @NameInMap("gpuConfig")
    public GPUConfig gpuConfig;

    @NameInMap("handler")
    public String handler;

    @NameInMap("instanceConcurrency")
    public Integer instanceConcurrency;

    @NameInMap("instanceLifecycleConfig")
    public InstanceLifecycleConfig instanceLifecycleConfig;

    @NameInMap("internetAccess")
    public Boolean internetAccess;

    @NameInMap("layers")
    public java.util.List<String> layers;

    @NameInMap("logConfig")
    public LogConfig logConfig;

    @NameInMap("memorySize")
    public Integer memorySize;

    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    @NameInMap("role")
    public String role;

    @NameInMap("runtime")
    public String runtime;

    @NameInMap("timeout")
    public Integer timeout;

    @NameInMap("tracingConfig")
    public TracingConfig tracingConfig;

    @NameInMap("vpcConfig")
    public VPCConfig vpcConfig;

    public static UpdateFunctionInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateFunctionInput self = new UpdateFunctionInput();
        return TeaModel.build(map, self);
    }

    public UpdateFunctionInput setCode(InputCodeLocation code) {
        this.code = code;
        return this;
    }
    public InputCodeLocation getCode() {
        return this.code;
    }

    public UpdateFunctionInput setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public UpdateFunctionInput setCustomContainerConfig(CustomContainerConfig customContainerConfig) {
        this.customContainerConfig = customContainerConfig;
        return this;
    }
    public CustomContainerConfig getCustomContainerConfig() {
        return this.customContainerConfig;
    }

    public UpdateFunctionInput setCustomDNS(CustomDNS customDNS) {
        this.customDNS = customDNS;
        return this;
    }
    public CustomDNS getCustomDNS() {
        return this.customDNS;
    }

    public UpdateFunctionInput setCustomRuntimeConfig(CustomRuntimeConfig customRuntimeConfig) {
        this.customRuntimeConfig = customRuntimeConfig;
        return this;
    }
    public CustomRuntimeConfig getCustomRuntimeConfig() {
        return this.customRuntimeConfig;
    }

    public UpdateFunctionInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateFunctionInput setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public UpdateFunctionInput setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public UpdateFunctionInput setGpuConfig(GPUConfig gpuConfig) {
        this.gpuConfig = gpuConfig;
        return this;
    }
    public GPUConfig getGpuConfig() {
        return this.gpuConfig;
    }

    public UpdateFunctionInput setHandler(String handler) {
        this.handler = handler;
        return this;
    }
    public String getHandler() {
        return this.handler;
    }

    public UpdateFunctionInput setInstanceConcurrency(Integer instanceConcurrency) {
        this.instanceConcurrency = instanceConcurrency;
        return this;
    }
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
    }

    public UpdateFunctionInput setInstanceLifecycleConfig(InstanceLifecycleConfig instanceLifecycleConfig) {
        this.instanceLifecycleConfig = instanceLifecycleConfig;
        return this;
    }
    public InstanceLifecycleConfig getInstanceLifecycleConfig() {
        return this.instanceLifecycleConfig;
    }

    public UpdateFunctionInput setInternetAccess(Boolean internetAccess) {
        this.internetAccess = internetAccess;
        return this;
    }
    public Boolean getInternetAccess() {
        return this.internetAccess;
    }

    public UpdateFunctionInput setLayers(java.util.List<String> layers) {
        this.layers = layers;
        return this;
    }
    public java.util.List<String> getLayers() {
        return this.layers;
    }

    public UpdateFunctionInput setLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public LogConfig getLogConfig() {
        return this.logConfig;
    }

    public UpdateFunctionInput setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public UpdateFunctionInput setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    public UpdateFunctionInput setOssMountConfig(OSSMountConfig ossMountConfig) {
        this.ossMountConfig = ossMountConfig;
        return this;
    }
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
    }

    public UpdateFunctionInput setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public UpdateFunctionInput setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }
    public String getRuntime() {
        return this.runtime;
    }

    public UpdateFunctionInput setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public UpdateFunctionInput setTracingConfig(TracingConfig tracingConfig) {
        this.tracingConfig = tracingConfig;
        return this;
    }
    public TracingConfig getTracingConfig() {
        return this.tracingConfig;
    }

    public UpdateFunctionInput setVpcConfig(VPCConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public VPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

}
