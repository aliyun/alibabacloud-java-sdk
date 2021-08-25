// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class PutDeliveryChannelResponseBody extends TeaModel {
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

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
