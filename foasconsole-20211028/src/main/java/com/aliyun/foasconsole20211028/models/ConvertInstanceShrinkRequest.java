// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ConvertInstanceShrinkRequest extends TeaModel {
    // 订购周期数量
    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("InstanceId")
    public String instanceId;

    // 是否自动续费
    @NameInMap("IsAutoRenew")
    public Boolean isAutoRenew;

    // 项目空间资源规格。
    @NameInMap("NamespaceResourceSpecs")
    public String namespaceResourceSpecsShrink;

    // 订购周期
    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("Region")
    public String region;

    public static ConvertInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertInstanceShrinkRequest self = new ConvertInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ConvertInstanceShrinkRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public ConvertInstanceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConvertInstanceShrinkRequest setIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }
    public Boolean getIsAutoRenew() {
        return this.isAutoRenew;
    }

    public ConvertInstanceShrinkRequest setNamespaceResourceSpecsShrink(String namespaceResourceSpecsShrink) {
        this.namespaceResourceSpecsShrink = namespaceResourceSpecsShrink;
        return this;
    }
    public String getNamespaceResourceSpecsShrink() {
        return this.namespaceResourceSpecsShrink;
    }

    public ConvertInstanceShrinkRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public ConvertInstanceShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
