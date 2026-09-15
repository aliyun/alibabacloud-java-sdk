// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DisableMaintainWindowResponseBody extends TeaModel {
    /**
     * <p>The ID of the paused silence policy.</p>
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
     * <p>0B9377D9-C56B-5C2E-A8A4-A01D6CC3F4B8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DisableMaintainWindowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableMaintainWindowResponseBody self = new DisableMaintainWindowResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableMaintainWindowResponseBody setMaintainWindowId(String maintainWindowId) {
        this.maintainWindowId = maintainWindowId;
        return this;
    }
    public String getMaintainWindowId() {
        return this.maintainWindowId;
    }

    public DisableMaintainWindowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
