// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The status of the instance. Valid values:</p>
     * <br>
     * <p>*   **1**: normal</p>
     * <p>*   **2**: expired</p>
     * <p>*   **3**: overdue</p>
     * <p>*   **4**: released</p>
     */
    @NameInMap("InstanceStatus")
    public Integer instanceStatus;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStatusResponseBody self = new DescribeInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStatusResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceStatusResponseBody setInstanceStatus(Integer instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public Integer getInstanceStatus() {
        return this.instanceStatus;
    }

    public DescribeInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
