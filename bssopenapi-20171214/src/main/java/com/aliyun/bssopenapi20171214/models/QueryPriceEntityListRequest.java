// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryPriceEntityListRequest extends TeaModel {
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
