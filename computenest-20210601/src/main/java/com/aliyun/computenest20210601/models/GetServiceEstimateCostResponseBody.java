// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetServiceEstimateCostResponseBody extends TeaModel {
    /**
     * <p>The estimated price.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;cmgj00059839\&quot;: {\&quot;Result\&quot;: {\&quot;InquiryType\&quot;: \&quot;Buy\&quot;, \&quot;Order\&quot;: {\&quot;Currency\&quot;: \&quot;CNY\&quot;, \&quot;DiscountAmount\&quot;: \&quot;0.0\&quot;, \&quot;TradeAmount\&quot;: \&quot;0.01\&quot;, \&quot;OriginalAmount\&quot;: \&quot;0.01\&quot;}}}}</p>
     */
    @NameInMap("Commodity")
    public java.util.Map<String, CommodityValue> commodity;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>08ABBB67-39C9-5EE7-98E5-80486F75CE8D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resources.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;EcsInstance&quot; : { &quot;Type&quot; : &quot;ALIYUN::ECS::Instance&quot;, &quot;Success&quot; : true, &quot;Result&quot; : { &quot;Order&quot; : { &quot;Currency&quot; : &quot;CNY&quot;, &quot;RuleIds&quot; : [ &quot;102111101338\<em>\</em>\<em>\</em>&quot; ], &quot;DetailInfos&quot; : { &quot;ResourcePriceModel&quot; : [ { &quot;OriginalPrice&quot; : 0, &quot;DiscountPrice&quot; : 0, &quot;SubRules&quot; : { &quot;Rule&quot; : [ ] }, &quot;Resource&quot; : &quot;bandwidth&quot;, &quot;TradePrice&quot; : 0 }, { &quot;OriginalPrice&quot; : 0, &quot;DiscountPrice&quot; : 0, &quot;SubRules&quot; : { &quot;Rule&quot; : [ ] }, &quot;Resource&quot; : &quot;image&quot;, &quot;TradePrice&quot; : 0 }, { &quot;OriginalPrice&quot; : 0.366666, &quot;DiscountPrice&quot; : 0.249012, &quot;SubRules&quot; : { &quot;Rule&quot; : [ ] }, &quot;Resource&quot; : &quot;instanceType&quot;, &quot;TradePrice&quot; : 0.117654 }, { &quot;OriginalPrice&quot; : 0.055555, &quot;DiscountPrice&quot; : 0.037729, &quot;SubRules&quot; : { &quot;Rule&quot; : [ ] }, &quot;Resource&quot; : &quot;systemDisk&quot;, &quot;TradePrice&quot; : 0.017826 } ] }, &quot;TradeAmount&quot; : 0.135, &quot;OriginalAmount&quot; : 0.422, &quot;Coupons&quot; : { &quot;Coupon&quot; : [ ] }, &quot;DiscountAmount&quot; : 0.287 }, &quot;OrderSupplement&quot; : { &quot;PriceUnit&quot; : &quot;/Hour&quot;, &quot;ChargeType&quot; : &quot;PostPaid&quot;, &quot;Quantity&quot; : 1, &quot;PriceType&quot; : &quot;Total&quot; }, &quot;Rules&quot; : { &quot;Rule&quot; : [ { &quot;RuleDescId&quot; : &quot;102111101338\<em>\</em>\<em>\</em>&quot;, &quot;Name&quot; : &quot;contract discount_multi-billing item discount_3.208750 discount&quot; } ] } } } }</p>
     */
    @NameInMap("Resources")
    public java.util.Map<String, ?> resources;

    public static GetServiceEstimateCostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceEstimateCostResponseBody self = new GetServiceEstimateCostResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceEstimateCostResponseBody setCommodity(java.util.Map<String, CommodityValue> commodity) {
        this.commodity = commodity;
        return this;
    }
    public java.util.Map<String, CommodityValue> getCommodity() {
        return this.commodity;
    }

    public GetServiceEstimateCostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceEstimateCostResponseBody setResources(java.util.Map<String, ?> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.Map<String, ?> getResources() {
        return this.resources;
    }

}
