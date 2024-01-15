// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeImagePermissionResponseBody extends TeaModel {
    /**
     * <p>The IDs of the recipient Alibaba Cloud accounts. You can share an image with up to 50 Alibaba Cloud accounts.</p>
     */
    @NameInMap("AliUids")
    public java.util.List<String> aliUids;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImagePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagePermissionResponseBody self = new DescribeImagePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImagePermissionResponseBody setAliUids(java.util.List<String> aliUids) {
        this.aliUids = aliUids;
        return this;
    }
    public java.util.List<String> getAliUids() {
        return this.aliUids;
    }

    public DescribeImagePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
