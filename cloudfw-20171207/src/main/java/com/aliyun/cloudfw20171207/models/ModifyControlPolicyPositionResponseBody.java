// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyControlPolicyPositionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyControlPolicyPositionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyControlPolicyPositionResponseBody self = new ModifyControlPolicyPositionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyControlPolicyPositionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
