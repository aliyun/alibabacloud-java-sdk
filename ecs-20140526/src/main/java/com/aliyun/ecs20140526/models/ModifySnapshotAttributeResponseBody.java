// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySnapshotAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySnapshotAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySnapshotAttributeResponseBody self = new ModifySnapshotAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySnapshotAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
