// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDeliverListRequest extends TeaModel {
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
