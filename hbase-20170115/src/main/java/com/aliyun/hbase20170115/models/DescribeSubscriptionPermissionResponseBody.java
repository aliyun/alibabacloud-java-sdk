// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionPermissionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static DescribeSubscriptionPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionPermissionResponseBody self = new DescribeSubscriptionPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSubscriptionPermissionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
