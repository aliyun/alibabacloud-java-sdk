// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateBundleRequest extends TeaModel {
    /**
     * <p>The name of the cloud computer template.</p>
     */
    @NameInMap("BundleName")
    public String bundleName;

    /**
     * <p>The description of the cloud computer template.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance type of the cloud computers. You can call the [DescribeBundles](~~436974~~) operation to query cloud computer templates and obtain the instance types supported by the cloud computers from the `DesktopType` response parameter.</p>
     * <br>
     * <p>>  If you want the template to use a non-GPU-accelerated image, you can only select a non-GPU-accelerated instance type. If you want the template to use a GPU-accelerated image, you can only select a GPU-accelerated instance type.</p>
     */
    @NameInMap("DesktopType")
    public String desktopType;

    /**
     * <p>The ID of the image.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The OS language. This parameter is available only for system images. Valid values:</p>
     * <br>
     * <p>*   zh-CN: Simplified Chinese</p>
     * <p>*   zh-HK: Traditional Chinese (Hong Kong)</p>
     * <p>*   en-US: American English</p>
     * <p>*   ja-JP: Japanese</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The performance level (PL) of the system disk. When the cloud computer instance type that is specified by the DesktopType parameter is set to a graphical instance type or instance type with a high clock speed, you can set the performance level of the disks. For more information about the differences among disks at different PLs, see [Enhanced SSDs](~~122389~~).</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   PL1</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   PL0</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   PL3</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   PL2</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("RootDiskPerformanceLevel")
    public String rootDiskPerformanceLevel;

    /**
     * <p>The size of the system disk. Unit: GiB. The value of this parameter must be consistent with the system disk size supported by the cloud computer instance type. For more information, see [Overview](~~188609~~).</p>
     */
    @NameInMap("RootDiskSizeGib")
    public Integer rootDiskSizeGib;

    /**
     * <p>The PL of the data disk. When the cloud computer instance type that is specified by the DesktopType parameter is set to a graphical instance type or instance type with a high clock speed, you can set the performance level of the disks. For more information about the differences among disks at different PLs, see [Enhanced SSDs](~~122389~~).</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   PL1</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   PL0</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   PL3</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   PL2</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("UserDiskPerformanceLevel")
    public String userDiskPerformanceLevel;

    /**
     * <p>The data disk sizes. You can configure only one data disk.</p>
     */
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
