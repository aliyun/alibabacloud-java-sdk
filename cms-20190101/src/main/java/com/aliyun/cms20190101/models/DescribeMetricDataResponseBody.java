// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricDataResponseBody extends TeaModel {
    /**
     * <p>The monitoring data. The value includes the following fields:</p>
     * <br>
     * <p>*   `timestamp`: the timestamp when the alert was triggered.</p>
     * <p>*   `userId`: the ID of the user for which the alert was triggered.</p>
     * <p>*   `instanceId`: the ID of the instance for which the alert was triggered.</p>
     * <p>*   `Minimum`, `Average`, and `Maximum`: the aggregation methods.</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Datapoints")
    public String datapoints;

    /**
     * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Period")
    public String period;

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
