// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiGroupVpcWhitelistResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ016</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp11w979o2s9rcr962w25</p>
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
