// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCustomPrivacyPoliciesRequest extends TeaModel {
    /**
     * <p>The custom term name. Left fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("CustomPrivacyPolicyNameStartsWith")
    public String customPrivacyPolicyNameStartsWith;

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
     * <p>The number of entries per page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The token for the previous page.</p>
     * 
     * <strong>example:</strong>
     * <p>PTxxxxxexample</p>
     */
    @NameInMap("PreviousToken")
    public String previousToken;

    public static ListCustomPrivacyPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomPrivacyPoliciesRequest self = new ListCustomPrivacyPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomPrivacyPoliciesRequest setCustomPrivacyPolicyNameStartsWith(String customPrivacyPolicyNameStartsWith) {
        this.customPrivacyPolicyNameStartsWith = customPrivacyPolicyNameStartsWith;
        return this;
    }
    public String getCustomPrivacyPolicyNameStartsWith() {
        return this.customPrivacyPolicyNameStartsWith;
    }

    public ListCustomPrivacyPoliciesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCustomPrivacyPoliciesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListCustomPrivacyPoliciesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCustomPrivacyPoliciesRequest setPreviousToken(String previousToken) {
        this.previousToken = previousToken;
        return this;
    }
    public String getPreviousToken() {
        return this.previousToken;
    }

}
