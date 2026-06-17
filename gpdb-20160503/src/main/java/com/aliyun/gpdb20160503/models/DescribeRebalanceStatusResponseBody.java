// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeRebalanceStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9C6122AD-2FCC-50B3-873A-37B68775****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The rebalance status of the instance. Valid values: Balanced and Imbalanced.</p>
     * 
     * <strong>example:</strong>
     * <p>Balanced</p>
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
