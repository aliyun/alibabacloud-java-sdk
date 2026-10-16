// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListAPIKeyCredentialProvidersRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token used to retrieve the next page of results. Leave this parameter empty for the first request. For subsequent requests, specify the NextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l8i017XhgKLf/HqWDGD375</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("TokenVaultName")
    public String tokenVaultName;

    public static ListAPIKeyCredentialProvidersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAPIKeyCredentialProvidersRequest self = new ListAPIKeyCredentialProvidersRequest();
        return TeaModel.build(map, self);
    }

    public ListAPIKeyCredentialProvidersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAPIKeyCredentialProvidersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAPIKeyCredentialProvidersRequest setTokenVaultName(String tokenVaultName) {
        this.tokenVaultName = tokenVaultName;
        return this;
    }
    public String getTokenVaultName() {
        return this.tokenVaultName;
    }

}
