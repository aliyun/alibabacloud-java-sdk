// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListAuthorizationRulesRequest extends TeaModel {
    /**
     * <p>过滤条件</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListAuthorizationRulesRequestFilter> filter;

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
         * <p>过滤条件名称。</p>
         * 
         * <strong>example:</strong>
         * <p>AuthorizationRuleId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>过滤条件值。</p>
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
