// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateMaintainWindowResponseBody extends TeaModel {
    /**
     * <p>The ID of the created silence policy.</p>
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

    public static CreateMaintainWindowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMaintainWindowResponseBody self = new CreateMaintainWindowResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMaintainWindowResponseBody setMaintainWindowId(String maintainWindowId) {
        this.maintainWindowId = maintainWindowId;
        return this;
    }
    public String getMaintainWindowId() {
        return this.maintainWindowId;
    }

    public CreateMaintainWindowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
