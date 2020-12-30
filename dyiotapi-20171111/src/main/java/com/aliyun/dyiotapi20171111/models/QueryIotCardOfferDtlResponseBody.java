// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class QueryIotCardOfferDtlResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CardOfferDetail")
    public QueryIotCardOfferDtlResponseBodyCardOfferDetail cardOfferDetail;

    @NameInMap("Code")
    public String code;

    public static QueryIotCardOfferDtlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIotCardOfferDtlResponseBody self = new QueryIotCardOfferDtlResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIotCardOfferDtlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryIotCardOfferDtlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIotCardOfferDtlResponseBody setCardOfferDetail(QueryIotCardOfferDtlResponseBodyCardOfferDetail cardOfferDetail) {
        this.cardOfferDetail = cardOfferDetail;
        return this;
    }
    public QueryIotCardOfferDtlResponseBodyCardOfferDetail getCardOfferDetail() {
        return this.cardOfferDetail;
    }

    public QueryIotCardOfferDtlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class QueryIotCardOfferDtlResponseBodyCardOfferDetailDetail extends TeaModel {
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        @NameInMap("OfferId")
        public String offerId;

        @NameInMap("OfferName")
        public String offerName;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("OrderTime")
        public String orderTime;

        public static QueryIotCardOfferDtlResponseBodyCardOfferDetailDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryIotCardOfferDtlResponseBodyCardOfferDetailDetail self = new QueryIotCardOfferDtlResponseBodyCardOfferDetailDetail();
            return TeaModel.build(map, self);
        }

        public QueryIotCardOfferDtlResponseBodyCardOfferDetailDetail setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public QueryIotCardOfferDtlResponseBodyCardOfferDetailDetail setOfferId(String offerId) {
            this.offerId = offerId;
            return this;
        }
        public String getOfferId() {
            return this.offerId;
        }

        public QueryIotCardOfferDtlResponseBodyCardOfferDetailDetail setOfferName(String offerName) {
            this.offerName = offerName;
            return this;
        }
        public String getOfferName() {
            return this.offerName;
        }

        public QueryIotCardOfferDtlResponseBodyCardOfferDetailDetail setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public QueryIotCardOfferDtlResponseBodyCardOfferDetailDetail setOrderTime(String orderTime) {
            this.orderTime = orderTime;
            return this;
        }
        public String getOrderTime() {
            return this.orderTime;
        }

    }

    public static class QueryIotCardOfferDtlResponseBodyCardOfferDetail extends TeaModel {
        @NameInMap("detail")
        public java.util.List<QueryIotCardOfferDtlResponseBodyCardOfferDetailDetail> detail;

        public static QueryIotCardOfferDtlResponseBodyCardOfferDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryIotCardOfferDtlResponseBodyCardOfferDetail self = new QueryIotCardOfferDtlResponseBodyCardOfferDetail();
            return TeaModel.build(map, self);
        }

        public QueryIotCardOfferDtlResponseBodyCardOfferDetail setDetail(java.util.List<QueryIotCardOfferDtlResponseBodyCardOfferDetailDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<QueryIotCardOfferDtlResponseBodyCardOfferDetailDetail> getDetail() {
            return this.detail;
        }

    }

}
