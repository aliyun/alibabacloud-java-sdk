// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class OperationStateChangeReason extends TeaModel {
    /**
     * <p>The operation status code. Valid values:</p>
     * <ul>
     * <li><p><code>UserRequest</code>: The operation was initiated by a user.</p>
     * </li>
     * <li><p><code>OutOfStock</code>: The requested ECS instance type is out of stock.</p>
     * </li>
     * <li><p><code>NotAuthorized</code>: You are not authorized to perform the operation.</p>
     * </li>
     * <li><p><code>QuotaExceeded</code>: A resource quota was exceeded.</p>
     * </li>
     * <li><p><code>OperationDenied</code>: The operation was denied.</p>
     * </li>
     * <li><p><code>AccountException</code>: An account exception occurred.</p>
     * </li>
     * <li><p><code>NodeFailure</code>: An ECS node failed.</p>
     * </li>
     * <li><p><code>BootstrapFailure</code>: A bootstrap action failed.</p>
     * </li>
     * <li><p><code>ValidationFail</code>: The business logic validation failed.</p>
     * </li>
     * <li><p><code>ServiceFailure</code>: A dependent service failed.</p>
     * </li>
     * <li><p><code>InternalError</code>: An internal error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OutOfStock</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>A human-readable message that provides details about the state change.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource is sold out in the specified zone, try other types of resources or other regions and zones.</p>
     */
    @NameInMap("Message")
    public String message;

    public static OperationStateChangeReason build(java.util.Map<String, ?> map) throws Exception {
        OperationStateChangeReason self = new OperationStateChangeReason();
        return TeaModel.build(map, self);
    }

    public OperationStateChangeReason setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OperationStateChangeReason setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
