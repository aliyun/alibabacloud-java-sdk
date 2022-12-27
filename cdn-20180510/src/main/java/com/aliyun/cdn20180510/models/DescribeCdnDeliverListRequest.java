// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDeliverListRequest extends TeaModel {
    // The ID of the tracking task that you want to query. If you do not specify an ID, all tracking tasks are queried.
    @NameInMap("DeliverId")
    public Long deliverId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeCdnDeliverListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDeliverListRequest self = new DescribeCdnDeliverListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDeliverListRequest setDeliverId(Long deliverId) {
        this.deliverId = deliverId;
        return this;
    }
    public Long getDeliverId() {
        return this.deliverId;
    }

    public DescribeCdnDeliverListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
