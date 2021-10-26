// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetFunctionAsyncInvokeConfigResponseBody extends TeaModel {
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
