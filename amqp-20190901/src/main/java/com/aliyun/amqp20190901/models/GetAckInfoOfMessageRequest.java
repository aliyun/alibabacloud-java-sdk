// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetAckInfoOfMessageRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsumeStatus")
    public String consumeStatus;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeliveryTag")
    public String deliveryTag;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MsgId")
    public String msgId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TimeStamp")
    public String timeStamp;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VhostName")
    public String vhostName;

    public static GetAckInfoOfMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAckInfoOfMessageRequest self = new GetAckInfoOfMessageRequest();
        return TeaModel.build(map, self);
    }

    public GetAckInfoOfMessageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetAckInfoOfMessageRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public GetAckInfoOfMessageRequest setConsumeStatus(String consumeStatus) {
        this.consumeStatus = consumeStatus;
        return this;
    }
    public String getConsumeStatus() {
        return this.consumeStatus;
    }

    public GetAckInfoOfMessageRequest setDeliveryTag(String deliveryTag) {
        this.deliveryTag = deliveryTag;
        return this;
    }
    public String getDeliveryTag() {
        return this.deliveryTag;
    }

    public GetAckInfoOfMessageRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetAckInfoOfMessageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAckInfoOfMessageRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public GetAckInfoOfMessageRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public GetAckInfoOfMessageRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetAckInfoOfMessageRequest setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public String getTimeStamp() {
        return this.timeStamp;
    }

    public GetAckInfoOfMessageRequest setVhostName(String vhostName) {
        this.vhostName = vhostName;
        return this;
    }
    public String getVhostName() {
        return this.vhostName;
    }

}
