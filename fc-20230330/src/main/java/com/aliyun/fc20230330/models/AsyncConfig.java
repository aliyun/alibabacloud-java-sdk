// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class AsyncConfig extends TeaModel {
    /**
     * <p>Specifies whether to enable the asynchronous task feature.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("asyncTask")
    public Boolean asyncTask;

    /**
     * <p>The time when the asynchronous invocation configuration was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2006-01-02T15:04:05Z07:00</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The destination configuration.</p>
     */
    @NameInMap("destinationConfig")
    public DestinationConfig destinationConfig;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the function.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:cn-shanghai:1234/functions/my-func</p>
     */
    @NameInMap("functionArn")
    public String functionArn;

    /**
     * <p>The time when the asynchronous invocation was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2006-01-02T15:04:05Z07:00</p>
     */
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>The maximum time to live (TTL) value of an event.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("maxAsyncEventAgeInSeconds")
    public Long maxAsyncEventAgeInSeconds;

    /**
     * <p>The number of times when an asynchronous invocation is retried.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
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
