// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCredentialsRequest extends TeaModel {
    @NameInMap("CredentialIds")
    public java.util.List<String> credentialIds;

    @NameInMap("CredentialTypes")
    public java.util.List<String> credentialTypes;

    @NameInMap("Filter")
    public java.util.List<ListCredentialsRequestFilter> filter;

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

    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    public static ListCredentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCredentialsRequest self = new ListCredentialsRequest();
        return TeaModel.build(map, self);
    }

    public ListCredentialsRequest setCredentialIds(java.util.List<String> credentialIds) {
        this.credentialIds = credentialIds;
        return this;
    }
    public java.util.List<String> getCredentialIds() {
        return this.credentialIds;
    }

    public ListCredentialsRequest setCredentialTypes(java.util.List<String> credentialTypes) {
        this.credentialTypes = credentialTypes;
        return this;
    }
    public java.util.List<String> getCredentialTypes() {
        return this.credentialTypes;
    }

    public ListCredentialsRequest setFilter(java.util.List<ListCredentialsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListCredentialsRequestFilter> getFilter() {
        return this.filter;
    }

    public ListCredentialsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCredentialsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCredentialsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCredentialsRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public static class ListCredentialsRequestFilter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CredentialIdentifier</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListCredentialsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListCredentialsRequestFilter self = new ListCredentialsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListCredentialsRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCredentialsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
