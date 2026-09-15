// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteMaintainWindowResponseBody extends TeaModel {
    /**
     * <p>The ID of the deleted silence policy.</p>
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
     * <p>8FDE2569-626B-5176-9844-28877A0D1C36</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteMaintainWindowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaintainWindowResponseBody self = new DeleteMaintainWindowResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMaintainWindowResponseBody setMaintainWindowId(String maintainWindowId) {
        this.maintainWindowId = maintainWindowId;
        return this;
    }
    public String getMaintainWindowId() {
        return this.maintainWindowId;
    }

    public DeleteMaintainWindowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
