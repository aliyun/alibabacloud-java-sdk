// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAggTaskGroupsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[&quot;aggTaskGroup-xxx&quot;]</p>
     */
    @NameInMap("filterAggTaskGroupIds")
    public String filterAggTaskGroupIds;

    /**
     * <strong>example:</strong>
     * <p>[&quot;apiserver_request_total&quot;]</p>
     */
    @NameInMap("filterAggTaskGroupNames")
    public String filterAggTaskGroupNames;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>28036394xxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    @NameInMap("tags")
    public String tagsShrink;

    /**
     * <strong>example:</strong>
     * <p>rw-pq4apob9jm</p>
     */
    @NameInMap("targetPrometheusId")
    public String targetPrometheusId;

    public static ListAggTaskGroupsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAggTaskGroupsShrinkRequest self = new ListAggTaskGroupsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAggTaskGroupsShrinkRequest setFilterAggTaskGroupIds(String filterAggTaskGroupIds) {
        this.filterAggTaskGroupIds = filterAggTaskGroupIds;
        return this;
    }
    public String getFilterAggTaskGroupIds() {
        return this.filterAggTaskGroupIds;
    }

    public ListAggTaskGroupsShrinkRequest setFilterAggTaskGroupNames(String filterAggTaskGroupNames) {
        this.filterAggTaskGroupNames = filterAggTaskGroupNames;
        return this;
    }
    public String getFilterAggTaskGroupNames() {
        return this.filterAggTaskGroupNames;
    }

    public ListAggTaskGroupsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAggTaskGroupsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAggTaskGroupsShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListAggTaskGroupsShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListAggTaskGroupsShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public ListAggTaskGroupsShrinkRequest setTargetPrometheusId(String targetPrometheusId) {
        this.targetPrometheusId = targetPrometheusId;
        return this;
    }
    public String getTargetPrometheusId() {
        return this.targetPrometheusId;
    }

}
