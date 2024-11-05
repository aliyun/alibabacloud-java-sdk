// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GenericSearchRequest extends TeaModel {
    @NameInMap("query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>OneWeek</p>
     */
    @NameInMap("timeRange")
    public String timeRange;

    public static GenericSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        GenericSearchRequest self = new GenericSearchRequest();
        return TeaModel.build(map, self);
    }

    public GenericSearchRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GenericSearchRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
