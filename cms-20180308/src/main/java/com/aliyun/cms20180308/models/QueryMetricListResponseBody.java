// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryMetricListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Cursor")
    public String cursor;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;timestamp&quot;:1548777660000,&quot;userId&quot;:&quot;123&quot;,&quot;instanceId&quot;:&quot;i-abc&quot;,&quot;Minimum&quot;:9.92,&quot;Average&quot;:9.92,&quot;Maximum&quot;:9.92}]</p>
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
     * <p>3121AE7D-4AFF-4C25-8F1D-C8226EBB1F42</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static QueryMetricListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricListResponseBody self = new QueryMetricListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMetricListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMetricListResponseBody setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public QueryMetricListResponseBody setDatapoints(String datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public String getDatapoints() {
        return this.datapoints;
    }

    public QueryMetricListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMetricListResponseBody setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public QueryMetricListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMetricListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
