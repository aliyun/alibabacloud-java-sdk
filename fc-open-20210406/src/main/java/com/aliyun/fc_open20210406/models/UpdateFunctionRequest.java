// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateFunctionRequest extends TeaModel {
    /**
     * <p>The number of requests that can be concurrently processed by a single instance.</p>
     */
    @NameInMap("InstanceConcurrency")
    public Integer instanceConcurrency;

    /**
     * <p>The port on which the HTTP server listens for the custom runtime or custom container runtime.</p>
     */
    @NameInMap("caPort")
    public Integer caPort;

    /**
     * <p>The packaged code of the function. **Function code packages** can be provided with the following two methods. You must use only one of the methods in a request.</p>
     * <br>
     * <p>*   Specify the name of the Object Storage Service (OSS) bucket and object where the code package is stored. The names are specified in the **ossBucketName** and **ossObjectName** parameters.</p>
     * <p>*   Specify the Base64-encoded content of the ZIP file by using the **zipFile** parameter.</p>
     */
    @NameInMap("code")
    public Code code;

    /**
     * <p>The number of vCPUs of the function. The value must be a multiple of 0.05.</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>The configuration of the custom container. After you configure the custom container, Function Compute can execute the function in a container created from a custom image.</p>
     */
    @NameInMap("customContainerConfig")
    public CustomContainerConfig customContainerConfig;

    /**
     * <p>The custom DNS configurations of the function.</p>
     */
    @NameInMap("customDNS")
    public CustomDNS customDNS;

    /**
     * <p>The custom health check configurations of the function. This parameter is applicable to only custom runtimes and custom containers.</p>
     */
    @NameInMap("customHealthCheckConfig")
    public CustomHealthCheckConfig customHealthCheckConfig;

    /**
     * <p>The configurations of the custom runtime.</p>
     */
    @NameInMap("customRuntimeConfig")
    public CustomRuntimeConfig customRuntimeConfig;

    /**
     * <p>The description of the function.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The disk size of the function. Unit: MB. Valid values: 512 and 10240.</p>
     */
    @NameInMap("diskSize")
    public Integer diskSize;

    /**
     * <p>The environment variables that are configured for the function. You can obtain the values of the environment variables from the function. For more information, see [Environment variables](~~69777~~).</p>
     */
    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <p>The GPU memory capacity for the function. Unit: MB. The value must be a multiple of 1,024.</p>
     */
    @NameInMap("gpuMemorySize")
    public Integer gpuMemorySize;

    /**
     * <p>The handler of the function. The format varies based on the programming language. For more information, see [Function handlers](~~157704~~).</p>
     */
    @NameInMap("handler")
    public String handler;

    /**
     * <p>The timeout period for the execution of the Initializer hook. Unit: seconds. Default value: 3. Minimum value: 1. When the period ends, the execution of the Initializer hook is terminated.</p>
     */
    @NameInMap("initializationTimeout")
    public Integer initializationTimeout;

    /**
     * <p>The handler of the Initializer hook. The format is determined by the programming language. For more information, see [Function handlers](~~157704~~).</p>
     */
    @NameInMap("initializer")
    public String initializer;

    /**
     * <p>The lifecycle configurations of the instance.</p>
     */
    @NameInMap("instanceLifecycleConfig")
    public InstanceLifecycleConfig instanceLifecycleConfig;

    /**
     * <p>The soft concurrency of the instance. You can use this parameter to implement graceful scale-up of instances. If the number of concurrent requests on an instance is greater than the value of soft concurrency, an instance scale-up is triggered. For example, if your instance requires a long time to start, you can specify a suitable soft concurrency to start the instance in advance.</p>
     * <br>
     * <p>The value must be less than or equal to that of the **instanceConcurrency** parameter.</p>
     */
    @NameInMap("instanceSoftConcurrency")
    public Integer instanceSoftConcurrency;

    /**
     * <p>The instance type of the function. Valid values:</p>
     * <br>
     * <p>*   **e1**: elastic instance</p>
     * <p>*   **c1**: performance instance</p>
     * <p>*   **fc.gpu.tesla.1**: GPU-accelerated instance (Tesla T4)</p>
     * <p>*   **fc.gpu.ampere.1**: GPU-accelerated instance (Ampere A10)</p>
     * <p>*   **g1**: same as **fc.gpu.tesla.1**</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <p>The information about layers.</p>
     * <br>
     * <p>> Multiple layers are merged based on the order of array subscripts. The content of a layer with a smaller subscript overwrites the file that has the same name as a layer with a larger subscript.</p>
     */
    @NameInMap("layers")
    public java.util.List<String> layers;

    /**
     * <p>The memory size for the function. Unit: MB. The memory size must be a multiple of 64. The memory size varies based on the function instance type. For more information, see [Instance types](~~179379~~).</p>
     */
    @NameInMap("memorySize")
    public Integer memorySize;

    /**
     * <p>The runtime environment of the function. Valid values: **nodejs16**, **nodejs14**, **nodejs12**, **nodejs10**, **nodejs8**, **nodejs6**, **nodejs4.4**, **python3.9**, **python3**, **python2.7**, **java11**, **java8**, **go1**, **php7.2**, **dotnetcore3.1**, **dotnetcore2.1**, **custom** and **custom-container**. For more information, see [Supported function runtime environments](~~73338~~).</p>
     */
    @NameInMap("runtime")
    public String runtime;

    /**
     * <p>The timeout period for the execution of the function. Unit: seconds. Default value: 3. Minimum value: 1. When the period ends, the execution of the function is terminated.</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    public static UpdateFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFunctionRequest self = new UpdateFunctionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFunctionRequest setInstanceConcurrency(Integer instanceConcurrency) {
        this.instanceConcurrency = instanceConcurrency;
        return this;
    }
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
    }

    public UpdateFunctionRequest setCaPort(Integer caPort) {
        this.caPort = caPort;
        return this;
    }
    public Integer getCaPort() {
        return this.caPort;
    }

    public UpdateFunctionRequest setCode(Code code) {
        this.code = code;
        return this;
    }
    public Code getCode() {
        return this.code;
    }

    public UpdateFunctionRequest setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public UpdateFunctionRequest setCustomContainerConfig(CustomContainerConfig customContainerConfig) {
        this.customContainerConfig = customContainerConfig;
        return this;
    }
    public CustomContainerConfig getCustomContainerConfig() {
        return this.customContainerConfig;
    }

    public UpdateFunctionRequest setCustomDNS(CustomDNS customDNS) {
        this.customDNS = customDNS;
        return this;
    }
    public CustomDNS getCustomDNS() {
        return this.customDNS;
    }

    public UpdateFunctionRequest setCustomHealthCheckConfig(CustomHealthCheckConfig customHealthCheckConfig) {
        this.customHealthCheckConfig = customHealthCheckConfig;
        return this;
    }
    public CustomHealthCheckConfig getCustomHealthCheckConfig() {
        return this.customHealthCheckConfig;
    }

    public UpdateFunctionRequest setCustomRuntimeConfig(CustomRuntimeConfig customRuntimeConfig) {
        this.customRuntimeConfig = customRuntimeConfig;
        return this;
    }
    public CustomRuntimeConfig getCustomRuntimeConfig() {
        return this.customRuntimeConfig;
    }

    public UpdateFunctionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateFunctionRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public UpdateFunctionRequest setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public UpdateFunctionRequest setGpuMemorySize(Integer gpuMemorySize) {
        this.gpuMemorySize = gpuMemorySize;
        return this;
    }
    public Integer getGpuMemorySize() {
        return this.gpuMemorySize;
    }

    public UpdateFunctionRequest setHandler(String handler) {
        this.handler = handler;
        return this;
    }
    public String getHandler() {
        return this.handler;
    }

    public UpdateFunctionRequest setInitializationTimeout(Integer initializationTimeout) {
        this.initializationTimeout = initializationTimeout;
        return this;
    }
    public Integer getInitializationTimeout() {
        return this.initializationTimeout;
    }

    public UpdateFunctionRequest setInitializer(String initializer) {
        this.initializer = initializer;
        return this;
    }
    public String getInitializer() {
        return this.initializer;
    }

    public UpdateFunctionRequest setInstanceLifecycleConfig(InstanceLifecycleConfig instanceLifecycleConfig) {
        this.instanceLifecycleConfig = instanceLifecycleConfig;
        return this;
    }
    public InstanceLifecycleConfig getInstanceLifecycleConfig() {
        return this.instanceLifecycleConfig;
    }

    public UpdateFunctionRequest setInstanceSoftConcurrency(Integer instanceSoftConcurrency) {
        this.instanceSoftConcurrency = instanceSoftConcurrency;
        return this;
    }
    public Integer getInstanceSoftConcurrency() {
        return this.instanceSoftConcurrency;
    }

    public UpdateFunctionRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public UpdateFunctionRequest setLayers(java.util.List<String> layers) {
        this.layers = layers;
        return this;
    }
    public java.util.List<String> getLayers() {
        return this.layers;
    }

    public UpdateFunctionRequest setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public UpdateFunctionRequest setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }
    public String getRuntime() {
        return this.runtime;
    }

    public UpdateFunctionRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
