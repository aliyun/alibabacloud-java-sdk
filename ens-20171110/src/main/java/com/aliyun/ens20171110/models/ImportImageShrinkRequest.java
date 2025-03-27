// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ImportImageShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>x86_64</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ens_vm</p>
     */
    @NameInMap("ComputeType")
    public String computeType;

    @NameInMap("DiskDeviceMapping")
    public String diskDeviceMappingShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qcow2</p>
     */
    @NameInMap("ImageFormat")
    public String imageFormat;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <strong>example:</strong>
     * <p>tmp-hybrid</p>
     */
    @NameInMap("OSSBucket")
    public String OSSBucket;

    /**
     * <strong>example:</strong>
     * <p>image-test</p>
     */
    @NameInMap("OSSObject")
    public String OSSObject;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("OSSRegion")
    public String OSSRegion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>linux</p>
     */
    @NameInMap("OSType")
    public String OSType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6.8</p>
     */
    @NameInMap("OSVersion")
    public String OSVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>centos</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
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
