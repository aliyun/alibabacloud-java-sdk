// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCredentialProvidersRequest extends TeaModel {
    /**
     * <p>List of credential provider IDs.</p>
     */
    @NameInMap("CredentialProviderIds")
    public java.util.List<String> credentialProviderIds;

    /**
     * <p>List of credential provider types.</p>
     */
    @NameInMap("CredentialProviderTypes")
    public java.util.List<String> credentialProviderTypes;

    /**
     * <p>List of filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListCredentialProvidersRequestFilter> filter;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Page size for paged queries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Query token.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>List of credential provider statuses.</p>
     */
    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    public static ListCredentialProvidersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCredentialProvidersRequest self = new ListCredentialProvidersRequest();
        return TeaModel.build(map, self);
    }

    public ListCredentialProvidersRequest setCredentialProviderIds(java.util.List<String> credentialProviderIds) {
        this.credentialProviderIds = credentialProviderIds;
        return this;
    }
    public java.util.List<String> getCredentialProviderIds() {
        return this.credentialProviderIds;
    }

    public ListCredentialProvidersRequest setCredentialProviderTypes(java.util.List<String> credentialProviderTypes) {
        this.credentialProviderTypes = credentialProviderTypes;
        return this;
    }
    public java.util.List<String> getCredentialProviderTypes() {
        return this.credentialProviderTypes;
    }

    public ListCredentialProvidersRequest setFilter(java.util.List<ListCredentialProvidersRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListCredentialProvidersRequestFilter> getFilter() {
        return this.filter;
    }

    public ListCredentialProvidersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCredentialProvidersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCredentialProvidersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCredentialProvidersRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public static class ListCredentialProvidersRequestFilter extends TeaModel {
        /**
         * <p>Filter condition name. Valid values:</p>
         * <ul>
         * <li><p>CredentialProviderName: Credential provider name.</p>
         * </li>
         * <li><p>CredentialProviderIdentifier: Credential provider identifier.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CredentialProviderName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>List of filter condition values.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListCredentialProvidersRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListCredentialProvidersRequestFilter self = new ListCredentialProvidersRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListCredentialProvidersRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCredentialProvidersRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
