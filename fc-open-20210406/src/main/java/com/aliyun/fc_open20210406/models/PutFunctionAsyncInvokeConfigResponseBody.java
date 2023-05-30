// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutFunctionAsyncInvokeConfigResponseBody extends TeaModel {
    /**
     * <p>Sat, 14 Jul 2017 07:02:38 GMT</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The trace ID of the invocation request of Function Compute.</p>
     */
    @NameInMap("destinationConfig")
    public DestinationConfig destinationConfig;

    /**
     * <p>The name of the function.</p>
     */
    @NameInMap("function")
    public String function;

    /**
     * <p>The configuration structure of the destination for asynchronous invocation.</p>
     */
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>Specifies whether to enable the asynchronous task feature. </p>
     * <br>
     * <p>- **true**: enables the asynchronous task feature. </p>
     * <p>- **false**: does not enable the asynchronous task feature.</p>
     */
    @NameInMap("maxAsyncEventAgeInSeconds")
    public Long maxAsyncEventAgeInSeconds;

    /**
     * <p>The ID of your Alibaba Cloud account.</p>
     */
    @NameInMap("maxAsyncRetryAttempts")
    public Long maxAsyncRetryAttempts;

    /**
     * <p>Specifies whether to enable the asynchronous task feature. </p>
     * <br>
     * <p>- **true**: enables the asynchronous task feature. </p>
     * <p>- **false**: does not enable the asynchronous task feature.</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>Creates or modifies an asynchronous invocation configuration for a function.</p>
     */
    @NameInMap("service")
    public String service;

    /**
     * <p>Jianyi</p>
     */
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
