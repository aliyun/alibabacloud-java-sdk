// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyStorageSetAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73369</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyStorageSetAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyStorageSetAttributeResponseBody self = new ModifyStorageSetAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyStorageSetAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
