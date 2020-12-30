// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dycdpapi20180610.models;

import com.aliyun.tea.*;

public class QueryCdpOfferByIdResponseBody extends TeaModel {
    @NameInMap("FlowOffers")
    public QueryCdpOfferByIdResponseBodyFlowOffers flowOffers;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static QueryCdpOfferByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCdpOfferByIdResponseBody self = new QueryCdpOfferByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCdpOfferByIdResponseBody setFlowOffers(QueryCdpOfferByIdResponseBodyFlowOffers flowOffers) {
        this.flowOffers = flowOffers;
        return this;
    }
    public QueryCdpOfferByIdResponseBodyFlowOffers getFlowOffers() {
        return this.flowOffers;
    }

    public QueryCdpOfferByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCdpOfferByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCdpOfferByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class QueryCdpOfferByIdResponseBodyFlowOffersFlowOffer extends TeaModel {
        @NameInMap("Right")
        public String right;

        @NameInMap("UseEff")
        public String useEff;

        @NameInMap("ChannelType")
        public String channelType;

        @NameInMap("UseLimit")
        public String useLimit;

        @NameInMap("UseScene")
        public String useScene;

        @NameInMap("Vendor")
        public String vendor;

        @NameInMap("Grade")
        public String grade;

        @NameInMap("OfferId")
        public Long offerId;

        @NameInMap("Price")
        public Long price;

        @NameInMap("FlowType")
        public String flowType;

        @NameInMap("Discount")
        public String discount;

        @NameInMap("Province")
        public String province;

        public static QueryCdpOfferByIdResponseBodyFlowOffersFlowOffer build(java.util.Map<String, ?> map) throws Exception {
            QueryCdpOfferByIdResponseBodyFlowOffersFlowOffer self = new QueryCdpOfferByIdResponseBodyFlowOffersFlowOffer();
            return TeaModel.build(map, self);
        }

        public QueryCdpOfferByIdResponseBodyFlowOffersFlowOffer setRight(String right) {
            this.right = right;
            return this;
        }
        public String getRight() {
            return this.right;
        }

        public QueryCdpOfferByIdResponseBodyFlowOffersFlowOffer setUseEff(String useEff) {
            this.useEff = useEff;
            return this;
        }
        public String getUseEff() {
            return this.useEff;
        }

        public QueryCdpOfferByIdResponseBodyFlowOffersFlowOffer setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public QueryCdpOfferByIdResponseBodyFlowOffersFlowOffer setUseLimit(String useLimit) {
            this.useLimit = useLimit;
            return this;
        }
        public String getUseLimit() {
            return this.useLimit;
        }

        public QueryCdpOfferByIdResponseBodyFlowOffersFlowOffer setUseScene(String useScene) {
            this.useScene = useScene;
            return this;
        }
        public String getUseScene() {
            return this.useScene;
        }

        public QueryCdpOfferByIdResponseBodyFlowOffersFlowOffer setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public QueryCdpOfferByIdResponseBodyFlowOffersFlowOffer setGrade(String grade) {
            this.grade = grade;
            return this;
        }
        public String getGrade() {
            return this.grade;
        }

        public QueryCdpOfferByIdResponseBodyFlowOffersFlowOffer setOfferId(Long offerId) {
            this.offerId = offerId;
            return this;
        }
        public Long getOfferId() {
            return this.offerId;
        }

        public QueryCdpOfferByIdResponseBodyFlowOffersFlowOffer setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public QueryCdpOfferByIdResponseBodyFlowOffersFlowOffer setFlowType(String flowType) {
            this.flowType = flowType;
            return this;
        }
        public String getFlowType() {
            return this.flowType;
        }

        public QueryCdpOfferByIdResponseBodyFlowOffersFlowOffer setDiscount(String discount) {
            this.discount = discount;
            return this;
        }
        public String getDiscount() {
            return this.discount;
        }

        public QueryCdpOfferByIdResponseBodyFlowOffersFlowOffer setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class QueryCdpOfferByIdResponseBodyFlowOffers extends TeaModel {
        @NameInMap("FlowOffer")
        public java.util.List<QueryCdpOfferByIdResponseBodyFlowOffersFlowOffer> flowOffer;

        public static QueryCdpOfferByIdResponseBodyFlowOffers build(java.util.Map<String, ?> map) throws Exception {
            QueryCdpOfferByIdResponseBodyFlowOffers self = new QueryCdpOfferByIdResponseBodyFlowOffers();
            return TeaModel.build(map, self);
        }

        public QueryCdpOfferByIdResponseBodyFlowOffers setFlowOffer(java.util.List<QueryCdpOfferByIdResponseBodyFlowOffersFlowOffer> flowOffer) {
            this.flowOffer = flowOffer;
            return this;
        }
        public java.util.List<QueryCdpOfferByIdResponseBodyFlowOffersFlowOffer> getFlowOffer() {
            return this.flowOffer;
        }

    }

}
