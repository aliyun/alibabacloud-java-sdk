// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUsersForResourceServerRequest extends TeaModel {
    /**
     * <p>The ID of the Resource Server application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>A list of filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListUsersForResourceServerRequestFilter> filter;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries per page for paged queries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page. Set this parameter to the value of NextToken returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>权限唯一标识。</p>
     * 
     * <strong>example:</strong>
     * <p>ress_nbte4bb3qqqnaq73rlmkqixxxx</p>
     */
    @NameInMap("ResourceServerScopeId")
    public String resourceServerScopeId;

    public static ListUsersForResourceServerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForResourceServerRequest self = new ListUsersForResourceServerRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersForResourceServerRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListUsersForResourceServerRequest setFilter(java.util.List<ListUsersForResourceServerRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListUsersForResourceServerRequestFilter> getFilter() {
        return this.filter;
    }

    public ListUsersForResourceServerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListUsersForResourceServerRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUsersForResourceServerRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUsersForResourceServerRequest setResourceServerScopeId(String resourceServerScopeId) {
        this.resourceServerScopeId = resourceServerScopeId;
        return this;
    }
    public String getResourceServerScopeId() {
        return this.resourceServerScopeId;
    }

    public static class ListUsersForResourceServerRequestFilter extends TeaModel {
        /**
         * <p>The name of the filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>UserIds</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>A list of values for the filter condition.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListUsersForResourceServerRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListUsersForResourceServerRequestFilter self = new ListUsersForResourceServerRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListUsersForResourceServerRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUsersForResourceServerRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
