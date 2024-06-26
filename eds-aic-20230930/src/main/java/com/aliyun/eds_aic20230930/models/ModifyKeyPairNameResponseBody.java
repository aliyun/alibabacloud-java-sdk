// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyKeyPairNameResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>69BCBBE4-FCF2-59B8-AD9D-531EB422****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyKeyPairNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyKeyPairNameResponseBody self = new ModifyKeyPairNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyKeyPairNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
