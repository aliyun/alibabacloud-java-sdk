// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUsersForAuthorizationRuleRequest extends TeaModel {
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
    public java.util.List<ListUsersForAuthorizationRuleRequestFilter> filter;

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
     * <p>The maximum number of entries per page.</p>
     * <ul>
     * <li><p>Default value: 20.</p>
     * </li>
     * <li><p>Maximum value: 100.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the starting position for the next page of results.</p>
     * <ul>
     * <li>If not specified, the query starts from the first page.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListUsersForAuthorizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForAuthorizationRuleRequest self = new ListUsersForAuthorizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersForAuthorizationRuleRequest setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public ListUsersForAuthorizationRuleRequest setFilter(java.util.List<ListUsersForAuthorizationRuleRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListUsersForAuthorizationRuleRequestFilter> getFilter() {
        return this.filter;
    }

    public ListUsersForAuthorizationRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListUsersForAuthorizationRuleRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUsersForAuthorizationRuleRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListUsersForAuthorizationRuleRequestFilter extends TeaModel {
        /**
         * <p>The name of the filter field. Valid values:</p>
         * <ul>
         * <li>UserId: the account ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The values of the filter field.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListUsersForAuthorizationRuleRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListUsersForAuthorizationRuleRequestFilter self = new ListUsersForAuthorizationRuleRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListUsersForAuthorizationRuleRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUsersForAuthorizationRuleRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
