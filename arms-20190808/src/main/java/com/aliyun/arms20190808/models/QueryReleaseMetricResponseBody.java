// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryReleaseMetricResponseBody extends TeaModel {
    /**
     * <p>The returned metric data.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryReleaseMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryReleaseMetricResponseBody self = new QueryReleaseMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryReleaseMetricResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryReleaseMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
