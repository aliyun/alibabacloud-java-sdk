// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20201023.models;

import com.aliyun.tea.*;

public class QueryObjectRequest extends TeaModel {
    // json参数
    @NameInMap("ParamMap")
    public String paramMap;

    public static QueryObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryObjectRequest self = new QueryObjectRequest();
        return TeaModel.build(map, self);
    }

    public QueryObjectRequest setParamMap(String paramMap) {
        this.paramMap = paramMap;
        return this;
    }
    public String getParamMap() {
        return this.paramMap;
    }

}
