// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySkuPriceListRequest extends TeaModel {
    /**
     * <p>The commodity code. You can call the <strong>QueryCommodityList</strong> operation to query the commodity code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The language. Default value: zh (Chinese).</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The pagination token. Leave this parameter empty for the first page query. The query result returns a token for the next page. An empty token in the result indicates that all data has been retrieved. You can obtain the next page token from the <strong>NextPageToken</strong> field in the query result.</p>
     * 
     * <strong>example:</strong>
     * <p>080112060a0422020800180022490a470342000000315333303332363436363336333433393636333136333338333733373333333133373336363336323634363336363337333836333636333636313336363433363332</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The number of entries per page. Maximum value: 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The pricing entity code. You can call the <strong>QueryPriceEntityList</strong> operation to query the pricing entity code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance_type</p>
     */
    @NameInMap("PriceEntityCode")
    public String priceEntityCode;

    /**
     * <p>The collection of pricing factor conditions. You can call the <strong>QueryPriceEntityList</strong> operation to query pricing factor codes and pricing factor values.</p>
     */
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

    public QuerySkuPriceListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
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
