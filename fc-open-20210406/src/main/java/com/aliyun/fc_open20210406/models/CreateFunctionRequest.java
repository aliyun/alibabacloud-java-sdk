// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateFunctionRequest extends TeaModel {
    // 自定义、自定义容器运行时 HTTP Server 的监听端口
    @NameInMap("caPort")
    public Integer caPort;

    @NameInMap("code")
    public Code code;

    @NameInMap("customContainerConfig")
    public CustomContainerConfig customContainerConfig;

    // 函数描述
    @NameInMap("description")
    public String description;

    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    // 函数名称
    @NameInMap("functionName")
    public String functionName;

    // function执行的入口，具体格式和语言相关
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

    // 层列表
    @NameInMap("layers")
    public java.util.List<String> layers;

    // function的内存规格，单位为MB，为64MB的倍数
    @NameInMap("memorySize")
    public Integer memorySize;

    // function运行的语言环境，目前支持nodejs6, nodejs8, python2.7, python3, java8
    @NameInMap("runtime")
    public String runtime;

    // function运行的超时时间，单位为秒，最小1秒，默认3秒。function超过这个时间后会被终止执行
    @NameInMap("timeout")
    public Integer timeout;

    public static CreateFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionRequest self = new CreateFunctionRequest();
        return TeaModel.build(map, self);
    }

    public CreateFunctionRequest setCaPort(Integer caPort) {
        this.caPort = caPort;
        return this;
    }
    public Integer getCaPort() {
        return this.caPort;
    }

    public CreateFunctionRequest setCode(Code code) {
        this.code = code;
        return this;
    }
    public Code getCode() {
        return this.code;
    }

    public CreateFunctionRequest setCustomContainerConfig(CustomContainerConfig customContainerConfig) {
        this.customContainerConfig = customContainerConfig;
        return this;
    }
    public CustomContainerConfig getCustomContainerConfig() {
        return this.customContainerConfig;
    }

    public CreateFunctionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFunctionRequest setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public CreateFunctionRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public CreateFunctionRequest setHandler(String handler) {
        this.handler = handler;
        return this;
    }
    public String getHandler() {
        return this.handler;
    }

    public CreateFunctionRequest setInitializationTimeout(Integer initializationTimeout) {
        this.initializationTimeout = initializationTimeout;
        return this;
    }
    public Integer getInitializationTimeout() {
        return this.initializationTimeout;
    }

    public CreateFunctionRequest setInitializer(String initializer) {
        this.initializer = initializer;
        return this;
    }
    public String getInitializer() {
        return this.initializer;
    }

    public CreateFunctionRequest setInstanceConcurrency(Integer instanceConcurrency) {
        this.instanceConcurrency = instanceConcurrency;
        return this;
    }
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
    }

    public CreateFunctionRequest setInstanceLifecycleConfig(InstanceLifecycleConfig instanceLifecycleConfig) {
        this.instanceLifecycleConfig = instanceLifecycleConfig;
        return this;
    }
    public InstanceLifecycleConfig getInstanceLifecycleConfig() {
        return this.instanceLifecycleConfig;
    }

    public CreateFunctionRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateFunctionRequest setLayers(java.util.List<String> layers) {
        this.layers = layers;
        return this;
    }
    public java.util.List<String> getLayers() {
        return this.layers;
    }

    public CreateFunctionRequest setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public CreateFunctionRequest setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }
    public String getRuntime() {
        return this.runtime;
    }

    public CreateFunctionRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
