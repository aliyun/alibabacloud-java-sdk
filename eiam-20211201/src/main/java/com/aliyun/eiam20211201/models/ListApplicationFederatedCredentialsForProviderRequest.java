// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationFederatedCredentialsForProviderRequest extends TeaModel {
    /**
     * <p>联邦凭证提供方ID</p>
     * 
     * <strong>example:</strong>
     * <p>fcp_adasd12dxxxxx</p>
     */
    @NameInMap("FederatedCredentialProviderId")
    public String federatedCredentialProviderId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>分页查询时每页行数。默认值为20，最大值为100。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>查询凭证（Token），取值为上一次API调用返回的NextToken参数值。</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>查询上一页凭证（Token），取值为上一次API调用返回的previousToken参数值。</p>
     * 
     * <strong>example:</strong>
     * <p>PTxxxxxexample</p>
     */
    @NameInMap("PreviousToken")
    public String previousToken;

    public static ListApplicationFederatedCredentialsForProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationFederatedCredentialsForProviderRequest self = new ListApplicationFederatedCredentialsForProviderRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationFederatedCredentialsForProviderRequest setFederatedCredentialProviderId(String federatedCredentialProviderId) {
        this.federatedCredentialProviderId = federatedCredentialProviderId;
        return this;
    }
    public String getFederatedCredentialProviderId() {
        return this.federatedCredentialProviderId;
    }

    public ListApplicationFederatedCredentialsForProviderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListApplicationFederatedCredentialsForProviderRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationFederatedCredentialsForProviderRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationFederatedCredentialsForProviderRequest setPreviousToken(String previousToken) {
        this.previousToken = previousToken;
        return this;
    }
    public String getPreviousToken() {
        return this.previousToken;
    }

}
