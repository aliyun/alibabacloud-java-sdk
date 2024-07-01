// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDBClusterStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEAU</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried cluster states.</p>
     */
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
