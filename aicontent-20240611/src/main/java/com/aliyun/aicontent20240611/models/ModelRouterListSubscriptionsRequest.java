// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterListSubscriptionsRequest extends TeaModel {
    /**
     * <p>Filters by balance type (permanent/monthly).</p>
     * 
     * <strong>example:</strong>
     * <p>permanent</p>
     */
    @NameInMap("balanceType")
    public String balanceType;

    /**
     * <p>The maximum number of results to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Do not specify this parameter for the first query. For subsequent queries, specify the value returned from the previous query. Set to &quot;&quot; when no more data is available. Set to &quot;5&quot; when there is a next page.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;5&quot; or &quot;&quot;</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Filters by status (active/stopped).</p>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("status")
    public String status;

    public static ModelRouterListSubscriptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterListSubscriptionsRequest self = new ModelRouterListSubscriptionsRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterListSubscriptionsRequest setBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }
    public String getBalanceType() {
        return this.balanceType;
    }

    public ModelRouterListSubscriptionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterListSubscriptionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ModelRouterListSubscriptionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
