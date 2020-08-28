// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeStorageSetDetailsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Disks")
    @Validation(required = true)
    public DescribeStorageSetDetailsResponseDisks disks;

    public static DescribeStorageSetDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageSetDetailsResponse self = new DescribeStorageSetDetailsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeStorageSetDetailsResponseDisksDisk extends TeaModel {
        @NameInMap("DiskId")
        @Validation(required = true)
        public String diskId;

        @NameInMap("DiskName")
        @Validation(required = true)
        public String diskName;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("StorageSetId")
        @Validation(required = true)
        public String storageSetId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("StorageSetPartitionNumber")
        @Validation(required = true)
        public Integer storageSetPartitionNumber;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        public static DescribeStorageSetDetailsResponseDisksDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageSetDetailsResponseDisksDisk self = new DescribeStorageSetDetailsResponseDisksDisk();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeStorageSetDetailsResponseDisks extends TeaModel {
        @NameInMap("Disk")
        @Validation(required = true)
        public java.util.List<DescribeStorageSetDetailsResponseDisksDisk> disk;

        public static DescribeStorageSetDetailsResponseDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageSetDetailsResponseDisks self = new DescribeStorageSetDetailsResponseDisks();
            return TeaModel.build(map, self);
        }

    }

}
