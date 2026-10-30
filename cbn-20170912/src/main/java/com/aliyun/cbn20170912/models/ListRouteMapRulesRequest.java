// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListRouteMapRulesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate a parameter value on your client to ensure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: sends a check request and does not query the route map rules. Check items include whether required parameters are specified, request format, and service limits. If the check fails, the corresponding error is returned. If the check succeeds, the error code DryRunOperation is returned.</li>
     * <li><strong>false</strong> (default): sends a normal request and directly queries the route map rules after the check succeeds.</li>
     * </ul>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The information about the filter conditions.</p>
     * <p>You can specify up to 5 filter conditions at a time.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListRouteMapRulesRequestFilter> filter;

    /**
     * <p>The number of entries to return on each page in a paginated query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. Valid values:</p>
     * <ul>
     * <li>You do not need to specify this parameter for the first query or when no next query is available.</li>
     * <li>If a next query is available, set this parameter to the <strong>NextToken</strong> value returned by the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dd20****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the route map to query.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-0a1b2c3d4e5f6a7b8</p>
     */
    @NameInMap("RouteMapId")
    public String routeMapId;

    /**
     * <p>The list of route map rule IDs to query. This parameter and filter conditions can be used together for matching, and they have an AND relationship.</p>
     */
    @NameInMap("RouteMapRuleIds")
    public java.util.List<String> routeMapRuleIds;

    public static ListRouteMapRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRouteMapRulesRequest self = new ListRouteMapRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListRouteMapRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListRouteMapRulesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ListRouteMapRulesRequest setFilter(java.util.List<ListRouteMapRulesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListRouteMapRulesRequestFilter> getFilter() {
        return this.filter;
    }

    public ListRouteMapRulesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRouteMapRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRouteMapRulesRequest setRouteMapId(String routeMapId) {
        this.routeMapId = routeMapId;
        return this;
    }
    public String getRouteMapId() {
        return this.routeMapId;
    }

    public ListRouteMapRulesRequest setRouteMapRuleIds(java.util.List<String> routeMapRuleIds) {
        this.routeMapRuleIds = routeMapRuleIds;
        return this;
    }
    public java.util.List<String> getRouteMapRuleIds() {
        return this.routeMapRuleIds;
    }

    public static class ListRouteMapRulesRequestFilter extends TeaModel {
        /**
         * <p>The filter condition. Valid values:</p>
         * <ul>
         * <li><strong>Name</strong>: the name of the route map rule.</li>
         * <li><strong>Priority</strong>: the priority of the route map rule.</li>
         * </ul>
         * <p>By default, multiple filter conditions have an AND relationship. A match succeeds only when all filter conditions are met.</p>
         * <p>You can specify up to 5 filter conditions at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter condition.</p>
         * <p>Specify the filter value based on the Key parameter. You can specify multiple filter values for a single key. Multiple filter values have an OR relationship. A match succeeds if any of the filter values is met.</p>
         * <p>You can specify up to 5 filter values for a single filter condition.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListRouteMapRulesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListRouteMapRulesRequestFilter self = new ListRouteMapRulesRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListRouteMapRulesRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListRouteMapRulesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
