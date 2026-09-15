// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateMaintainWindowResponseBody extends TeaModel {
    /**
     * <p>The ID of the updated silence policy.</p>
     * 
     * <strong>example:</strong>
     * <p>3ff3fbd0-8a0b-4b31-9b1c-8e3f0a2c5d71</p>
     */
    @NameInMap("maintainWindowId")
    public String maintainWindowId;

    /**
     * <p>The unique ID of the request. You can use this ID for troubleshooting and ticket tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-9A629907C1F0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateMaintainWindowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMaintainWindowResponseBody self = new UpdateMaintainWindowResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMaintainWindowResponseBody setMaintainWindowId(String maintainWindowId) {
        this.maintainWindowId = maintainWindowId;
        return this;
    }
    public String getMaintainWindowId() {
        return this.maintainWindowId;
    }

    public UpdateMaintainWindowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
