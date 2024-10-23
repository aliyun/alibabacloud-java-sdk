// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyAutoRenewAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4CE6DF97-AEA4-484F-906F-C407EE3770EB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAutoRenewAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoRenewAttributeResponseBody self = new ModifyAutoRenewAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAutoRenewAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
