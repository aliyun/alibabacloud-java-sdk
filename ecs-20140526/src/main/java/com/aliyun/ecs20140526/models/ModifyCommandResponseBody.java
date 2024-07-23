// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyCommandResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0DE9B41E-EF0D-40A0-BB43-37749C5BDA9C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommandResponseBody self = new ModifyCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
