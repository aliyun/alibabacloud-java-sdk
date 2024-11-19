// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GenerateFileUploadURLResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GenerateFileUploadURLResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GenerateFileUploadURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateFileUploadURLResponseBody self = new GenerateFileUploadURLResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateFileUploadURLResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateFileUploadURLResponseBody setData(GenerateFileUploadURLResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateFileUploadURLResponseBodyData getData() {
        return this.data;
    }

    public GenerateFileUploadURLResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GenerateFileUploadURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateFileUploadURLResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateFileUploadURLResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://iotx-bucket-name.oss-***.aliyuncs.com">https://iotx-bucket-name.oss-***.aliyuncs.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("ObjectStorage")
        public String objectStorage;

        /**
         * <strong>example:</strong>
         * <p>cS8uRRy54Rsz****</p>
         */
        @NameInMap("OssAccessKeyId")
        public String ossAccessKeyId;

        /**
         * <strong>example:</strong>
         * <p>eyJleHBpcmF****</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <strong>example:</strong>
         * <p>v6lViO4FBvfquajQjg20K5hK****</p>
         */
        @NameInMap("Signature")
        public String signature;

        public static GenerateFileUploadURLResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateFileUploadURLResponseBodyData self = new GenerateFileUploadURLResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateFileUploadURLResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GenerateFileUploadURLResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GenerateFileUploadURLResponseBodyData setObjectStorage(String objectStorage) {
            this.objectStorage = objectStorage;
            return this;
        }
        public String getObjectStorage() {
            return this.objectStorage;
        }

        public GenerateFileUploadURLResponseBodyData setOssAccessKeyId(String ossAccessKeyId) {
            this.ossAccessKeyId = ossAccessKeyId;
            return this;
        }
        public String getOssAccessKeyId() {
            return this.ossAccessKeyId;
        }

        public GenerateFileUploadURLResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GenerateFileUploadURLResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
