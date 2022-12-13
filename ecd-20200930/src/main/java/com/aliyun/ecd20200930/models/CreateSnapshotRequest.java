// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateSnapshotRequest extends TeaModel {
    // The description of the snapshot. The description can be up to 128 characters in length.
    @NameInMap("Description")
    public String description;

    // The ID of the cloud desktop.
    @NameInMap("DesktopId")
    public String desktopId;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The name of the snapshot. The name must be 2 to 128 characters in length.
    // 
    // It cannot start with auto because snapshots whose names start with auto are recognized as automatic snapshots.
    @NameInMap("SnapshotName")
    public String snapshotName;

    // The type of the disk for which to create a snapshot. Valid values:
    // 
    // *   system: system disk
    // *   data: data disk
    @NameInMap("SourceDiskType")
    public String sourceDiskType;

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

    public CreateSnapshotRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public CreateSnapshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSnapshotRequest setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }
    public String getSnapshotName() {
        return this.snapshotName;
    }

    public CreateSnapshotRequest setSourceDiskType(String sourceDiskType) {
        this.sourceDiskType = sourceDiskType;
        return this;
    }
    public String getSourceDiskType() {
        return this.sourceDiskType;
    }

}
