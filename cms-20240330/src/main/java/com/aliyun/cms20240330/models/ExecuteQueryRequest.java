// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ExecuteQueryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT count(1) from &quot;datasetname&quot;</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SQL</p>
     */
    @NameInMap("type")
    public String type;

    public static ExecuteQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteQueryRequest self = new ExecuteQueryRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteQueryRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ExecuteQueryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
