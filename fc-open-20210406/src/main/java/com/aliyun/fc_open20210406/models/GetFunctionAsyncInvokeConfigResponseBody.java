// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetFunctionAsyncInvokeConfigResponseBody extends TeaModel {
    // The time when the desktop group was created.
    @NameInMap("createdTime")
    public String createdTime;

    // The configuration structure of the destination for asynchronous invocations.
    @NameInMap("destinationConfig")
    public DestinationConfig destinationConfig;

    // The name of the function.
    @NameInMap("function")
    public String function;

    // The time when the configuration was last modified.
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    // The maximum validity period of a message.
    @NameInMap("maxAsyncEventAgeInSeconds")
    public Long maxAsyncEventAgeInSeconds;

    // The maximum number of retries allowed after an asynchronous invocation fails.
    @NameInMap("maxAsyncRetryAttempts")
    public Long maxAsyncRetryAttempts;

    // The version or alias of the service to which the function belongs.
    @NameInMap("qualifier")
    public String qualifier;

    // The name of the service.
    @NameInMap("service")
    public String service;

    // Indicates whether the asynchronous task feature is enabled.
    // 
    // *   **true**: The asynchronous task feature is enabled.
    // *   **false**: The asynchronous task feature is disabled.
    @NameInMap("statefulInvocation")
    public Boolean statefulInvocation;

    public static GetFunctionAsyncInvokeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionAsyncInvokeConfigResponseBody self = new GetFunctionAsyncInvokeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFunctionAsyncInvokeConfigResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public GetFunctionAsyncInvokeConfigResponseBody setDestinationConfig(DestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
        return this;
    }
    public DestinationConfig getDestinationConfig() {
        return this.destinationConfig;
    }

    public GetFunctionAsyncInvokeConfigResponseBody setFunction(String function) {
        this.function = function;
        return this;
    }
    public String getFunction() {
        return this.function;
    }

    public GetFunctionAsyncInvokeConfigResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public GetFunctionAsyncInvokeConfigResponseBody setMaxAsyncEventAgeInSeconds(Long maxAsyncEventAgeInSeconds) {
        this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
        return this;
    }
    public Long getMaxAsyncEventAgeInSeconds() {
        return this.maxAsyncEventAgeInSeconds;
    }

    public GetFunctionAsyncInvokeConfigResponseBody setMaxAsyncRetryAttempts(Long maxAsyncRetryAttempts) {
        this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
        return this;
    }
    public Long getMaxAsyncRetryAttempts() {
        return this.maxAsyncRetryAttempts;
    }

    public GetFunctionAsyncInvokeConfigResponseBody setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public GetFunctionAsyncInvokeConfigResponseBody setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public GetFunctionAsyncInvokeConfigResponseBody setStatefulInvocation(Boolean statefulInvocation) {
        this.statefulInvocation = statefulInvocation;
        return this;
    }
    public Boolean getStatefulInvocation() {
        return this.statefulInvocation;
    }

}
