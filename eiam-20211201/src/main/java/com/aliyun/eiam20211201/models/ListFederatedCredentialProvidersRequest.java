// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListFederatedCredentialProvidersRequest extends TeaModel {
    /**
     * <p>The name of the federated trust source.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("FederatedCredentialProviderName")
    public String federatedCredentialProviderName;

    /**
     * <p>The type of the federated trust source.</p>
     * 
     * <strong>example:</strong>
     * <p>pkcs7</p>
     */
    @NameInMap("FederatedCredentialProviderType")
    public String federatedCredentialProviderType;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The token used to query the previous page.</p>
     * 
     * <strong>example:</strong>
     * <p>PTxxxxxexample</p>
     */
    @NameInMap("PreviousToken")
    public String previousToken;

    public static ListFederatedCredentialProvidersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFederatedCredentialProvidersRequest self = new ListFederatedCredentialProvidersRequest();
        return TeaModel.build(map, self);
    }

    public ListFederatedCredentialProvidersRequest setFederatedCredentialProviderName(String federatedCredentialProviderName) {
        this.federatedCredentialProviderName = federatedCredentialProviderName;
        return this;
    }
    public String getFederatedCredentialProviderName() {
        return this.federatedCredentialProviderName;
    }

    public ListFederatedCredentialProvidersRequest setFederatedCredentialProviderType(String federatedCredentialProviderType) {
        this.federatedCredentialProviderType = federatedCredentialProviderType;
        return this;
    }
    public String getFederatedCredentialProviderType() {
        return this.federatedCredentialProviderType;
    }

    public ListFederatedCredentialProvidersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListFederatedCredentialProvidersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListFederatedCredentialProvidersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFederatedCredentialProvidersRequest setPreviousToken(String previousToken) {
        this.previousToken = previousToken;
        return this;
    }
    public String getPreviousToken() {
        return this.previousToken;
    }

}
