// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetTokenResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the token.</p>
     */
    @NameInMap("Data")
    public GetTokenResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTokenResponseBody self = new GetTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTokenResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTokenResponseBody setData(GetTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTokenResponseBodyData getData() {
        return this.data;
    }

    public GetTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTokenResponseBodyData extends TeaModel {
        /**
         * <p>The AccessKey ID that is used to access OSS.</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The AccessKey secret used to access OSS.</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <p>The OSS bucket that is used to store the architecture image.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The OSS endpoint.</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The token that is used to access the Object Storage Service (OSS) bucket that stores the architecture image.</p>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        /**
         * <p>The OSS bucket that is used to save data snapshots.</p>
         */
        @NameInMap("SnapshotBucket")
        public String snapshotBucket;

        public static GetTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTokenResponseBodyData self = new GetTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTokenResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetTokenResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetTokenResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetTokenResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetTokenResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public GetTokenResponseBodyData setSnapshotBucket(String snapshotBucket) {
            this.snapshotBucket = snapshotBucket;
            return this;
        }
        public String getSnapshotBucket() {
            return this.snapshotBucket;
        }

    }

}
