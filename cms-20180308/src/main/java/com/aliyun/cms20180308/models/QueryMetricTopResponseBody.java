// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryMetricTopResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Datapoints")
    public String datapoints;

    @NameInMap("Message")
    public String message;

    @NameInMap("Period")
    public String period;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryMetricTopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricTopResponseBody self = new QueryMetricTopResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMetricTopResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMetricTopResponseBody setDatapoints(String datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public String getDatapoints() {
        return this.datapoints;
    }

    public QueryMetricTopResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMetricTopResponseBody setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public QueryMetricTopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
