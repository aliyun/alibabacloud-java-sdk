// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAccessRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6299428C-3861-435D-AE54-9B330A00****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccessRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessRuleResponseBody self = new ModifyAccessRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccessRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
