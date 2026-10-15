// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryPriceEntityListRequest extends TeaModel {
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

    public static QueryPriceEntityListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPriceEntityListRequest self = new QueryPriceEntityListRequest();
        return TeaModel.build(map, self);
    }

    public QueryPriceEntityListRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public QueryPriceEntityListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
