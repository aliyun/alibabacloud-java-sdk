// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeDeliveryChannelsRequest extends TeaModel {
    /**
     * <p>The ID of the delivery channel. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>For more information about how to obtain the ID of a delivery channel, see [PutDeliveryChannel](~~174253~~).</p>
     */
    @NameInMap("DeliveryChannelIds")
    public String deliveryChannelIds;

    public static DescribeDeliveryChannelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeliveryChannelsRequest self = new DescribeDeliveryChannelsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeliveryChannelsRequest setDeliveryChannelIds(String deliveryChannelIds) {
        this.deliveryChannelIds = deliveryChannelIds;
        return this;
    }
    public String getDeliveryChannelIds() {
        return this.deliveryChannelIds;
    }

}
