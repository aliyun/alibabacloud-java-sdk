// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySnapshotGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifySnapshotGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySnapshotGroupResponse self = new ModifySnapshotGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifySnapshotGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
