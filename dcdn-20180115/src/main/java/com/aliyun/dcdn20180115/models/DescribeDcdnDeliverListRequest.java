// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDeliverListRequest extends TeaModel {
    /**
     * <p>The ID of the tracking task that you want to query. If you do not specify an ID, all tracking tasks are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>92</p>
     */
    @NameInMap("DeliverId")
    public Long deliverId;

    public static DescribeDcdnDeliverListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDeliverListRequest self = new DescribeDcdnDeliverListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDeliverListRequest setDeliverId(Long deliverId) {
        this.deliverId = deliverId;
        return this;
    }
    public Long getDeliverId() {
        return this.deliverId;
    }

}
