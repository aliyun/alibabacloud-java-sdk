// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class DescribeScalingActivityDetailResponseBody extends TeaModel {
    @NameInMap("Detail")
    public String detail;

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

    public DescribeScalingActivityDetailResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

}
