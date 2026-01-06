// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyAutoRenewalAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>421794A3-72A5-5D27-9E8B-A75A4C503E17</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAutoRenewalAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoRenewalAttributeResponseBody self = new ModifyAutoRenewalAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAutoRenewalAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
