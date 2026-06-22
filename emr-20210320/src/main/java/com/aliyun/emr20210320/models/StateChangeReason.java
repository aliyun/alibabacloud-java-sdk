// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class StateChangeReason extends TeaModel {
    /**
     * <p>The status code. Possible values:</p>
     * <ul>
     * <li><p>UserRequest: The state change was initiated by the user.</p>
     * </li>
     * <li><p>QuotaExceeded: A service or resource quota was exceeded.</p>
     * </li>
     * <li><p>InternalError: An internal error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MissingParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>A message providing additional details about the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>The instance type is required.</p>
     */
    @NameInMap("Message")
    public String message;

    public static StateChangeReason build(java.util.Map<String, ?> map) throws Exception {
        StateChangeReason self = new StateChangeReason();
        return TeaModel.build(map, self);
    }

    public StateChangeReason setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StateChangeReason setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
