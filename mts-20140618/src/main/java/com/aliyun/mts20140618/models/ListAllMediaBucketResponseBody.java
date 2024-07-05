// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListAllMediaBucketResponseBody extends TeaModel {
    /**
     * <p>The media buckets returned.</p>
     */
    @NameInMap("MediaBucketList")
    public ListAllMediaBucketResponseBodyMediaBucketList mediaBucketList;

    /**
     * <p>The returned value of NextPageToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>P2Zqo1PLGhZdygo-ajSsjUX5zrBHCgXy6j4hEvv****</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>79760D91-D3CF-4165-****-B7E2836EF62A</p>
     */
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

    public ListAllMediaBucketResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListAllMediaBucketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAllMediaBucketResponseBodyMediaBucketListMediaBucket extends TeaModel {
        /**
         * <p>The name of the media bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket-****</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The settings of Object Storage Service (OSS) hotlink protection. For more information, see <a href="https://help.aliyun.com/document_detail/31869.html">Hotlink protection</a>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">http://www.example.com</a></p>
         */
        @NameInMap("Referer")
        public String referer;

        /**
         * <p>The type of the media bucket. Valid values:</p>
         * <ul>
         * <li>Input: input media bucket</li>
         * <li>Output: output media bucket</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Input</p>
         */
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

        public ListAllMediaBucketResponseBodyMediaBucketListMediaBucket setReferer(String referer) {
            this.referer = referer;
            return this;
        }
        public String getReferer() {
            return this.referer;
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
