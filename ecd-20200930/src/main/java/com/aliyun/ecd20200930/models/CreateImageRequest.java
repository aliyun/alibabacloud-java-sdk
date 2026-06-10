// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateImageRequest extends TeaModel {
    /**
     * <p>Specify whether to clear user personal data. If set to <code>true</code>, the image clears all folders under <code>C:\\Users</code>, except <code>Administrator</code> and <code>Public</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoCleanUserdata")
    public Boolean autoCleanUserdata;

    @NameInMap("DataSnapshotIds")
    public java.util.List<String> dataSnapshotIds;

    /**
     * <p>The description of the image. The description must be 2 to 256 characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-7w78ozhjcwa3u****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The disk data included in the image.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The name of the image. The name must be 2 to 128 characters in length. It must start with a letter or Chinese character. It cannot start with <code>http://</code> or <code>https://</code>. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testImageName</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>This parameter is not available for use.</p>
     * 
     * <strong>example:</strong>
     * <p>deprecated</p>
     */
    @NameInMap("ImageResourceType")
    public String imageResourceType;

    /**
     * <p>The region ID. Call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to view the list of regions that support WUYING Workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>s-2zefuwk8l6ytcgd3bf4o</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>A list of snapshot IDs.</p>
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

    public CreateImageRequest setDataSnapshotIds(java.util.List<String> dataSnapshotIds) {
        this.dataSnapshotIds = dataSnapshotIds;
        return this;
    }
    public java.util.List<String> getDataSnapshotIds() {
        return this.dataSnapshotIds;
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
