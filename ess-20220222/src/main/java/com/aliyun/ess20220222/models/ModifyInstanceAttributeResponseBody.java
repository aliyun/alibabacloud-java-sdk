// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAttributeResponseBody self = new ModifyInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
