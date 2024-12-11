// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyCompactionServiceSwitchResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>21ABF219-10E0-571B-94B8-9C9AE5022BF8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCompactionServiceSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCompactionServiceSwitchResponseBody self = new ModifyCompactionServiceSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCompactionServiceSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
