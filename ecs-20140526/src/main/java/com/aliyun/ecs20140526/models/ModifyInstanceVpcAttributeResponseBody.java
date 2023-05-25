// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceVpcAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVpcAttributeResponseBody self = new ModifyInstanceVpcAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVpcAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
