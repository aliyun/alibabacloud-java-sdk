// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCenterPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5CED7F18-43B1-5035-BBB6-2538B***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCenterPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCenterPolicyResponseBody self = new ModifyCenterPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCenterPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
