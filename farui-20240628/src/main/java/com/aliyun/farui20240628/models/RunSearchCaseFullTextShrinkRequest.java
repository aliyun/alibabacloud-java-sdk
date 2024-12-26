// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunSearchCaseFullTextShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>farui</p>
     */
    @NameInMap("appId")
    public String appId;

    @NameInMap("filterCondition")
    public String filterConditionShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("pageParam")
    public String pageParamShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public String query;

    @NameInMap("queryKeywords")
    public String queryKeywordsShrink;

    @NameInMap("sortKeyAndDirection")
    public String sortKeyAndDirectionShrink;

    @NameInMap("thread")
    public String threadShrink;

    public static RunSearchCaseFullTextShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunSearchCaseFullTextShrinkRequest self = new RunSearchCaseFullTextShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunSearchCaseFullTextShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RunSearchCaseFullTextShrinkRequest setFilterConditionShrink(String filterConditionShrink) {
        this.filterConditionShrink = filterConditionShrink;
        return this;
    }
    public String getFilterConditionShrink() {
        return this.filterConditionShrink;
    }

    public RunSearchCaseFullTextShrinkRequest setPageParamShrink(String pageParamShrink) {
        this.pageParamShrink = pageParamShrink;
        return this;
    }
    public String getPageParamShrink() {
        return this.pageParamShrink;
    }

    public RunSearchCaseFullTextShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public RunSearchCaseFullTextShrinkRequest setQueryKeywordsShrink(String queryKeywordsShrink) {
        this.queryKeywordsShrink = queryKeywordsShrink;
        return this;
    }
    public String getQueryKeywordsShrink() {
        return this.queryKeywordsShrink;
    }

    public RunSearchCaseFullTextShrinkRequest setSortKeyAndDirectionShrink(String sortKeyAndDirectionShrink) {
        this.sortKeyAndDirectionShrink = sortKeyAndDirectionShrink;
        return this;
    }
    public String getSortKeyAndDirectionShrink() {
        return this.sortKeyAndDirectionShrink;
    }

    public RunSearchCaseFullTextShrinkRequest setThreadShrink(String threadShrink) {
        this.threadShrink = threadShrink;
        return this;
    }
    public String getThreadShrink() {
        return this.threadShrink;
    }

}
