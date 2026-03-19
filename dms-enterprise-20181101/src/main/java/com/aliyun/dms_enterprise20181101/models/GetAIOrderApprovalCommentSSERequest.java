// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetAIOrderApprovalCommentSSERequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>420****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <strong>example:</strong>
     * <p>48363552-225c-4c93-aeab-ea9b9d064b96</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static GetAIOrderApprovalCommentSSERequest build(java.util.Map<String, ?> map) throws Exception {
        GetAIOrderApprovalCommentSSERequest self = new GetAIOrderApprovalCommentSSERequest();
        return TeaModel.build(map, self);
    }

    public GetAIOrderApprovalCommentSSERequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetAIOrderApprovalCommentSSERequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
