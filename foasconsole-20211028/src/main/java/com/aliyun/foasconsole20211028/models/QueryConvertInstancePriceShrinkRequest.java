// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class QueryConvertInstancePriceShrinkRequest extends TeaModel {
    // 订购周期数量
    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("InstanceId")
    public String instanceId;

    // 是否自动续费
    @NameInMap("IsAutoRenew")
    public Boolean isAutoRenew;

    @NameInMap("NamespaceResourceSpecs")
    public String namespaceResourceSpecsShrink;

    // 订购周期
    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("Region")
    public String region;

    public static QueryConvertInstancePriceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConvertInstancePriceShrinkRequest self = new QueryConvertInstancePriceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryConvertInstancePriceShrinkRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public QueryConvertInstancePriceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryConvertInstancePriceShrinkRequest setIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }
    public Boolean getIsAutoRenew() {
        return this.isAutoRenew;
    }

    public QueryConvertInstancePriceShrinkRequest setNamespaceResourceSpecsShrink(String namespaceResourceSpecsShrink) {
        this.namespaceResourceSpecsShrink = namespaceResourceSpecsShrink;
        return this;
    }
    public String getNamespaceResourceSpecsShrink() {
        return this.namespaceResourceSpecsShrink;
    }

    public QueryConvertInstancePriceShrinkRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public QueryConvertInstancePriceShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
