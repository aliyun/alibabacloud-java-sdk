// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ValidateShrinkNodesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned results:</p>
     * <br>
     * <p>*   true: can be scaled in</p>
     * <p>*   false: cannot be scaled in.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static ValidateShrinkNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateShrinkNodesResponseBody self = new ValidateShrinkNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateShrinkNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateShrinkNodesResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
