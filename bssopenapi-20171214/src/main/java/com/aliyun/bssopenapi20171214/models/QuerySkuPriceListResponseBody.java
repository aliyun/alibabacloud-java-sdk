// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySkuPriceListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Data")
    public QuerySkuPriceListResponseBodyData data;

    /**
     * <p>The message that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F5B803CF-94D8-43AF-ADB3-D819AAD30E27</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The code of the pricing factor.</p>
         * 
         * <strong>example:</strong>
         * <p>212fbd27866307fc79ecf06934a88b2c</p>
         */
        @NameInMap("FactorCode")
        public String factorCode;

        /**
         * <p>The maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Max")
        public String max;

        /**
         * <p>The minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Min")
        public String min;

        /**
         * <p>The closure type of the interval.</p>
         * 
         * <strong>example:</strong>
         * <p>LORC</p>
         */
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
        /**
         * <p>The unique code of the SKU price.</p>
         * 
         * <strong>example:</strong>
         * <p>ac74dd7b52ae6389ddef099283fb8275</p>
         */
        @NameInMap("CskuCode")
        public String cskuCode;

        /**
         * <p>The currency.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The price.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Price")
        public String price;

        /**
         * <p>The pricing mode.</p>
         * 
         * <strong>example:</strong>
         * <p>STEP_ARRIVE</p>
         */
        @NameInMap("PriceMode")
        public String priceMode;

        /**
         * <p>The pricing type.</p>
         * 
         * <strong>example:</strong>
         * <p>hourPrice</p>
         */
        @NameInMap("PriceType")
        public String priceType;

        /**
         * <p>The unit of the price.</p>
         * 
         * <strong>example:</strong>
         * <p>USD (per unit)</p>
         */
        @NameInMap("PriceUnit")
        public String priceUnit;

        /**
         * <p>If the PriceMode parameter is set to STEP_ACCUMULATION or STEP_ARRIVE, the value of this field exists and specifies the range. If the PriceMode parameter is set to NORMAL_PRICE, the value of this field is null.</p>
         */
        @NameInMap("RangeList")
        public java.util.List<QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceListRangeList> rangeList;

        /**
         * <p>The usage unit.</p>
         * 
         * <strong>example:</strong>
         * <p>Count</p>
         */
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
        /**
         * <p>The prices of the SKUs.</p>
         */
        @NameInMap("CskuPriceList")
        public java.util.List<QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceListCskuPriceList> cskuPriceList;

        /**
         * <p>The code of the SKU.</p>
         * 
         * <strong>example:</strong>
         * <p>017c15a31507bc6de22aa93777461adc</p>
         */
        @NameInMap("SkuCode")
        public String skuCode;

        /**
         * <p>The values of the pricing factors.</p>
         */
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
        /**
         * <p>The token that is used to query the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>080112060a0422020800180022490a470342000000315333303332363436363336333433393636333136333338333733373333333133373336363336323634363336363337333836333636333636313336363433363332</p>
         */
        @NameInMap("NextPageToken")
        public String nextPageToken;

        /**
         * <p>The SKUs.</p>
         */
        @NameInMap("SkuPriceList")
        public java.util.List<QuerySkuPriceListResponseBodyDataSkuPricePageSkuPriceList> skuPriceList;

        /**
         * <p>The total number of SKUs.</p>
         * 
         * <strong>example:</strong>
         * <p>18732</p>
         */
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
        /**
         * <p>The SKUs of the pricing object.</p>
         */
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
