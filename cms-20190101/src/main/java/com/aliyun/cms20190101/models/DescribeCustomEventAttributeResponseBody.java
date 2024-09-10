// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventAttributeResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the call was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the custom event.</p>
     */
    @NameInMap("CustomEvents")
    public DescribeCustomEventAttributeResponseBodyCustomEvents customEvents;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>userId:173651113438**** and name:&quot;BABEL_CHECK&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>60912C8D-B340-4253-ADE7-61ACDFD25CFC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeCustomEventAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEventAttributeResponseBody self = new DescribeCustomEventAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomEventAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCustomEventAttributeResponseBody setCustomEvents(DescribeCustomEventAttributeResponseBodyCustomEvents customEvents) {
        this.customEvents = customEvents;
        return this;
    }
    public DescribeCustomEventAttributeResponseBodyCustomEvents getCustomEvents() {
        return this.customEvents;
    }

    public DescribeCustomEventAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCustomEventAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomEventAttributeResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent extends TeaModel {
        /**
         * <p>The content of the custom event.</p>
         * 
         * <strong>example:</strong>
         * <p>requestId:4975A6F3-19AC-4C01-BAD2-034DA07FEBB5, info:{&quot;autoPay&quot;:false,&quot;autoUseCoupon&quot;:false,&quot;bid&quot;:&quot;26842&quot;,&quot;buyerId&quot;:118935342242****,&quot;commodities&quot;:[{&quot;aliyunProduceCode&quot;:&quot;cms&quot;,&quot;chargeType&quot;:&quot;PREPAY&quot;,&quot;commodityCode&quot;:&quot;cms_call_num&quot;,&quot;components&quot;:[{&quot;componentCode&quot;:&quot;phone_count&quot;,&quot;instanceProperty&quot;:[{&quot;code&quot;:&quot;phone_count&quot;,&quot;value&quot;:&quot;500&quot;}],&quot;moduleAttrStatus&quot;:1}],&quot;duration&quot;:6,&quot;free&quot;:false,&quot;orderParams&quot;:{&quot;aliyunProduceCode&quot;:&quot;cms&quot;},&quot;orderType&quot;:&quot;BUY&quot;,&quot;prePayPostCharge&quot;:false,&quot;pricingCycle&quot;:&quot;Month&quot;,&quot;quantity&quot;:1,&quot;refundSpecCode&quot;:&quot;&quot;,&quot;renewChange&quot;:false,&quot;specCode&quot;:&quot;cms_call_num&quot;,&quot;specUpdate&quot;:false,&quot;syncToSubscription&quot;:false,&quot;upgradeInquireFinancialValue&quot;:true}],&quot;fromApp&quot;:&quot;commonbuy&quot;,&quot;orderParams&quot;:{&quot;priceCheck&quot;:&quot;true&quot;},&quot;payerId&quot;:118935342242****,&quot;requestId&quot;:&quot;ade3ad32-f58b-45d7-add4-ac542be3d8ec&quot;,&quot;skipChannel&quot;:false,&quot;userId&quot;:118935342242****}</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The ID of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The ID of the custom event.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the custom event.</p>
         * 
         * <strong>example:</strong>
         * <p>BABEL_CHECK</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the custom event occurred.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1552199984000</p>
         */
        @NameInMap("Time")
        public String time;

        public static DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent self = new DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent();
            return TeaModel.build(map, self);
        }

        public DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class DescribeCustomEventAttributeResponseBodyCustomEvents extends TeaModel {
        @NameInMap("CustomEvent")
        public java.util.List<DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent> customEvent;

        public static DescribeCustomEventAttributeResponseBodyCustomEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomEventAttributeResponseBodyCustomEvents self = new DescribeCustomEventAttributeResponseBodyCustomEvents();
            return TeaModel.build(map, self);
        }

        public DescribeCustomEventAttributeResponseBodyCustomEvents setCustomEvent(java.util.List<DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent> customEvent) {
            this.customEvent = customEvent;
            return this;
        }
        public java.util.List<DescribeCustomEventAttributeResponseBodyCustomEventsCustomEvent> getCustomEvent() {
            return this.customEvent;
        }

    }

}
