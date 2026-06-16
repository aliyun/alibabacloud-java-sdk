// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListGroupsForResourceServerRequest extends TeaModel {
    /**
     * <p>The ID of the resource server application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListGroupsForResourceServerRequestFilter> filter;

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
     * <p>The maximum number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page of results. You do not need to provide this parameter for the first request. For subsequent requests, set this to the <code>NextToken</code> value from the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the scope.</p>
     * 
     * <strong>example:</strong>
     * <p>ress_nbte4bb3qqqnaq73rlmkqixxxx</p>
     */
    @NameInMap("ResourceServerScopeId")
    public String resourceServerScopeId;

    public static ListGroupsForResourceServerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsForResourceServerRequest self = new ListGroupsForResourceServerRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupsForResourceServerRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListGroupsForResourceServerRequest setFilter(java.util.List<ListGroupsForResourceServerRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListGroupsForResourceServerRequestFilter> getFilter() {
        return this.filter;
    }

    public ListGroupsForResourceServerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListGroupsForResourceServerRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGroupsForResourceServerRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGroupsForResourceServerRequest setResourceServerScopeId(String resourceServerScopeId) {
        this.resourceServerScopeId = resourceServerScopeId;
        return this;
    }
    public String getResourceServerScopeId() {
        return this.resourceServerScopeId;
    }

    public static class ListGroupsForResourceServerRequestFilter extends TeaModel {
        /**
         * <p>The name of the filter condition. The only valid value is GroupIds.</p>
         * 
         * <strong>example:</strong>
         * <p>GroupIds</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The values for the filter condition.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListGroupsForResourceServerRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsForResourceServerRequestFilter self = new ListGroupsForResourceServerRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListGroupsForResourceServerRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGroupsForResourceServerRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
