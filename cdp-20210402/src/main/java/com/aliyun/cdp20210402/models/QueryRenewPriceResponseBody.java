// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryRenewPriceResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryRenewPriceResponseBodyData data;

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

    public static QueryRenewPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRenewPriceResponseBody self = new QueryRenewPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRenewPriceResponseBody setData(QueryRenewPriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryRenewPriceResponseBodyData getData() {
        return this.data;
    }

    public QueryRenewPriceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QueryRenewPriceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryRenewPriceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryRenewPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRenewPriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRenewPriceResponseBodyDataCdpSoftPriceInfo extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static QueryRenewPriceResponseBodyDataCdpSoftPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryRenewPriceResponseBodyDataCdpSoftPriceInfo self = new QueryRenewPriceResponseBodyDataCdpSoftPriceInfo();
            return TeaModel.build(map, self);
        }

        public QueryRenewPriceResponseBodyDataCdpSoftPriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryRenewPriceResponseBodyDataCdpSoftPriceInfo setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public QueryRenewPriceResponseBodyDataCdpSoftPriceInfo setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public QueryRenewPriceResponseBodyDataCdpSoftPriceInfo setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class QueryRenewPriceResponseBodyDataEcsPriceInfo extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static QueryRenewPriceResponseBodyDataEcsPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryRenewPriceResponseBodyDataEcsPriceInfo self = new QueryRenewPriceResponseBodyDataEcsPriceInfo();
            return TeaModel.build(map, self);
        }

        public QueryRenewPriceResponseBodyDataEcsPriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryRenewPriceResponseBodyDataEcsPriceInfo setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public QueryRenewPriceResponseBodyDataEcsPriceInfo setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public QueryRenewPriceResponseBodyDataEcsPriceInfo setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class QueryRenewPriceResponseBodyData extends TeaModel {
        @NameInMap("CdpSoftPriceInfo")
        public QueryRenewPriceResponseBodyDataCdpSoftPriceInfo cdpSoftPriceInfo;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("EcsPriceInfo")
        public QueryRenewPriceResponseBodyDataEcsPriceInfo ecsPriceInfo;

        @NameInMap("SumPrice")
        public Float sumPrice;

        public static QueryRenewPriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRenewPriceResponseBodyData self = new QueryRenewPriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRenewPriceResponseBodyData setCdpSoftPriceInfo(QueryRenewPriceResponseBodyDataCdpSoftPriceInfo cdpSoftPriceInfo) {
            this.cdpSoftPriceInfo = cdpSoftPriceInfo;
            return this;
        }
        public QueryRenewPriceResponseBodyDataCdpSoftPriceInfo getCdpSoftPriceInfo() {
            return this.cdpSoftPriceInfo;
        }

        public QueryRenewPriceResponseBodyData setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public QueryRenewPriceResponseBodyData setEcsPriceInfo(QueryRenewPriceResponseBodyDataEcsPriceInfo ecsPriceInfo) {
            this.ecsPriceInfo = ecsPriceInfo;
            return this;
        }
        public QueryRenewPriceResponseBodyDataEcsPriceInfo getEcsPriceInfo() {
            return this.ecsPriceInfo;
        }

        public QueryRenewPriceResponseBodyData setSumPrice(Float sumPrice) {
            this.sumPrice = sumPrice;
            return this;
        }
        public Float getSumPrice() {
            return this.sumPrice;
        }

    }

}
