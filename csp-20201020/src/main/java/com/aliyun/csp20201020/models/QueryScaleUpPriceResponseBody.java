// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class QueryScaleUpPriceResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryScaleUpPriceResponseBodyData data;

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

    public QueryScaleUpPriceResponseBody setErrCode(Integer errCode) {
        this.errCode = errCode;
        return this;
    }
    public Integer getErrCode() {
        return this.errCode;
    }

    public QueryScaleUpPriceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryScaleUpPriceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
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

    public static class QueryScaleUpPriceResponseBodyDataCspSoftPriceInfo extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public Double discountPrice;

        @NameInMap("OriginalPrice")
        public Double originalPrice;

        @NameInMap("TradePrice")
        public Double tradePrice;

        public static QueryScaleUpPriceResponseBodyDataCspSoftPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryScaleUpPriceResponseBodyDataCspSoftPriceInfo self = new QueryScaleUpPriceResponseBodyDataCspSoftPriceInfo();
            return TeaModel.build(map, self);
        }

        public QueryScaleUpPriceResponseBodyDataCspSoftPriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryScaleUpPriceResponseBodyDataCspSoftPriceInfo setDiscountPrice(Double discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Double getDiscountPrice() {
            return this.discountPrice;
        }

        public QueryScaleUpPriceResponseBodyDataCspSoftPriceInfo setOriginalPrice(Double originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Double getOriginalPrice() {
            return this.originalPrice;
        }

        public QueryScaleUpPriceResponseBodyDataCspSoftPriceInfo setTradePrice(Double tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Double getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class QueryScaleUpPriceResponseBodyData extends TeaModel {
        @NameInMap("CspSoftPriceInfo")
        public QueryScaleUpPriceResponseBodyDataCspSoftPriceInfo cspSoftPriceInfo;

        public static QueryScaleUpPriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryScaleUpPriceResponseBodyData self = new QueryScaleUpPriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryScaleUpPriceResponseBodyData setCspSoftPriceInfo(QueryScaleUpPriceResponseBodyDataCspSoftPriceInfo cspSoftPriceInfo) {
            this.cspSoftPriceInfo = cspSoftPriceInfo;
            return this;
        }
        public QueryScaleUpPriceResponseBodyDataCspSoftPriceInfo getCspSoftPriceInfo() {
            return this.cspSoftPriceInfo;
        }

    }

}
