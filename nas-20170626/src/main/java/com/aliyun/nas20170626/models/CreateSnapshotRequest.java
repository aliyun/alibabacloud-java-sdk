// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateSnapshotRequest extends TeaModel {
    /**
     * <p>The snapshot description.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The description must be 2 to 256 characters in length.</li>
     * <li>The description cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>Default value: empty.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FinanceDepet</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the Advanced Extreme NAS file system. The value must start with <code>extreme-</code>, such as <code>extreme-01dd****</code>.</p>
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
     * <li>-1 (default): The snapshot is permanently retained and is automatically deleted when the snapshot quota is reached.</li>
     * <li>1 to 65536: The snapshot is retained for the specified number of days. The snapshot is subject to automatic release after the retention period expires.</li>
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
     * <li>The name must be 2 to 128 characters in length and can contain letters and digits. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The name can contain digits, colons (:), underscores (_), or hyphens (-).</li>
     * <li>The name cannot start with auto to avoid conflicts with automatic snapshot names.</li>
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
