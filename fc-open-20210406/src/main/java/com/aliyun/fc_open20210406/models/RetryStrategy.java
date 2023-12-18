// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class RetryStrategy extends TeaModel {
    @NameInMap("MaximumEventAgeInSeconds")
    public Long maximumEventAgeInSeconds;

    @NameInMap("MaximumRetryAttempts")
    public Long maximumRetryAttempts;

    @NameInMap("PushRetryStrategy")
    public String pushRetryStrategy;

    public static RetryStrategy build(java.util.Map<String, ?> map) throws Exception {
        RetryStrategy self = new RetryStrategy();
        return TeaModel.build(map, self);
    }

    public RetryStrategy setMaximumEventAgeInSeconds(Long maximumEventAgeInSeconds) {
        this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
        return this;
    }
    public Long getMaximumEventAgeInSeconds() {
        return this.maximumEventAgeInSeconds;
    }

    public RetryStrategy setMaximumRetryAttempts(Long maximumRetryAttempts) {
        this.maximumRetryAttempts = maximumRetryAttempts;
        return this;
    }
    public Long getMaximumRetryAttempts() {
        return this.maximumRetryAttempts;
    }

    public RetryStrategy setPushRetryStrategy(String pushRetryStrategy) {
        this.pushRetryStrategy = pushRetryStrategy;
        return this;
    }
    public String getPushRetryStrategy() {
        return this.pushRetryStrategy;
    }

}
