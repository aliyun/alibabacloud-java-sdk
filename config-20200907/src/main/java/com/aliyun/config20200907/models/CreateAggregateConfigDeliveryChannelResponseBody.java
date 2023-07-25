// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateConfigDeliveryChannelResponseBody extends TeaModel {
    /**
     * <p>The ID of the delivery channel.</p>
     */
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAggregateConfigDeliveryChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregateConfigDeliveryChannelResponseBody self = new CreateAggregateConfigDeliveryChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAggregateConfigDeliveryChannelResponseBody setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    public CreateAggregateConfigDeliveryChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
