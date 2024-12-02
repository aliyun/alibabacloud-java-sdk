// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ConvertInstanceShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f-cn-wwo36qj4g06</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAutoRenew")
    public Boolean isAutoRenew;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NamespaceResourceSpecs")
    public String namespaceResourceSpecsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
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
