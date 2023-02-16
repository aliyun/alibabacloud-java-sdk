// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public java.util.List<String> status;

    public static DescribeDBClusterStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterStatusResponseBody self = new DescribeDBClusterStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterStatusResponseBody setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

}
