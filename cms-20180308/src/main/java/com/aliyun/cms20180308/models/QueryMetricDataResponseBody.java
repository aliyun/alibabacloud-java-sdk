// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryMetricDataResponseBody extends TeaModel {
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

    public static QueryMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricDataResponseBody self = new QueryMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMetricDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMetricDataResponseBody setDatapoints(String datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public String getDatapoints() {
        return this.datapoints;
    }

    public QueryMetricDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMetricDataResponseBody setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public QueryMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
