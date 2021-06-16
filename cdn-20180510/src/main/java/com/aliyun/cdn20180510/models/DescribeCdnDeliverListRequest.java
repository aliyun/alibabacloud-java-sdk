// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDeliverListRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DeliverId")
    public Long deliverId;

    @NameInMap("Status")
    public String status;

    public static DescribeCdnDeliverListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDeliverListRequest self = new DescribeCdnDeliverListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDeliverListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCdnDeliverListRequest setDeliverId(Long deliverId) {
        this.deliverId = deliverId;
        return this;
    }
    public Long getDeliverId() {
        return this.deliverId;
    }

    public DescribeCdnDeliverListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
