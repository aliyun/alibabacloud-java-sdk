// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ImportImageRequest extends TeaModel {
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
    public java.util.List<ImportImageRequestDiskDeviceMapping> diskDeviceMapping;

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

    public static ImportImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportImageRequest self = new ImportImageRequest();
        return TeaModel.build(map, self);
    }

    public ImportImageRequest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public ImportImageRequest setComputeType(String computeType) {
        this.computeType = computeType;
        return this;
    }
    public String getComputeType() {
        return this.computeType;
    }

    public ImportImageRequest setDiskDeviceMapping(java.util.List<ImportImageRequestDiskDeviceMapping> diskDeviceMapping) {
        this.diskDeviceMapping = diskDeviceMapping;
        return this;
    }
    public java.util.List<ImportImageRequestDiskDeviceMapping> getDiskDeviceMapping() {
        return this.diskDeviceMapping;
    }

    public ImportImageRequest setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
        return this;
    }
    public String getImageFormat() {
        return this.imageFormat;
    }

    public ImportImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ImportImageRequest setOSSBucket(String OSSBucket) {
        this.OSSBucket = OSSBucket;
        return this;
    }
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    public ImportImageRequest setOSSObject(String OSSObject) {
        this.OSSObject = OSSObject;
        return this;
    }
    public String getOSSObject() {
        return this.OSSObject;
    }

    public ImportImageRequest setOSSRegion(String OSSRegion) {
        this.OSSRegion = OSSRegion;
        return this;
    }
    public String getOSSRegion() {
        return this.OSSRegion;
    }

    public ImportImageRequest setOSType(String OSType) {
        this.OSType = OSType;
        return this;
    }
    public String getOSType() {
        return this.OSType;
    }

    public ImportImageRequest setOSVersion(String OSVersion) {
        this.OSVersion = OSVersion;
        return this;
    }
    public String getOSVersion() {
        return this.OSVersion;
    }

    public ImportImageRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ImportImageRequest setTargetOSSRegionId(String targetOSSRegionId) {
        this.targetOSSRegionId = targetOSSRegionId;
        return this;
    }
    public String getTargetOSSRegionId() {
        return this.targetOSSRegionId;
    }

    public static class ImportImageRequestDiskDeviceMapping extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>www-cn</p>
         */
        @NameInMap("OSSBucket")
        public String OSSBucket;

        /**
         * <strong>example:</strong>
         * <p>image-bucket</p>
         */
        @NameInMap("OSSObject")
        public String OSSObject;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("OSSRegion")
        public String OSSRegion;

        public static ImportImageRequestDiskDeviceMapping build(java.util.Map<String, ?> map) throws Exception {
            ImportImageRequestDiskDeviceMapping self = new ImportImageRequestDiskDeviceMapping();
            return TeaModel.build(map, self);
        }

        public ImportImageRequestDiskDeviceMapping setOSSBucket(String OSSBucket) {
            this.OSSBucket = OSSBucket;
            return this;
        }
        public String getOSSBucket() {
            return this.OSSBucket;
        }

        public ImportImageRequestDiskDeviceMapping setOSSObject(String OSSObject) {
            this.OSSObject = OSSObject;
            return this;
        }
        public String getOSSObject() {
            return this.OSSObject;
        }

        public ImportImageRequestDiskDeviceMapping setOSSRegion(String OSSRegion) {
            this.OSSRegion = OSSRegion;
            return this;
        }
        public String getOSSRegion() {
            return this.OSSRegion;
        }

    }

}
