// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayFirstFrameDurationMetricDataRequest extends TeaModel {
    @NameInMap("BeginTs")
    public String beginTs;

    @NameInMap("EndTs")
    public String endTs;

    @NameInMap("TraceId")
    public String traceId;

    public static DescribePlayFirstFrameDurationMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayFirstFrameDurationMetricDataRequest self = new DescribePlayFirstFrameDurationMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlayFirstFrameDurationMetricDataRequest setBeginTs(String beginTs) {
        this.beginTs = beginTs;
        return this;
    }
    public String getBeginTs() {
        return this.beginTs;
    }

    public DescribePlayFirstFrameDurationMetricDataRequest setEndTs(String endTs) {
        this.endTs = endTs;
        return this;
    }
    public String getEndTs() {
        return this.endTs;
    }

    public DescribePlayFirstFrameDurationMetricDataRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
