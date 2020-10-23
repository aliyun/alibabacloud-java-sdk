// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class PutDeliveryChannelResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DeliveryChannelId")
    @Validation(required = true)
    public String deliveryChannelId;

    public static PutDeliveryChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        PutDeliveryChannelResponse self = new PutDeliveryChannelResponse();
        return TeaModel.build(map, self);
    }

    public PutDeliveryChannelResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutDeliveryChannelResponse setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

}
