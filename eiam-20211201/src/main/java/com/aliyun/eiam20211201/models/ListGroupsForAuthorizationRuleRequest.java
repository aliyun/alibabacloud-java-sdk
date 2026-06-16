// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListGroupsForAuthorizationRuleRequest extends TeaModel {
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
    public java.util.List<ListGroupsForAuthorizationRuleRequestFilter> filter;

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
     * <li><p>Default value: 20.</p>
     * </li>
     * <li><p>The value cannot exceed 100.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to start the next paged query.</p>
     * <ul>
     * <li>If you do not specify this parameter, the query starts from the first page.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListGroupsForAuthorizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsForAuthorizationRuleRequest self = new ListGroupsForAuthorizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupsForAuthorizationRuleRequest setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public ListGroupsForAuthorizationRuleRequest setFilter(java.util.List<ListGroupsForAuthorizationRuleRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListGroupsForAuthorizationRuleRequestFilter> getFilter() {
        return this.filter;
    }

    public ListGroupsForAuthorizationRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListGroupsForAuthorizationRuleRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGroupsForAuthorizationRuleRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListGroupsForAuthorizationRuleRequestFilter extends TeaModel {
        /**
         * <p>The name of the filter field. Valid values:</p>
         * <ul>
         * <li>GroupId: The group ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GroupId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The values of the filter field.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListGroupsForAuthorizationRuleRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsForAuthorizationRuleRequestFilter self = new ListGroupsForAuthorizationRuleRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListGroupsForAuthorizationRuleRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGroupsForAuthorizationRuleRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
