// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigDeliveryChannelRequest extends TeaModel {
    /**
     * <p>The ID of the delivery channel.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a delivery channel, see [DescribeDeliveryChannels](~~429841~~).</p>
     */
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    public static GetConfigDeliveryChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigDeliveryChannelRequest self = new GetConfigDeliveryChannelRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigDeliveryChannelRequest setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

}
