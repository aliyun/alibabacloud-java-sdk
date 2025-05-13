// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateFunctionRequest extends TeaModel {
    /**
     * <p>The maximum number of requests that a function instance can process at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InstanceConcurrency")
    public Integer instanceConcurrency;

    /**
     * <p>The listening port of the HTTP server in a custom runtime or a Custom Container runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>9000</p>
     */
    @NameInMap("caPort")
    public Integer caPort;

    /**
     * <p>The code package of the function. Code packages can be provided using the following two methods, but you must use only one of them in a single request:****</p>
     * <ul>
     * <li>Specify the names of the Object Storage Service (OSS) bucket (<strong>ossBucketName</strong>) where the code package is stored and the object (<strong>ossObjectName</strong>).</li>
     * <li>Set <strong>zipFile</strong> to the Base64-encoded content of the ZIP file.</li>
     * </ul>
     */
    @NameInMap("code")
    public Code code;

    /**
     * <p>The CPU size of the function. Unit: vCPUs. The value is a multiple of 0.05.</p>
     * 
     * <strong>example:</strong>
     * <p>1.5</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>The configurations of the Custom Container runtime. After you configure the Custom Container runtime, Function Compute can execute the function in a container that is created from a custom image.</p>
     */
    @NameInMap("customContainerConfig")
    public CustomContainerConfig customContainerConfig;

    /**
     * <p>The custom Domain Name System (DNS) settings of the function.</p>
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
     * <p>The description of the function.</p>
     * 
     * <strong>example:</strong>
     * <p>test desc</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The disk size of the function. Unit: MB. Valid values: 512 and 10240.</p>
     * 
     * <strong>example:</strong>
     * <p>512</p>
     */
    @NameInMap("diskSize")
    public Integer diskSize;

    /**
     * <p>The environment variables that are configured for the function. You can obtain the values of the environment variables from the function. For more information, see <a href="https://help.aliyun.com/document_detail/69777.html">Environment variables</a>.</p>
     */
    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <p>The GPU memory size of the function. Unit: MB. The value is a multiple of 1024.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("gpuMemorySize")
    public Integer gpuMemorySize;

    /**
     * <p>The handler of the function. The format varies based on the programming language you use. For more information, see <a href="https://help.aliyun.com/document_detail/157704.html">Function handlers</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>index.handler</p>
     */
    @NameInMap("handler")
    public String handler;

    /**
     * <p>The timeout period for the initializer function. Unit: seconds. Minimum value: 1. Default value: 3. The execution of the initializer function is terminated when the time elapses.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("initializationTimeout")
    public Integer initializationTimeout;

    /**
     * <p>The handler of the initializer function. The format varies based on the programming language you use. For more information, see <a href="https://help.aliyun.com/document_detail/157704.html">Function handlers</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>index.handler</p>
     */
    @NameInMap("initializer")
    public String initializer;

    /**
     * <p>The lifecycle configurations of the instance.</p>
     */
    @NameInMap("instanceLifecycleConfig")
    public InstanceLifecycleConfig instanceLifecycleConfig;

    /**
     * <p>The soft concurrency of the instance. You can use this property to implement graceful scale-out of instances. When the number of concurrent requests exceeds the instance\&quot;s soft concurrency limit, scale-out is triggered. If your instance has a long startup time, you can specify a soft concurrency value to initiate the instance in advance.</p>
     * <p>The value must be less than or equal to that of <strong>instanceConcurrency</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("instanceSoftConcurrency")
    public Integer instanceSoftConcurrency;

    /**
     * <p>The instance type of the function. Valid values:</p>
     * <ul>
     * <li><strong>e1</strong>: elastic instance</li>
     * <li><strong>c1</strong>: performance instance</li>
     * <li><strong>fc.gpu.tesla.1</strong>: GPU-accelerated instance utilizing Tesla series GPUs</li>
     * <li><strong>fc.gpu.ampere.1</strong>: GPU-accelerated instances utilizing Ampere series GPUs</li>
     * <li><strong>fc.gpu.ada.1</strong>: GPU-accelerated instances utilizing Ada series GPUs</li>
     * <li><strong>g1</strong>: same as <strong>fc.gpu.tesla.1</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>e1</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <p>The layers.</p>
     * <blockquote>
     * <p> Multiple layers are merged in the order determined by their array subscripts, from largest to smallest. When there are files with the same name, the content from the layer with the smaller subscript will overwrite the corresponding file in the layer with the larger subscript.</p>
     * </blockquote>
     */
    @NameInMap("layers")
    public java.util.List<String> layers;

    /**
     * <p>The memory capacity for the function. Unit: MB. The value must be a multiple of 64. The capacity varies based on the type of the function instance. For more information, see <a href="https://help.aliyun.com/document_detail/179379.html">Instance types</a>.</p>
     * 
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
     * <p>The timeout period for function execution. Unit: seconds. Minimum value: 1. Default value: 3. The execution of the function is terminated when the time elapses.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
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
