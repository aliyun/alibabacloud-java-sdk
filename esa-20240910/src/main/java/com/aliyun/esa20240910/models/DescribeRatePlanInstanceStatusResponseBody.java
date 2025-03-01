// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeRatePlanInstanceStatusResponseBody extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xcdn-91fknmb80f0g***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Instance status, with possible values:</p>
     * <ul>
     * <li>running: Running</li>
     * <li>renewing: Renewing</li>
     * <li>upgrading: Upgrading</li>
     * <li>releasePrepaidService: Prepaid service released due to expiration</li>
     * <li>creating: Creating</li>
     * <li>downgrading: Downgrading</li>
     * <li>ceasePrepaidService: Prepaid service ceased upon expiration</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>Request ID.</p>
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
