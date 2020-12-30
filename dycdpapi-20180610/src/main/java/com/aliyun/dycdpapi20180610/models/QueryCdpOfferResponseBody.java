// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dycdpapi20180610.models;

import com.aliyun.tea.*;

public class QueryCdpOfferResponseBody extends TeaModel {
    @NameInMap("FlowOffers")
    public QueryCdpOfferResponseBodyFlowOffers flowOffers;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static QueryCdpOfferResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCdpOfferResponseBody self = new QueryCdpOfferResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCdpOfferResponseBody setFlowOffers(QueryCdpOfferResponseBodyFlowOffers flowOffers) {
        this.flowOffers = flowOffers;
        return this;
    }
    public QueryCdpOfferResponseBodyFlowOffers getFlowOffers() {
        return this.flowOffers;
    }

    public QueryCdpOfferResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCdpOfferResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCdpOfferResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class QueryCdpOfferResponseBodyFlowOffersFlowOffer extends TeaModel {
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

        public static QueryCdpOfferResponseBodyFlowOffersFlowOffer build(java.util.Map<String, ?> map) throws Exception {
            QueryCdpOfferResponseBodyFlowOffersFlowOffer self = new QueryCdpOfferResponseBodyFlowOffersFlowOffer();
            return TeaModel.build(map, self);
        }

        public QueryCdpOfferResponseBodyFlowOffersFlowOffer setRight(String right) {
            this.right = right;
            return this;
        }
        public String getRight() {
            return this.right;
        }

        public QueryCdpOfferResponseBodyFlowOffersFlowOffer setUseEff(String useEff) {
            this.useEff = useEff;
            return this;
        }
        public String getUseEff() {
            return this.useEff;
        }

        public QueryCdpOfferResponseBodyFlowOffersFlowOffer setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public QueryCdpOfferResponseBodyFlowOffersFlowOffer setUseLimit(String useLimit) {
            this.useLimit = useLimit;
            return this;
        }
        public String getUseLimit() {
            return this.useLimit;
        }

        public QueryCdpOfferResponseBodyFlowOffersFlowOffer setUseScene(String useScene) {
            this.useScene = useScene;
            return this;
        }
        public String getUseScene() {
            return this.useScene;
        }

        public QueryCdpOfferResponseBodyFlowOffersFlowOffer setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public QueryCdpOfferResponseBodyFlowOffersFlowOffer setGrade(String grade) {
            this.grade = grade;
            return this;
        }
        public String getGrade() {
            return this.grade;
        }

        public QueryCdpOfferResponseBodyFlowOffersFlowOffer setOfferId(Long offerId) {
            this.offerId = offerId;
            return this;
        }
        public Long getOfferId() {
            return this.offerId;
        }

        public QueryCdpOfferResponseBodyFlowOffersFlowOffer setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public QueryCdpOfferResponseBodyFlowOffersFlowOffer setFlowType(String flowType) {
            this.flowType = flowType;
            return this;
        }
        public String getFlowType() {
            return this.flowType;
        }

        public QueryCdpOfferResponseBodyFlowOffersFlowOffer setDiscount(String discount) {
            this.discount = discount;
            return this;
        }
        public String getDiscount() {
            return this.discount;
        }

        public QueryCdpOfferResponseBodyFlowOffersFlowOffer setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class QueryCdpOfferResponseBodyFlowOffers extends TeaModel {
        @NameInMap("FlowOffer")
        public java.util.List<QueryCdpOfferResponseBodyFlowOffersFlowOffer> flowOffer;

        public static QueryCdpOfferResponseBodyFlowOffers build(java.util.Map<String, ?> map) throws Exception {
            QueryCdpOfferResponseBodyFlowOffers self = new QueryCdpOfferResponseBodyFlowOffers();
            return TeaModel.build(map, self);
        }

        public QueryCdpOfferResponseBodyFlowOffers setFlowOffer(java.util.List<QueryCdpOfferResponseBodyFlowOffersFlowOffer> flowOffer) {
            this.flowOffer = flowOffer;
            return this;
        }
        public java.util.List<QueryCdpOfferResponseBodyFlowOffersFlowOffer> getFlowOffer() {
            return this.flowOffer;
        }

    }

}
