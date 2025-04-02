// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class RequestUploadTokenResponseBody extends TeaModel {
    /**
     * <p>Args</p>
     */
    @NameInMap("Args")
    public java.util.Map<String, ?> args;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public RequestUploadTokenResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>AB8AB5EC-9636-421D-AE7C-BB227DFC95B0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RequestUploadTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RequestUploadTokenResponseBody self = new RequestUploadTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public RequestUploadTokenResponseBody setArgs(java.util.Map<String, ?> args) {
        this.args = args;
        return this;
    }
    public java.util.Map<String, ?> getArgs() {
        return this.args;
    }

    public RequestUploadTokenResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public RequestUploadTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RequestUploadTokenResponseBody setModel(RequestUploadTokenResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public RequestUploadTokenResponseBodyModel getModel() {
        return this.model;
    }

    public RequestUploadTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RequestUploadTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RequestUploadTokenResponseBodyModel extends TeaModel {
        /**
         * <p>OSS AccessKeyId</p>
         * 
         * <strong>example:</strong>
         * <p>STS.NXEGHKdjkdnINNgLiDE</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>OSS AccessKeySecret</p>
         * 
         * <strong>example:</strong>
         * <p>ikKgkNDGedInGEIngL</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <strong>example:</strong>
         * <p>oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <strong>example:</strong>
         * <p>Szi9v92mHNikdknfe</p>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        /**
         * <strong>example:</strong>
         * <p>symbolic-prod</p>
         */
        @NameInMap("UploadBucket")
        public String uploadBucket;

        /**
         * <strong>example:</strong>
         * <p>/335374903@iphoneos/</p>
         */
        @NameInMap("UploadDir")
        public String uploadDir;

        public static RequestUploadTokenResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            RequestUploadTokenResponseBodyModel self = new RequestUploadTokenResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public RequestUploadTokenResponseBodyModel setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public RequestUploadTokenResponseBodyModel setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public RequestUploadTokenResponseBodyModel setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public RequestUploadTokenResponseBodyModel setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public RequestUploadTokenResponseBodyModel setUploadBucket(String uploadBucket) {
            this.uploadBucket = uploadBucket;
            return this;
        }
        public String getUploadBucket() {
            return this.uploadBucket;
        }

        public RequestUploadTokenResponseBodyModel setUploadDir(String uploadDir) {
            this.uploadDir = uploadDir;
            return this;
        }
        public String getUploadDir() {
            return this.uploadDir;
        }

    }

}
