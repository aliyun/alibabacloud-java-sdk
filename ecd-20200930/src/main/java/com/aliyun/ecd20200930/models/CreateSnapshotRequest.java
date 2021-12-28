// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateSnapshotRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DesktopId")
    public String desktopId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SnapshotName")
    public String snapshotName;

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
