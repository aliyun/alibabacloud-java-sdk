// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ConvertInstanceRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    public static ConvertInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertInstanceRequest self = new ConvertInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ConvertInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ConvertInstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public ConvertInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public ConvertInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

}
