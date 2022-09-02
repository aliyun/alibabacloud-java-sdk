// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListFunctionsResponseBody extends TeaModel {
    @NameInMap("functions")
    public java.util.List<ListFunctionsResponseBodyFunctions> functions;

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
        @NameInMap("caPort")
        public Integer caPort;

        @NameInMap("codeChecksum")
        public String codeChecksum;

        @NameInMap("codeSize")
        public Long codeSize;

        @NameInMap("createdTime")
        public String createdTime;

        @NameInMap("customContainerConfig")
        public CustomContainerConfig customContainerConfig;

        @NameInMap("customHealthCheckConfig")
        public CustomHealthCheckConfig customHealthCheckConfig;

        @NameInMap("description")
        public String description;

        @NameInMap("environmentVariables")
        public java.util.Map<String, String> environmentVariables;

        @NameInMap("functionId")
        public String functionId;

        @NameInMap("functionName")
        public String functionName;

        @NameInMap("handler")
        public String handler;

        @NameInMap("initializationTimeout")
        public Integer initializationTimeout;

        @NameInMap("initializer")
        public String initializer;

        @NameInMap("instanceConcurrency")
        public Integer instanceConcurrency;

        @NameInMap("instanceLifecycleConfig")
        public InstanceLifecycleConfig instanceLifecycleConfig;

        @NameInMap("instanceSoftConcurrency")
        public Integer instanceSoftConcurrency;

        @NameInMap("instanceType")
        public String instanceType;

        @NameInMap("lastModifiedTime")
        public String lastModifiedTime;

        @NameInMap("layers")
        public java.util.List<String> layers;

        @NameInMap("memorySize")
        public Integer memorySize;

        @NameInMap("runtime")
        public String runtime;

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

        public ListFunctionsResponseBodyFunctions setCustomHealthCheckConfig(CustomHealthCheckConfig customHealthCheckConfig) {
            this.customHealthCheckConfig = customHealthCheckConfig;
            return this;
        }
        public CustomHealthCheckConfig getCustomHealthCheckConfig() {
            return this.customHealthCheckConfig;
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

        public ListFunctionsResponseBodyFunctions setInstanceSoftConcurrency(Integer instanceSoftConcurrency) {
            this.instanceSoftConcurrency = instanceSoftConcurrency;
            return this;
        }
        public Integer getInstanceSoftConcurrency() {
            return this.instanceSoftConcurrency;
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
