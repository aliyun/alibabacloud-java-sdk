// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListAuthorizationResourcesRequest extends TeaModel {
    /**
     * <p>授权规则标识。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
     */
    @NameInMap("AuthorizationRuleId")
    public String authorizationRuleId;

    /**
     * <p>过滤条件</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListAuthorizationResourcesRequestFilter> filter;

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
         * <p>过滤条件名称。</p>
         * 
         * <strong>example:</strong>
         * <p>AuthorizationResourceEntityId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>过滤条件值。</p>
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
