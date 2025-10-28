// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteApplicationScalingRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5d6fa0bc-cc3**********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApplicationScalingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationScalingRuleResponseBody self = new DeleteApplicationScalingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationScalingRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteApplicationScalingRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteApplicationScalingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
