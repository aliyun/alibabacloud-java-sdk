// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigDeliveryChannelRequest extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    public static GetAggregateConfigDeliveryChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateConfigDeliveryChannelRequest self = new GetAggregateConfigDeliveryChannelRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateConfigDeliveryChannelRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public GetAggregateConfigDeliveryChannelRequest setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

}
