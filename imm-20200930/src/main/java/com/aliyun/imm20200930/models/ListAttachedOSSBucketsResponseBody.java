// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListAttachedOSSBucketsResponseBody extends TeaModel {
    /**
     * <p>List of bound OSS Buckets.</p>
     */
    @NameInMap("AttachedOSSBuckets")
    public java.util.List<ListAttachedOSSBucketsResponseBodyAttachedOSSBuckets> attachedOSSBuckets;

    /**
     * <p>Pagination token. When the total number of tasks in the list exceeds the set MaxResults, this token is used for pagination. This parameter has a value only when not all matching task lists are returned.</p>
     * <p>Use this value as NextToken in the next call to return the subsequent task list.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9847E7D0-A9A3-0053-84C6-BA16FF******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAttachedOSSBucketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAttachedOSSBucketsResponseBody self = new ListAttachedOSSBucketsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAttachedOSSBucketsResponseBody setAttachedOSSBuckets(java.util.List<ListAttachedOSSBucketsResponseBodyAttachedOSSBuckets> attachedOSSBuckets) {
        this.attachedOSSBuckets = attachedOSSBuckets;
        return this;
    }
    public java.util.List<ListAttachedOSSBucketsResponseBodyAttachedOSSBuckets> getAttachedOSSBuckets() {
        return this.attachedOSSBuckets;
    }

    public ListAttachedOSSBucketsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAttachedOSSBucketsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAttachedOSSBucketsResponseBodyAttachedOSSBuckets extends TeaModel {
        /**
         * <p>Timestamp of the project creation time, formatted as RFC3339Nano.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-29T14:50:13.011643661+08:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>test bucket</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>OSS Bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-bucket</p>
         */
        @NameInMap("OSSBucket")
        public String OSSBucket;

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1023***********</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>Project name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>Timestamp of the project modification time, formatted as RFC3339Nano.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-29T14:50:13.011643661+08:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListAttachedOSSBucketsResponseBodyAttachedOSSBuckets build(java.util.Map<String, ?> map) throws Exception {
            ListAttachedOSSBucketsResponseBodyAttachedOSSBuckets self = new ListAttachedOSSBucketsResponseBodyAttachedOSSBuckets();
            return TeaModel.build(map, self);
        }

        public ListAttachedOSSBucketsResponseBodyAttachedOSSBuckets setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAttachedOSSBucketsResponseBodyAttachedOSSBuckets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAttachedOSSBucketsResponseBodyAttachedOSSBuckets setOSSBucket(String OSSBucket) {
            this.OSSBucket = OSSBucket;
            return this;
        }
        public String getOSSBucket() {
            return this.OSSBucket;
        }

        public ListAttachedOSSBucketsResponseBodyAttachedOSSBuckets setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListAttachedOSSBucketsResponseBodyAttachedOSSBuckets setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListAttachedOSSBucketsResponseBodyAttachedOSSBuckets setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
