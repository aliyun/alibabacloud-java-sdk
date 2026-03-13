// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class DeliveryOption extends TeaModel {
    /**
     * <p>The maximum number of concurrent events that can be delivered by the upstream event source to Function Compute. This parameter is valid only when ApsaraMQ for Kafka is used as the event source.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("concurrency")
    public Long concurrency;

    /**
     * <p>The format of each data element in the event parameter of the function. CloudEvents: describes event data in a common format, including event description and event payload data. CloudEvents is designed to simplify event declaration and transmission between different services and platforms. This is the default value. RawData: delivers only the event payload data and does not include other metadata information in the CloudEvents format.</p>
     * 
     * <strong>example:</strong>
     * <p>RawData</p>
     */
    @NameInMap("eventSchema")
    public String eventSchema;

    public static DeliveryOption build(java.util.Map<String, ?> map) throws Exception {
        DeliveryOption self = new DeliveryOption();
        return TeaModel.build(map, self);
    }

    public DeliveryOption setConcurrency(Long concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Long getConcurrency() {
        return this.concurrency;
    }

    public DeliveryOption setEventSchema(String eventSchema) {
        this.eventSchema = eventSchema;
        return this;
    }
    public String getEventSchema() {
        return this.eventSchema;
    }

}
