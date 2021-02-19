// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeScalingActivityDetailResponseBody extends TeaModel {
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    @NameInMap("Detail")
    public String detail;

    public static DescribeScalingActivityDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingActivityDetailResponseBody self = new DescribeScalingActivityDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingActivityDetailResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    public DescribeScalingActivityDetailResponseBody setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

}
