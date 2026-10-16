// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListOAuth2CredentialProvidersRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token used to retrieve the next page of results.</p>
     * <p>Leave this parameter empty for the first request.
     * For subsequent requests, specify the NextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6mmxm9MUzOLyiXaWmj3GOT8</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The name of the TokenVault.</p>
     */
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
