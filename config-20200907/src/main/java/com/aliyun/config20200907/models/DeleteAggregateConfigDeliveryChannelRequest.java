// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregateConfigDeliveryChannelRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the delivery channel.</p>
     * <br>
     * <p>For information about how to obtain the ID of a delivery channel, see [ListAggregateConfigDeliveryChannels](~~429842~~).</p>
     */
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    public static DeleteAggregateConfigDeliveryChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggregateConfigDeliveryChannelRequest self = new DeleteAggregateConfigDeliveryChannelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAggregateConfigDeliveryChannelRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public DeleteAggregateConfigDeliveryChannelRequest setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

}
