// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ImportImageRequest extends TeaModel {
    @NameInMap("Architecture")
    public String architecture;

    @NameInMap("BootMode")
    public String bootMode;

    @NameInMap("Description")
    public String description;

    @NameInMap("DiskDeviceMapping")
    public java.util.List<ImportImageRequestDiskDeviceMapping> diskDeviceMapping;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("LicenseType")
    public String licenseType;

    @NameInMap("OSType")
    public String OSType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("Tag")
    public java.util.List<ImportImageRequestTag> tag;

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

    public ImportImageRequest setBootMode(String bootMode) {
        this.bootMode = bootMode;
        return this;
    }
    public String getBootMode() {
        return this.bootMode;
    }

    public ImportImageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ImportImageRequest setDiskDeviceMapping(java.util.List<ImportImageRequestDiskDeviceMapping> diskDeviceMapping) {
        this.diskDeviceMapping = diskDeviceMapping;
        return this;
    }
    public java.util.List<ImportImageRequestDiskDeviceMapping> getDiskDeviceMapping() {
        return this.diskDeviceMapping;
    }

    public ImportImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ImportImageRequest setLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }
    public String getLicenseType() {
        return this.licenseType;
    }

    public ImportImageRequest setOSType(String OSType) {
        this.OSType = OSType;
        return this;
    }
    public String getOSType() {
        return this.OSType;
    }

    public ImportImageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ImportImageRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ImportImageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ImportImageRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ImportImageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ImportImageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ImportImageRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public ImportImageRequest setTag(java.util.List<ImportImageRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ImportImageRequestTag> getTag() {
        return this.tag;
    }

    public static class ImportImageRequestDiskDeviceMapping extends TeaModel {
        @NameInMap("Device")
        public String device;

        @NameInMap("DiskImSize")
        public Integer diskImSize;

        @NameInMap("DiskImageSize")
        public Integer diskImageSize;

        @NameInMap("Format")
        public String format;

        @NameInMap("OSSBucket")
        public String OSSBucket;

        @NameInMap("OSSObject")
        public String OSSObject;

        public static ImportImageRequestDiskDeviceMapping build(java.util.Map<String, ?> map) throws Exception {
            ImportImageRequestDiskDeviceMapping self = new ImportImageRequestDiskDeviceMapping();
            return TeaModel.build(map, self);
        }

        public ImportImageRequestDiskDeviceMapping setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public ImportImageRequestDiskDeviceMapping setDiskImSize(Integer diskImSize) {
            this.diskImSize = diskImSize;
            return this;
        }
        public Integer getDiskImSize() {
            return this.diskImSize;
        }

        public ImportImageRequestDiskDeviceMapping setDiskImageSize(Integer diskImageSize) {
            this.diskImageSize = diskImageSize;
            return this;
        }
        public Integer getDiskImageSize() {
            return this.diskImageSize;
        }

        public ImportImageRequestDiskDeviceMapping setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
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

    }

    public static class ImportImageRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ImportImageRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ImportImageRequestTag self = new ImportImageRequestTag();
            return TeaModel.build(map, self);
        }

        public ImportImageRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ImportImageRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
