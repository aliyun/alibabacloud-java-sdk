// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyDBClusterDescriptionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>17F57FEE-EA4F-4337-8D2E-9C23CAA63D74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterDescriptionResponseBody self = new ModifyDBClusterDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
