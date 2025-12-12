// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterStatusSetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DE309AA1-BD83-5E1F-9945-8A4D336E0829</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StatusSet")
    public java.util.List<String> statusSet;

    public static DescribeDBClusterStatusSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterStatusSetResponseBody self = new DescribeDBClusterStatusSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterStatusSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterStatusSetResponseBody setStatusSet(java.util.List<String> statusSet) {
        this.statusSet = statusSet;
        return this;
    }
    public java.util.List<String> getStatusSet() {
        return this.statusSet;
    }

}
