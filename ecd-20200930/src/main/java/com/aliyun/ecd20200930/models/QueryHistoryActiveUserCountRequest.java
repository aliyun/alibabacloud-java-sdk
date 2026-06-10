// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryHistoryActiveUserCountRequest extends TeaModel {
    /**
     * <p>The date for which to query data, in YYYY-MM-DD format. Default: the previous day (T-1).</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01</p>
     */
    @NameInMap("DataDate")
    public String dataDate;

    public static QueryHistoryActiveUserCountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHistoryActiveUserCountRequest self = new QueryHistoryActiveUserCountRequest();
        return TeaModel.build(map, self);
    }

    public QueryHistoryActiveUserCountRequest setDataDate(String dataDate) {
        this.dataDate = dataDate;
        return this;
    }
    public String getDataDate() {
        return this.dataDate;
    }

}
