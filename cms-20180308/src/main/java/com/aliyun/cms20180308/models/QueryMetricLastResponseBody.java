// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryMetricLastResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("Cursor")
    public String cursor;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;timestamp&quot;:1548900600000,&quot;userId&quot;:&quot;000&quot;,&quot;instanceId&quot;:&quot;abc&quot;,&quot;Minimum&quot;:6.3,&quot;Average&quot;:6.3,&quot;Maximum&quot;:6.3}]</p>
     */
    @NameInMap("Datapoints")
    public String datapoints;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <strong>example:</strong>
     * <p>021472A6-25E3-4094-8D00-BA4B6A5486C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static QueryMetricLastResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricLastResponseBody self = new QueryMetricLastResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMetricLastResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMetricLastResponseBody setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public QueryMetricLastResponseBody setDatapoints(String datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public String getDatapoints() {
        return this.datapoints;
    }

    public QueryMetricLastResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMetricLastResponseBody setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public QueryMetricLastResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMetricLastResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
