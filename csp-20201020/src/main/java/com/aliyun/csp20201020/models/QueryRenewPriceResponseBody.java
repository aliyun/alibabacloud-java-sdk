// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class QueryRenewPriceResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryRenewPriceResponseBodyData data;

    @NameInMap("ErrCode")
    public Integer errCode;

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

    public QueryRenewPriceResponseBody setErrCode(Integer errCode) {
        this.errCode = errCode;
        return this;
    }
    public Integer getErrCode() {
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

    public static class QueryRenewPriceResponseBodyDataCspSoftPriceInfo extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public Double discountPrice;

        @NameInMap("OriginalPrice")
        public Double originalPrice;

        @NameInMap("TradePrice")
        public Double tradePrice;

        public static QueryRenewPriceResponseBodyDataCspSoftPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryRenewPriceResponseBodyDataCspSoftPriceInfo self = new QueryRenewPriceResponseBodyDataCspSoftPriceInfo();
            return TeaModel.build(map, self);
        }

        public QueryRenewPriceResponseBodyDataCspSoftPriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryRenewPriceResponseBodyDataCspSoftPriceInfo setDiscountPrice(Double discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Double getDiscountPrice() {
            return this.discountPrice;
        }

        public QueryRenewPriceResponseBodyDataCspSoftPriceInfo setOriginalPrice(Double originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Double getOriginalPrice() {
            return this.originalPrice;
        }

        public QueryRenewPriceResponseBodyDataCspSoftPriceInfo setTradePrice(Double tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Double getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class QueryRenewPriceResponseBodyData extends TeaModel {
        @NameInMap("CspSoftPriceInfo")
        public QueryRenewPriceResponseBodyDataCspSoftPriceInfo cspSoftPriceInfo;

        public static QueryRenewPriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRenewPriceResponseBodyData self = new QueryRenewPriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRenewPriceResponseBodyData setCspSoftPriceInfo(QueryRenewPriceResponseBodyDataCspSoftPriceInfo cspSoftPriceInfo) {
            this.cspSoftPriceInfo = cspSoftPriceInfo;
            return this;
        }
        public QueryRenewPriceResponseBodyDataCspSoftPriceInfo getCspSoftPriceInfo() {
            return this.cspSoftPriceInfo;
        }

    }

}
