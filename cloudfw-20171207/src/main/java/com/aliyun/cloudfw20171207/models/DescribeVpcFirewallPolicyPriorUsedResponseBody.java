// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallPolicyPriorUsedResponseBody extends TeaModel {
    /**
     * <p>The lowest priority for the access control policy.</p>
     */
    @NameInMap("End")
    public Integer end;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The highest priority for the access control policy.</p>
     */
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
