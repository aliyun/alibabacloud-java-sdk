// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ApplyAutoSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the automatic snapshot policy.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AutoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    /**
     * <p>The IDs of advanced Extreme NAS file systems.</p>
     * <br>
     * <p>You can specify a maximum of 100 file system IDs at a time. If you want to apply an automatic snapshot policy to multiple file systems, separate the file system IDs with commas (,).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
