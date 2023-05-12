// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateBundleRequest extends TeaModel {
    /**
     * <p>The name of the desktop template.</p>
     */
    @NameInMap("BundleName")
    public String bundleName;

    /**
     * <p>The description of the desktop template.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The language of the OS. This parameter is available only for system images. Valid values:</p>
     * <br>
     * <p>*   zh-CN: Simplified Chinese</p>
     * <p>*   zh-HK: Traditional Chinese (Hong Kong)</p>
     * <p>*   en-US: English</p>
     * <p>*   ja-JP: Japanese</p>
     */
    @NameInMap("DesktopType")
    public String desktopType;

    /**
     * <p>The type of the cloud desktop. You can call the DescribeBundles operation to query the cloud desktop templates and obtain the supported desktop type from the value of the DesktopType parameter.</p>
     * <br>
     * <p>>  You can select GPU-accelerated desktop types only when you use GPU-accelerated images.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The performance level (PL) of the system disk. If the cloud desktop type is Graphics or High Frequency, you can set the PL of the system disk. Valid values:</p>
     * <br>
     * <p>*   PL0</p>
     * <p>*   PL1</p>
     * <p>*   PL2</p>
     * <p>*   PL3</p>
     * <br>
     * <p>For more information about the differences between disks at different PLs, see [Enhanced SSDs](~~122389~~).</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The size of data disk N. You can configure only one data disk. Unit: GiB.</p>
     * <br>
     * <p>The value of this parameter must be consistent with the data disk size supported by the cloud desktop type. For more information, see [Cloud desktop types](~~188609~~).</p>
     * <br>
     * <p>>  The value of the UserDiskSizeGib parameter in the template must be greater than that of the DataDiskSize parameter in the image.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The size of the system disk. Unit: GiB.</p>
     * <br>
     * <p>The value of this parameter must be consistent with the system disk size supported by the cloud desktop type. For more information, see [Cloud desktop types](~~188609~~).</p>
     */
    @NameInMap("RootDiskPerformanceLevel")
    public String rootDiskPerformanceLevel;

    /**
     * <p>The operation that you want to perform. Set the value to **CreateBundle**.</p>
     */
    @NameInMap("RootDiskSizeGib")
    public Integer rootDiskSizeGib;

    /**
     * <p>The ID of the request.</p>
     */
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
