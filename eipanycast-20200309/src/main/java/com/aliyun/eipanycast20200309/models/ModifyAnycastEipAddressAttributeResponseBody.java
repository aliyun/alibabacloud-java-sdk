// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ModifyAnycastEipAddressAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAnycastEipAddressAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAnycastEipAddressAttributeResponseBody self = new ModifyAnycastEipAddressAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAnycastEipAddressAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
