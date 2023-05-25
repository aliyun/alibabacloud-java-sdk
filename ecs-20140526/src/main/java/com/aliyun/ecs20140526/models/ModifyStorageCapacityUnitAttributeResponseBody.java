// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyStorageCapacityUnitAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyStorageCapacityUnitAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyStorageCapacityUnitAttributeResponseBody self = new ModifyStorageCapacityUnitAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyStorageCapacityUnitAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
