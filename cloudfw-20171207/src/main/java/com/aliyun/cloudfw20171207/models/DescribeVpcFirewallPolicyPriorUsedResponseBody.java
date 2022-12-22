// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallPolicyPriorUsedResponseBody extends TeaModel {
    // The lowest priority for the access control policy.
    @NameInMap("End")
    public Integer end;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The highest priority for the access control policy.
    @NameInMap("Start")
    public Integer start;

    public static DescribeVpcFirewallPolicyPriorUsedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallPolicyPriorUsedResponseBody self = new DescribeVpcFirewallPolicyPriorUsedResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallPolicyPriorUsedResponseBody setEnd(Integer end) {
        this.end = end;
        return this;
    }
    public Integer getEnd() {
        return this.end;
    }

    public DescribeVpcFirewallPolicyPriorUsedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallPolicyPriorUsedResponseBody setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

}
