// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateFunctionResponseBody extends TeaModel {
    // 自定义、自定义容器运行时 HTTP Server 的监听端口
    @NameInMap("caPort")
    public Integer caPort;

    // function code包的CRC64值
    @NameInMap("codeChecksum")
    public String codeChecksum;

    // 系统返回的function的code包大小，单位为byte Example : 1024
    @NameInMap("codeSize")
    public Long codeSize;

    // function创建时间
    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("customContainerConfig")
    public CustomContainerConfig customContainerConfig;

    // 函数描述
    @NameInMap("description")
    public String description;

    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    // 系统为每个function生成的唯一ID
    @NameInMap("functionId")
    public String functionId;

    // 函数名称
    @NameInMap("functionName")
    public String functionName;

    // function的执行入口
    @NameInMap("handler")
    public String handler;

    // 初始化function运行的超时时间，单位为秒，最小1秒，默认3秒。初始化function超过这个时间后会被终止执行
    @NameInMap("initializationTimeout")
    public Integer initializationTimeout;

    // 初始化 function 执行的入口，具体格式和语言相关
    @NameInMap("initializer")
    public String initializer;

    @NameInMap("instanceConcurrency")
    public Integer instanceConcurrency;

    @NameInMap("instanceLifecycleConfig")
    public InstanceLifecycleConfig instanceLifecycleConfig;

    @NameInMap("instanceType")
    public String instanceType;

    // function上次修改时间
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("layers")
    public java.util.List<String> layers;

    // function设置的内存大小，单位为MB
    @NameInMap("memorySize")
    public Integer memorySize;

    // function运行的语言环境，目前支持nodejs6, nodejs8, python2.7, python3, java8
    @NameInMap("runtime")
    public String runtime;

    // 运行的超时时间，单位为秒
    @NameInMap("timeout")
    public Integer timeout;

    public static CreateFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionResponseBody self = new CreateFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFunctionResponseBody setCaPort(Integer caPort) {
        this.caPort = caPort;
        return this;
    }
    public Integer getCaPort() {
        return this.caPort;
    }

    public CreateFunctionResponseBody setCodeChecksum(String codeChecksum) {
        this.codeChecksum = codeChecksum;
        return this;
    }
    public String getCodeChecksum() {
        return this.codeChecksum;
    }

    public CreateFunctionResponseBody setCodeSize(Long codeSize) {
        this.codeSize = codeSize;
        return this;
    }
    public Long getCodeSize() {
        return this.codeSize;
    }

    public CreateFunctionResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public CreateFunctionResponseBody setCustomContainerConfig(CustomContainerConfig customContainerConfig) {
        this.customContainerConfig = customContainerConfig;
        return this;
    }
    public CustomContainerConfig getCustomContainerConfig() {
        return this.customContainerConfig;
    }

    public CreateFunctionResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFunctionResponseBody setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public CreateFunctionResponseBody setFunctionId(String functionId) {
        this.functionId = functionId;
        return this;
    }
    public String getFunctionId() {
        return this.functionId;
    }

    public CreateFunctionResponseBody setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public CreateFunctionResponseBody setHandler(String handler) {
        this.handler = handler;
        return this;
    }
    public String getHandler() {
        return this.handler;
    }

    public CreateFunctionResponseBody setInitializationTimeout(Integer initializationTimeout) {
        this.initializationTimeout = initializationTimeout;
        return this;
    }
    public Integer getInitializationTimeout() {
        return this.initializationTimeout;
    }

    public CreateFunctionResponseBody setInitializer(String initializer) {
        this.initializer = initializer;
        return this;
    }
    public String getInitializer() {
        return this.initializer;
    }

    public CreateFunctionResponseBody setInstanceConcurrency(Integer instanceConcurrency) {
        this.instanceConcurrency = instanceConcurrency;
        return this;
    }
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
    }

    public CreateFunctionResponseBody setInstanceLifecycleConfig(InstanceLifecycleConfig instanceLifecycleConfig) {
        this.instanceLifecycleConfig = instanceLifecycleConfig;
        return this;
    }
    public InstanceLifecycleConfig getInstanceLifecycleConfig() {
        return this.instanceLifecycleConfig;
    }

    public CreateFunctionResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateFunctionResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public CreateFunctionResponseBody setLayers(java.util.List<String> layers) {
        this.layers = layers;
        return this;
    }
    public java.util.List<String> getLayers() {
        return this.layers;
    }

    public CreateFunctionResponseBody setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public CreateFunctionResponseBody setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }
    public String getRuntime() {
        return this.runtime;
    }

    public CreateFunctionResponseBody setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
