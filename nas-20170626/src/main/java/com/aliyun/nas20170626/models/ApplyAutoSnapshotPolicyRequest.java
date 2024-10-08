// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ApplyAutoSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the automatic snapshot policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-extreme-233e6****</p>
     */
    @NameInMap("AutoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    /**
     * <p>The IDs of advanced Extreme NAS file systems.</p>
     * <p>You can specify a maximum of 100 file system IDs at a time. If you want to apply an automatic snapshot policy to multiple file systems, separate the file system IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>extreme-233e6****,extreme -23vbp****,extreme -23vas****</p>
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
