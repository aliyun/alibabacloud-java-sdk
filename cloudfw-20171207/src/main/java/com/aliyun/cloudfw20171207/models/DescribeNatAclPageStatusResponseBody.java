// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatAclPageStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether pagination for access control policies for NAT firewalls is supported.</p>
     */
    @NameInMap("NatAclPageEnable")
    public Boolean natAclPageEnable;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNatAclPageStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatAclPageStatusResponseBody self = new DescribeNatAclPageStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNatAclPageStatusResponseBody setNatAclPageEnable(Boolean natAclPageEnable) {
        this.natAclPageEnable = natAclPageEnable;
        return this;
    }
    public Boolean getNatAclPageEnable() {
        return this.natAclPageEnable;
    }

    public DescribeNatAclPageStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
