// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListFunctionsResponseBody extends TeaModel {
    // 函数列表
    @NameInMap("functions")
    public java.util.List<ListFunctionsResponseBodyFunctions> functions;

    // 用来返回更多的查询结果。如果这个值没有返回，则说明没有更多结果
    @NameInMap("nextToken")
    public String nextToken;

    public static ListFunctionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionsResponseBody self = new ListFunctionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFunctionsResponseBody setFunctions(java.util.List<ListFunctionsResponseBodyFunctions> functions) {
        this.functions = functions;
        return this;
    }
    public java.util.List<ListFunctionsResponseBodyFunctions> getFunctions() {
        return this.functions;
    }

    public ListFunctionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListFunctionsResponseBodyFunctions extends TeaModel {
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

        // 为函数设置的环境变量，可以在函数中获取环境变量的值
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

        public static ListFunctionsResponseBodyFunctions build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionsResponseBodyFunctions self = new ListFunctionsResponseBodyFunctions();
            return TeaModel.build(map, self);
        }

        public ListFunctionsResponseBodyFunctions setCaPort(Integer caPort) {
            this.caPort = caPort;
            return this;
        }
        public Integer getCaPort() {
            return this.caPort;
        }

        public ListFunctionsResponseBodyFunctions setCodeChecksum(String codeChecksum) {
            this.codeChecksum = codeChecksum;
            return this;
        }
        public String getCodeChecksum() {
            return this.codeChecksum;
        }

        public ListFunctionsResponseBodyFunctions setCodeSize(Long codeSize) {
            this.codeSize = codeSize;
            return this;
        }
        public Long getCodeSize() {
            return this.codeSize;
        }

        public ListFunctionsResponseBodyFunctions setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListFunctionsResponseBodyFunctions setCustomContainerConfig(CustomContainerConfig customContainerConfig) {
            this.customContainerConfig = customContainerConfig;
            return this;
        }
        public CustomContainerConfig getCustomContainerConfig() {
            return this.customContainerConfig;
        }

        public ListFunctionsResponseBodyFunctions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFunctionsResponseBodyFunctions setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public java.util.Map<String, String> getEnvironmentVariables() {
            return this.environmentVariables;
        }

        public ListFunctionsResponseBodyFunctions setFunctionId(String functionId) {
            this.functionId = functionId;
            return this;
        }
        public String getFunctionId() {
            return this.functionId;
        }

        public ListFunctionsResponseBodyFunctions setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public ListFunctionsResponseBodyFunctions setHandler(String handler) {
            this.handler = handler;
            return this;
        }
        public String getHandler() {
            return this.handler;
        }

        public ListFunctionsResponseBodyFunctions setInitializationTimeout(Integer initializationTimeout) {
            this.initializationTimeout = initializationTimeout;
            return this;
        }
        public Integer getInitializationTimeout() {
            return this.initializationTimeout;
        }

        public ListFunctionsResponseBodyFunctions setInitializer(String initializer) {
            this.initializer = initializer;
            return this;
        }
        public String getInitializer() {
            return this.initializer;
        }

        public ListFunctionsResponseBodyFunctions setInstanceConcurrency(Integer instanceConcurrency) {
            this.instanceConcurrency = instanceConcurrency;
            return this;
        }
        public Integer getInstanceConcurrency() {
            return this.instanceConcurrency;
        }

        public ListFunctionsResponseBodyFunctions setInstanceLifecycleConfig(InstanceLifecycleConfig instanceLifecycleConfig) {
            this.instanceLifecycleConfig = instanceLifecycleConfig;
            return this;
        }
        public InstanceLifecycleConfig getInstanceLifecycleConfig() {
            return this.instanceLifecycleConfig;
        }

        public ListFunctionsResponseBodyFunctions setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListFunctionsResponseBodyFunctions setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListFunctionsResponseBodyFunctions setLayers(java.util.List<String> layers) {
            this.layers = layers;
            return this;
        }
        public java.util.List<String> getLayers() {
            return this.layers;
        }

        public ListFunctionsResponseBodyFunctions setMemorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Integer getMemorySize() {
            return this.memorySize;
        }

        public ListFunctionsResponseBodyFunctions setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public ListFunctionsResponseBodyFunctions setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

}
