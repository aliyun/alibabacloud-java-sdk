// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateDeliveryChannelResponseBody extends TeaModel {
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDeliveryChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryChannelResponseBody self = new CreateDeliveryChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryChannelResponseBody setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    public CreateDeliveryChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
