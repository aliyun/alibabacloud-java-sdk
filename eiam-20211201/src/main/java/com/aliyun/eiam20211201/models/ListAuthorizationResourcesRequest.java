// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListAuthorizationResourcesRequest extends TeaModel {
    /**
     * <p>The authorization rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
     */
    @NameInMap("AuthorizationRuleId")
    public String authorizationRuleId;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListAuthorizationResourcesRequestFilter> filter;

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
     * <p>The maximum number of entries to return on each page.</p>
     * <ul>
     * <li><p>The default value is 20.</p>
     * </li>
     * <li><p>The maximum value is 100.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to start the next page of results.</p>
     * <ul>
     * <li>If you do not specify this parameter, the query starts from the first page.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListAuthorizationResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationResourcesRequest self = new ListAuthorizationResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationResourcesRequest setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public ListAuthorizationResourcesRequest setFilter(java.util.List<ListAuthorizationResourcesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListAuthorizationResourcesRequestFilter> getFilter() {
        return this.filter;
    }

    public ListAuthorizationResourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAuthorizationResourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAuthorizationResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListAuthorizationResourcesRequestFilter extends TeaModel {
        /**
         * <p>The filter field name. Valid values:</p>
         * <ul>
         * <li><p>AuthorizationResourceEntityType: The type of the associated resource entity.</p>
         * </li>
         * <li><p>AuthorizationResourceEntityId: The ID of the associated resource entity.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AuthorizationResourceEntityId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>A list of filter field values.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListAuthorizationResourcesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizationResourcesRequestFilter self = new ListAuthorizationResourcesRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListAuthorizationResourcesRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAuthorizationResourcesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
