// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class EventSourceConfig extends TeaModel {
    /**
     * <p>The event source. Custom event sources include Message Service (MNS), ApsaraMQ for RocketMQ, ApsaraMQ for RabbitMQ, ApsaraMQ for Kafka, ApsaraMQ for MQTT, and Data Transmission Service (DTS).</p>
     */
    @NameInMap("eventSourceParameters")
    public EventSourceParameters eventSourceParameters;

    /**
     * <p>The event source type. Valid values:</p>
     * <ul>
     * <li><strong>Default</strong>: Alibaba Cloud EventBridge sources</li>
     * <li><strong>MNS</strong>: Message Service (MNS)</li>
     * <li><strong>RocketMQ</strong>: ApsaraMQ for RocketMQ</li>
     * <li><strong>RabbitMQ</strong>: ApsaraMQ for RabbitMQ</li>
     * <li><strong>Kafka</strong>: ApsaraMQ for Kafka</li>
     * <li><strong>MQTT</strong>: ApsaraMQ for MQTT</li>
     * <li><strong>DTS</strong>: DTS</li>
     * </ul>
     * <blockquote>
     * <p> This parameter cannot be updated. If you specify this parameter when you update the configurations, it does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MNS</p>
     */
    @NameInMap("eventSourceType")
    public String eventSourceType;

    public static EventSourceConfig build(java.util.Map<String, ?> map) throws Exception {
        EventSourceConfig self = new EventSourceConfig();
        return TeaModel.build(map, self);
    }

    public EventSourceConfig setEventSourceParameters(EventSourceParameters eventSourceParameters) {
        this.eventSourceParameters = eventSourceParameters;
        return this;
    }
    public EventSourceParameters getEventSourceParameters() {
        return this.eventSourceParameters;
    }

    public EventSourceConfig setEventSourceType(String eventSourceType) {
        this.eventSourceType = eventSourceType;
        return this;
    }
    public String getEventSourceType() {
        return this.eventSourceType;
    }

}
