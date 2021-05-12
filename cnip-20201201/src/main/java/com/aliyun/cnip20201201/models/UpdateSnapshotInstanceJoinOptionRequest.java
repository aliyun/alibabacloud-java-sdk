// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateSnapshotInstanceJoinOptionRequest extends TeaModel {
    @NameInMap("joinSnapshot")
    public Boolean joinSnapshot;

    @NameInMap("rootPassword")
    public String rootPassword;

    public static UpdateSnapshotInstanceJoinOptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSnapshotInstanceJoinOptionRequest self = new UpdateSnapshotInstanceJoinOptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSnapshotInstanceJoinOptionRequest setJoinSnapshot(Boolean joinSnapshot) {
        this.joinSnapshot = joinSnapshot;
        return this;
    }
    public Boolean getJoinSnapshot() {
        return this.joinSnapshot;
    }

    public UpdateSnapshotInstanceJoinOptionRequest setRootPassword(String rootPassword) {
        this.rootPassword = rootPassword;
        return this;
    }
    public String getRootPassword() {
        return this.rootPassword;
    }

}
