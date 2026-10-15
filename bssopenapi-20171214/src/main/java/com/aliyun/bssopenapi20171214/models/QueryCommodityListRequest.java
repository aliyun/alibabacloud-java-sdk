// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCommodityListRequest extends TeaModel {
    /**
     * <p>The language. If this parameter is not specified, the default value zh (Chinese) is used.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The product code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static QueryCommodityListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCommodityListRequest self = new QueryCommodityListRequest();
        return TeaModel.build(map, self);
    }

    public QueryCommodityListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryCommodityListRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
