// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateBundleRequest extends TeaModel {
    // The name of the desktop template.
    @NameInMap("BundleName")
    public String bundleName;

    // The description of the desktop template.
    @NameInMap("Description")
    public String description;

    // The type of the cloud desktop. You can call the DescribeBundles operation to query the cloud desktop templates and obtain the supported desktop type from the value of the DesktopType parameter.
    // 
    // >  You can select GPU-accelerated desktop types only when you use GPU-accelerated images.
    @NameInMap("DesktopType")
    public String desktopType;

    // The ID of the image.
    @NameInMap("ImageId")
    public String imageId;

    // The language of the OS. This parameter is available only for system images. Valid values:
    // 
    // *   zh-CN: Simplified Chinese
    // *   zh-HK: Traditional Chinese (Hong Kong)
    // *   en-US: English
    // *   ja-JP: Japanese
    @NameInMap("Language")
    public String language;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The performance level (PL) of the system disk. If the cloud desktop type is Graphics or High Frequency, you can set the PL of the system disk. Valid values:
    // 
    // *   PL0
    // *   PL1
    // *   PL2
    // *   PL3
    // 
    // For more information about the differences between disks at different PLs, see [Enhanced SSDs](~~122389~~).
    @NameInMap("RootDiskPerformanceLevel")
    public String rootDiskPerformanceLevel;

    // The size of the system disk. Unit: GiB.
    // 
    // The value of this parameter must be consistent with the system disk size supported by the cloud desktop type. For more information, see [Cloud desktop types](~~188609~~).
    @NameInMap("RootDiskSizeGib")
    public Integer rootDiskSizeGib;

    // The PL of the data disk. If the cloud desktop type is Graphics or High Frequency, you can set the PL of the data disk. Valid values:
    // 
    // *   PL0
    // *   PL1
    // *   PL2
    // *   PL3
    // 
    // For more information about the differences between disks at different PLs, see [Enhanced SSDs](~~122389~~).
    @NameInMap("UserDiskPerformanceLevel")
    public String userDiskPerformanceLevel;

    @NameInMap("UserDiskSizeGib")
    public java.util.List<Integer> userDiskSizeGib;

    public static CreateBundleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBundleRequest self = new CreateBundleRequest();
        return TeaModel.build(map, self);
    }

    public CreateBundleRequest setBundleName(String bundleName) {
        this.bundleName = bundleName;
        return this;
    }
    public String getBundleName() {
        return this.bundleName;
    }

    public CreateBundleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBundleRequest setDesktopType(String desktopType) {
        this.desktopType = desktopType;
        return this;
    }
    public String getDesktopType() {
        return this.desktopType;
    }

    public CreateBundleRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateBundleRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateBundleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateBundleRequest setRootDiskPerformanceLevel(String rootDiskPerformanceLevel) {
        this.rootDiskPerformanceLevel = rootDiskPerformanceLevel;
        return this;
    }
    public String getRootDiskPerformanceLevel() {
        return this.rootDiskPerformanceLevel;
    }

    public CreateBundleRequest setRootDiskSizeGib(Integer rootDiskSizeGib) {
        this.rootDiskSizeGib = rootDiskSizeGib;
        return this;
    }
    public Integer getRootDiskSizeGib() {
        return this.rootDiskSizeGib;
    }

    public CreateBundleRequest setUserDiskPerformanceLevel(String userDiskPerformanceLevel) {
        this.userDiskPerformanceLevel = userDiskPerformanceLevel;
        return this;
    }
    public String getUserDiskPerformanceLevel() {
        return this.userDiskPerformanceLevel;
    }

    public CreateBundleRequest setUserDiskSizeGib(java.util.List<Integer> userDiskSizeGib) {
        this.userDiskSizeGib = userDiskSizeGib;
        return this;
    }
    public java.util.List<Integer> getUserDiskSizeGib() {
        return this.userDiskSizeGib;
    }

}
