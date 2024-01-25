// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryScaleUpPriceResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryScaleUpPriceResponseBodyData data;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryScaleUpPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryScaleUpPriceResponseBody self = new QueryScaleUpPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryScaleUpPriceResponseBody setData(QueryScaleUpPriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryScaleUpPriceResponseBodyData getData() {
        return this.data;
    }

    public QueryScaleUpPriceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QueryScaleUpPriceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryScaleUpPriceResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryScaleUpPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryScaleUpPriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryScaleUpPriceResponseBodyDataEcsPriceInfo extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static QueryScaleUpPriceResponseBodyDataEcsPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryScaleUpPriceResponseBodyDataEcsPriceInfo self = new QueryScaleUpPriceResponseBodyDataEcsPriceInfo();
            return TeaModel.build(map, self);
        }

        public QueryScaleUpPriceResponseBodyDataEcsPriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryScaleUpPriceResponseBodyDataEcsPriceInfo setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public QueryScaleUpPriceResponseBodyDataEcsPriceInfo setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public QueryScaleUpPriceResponseBodyDataEcsPriceInfo setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class QueryScaleUpPriceResponseBodyDataSoftPriceInfo extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static QueryScaleUpPriceResponseBodyDataSoftPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryScaleUpPriceResponseBodyDataSoftPriceInfo self = new QueryScaleUpPriceResponseBodyDataSoftPriceInfo();
            return TeaModel.build(map, self);
        }

        public QueryScaleUpPriceResponseBodyDataSoftPriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryScaleUpPriceResponseBodyDataSoftPriceInfo setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public QueryScaleUpPriceResponseBodyDataSoftPriceInfo setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public QueryScaleUpPriceResponseBodyDataSoftPriceInfo setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class QueryScaleUpPriceResponseBodyData extends TeaModel {
        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("EcsPriceInfo")
        public QueryScaleUpPriceResponseBodyDataEcsPriceInfo ecsPriceInfo;

        @NameInMap("SoftPriceInfo")
        public QueryScaleUpPriceResponseBodyDataSoftPriceInfo softPriceInfo;

        @NameInMap("SumPrice")
        public Float sumPrice;

        public static QueryScaleUpPriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryScaleUpPriceResponseBodyData self = new QueryScaleUpPriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryScaleUpPriceResponseBodyData setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public QueryScaleUpPriceResponseBodyData setEcsPriceInfo(QueryScaleUpPriceResponseBodyDataEcsPriceInfo ecsPriceInfo) {
            this.ecsPriceInfo = ecsPriceInfo;
            return this;
        }
        public QueryScaleUpPriceResponseBodyDataEcsPriceInfo getEcsPriceInfo() {
            return this.ecsPriceInfo;
        }

        public QueryScaleUpPriceResponseBodyData setSoftPriceInfo(QueryScaleUpPriceResponseBodyDataSoftPriceInfo softPriceInfo) {
            this.softPriceInfo = softPriceInfo;
            return this;
        }
        public QueryScaleUpPriceResponseBodyDataSoftPriceInfo getSoftPriceInfo() {
            return this.softPriceInfo;
        }

        public QueryScaleUpPriceResponseBodyData setSumPrice(Float sumPrice) {
            this.sumPrice = sumPrice;
            return this;
        }
        public Float getSumPrice() {
            return this.sumPrice;
        }

    }

}
