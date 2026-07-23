// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryEventHouseRequest extends TeaModel {
    /**
     * <p>The maximum number of rows to return. If a LIMIT clause is already specified in the SQL statement, the SQL\&quot;s own LIMIT takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The query statement. Typically uses a three-part table name in the format catalog.namespace.table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT * FROM &quot;test-es&quot;.&quot;default&quot;.&quot;product_info&quot;</p>
     */
    @NameInMap("Query")
    public String query;

    public static QueryEventHouseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEventHouseRequest self = new QueryEventHouseRequest();
        return TeaModel.build(map, self);
    }

    public QueryEventHouseRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QueryEventHouseRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
