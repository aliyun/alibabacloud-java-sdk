// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class RunOptions extends TeaModel {
    /**
     * <p>The batch window configurations.</p>
     */
    @NameInMap("batchWindow")
    public BatchWindow batchWindow;

    /**
     * <p>Whether to enable dead-letter queues. If you configure this parameter, dead-letter queues are enabled. By default, dead-letter queues are not enabled and messages are discarded when the retry policy is exhausted. Queues of Simple Message Queue (formerly MNS), ApsaraMQ for RocketMQ, and ApsaraMQ for Kafka, and EventBridge event buses can be used as dead-letter queues.</p>
     */
    @NameInMap("deadLetterQueue")
    public DeadLetterQueue deadLetterQueue;

    /**
     * <p>The fault tolerance policy. Valid values:</p>
     * <ul>
     * <li><strong>NONE</strong>: does not tolerate exceptions.</li>
     * <li><strong>ALL</strong>: tolerates all exceptions.</li>
     * </ul>
     * <blockquote>
     * <p> The default value is <strong>NONE</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("errorsTolerance")
    public String errorsTolerance;

    /**
     * <p>The underlying application mode when message data is pushed to Function Compute. Valid values:</p>
     * <ul>
     * <li><strong>event-streaming</strong>: the event streaming mode. In this mode, events are pushed in arrays. One or more message events are pushed to the function in batches based on your push configurations. This mode is suitable for end-to-end streaming data processing scenarios. The event streaming mode supports the following event sources: Simple Message Queue (formerly MNS), ApsaraMQ for RocketMQ, ApsaraMQ for RabbitMQ, ApsaraMQ for Kafka, ApsaraMQ for MQTT, and Data Transmission Service (DTS).</li>
     * <li><strong>event-driven</strong>: the event mode. In event mode, a single message is passed to the function as event parameters at a time. Events follow the CloudEvents specifications. The event mode supports the following event sources: Default, Simple Message Queue (formerly MNS), ApsaraMQ for RocketMQ, and ApsaraMQ for RabbitMQ. In this mode, batch configurations are not supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>event-streaming</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The retry policy that you want to use if events fail to be pushed.</p>
     */
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
