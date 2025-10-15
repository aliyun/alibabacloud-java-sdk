// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListFederatedCredentialProvidersRequest extends TeaModel {
    /**
     * <p>联邦凭证提供方名称</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("FederatedCredentialProviderName")
    public String federatedCredentialProviderName;

    /**
     * <p>联邦凭证提供方类型</p>
     * 
     * <strong>example:</strong>
     * <p>pkcs7</p>
     */
    @NameInMap("FederatedCredentialProviderType")
    public String federatedCredentialProviderType;

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
