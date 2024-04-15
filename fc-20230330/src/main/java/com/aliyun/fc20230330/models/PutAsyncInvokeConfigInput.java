// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutAsyncInvokeConfigInput extends TeaModel {
    @NameInMap("asyncTask")
    public Boolean asyncTask;

    @NameInMap("destinationConfig")
    public DestinationConfig destinationConfig;

    @NameInMap("maxAsyncEventAgeInSeconds")
    public Long maxAsyncEventAgeInSeconds;

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
