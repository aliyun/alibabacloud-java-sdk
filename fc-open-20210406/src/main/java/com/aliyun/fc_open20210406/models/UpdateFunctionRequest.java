// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateFunctionRequest extends TeaModel {
    // The number of requests that can be concurrently processed by a single instance.
    @NameInMap("InstanceConcurrency")
    public Integer instanceConcurrency;

    // The port on which the HTTP server listens for the custom runtime or custom container runtime.
    @NameInMap("caPort")
    public Integer caPort;

    // **Function code packages** can be provided with the following two methods. You must use only one of the methods in a single request.
    // 
    // *   Specify the names of the **Object Storage Service (OSS) bucket** and **object** where the code package is stored.
    // *   Set the **zipFile** parameter to the Base64-encoded content of the ZIP file.
    @NameInMap("code")
    public Code code;

    // The number of vCPUs of the function. The value must be a multiple of 0.05.
    @NameInMap("cpu")
    public Float cpu;

    // The configurations of the custom container runtime. After you configure the custom container, Function Compute can execute functions in a container created from a custom image.
    @NameInMap("customContainerConfig")
    public CustomContainerConfig customContainerConfig;

    // The custom Domain Name System (DNS) configurations of the function.
    @NameInMap("customDNS")
    public CustomDNS customDNS;

    // The custom health check configuration of the function. This parameter is applicable only to custom runtimes and custom containers.
    @NameInMap("customHealthCheckConfig")
    public CustomHealthCheckConfig customHealthCheckConfig;

    // The configurations of the custom runtime.
    @NameInMap("customRuntimeConfig")
    public CustomRuntimeConfig customRuntimeConfig;

    // The description of the function.
    @NameInMap("description")
    public String description;

    // The disk size of the function. Unit: MB. Valid values: 512 and 10240.
    @NameInMap("diskSize")
    public Integer diskSize;

    // The environment variables that you configured for the function. You can obtain the values of the environment variables from the function. For more information, see [Overview](~~69777~~).
    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    // The handler of the function. The format varies based on the programming language. For more information, see [Function handlers](~~157704~~).
    @NameInMap("handler")
    public String handler;

    // The timeout period for the execution of the initializer function. Unit: seconds. Default value: 3. Minimum value: 1. When this period ends, the execution of the initializer function is terminated.
    @NameInMap("initializationTimeout")
    public Integer initializationTimeout;

    // The handler of the initializer function. The format is determined by the programming language. For more information, see [Function handlers](~~157704~~).
    @NameInMap("initializer")
    public String initializer;

    // The lifecycle configurations of the instance.
    @NameInMap("instanceLifecycleConfig")
    public InstanceLifecycleConfig instanceLifecycleConfig;

    // The soft concurrency of the instance. You can use this parameter to implement graceful scale-up of instances. If the number of concurrent requests on an instance is greater than the number of the soft concurrency, the instance scale-up is triggered. For example, if your instance requires a long term to start, you can specify a suitable soft concurrency to start the instance in advance.
    // 
    // The value must be less than or equal to that of **instanceConcurrency**.
    @NameInMap("instanceSoftConcurrency")
    public Integer instanceSoftConcurrency;

    // The instance type of the function. Valid values:
    // 
    // *   **e1**: elastic instance
    // *   **c1**: performance instance
    @NameInMap("instanceType")
    public String instanceType;

    // An array that consists of the information of layers.
    // 
    // >  Multiple layers are merged based on the order of array subscripts. The content of a layer with a smaller subscript overwrites the file with the same name in the layer with a larger subscript.
    @NameInMap("layers")
    public java.util.List<String> layers;

    // The memory size for the function. Unit: MB. The memory size must be a multiple of 64 MB. The memory size varies based on the function instance type. For more information, see [Instance types](~~179379~~).
    @NameInMap("memorySize")
    public Integer memorySize;

    // The runtime environment of the function. Valid values: **nodejs14**, **nodejs12**, **nodejs10**, **nodejs8**, **nodejs6**, **nodejs4.4**, **python3.9**, **python3**, **python2.7**, **java11**, **java8**, **go1**, **php7.2**, **dotnetcore2.1**, **custom** and **custom-container**.
    @NameInMap("runtime")
    public String runtime;

    // The timeout period for the execution of the function. Unit: seconds. Default value: 3. Minimum value: 1. When this period ends, the execution of the function is terminated.
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
