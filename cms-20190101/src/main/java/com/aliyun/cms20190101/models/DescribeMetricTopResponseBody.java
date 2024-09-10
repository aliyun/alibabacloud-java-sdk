// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricTopResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The monitoring data.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;order\&quot;:1,\&quot;timestamp\&quot;:1620287520000,\&quot;userId\&quot;:\&quot;120886317861****\&quot;,\&quot;instanceId\&quot;:\&quot;i-j6ccf7d5fn335qpo****\&quot;,\&quot;Average\&quot;:99.92,\&quot;Minimum\&quot;:99.5,\&quot;Maximum\&quot;:100.0,\&quot;_count\&quot;:1.0},{\&quot;order\&quot;:2,\&quot;timestamp\&quot;:1620287520000,\&quot;userId\&quot;:\&quot;120886317861****\&quot;,\&quot;instanceId\&quot;:\&quot;i-0xii2bvf42iqvxbp****\&quot;,\&quot;Average\&quot;:99.91,\&quot;Minimum\&quot;:99.0,\&quot;Maximum\&quot;:100.0,\&quot;_count\&quot;:1.0}]</p>
     */
    @NameInMap("Datapoints")
    public String datapoints;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified resource is not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The statistical period of the monitoring data. Unit: seconds. Valid values: 15, 60, 900, and 3600.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3121AE7D-4AFF-4C25-8F1D-C8226EBB1F42</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMetricTopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricTopResponseBody self = new DescribeMetricTopResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricTopResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMetricTopResponseBody setDatapoints(String datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public String getDatapoints() {
        return this.datapoints;
    }

    public DescribeMetricTopResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMetricTopResponseBody setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeMetricTopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
