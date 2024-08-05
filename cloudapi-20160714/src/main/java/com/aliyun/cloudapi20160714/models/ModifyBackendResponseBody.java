// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyBackendResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>06DACA61-9359-5EC6-AEDA-C73E620E49A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBackendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackendResponseBody self = new ModifyBackendResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBackendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
