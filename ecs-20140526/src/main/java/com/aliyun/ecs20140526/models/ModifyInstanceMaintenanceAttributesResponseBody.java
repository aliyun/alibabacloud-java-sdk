// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceMaintenanceAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceMaintenanceAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMaintenanceAttributesResponseBody self = new ModifyInstanceMaintenanceAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMaintenanceAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
