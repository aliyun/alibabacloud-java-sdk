// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyStorageSetAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyStorageSetAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyStorageSetAttributeResponse self = new ModifyStorageSetAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyStorageSetAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
