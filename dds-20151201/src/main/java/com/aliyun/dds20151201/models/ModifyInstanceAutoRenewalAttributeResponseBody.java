// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoRenewalAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EFD65226-08CC-4C4D-B6A4-CB3C382F67B0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceAutoRenewalAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoRenewalAttributeResponseBody self = new ModifyInstanceAutoRenewalAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoRenewalAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
