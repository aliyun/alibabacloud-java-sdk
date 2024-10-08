// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallPolicyPriorUsedResponseBody extends TeaModel {
    /**
     * <p>The lowest priority for the access control policy.</p>
     * 
     * <strong>example:</strong>
     * <p>28</p>
     */
    @NameInMap("End")
    public Integer end;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BCDF3907-1011-5504-B015-CC7603C0E6B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The highest priority for the access control policy.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
