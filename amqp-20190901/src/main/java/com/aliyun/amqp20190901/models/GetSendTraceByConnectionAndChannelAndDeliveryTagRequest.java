// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetSendTraceByConnectionAndChannelAndDeliveryTagRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConnectionId")
    public String connectionId;

    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeliveryTag")
    public Long deliveryTag;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public Integer startTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VhostName")
    public String vhostName;

    public static GetSendTraceByConnectionAndChannelAndDeliveryTagRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSendTraceByConnectionAndChannelAndDeliveryTagRequest self = new GetSendTraceByConnectionAndChannelAndDeliveryTagRequest();
        return TeaModel.build(map, self);
    }

    public GetSendTraceByConnectionAndChannelAndDeliveryTagRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public GetSendTraceByConnectionAndChannelAndDeliveryTagRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetSendTraceByConnectionAndChannelAndDeliveryTagRequest setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public GetSendTraceByConnectionAndChannelAndDeliveryTagRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public GetSendTraceByConnectionAndChannelAndDeliveryTagRequest setDeliveryTag(Long deliveryTag) {
        this.deliveryTag = deliveryTag;
        return this;
    }
    public Long getDeliveryTag() {
        return this.deliveryTag;
    }

    public GetSendTraceByConnectionAndChannelAndDeliveryTagRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public GetSendTraceByConnectionAndChannelAndDeliveryTagRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSendTraceByConnectionAndChannelAndDeliveryTagRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public GetSendTraceByConnectionAndChannelAndDeliveryTagRequest setVhostName(String vhostName) {
        this.vhostName = vhostName;
        return this;
    }
    public String getVhostName() {
        return this.vhostName;
    }

}
