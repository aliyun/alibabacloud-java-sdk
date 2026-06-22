// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class NodeGroupStateChangeReason extends TeaModel {
    /**
     * <p>The status code for the state change. Valid values include:</p>
     * <ul>
     * <li><p><code>UserRequest</code>: A user request triggered the change.</p>
     * </li>
     * <li><p><code>OutOfStock</code>: The requested ECS instance type is out of stock.</p>
     * </li>
     * <li><p><code>NotAuthorized</code>: The request lacks the required permissions.</p>
     * </li>
     * <li><p><code>QuotaExceeded</code>: The request exceeds the resource quota.</p>
     * </li>
     * <li><p><code>OperationDenied</code>: The system denied the operation.</p>
     * </li>
     * <li><p><code>AccountException</code>: An account exception occurred.</p>
     * </li>
     * <li><p><code>NodeFailure</code>: An ECS node failed.</p>
     * </li>
     * <li><p><code>BootstrapFailure</code>: The bootstrap process failed.</p>
     * </li>
     * <li><p><code>ValidationFail</code>: The request parameters failed validation.</p>
     * </li>
     * <li><p><code>ServiceFailure</code>: A dependent service failed.</p>
     * </li>
     * <li><p><code>InternalError</code>: An unexpected internal error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UserRequest</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>A human-readable message that provides details about the state change.</p>
     * 
     * <strong>example:</strong>
     * <p>The instance type is required.</p>
     */
    @NameInMap("Message")
    public String message;

    public static NodeGroupStateChangeReason build(java.util.Map<String, ?> map) throws Exception {
        NodeGroupStateChangeReason self = new NodeGroupStateChangeReason();
        return TeaModel.build(map, self);
    }

    public NodeGroupStateChangeReason setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public NodeGroupStateChangeReason setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
