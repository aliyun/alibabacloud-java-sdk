// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetPackageStorageCredentialResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Credential")
    public GetPackageStorageCredentialResponseBodyCredential credential;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPackageStorageCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPackageStorageCredentialResponseBody self = new GetPackageStorageCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPackageStorageCredentialResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetPackageStorageCredentialResponseBody setCredential(GetPackageStorageCredentialResponseBodyCredential credential) {
        this.credential = credential;
        return this;
    }
    public GetPackageStorageCredentialResponseBodyCredential getCredential() {
        return this.credential;
    }

    public GetPackageStorageCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPackageStorageCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPackageStorageCredentialResponseBodyCredential extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Expiration")
        public String expiration;

        @NameInMap("KeyPrefix")
        public String keyPrefix;

        @NameInMap("OssInternalEndpoint")
        public String ossInternalEndpoint;

        @NameInMap("OssPublicEndpoint")
        public String ossPublicEndpoint;

        @NameInMap("OssVpcEndpoint")
        public String ossVpcEndpoint;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecurityToken")
        public String securityToken;

        public static GetPackageStorageCredentialResponseBodyCredential build(java.util.Map<String, ?> map) throws Exception {
            GetPackageStorageCredentialResponseBodyCredential self = new GetPackageStorageCredentialResponseBodyCredential();
            return TeaModel.build(map, self);
        }

        public GetPackageStorageCredentialResponseBodyCredential setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetPackageStorageCredentialResponseBodyCredential setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetPackageStorageCredentialResponseBodyCredential setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetPackageStorageCredentialResponseBodyCredential setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public GetPackageStorageCredentialResponseBodyCredential setKeyPrefix(String keyPrefix) {
            this.keyPrefix = keyPrefix;
            return this;
        }
        public String getKeyPrefix() {
            return this.keyPrefix;
        }

        public GetPackageStorageCredentialResponseBodyCredential setOssInternalEndpoint(String ossInternalEndpoint) {
            this.ossInternalEndpoint = ossInternalEndpoint;
            return this;
        }
        public String getOssInternalEndpoint() {
            return this.ossInternalEndpoint;
        }

        public GetPackageStorageCredentialResponseBodyCredential setOssPublicEndpoint(String ossPublicEndpoint) {
            this.ossPublicEndpoint = ossPublicEndpoint;
            return this;
        }
        public String getOssPublicEndpoint() {
            return this.ossPublicEndpoint;
        }

        public GetPackageStorageCredentialResponseBodyCredential setOssVpcEndpoint(String ossVpcEndpoint) {
            this.ossVpcEndpoint = ossVpcEndpoint;
            return this;
        }
        public String getOssVpcEndpoint() {
            return this.ossVpcEndpoint;
        }

        public GetPackageStorageCredentialResponseBodyCredential setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetPackageStorageCredentialResponseBodyCredential setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

}
