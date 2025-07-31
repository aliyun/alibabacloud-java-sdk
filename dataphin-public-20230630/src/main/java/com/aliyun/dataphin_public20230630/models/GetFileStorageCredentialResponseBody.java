// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetFileStorageCredentialResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageCredential")
    public GetFileStorageCredentialResponseBodyStorageCredential storageCredential;

    @NameInMap("Success")
    public Boolean success;

    public static GetFileStorageCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileStorageCredentialResponseBody self = new GetFileStorageCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileStorageCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFileStorageCredentialResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetFileStorageCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFileStorageCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileStorageCredentialResponseBody setStorageCredential(GetFileStorageCredentialResponseBodyStorageCredential storageCredential) {
        this.storageCredential = storageCredential;
        return this;
    }
    public GetFileStorageCredentialResponseBodyStorageCredential getStorageCredential() {
        return this.storageCredential;
    }

    public GetFileStorageCredentialResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFileStorageCredentialResponseBodyStorageCredential extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>temp.akId</p>
         */
        @NameInMap("AccessId")
        public String accessId;

        /**
         * <strong>example:</strong>
         * <p>temp.akKey</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <strong>example:</strong>
         * <p>dataphin</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <strong>example:</strong>
         * <p>oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <strong>example:</strong>
         * <p>17343434343434</p>
         */
        @NameInMap("Expiration")
        public Long expiration;

        /**
         * <strong>example:</strong>
         * <p>1023231111/abc</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <p>region</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>temp.token</p>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        /**
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        public static GetFileStorageCredentialResponseBodyStorageCredential build(java.util.Map<String, ?> map) throws Exception {
            GetFileStorageCredentialResponseBodyStorageCredential self = new GetFileStorageCredentialResponseBodyStorageCredential();
            return TeaModel.build(map, self);
        }

        public GetFileStorageCredentialResponseBodyStorageCredential setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public GetFileStorageCredentialResponseBodyStorageCredential setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public GetFileStorageCredentialResponseBodyStorageCredential setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetFileStorageCredentialResponseBodyStorageCredential setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetFileStorageCredentialResponseBodyStorageCredential setExpiration(Long expiration) {
            this.expiration = expiration;
            return this;
        }
        public Long getExpiration() {
            return this.expiration;
        }

        public GetFileStorageCredentialResponseBodyStorageCredential setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public GetFileStorageCredentialResponseBodyStorageCredential setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetFileStorageCredentialResponseBodyStorageCredential setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public GetFileStorageCredentialResponseBodyStorageCredential setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

}
