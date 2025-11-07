// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeOssStatusV2ResponseBody extends TeaModel {
    /**
     * <p>Return code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B506328A-D84B-4750-82C7-6A207C585CF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result information.</p>
     */
    @NameInMap("ResultObject")
    public DescribeOssStatusV2ResponseBodyResultObject resultObject;

    /**
     * <p>Whether the response was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeOssStatusV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssStatusV2ResponseBody self = new DescribeOssStatusV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssStatusV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeOssStatusV2ResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeOssStatusV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeOssStatusV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssStatusV2ResponseBody setResultObject(DescribeOssStatusV2ResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeOssStatusV2ResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeOssStatusV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOssStatusV2ResponseBodyResultObject extends TeaModel {
        /**
         * <p>Bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-aliyun-cloudauth-20250516xxxxxx</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>Region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>User activation status, <strong>SUCCESS</strong> indicates activated.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("UserStatus")
        public String userStatus;

        public static DescribeOssStatusV2ResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssStatusV2ResponseBodyResultObject self = new DescribeOssStatusV2ResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeOssStatusV2ResponseBodyResultObject setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeOssStatusV2ResponseBodyResultObject setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeOssStatusV2ResponseBodyResultObject setUserStatus(String userStatus) {
            this.userStatus = userStatus;
            return this;
        }
        public String getUserStatus() {
            return this.userStatus;
        }

    }

}
