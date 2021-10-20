// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyMaintenanceActionResponseBody extends TeaModel {
    @NameInMap("Ids")
    public String ids;

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
