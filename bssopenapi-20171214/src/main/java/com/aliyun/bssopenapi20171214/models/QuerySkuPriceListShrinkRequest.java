// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySkuPriceListShrinkRequest extends TeaModel {
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PriceEntityCode")
    public String priceEntityCode;

    @NameInMap("PriceFactorConditionMap")
    public String priceFactorConditionMapShrink;

    public static QuerySkuPriceListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySkuPriceListShrinkRequest self = new QuerySkuPriceListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QuerySkuPriceListShrinkRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public QuerySkuPriceListShrinkRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QuerySkuPriceListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySkuPriceListShrinkRequest setPriceEntityCode(String priceEntityCode) {
        this.priceEntityCode = priceEntityCode;
        return this;
    }
    public String getPriceEntityCode() {
        return this.priceEntityCode;
    }

    public QuerySkuPriceListShrinkRequest setPriceFactorConditionMapShrink(String priceFactorConditionMapShrink) {
        this.priceFactorConditionMapShrink = priceFactorConditionMapShrink;
        return this;
    }
    public String getPriceFactorConditionMapShrink() {
        return this.priceFactorConditionMapShrink;
    }

}
