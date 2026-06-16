// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForAuthorizationRuleRequest extends TeaModel {
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
    public java.util.List<ListApplicationsForAuthorizationRuleRequestFilter> filter;

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
     * <p>The maximum number of records to return in a paged query.</p>
     * <ul>
     * <li><p>The default value is 20.</p>
     * </li>
     * <li><p>The maximum value cannot exceed 100.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to mark the start of the next page for a paged query.</p>
     * <ul>
     * <li>If you do not specify this parameter, the query starts from the first page.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListApplicationsForAuthorizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForAuthorizationRuleRequest self = new ListApplicationsForAuthorizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForAuthorizationRuleRequest setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public ListApplicationsForAuthorizationRuleRequest setFilter(java.util.List<ListApplicationsForAuthorizationRuleRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListApplicationsForAuthorizationRuleRequestFilter> getFilter() {
        return this.filter;
    }

    public ListApplicationsForAuthorizationRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListApplicationsForAuthorizationRuleRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationsForAuthorizationRuleRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListApplicationsForAuthorizationRuleRequestFilter extends TeaModel {
        /**
         * <p>The name of the field to filter. Valid values:</p>
         * <ul>
         * <li>ApplicationId: The application ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ApplicationId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of values for the filter field.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListApplicationsForAuthorizationRuleRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsForAuthorizationRuleRequestFilter self = new ListApplicationsForAuthorizationRuleRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListApplicationsForAuthorizationRuleRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApplicationsForAuthorizationRuleRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
