// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricLastResponseBody extends TeaModel {
    /**
     * <p>Queries the latest monitoring data of a metric.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
     */
    @NameInMap("Datapoints")
    public String datapoints;

    @NameInMap("Message")
    public String message;

    /**
     * <p>The interval at which the monitoring data is queried.</p>
     * <br>
     * <p>Unit: seconds.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Period")
    public String period;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The monitoring data.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeMetricLastResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricLastResponseBody self = new DescribeMetricLastResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricLastResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMetricLastResponseBody setDatapoints(String datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public String getDatapoints() {
        return this.datapoints;
    }

    public DescribeMetricLastResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMetricLastResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeMetricLastResponseBody setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeMetricLastResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetricLastResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
