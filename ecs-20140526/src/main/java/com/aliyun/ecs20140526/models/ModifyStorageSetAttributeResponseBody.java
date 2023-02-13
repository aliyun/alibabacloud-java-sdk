// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyStorageSetAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyStorageSetAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyStorageSetAttributeResponseBody self = new ModifyStorageSetAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyStorageSetAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
