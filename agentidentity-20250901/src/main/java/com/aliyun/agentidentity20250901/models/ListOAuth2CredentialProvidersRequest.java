// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListOAuth2CredentialProvidersRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("TokenVaultName")
    public String tokenVaultName;

    public static ListOAuth2CredentialProvidersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOAuth2CredentialProvidersRequest self = new ListOAuth2CredentialProvidersRequest();
        return TeaModel.build(map, self);
    }

    public ListOAuth2CredentialProvidersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOAuth2CredentialProvidersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOAuth2CredentialProvidersRequest setTokenVaultName(String tokenVaultName) {
        this.tokenVaultName = tokenVaultName;
        return this;
    }
    public String getTokenVaultName() {
        return this.tokenVaultName;
    }

}
