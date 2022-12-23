// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySkuPriceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySkuPriceListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySkuPriceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySkuPriceListResponseBody self = new QuerySkuPriceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySkuPriceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySkuPriceListResponseBody setData(QuerySkuPriceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySkuPriceListResponseBodyData getData() {
        return this.data;
    }

    public QuerySkuPriceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySkuPriceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySkuPriceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceListRangeList extends TeaModel {
        @NameInMap("FactorCode")
        public String factorCode;

        @NameInMap("Max")
        public String max;

        @NameInMap("Min")
        public String min;

        @NameInMap("Type")
        public String type;

        public static QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceListRangeList build(java.util.Map<String, ?> map) throws Exception {
            QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceListRangeList self = new QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceListRangeList();
            return TeaModel.build(map, self);
        }

        public QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceListRangeList setFactorCode(String factorCode) {
            this.factorCode = factorCode;
            return this;
        }
        public String getFactorCode() {
            return this.factorCode;
        }

        public QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceListRangeList setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceListRangeList setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

        public QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceListRangeList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceList extends TeaModel {
        @NameInMap("CskuCode")
        public String cskuCode;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("Price")
        public String price;

        @NameInMap("PriceMode")
        public String priceMode;

        @NameInMap("PriceType")
        public String priceType;

        @NameInMap("PriceUnit")
        public String priceUnit;

        @NameInMap("RangeList")
        public java.util.List<QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceListRangeList> rangeList;

        @NameInMap("UsageUnit")
        public String usageUnit;

        public static QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceList build(java.util.Map<String, ?> map) throws Exception {
            QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceList self = new QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceList();
            return TeaModel.build(map, self);
        }

        public QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceList setCskuCode(String cskuCode) {
            this.cskuCode = cskuCode;
            return this;
        }
        public String getCskuCode() {
            return this.cskuCode;
        }

        public QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceList setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceList setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceList setPriceMode(String priceMode) {
            this.priceMode = priceMode;
            return this;
        }
        public String getPriceMode() {
            return this.priceMode;
        }

        public QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceList setPriceType(String priceType) {
            this.priceType = priceType;
            return this;
        }
        public String getPriceType() {
            return this.priceType;
        }

        public QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceList setPriceUnit(String priceUnit) {
            this.priceUnit = priceUnit;
            return this;
        }
        public String getPriceUnit() {
            return this.priceUnit;
        }

        public QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceList setRangeList(java.util.List<QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceListRangeList> rangeList) {
            this.rangeList = rangeList;
            return this;
        }
        public java.util.List<QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceListRangeList> getRangeList() {
            return this.rangeList;
        }

        public QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceList setUsageUnit(String usageUnit) {
            this.usageUnit = usageUnit;
            return this;
        }
        public String getUsageUnit() {
            return this.usageUnit;
        }

    }

    public static class QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceList extends TeaModel {
        @NameInMap("CskuPriceList")
        public java.util.List<QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceList> cskuPriceList;

        // sku code
        @NameInMap("SkuCode")
        public String skuCode;

        @NameInMap("SkuFactorMap")
        public java.util.Map<String, String> skuFactorMap;

        public static QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceList build(java.util.Map<String, ?> map) throws Exception {
            QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceList self = new QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceList();
            return TeaModel.build(map, self);
        }

        public QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceList setCskuPriceList(java.util.List<QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceList> cskuPriceList) {
            this.cskuPriceList = cskuPriceList;
            return this;
        }
        public java.util.List<QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceList> getCskuPriceList() {
            return this.cskuPriceList;
        }

        public QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceList setSkuCode(String skuCode) {
            this.skuCode = skuCode;
            return this;
        }
        public String getSkuCode() {
            return this.skuCode;
        }

        public QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceList setSkuFactorMap(java.util.Map<String, String> skuFactorMap) {
            this.skuFactorMap = skuFactorMap;
            return this;
        }
        public java.util.Map<String, String> getSkuFactorMap() {
            return this.skuFactorMap;
        }

    }

    public static class QuerySkuPriceListResponseBodyDataSkuPricePage extends TeaModel {
        @NameInMap("NextPageToken")
        public String nextPageToken;

        @NameInMap("SkuPriceList")
        public java.util.List<QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceList> skuPriceList;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QuerySkuPriceListResponseBodyDataSkuPricePage build(java.util.Map<String, ?> map) throws Exception {
            QuerySkuPriceListResponseBodyDataSkuPricePage self = new QuerySkuPriceListResponseBodyDataSkuPricePage();
            return TeaModel.build(map, self);
        }

        public QuerySkuPriceListResponseBodyDataSkuPricePage setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public QuerySkuPriceListResponseBodyDataSkuPricePage setSkuPriceList(java.util.List<QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceList> skuPriceList) {
            this.skuPriceList = skuPriceList;
            return this;
        }
        public java.util.List<QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceList> getSkuPriceList() {
            return this.skuPriceList;
        }

        public QuerySkuPriceListResponseBodyDataSkuPricePage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class QuerySkuPriceListResponseBodyData extends TeaModel {
        @NameInMap("SkuPricePage")
        public QuerySkuPriceListResponseBodyDataSkuPricePage skuPricePage;

        public static QuerySkuPriceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySkuPriceListResponseBodyData self = new QuerySkuPriceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySkuPriceListResponseBodyData setSkuPricePage(QuerySkuPriceListResponseBodyDataSkuPricePage skuPricePage) {
            this.skuPricePage = skuPricePage;
            return this;
        }
        public QuerySkuPriceListResponseBodyDataSkuPricePage getSkuPricePage() {
            return this.skuPricePage;
        }

    }

}
