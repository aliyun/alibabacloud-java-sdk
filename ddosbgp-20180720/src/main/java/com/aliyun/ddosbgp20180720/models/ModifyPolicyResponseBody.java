// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ModifyPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B4B379C2-9319-4C6B-B579-FE36831****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyResponseBody self = new ModifyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
