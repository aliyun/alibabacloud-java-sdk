// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateImageRequest extends TeaModel {
    /**
     * <p>Specifies whether to clear private data of users. If you set AutoCleanUserdata to `true`, the custom image clears the data directories, excluding the `Administrator` and `Public` directories, in the `C:\Users` directory.</p>
     */
    @NameInMap("AutoCleanUserdata")
    public Boolean autoCleanUserdata;

    /**
     * <p>The description of the custom image. The description must be 2 to 256 characters in length. It cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the cloud desktop.</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The disk data that is contained in the custom image.</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The name of the custom image. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). It can contain letters, digits, colons (:), underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>This parameter is not available to the public.</p>
     */
    @NameInMap("ImageResourceType")
    public String imageResourceType;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the snapshot.</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The ID of the snapshot.</p>
     */
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
