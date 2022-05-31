// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateConfigDeliveryChannelResponseBody extends TeaModel {
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateConfigDeliveryChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigDeliveryChannelResponseBody self = new UpdateConfigDeliveryChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConfigDeliveryChannelResponseBody setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    public UpdateConfigDeliveryChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
