// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class RevokeSchemaPermissionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("data")
    public Boolean data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>819A7F0F-2951-540F-BD94-6A41ECF0281F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RevokeSchemaPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeSchemaPermissionResponseBody self = new RevokeSchemaPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeSchemaPermissionResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public RevokeSchemaPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
