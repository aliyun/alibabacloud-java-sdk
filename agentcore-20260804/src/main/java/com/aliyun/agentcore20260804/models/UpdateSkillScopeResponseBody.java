// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateSkillScopeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateSkillScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillScopeResponseBody self = new UpdateSkillScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSkillScopeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
