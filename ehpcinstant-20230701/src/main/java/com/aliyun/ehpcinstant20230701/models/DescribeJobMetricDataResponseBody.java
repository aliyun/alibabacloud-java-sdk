// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DescribeJobMetricDataResponseBody extends TeaModel {
    @NameInMap("DataPoints")
    public String dataPoints;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeJobMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobMetricDataResponseBody self = new DescribeJobMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJobMetricDataResponseBody setDataPoints(String dataPoints) {
        this.dataPoints = dataPoints;
        return this;
    }
    public String getDataPoints() {
        return this.dataPoints;
    }

    public DescribeJobMetricDataResponseBody setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeJobMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
