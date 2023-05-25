// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoRenewAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceAutoRenewAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoRenewAttributeResponseBody self = new ModifyInstanceAutoRenewAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoRenewAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
