// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DisableMaintainWindowResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123-12-312-31-23123</p>
     */
    @NameInMap("maintainWindowId")
    public String maintainWindowId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>123123-3213-345-9941-345345345</p>
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
