// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ModifyDiskReplicaGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDiskReplicaGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskReplicaGroupResponseBody self = new ModifyDiskReplicaGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDiskReplicaGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
