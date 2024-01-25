// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ModifyAnycastEipAddressSpecResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAnycastEipAddressSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAnycastEipAddressSpecResponseBody self = new ModifyAnycastEipAddressSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAnycastEipAddressSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
