// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateBundleRequest extends TeaModel {
    /**
     * <p>The name of the cloud computer template.</p>
     * 
     * <strong>example:</strong>
     * <p>testBundleName</p>
     */
    @NameInMap("BundleName")
    public String bundleName;

    /**
     * <p>The description of the cloud computer template.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance type of the cloud computers. You can call the <a href="https://help.aliyun.com/document_detail/436974.html">DescribeBundles</a> operation to query cloud computer templates and obtain the instance types supported by the cloud computers from the <code>DesktopType</code> response parameter.</p>
     * <blockquote>
     * <p> If you want the template to use a non-GPU-accelerated image, you can only select a non-GPU-accelerated instance type. If you want the template to use a GPU-accelerated image, you can only select a GPU-accelerated instance type.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd.basic.large</p>
     */
    @NameInMap("DesktopType")
    public String desktopType;

    /**
     * <p>The ID of the image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m-4zfb6zj728hhr****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The OS language. This parameter is available only for system images. Valid values:</p>
     * <ul>
     * <li>zh-CN: Simplified Chinese</li>
     * <li>zh-HK: Traditional Chinese (Hong Kong)</li>
     * <li>en-US: American English</li>
     * <li>ja-JP: Japanese</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The performance level (PL) of the system disk. When the cloud computer instance type that is specified by the DesktopType parameter is set to a graphical instance type or instance type with a high clock speed, you can set the performance level of the disks. For more information about the differences among disks at different PLs, see <a href="https://help.aliyun.com/document_detail/122389.html">Enhanced SSDs</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>PL1</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>PL0</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>PL3</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>PL2</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("RootDiskPerformanceLevel")
    public String rootDiskPerformanceLevel;

    /**
     * <p>The size of the system disk. Unit: GiB. The value of this parameter must be consistent with the system disk size supported by the cloud computer instance type. For more information, see <a href="https://help.aliyun.com/document_detail/188609.html">Overview</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("RootDiskSizeGib")
    public Integer rootDiskSizeGib;

    /**
     * <p>The PL of the data disk. When the cloud computer instance type that is specified by the DesktopType parameter is set to a graphical instance type or instance type with a high clock speed, you can set the performance level of the disks. For more information about the differences among disks at different PLs, see <a href="https://help.aliyun.com/document_detail/122389.html">Enhanced SSDs</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>PL1</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>PL0</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>PL3</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>PL2</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("UserDiskPerformanceLevel")
    public String userDiskPerformanceLevel;

    /**
     * <p>The data disk sizes. You can configure only one data disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>70</p>
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
