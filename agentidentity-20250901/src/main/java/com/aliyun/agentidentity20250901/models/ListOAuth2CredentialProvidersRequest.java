// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListOAuth2CredentialProvidersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6mmxm9MUzOLyiXaWmj3GOT8</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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

}
