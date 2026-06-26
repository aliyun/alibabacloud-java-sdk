// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListAPIKeyCredentialProvidersResponseBody extends TeaModel {
    @NameInMap("APIKeyCredentialProviders")
    public java.util.List<ListAPIKeyCredentialProvidersResponseBodyAPIKeyCredentialProviders> APIKeyCredentialProviders;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("APIKeyCredentialProviderName")
        public String APIKeyCredentialProviderName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CredentialProviderArn")
        public String credentialProviderArn;

        @NameInMap("Description")
        public String description;

        @NameInMap("TokenVaultName")
        public String tokenVaultName;

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

        public ListAPIKeyCredentialProvidersResponseBodyAPIKeyCredentialProviders setTokenVaultName(String tokenVaultName) {
            this.tokenVaultName = tokenVaultName;
            return this;
        }
        public String getTokenVaultName() {
            return this.tokenVaultName;
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
