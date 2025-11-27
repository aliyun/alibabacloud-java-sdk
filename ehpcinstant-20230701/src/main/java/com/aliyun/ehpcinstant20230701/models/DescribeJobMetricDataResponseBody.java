// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DescribeJobMetricDataResponseBody extends TeaModel {
    /**
     * <p>Monitoring statistics points.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;timestamp&quot;:1709540685000,&quot;Minimum&quot;:28.45,&quot;Maximum&quot;:28.45,&quot;Average&quot;:28.45}]</p>
     */
    @NameInMap("DataPoints")
    public String dataPoints;

    /**
     * <p>The statistical period of the monitoring data. Valid values: 15, 60, 900, and 3600. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
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
