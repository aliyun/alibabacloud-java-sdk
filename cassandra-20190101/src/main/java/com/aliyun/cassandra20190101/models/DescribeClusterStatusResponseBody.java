// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeClusterStatusResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterStatusResponseBody self = new DescribeClusterStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeClusterStatusResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeClusterStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
