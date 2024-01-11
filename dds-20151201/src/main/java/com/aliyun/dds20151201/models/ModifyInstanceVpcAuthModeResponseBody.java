// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAuthModeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceVpcAuthModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVpcAuthModeResponseBody self = new ModifyInstanceVpcAuthModeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVpcAuthModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
