// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20201023.models;

import com.aliyun.tea.*;

public class QueryListRequest extends TeaModel {
    // 输入json参数
    @NameInMap("ParamMap")
    public String paramMap;

    public static QueryListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryListRequest self = new QueryListRequest();
        return TeaModel.build(map, self);
    }

    public QueryListRequest setParamMap(String paramMap) {
        this.paramMap = paramMap;
        return this;
    }
    public String getParamMap() {
        return this.paramMap;
    }

}
