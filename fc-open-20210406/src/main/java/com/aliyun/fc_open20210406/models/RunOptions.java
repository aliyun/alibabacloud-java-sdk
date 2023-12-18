// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class RunOptions extends TeaModel {
    @NameInMap("batchWindow")
    public BatchWindow batchWindow;

    @NameInMap("deadLetterQueue")
    public DeadLetterQueue deadLetterQueue;

    @NameInMap("errorsTolerance")
    public String errorsTolerance;

    @NameInMap("maximumTasks")
    public Long maximumTasks;

    @NameInMap("mode")
    public String mode;

    @NameInMap("retryStrategy")
    public RetryStrategy retryStrategy;

    public static RunOptions build(java.util.Map<String, ?> map) throws Exception {
        RunOptions self = new RunOptions();
        return TeaModel.build(map, self);
    }

    public RunOptions setBatchWindow(BatchWindow batchWindow) {
        this.batchWindow = batchWindow;
        return this;
    }
    public BatchWindow getBatchWindow() {
        return this.batchWindow;
    }

    public RunOptions setDeadLetterQueue(DeadLetterQueue deadLetterQueue) {
        this.deadLetterQueue = deadLetterQueue;
        return this;
    }
    public DeadLetterQueue getDeadLetterQueue() {
        return this.deadLetterQueue;
    }

    public RunOptions setErrorsTolerance(String errorsTolerance) {
        this.errorsTolerance = errorsTolerance;
        return this;
    }
    public String getErrorsTolerance() {
        return this.errorsTolerance;
    }

    public RunOptions setMaximumTasks(Long maximumTasks) {
        this.maximumTasks = maximumTasks;
        return this;
    }
    public Long getMaximumTasks() {
        return this.maximumTasks;
    }

    public RunOptions setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public RunOptions setRetryStrategy(RetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
        return this;
    }
    public RetryStrategy getRetryStrategy() {
        return this.retryStrategy;
    }

}
