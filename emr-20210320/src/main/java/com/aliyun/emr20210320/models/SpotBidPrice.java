// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class SpotBidPrice extends TeaModel {
    @NameInMap("BidPrice")
    public Double bidPrice;

    @NameInMap("InstanceType")
    public String instanceType;

    public static SpotBidPrice build(java.util.Map<String, ?> map) throws Exception {
        SpotBidPrice self = new SpotBidPrice();
        return TeaModel.build(map, self);
    }

    public SpotBidPrice setBidPrice(Double bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }
    public Double getBidPrice() {
        return this.bidPrice;
    }

    public SpotBidPrice setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
