// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySnapshotAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifySnapshotAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySnapshotAttributeResponse self = new ModifySnapshotAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifySnapshotAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
