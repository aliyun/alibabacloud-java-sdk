// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutFunctionAsyncInvokeConfigResponseBody extends TeaModel {
    // 创建时间
    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("destinationConfig")
    public DestinationConfig destinationConfig;

    // 函数名称
    @NameInMap("function")
    public String function;

    // 最后更改时间
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    // 消息最大存活时长
    @NameInMap("maxAsyncEventAgeInSeconds")
    public Long maxAsyncEventAgeInSeconds;

    // 异步调用失败后的最大重试次数
    @NameInMap("maxAsyncRetryAttempts")
    public Long maxAsyncRetryAttempts;

    // 限定符
    @NameInMap("qualifier")
    public String qualifier;

    // 服务名称
    @NameInMap("service")
    public String service;

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
