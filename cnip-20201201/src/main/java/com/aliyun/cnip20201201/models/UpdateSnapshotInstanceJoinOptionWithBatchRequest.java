// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateSnapshotInstanceJoinOptionWithBatchRequest extends TeaModel {
    @NameInMap("instanceUIDs")
    public String instanceUIDs;

    @NameInMap("joinSnapshot")
    public Boolean joinSnapshot;

    @NameInMap("rootPassword")
    public String rootPassword;

    public static UpdateSnapshotInstanceJoinOptionWithBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSnapshotInstanceJoinOptionWithBatchRequest self = new UpdateSnapshotInstanceJoinOptionWithBatchRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSnapshotInstanceJoinOptionWithBatchRequest setInstanceUIDs(String instanceUIDs) {
        this.instanceUIDs = instanceUIDs;
        return this;
    }
    public String getInstanceUIDs() {
        return this.instanceUIDs;
    }

    public UpdateSnapshotInstanceJoinOptionWithBatchRequest setJoinSnapshot(Boolean joinSnapshot) {
        this.joinSnapshot = joinSnapshot;
        return this;
    }
    public Boolean getJoinSnapshot() {
        return this.joinSnapshot;
    }

    public UpdateSnapshotInstanceJoinOptionWithBatchRequest setRootPassword(String rootPassword) {
        this.rootPassword = rootPassword;
        return this;
    }
    public String getRootPassword() {
        return this.rootPassword;
    }

}
