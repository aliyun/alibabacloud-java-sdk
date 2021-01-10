// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListAllMediaBucketResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("MediaBucketList")
    public ListAllMediaBucketResponseBodyMediaBucketList mediaBucketList;

    public static ListAllMediaBucketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllMediaBucketResponseBody self = new ListAllMediaBucketResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllMediaBucketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllMediaBucketResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListAllMediaBucketResponseBody setMediaBucketList(ListAllMediaBucketResponseBodyMediaBucketList mediaBucketList) {
        this.mediaBucketList = mediaBucketList;
        return this;
    }
    public ListAllMediaBucketResponseBodyMediaBucketList getMediaBucketList() {
        return this.mediaBucketList;
    }

    public static class ListAllMediaBucketResponseBodyMediaBucketListMediaBucket extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Bucket")
        public String bucket;

        public static ListAllMediaBucketResponseBodyMediaBucketListMediaBucket build(java.util.Map<String, ?> map) throws Exception {
            ListAllMediaBucketResponseBodyMediaBucketListMediaBucket self = new ListAllMediaBucketResponseBodyMediaBucketListMediaBucket();
            return TeaModel.build(map, self);
        }

        public ListAllMediaBucketResponseBodyMediaBucketListMediaBucket setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAllMediaBucketResponseBodyMediaBucketListMediaBucket setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
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
