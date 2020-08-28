// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelAutoSnapshotPolicyRequest extends TeaModel {
    @NameInMap("FileSystemIds")
    @Validation(required = true)
    public String fileSystemIds;

    public static CancelAutoSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAutoSnapshotPolicyRequest self = new CancelAutoSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CancelAutoSnapshotPolicyRequest setFileSystemIds(String fileSystemIds) {
        this.fileSystemIds = fileSystemIds;
        return this;
    }
    public String getFileSystemIds() {
        return this.fileSystemIds;
    }

}
