// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateSnapshotRequest extends TeaModel {
    /**
     * <p>The description of the snapshot.</p>
     * <br>
     * <p>Limits:</p>
     * <br>
     * <p>*   The description must be 2 to 256 characters in length.</p>
     * <p>*   The description cannot start with `http://` or `https://`.</p>
     * <p>*   This parameter is empty by default.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the advanced Extreme NAS file system. The value must start with `extreme-`, for example, `extreme-01dd****`.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The retention period of the snapshot.</p>
     * <br>
     * <p>Unit: days.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   \\-1 (default). Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.</p>
     * <p>*   1 to 65536: Auto snapshots are retained for the specified days. After the retention period of auto snapshots expires, the auto snapshots are automatically deleted.</p>
     */
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    /**
     * <p>The snapshot name.</p>
     * <br>
     * <p>Limits:</p>
     * <br>
     * <p>*   The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with `http://` or `https://`.</p>
     * <p>*   The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     * <p>*   The name cannot start with auto because snapshots whose names start with auto are recognized as auto snapshots.</p>
     */
    @NameInMap("SnapshotName")
    public String snapshotName;

    public static CreateSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSnapshotRequest self = new CreateSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public CreateSnapshotRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSnapshotRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateSnapshotRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public CreateSnapshotRequest setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }
    public String getSnapshotName() {
        return this.snapshotName;
    }

}
