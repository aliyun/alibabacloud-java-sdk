// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetBucketInfoResponseBody extends TeaModel {
    /**
     * <p>The list of bucket information.</p>
     */
    @NameInMap("BucketInfo")
    public GetBucketInfoResponseBodyBucketInfo bucketInfo;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetBucketInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketInfoResponseBody self = new GetBucketInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketInfoResponseBody setBucketInfo(GetBucketInfoResponseBodyBucketInfo bucketInfo) {
        this.bucketInfo = bucketInfo;
        return this;
    }
    public GetBucketInfoResponseBodyBucketInfo getBucketInfo() {
        return this.bucketInfo;
    }

    public GetBucketInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetBucketInfoResponseBodyBucketInfo extends TeaModel {
        /**
         * <p>The ACL of the bucket.</p>
         * <br>
         * <p>*   **public-read-write**</p>
         * <p>*   **public-read**</p>
         * <p>*   **private** (default)</p>
         */
        @NameInMap("BucketAcl")
        public String bucketAcl;

        /**
         * <p>The name of the bucket.</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The remarks.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The time when the bucket was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Single-node storage. Set the value to sink.</p>
         */
        @NameInMap("LogicalBucketType")
        public String logicalBucketType;

        /**
         * <p>The time when the bucket was modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        public static GetBucketInfoResponseBodyBucketInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBucketInfoResponseBodyBucketInfo self = new GetBucketInfoResponseBodyBucketInfo();
            return TeaModel.build(map, self);
        }

        public GetBucketInfoResponseBodyBucketInfo setBucketAcl(String bucketAcl) {
            this.bucketAcl = bucketAcl;
            return this;
        }
        public String getBucketAcl() {
            return this.bucketAcl;
        }

        public GetBucketInfoResponseBodyBucketInfo setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetBucketInfoResponseBodyBucketInfo setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetBucketInfoResponseBodyBucketInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetBucketInfoResponseBodyBucketInfo setLogicalBucketType(String logicalBucketType) {
            this.logicalBucketType = logicalBucketType;
            return this;
        }
        public String getLogicalBucketType() {
            return this.logicalBucketType;
        }

        public GetBucketInfoResponseBodyBucketInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
