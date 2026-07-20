// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyOrderDetailV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public FlightModifyOrderDetailV2ResponseBodyModule module;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>210bc2dc16839612026565712dcbe6</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static FlightModifyOrderDetailV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightModifyOrderDetailV2ResponseBody self = new FlightModifyOrderDetailV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightModifyOrderDetailV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightModifyOrderDetailV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightModifyOrderDetailV2ResponseBody setModule(FlightModifyOrderDetailV2ResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightModifyOrderDetailV2ResponseBodyModule getModule() {
        return this.module;
    }

    public FlightModifyOrderDetailV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightModifyOrderDetailV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightModifyOrderDetailV2ResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightModifyOrderDetailV2ResponseBodyModuleAttributes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[{
         *     &quot;baggageSubItems&quot;: [{
         *         &quot;baggageSubContentVisualizes&quot;: [{
         *             &quot;baggageDesc&quot;: [&quot;每人可携带 1件 登机&quot;, &quot;至多 5公斤/件&quot;, &quot;尺寸不超过 20<em>40</em>55cm&quot;],
         *             &quot;baggageSubContentType&quot;: 0,
         *             &quot;description&quot;: {
         *                 &quot;desc&quot;: &quot;您可以随身携带上飞机客舱内的行李物品，由旅客自行负责保管。具体尺寸、重量、类型等以各航空公司规定为准。&quot;,
         *                 &quot;icon&quot;: &quot;<a href="https://gw.alicdn.com/imgextra/i4/O1CN01UynXG31pjsEtA3tMF_!!6000000005397-2-tps-36-36.png">https://gw.alicdn.com/imgextra/i4/O1CN01UynXG31pjsEtA3tMF_!!6000000005397-2-tps-36-36.png</a>&quot;,
         *                 &quot;image&quot;: &quot;<a href="https://gw.alicdn.com/imgextra/i1/O1CN01qe7wL21gJ0SmEXXL7_!!6000000004120-2-tps-1206-768.png">https://gw.alicdn.com/imgextra/i1/O1CN01qe7wL21gJ0SmEXXL7_!!6000000004120-2-tps-1206-768.png</a>&quot;,
         *                 &quot;title&quot;: &quot;手提行李说明&quot;
         *             },
         *             &quot;imageDO&quot;: {
         *                 &quot;image&quot;: &quot;<a href="https://gw.alicdn.com/imgextra/i3/O1CN01kLt3m923XsUs6WVif_!!6000000007266-2-tps-280-300.png">https://gw.alicdn.com/imgextra/i3/O1CN01kLt3m923XsUs6WVif_!!6000000007266-2-tps-280-300.png</a>&quot;,
         *                 &quot;largest&quot;: &quot;55&quot;,
         *                 &quot;middle&quot;: &quot;40&quot;,
         *                 &quot;smallest&quot;: &quot;20&quot;
         *             },
         *             &quot;isHighlight&quot;: false,
         *             &quot;subTitle&quot;: &quot;免费手提行李&quot;
         *         }, {
         *             &quot;baggageDesc&quot;: [&quot;尺寸不超过 40<em>60</em>100cm&quot;, &quot;至多 20公斤/人&quot;],
         *             &quot;baggageSubContentType&quot;: 1,
         *             &quot;description&quot;: {
         *                 &quot;desc&quot;: &quot;您需要在登机前将行李在值机柜台办理托运，领取托运凭证，该行李在飞机货舱中随飞机到达目的地，抵达后您凭托运凭证在行李领取处领取。&quot;,
         *                 &quot;icon&quot;: &quot;<a href="https://gw.alicdn.com/imgextra/i4/O1CN01UynXG31pjsEtA3tMF_!!6000000005397-2-tps-36-36.png">https://gw.alicdn.com/imgextra/i4/O1CN01UynXG31pjsEtA3tMF_!!6000000005397-2-tps-36-36.png</a>&quot;,
         *                 &quot;image&quot;: &quot;<a href="https://gw.alicdn.com/imgextra/i1/O1CN01rX7s431t7ddQuCWjK_!!6000000005855-2-tps-1206-768.png">https://gw.alicdn.com/imgextra/i1/O1CN01rX7s431t7ddQuCWjK_!!6000000005855-2-tps-1206-768.png</a>&quot;,
         *                 &quot;title&quot;: &quot;托运行李说明&quot;
         *             },
         *             &quot;imageDO&quot;: {
         *                 &quot;image&quot;: &quot;<a href="https://gw.alicdn.com/imgextra/i1/O1CN013fm4Hf1kc1NlbQ1dV_!!6000000004703-2-tps-280-400.png">https://gw.alicdn.com/imgextra/i1/O1CN013fm4Hf1kc1NlbQ1dV_!!6000000004703-2-tps-280-400.png</a>&quot;,
         *                 &quot;largest&quot;: &quot;100&quot;,
         *                 &quot;middle&quot;: &quot;60&quot;,
         *                 &quot;smallest&quot;: &quot;40&quot;
         *             },
         *             &quot;isHighlight&quot;: false,
         *             &quot;subTitle&quot;: &quot;免费托运行李&quot;
         *         }],
         *         &quot;isStruct&quot;: true,
         *         &quot;ptc&quot;: &quot;ADT&quot;,
         *         &quot;title&quot;: &quot;成人行李&quot;
         *     }, {
         *         &quot;baggageSubContentVisualizes&quot;: [{
         *             &quot;baggageDesc&quot;: [&quot;每人可携带 1件 登机&quot;, &quot;至多 5公斤/件&quot;, &quot;尺寸不超过 20<em>40</em>55cm&quot;],
         *             &quot;baggageSubContentType&quot;: 0,
         *             &quot;description&quot;: {
         *                 &quot;desc&quot;: &quot;您可以随身携带上飞机客舱内的行李物品，由旅客自行负责保管。具体尺寸、重量、类型等以各航空公司规定为准。&quot;,
         *                 &quot;icon&quot;: &quot;<a href="https://gw.alicdn.com/imgextra/i4/O1CN01UynXG31pjsEtA3tMF_!!6000000005397-2-tps-36-36.png">https://gw.alicdn.com/imgextra/i4/O1CN01UynXG31pjsEtA3tMF_!!6000000005397-2-tps-36-36.png</a>&quot;,
         *                 &quot;image&quot;: &quot;<a href="https://gw.alicdn.com/imgextra/i1/O1CN01qe7wL21gJ0SmEXXL7_!!6000000004120-2-tps-1206-768.png">https://gw.alicdn.com/imgextra/i1/O1CN01qe7wL21gJ0SmEXXL7_!!6000000004120-2-tps-1206-768.png</a>&quot;,
         *                 &quot;title&quot;: &quot;手提行李说明&quot;
         *             },
         *             &quot;imageDO&quot;: {
         *                 &quot;image&quot;: &quot;<a href="https://gw.alicdn.com/imgextra/i3/O1CN01kLt3m923XsUs6WVif_!!6000000007266-2-tps-280-300.png">https://gw.alicdn.com/imgextra/i3/O1CN01kLt3m923XsUs6WVif_!!6000000007266-2-tps-280-300.png</a>&quot;,
         *                 &quot;largest&quot;: &quot;55&quot;,
         *                 &quot;middle&quot;: &quot;40&quot;,
         *                 &quot;smallest&quot;: &quot;20&quot;
         *             },
         *             &quot;isHighlight&quot;: false,
         *             &quot;subTitle&quot;: &quot;儿童 免费手提行李&quot;
         *         }, {
         *             &quot;baggageDesc&quot;: [&quot;尺寸不超过 40<em>60</em>100cm&quot;, &quot;至多 20公斤/人&quot;],
         *             &quot;baggageSubContentType&quot;: 1,
         *             &quot;description&quot;: {
         *                 &quot;desc&quot;: &quot;您需要在登机前将行李在值机柜台办理托运，领取托运凭证，该行李在飞机货舱中随飞机到达目的地，抵达后您凭托运凭证在行李领取处领取。&quot;,
         *                 &quot;icon&quot;: &quot;<a href="https://gw.alicdn.com/imgextra/i4/O1CN01UynXG31pjsEtA3tMF_!!6000000005397-2-tps-36-36.png">https://gw.alicdn.com/imgextra/i4/O1CN01UynXG31pjsEtA3tMF_!!6000000005397-2-tps-36-36.png</a>&quot;,
         *                 &quot;image&quot;: &quot;<a href="https://gw.alicdn.com/imgextra/i1/O1CN01rX7s431t7ddQuCWjK_!!6000000005855-2-tps-1206-768.png">https://gw.alicdn.com/imgextra/i1/O1CN01rX7s431t7ddQuCWjK_!!6000000005855-2-tps-1206-768.png</a>&quot;,
         *                 &quot;title&quot;: &quot;托运行李说明&quot;
         *             },
         *             &quot;imageDO&quot;: {
         *                 &quot;image&quot;: &quot;<a href="https://gw.alicdn.com/imgextra/i1/O1CN013fm4Hf1kc1NlbQ1dV_!!6000000004703-2-tps-280-400.png">https://gw.alicdn.com/imgextra/i1/O1CN013fm4Hf1kc1NlbQ1dV_!!6000000004703-2-tps-280-400.png</a>&quot;,
         *                 &quot;largest&quot;: &quot;100&quot;,
         *                 &quot;middle&quot;: &quot;60&quot;,
         *                 &quot;smallest&quot;: &quot;40&quot;
         *             },
         *             &quot;isHighlight&quot;: false,
         *             &quot;subTitle&quot;: &quot;儿童 免费托运行李&quot;
         *         }],
         *         &quot;isStruct&quot;: true,
         *         &quot;ptc&quot;: &quot;CHD&quot;,
         *         &quot;title&quot;: &quot;儿童/婴儿行李&quot;
         *     }, {
         *         &quot;baggageSubContentVisualizes&quot;: [{
         *             &quot;baggageDesc&quot;: [&quot;按照航司规定，暂无免费手提行李额&quot;],
         *             &quot;baggageSubContentType&quot;: 0,
         *             &quot;description&quot;: {
         *                 &quot;desc&quot;: &quot;您可以随身携带上飞机客舱内的行李物品，由旅客自行负责保管。具体尺寸、重量、类型等以各航空公司规定为准。&quot;,
         *                 &quot;icon&quot;: &quot;<a href="https://gw.alicdn.com/imgextra/i4/O1CN01UynXG31pjsEtA3tMF_!!6000000005397-2-tps-36-36.png">https://gw.alicdn.com/imgextra/i4/O1CN01UynXG31pjsEtA3tMF_!!6000000005397-2-tps-36-36.png</a>&quot;,
         *                 &quot;image&quot;: &quot;<a href="https://gw.alicdn.com/imgextra/i1/O1CN01qe7wL21gJ0SmEXXL7_!!6000000004120-2-tps-1206-768.png">https://gw.alicdn.com/imgextra/i1/O1CN01qe7wL21gJ0SmEXXL7_!!6000000004120-2-tps-1206-768.png</a>&quot;,
         *                 &quot;title&quot;: &quot;手提行李说明&quot;
         *             },
         *             &quot;imageDO&quot;: {
         *                 &quot;image&quot;: &quot;<a href="https://gw.alicdn.com/imgextra/i3/O1CN01BoSFry1SnmSBe52VJ_!!6000000002292-2-tps-280-300.png">https://gw.alicdn.com/imgextra/i3/O1CN01BoSFry1SnmSBe52VJ_!!6000000002292-2-tps-280-300.png</a>&quot;
         *             },
         *             &quot;isHighlight&quot;: true,
         *             &quot;subTitle&quot;: &quot;婴儿 无免费手提行李&quot;
         *         }, {
         *             &quot;baggageDesc&quot;: [&quot;尺寸不超过 40<em>60</em>100cm&quot;, &quot;至多 10公斤/人&quot;],
         *             &quot;baggageSubContentType&quot;: 1,
         *             &quot;description&quot;: {
         *                 &quot;desc&quot;: &quot;您需要在登机前将行李在值机柜台办理托运，领取托运凭证，该行李在飞机货舱中随飞机到达目的地，抵达后您凭托运凭证在行李领取处领取。&quot;,
         *                 &quot;icon&quot;: &quot;<a href="https://gw.alicdn.com/imgextra/i4/O1CN01UynXG31pjsEtA3tMF_!!6000000005397-2-tps-36-36.png">https://gw.alicdn.com/imgextra/i4/O1CN01UynXG31pjsEtA3tMF_!!6000000005397-2-tps-36-36.png</a>&quot;,
         *                 &quot;image&quot;: &quot;<a href="https://gw.alicdn.com/imgextra/i1/O1CN01rX7s431t7ddQuCWjK_!!6000000005855-2-tps-1206-768.png">https://gw.alicdn.com/imgextra/i1/O1CN01rX7s431t7ddQuCWjK_!!6000000005855-2-tps-1206-768.png</a>&quot;,
         *                 &quot;title&quot;: &quot;托运行李说明&quot;
         *             },
         *             &quot;imageDO&quot;: {
         *                 &quot;image&quot;: &quot;<a href="https://gw.alicdn.com/imgextra/i1/O1CN013fm4Hf1kc1NlbQ1dV_!!6000000004703-2-tps-280-400.png">https://gw.alicdn.com/imgextra/i1/O1CN013fm4Hf1kc1NlbQ1dV_!!6000000004703-2-tps-280-400.png</a>&quot;,
         *                 &quot;largest&quot;: &quot;100&quot;,
         *                 &quot;middle&quot;: &quot;60&quot;,
         *                 &quot;smallest&quot;: &quot;40&quot;
         *             },
         *             &quot;isHighlight&quot;: false,
         *             &quot;subTitle&quot;: &quot;婴儿 免费托运行李&quot;
         *         }],
         *         &quot;isStruct&quot;: true,
         *         &quot;ptc&quot;: &quot;INF&quot;,
         *         &quot;title&quot;: &quot;儿童/婴儿行李&quot;
         *     }],
         *     &quot;index&quot;: 0,
         *     &quot;tips&quot;: {
         *         &quot;logo&quot;: &quot;<a href="https://gw.alicdn.com/imgextra/i1/O1CN019zl3WZ22fNLxzx2cR_!!6000000007147-2-tps-125-45.png">https://gw.alicdn.com/imgextra/i1/O1CN019zl3WZ22fNLxzx2cR_!!6000000007147-2-tps-125-45.png</a>&quot;,
         *         &quot;tipsDesc&quot;: &quot;各个尺寸的行李箱有多大？&quot;,
         *         &quot;tipsImage&quot;: &quot;<a href="https://gw.alicdn.com/imgextra/i1/O1CN01X8dK671m3nC7MFAq7_!!6000000004899-2-tps-1050-675.png">https://gw.alicdn.com/imgextra/i1/O1CN01X8dK671m3nC7MFAq7_!!6000000004899-2-tps-1050-675.png</a>&quot;
         *     },
         *     &quot;title&quot;: &quot;行李规定&quot;,
         *     &quot;type&quot;: 2
         * }]</p>
         */
        @NameInMap("baggage_rule")
        public String baggageRule;

        /**
         * <strong>example:</strong>
         * <p>[{
         *     &quot;index&quot;: 0,
         *     &quot;refundSubItems&quot;: [{
         *         &quot;isStruct&quot;: true,
         *         &quot;ptc&quot;: &quot;ADT&quot;,
         *         &quot;refundSubContents&quot;: [{
         *             &quot;feeDesc&quot;: &quot;￥54/人&quot;,
         *             &quot;feeRange&quot;: &quot;7月30日 21:20 前&quot;,
         *             &quot;style&quot;: 1
         *         }, {
         *             &quot;feeDesc&quot;: &quot;￥108/人&quot;,
         *             &quot;feeRange&quot;: &quot;8月4日 21:20 前&quot;,
         *             &quot;style&quot;: 1
         *         }, {
         *             &quot;feeDesc&quot;: &quot;￥270/人&quot;,
         *             &quot;feeRange&quot;: &quot;8月6日 17:20 前&quot;,
         *             &quot;style&quot;: 1
         *         }, {
         *             &quot;feeDesc&quot;: &quot;￥378/人&quot;,
         *             &quot;feeRange&quot;: &quot;8月6日 17:20 后&quot;,
         *             &quot;style&quot;: 1
         *         }],
         *         &quot;title&quot;: &quot;成人&quot;
         *     }, {
         *         &quot;isStruct&quot;: true,
         *         &quot;ptc&quot;: &quot;CHD&quot;,
         *         &quot;refundSubContents&quot;: [{
         *             &quot;feeDesc&quot;: &quot;￥54/人&quot;,
         *             &quot;feeRange&quot;: &quot;7月30日 21:20 前&quot;,
         *             &quot;style&quot;: 1
         *         }, {
         *             &quot;feeDesc&quot;: &quot;￥108/人&quot;,
         *             &quot;feeRange&quot;: &quot;8月4日 21:20 前&quot;,
         *             &quot;style&quot;: 1
         *         }, {
         *             &quot;feeDesc&quot;: &quot;￥270/人&quot;,
         *             &quot;feeRange&quot;: &quot;8月6日 17:20 前&quot;,
         *             &quot;style&quot;: 1
         *         }, {
         *             &quot;feeDesc&quot;: &quot;￥378/人&quot;,
         *             &quot;feeRange&quot;: &quot;8月6日 17:20 后&quot;,
         *             &quot;style&quot;: 1
         *         }],
         *         &quot;title&quot;: &quot;儿童&quot;
         *     }, {
         *         &quot;content&quot;: &quot;&quot;,
         *         &quot;isStruct&quot;: false,
         *         &quot;ptc&quot;: &quot;INF&quot;,
         *         &quot;title&quot;: &quot;婴儿&quot;
         *     }],
         *     &quot;title&quot;: &quot;同舱改期规则&quot;,
         *     &quot;type&quot;: 1
         * }, {
         *     &quot;index&quot;: 0,
         *     &quot;refundSubItems&quot;: [{
         *         &quot;content&quot;: &quot;不可签转&quot;,
         *         &quot;isStruct&quot;: false
         *     }],
         *     &quot;title&quot;: &quot;签转条件&quot;,
         *     &quot;type&quot;: 2
         * }]</p>
         */
        @NameInMap("change_rule")
        public String changeRule;

        /**
         * <strong>example:</strong>
         * <p>1725333295287</p>
         */
        @NameInMap("latest_pay_time")
        public Object latestPayTime;

        /**
         * <strong>example:</strong>
         * <p>2024-09-03 11:14:55</p>
         */
        @NameInMap("latest_pay_time_str")
        public String latestPayTimeStr;

        /**
         * <strong>example:</strong>
         * <p>[{
         *     &quot;extraContents&quot;: [{
         *         &quot;content&quot;: &quot;变更航班或舱位如有差价须补足。客票有效期一年；退票不晚于有效期，截止后一个月之内办理；特殊折扣机票退改签按其相应规定执行。&quot;,
         *         &quot;title&quot;: &quot;特殊说明&quot;
         *     }],
         *     &quot;index&quot;: 0,
         *     &quot;refundSubItems&quot;: [{
         *         &quot;isStruct&quot;: true,
         *         &quot;ptc&quot;: &quot;ADT&quot;,
         *         &quot;refundSubContents&quot;: [{
         *             &quot;feeDesc&quot;: &quot;￥108/人&quot;,
         *             &quot;feeRange&quot;: &quot;7月30日 21:20 前&quot;,
         *             &quot;style&quot;: 1
         *         }, {
         *             &quot;feeDesc&quot;: &quot;￥162/人&quot;,
         *             &quot;feeRange&quot;: &quot;8月4日 21:20 前&quot;,
         *             &quot;style&quot;: 1
         *         }, {
         *             &quot;feeDesc&quot;: &quot;￥378/人&quot;,
         *             &quot;feeRange&quot;: &quot;8月6日 17:20 前&quot;,
         *             &quot;style&quot;: 1
         *         }, {
         *             &quot;feeDesc&quot;: &quot;￥486/人&quot;,
         *             &quot;feeRange&quot;: &quot;8月6日 17:20 后&quot;,
         *             &quot;style&quot;: 1
         *         }],
         *         &quot;title&quot;: &quot;成人&quot;
         *     }, {
         *         &quot;isStruct&quot;: true,
         *         &quot;ptc&quot;: &quot;CHD&quot;,
         *         &quot;refundSubContents&quot;: [{
         *             &quot;feeDesc&quot;: &quot;￥108/人&quot;,
         *             &quot;feeRange&quot;: &quot;7月30日 21:20 前&quot;,
         *             &quot;style&quot;: 1
         *         }, {
         *             &quot;feeDesc&quot;: &quot;￥162/人&quot;,
         *             &quot;feeRange&quot;: &quot;8月4日 21:20 前&quot;,
         *             &quot;style&quot;: 1
         *         }, {
         *             &quot;feeDesc&quot;: &quot;￥378/人&quot;,
         *             &quot;feeRange&quot;: &quot;8月6日 17:20 前&quot;,
         *             &quot;style&quot;: 1
         *         }, {
         *             &quot;feeDesc&quot;: &quot;￥486/人&quot;,
         *             &quot;feeRange&quot;: &quot;8月6日 17:20 后&quot;,
         *             &quot;style&quot;: 1
         *         }],
         *         &quot;title&quot;: &quot;儿童&quot;
         *     }, {
         *         &quot;content&quot;: &quot;免费退改&quot;,
         *         &quot;isStruct&quot;: false,
         *         &quot;ptc&quot;: &quot;INF&quot;,
         *         &quot;title&quot;: &quot;婴儿&quot;
         *     }],
         *     &quot;title&quot;: &quot;退票收费规则&quot;,
         *     &quot;type&quot;: 0
         * }]</p>
         */
        @NameInMap("refund_rule")
        public String refundRule;

        public static FlightModifyOrderDetailV2ResponseBodyModuleAttributes build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOrderDetailV2ResponseBodyModuleAttributes self = new FlightModifyOrderDetailV2ResponseBodyModuleAttributes();
            return TeaModel.build(map, self);
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleAttributes setBaggageRule(String baggageRule) {
            this.baggageRule = baggageRule;
            return this;
        }
        public String getBaggageRule() {
            return this.baggageRule;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleAttributes setChangeRule(String changeRule) {
            this.changeRule = changeRule;
            return this;
        }
        public String getChangeRule() {
            return this.changeRule;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleAttributes setLatestPayTime(Object latestPayTime) {
            this.latestPayTime = latestPayTime;
            return this;
        }
        public Object getLatestPayTime() {
            return this.latestPayTime;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleAttributes setLatestPayTimeStr(String latestPayTimeStr) {
            this.latestPayTimeStr = latestPayTimeStr;
            return this;
        }
        public String getLatestPayTimeStr() {
            return this.latestPayTimeStr;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleAttributes setRefundRule(String refundRule) {
            this.refundRule = refundRule;
            return this;
        }
        public String getRefundRule() {
            return this.refundRule;
        }

    }

    public static class FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:17816963077@163.com">17816963077@163.com</a></p>
         */
        @NameInMap("contact_email")
        public String contactEmail;

        /**
         * <strong>example:</strong>
         * <p>浪花</p>
         */
        @NameInMap("contact_name")
        public String contactName;

        /**
         * <strong>example:</strong>
         * <p>17816963077</p>
         */
        @NameInMap("contact_phone")
        public String contactPhone;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("send_msg_to_passenger")
        public Boolean sendMsgToPassenger;

        public static FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO self = new FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO();
            return TeaModel.build(map, self);
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }
        public String getContactPhone() {
            return this.contactPhone;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO setSendMsgToPassenger(Boolean sendMsgToPassenger) {
            this.sendMsgToPassenger = sendMsgToPassenger;
            return this;
        }
        public Boolean getSendMsgToPassenger() {
            return this.sendMsgToPassenger;
        }

    }

    public static class FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>计划起飞时间10-01 07:30延误至10-01 07:40</p>
         */
        @NameInMap("change_desc")
        public String changeDesc;

        /**
         * <strong>example:</strong>
         * <p>出发时间延误</p>
         */
        @NameInMap("change_status")
        public String changeStatus;

        /**
         * <strong>example:</strong>
         * <p>DEP_TIME_DELAY</p>
         */
        @NameInMap("change_status_code")
        public String changeStatusCode;

        /**
         * <strong>example:</strong>
         * <p>新航段信息</p>
         */
        @NameInMap("new_segment")
        public Object newSegment;

        @NameInMap("passenger_names")
        public java.util.List<String> passengerNames;

        public static FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange self = new FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange();
            return TeaModel.build(map, self);
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange setChangeDesc(String changeDesc) {
            this.changeDesc = changeDesc;
            return this;
        }
        public String getChangeDesc() {
            return this.changeDesc;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange setChangeStatus(String changeStatus) {
            this.changeStatus = changeStatus;
            return this;
        }
        public String getChangeStatus() {
            return this.changeStatus;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange setChangeStatusCode(String changeStatusCode) {
            this.changeStatusCode = changeStatusCode;
            return this;
        }
        public String getChangeStatusCode() {
            return this.changeStatusCode;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange setNewSegment(Object newSegment) {
            this.newSegment = newSegment;
            return this;
        }
        public Object getNewSegment() {
            return this.newSegment;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange setPassengerNames(java.util.List<String> passengerNames) {
            this.passengerNames = passengerNames;
            return this;
        }
        public java.util.List<String> getPassengerNames() {
            return this.passengerNames;
        }

    }

    public static class FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSSegmentPosition extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("journey_index")
        public Integer journeyIndex;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("segment_index")
        public Integer segmentIndex;

        public static FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSSegmentPosition build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSSegmentPosition self = new FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSSegmentPosition();
            return TeaModel.build(map, self);
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSSegmentPosition setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSSegmentPosition setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

    }

    public static class FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MU</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        /**
         * <strong>example:</strong>
         * <p>航司 icon</p>
         */
        @NameInMap("airline_icon_url")
        public String airlineIconUrl;

        /**
         * <strong>example:</strong>
         * <p>中国东方航空</p>
         */
        @NameInMap("airline_name")
        public String airlineName;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("arr_airport_code")
        public String arrAirportCode;

        /**
         * <strong>example:</strong>
         * <p>萧山国际机场</p>
         */
        @NameInMap("arr_airport_name")
        public String arrAirportName;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <strong>example:</strong>
         * <p>杭州</p>
         */
        @NameInMap("arr_city_name")
        public String arrCityName;

        /**
         * <strong>example:</strong>
         * <p>到达航站楼</p>
         */
        @NameInMap("arr_terminal")
        public String arrTerminal;

        /**
         * <strong>example:</strong>
         * <p>2023-10-03 09:30:00</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <strong>example:</strong>
         * <p>经济舱</p>
         */
        @NameInMap("cabin_class_name")
        public String cabinClassName;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("cabin_discount")
        public Long cabinDiscount;

        /**
         * <strong>example:</strong>
         * <p>承运方航司二字码</p>
         */
        @NameInMap("carrier_airline_code")
        public String carrierAirlineCode;

        /**
         * <strong>example:</strong>
         * <p>承运方航司 icon</p>
         */
        @NameInMap("carrier_airline_icon_url")
        public String carrierAirlineIconUrl;

        /**
         * <strong>example:</strong>
         * <p>承运方航司名称</p>
         */
        @NameInMap("carrier_airline_name")
        public String carrierAirlineName;

        /**
         * <strong>example:</strong>
         * <p>承运航班号</p>
         */
        @NameInMap("carrier_flight_no")
        public String carrierFlightNo;

        /**
         * <strong>example:</strong>
         * <p>PKX</p>
         */
        @NameInMap("dep_airport_code")
        public String depAirportCode;

        /**
         * <strong>example:</strong>
         * <p>大兴国际机场</p>
         */
        @NameInMap("dep_airport_name")
        public String depAirportName;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <strong>example:</strong>
         * <p>北京</p>
         */
        @NameInMap("dep_city_name")
        public String depCityName;

        /**
         * <strong>example:</strong>
         * <p>出发航站楼</p>
         */
        @NameInMap("dep_terminal")
        public String depTerminal;

        /**
         * <strong>example:</strong>
         * <p>2023-10-03 07:30:00</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("flight_change")
        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange flightChange;

        /**
         * <strong>example:</strong>
         * <p>MU5193</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        /**
         * <strong>example:</strong>
         * <p>机型，例&quot;738&quot;</p>
         */
        @NameInMap("flight_type")
        public String flightType;

        /**
         * <strong>example:</strong>
         * <p>餐食描述</p>
         */
        @NameInMap("meal_desc")
        public String mealDesc;

        /**
         * <strong>example:</strong>
         * <p>1194012</p>
         */
        @NameInMap("segmentI_id")
        public String segmentIId;

        @NameInMap("segment_position")
        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSSegmentPosition segmentPosition;

        /**
         * <strong>example:</strong>
         * <p>经停到达时间</p>
         */
        @NameInMap("stop_arr_time")
        public String stopArrTime;

        /**
         * <strong>example:</strong>
         * <p>经停城市</p>
         */
        @NameInMap("stop_city")
        public String stopCity;

        /**
         * <strong>example:</strong>
         * <p>经停到达时间</p>
         */
        @NameInMap("stop_dep_time")
        public String stopDepTime;

        public static FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS self = new FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS();
            return TeaModel.build(map, self);
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setAirlineIconUrl(String airlineIconUrl) {
            this.airlineIconUrl = airlineIconUrl;
            return this;
        }
        public String getAirlineIconUrl() {
            return this.airlineIconUrl;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setArrAirportCode(String arrAirportCode) {
            this.arrAirportCode = arrAirportCode;
            return this;
        }
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setArrAirportName(String arrAirportName) {
            this.arrAirportName = arrAirportName;
            return this;
        }
        public String getArrAirportName() {
            return this.arrAirportName;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setArrTerminal(String arrTerminal) {
            this.arrTerminal = arrTerminal;
            return this;
        }
        public String getArrTerminal() {
            return this.arrTerminal;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setCabinClassName(String cabinClassName) {
            this.cabinClassName = cabinClassName;
            return this;
        }
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setCabinDiscount(Long cabinDiscount) {
            this.cabinDiscount = cabinDiscount;
            return this;
        }
        public Long getCabinDiscount() {
            return this.cabinDiscount;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setCarrierAirlineCode(String carrierAirlineCode) {
            this.carrierAirlineCode = carrierAirlineCode;
            return this;
        }
        public String getCarrierAirlineCode() {
            return this.carrierAirlineCode;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setCarrierAirlineIconUrl(String carrierAirlineIconUrl) {
            this.carrierAirlineIconUrl = carrierAirlineIconUrl;
            return this;
        }
        public String getCarrierAirlineIconUrl() {
            return this.carrierAirlineIconUrl;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setCarrierAirlineName(String carrierAirlineName) {
            this.carrierAirlineName = carrierAirlineName;
            return this;
        }
        public String getCarrierAirlineName() {
            return this.carrierAirlineName;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setCarrierFlightNo(String carrierFlightNo) {
            this.carrierFlightNo = carrierFlightNo;
            return this;
        }
        public String getCarrierFlightNo() {
            return this.carrierFlightNo;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setDepAirportCode(String depAirportCode) {
            this.depAirportCode = depAirportCode;
            return this;
        }
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setDepAirportName(String depAirportName) {
            this.depAirportName = depAirportName;
            return this;
        }
        public String getDepAirportName() {
            return this.depAirportName;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setDepTerminal(String depTerminal) {
            this.depTerminal = depTerminal;
            return this;
        }
        public String getDepTerminal() {
            return this.depTerminal;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setFlightChange(FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange flightChange) {
            this.flightChange = flightChange;
            return this;
        }
        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange getFlightChange() {
            return this.flightChange;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setSegmentIId(String segmentIId) {
            this.segmentIId = segmentIId;
            return this;
        }
        public String getSegmentIId() {
            return this.segmentIId;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setSegmentPosition(FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSSegmentPosition segmentPosition) {
            this.segmentPosition = segmentPosition;
            return this;
        }
        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSSegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setStopCity(String stopCity) {
            this.stopCity = stopCity;
            return this;
        }
        public String getStopCity() {
            return this.stopCity;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

    }

    public static class FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOSChangeFee extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("change_fee")
        public Long changeFee;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("service_fee")
        public Long serviceFee;

        /**
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("upgrade_price")
        public Long upgradePrice;

        public static FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOSChangeFee build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOSChangeFee self = new FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOSChangeFee();
            return TeaModel.build(map, self);
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOSChangeFee setChangeFee(Long changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public Long getChangeFee() {
            return this.changeFee;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOSChangeFee setServiceFee(Long serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Long getServiceFee() {
            return this.serviceFee;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOSChangeFee setUpgradePrice(Long upgradePrice) {
            this.upgradePrice = upgradePrice;
            return this;
        }
        public Long getUpgradePrice() {
            return this.upgradePrice;
        }

    }

    public static class FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2000-08-19</p>
         */
        @NameInMap("birth_date")
        public String birthDate;

        /**
         * <strong>example:</strong>
         * <p>430131413423435353</p>
         */
        @NameInMap("cert_no")
        public String certNo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("cert_type")
        public Integer certType;

        @NameInMap("change_fee")
        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOSChangeFee changeFee;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("gender")
        public Integer gender;

        @NameInMap("origin_ticket_nos")
        public java.util.List<String> originTicketNos;

        /**
         * <strong>example:</strong>
         * <p>12172819047252004460056</p>
         */
        @NameInMap("passenger_id")
        public String passengerId;

        /**
         * <strong>example:</strong>
         * <p>逐浪</p>
         */
        @NameInMap("passenger_name")
        public String passengerName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("passenger_type")
        public Integer passengerType;

        /**
         * <strong>example:</strong>
         * <p>17635462345</p>
         */
        @NameInMap("phone")
        public String phone;

        /**
         * <strong>example:</strong>
         * <p>3243028</p>
         */
        @NameInMap("pid")
        public Long pid;

        /**
         * <strong>example:</strong>
         * <p>{&quot;000-123456789&quot;:&quot;[54321,54322]&quot;}</p>
         */
        @NameInMap("ticket_no_segment_map")
        public java.util.Map<String, ?> ticketNoSegmentMap;

        @NameInMap("ticket_nos")
        public java.util.List<String> ticketNos;

        public static FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS self = new FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS();
            return TeaModel.build(map, self);
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public String getBirthDate() {
            return this.birthDate;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setChangeFee(FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOSChangeFee changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOSChangeFee getChangeFee() {
            return this.changeFee;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setOriginTicketNos(java.util.List<String> originTicketNos) {
            this.originTicketNos = originTicketNos;
            return this;
        }
        public java.util.List<String> getOriginTicketNos() {
            return this.originTicketNos;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setPassengerType(Integer passengerType) {
            this.passengerType = passengerType;
            return this;
        }
        public Integer getPassengerType() {
            return this.passengerType;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setPid(Long pid) {
            this.pid = pid;
            return this;
        }
        public Long getPid() {
            return this.pid;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setTicketNoSegmentMap(java.util.Map<String, ?> ticketNoSegmentMap) {
            this.ticketNoSegmentMap = ticketNoSegmentMap;
            return this;
        }
        public java.util.Map<String, ?> getTicketNoSegmentMap() {
            return this.ticketNoSegmentMap;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setTicketNos(java.util.List<String> ticketNos) {
            this.ticketNos = ticketNos;
            return this;
        }
        public java.util.List<String> getTicketNos() {
            return this.ticketNos;
        }

    }

    public static class FlightModifyOrderDetailV2ResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-08-14 11:28:01</p>
         */
        @NameInMap("apply_time")
        public String applyTime;

        @NameInMap("attributes")
        public FlightModifyOrderDetailV2ResponseBodyModuleAttributes attributes;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:17635462345@163.com">17635462345@163.com</a></p>
         */
        @NameInMap("book_user_email")
        public String bookUserEmail;

        /**
         * <strong>example:</strong>
         * <p>正向订单预订人姓名</p>
         */
        @NameInMap("book_user_name")
        public String bookUserName;

        /**
         * <strong>example:</strong>
         * <p>17635462345</p>
         */
        @NameInMap("bookuser_phone")
        public String bookuserPhone;

        /**
         * <strong>example:</strong>
         * <p>原因说明</p>
         */
        @NameInMap("change_fail_reason")
        public String changeFailReason;

        @NameInMap("contact_info_d_t_o")
        public FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO contactInfoDTO;

        @NameInMap("dest_flight_info_d_t_o_s")
        public java.util.List<FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS> destFlightInfoDTOS;

        /**
         * <strong>example:</strong>
         * <p>2023-08-14 11:48:01</p>
         */
        @NameInMap("last_pay_time")
        public String lastPayTime;

        /**
         * <strong>example:</strong>
         * <p>1017124195788186048</p>
         */
        @NameInMap("order_id")
        public Long orderId;

        /**
         * <strong>example:</strong>
         * <p>1017124195788186048</p>
         */
        @NameInMap("out_order_id")
        public String outOrderId;

        /**
         * <strong>example:</strong>
         * <p>1019195836916029</p>
         */
        @NameInMap("out_sub_order_id")
        public String outSubOrderId;

        /**
         * <strong>example:</strong>
         * <p>2023-08-14 11:38:01</p>
         */
        @NameInMap("pay_time")
        public String payTime;

        /**
         * <strong>example:</strong>
         * <p>改签原因</p>
         */
        @NameInMap("reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>1019195836916029</p>
         */
        @NameInMap("sub_order_id")
        public Long subOrderId;

        /**
         * <strong>example:</strong>
         * <p>2023-08-19 15:24:08</p>
         */
        @NameInMap("ticket_time")
        public String ticketTime;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total_price")
        public Long totalPrice;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("total_service_fee_price")
        public Long totalServiceFeePrice;

        @NameInMap("traveler_info_d_t_o_s")
        public java.util.List<FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS> travelerInfoDTOS;

        public static FlightModifyOrderDetailV2ResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOrderDetailV2ResponseBodyModule self = new FlightModifyOrderDetailV2ResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setApplyTime(String applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public String getApplyTime() {
            return this.applyTime;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setAttributes(FlightModifyOrderDetailV2ResponseBodyModuleAttributes attributes) {
            this.attributes = attributes;
            return this;
        }
        public FlightModifyOrderDetailV2ResponseBodyModuleAttributes getAttributes() {
            return this.attributes;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setBookUserEmail(String bookUserEmail) {
            this.bookUserEmail = bookUserEmail;
            return this;
        }
        public String getBookUserEmail() {
            return this.bookUserEmail;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setBookUserName(String bookUserName) {
            this.bookUserName = bookUserName;
            return this;
        }
        public String getBookUserName() {
            return this.bookUserName;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setBookuserPhone(String bookuserPhone) {
            this.bookuserPhone = bookuserPhone;
            return this;
        }
        public String getBookuserPhone() {
            return this.bookuserPhone;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setChangeFailReason(String changeFailReason) {
            this.changeFailReason = changeFailReason;
            return this;
        }
        public String getChangeFailReason() {
            return this.changeFailReason;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setContactInfoDTO(FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO contactInfoDTO) {
            this.contactInfoDTO = contactInfoDTO;
            return this;
        }
        public FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO getContactInfoDTO() {
            return this.contactInfoDTO;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setDestFlightInfoDTOS(java.util.List<FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS> destFlightInfoDTOS) {
            this.destFlightInfoDTOS = destFlightInfoDTOS;
            return this;
        }
        public java.util.List<FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS> getDestFlightInfoDTOS() {
            return this.destFlightInfoDTOS;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setLastPayTime(String lastPayTime) {
            this.lastPayTime = lastPayTime;
            return this;
        }
        public String getLastPayTime() {
            return this.lastPayTime;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setOutSubOrderId(String outSubOrderId) {
            this.outSubOrderId = outSubOrderId;
            return this;
        }
        public String getOutSubOrderId() {
            return this.outSubOrderId;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setSubOrderId(Long subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public Long getSubOrderId() {
            return this.subOrderId;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setTicketTime(String ticketTime) {
            this.ticketTime = ticketTime;
            return this;
        }
        public String getTicketTime() {
            return this.ticketTime;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setTotalPrice(Long totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Long getTotalPrice() {
            return this.totalPrice;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setTotalServiceFeePrice(Long totalServiceFeePrice) {
            this.totalServiceFeePrice = totalServiceFeePrice;
            return this;
        }
        public Long getTotalServiceFeePrice() {
            return this.totalServiceFeePrice;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setTravelerInfoDTOS(java.util.List<FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS> travelerInfoDTOS) {
            this.travelerInfoDTOS = travelerInfoDTOS;
            return this;
        }
        public java.util.List<FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS> getTravelerInfoDTOS() {
            return this.travelerInfoDTOS;
        }

    }

}
