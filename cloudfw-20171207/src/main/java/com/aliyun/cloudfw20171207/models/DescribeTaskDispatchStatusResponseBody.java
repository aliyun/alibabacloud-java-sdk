// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTaskDispatchStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>71209DFE-XXX-XXX-52B4A4E9DA3B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The execution status of the task. Valid values:</p>
     * <ul>
     * <li>PENDING: pending execution.</li>
     * <li>RUNNING: running.</li>
     * <li>SUCCESS: succeeded.</li>
     * <li>FAILED: failed.</li>
     * <li>CANCELLED: cancelled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeTaskDispatchStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskDispatchStatusResponseBody self = new DescribeTaskDispatchStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTaskDispatchStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTaskDispatchStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
