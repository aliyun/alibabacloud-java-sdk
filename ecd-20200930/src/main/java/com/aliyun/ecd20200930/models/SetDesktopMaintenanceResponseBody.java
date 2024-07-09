// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopMaintenanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BA6A1853-3EA9-5EEB-86C8-3D14A3E01905</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetDesktopMaintenanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDesktopMaintenanceResponseBody self = new SetDesktopMaintenanceResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDesktopMaintenanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
