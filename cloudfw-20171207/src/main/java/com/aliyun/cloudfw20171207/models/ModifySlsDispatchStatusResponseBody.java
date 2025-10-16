// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifySlsDispatchStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CE901E31-4AE9-579D-AC37-D2F1BB43****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySlsDispatchStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySlsDispatchStatusResponseBody self = new ModifySlsDispatchStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySlsDispatchStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
