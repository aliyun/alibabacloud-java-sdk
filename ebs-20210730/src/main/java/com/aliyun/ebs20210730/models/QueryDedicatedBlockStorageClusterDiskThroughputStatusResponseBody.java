// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class QueryDedicatedBlockStorageClusterDiskThroughputStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the throughput after setting the throughput by SetDedicatedBlockStorageClusterDiskThroughput api.</p>
     * <br>
     * <p>- SUCCESS: The throughput has been successfully set.</p>
     * <p>- RUNNING: The throughput is currently being set.</p>
     * <p>- WAIT(): The throughput is waiting to be set.</p>
     * <p>- FAIL(): The throughput setting has failed.</p>
     */
    @NameInMap("Status")
    public String status;

    public static QueryDedicatedBlockStorageClusterDiskThroughputStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDedicatedBlockStorageClusterDiskThroughputStatusResponseBody self = new QueryDedicatedBlockStorageClusterDiskThroughputStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDedicatedBlockStorageClusterDiskThroughputStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDedicatedBlockStorageClusterDiskThroughputStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
