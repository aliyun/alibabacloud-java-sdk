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
     * <li>running: Running.</li>
     * <li>renewing: Being renewed.</li>
     * <li>upgrading: Being upgraded.</li>
     * <li>releasePrepaidService: Released due to prepaid expiration.</li>
     * <li>creating: Being created.</li>
     * <li>downgrading: Being downgraded.</li>
     * <li>ceasePrepaidService: Suspended due to prepaid expiration.</li>
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
