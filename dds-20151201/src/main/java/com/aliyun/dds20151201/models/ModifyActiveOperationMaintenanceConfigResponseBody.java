// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationMaintenanceConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D8F1D721-6439-4257-A89C-F1E8E9C9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyActiveOperationMaintenanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationMaintenanceConfigResponseBody self = new ModifyActiveOperationMaintenanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationMaintenanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
