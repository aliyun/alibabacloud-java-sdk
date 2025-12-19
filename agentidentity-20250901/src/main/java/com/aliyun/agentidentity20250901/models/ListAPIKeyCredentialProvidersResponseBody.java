// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListAPIKeyCredentialProvidersResponseBody extends TeaModel {
    @NameInMap("APIKeyCredentialProviders")
    public java.util.List<ListAPIKeyCredentialProvidersResponseBodyAPIKeyCredentialProviders> APIKeyCredentialProviders;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAWbTEdBU0yvszsl8EEXALb8=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>4D51596A-8A87-565B-8EDE-45141A02F11C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>452</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAPIKeyCredentialProvidersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAPIKeyCredentialProvidersResponseBody self = new ListAPIKeyCredentialProvidersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAPIKeyCredentialProvidersResponseBody setAPIKeyCredentialProviders(java.util.List<ListAPIKeyCredentialProvidersResponseBodyAPIKeyCredentialProviders> APIKeyCredentialProviders) {
        this.APIKeyCredentialProviders = APIKeyCredentialProviders;
        return this;
    }
    public java.util.List<ListAPIKeyCredentialProvidersResponseBodyAPIKeyCredentialProviders> getAPIKeyCredentialProviders() {
        return this.APIKeyCredentialProviders;
    }

    public ListAPIKeyCredentialProvidersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAPIKeyCredentialProvidersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAPIKeyCredentialProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAPIKeyCredentialProvidersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAPIKeyCredentialProvidersResponseBodyAPIKeyCredentialProviders extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>api-key-dash-scope</p>
         */
        @NameInMap("APIKeyCredentialProviderName")
        public String APIKeyCredentialProviderName;

        /**
         * <strong>example:</strong>
         * <p>2025-12-18T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:tokenvault/default/apikeycredentialprovider/api-key-dash-scope</p>
         */
        @NameInMap("CredentialProviderArn")
        public String credentialProviderArn;

        /**
         * <strong>example:</strong>
         * <p>example provider</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2025-12-18T06:19:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListAPIKeyCredentialProvidersResponseBodyAPIKeyCredentialProviders build(java.util.Map<String, ?> map) throws Exception {
            ListAPIKeyCredentialProvidersResponseBodyAPIKeyCredentialProviders self = new ListAPIKeyCredentialProvidersResponseBodyAPIKeyCredentialProviders();
            return TeaModel.build(map, self);
        }

        public ListAPIKeyCredentialProvidersResponseBodyAPIKeyCredentialProviders setAPIKeyCredentialProviderName(String APIKeyCredentialProviderName) {
            this.APIKeyCredentialProviderName = APIKeyCredentialProviderName;
            return this;
        }
        public String getAPIKeyCredentialProviderName() {
            return this.APIKeyCredentialProviderName;
        }

        public ListAPIKeyCredentialProvidersResponseBodyAPIKeyCredentialProviders setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAPIKeyCredentialProvidersResponseBodyAPIKeyCredentialProviders setCredentialProviderArn(String credentialProviderArn) {
            this.credentialProviderArn = credentialProviderArn;
            return this;
        }
        public String getCredentialProviderArn() {
            return this.credentialProviderArn;
        }

        public ListAPIKeyCredentialProvidersResponseBodyAPIKeyCredentialProviders setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAPIKeyCredentialProvidersResponseBodyAPIKeyCredentialProviders setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
