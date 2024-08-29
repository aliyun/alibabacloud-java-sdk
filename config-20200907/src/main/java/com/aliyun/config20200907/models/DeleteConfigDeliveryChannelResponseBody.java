// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteConfigDeliveryChannelResponseBody extends TeaModel {
    /**
     * <p>The ID of the delivery channel.</p>
     * 
     * <strong>example:</strong>
     * <p>cdc-38c32e87cadb002c****</p>
     */
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>35F1DA37-ECB5-54E9-AC22-0D9111A665AA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteConfigDeliveryChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigDeliveryChannelResponseBody self = new DeleteConfigDeliveryChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConfigDeliveryChannelResponseBody setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    public DeleteConfigDeliveryChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
