// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySkuPriceListShrinkRequest extends TeaModel {
    /**
     * <p>The code of the service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The token that is used to retrieve the next page. You do not need to set this parameter if you query coverage details for the first time. The response returns a token that you can use to query coverage details of the next page. If a null value is returned for the NextPageToken parameter, no more coverage details can be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>080112060a0422020800180022490a470342000000315333303332363436363336333433393636333136333338333733373333333133373336363336323634363336363337333836333636333636313336363433363332</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The number of entries to be returned on each page. Maximum value: 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The code of the pricing object.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance_type</p>
     */
    @NameInMap("PriceEntityCode")
    public String priceEntityCode;

    /**
     * <p>The conditions of the pricing factors.</p>
     */
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

    public QuerySkuPriceListShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
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
