// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetBucketInfoResponseBody extends TeaModel {
    /**
     * <p>Bucket information list.</p>
     */
    @NameInMap("BucketInfo")
    public GetBucketInfoResponseBodyBucketInfo bucketInfo;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C5831388-2D4B-46F4-A96B-D4E6BD06E7521</p>
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
         * <p>Bucket access control list type:</p>
         * <ul>
         * <li><p><strong>public-read-write</strong>: public-read-write</p>
         * </li>
         * <li><p><strong>public-read</strong>: public-read</p>
         * </li>
         * <li><p><strong>private</strong>: private (default)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("BucketAcl")
        public String bucketAcl;

        /**
         * <p>Bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>Comments.</p>
         * 
         * <strong>example:</strong>
         * <p>das</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Bucket creation time. Represented in ISO8601 standard, using UTC time. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-12T05:45:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Single node storage. Value: sink.</p>
         * 
         * <strong>example:</strong>
         * <p>sink</p>
         */
        @NameInMap("LogicalBucketType")
        public String logicalBucketType;

        /**
         * <p>Bucket modification time. Represented in ISO8601 standard, using UTC time. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-12T06:45:00Z</p>
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
