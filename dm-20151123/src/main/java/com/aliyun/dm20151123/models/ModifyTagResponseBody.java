// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ModifyTagResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTagResponseBody self = new ModifyTagResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
