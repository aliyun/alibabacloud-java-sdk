// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteConfigDeliveryChannelRequest extends TeaModel {
    /**
     * <p>The ID of the delivery channel.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a delivery channel, see [DescribeDeliveryChannels](https://help.aliyun.com/document_detail/429841.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    public static DeleteConfigDeliveryChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigDeliveryChannelRequest self = new DeleteConfigDeliveryChannelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConfigDeliveryChannelRequest setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

}
