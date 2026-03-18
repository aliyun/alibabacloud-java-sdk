// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCredentialProvidersRequest extends TeaModel {
    /**
     * <p>认证令牌提供商ID列表。</p>
     */
    @NameInMap("CredentialProviderIds")
    public java.util.List<String> credentialProviderIds;

    /**
     * <p>认证令牌提供商类型列表。</p>
     */
    @NameInMap("CredentialProviderTypes")
    public java.util.List<String> credentialProviderTypes;

    @NameInMap("Filter")
    public java.util.List<ListCredentialProvidersRequestFilter> filter;

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
     * <p>认证令牌提供商状态列表。</p>
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
         * <strong>example:</strong>
         * <p>CredentialProviderName</p>
         */
        @NameInMap("Name")
        public String name;

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
