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
     * <ul>
     * <li><p>If you do not specify this parameter, the default value is 20.</p>
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
     * <p>The token that identifies the start of the next page of results.</p>
     * <ul>
     * <li>If you do not specify this parameter, the system returns the first page of results.</li>
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
         * <p>The name of the field to filter. Valid values:</p>
         * <ul>
         * <li><p>AuthorizationRuleId: the ID of the authorization rule.</p>
         * </li>
         * <li><p>AuthorizationRuleNameStartWith: the leftmost characters of the authorization rule name.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AuthorizationRuleId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of values for the field to filter.</p>
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
