// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutFunctionAsyncInvokeConfigRequest extends TeaModel {
    /**
     * <p>The configuration struct of the destination for asynchronous invocations.</p>
     */
    @NameInMap("destinationConfig")
    public DestinationConfig destinationConfig;

    /**
     * <p>The maximum validity period of a message. Valid values: [1,604800]. Default value: 86400. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("maxAsyncEventAgeInSeconds")
    public Long maxAsyncEventAgeInSeconds;

    /**
     * <p>Optional. The maximum number of retries if an asynchronous invocation fails. Valid values: [0,8]. If you do not configure this parameter, the default number of retries is 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("maxAsyncRetryAttempts")
    public Long maxAsyncRetryAttempts;

    /**
     * <p>Specifies whether to enable the asynchronous task feature.</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("statefulInvocation")
    public Boolean statefulInvocation;

    /**
     * <p>The version or alias of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
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
