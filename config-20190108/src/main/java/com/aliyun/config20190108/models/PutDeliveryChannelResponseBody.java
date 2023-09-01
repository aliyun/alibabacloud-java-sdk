// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class PutDeliveryChannelResponseBody extends TeaModel {
    /**
     * <p>The ID of the delivery method that you created or the updated ID of the delivery method that you modified.</p>
     */
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PutDeliveryChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutDeliveryChannelResponseBody self = new PutDeliveryChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public PutDeliveryChannelResponseBody setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    public PutDeliveryChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
