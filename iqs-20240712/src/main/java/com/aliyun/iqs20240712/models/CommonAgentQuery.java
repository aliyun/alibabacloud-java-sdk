// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class CommonAgentQuery extends TeaModel {
    @NameInMap("query")
    public String query;

    @NameInMap("querySceneEnumCode")
    public String querySceneEnumCode;

    public static CommonAgentQuery build(java.util.Map<String, ?> map) throws Exception {
        CommonAgentQuery self = new CommonAgentQuery();
        return TeaModel.build(map, self);
    }

    public CommonAgentQuery setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public CommonAgentQuery setQuerySceneEnumCode(String querySceneEnumCode) {
        this.querySceneEnumCode = querySceneEnumCode;
        return this;
    }
    public String getQuerySceneEnumCode() {
        return this.querySceneEnumCode;
    }

}
