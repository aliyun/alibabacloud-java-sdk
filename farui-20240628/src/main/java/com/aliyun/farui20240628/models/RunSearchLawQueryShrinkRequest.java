// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunSearchLawQueryShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>farui</p>
     */
    @NameInMap("appId")
    public String appId;

    @NameInMap("filterCondition")
    public String filterConditionShrink;

    @NameInMap("pageParam")
    public String pageParamShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public String query;

    @NameInMap("queryKeywords")
    public String queryKeywordsShrink;

    @NameInMap("thread")
    public String threadShrink;

    public static RunSearchLawQueryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunSearchLawQueryShrinkRequest self = new RunSearchLawQueryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunSearchLawQueryShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RunSearchLawQueryShrinkRequest setFilterConditionShrink(String filterConditionShrink) {
        this.filterConditionShrink = filterConditionShrink;
        return this;
    }
    public String getFilterConditionShrink() {
        return this.filterConditionShrink;
    }

    public RunSearchLawQueryShrinkRequest setPageParamShrink(String pageParamShrink) {
        this.pageParamShrink = pageParamShrink;
        return this;
    }
    public String getPageParamShrink() {
        return this.pageParamShrink;
    }

    public RunSearchLawQueryShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public RunSearchLawQueryShrinkRequest setQueryKeywordsShrink(String queryKeywordsShrink) {
        this.queryKeywordsShrink = queryKeywordsShrink;
        return this;
    }
    public String getQueryKeywordsShrink() {
        return this.queryKeywordsShrink;
    }

    public RunSearchLawQueryShrinkRequest setThreadShrink(String threadShrink) {
        this.threadShrink = threadShrink;
        return this;
    }
    public String getThreadShrink() {
        return this.threadShrink;
    }

}
