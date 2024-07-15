// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutAsyncInvokeConfigInput extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("asyncTask")
    public Boolean asyncTask;

    @NameInMap("destinationConfig")
    public DestinationConfig destinationConfig;

    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("maxAsyncEventAgeInSeconds")
    public Long maxAsyncEventAgeInSeconds;

    /**
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
