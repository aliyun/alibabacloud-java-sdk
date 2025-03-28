// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ArtifactTempBucketToken extends TeaModel {
    @NameInMap("credentials")
    public ArtifactTempBucketTokenCredentials credentials;

    @NameInMap("ossBucketName")
    public String ossBucketName;

    @NameInMap("ossObjectName")
    public String ossObjectName;

    @NameInMap("ossRegion")
    public String ossRegion;

    public static ArtifactTempBucketToken build(java.util.Map<String, ?> map) throws Exception {
        ArtifactTempBucketToken self = new ArtifactTempBucketToken();
        return TeaModel.build(map, self);
    }

    public ArtifactTempBucketToken setCredentials(ArtifactTempBucketTokenCredentials credentials) {
        this.credentials = credentials;
        return this;
    }
    public ArtifactTempBucketTokenCredentials getCredentials() {
        return this.credentials;
    }

    public ArtifactTempBucketToken setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public ArtifactTempBucketToken setOssObjectName(String ossObjectName) {
        this.ossObjectName = ossObjectName;
        return this;
    }
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    public ArtifactTempBucketToken setOssRegion(String ossRegion) {
        this.ossRegion = ossRegion;
        return this;
    }
    public String getOssRegion() {
        return this.ossRegion;
    }

    public static class ArtifactTempBucketTokenCredentials extends TeaModel {
        @NameInMap("accessKeyId")
        public String accessKeyId;

        @NameInMap("accessKeySecret")
        public String accessKeySecret;

        @NameInMap("securityToken")
        public String securityToken;

        public static ArtifactTempBucketTokenCredentials build(java.util.Map<String, ?> map) throws Exception {
            ArtifactTempBucketTokenCredentials self = new ArtifactTempBucketTokenCredentials();
            return TeaModel.build(map, self);
        }

        public ArtifactTempBucketTokenCredentials setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public ArtifactTempBucketTokenCredentials setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public ArtifactTempBucketTokenCredentials setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

}
