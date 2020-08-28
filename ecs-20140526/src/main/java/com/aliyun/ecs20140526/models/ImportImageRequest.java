// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ImportImageRequest extends TeaModel {
    @NameInMap("DiskDeviceMapping")
    public java.util.List<ImportImageRequestDiskDeviceMapping> diskDeviceMapping;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("Description")
    public String description;

    @NameInMap("Architecture")
    public String architecture;

    @NameInMap("OSType")
    public String OSType;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("BootMode")
    public String bootMode;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("LicenseType")
    public String licenseType;

    @NameInMap("Tag")
    public java.util.List<ImportImageRequestTag> tag;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ImportImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportImageRequest self = new ImportImageRequest();
        return TeaModel.build(map, self);
    }

    public static class ImportImageRequestDiskDeviceMapping extends TeaModel {
        @NameInMap("Format")
        public String format;

        @NameInMap("OSSBucket")
        public String OSSBucket;

        @NameInMap("OSSObject")
        public String OSSObject;

        @NameInMap("DiskImSize")
        public Integer diskImSize;

        @NameInMap("DiskImageSize")
        public Integer diskImageSize;

        @NameInMap("Device")
        public String device;

        public static ImportImageRequestDiskDeviceMapping build(java.util.Map<String, ?> map) throws Exception {
            ImportImageRequestDiskDeviceMapping self = new ImportImageRequestDiskDeviceMapping();
            return TeaModel.build(map, self);
        }

    }

    public static class ImportImageRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ImportImageRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ImportImageRequestTag self = new ImportImageRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
