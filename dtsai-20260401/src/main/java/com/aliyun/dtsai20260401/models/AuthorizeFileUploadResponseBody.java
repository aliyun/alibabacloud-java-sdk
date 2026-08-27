// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsai20260401.models;

import com.aliyun.tea.*;

public class AuthorizeFileUploadResponseBody extends TeaModel {
    /**
     * <p>The temporary AccessKey ID used for OSS PostObject.</p>
     * 
     * <strong>example:</strong>
     * <p>STS.NV5xxx</p>
     */
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("Authorizations")
    public java.util.List<AuthorizeFileUploadResponseBodyAuthorizations> authorizations;

    /**
     * <p>The destination OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>dts-ai-upload-cn-beijing7500163e0eae09</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <p>The Base64-encoded PostObject policy, which includes the ObjectKey and file size limits.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJleHBpcmF0aW9uIjo...</p>
     */
    @NameInMap("EncodedPolicy")
    public String encodedPolicy;

    /**
     * <p>OSS Endpoint</p>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-beijing.aliyuncs.com</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The parameter [Query] is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>The business-level HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The object key that must be used as-is for the upload.</p>
     * 
     * <strong>example:</strong>
     * <p>0a1b_123456_0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("ObjectKey")
    public String objectKey;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A30D0930-xxxx-xxxx-xxxx-C2C661CC8B58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Security Token Service (STS) temporary security token.</p>
     * 
     * <strong>example:</strong>
     * <p>CAISxxx</p>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The policy signature.</p>
     * 
     * <strong>example:</strong>
     * <p>masked-signature</p>
     */
    @NameInMap("Signature")
    public String signature;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AuthorizeFileUploadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeFileUploadResponseBody self = new AuthorizeFileUploadResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthorizeFileUploadResponseBody setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public AuthorizeFileUploadResponseBody setAuthorizations(java.util.List<AuthorizeFileUploadResponseBodyAuthorizations> authorizations) {
        this.authorizations = authorizations;
        return this;
    }
    public java.util.List<AuthorizeFileUploadResponseBodyAuthorizations> getAuthorizations() {
        return this.authorizations;
    }

    public AuthorizeFileUploadResponseBody setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public AuthorizeFileUploadResponseBody setEncodedPolicy(String encodedPolicy) {
        this.encodedPolicy = encodedPolicy;
        return this;
    }
    public String getEncodedPolicy() {
        return this.encodedPolicy;
    }

    public AuthorizeFileUploadResponseBody setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public AuthorizeFileUploadResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AuthorizeFileUploadResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AuthorizeFileUploadResponseBody setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public AuthorizeFileUploadResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AuthorizeFileUploadResponseBody setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

    public AuthorizeFileUploadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuthorizeFileUploadResponseBody setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AuthorizeFileUploadResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public AuthorizeFileUploadResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AuthorizeFileUploadResponseBodyAuthorizations extends TeaModel {
        @NameInMap("EncodedPolicy")
        public String encodedPolicy;

        @NameInMap("ObjectKey")
        public String objectKey;

        @NameInMap("Signature")
        public String signature;

        public static AuthorizeFileUploadResponseBodyAuthorizations build(java.util.Map<String, ?> map) throws Exception {
            AuthorizeFileUploadResponseBodyAuthorizations self = new AuthorizeFileUploadResponseBodyAuthorizations();
            return TeaModel.build(map, self);
        }

        public AuthorizeFileUploadResponseBodyAuthorizations setEncodedPolicy(String encodedPolicy) {
            this.encodedPolicy = encodedPolicy;
            return this;
        }
        public String getEncodedPolicy() {
            return this.encodedPolicy;
        }

        public AuthorizeFileUploadResponseBodyAuthorizations setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public AuthorizeFileUploadResponseBodyAuthorizations setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
