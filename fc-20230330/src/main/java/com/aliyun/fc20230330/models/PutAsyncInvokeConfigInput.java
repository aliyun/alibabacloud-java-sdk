// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutAsyncInvokeConfigInput extends TeaModel {
    /**
     * <p>Optional. Specify whether to enable the asynchronous task feature.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("asyncTask")
    public Boolean asyncTask;

    /**
     * <p>Optional. The struct of the destination of asynchronous invocations.</p>
     */
    @NameInMap("destinationConfig")
    public DestinationConfig destinationConfig;

    /**
     * <p>Optional. The maximum validity period of a message. Valid values: [1,604800]. Default value: 86400. Unit: seconds.</p>
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

    public static PutAsyncInvokeConfigInput build(java.util.Map<String, ?> map) throws Exception {
        PutAsyncInvokeConfigInput self = new PutAsyncInvokeConfigInput();
        return TeaModel.build(map, self);
    }

    public PutAsyncInvokeConfigInput setAsyncTask(Boolean asyncTask) {
        this.asyncTask = asyncTask;
        return this;
    }
    public Boolean getAsyncTask() {
        return this.asyncTask;
    }

    public PutAsyncInvokeConfigInput setDestinationConfig(DestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
        return this;
    }
    public DestinationConfig getDestinationConfig() {
        return this.destinationConfig;
    }

    public PutAsyncInvokeConfigInput setMaxAsyncEventAgeInSeconds(Long maxAsyncEventAgeInSeconds) {
        this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
        return this;
    }
    public Long getMaxAsyncEventAgeInSeconds() {
        return this.maxAsyncEventAgeInSeconds;
    }

    public PutAsyncInvokeConfigInput setMaxAsyncRetryAttempts(Long maxAsyncRetryAttempts) {
        this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
        return this;
    }
    public Long getMaxAsyncRetryAttempts() {
        return this.maxAsyncRetryAttempts;
    }

}
