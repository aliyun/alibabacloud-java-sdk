// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyPolicyGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>552B7EED-D434-511F-B838-29EA4E906034</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPolicyGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyGroupResponseBody self = new ModifyPolicyGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
