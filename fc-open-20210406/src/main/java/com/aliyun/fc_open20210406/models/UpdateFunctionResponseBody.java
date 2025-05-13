// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateFunctionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9000</p>
     */
    @NameInMap("caPort")
    public Integer caPort;

    /**
     * <strong>example:</strong>
     * <p>5434025278388143772</p>
     */
    @NameInMap("codeChecksum")
    public String codeChecksum;

    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("codeSize")
    public Long codeSize;

    /**
     * <strong>example:</strong>
     * <p>1.5</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <strong>example:</strong>
     * <p>2016-08-15T15:00:00.000+0000</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The configurations of the Custom Container runtime. After you configure the Custom Container runtime, you can use a custom container image to execute functions.</p>
     */
    @NameInMap("customContainerConfig")
    public CustomContainerConfig customContainerConfig;

    /**
     * <p>The custom DNS settings of the function.</p>
     */
    @NameInMap("customDNS")
    public CustomDNS customDNS;

    /**
     * <p>The custom health check configurations of the function. This parameter is applicable only to custom runtimes and Custom Container runtimes.</p>
     */
    @NameInMap("customHealthCheckConfig")
    public CustomHealthCheckConfig customHealthCheckConfig;

    /**
     * <p>The configurations of the custom runtime function.</p>
     */
    @NameInMap("customRuntimeConfig")
    public CustomRuntimeConfig customRuntimeConfig;

    /**
     * <strong>example:</strong>
     * <p>This is a demo hello world function</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>512</p>
     */
    @NameInMap("diskSize")
    public Integer diskSize;

    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <strong>example:</strong>
     * <p>2d28e0e9-9ba5-4eed-8b1a-d3d9cd24****</p>
     */
    @NameInMap("functionId")
    public String functionId;

    /**
     * <strong>example:</strong>
     * <p>demo-function</p>
     */
    @NameInMap("functionName")
    public String functionName;

    /**
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("gpuMemorySize")
    public Integer gpuMemorySize;

    /**
     * <strong>example:</strong>
     * <p>index.handler</p>
     */
    @NameInMap("handler")
    public String handler;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("initializationTimeout")
    public Integer initializationTimeout;

    /**
     * <strong>example:</strong>
     * <p>index.handler</p>
     */
    @NameInMap("initializer")
    public String initializer;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("instanceConcurrency")
    public Integer instanceConcurrency;

    /**
     * <p>The lifecycle configurations of the instance.</p>
     */
    @NameInMap("instanceLifecycleConfig")
    public InstanceLifecycleConfig instanceLifecycleConfig;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("instanceSoftConcurrency")
    public Integer instanceSoftConcurrency;

    /**
     * <strong>example:</strong>
     * <p>e1</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>2016-08-15T17:00:00.000+0000</p>
     */
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>The layers.</p>
     * <blockquote>
     * <p> Multiple layers are merged based on the order of array subscripts. The content of a layer with a smaller subscript overwrites the file that has the same name of a layer with a larger subscript.</p>
     * </blockquote>
     */
    @NameInMap("layers")
    public java.util.List<String> layers;

    /**
     * <p>A list of layer ARNs.</p>
     */
    @NameInMap("layersArnV2")
    public java.util.List<String> layersArnV2;

    /**
     * <strong>example:</strong>
     * <p>512</p>
     */
    @NameInMap("memorySize")
    public Integer memorySize;

    /**
     * <p>The runtime of the function. Valid values: <strong>nodejs20</strong>, <strong>nodejs18</strong>, <strong>nodejs16</strong>, <strong>nodejs14</strong>, <strong>nodejs12</strong>, <strong>nodejs10</strong>, <strong>nodejs8</strong>, <strong>nodejs6</strong>, <strong>nodejs4.4</strong>, <strong>python3.10</strong>, <strong>python3.9</strong>, <strong>python3</strong>, <strong>python2.7</strong>, <strong>java11</strong>, <strong>java8</strong>, <strong>go1</strong>, <strong>php7.2</strong>, <strong>dotnetcore3.1</strong>, <strong>dotnetcore2.1</strong>, <strong>custom.debian10</strong>, <strong>custom</strong>, and <strong>custom-container</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/73338.html">Runtimes that are supported by Function Compute</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>python3.9</p>
     */
    @NameInMap("runtime")
    public String runtime;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    public static UpdateFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFunctionResponseBody self = new UpdateFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFunctionResponseBody setCaPort(Integer caPort) {
        this.caPort = caPort;
        return this;
    }
    public Integer getCaPort() {
        return this.caPort;
    }

    public UpdateFunctionResponseBody setCodeChecksum(String codeChecksum) {
        this.codeChecksum = codeChecksum;
        return this;
    }
    public String getCodeChecksum() {
        return this.codeChecksum;
    }

    public UpdateFunctionResponseBody setCodeSize(Long codeSize) {
        this.codeSize = codeSize;
        return this;
    }
    public Long getCodeSize() {
        return this.codeSize;
    }

    public UpdateFunctionResponseBody setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public UpdateFunctionResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public UpdateFunctionResponseBody setCustomContainerConfig(CustomContainerConfig customContainerConfig) {
        this.customContainerConfig = customContainerConfig;
        return this;
    }
    public CustomContainerConfig getCustomContainerConfig() {
        return this.customContainerConfig;
    }

    public UpdateFunctionResponseBody setCustomDNS(CustomDNS customDNS) {
        this.customDNS = customDNS;
        return this;
    }
    public CustomDNS getCustomDNS() {
        return this.customDNS;
    }

    public UpdateFunctionResponseBody setCustomHealthCheckConfig(CustomHealthCheckConfig customHealthCheckConfig) {
        this.customHealthCheckConfig = customHealthCheckConfig;
        return this;
    }
    public CustomHealthCheckConfig getCustomHealthCheckConfig() {
        return this.customHealthCheckConfig;
    }

    public UpdateFunctionResponseBody setCustomRuntimeConfig(CustomRuntimeConfig customRuntimeConfig) {
        this.customRuntimeConfig = customRuntimeConfig;
        return this;
    }
    public CustomRuntimeConfig getCustomRuntimeConfig() {
        return this.customRuntimeConfig;
    }

    public UpdateFunctionResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateFunctionResponseBody setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public UpdateFunctionResponseBody setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public UpdateFunctionResponseBody setFunctionId(String functionId) {
        this.functionId = functionId;
        return this;
    }
    public String getFunctionId() {
        return this.functionId;
    }

    public UpdateFunctionResponseBody setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public UpdateFunctionResponseBody setGpuMemorySize(Integer gpuMemorySize) {
        this.gpuMemorySize = gpuMemorySize;
        return this;
    }
    public Integer getGpuMemorySize() {
        return this.gpuMemorySize;
    }

    public UpdateFunctionResponseBody setHandler(String handler) {
        this.handler = handler;
        return this;
    }
    public String getHandler() {
        return this.handler;
    }

    public UpdateFunctionResponseBody setInitializationTimeout(Integer initializationTimeout) {
        this.initializationTimeout = initializationTimeout;
        return this;
    }
    public Integer getInitializationTimeout() {
        return this.initializationTimeout;
    }

    public UpdateFunctionResponseBody setInitializer(String initializer) {
        this.initializer = initializer;
        return this;
    }
    public String getInitializer() {
        return this.initializer;
    }

    public UpdateFunctionResponseBody setInstanceConcurrency(Integer instanceConcurrency) {
        this.instanceConcurrency = instanceConcurrency;
        return this;
    }
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
    }

    public UpdateFunctionResponseBody setInstanceLifecycleConfig(InstanceLifecycleConfig instanceLifecycleConfig) {
        this.instanceLifecycleConfig = instanceLifecycleConfig;
        return this;
    }
    public InstanceLifecycleConfig getInstanceLifecycleConfig() {
        return this.instanceLifecycleConfig;
    }

    public UpdateFunctionResponseBody setInstanceSoftConcurrency(Integer instanceSoftConcurrency) {
        this.instanceSoftConcurrency = instanceSoftConcurrency;
        return this;
    }
    public Integer getInstanceSoftConcurrency() {
        return this.instanceSoftConcurrency;
    }

    public UpdateFunctionResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public UpdateFunctionResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public UpdateFunctionResponseBody setLayers(java.util.List<String> layers) {
        this.layers = layers;
        return this;
    }
    public java.util.List<String> getLayers() {
        return this.layers;
    }

    public UpdateFunctionResponseBody setLayersArnV2(java.util.List<String> layersArnV2) {
        this.layersArnV2 = layersArnV2;
        return this;
    }
    public java.util.List<String> getLayersArnV2() {
        return this.layersArnV2;
    }

    public UpdateFunctionResponseBody setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public UpdateFunctionResponseBody setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }
    public String getRuntime() {
        return this.runtime;
    }

    public UpdateFunctionResponseBody setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
