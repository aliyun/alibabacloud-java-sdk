// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ImportImageShrinkRequest extends TeaModel {
    /**
     * <p>System architecture. Allowed values:</br></p>
     * <ul>
     * <li>x86_64.</br></li>
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
     * <p><code>Image Type</code>
     * ens_vm: ens virtual machine image (default)</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ens_vm</p>
     */
    @NameInMap("ComputeType")
    public String computeType;

    /**
     * <p>List of custom image information being created.</p>
     */
    @NameInMap("DiskDeviceMapping")
    public String diskDeviceMappingShrink;

    /**
     * <p>Image format. Allowed values:</br>
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
     * <p>Image name. The length should be [2, 128] English or Chinese characters. It must start with a letter (uppercase or lowercase) or a Chinese character, and cannot start with http:// or https://. It can contain numbers, colons (:), underscores (_), or hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>镜像名称</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("LicenseType")
    public String licenseType;

    /**
     * <p>The OSS Bucket where the image file is located.</p>
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
     * <p>The Region where the image is located. Currently, only cn-beijing is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("OSSRegion")
    public String OSSRegion;

    /**
     * <p>Operating system platform type. Allowed values:</p>
     * <ul>
     * <li>windows.</li>
     * <li>linux.</li>
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
     * <p>Operating system distribution version</p>
     * 
     * <strong>example:</strong>
     * <p>6.8</p>
     */
    @NameInMap("OSVersion")
    public String OSVersion;

    /**
     * <p>Operating system distribution. Allowed values:</p>
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
     * <p>The target OSS region where the image will be stored.</br></p>
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
