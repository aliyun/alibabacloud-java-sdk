// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutFunctionAsyncInvokeConfigRequest extends TeaModel {
    @NameInMap("destinationConfig")
    public DestinationConfig destinationConfig;

    // 消息最大存活时长
    @NameInMap("maxAsyncEventAgeInSeconds")
    public Long maxAsyncEventAgeInSeconds;

    // 异步调用失败后的最大重试次数
    @NameInMap("maxAsyncRetryAttempts")
    public Long maxAsyncRetryAttempts;

    @NameInMap("statefulInvocation")
    public Boolean statefulInvocation;

    // 别名或版本
    @NameInMap("qualifier")
    public String qualifier;

    public static PutFunctionAsyncInvokeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PutFunctionAsyncInvokeConfigRequest self = new PutFunctionAsyncInvokeConfigRequest();
        return TeaModel.build(map, self);
    }

    public PutFunctionAsyncInvokeConfigRequest setDestinationConfig(DestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
        return this;
    }
    public DestinationConfig getDestinationConfig() {
        return this.destinationConfig;
    }

    public PutFunctionAsyncInvokeConfigRequest setMaxAsyncEventAgeInSeconds(Long maxAsyncEventAgeInSeconds) {
        this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
        return this;
    }
    public Long getMaxAsyncEventAgeInSeconds() {
        return this.maxAsyncEventAgeInSeconds;
    }

    public PutFunctionAsyncInvokeConfigRequest setMaxAsyncRetryAttempts(Long maxAsyncRetryAttempts) {
        this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
        return this;
    }
    public Long getMaxAsyncRetryAttempts() {
        return this.maxAsyncRetryAttempts;
    }

    public PutFunctionAsyncInvokeConfigRequest setStatefulInvocation(Boolean statefulInvocation) {
        this.statefulInvocation = statefulInvocation;
        return this;
    }
    public Boolean getStatefulInvocation() {
        return this.statefulInvocation;
    }

    public PutFunctionAsyncInvokeConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
