// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyStorageCapacityUnitAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyStorageCapacityUnitAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyStorageCapacityUnitAttributeResponse self = new ModifyStorageCapacityUnitAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyStorageCapacityUnitAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
