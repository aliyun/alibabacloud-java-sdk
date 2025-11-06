// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class UpdateInstanceRetryStrategyRequest extends TeaModel {
    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RetryInterval")
    public Integer retryInterval;

    @NameInMap("RetryTimes")
    public Integer retryTimes;

    public static UpdateInstanceRetryStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceRetryStrategyRequest self = new UpdateInstanceRetryStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceRetryStrategyRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public UpdateInstanceRetryStrategyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceRetryStrategyRequest setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    public UpdateInstanceRetryStrategyRequest setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }
    public Integer getRetryTimes() {
        return this.retryTimes;
    }

}
