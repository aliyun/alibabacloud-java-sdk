// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListFunctionAsyncInvokeConfigsResponseBody extends TeaModel {
    // The list of asynchronous invocation configurations.
    @NameInMap("configs")
    public java.util.List<ListFunctionAsyncInvokeConfigsResponseBodyConfigs> configs;

    // The token used to obtain more results.
    @NameInMap("nextToken")
    public String nextToken;

    public static ListFunctionAsyncInvokeConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionAsyncInvokeConfigsResponseBody self = new ListFunctionAsyncInvokeConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFunctionAsyncInvokeConfigsResponseBody setConfigs(java.util.List<ListFunctionAsyncInvokeConfigsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListFunctionAsyncInvokeConfigsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListFunctionAsyncInvokeConfigsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListFunctionAsyncInvokeConfigsResponseBodyConfigs extends TeaModel {
        // The time when the desktop group was created.
        @NameInMap("createdTime")
        public String createdTime;

        // The configuration structure of the destination for asynchronous invocations. If you have not configured this parameter, this parameter is null.
        @NameInMap("destinationConfig")
        public DestinationConfig destinationConfig;

        // The name of the function.
        @NameInMap("function")
        public String function;

        // The time when the configuration was last modified.
        @NameInMap("lastModifiedTime")
        public String lastModifiedTime;

        // The maximum validity period of a message. If you have not configured this parameter, this parameter is null.
        @NameInMap("maxAsyncEventAgeInSeconds")
        public Long maxAsyncEventAgeInSeconds;

        // The maximum number of retries allowed after an asynchronous invocation fails. If you have not configured this parameter, this parameter is null.
        @NameInMap("maxAsyncRetryAttempts")
        public Long maxAsyncRetryAttempts;

        // The version or alias of the service.
        @NameInMap("qualifier")
        public String qualifier;

        // The name of the service.
        @NameInMap("service")
        public String service;

        // Indicates whether the asynchronous task feature is enabled.
        // 
        // *   **true**: The asynchronous task feature is enabled.
        // *   **false**: The asynchronous task feature is disabled.
        // 
        // If you have not configured this parameter, this parameter is null.
        @NameInMap("statefulInvocation")
        public Boolean statefulInvocation;

        public static ListFunctionAsyncInvokeConfigsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionAsyncInvokeConfigsResponseBodyConfigs self = new ListFunctionAsyncInvokeConfigsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListFunctionAsyncInvokeConfigsResponseBodyConfigs setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListFunctionAsyncInvokeConfigsResponseBodyConfigs setDestinationConfig(DestinationConfig destinationConfig) {
            this.destinationConfig = destinationConfig;
            return this;
        }
        public DestinationConfig getDestinationConfig() {
            return this.destinationConfig;
        }

        public ListFunctionAsyncInvokeConfigsResponseBodyConfigs setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public ListFunctionAsyncInvokeConfigsResponseBodyConfigs setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListFunctionAsyncInvokeConfigsResponseBodyConfigs setMaxAsyncEventAgeInSeconds(Long maxAsyncEventAgeInSeconds) {
            this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
            return this;
        }
        public Long getMaxAsyncEventAgeInSeconds() {
            return this.maxAsyncEventAgeInSeconds;
        }

        public ListFunctionAsyncInvokeConfigsResponseBodyConfigs setMaxAsyncRetryAttempts(Long maxAsyncRetryAttempts) {
            this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
            return this;
        }
        public Long getMaxAsyncRetryAttempts() {
            return this.maxAsyncRetryAttempts;
        }

        public ListFunctionAsyncInvokeConfigsResponseBodyConfigs setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

        public ListFunctionAsyncInvokeConfigsResponseBodyConfigs setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public ListFunctionAsyncInvokeConfigsResponseBodyConfigs setStatefulInvocation(Boolean statefulInvocation) {
            this.statefulInvocation = statefulInvocation;
            return this;
        }
        public Boolean getStatefulInvocation() {
            return this.statefulInvocation;
        }

    }

}
