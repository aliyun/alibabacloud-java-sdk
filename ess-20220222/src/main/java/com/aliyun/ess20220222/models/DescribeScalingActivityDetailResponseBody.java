// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingActivityDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the scaling activity. If the status of the scaling activity is Rejected, no result is displayed.</p>
     * 
     * <strong>example:</strong>
     * <p>new ECS instances \&quot;i-bp16t2cgmiiymeqv****\&quot; are created.</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B13527BF-1FBD-4334-A512-20F5E9D3FB4D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the scaling activity.</p>
     * 
     * <strong>example:</strong>
     * <p>asa-bp1c9djwrgxjyk31****</p>
     */
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
