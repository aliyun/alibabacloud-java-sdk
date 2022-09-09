// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingActivityDetailResponseBody extends TeaModel {
    @NameInMap("Detail")
    public String detail;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    public static DescribeScalingActivityDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingActivityDetailResponseBody self = new DescribeScalingActivityDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingActivityDetailResponseBody setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public DescribeScalingActivityDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingActivityDetailResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

}
