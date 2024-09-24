// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatAclPageStatusResponseBody extends TeaModel {
    /**
     * <p>Extra error information.</p>
     * 
     * <strong>example:</strong>
     * <p>proxy_not_exist</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <p>Indicates whether pagination for access control policies for NAT firewalls is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("NatAclPageEnable")
    public Boolean natAclPageEnable;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B97F9AD7-A2DB-5F8F-9206-DF89DE0AC9E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNatAclPageStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatAclPageStatusResponseBody self = new DescribeNatAclPageStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNatAclPageStatusResponseBody setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
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
