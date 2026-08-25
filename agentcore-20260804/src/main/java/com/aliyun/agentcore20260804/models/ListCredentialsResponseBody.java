// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListCredentialsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("items")
    public java.util.List<ListCredentialsResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCredentialsResponseBody self = new ListCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCredentialsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCredentialsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCredentialsResponseBody setItems(java.util.List<ListCredentialsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListCredentialsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListCredentialsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCredentialsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCredentialsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCredentialsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListCredentialsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCredentialsResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("boundAgentsCounts")
        public Integer boundAgentsCounts;

        /**
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>cred-123456</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;apiKey&quot;:&quot;****************&quot;}</p>
         */
        @NameInMap("credentialMetadata")
        public String credentialMetadata;

        /**
         * <strong>example:</strong>
         * <p>apiKey</p>
         */
        @NameInMap("credentialType")
        public String credentialType;

        /**
         * <strong>example:</strong>
         * <p>线上环境调用模型服务使用的 API Key</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>model-api-key</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListCredentialsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListCredentialsResponseBodyItems self = new ListCredentialsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListCredentialsResponseBodyItems setBoundAgentsCounts(Integer boundAgentsCounts) {
            this.boundAgentsCounts = boundAgentsCounts;
            return this;
        }
        public Integer getBoundAgentsCounts() {
            return this.boundAgentsCounts;
        }

        public ListCredentialsResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListCredentialsResponseBodyItems setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public ListCredentialsResponseBodyItems setCredentialMetadata(String credentialMetadata) {
            this.credentialMetadata = credentialMetadata;
            return this;
        }
        public String getCredentialMetadata() {
            return this.credentialMetadata;
        }

        public ListCredentialsResponseBodyItems setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public ListCredentialsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCredentialsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCredentialsResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListCredentialsResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListCredentialsResponseBodyItems setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
