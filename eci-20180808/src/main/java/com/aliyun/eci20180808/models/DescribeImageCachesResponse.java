// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeImageCachesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ImageCaches")
    @Validation(required = true)
    public java.util.List<DescribeImageCachesResponseImageCaches> imageCaches;

    public static DescribeImageCachesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageCachesResponse self = new DescribeImageCachesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeImageCachesResponseImageCachesEvents extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("FirstTimestamp")
        @Validation(required = true)
        public String firstTimestamp;

        @NameInMap("LastTimestamp")
        @Validation(required = true)
        public String lastTimestamp;

        public static DescribeImageCachesResponseImageCachesEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCachesResponseImageCachesEvents self = new DescribeImageCachesResponseImageCachesEvents();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeImageCachesResponseImageCaches extends TeaModel {
        @NameInMap("ContainerGroupId")
        @Validation(required = true)
        public String containerGroupId;

        @NameInMap("ImageCacheId")
        @Validation(required = true)
        public String imageCacheId;

        @NameInMap("ImageCacheName")
        @Validation(required = true)
        public String imageCacheName;

        @NameInMap("SnapshotId")
        @Validation(required = true)
        public String snapshotId;

        @NameInMap("Progress")
        @Validation(required = true)
        public String progress;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ExpireDateTime")
        @Validation(required = true)
        public String expireDateTime;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Events")
        @Validation(required = true)
        public java.util.List<DescribeImageCachesResponseImageCachesEvents> events;

        @NameInMap("Images")
        @Validation(required = true)
        public java.util.List<String> images;

        public static DescribeImageCachesResponseImageCaches build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageCachesResponseImageCaches self = new DescribeImageCachesResponseImageCaches();
            return TeaModel.build(map, self);
        }

    }

}
