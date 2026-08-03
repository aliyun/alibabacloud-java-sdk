// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class StopLifecyclePolicyExecutionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * <p>A request ID is returned regardless of whether the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The request status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static StopLifecyclePolicyExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopLifecyclePolicyExecutionResponseBody self = new StopLifecyclePolicyExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public StopLifecyclePolicyExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopLifecyclePolicyExecutionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
