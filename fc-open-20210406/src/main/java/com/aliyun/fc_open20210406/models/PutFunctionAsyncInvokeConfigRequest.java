// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutFunctionAsyncInvokeConfigRequest extends TeaModel {
    /**
     * <p>You can search for API operations, call and debug API operations online, and dynamically generate executable sample code for SDKs.</p>
     */
    @NameInMap("destinationConfig")
    public DestinationConfig destinationConfig;

    /**
     * <p>Alibaba Cloud CLI</p>
     */
    @NameInMap("maxAsyncEventAgeInSeconds")
    public Long maxAsyncEventAgeInSeconds;

    /**
     * <p>The information about the asynchronous invocation configuration.</p>
     */
    @NameInMap("maxAsyncRetryAttempts")
    public Long maxAsyncRetryAttempts;

    /**
     * <p>The version or alias of the service.</p>
     */
    @NameInMap("statefulInvocation")
    public Boolean statefulInvocation;

    /**
     * <p>The latest version of Function Compute API.</p>
     */
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
