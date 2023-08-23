// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallPolicyPriorUsedResponseBody extends TeaModel {
    @NameInMap("End")
    public Integer end;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Start")
    public Integer start;

    public static DescribeNatFirewallPolicyPriorUsedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallPolicyPriorUsedResponseBody self = new DescribeNatFirewallPolicyPriorUsedResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallPolicyPriorUsedResponseBody setEnd(Integer end) {
        this.end = end;
        return this;
    }
    public Integer getEnd() {
        return this.end;
    }

    public DescribeNatFirewallPolicyPriorUsedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNatFirewallPolicyPriorUsedResponseBody setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

}
