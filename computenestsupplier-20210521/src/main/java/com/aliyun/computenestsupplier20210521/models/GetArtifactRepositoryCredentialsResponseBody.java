// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetArtifactRepositoryCredentialsResponseBody extends TeaModel {
    @NameInMap("AvailableResources")
    public java.util.List<GetArtifactRepositoryCredentialsResponseBodyAvailableResources> availableResources;

    @NameInMap("Credentials")
    public GetArtifactRepositoryCredentialsResponseBodyCredentials credentials;

    /**
     * <strong>example:</strong>
     * <p>1526549792000</p>
     */
    @NameInMap("ExpireDate")
    public String expireDate;

    /**
     * <strong>example:</strong>
     * <p>94E89857-B994-44B6-9C4F-DBD200E9XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetArtifactRepositoryCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactRepositoryCredentialsResponseBody self = new GetArtifactRepositoryCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetArtifactRepositoryCredentialsResponseBody setAvailableResources(java.util.List<GetArtifactRepositoryCredentialsResponseBodyAvailableResources> availableResources) {
        this.availableResources = availableResources;
        return this;
    }
    public java.util.List<GetArtifactRepositoryCredentialsResponseBodyAvailableResources> getAvailableResources() {
        return this.availableResources;
    }

    public GetArtifactRepositoryCredentialsResponseBody setCredentials(GetArtifactRepositoryCredentialsResponseBodyCredentials credentials) {
        this.credentials = credentials;
        return this;
    }
    public GetArtifactRepositoryCredentialsResponseBodyCredentials getCredentials() {
        return this.credentials;
    }

    public GetArtifactRepositoryCredentialsResponseBody setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public GetArtifactRepositoryCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetArtifactRepositoryCredentialsResponseBodyAvailableResources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;/xxx/&quot;</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>computenest-artifacts-draft-cn-hangzhou</p>
         */
        @NameInMap("RepositoryName")
        public String repositoryName;

        public static GetArtifactRepositoryCredentialsResponseBodyAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            GetArtifactRepositoryCredentialsResponseBodyAvailableResources self = new GetArtifactRepositoryCredentialsResponseBodyAvailableResources();
            return TeaModel.build(map, self);
        }

        public GetArtifactRepositoryCredentialsResponseBodyAvailableResources setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetArtifactRepositoryCredentialsResponseBodyAvailableResources setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetArtifactRepositoryCredentialsResponseBodyAvailableResources setRepositoryName(String repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }
        public String getRepositoryName() {
            return this.repositoryName;
        }

    }

    public static class GetArtifactRepositoryCredentialsResponseBodyCredentials extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>STS.xxx</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <strong>example:</strong>
         * <p>eyJ0aW1lIjoiMTUyNjU0OTc5:0705733****</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Username")
        public String username;

        public static GetArtifactRepositoryCredentialsResponseBodyCredentials build(java.util.Map<String, ?> map) throws Exception {
            GetArtifactRepositoryCredentialsResponseBodyCredentials self = new GetArtifactRepositoryCredentialsResponseBodyCredentials();
            return TeaModel.build(map, self);
        }

        public GetArtifactRepositoryCredentialsResponseBodyCredentials setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetArtifactRepositoryCredentialsResponseBodyCredentials setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetArtifactRepositoryCredentialsResponseBodyCredentials setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetArtifactRepositoryCredentialsResponseBodyCredentials setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public GetArtifactRepositoryCredentialsResponseBodyCredentials setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
