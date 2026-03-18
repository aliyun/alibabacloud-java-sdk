// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ListAuthenticationTokensRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_ngtkgrrxxxxktg5eao6z4xxxxx</p>
     */
    @NameInMap("consumerId")
    public String consumerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_example_identifier</p>
     */
    @NameInMap("credentialProviderIdentifier")
    public String credentialProviderIdentifier;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("expired")
    public Boolean expired;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("revoked")
    public Boolean revoked;

    public static ListAuthenticationTokensRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthenticationTokensRequest self = new ListAuthenticationTokensRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthenticationTokensRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public ListAuthenticationTokensRequest setCredentialProviderIdentifier(String credentialProviderIdentifier) {
        this.credentialProviderIdentifier = credentialProviderIdentifier;
        return this;
    }
    public String getCredentialProviderIdentifier() {
        return this.credentialProviderIdentifier;
    }

    public ListAuthenticationTokensRequest setExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }
    public Boolean getExpired() {
        return this.expired;
    }

    public ListAuthenticationTokensRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListAuthenticationTokensRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAuthenticationTokensRequest setRevoked(Boolean revoked) {
        this.revoked = revoked;
        return this;
    }
    public Boolean getRevoked() {
        return this.revoked;
    }

}
