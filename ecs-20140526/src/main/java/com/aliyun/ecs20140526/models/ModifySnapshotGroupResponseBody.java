// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySnapshotGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A00B5E55-76B7-42C8-8A80-AF10E980DCC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySnapshotGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySnapshotGroupResponseBody self = new ModifySnapshotGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySnapshotGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
