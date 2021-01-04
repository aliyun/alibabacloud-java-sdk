// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ApplyAutoSnapshotPolicyRequest extends TeaModel {
    @NameInMap("AutoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    @NameInMap("FileSystemIds")
    public String fileSystemIds;

    public static ApplyAutoSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAutoSnapshotPolicyRequest self = new ApplyAutoSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAutoSnapshotPolicyRequest setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
        return this;
    }
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    public ApplyAutoSnapshotPolicyRequest setFileSystemIds(String fileSystemIds) {
        this.fileSystemIds = fileSystemIds;
        return this;
    }
    public String getFileSystemIds() {
        return this.fileSystemIds;
    }

}
