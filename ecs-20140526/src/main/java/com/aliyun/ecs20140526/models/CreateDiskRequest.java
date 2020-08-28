// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDiskRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("SnapshotId")
    public String snapshotId;

    @NameInMap("DiskName")
    public String diskName;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("DiskCategory")
    public String diskCategory;

    @NameInMap("Description")
    public String description;

    @NameInMap("Encrypted")
    public Boolean encrypted;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Tag")
    public java.util.List<CreateDiskRequestTag> tag;

    @NameInMap("Arn")
    public java.util.List<CreateDiskRequestArn> arn;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    @NameInMap("AdvancedFeatures")
    public String advancedFeatures;

    @NameInMap("StorageSetId")
    public String storageSetId;

    @NameInMap("EncryptAlgorithm")
    public String encryptAlgorithm;

    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    public static CreateDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskRequest self = new CreateDiskRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateDiskRequestTag extends TeaModel {
        @NameInMap("value")
        @Validation(required = true)
        public String value;

        @NameInMap("key")
        @Validation(required = true)
        public String key;

        public static CreateDiskRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDiskRequestTag self = new CreateDiskRequestTag();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateDiskRequestArn extends TeaModel {
        @NameInMap("AssumeRoleFor")
        @Validation(required = true)
        public Long assumeRoleFor;

        @NameInMap("Rolearn")
        @Validation(required = true)
        public String rolearn;

        @NameInMap("RoleType")
        @Validation(required = true)
        public String roleType;

        public static CreateDiskRequestArn build(java.util.Map<String, ?> map) throws Exception {
            CreateDiskRequestArn self = new CreateDiskRequestArn();
            return TeaModel.build(map, self);
        }

    }

}
