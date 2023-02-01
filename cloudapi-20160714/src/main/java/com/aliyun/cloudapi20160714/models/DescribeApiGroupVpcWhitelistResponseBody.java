// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiGroupVpcWhitelistResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the VPC.</p>
     */
    @NameInMap("VpcIds")
    public String vpcIds;

    public static DescribeApiGroupVpcWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupVpcWhitelistResponseBody self = new DescribeApiGroupVpcWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupVpcWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiGroupVpcWhitelistResponseBody setVpcIds(String vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }
    public String getVpcIds() {
        return this.vpcIds;
    }

}
