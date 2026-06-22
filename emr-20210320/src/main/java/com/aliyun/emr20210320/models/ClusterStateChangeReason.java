// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ClusterStateChangeReason extends TeaModel {
    /**
     * <p>The status code for the state change. Valid values:</p>
     * <ul>
     * <li><p>UserRequest: A user request triggered the state change.</p>
     * </li>
     * <li><p>OutOfStock: The requested ECS instance type is out of stock.</p>
     * </li>
     * <li><p>NotAuthorized: The operation was denied due to insufficient permission.</p>
     * </li>
     * <li><p>QuotaExceeded: The request exceeded a service quota.</p>
     * </li>
     * <li><p>OperationDenied: The operation was denied.</p>
     * </li>
     * <li><p>AccountException: An account-related exception occurred.</p>
     * </li>
     * <li><p>NodeFailure: An ECS node failed.</p>
     * </li>
     * <li><p>BootstrapFailure: A bootstrap action failed.</p>
     * </li>
     * <li><p>ValidationFail: The request failed business logic validation.</p>
     * </li>
     * <li><p>ServiceFailure: A dependent service failed.</p>
     * </li>
     * <li><p>InternalError: An internal error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OutOfStock</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>A human-readable message detailing the cluster state change.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource is sold out in the specified zone, try other types of resources or other regions and zones.</p>
     */
    @NameInMap("Message")
    public String message;

    public static ClusterStateChangeReason build(java.util.Map<String, ?> map) throws Exception {
        ClusterStateChangeReason self = new ClusterStateChangeReason();
        return TeaModel.build(map, self);
    }

    public ClusterStateChangeReason setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClusterStateChangeReason setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
