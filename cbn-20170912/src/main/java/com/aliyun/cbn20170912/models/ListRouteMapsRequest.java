// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListRouteMapsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
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
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run. The actual query is not performed. The system checks whether required parameters are specified, the request format, and service limits. If the request fails the dry run, the corresponding error is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
     * <li><strong>false</strong>: performs a normal request. This is the default value.</li>
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
     * If you do not specify the MaxResults parameter, pagination is not used. After you call the operation, the value of MaxResults indicates the total number of entries. If you specify the MaxResults parameter, pagination is used. After you call the operation, the value of MaxResults indicates the number of entries returned in the current query. We recommend that you set the MaxResults parameter to 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. Valid values:</p>
     * <ul>
     * <li>If this is the first query or no subsequent query is to be sent, you do not need to specify this parameter.</li>
     * <li>If a subsequent query is to be sent, set the value to the NextToken value returned from the previous API call.</li>
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
         * <p>By default, multiple filter conditions have a logical AND relationship. A route map is returned only when it meets all filter conditions.</p>
         * <p>You can specify up to 5 filter conditions at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>Priority</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter condition.</p>
         * <p>Specify the filter value based on the Key. You can specify multiple filter values for a single Key. Multiple filter values have a logical OR relationship. A route map is returned when it meets any of the filter values.</p>
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
