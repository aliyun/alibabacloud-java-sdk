// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ResetFileSystemRequest extends TeaModel {
    @NameInMap("FileSystemId")
    @Validation(required = true)
    public String fileSystemId;

    @NameInMap("SnapshotId")
    @Validation(required = true)
    public String snapshotId;

    public static ResetFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetFileSystemRequest self = new ResetFileSystemRequest();
        return TeaModel.build(map, self);
    }

    public ResetFileSystemRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ResetFileSystemRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
