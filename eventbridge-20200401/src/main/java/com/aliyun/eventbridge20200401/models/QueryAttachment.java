// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryAttachment extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;SELECT city, COUNT(*) AS cnt FROM events GROUP BY city&quot;</p>
     */
    @NameInMap("Query")
    public String query;

    @NameInMap("Result")
    public ExecutionResult result;

    public static QueryAttachment build(java.util.Map<String, ?> map) throws Exception {
        QueryAttachment self = new QueryAttachment();
        return TeaModel.build(map, self);
    }

    public QueryAttachment setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QueryAttachment setResult(ExecutionResult result) {
        this.result = result;
        return this;
    }
    public ExecutionResult getResult() {
        return this.result;
    }

}
