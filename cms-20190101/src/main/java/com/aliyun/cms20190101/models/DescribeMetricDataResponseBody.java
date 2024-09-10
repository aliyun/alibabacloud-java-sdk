// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricDataResponseBody extends TeaModel {
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
     * <p>The monitoring data. The value includes the following fields:</p>
     * <ul>
     * <li><code>timestamp</code>: the time when the alert was triggered.</li>
     * <li><code>userId</code>: the ID of the user for which the alert was triggered.</li>
     * <li><code>instanceId</code>: the ID of the instance for which the alert was triggered.</li>
     * <li><code>Minimum</code>, <code>Average</code>, and <code>Maximum</code>: the aggregation methods.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;timestamp\&quot;:1618368900000,\&quot;Average\&quot;:95.8291666666667,\&quot;Minimum\&quot;:65.48,\&quot;Maximum\&quot;:100.0},{\&quot;timestamp\&quot;:1618368960000,\&quot;Average\&quot;:95.8683333333333,\&quot;Minimum\&quot;:67.84,\&quot;Maximum\&quot;:100.0}]</p>
     */
    @NameInMap("Datapoints")
    public String datapoints;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified resource is not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The statistical period of the monitoring data.</p>
     * <p>Valid values: 15, 60, 900, and 3600.</p>
     * <p>Unit: seconds.</p>
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
     * <p>6A5F022D-AC7C-460E-94AE-B9E75083D027</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricDataResponseBody self = new DescribeMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMetricDataResponseBody setDatapoints(String datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public String getDatapoints() {
        return this.datapoints;
    }

    public DescribeMetricDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMetricDataResponseBody setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
