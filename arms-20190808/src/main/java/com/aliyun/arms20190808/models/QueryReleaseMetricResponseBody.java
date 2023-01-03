// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryReleaseMetricResponseBody extends TeaModel {
    // The returned metric data.
    @NameInMap("Data")
    public String data;

    // The ID of the request.
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
