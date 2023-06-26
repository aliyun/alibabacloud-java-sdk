// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateDiskReplicaGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the replication pair-consistent group.</p>
     */
    @NameInMap("ReplicaGroupId")
    public String replicaGroupId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDiskReplicaGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskReplicaGroupResponseBody self = new CreateDiskReplicaGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDiskReplicaGroupResponseBody setReplicaGroupId(String replicaGroupId) {
        this.replicaGroupId = replicaGroupId;
        return this;
    }
    public String getReplicaGroupId() {
        return this.replicaGroupId;
    }

    public CreateDiskReplicaGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
