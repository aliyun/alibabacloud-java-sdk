// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListRouteMapsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate a value for this parameter on your client to ensure that the value is unique across different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request may be different.</p>
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
     * <li><strong>true</strong>: sends a check request without performing the query. The system checks whether required parameters are specified, the request format, and service limits. If the check fails, the corresponding error is returned. If the check succeeds, the error code <code>DryRunOperation</code> is returned.</li>
     * <li><strong>false</strong> (default): sends a normal request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The filter conditions.</p>
     * <p>You can specify up to 5 filter conditions at a time.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListRouteMapsRequestFilter> filter;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100.
     * If you do not specify the MaxResults parameter, pagination is not used. After you call the operation, the value of MaxResults indicates the total number of entries. If you specify the MaxResults parameter, pagination is used. After you call the operation, the value of MaxResults indicates the number of entries on the current page. We recommend that you set MaxResults to 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. Valid values:</p>
     * <ul>
     * <li>If this is the first query or no next query is available, you do not need to specify this parameter.</li>
     * <li>If a next query is available, set the value to the <strong>NextToken</strong> value returned from the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dd20****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-0a1b2c3d4e5f6a7b8</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The IDs of the route maps to query. If you do not specify this parameter, all route maps are queried.</p>
     */
    @NameInMap("RouteMapIds")
    public java.util.List<String> routeMapIds;

    public static ListRouteMapsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRouteMapsRequest self = new ListRouteMapsRequest();
        return TeaModel.build(map, self);
    }

    public ListRouteMapsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListRouteMapsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ListRouteMapsRequest setFilter(java.util.List<ListRouteMapsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListRouteMapsRequestFilter> getFilter() {
        return this.filter;
    }

    public ListRouteMapsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRouteMapsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRouteMapsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListRouteMapsRequest setRouteMapIds(java.util.List<String> routeMapIds) {
        this.routeMapIds = routeMapIds;
        return this;
    }
    public java.util.List<String> getRouteMapIds() {
        return this.routeMapIds;
    }

    public static class ListRouteMapsRequestFilter extends TeaModel {
        /**
         * <p>The filter condition. Valid values:</p>
         * <ul>
         * <li><strong>Direction</strong>: the direction of the route map.</li>
         * <li><strong>Name</strong>: the name of the route map.</li>
         * <li><strong>Priority</strong>: the priority of the route map.</li>
         * </ul>
         * <p>By default, multiple filter conditions are connected by an AND logical operator. A route map must meet all filter conditions to be considered a match.</p>
         * <p>You can specify up to 5 filter conditions at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>Priority</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter condition.</p>
         * <p>Specify the filter value based on the <strong>Key</strong>. You can specify multiple filter values for a single <strong>Key</strong>. Multiple filter values are connected by an OR logical operator. A route map that meets any of the filter values is considered a match for the filter condition.</p>
         * <p>You can specify up to 5 filter values for a single filter condition.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListRouteMapsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListRouteMapsRequestFilter self = new ListRouteMapsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListRouteMapsRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListRouteMapsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
