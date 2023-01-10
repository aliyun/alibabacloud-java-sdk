// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutFunctionAsyncInvokeConfigRequest extends TeaModel {
    // The configuration structure of the destination for asynchronous invocation.
    @NameInMap("destinationConfig")
    public DestinationConfig destinationConfig;

    // The maximum validity period of messages. Valid values: 1 to 2592000. Unit: seconds.
    @NameInMap("maxAsyncEventAgeInSeconds")
    public Long maxAsyncEventAgeInSeconds;

    // The maximum number of retries allowed after an asynchronous invocation fails. Default value: 3. Valid values: 0 to 8.
    @NameInMap("maxAsyncRetryAttempts")
    public Long maxAsyncRetryAttempts;

    // Specifies whether to enable the asynchronous task feature. 
    // 
    // - **true**: enables the asynchronous task feature. 
    // - **false**: does not enable the asynchronous task feature.
    @NameInMap("statefulInvocation")
    public Boolean statefulInvocation;

    // The version or alias of the service.
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
