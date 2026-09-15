// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EnableMaintainWindowResponseBody extends TeaModel {
    /**
     * <p>The ID of the enabled silence policy.</p>
     * 
     * <strong>example:</strong>
     * <p>3ff3fbd0-8a0b-4b31-9b1c-8e3f0a2c5d71</p>
     */
    @NameInMap("maintainWindowId")
    public String maintainWindowId;

    /**
     * <p>The unique ID of the request. You can use this ID for troubleshooting and ticket diagnostics.</p>
     * 
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-9A629907C1F0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static EnableMaintainWindowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableMaintainWindowResponseBody self = new EnableMaintainWindowResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableMaintainWindowResponseBody setMaintainWindowId(String maintainWindowId) {
        this.maintainWindowId = maintainWindowId;
        return this;
    }
    public String getMaintainWindowId() {
        return this.maintainWindowId;
    }

    public EnableMaintainWindowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
