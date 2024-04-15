// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class DeliveryOption extends TeaModel {
    @NameInMap("concurrency")
    public Long concurrency;

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
