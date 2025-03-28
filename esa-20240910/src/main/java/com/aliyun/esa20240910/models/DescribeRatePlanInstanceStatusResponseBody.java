// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeRatePlanInstanceStatusResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xcdn-91fknmb80f0g***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li>running: The instance is running.</li>
     * <li>renewing: The instance is being renewed.</li>
     * <li>upgrading: The configuration of the instance is being upgraded.</li>
     * <li>releasePrepaidService: The instance is released due to expiration.</li>
     * <li>creating: The instance is being created.</li>
     * <li>downgrading: The configuration of the instance is being downgraded.</li>
     * <li>ceasePrepaidService: The instance has expired.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>60423A7F-A83D-1E24-B80E-86DD25790759</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRatePlanInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRatePlanInstanceStatusResponseBody self = new DescribeRatePlanInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRatePlanInstanceStatusResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRatePlanInstanceStatusResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public DescribeRatePlanInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
