// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class UnifiedOriginalQuery extends TeaModel {
    @NameInMap("query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>NoLimit</p>
     */
    @NameInMap("timeRange")
    public String timeRange;

    public static UnifiedOriginalQuery build(java.util.Map<String, ?> map) throws Exception {
        UnifiedOriginalQuery self = new UnifiedOriginalQuery();
        return TeaModel.build(map, self);
    }

    public UnifiedOriginalQuery setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public UnifiedOriginalQuery setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
