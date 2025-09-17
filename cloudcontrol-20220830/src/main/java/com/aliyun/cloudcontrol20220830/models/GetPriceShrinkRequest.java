// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class GetPriceShrinkRequest extends TeaModel {
    /**
     * <p>The region ID. This parameter is required if the cloud product is deployed in a region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The attributes based on which the price is queried (in JSON format).</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *         &quot;LoadBalancerName&quot;: &quot;cc-test&quot;,
     *         &quot;LoadBalancerSpec&quot;: &quot;slb.s3.small&quot;,
     *         &quot;InternetChargeType&quot;: &quot;paybybandwidth&quot;,
     *         &quot;AddressType&quot;: &quot;internet&quot;,
     *         &quot;PaymentType&quot;: &quot;PayAsYouGo&quot;,
     *         &quot;Bandwidth&quot;: 6
     *       }</p>
     */
    @NameInMap("resourceAttributes")
    public String resourceAttributesShrink;

    public static GetPriceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPriceShrinkRequest self = new GetPriceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetPriceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetPriceShrinkRequest setResourceAttributesShrink(String resourceAttributesShrink) {
        this.resourceAttributesShrink = resourceAttributesShrink;
        return this;
    }
    public String getResourceAttributesShrink() {
        return this.resourceAttributesShrink;
    }

}
