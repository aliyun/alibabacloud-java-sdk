// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregateConfigDeliveryChannelResponseBody extends TeaModel {
    /**
     * <p>The ID of the delivery channel.</p>
     * 
     * <strong>example:</strong>
     * <p>cdc-38c3013b46c9002c****</p>
     */
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FCC2F05C-F672-5665-8102-0020DF66B9B9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAggregateConfigDeliveryChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggregateConfigDeliveryChannelResponseBody self = new DeleteAggregateConfigDeliveryChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAggregateConfigDeliveryChannelResponseBody setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    public DeleteAggregateConfigDeliveryChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
