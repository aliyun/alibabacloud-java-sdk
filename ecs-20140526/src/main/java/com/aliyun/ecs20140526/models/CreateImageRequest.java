// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateImageRequest extends TeaModel {
    @NameInMap("DiskDeviceMapping")
    public java.util.List<CreateImageRequestDiskDeviceMapping> diskDeviceMapping;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SnapshotId")
    public String snapshotId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("ImageFamily")
    public String imageFamily;

    @NameInMap("ImageVersion")
    public String imageVersion;

    @NameInMap("Description")
    public String description;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("Architecture")
    public String architecture;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Tag")
    public java.util.List<CreateImageRequestTag> tag;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageRequest self = new CreateImageRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateImageRequestDiskDeviceMapping extends TeaModel {
        @NameInMap("Size")
        public Integer size;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("Device")
        public String device;

        @NameInMap("DiskType")
        @Validation(required = true)
        public String diskType;

        public static CreateImageRequestDiskDeviceMapping build(java.util.Map<String, ?> map) throws Exception {
            CreateImageRequestDiskDeviceMapping self = new CreateImageRequestDiskDeviceMapping();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateImageRequestTag extends TeaModel {
        @NameInMap("value")
        @Validation(required = true)
        public String value;

        @NameInMap("key")
        @Validation(required = true)
        public String key;

        public static CreateImageRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateImageRequestTag self = new CreateImageRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
