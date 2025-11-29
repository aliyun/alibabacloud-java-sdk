// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeRebalanceStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7F5B5023-94EA-5D5D-AB72-B7B356BA****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The rebalance status of the instance. Valid values: Balanced and Imbalanced.</p>
     * 
     * <strong>example:</strong>
     * <p>Init</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeRebalanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRebalanceStatusResponseBody self = new DescribeRebalanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRebalanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRebalanceStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
