// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteApplicationScalingRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApplicationScalingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationScalingRuleResponseBody self = new DeleteApplicationScalingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationScalingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
