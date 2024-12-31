// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class QueryForCssOrderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("paramStr")
    public String paramStr;

    public static QueryForCssOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryForCssOrderRequest self = new QueryForCssOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryForCssOrderRequest setParamStr(String paramStr) {
        this.paramStr = paramStr;
        return this;
    }
    public String getParamStr() {
        return this.paramStr;
    }

}
