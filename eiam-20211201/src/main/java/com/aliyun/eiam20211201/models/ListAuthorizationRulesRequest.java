// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListAuthorizationRulesRequest extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListAuthorizationRulesRequestFilter> filter;

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
     * <p>The maximum number of records per page.</p>
     * <ul>
     * <li><p>If this parameter is not specified, the default value is 20.</p>
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
     * <p>The token that marks the starting position of the next page.</p>
     * <ul>
     * <li>If this parameter is not specified, the query starts from the first page.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListAuthorizationRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationRulesRequest self = new ListAuthorizationRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationRulesRequest setFilter(java.util.List<ListAuthorizationRulesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListAuthorizationRulesRequestFilter> getFilter() {
        return this.filter;
    }

    public ListAuthorizationRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAuthorizationRulesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAuthorizationRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListAuthorizationRulesRequestFilter extends TeaModel {
        /**
         * <p>The name of the filter field. Valid values:</p>
         * <ul>
         * <li>AuthorizationRuleId: the authorization rule ID.</li>
         * <li>AuthorizationRuleNameStartWith: the prefix of the authorization rule name for fuzzy match.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AuthorizationRuleId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The values of the filter field.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListAuthorizationRulesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizationRulesRequestFilter self = new ListAuthorizationRulesRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListAuthorizationRulesRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAuthorizationRulesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
