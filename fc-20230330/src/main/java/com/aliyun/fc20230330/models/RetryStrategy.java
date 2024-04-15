// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class RetryStrategy extends TeaModel {
    @NameInMap("PushRetryStrategy")
    public String pushRetryStrategy;

    public static RetryStrategy build(java.util.Map<String, ?> map) throws Exception {
        RetryStrategy self = new RetryStrategy();
        return TeaModel.build(map, self);
    }

    public RetryStrategy setPushRetryStrategy(String pushRetryStrategy) {
        this.pushRetryStrategy = pushRetryStrategy;
        return this;
    }
    public String getPushRetryStrategy() {
        return this.pushRetryStrategy;
    }

}
