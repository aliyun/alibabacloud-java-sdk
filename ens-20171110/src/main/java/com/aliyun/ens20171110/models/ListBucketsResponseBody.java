// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListBucketsResponseBody extends TeaModel {
    /**
     * <p>The list of bucket information.</p>
     */
    @NameInMap("BucketInfos")
    public java.util.List<ListBucketsResponseBodyBucketInfos> bucketInfos;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>435769C7-AA6F-4DC5-B3DB-A3DC0DE7E853</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of buckets that match the conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListBucketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBucketsResponseBody self = new ListBucketsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBucketsResponseBody setBucketInfos(java.util.List<ListBucketsResponseBodyBucketInfos> bucketInfos) {
        this.bucketInfos = bucketInfos;
        return this;
    }
    public java.util.List<ListBucketsResponseBodyBucketInfos> getBucketInfos() {
        return this.bucketInfos;
    }

    public ListBucketsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBucketsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListBucketsResponseBodyBucketInfos extends TeaModel {
        /**
         * <p>The access control list (ACL) of the bucket.</p>
         * <ul>
         * <li><strong>public-read-write</strong></li>
         * <li><strong>public-read</strong></li>
         * <li><strong>private</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("BucketAcl")
        public String bucketAcl;

        /**
         * <p>The name of the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>numb</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The time when the bucket was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-12T05:45:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the region where the node is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-dalian-unicom</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The type of the single-node storage. Set the value to sink.</p>
         * 
         * <strong>example:</strong>
         * <p>sink</p>
         */
        @NameInMap("LogicalBucketType")
        public String logicalBucketType;

        /**
         * <p>The time when the bucket was modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-12T06:45:00Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        public static ListBucketsResponseBodyBucketInfos build(java.util.Map<String, ?> map) throws Exception {
            ListBucketsResponseBodyBucketInfos self = new ListBucketsResponseBodyBucketInfos();
            return TeaModel.build(map, self);
        }

        public ListBucketsResponseBodyBucketInfos setBucketAcl(String bucketAcl) {
            this.bucketAcl = bucketAcl;
            return this;
        }
        public String getBucketAcl() {
            return this.bucketAcl;
        }

        public ListBucketsResponseBodyBucketInfos setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public ListBucketsResponseBodyBucketInfos setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListBucketsResponseBodyBucketInfos setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListBucketsResponseBodyBucketInfos setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public ListBucketsResponseBodyBucketInfos setLogicalBucketType(String logicalBucketType) {
            this.logicalBucketType = logicalBucketType;
            return this;
        }
        public String getLogicalBucketType() {
            return this.logicalBucketType;
        }

        public ListBucketsResponseBodyBucketInfos setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
