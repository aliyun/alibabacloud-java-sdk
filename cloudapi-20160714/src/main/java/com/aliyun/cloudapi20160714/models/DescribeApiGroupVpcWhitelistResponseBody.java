// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiGroupVpcWhitelistResponseBody extends TeaModel {
    @NameInMap("VpcIds")
    public String vpcIds;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApiGroupVpcWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupVpcWhitelistResponseBody self = new DescribeApiGroupVpcWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupVpcWhitelistResponseBody setVpcIds(String vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }
    public String getVpcIds() {
        return this.vpcIds;
    }

    public DescribeApiGroupVpcWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
