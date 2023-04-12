// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregateConfigDeliveryChannelResponseBody extends TeaModel {
    /**
     * <p>The ID of the delivery channel.</p>
     */
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAggregateConfigDeliveryChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregateConfigDeliveryChannelResponseBody self = new UpdateAggregateConfigDeliveryChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAggregateConfigDeliveryChannelResponseBody setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    public UpdateAggregateConfigDeliveryChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
