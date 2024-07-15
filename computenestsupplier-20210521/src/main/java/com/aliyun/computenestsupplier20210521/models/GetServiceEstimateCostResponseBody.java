// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceEstimateCostResponseBody extends TeaModel {
    /**
     * <p>The subscription duration information about the purchase order of Alibaba Cloud Marketplace.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;PayPeriodUnit\&quot;:Month,\&quot;PayPeriod\&quot;:1}</p>
     */
    @NameInMap("Commodity")
    public java.util.Map<String, ?> commodity;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E73F09DC-6C13-5CB1-A10F-7A4E125ABD2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of resources.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;ECSInstances&quot;:{
     *         &quot;Type&quot;:&quot;ALIYUN::ECS::InstanceGroup&quot;,
     *         &quot;Success&quot;:true,
     *         &quot;Result&quot;:{
     *           &quot;Order&quot;:{
     *             &quot;Currency&quot;:&quot;CNY&quot;,
     *             &quot;RuleIds&quot;:[
     *               1752723
     *             ],
     *             &quot;DetailInfos&quot;:{
     *               &quot;ResourcePriceModel&quot;:[
     *                 {
     *                   &quot;Resource&quot;:&quot;bandwidth&quot;,
     *                   &quot;TradeAmount&quot;:0.0,
     *                   &quot;SubRuleIds&quot;:[],
     *                   &quot;OriginalAmount&quot;:0.0,
     *                   &quot;DiscountAmount&quot;:0.0
     *                 },
     *                 {
     *                   &quot;Resource&quot;:&quot;image&quot;,
     *                   &quot;TradeAmount&quot;:0.0,
     *                   &quot;SubRuleIds&quot;:[],
     *                   &quot;OriginalAmount&quot;:0.0,
     *                   &quot;DiscountAmount&quot;:0.0
     *                 },
     *                 {
     *                   &quot;Resource&quot;:&quot;instanceType&quot;,
     *                   &quot;TradeAmount&quot;:0.006966,
     *                   &quot;SubRuleIds&quot;:[],
     *                   &quot;OriginalAmount&quot;:0.45,
     *                   &quot;DiscountAmount&quot;:0.443034
     *                 },
     *                 {
     *                   &quot;Resource&quot;:&quot;systemDisk&quot;,
     *                   &quot;TradeAmount&quot;:0.000867,
     *                   &quot;SubRuleIds&quot;:[],
     *                   &quot;OriginalAmount&quot;:0.056,
     *                   &quot;DiscountAmount&quot;:0.055133
     *                 },
     *                 {
     *                   &quot;Resource&quot;:&quot;dataDisk&quot;,
     *                   &quot;TradeAmount&quot;:0.002167,
     *                   &quot;SubRuleIds&quot;:[],
     *                   &quot;OriginalAmount&quot;:0.14,
     *                   &quot;DiscountAmount&quot;:0.137833
     *                 }
     *               ]
     *             }</p>
     */
    @NameInMap("Resources")
    public java.util.Map<String, ?> resources;

    public static GetServiceEstimateCostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceEstimateCostResponseBody self = new GetServiceEstimateCostResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceEstimateCostResponseBody setCommodity(java.util.Map<String, ?> commodity) {
        this.commodity = commodity;
        return this;
    }
    public java.util.Map<String, ?> getCommodity() {
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
