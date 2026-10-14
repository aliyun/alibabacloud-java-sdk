// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ImportImageShrinkRequest extends TeaModel {
    /**
     * <p>The system architecture. Valid values:</br></p>
     * <ul>
     * <li>x86_64</li>
     * </ul>
     * <p>Currently, only x86_64 is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>x86_64</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>The image type. Valid values:</p>
     * <p>ens_vm: ENS virtual machine image (default).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ens_vm</p>
     */
    @NameInMap("ComputeType")
    public String computeType;

    /**
     * <p>The list of custom image information.</p>
     */
    @NameInMap("DiskDeviceMapping")
    public String diskDeviceMappingShrink;

    /**
     * <p>The image format. Valid values:</br>
     * qcow2.</br>
     * Currently, only qcow2 is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qcow2</p>
     */
    @NameInMap("ImageFormat")
    public String imageFormat;

    /**
     * <p>The image name. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with http:// or https://.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ImageName</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The image license type. Valid values: Aliyun (Alibaba Cloud license) and BYOL (Bring Your Own Key).</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("LicenseType")
    public String licenseType;

    /**
     * <p>The OSS bucket that stores the image file.</p>
     * 
     * <strong>example:</strong>
     * <p>tmp-hybrid</p>
     */
    @NameInMap("OSSBucket")
    public String OSSBucket;

    /**
     * <p>The name of the image file.</p>
     * 
     * <strong>example:</strong>
     * <p>image-test</p>
     */
    @NameInMap("OSSObject")
    public String OSSObject;

    /**
     * <p>The region where the image resides. Currently, only cn-beijing is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("OSSRegion")
    public String OSSRegion;

    /**
     * <p>The type of the operating system platform. Valid values:</p>
     * <ul>
     * <li>windows</li>
     * <li>linux</li>
     * </ul>
     * <p>Currently, only linux is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>linux</p>
     */
    @NameInMap("OSType")
    public String OSType;

    /**
     * <p>The version of the operating system distribution.</p>
     * 
     * <strong>example:</strong>
     * <p>6.8</p>
     */
    @NameInMap("OSVersion")
    public String OSVersion;

    /**
     * <p>The operating system distribution. Valid values:</p>
     * <ul>
     * <li>centos</li>
     * <li>ubuntu</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>centos</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The region of the destination OSS bucket where the image is stored.</br></p>
     * <blockquote>
     * <p>Currently, only cn-beijing and ap-southeast-1 are supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("TargetOSSRegionId")
    public String targetOSSRegionId;

    public static ImportImageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportImageShrinkRequest self = new ImportImageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportImageShrinkRequest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public ImportImageShrinkRequest setComputeType(String computeType) {
        this.computeType = computeType;
        return this;
    }
    public String getComputeType() {
        return this.computeType;
    }

    public ImportImageShrinkRequest setDiskDeviceMappingShrink(String diskDeviceMappingShrink) {
        this.diskDeviceMappingShrink = diskDeviceMappingShrink;
        return this;
    }
    public String getDiskDeviceMappingShrink() {
        return this.diskDeviceMappingShrink;
    }

    public ImportImageShrinkRequest setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
        return this;
    }
    public String getImageFormat() {
        return this.imageFormat;
    }

    public ImportImageShrinkRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ImportImageShrinkRequest setLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }
    public String getLicenseType() {
        return this.licenseType;
    }

    public ImportImageShrinkRequest setOSSBucket(String OSSBucket) {
        this.OSSBucket = OSSBucket;
        return this;
    }
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    public ImportImageShrinkRequest setOSSObject(String OSSObject) {
        this.OSSObject = OSSObject;
        return this;
    }
    public String getOSSObject() {
        return this.OSSObject;
    }

    public ImportImageShrinkRequest setOSSRegion(String OSSRegion) {
        this.OSSRegion = OSSRegion;
        return this;
    }
    public String getOSSRegion() {
        return this.OSSRegion;
    }

    public ImportImageShrinkRequest setOSType(String OSType) {
        this.OSType = OSType;
        return this;
    }
    public String getOSType() {
        return this.OSType;
    }

    public ImportImageShrinkRequest setOSVersion(String OSVersion) {
        this.OSVersion = OSVersion;
        return this;
    }
    public String getOSVersion() {
        return this.OSVersion;
    }

    public ImportImageShrinkRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ImportImageShrinkRequest setTargetOSSRegionId(String targetOSSRegionId) {
        this.targetOSSRegionId = targetOSSRegionId;
        return this;
    }
    public String getTargetOSSRegionId() {
        return this.targetOSSRegionId;
    }

}
