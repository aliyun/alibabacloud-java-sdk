// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class ListAllMediaBucketResponseBody extends TeaModel {
    @NameInMap("MediaBucketList")
    public ListAllMediaBucketResponseBodyMediaBucketList mediaBucketList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAllMediaBucketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllMediaBucketResponseBody self = new ListAllMediaBucketResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllMediaBucketResponseBody setMediaBucketList(ListAllMediaBucketResponseBodyMediaBucketList mediaBucketList) {
        this.mediaBucketList = mediaBucketList;
        return this;
    }
    public ListAllMediaBucketResponseBodyMediaBucketList getMediaBucketList() {
        return this.mediaBucketList;
    }

    public ListAllMediaBucketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAllMediaBucketResponseBodyMediaBucketListMediaBucket extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Type")
        public String type;

        public static ListAllMediaBucketResponseBodyMediaBucketListMediaBucket build(java.util.Map<String, ?> map) throws Exception {
            ListAllMediaBucketResponseBodyMediaBucketListMediaBucket self = new ListAllMediaBucketResponseBodyMediaBucketListMediaBucket();
            return TeaModel.build(map, self);
        }

        public ListAllMediaBucketResponseBodyMediaBucketListMediaBucket setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ListAllMediaBucketResponseBodyMediaBucketListMediaBucket setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAllMediaBucketResponseBodyMediaBucketList extends TeaModel {
        @NameInMap("MediaBucket")
        public java.util.List<ListAllMediaBucketResponseBodyMediaBucketListMediaBucket> mediaBucket;

        public static ListAllMediaBucketResponseBodyMediaBucketList build(java.util.Map<String, ?> map) throws Exception {
            ListAllMediaBucketResponseBodyMediaBucketList self = new ListAllMediaBucketResponseBodyMediaBucketList();
            return TeaModel.build(map, self);
        }

        public ListAllMediaBucketResponseBodyMediaBucketList setMediaBucket(java.util.List<ListAllMediaBucketResponseBodyMediaBucketListMediaBucket> mediaBucket) {
            this.mediaBucket = mediaBucket;
            return this;
        }
        public java.util.List<ListAllMediaBucketResponseBodyMediaBucketListMediaBucket> getMediaBucket() {
            return this.mediaBucket;
        }

    }

}
