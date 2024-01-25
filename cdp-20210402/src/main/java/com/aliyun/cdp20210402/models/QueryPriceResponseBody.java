// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryPriceResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryPriceResponseBodyData data;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPriceResponseBody self = new QueryPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPriceResponseBody setData(QueryPriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPriceResponseBodyData getData() {
        return this.data;
    }

    public QueryPriceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QueryPriceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryPriceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPriceResponseBodyDataEcsPriceInfo extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public Double discountPrice;

        @NameInMap("OriginalPrice")
        public Double originalPrice;

        @NameInMap("TradePrice")
        public Double tradePrice;

        public static QueryPriceResponseBodyDataEcsPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryPriceResponseBodyDataEcsPriceInfo self = new QueryPriceResponseBodyDataEcsPriceInfo();
            return TeaModel.build(map, self);
        }

        public QueryPriceResponseBodyDataEcsPriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryPriceResponseBodyDataEcsPriceInfo setDiscountPrice(Double discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Double getDiscountPrice() {
            return this.discountPrice;
        }

        public QueryPriceResponseBodyDataEcsPriceInfo setOriginalPrice(Double originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Double getOriginalPrice() {
            return this.originalPrice;
        }

        public QueryPriceResponseBodyDataEcsPriceInfo setTradePrice(Double tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Double getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class QueryPriceResponseBodyDataSoftPriceInfo extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public Double discountPrice;

        @NameInMap("OriginalPrice")
        public Double originalPrice;

        @NameInMap("TradePrice")
        public Double tradePrice;

        public static QueryPriceResponseBodyDataSoftPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryPriceResponseBodyDataSoftPriceInfo self = new QueryPriceResponseBodyDataSoftPriceInfo();
            return TeaModel.build(map, self);
        }

        public QueryPriceResponseBodyDataSoftPriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryPriceResponseBodyDataSoftPriceInfo setDiscountPrice(Double discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Double getDiscountPrice() {
            return this.discountPrice;
        }

        public QueryPriceResponseBodyDataSoftPriceInfo setOriginalPrice(Double originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Double getOriginalPrice() {
            return this.originalPrice;
        }

        public QueryPriceResponseBodyDataSoftPriceInfo setTradePrice(Double tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Double getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class QueryPriceResponseBodyData extends TeaModel {
        @NameInMap("DiscountPrice")
        public Double discountPrice;

        @NameInMap("EcsPriceInfo")
        public QueryPriceResponseBodyDataEcsPriceInfo ecsPriceInfo;

        @NameInMap("SoftPriceInfo")
        public QueryPriceResponseBodyDataSoftPriceInfo softPriceInfo;

        @NameInMap("SumPrice")
        public Double sumPrice;

        public static QueryPriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPriceResponseBodyData self = new QueryPriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPriceResponseBodyData setDiscountPrice(Double discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Double getDiscountPrice() {
            return this.discountPrice;
        }

        public QueryPriceResponseBodyData setEcsPriceInfo(QueryPriceResponseBodyDataEcsPriceInfo ecsPriceInfo) {
            this.ecsPriceInfo = ecsPriceInfo;
            return this;
        }
        public QueryPriceResponseBodyDataEcsPriceInfo getEcsPriceInfo() {
            return this.ecsPriceInfo;
        }

        public QueryPriceResponseBodyData setSoftPriceInfo(QueryPriceResponseBodyDataSoftPriceInfo softPriceInfo) {
            this.softPriceInfo = softPriceInfo;
            return this;
        }
        public QueryPriceResponseBodyDataSoftPriceInfo getSoftPriceInfo() {
            return this.softPriceInfo;
        }

        public QueryPriceResponseBodyData setSumPrice(Double sumPrice) {
            this.sumPrice = sumPrice;
            return this;
        }
        public Double getSumPrice() {
            return this.sumPrice;
        }

    }

}
