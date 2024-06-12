// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigDeliveryChannelsRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of the account group, see [ListAggregators](https://help.aliyun.com/document_detail/255797.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The IDs of the delivery channels. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("DeliveryChannelIds")
    public String deliveryChannelIds;

    public static ListAggregateConfigDeliveryChannelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateConfigDeliveryChannelsRequest self = new ListAggregateConfigDeliveryChannelsRequest();
        return TeaModel.build(map, self);
    }

    public ListAggregateConfigDeliveryChannelsRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public ListAggregateConfigDeliveryChannelsRequest setDeliveryChannelIds(String deliveryChannelIds) {
        this.deliveryChannelIds = deliveryChannelIds;
        return this;
    }
    public String getDeliveryChannelIds() {
        return this.deliveryChannelIds;
    }

}
