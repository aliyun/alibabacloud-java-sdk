// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class AsyncConfig extends TeaModel {
    @NameInMap("asyncTask")
    public Boolean asyncTask;

    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("destinationConfig")
    public DestinationConfig destinationConfig;

    @NameInMap("functionArn")
    public String functionArn;

    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("maxAsyncEventAgeInSeconds")
    public Long maxAsyncEventAgeInSeconds;

    @NameInMap("maxAsyncRetryAttempts")
    public Long maxAsyncRetryAttempts;

    public static AsyncConfig build(java.util.Map<String, ?> map) throws Exception {
        AsyncConfig self = new AsyncConfig();
        return TeaModel.build(map, self);
    }

    public AsyncConfig setAsyncTask(Boolean asyncTask) {
        this.asyncTask = asyncTask;
        return this;
    }
    public Boolean getAsyncTask() {
        return this.asyncTask;
    }

    public AsyncConfig setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public AsyncConfig setDestinationConfig(DestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
        return this;
    }
    public DestinationConfig getDestinationConfig() {
        return this.destinationConfig;
    }

    public AsyncConfig setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
        return this;
    }
    public String getFunctionArn() {
        return this.functionArn;
    }

    public AsyncConfig setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public AsyncConfig setMaxAsyncEventAgeInSeconds(Long maxAsyncEventAgeInSeconds) {
        this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
        return this;
    }
    public Long getMaxAsyncEventAgeInSeconds() {
        return this.maxAsyncEventAgeInSeconds;
    }

    public AsyncConfig setMaxAsyncRetryAttempts(Long maxAsyncRetryAttempts) {
        this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
        return this;
    }
    public Long getMaxAsyncRetryAttempts() {
        return this.maxAsyncRetryAttempts;
    }

}
