// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeStorageSetsResponse extends TeaModel {
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

    @NameInMap("StorageSets")
    @Validation(required = true)
    public DescribeStorageSetsResponseStorageSets storageSets;

    public static DescribeStorageSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageSetsResponse self = new DescribeStorageSetsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeStorageSetsResponseStorageSetsStorageSet extends TeaModel {
        @NameInMap("StorageSetId")
        @Validation(required = true)
        public String storageSetId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("StorageSetName")
        @Validation(required = true)
        public String storageSetName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("StorageSetPartitionNumber")
        @Validation(required = true)
        public Integer storageSetPartitionNumber;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        public static DescribeStorageSetsResponseStorageSetsStorageSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageSetsResponseStorageSetsStorageSet self = new DescribeStorageSetsResponseStorageSetsStorageSet();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeStorageSetsResponseStorageSets extends TeaModel {
        @NameInMap("StorageSet")
        @Validation(required = true)
        public java.util.List<DescribeStorageSetsResponseStorageSetsStorageSet> storageSet;

        public static DescribeStorageSetsResponseStorageSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageSetsResponseStorageSets self = new DescribeStorageSetsResponseStorageSets();
            return TeaModel.build(map, self);
        }

    }

}
