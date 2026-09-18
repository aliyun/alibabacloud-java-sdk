// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryWithSQLRequest extends TeaModel {
    /**
     * <p>The maximum number of rows to return. Default value: 20. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The query statement. Typically uses a three-part table name in the format of catalog.namespace.table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT * FROM &quot;test-es&quot;.&quot;default&quot;.&quot;product_info&quot;</p>
     */
    @NameInMap("Query")
    public String query;

    public static QueryWithSQLRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWithSQLRequest self = new QueryWithSQLRequest();
        return TeaModel.build(map, self);
    }

    public QueryWithSQLRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QueryWithSQLRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
