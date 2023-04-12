// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateDeliveryChannelResponseBody extends TeaModel {
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

    public static UpdateDeliveryChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeliveryChannelResponseBody self = new UpdateDeliveryChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDeliveryChannelResponseBody setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    public UpdateDeliveryChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
