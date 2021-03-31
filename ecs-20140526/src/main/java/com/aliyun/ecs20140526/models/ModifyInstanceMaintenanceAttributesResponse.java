// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceMaintenanceAttributesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyInstanceMaintenanceAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMaintenanceAttributesResponse self = new ModifyInstanceMaintenanceAttributesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMaintenanceAttributesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
