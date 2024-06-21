// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ModifyPolicyContentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3777EF25-940B-51F4-BB1D-99B5********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPolicyContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyContentResponseBody self = new ModifyPolicyContentResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
