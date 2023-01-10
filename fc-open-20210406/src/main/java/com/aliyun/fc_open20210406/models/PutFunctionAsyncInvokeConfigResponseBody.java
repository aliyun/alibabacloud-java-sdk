// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutFunctionAsyncInvokeConfigResponseBody extends TeaModel {
    // The creation time.
    @NameInMap("createdTime")
    public String createdTime;

    // The configuration structure of the destination for asynchronous invocation.
    @NameInMap("destinationConfig")
    public DestinationConfig destinationConfig;

    // The name of the function.
    @NameInMap("function")
    public String function;

    // The time when the configuration was last modified.
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    // The maximum validity period of messages.
    @NameInMap("maxAsyncEventAgeInSeconds")
    public Long maxAsyncEventAgeInSeconds;

    // The maximum number of retries allowed after an asynchronous invocation fails.
    @NameInMap("maxAsyncRetryAttempts")
    public Long maxAsyncRetryAttempts;

    // The qualifier.
    @NameInMap("qualifier")
    public String qualifier;

    // The name of the service.
    @NameInMap("service")
    public String service;

    // Specifies whether to enable the asynchronous task feature. 
    // 
    // - **true**: enables the asynchronous task feature. 
    // - **false**: does not enable the asynchronous task feature.
    @NameInMap("statefulInvocation")
    public Boolean statefulInvocation;

    public static PutFunctionAsyncInvokeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutFunctionAsyncInvokeConfigResponseBody self = new PutFunctionAsyncInvokeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public PutFunctionAsyncInvokeConfigResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public PutFunctionAsyncInvokeConfigResponseBody setDestinationConfig(DestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
        return this;
    }
    public DestinationConfig getDestinationConfig() {
        return this.destinationConfig;
    }

    public PutFunctionAsyncInvokeConfigResponseBody setFunction(String function) {
        this.function = function;
        return this;
    }
    public String getFunction() {
        return this.function;
    }

    public PutFunctionAsyncInvokeConfigResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public PutFunctionAsyncInvokeConfigResponseBody setMaxAsyncEventAgeInSeconds(Long maxAsyncEventAgeInSeconds) {
        this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
        return this;
    }
    public Long getMaxAsyncEventAgeInSeconds() {
        return this.maxAsyncEventAgeInSeconds;
    }

    public PutFunctionAsyncInvokeConfigResponseBody setMaxAsyncRetryAttempts(Long maxAsyncRetryAttempts) {
        this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
        return this;
    }
    public Long getMaxAsyncRetryAttempts() {
        return this.maxAsyncRetryAttempts;
    }

    public PutFunctionAsyncInvokeConfigResponseBody setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public PutFunctionAsyncInvokeConfigResponseBody setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public PutFunctionAsyncInvokeConfigResponseBody setStatefulInvocation(Boolean statefulInvocation) {
        this.statefulInvocation = statefulInvocation;
        return this;
    }
    public Boolean getStatefulInvocation() {
        return this.statefulInvocation;
    }

}
