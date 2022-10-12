// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySkuPriceListRequest extends TeaModel {
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PriceEntityCode")
    public String priceEntityCode;

    @NameInMap("PriceFactorConditionMap")
    public java.util.Map<String, java.util.List<String>> priceFactorConditionMap;

    public static QuerySkuPriceListRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySkuPriceListRequest self = new QuerySkuPriceListRequest();
        return TeaModel.build(map, self);
    }

    public QuerySkuPriceListRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public QuerySkuPriceListRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QuerySkuPriceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySkuPriceListRequest setPriceEntityCode(String priceEntityCode) {
        this.priceEntityCode = priceEntityCode;
        return this;
    }
    public String getPriceEntityCode() {
        return this.priceEntityCode;
    }

    public QuerySkuPriceListRequest setPriceFactorConditionMap(java.util.Map<String, java.util.List<String>> priceFactorConditionMap) {
        this.priceFactorConditionMap = priceFactorConditionMap;
        return this;
    }
    public java.util.Map<String, java.util.List<String>> getPriceFactorConditionMap() {
        return this.priceFactorConditionMap;
    }

}
