// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyMaintenanceActionResponseBody extends TeaModel {
    /**
     * <p>The O\&M event ID.</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMaintenanceActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaintenanceActionResponseBody self = new ModifyMaintenanceActionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMaintenanceActionResponseBody setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ModifyMaintenanceActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
