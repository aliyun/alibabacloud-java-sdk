// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateSnapshotRequest extends TeaModel {
    /**
     * <p>The description of the snapshot.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The description must be 2 to 256 characters in length.</li>
     * <li>The description cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>This parameter is empty by default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FinanceDepet</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the advanced Extreme NAS file system. The value must start with <code>extreme-</code>, for example, <code>extreme-01dd****</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>extreme-01dd****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The retention period of the snapshot.</p>
     * <p>Unit: days.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>\-1 (default). Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.</li>
     * <li>1 to 65536: Auto snapshots are retained for the specified days. After the retention period of auto snapshots expires, the auto snapshots are automatically deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    /**
     * <p>The snapshot name.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</li>
     * <li>The name cannot start with auto because snapshots whose names start with auto are recognized as auto snapshots.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FinanceJoshua</p>
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
