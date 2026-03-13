// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class EventSinkConfig extends TeaModel {
    /**
     * <p>The event push configurations.</p>
     */
    @NameInMap("deliveryOption")
    public DeliveryOption deliveryOption;

    public static EventSinkConfig build(java.util.Map<String, ?> map) throws Exception {
        EventSinkConfig self = new EventSinkConfig();
        return TeaModel.build(map, self);
    }

    public EventSinkConfig setDeliveryOption(DeliveryOption deliveryOption) {
        this.deliveryOption = deliveryOption;
        return this;
    }
    public DeliveryOption getDeliveryOption() {
        return this.deliveryOption;
    }

}
