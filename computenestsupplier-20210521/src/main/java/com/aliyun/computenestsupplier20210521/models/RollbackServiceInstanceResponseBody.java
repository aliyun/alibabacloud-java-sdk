// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class RollbackServiceInstanceResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE9EF87D-46F8-5AF6-9A65-6B034E204136</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Service instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>si-5289e1d6d0c14397881d</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    /**
     * <p>The deployment status of the service instance. Possible values:</p>
     * <ul>
     * <li><p>Created: Created</p>
     * </li>
     * <li><p>Deploying: Deploying</p>
     * </li>
     * <li><p>DeployedFailed: Deployment Failed</p>
     * </li>
     * <li><p>Deployed: Deployed</p>
     * </li>
     * <li><p>Upgrading: Upgrading</p>
     * </li>
     * <li><p>UpgradeRollbacking: Rolling Back</p>
     * </li>
     * <li><p>Deleting: Deleting</p>
     * </li>
     * <li><p>Deleted: Deleted</p>
     * </li>
     * <li><p>DeletedFailed: Deletion Failed</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UpgradeRollbacking</p>
     */
    @NameInMap("Status")
    public String status;

    public static RollbackServiceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackServiceInstanceResponseBody self = new RollbackServiceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackServiceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RollbackServiceInstanceResponseBody setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public RollbackServiceInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
