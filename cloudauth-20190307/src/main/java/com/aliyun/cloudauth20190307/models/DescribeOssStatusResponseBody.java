// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeOssStatusResponseBody extends TeaModel {
    /**
     * <p>Returned data.</p>
     */
    @NameInMap("Data")
    public DescribeOssStatusResponseBodyData data;

    /**
     * <p>The ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>F2DB870B-EEB7-51BD-9F0A-B5D8D3C79308</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOssStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssStatusResponseBody self = new DescribeOssStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssStatusResponseBody setData(DescribeOssStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeOssStatusResponseBodyData getData() {
        return this.data;
    }

    public DescribeOssStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOssStatusResponseBodyData extends TeaModel {
        /**
         * <p>The name of the OSS bucket for delivering authentication information.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-aliyun-cloudauth-20250516xxxxxx</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>User activation status, SUCCESS indicates activated.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("UserStatus")
        public String userStatus;

        public static DescribeOssStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssStatusResponseBodyData self = new DescribeOssStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOssStatusResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeOssStatusResponseBodyData setUserStatus(String userStatus) {
            this.userStatus = userStatus;
            return this;
        }
        public String getUserStatus() {
            return this.userStatus;
        }

    }

}
