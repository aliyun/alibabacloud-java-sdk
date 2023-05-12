// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateImageRequest extends TeaModel {
    @NameInMap("AutoCleanUserdata")
    public Boolean autoCleanUserdata;

    @NameInMap("Description")
    public String description;

    @NameInMap("DesktopId")
    public String desktopId;

    @NameInMap("DiskType")
    public String diskType;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("ImageResourceType")
    public String imageResourceType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SnapshotId")
    public String snapshotId;

    @NameInMap("SnapshotIds")
    public java.util.List<String> snapshotIds;

    public static CreateImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageRequest self = new CreateImageRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageRequest setAutoCleanUserdata(Boolean autoCleanUserdata) {
        this.autoCleanUserdata = autoCleanUserdata;
        return this;
    }
    public Boolean getAutoCleanUserdata() {
        return this.autoCleanUserdata;
    }

    public CreateImageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateImageRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public CreateImageRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public CreateImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public CreateImageRequest setImageResourceType(String imageResourceType) {
        this.imageResourceType = imageResourceType;
        return this;
    }
    public String getImageResourceType() {
        return this.imageResourceType;
    }

    public CreateImageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateImageRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public CreateImageRequest setSnapshotIds(java.util.List<String> snapshotIds) {
        this.snapshotIds = snapshotIds;
        return this;
    }
    public java.util.List<String> getSnapshotIds() {
        return this.snapshotIds;
    }

}
