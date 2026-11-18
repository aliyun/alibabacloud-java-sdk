// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GenericSearchResult extends TeaModel {
    /**
     * <p>The web content list.</p>
     */
    @NameInMap("pageItems")
    public java.util.List<ScorePageItem> pageItems;

    /**
     * <p>The query context information.</p>
     */
    @NameInMap("queryContext")
    public QueryContext queryContext;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of scenario-specific query results, such as structured results for time and weather.</p>
     */
    @NameInMap("sceneItems")
    public java.util.List<SceneItem> sceneItems;

    /**
     * <p>The search information.</p>
     */
    @NameInMap("searchInformation")
    public SearchInformation searchInformation;

    /**
     * <p>The Weibo list.</p>
     */
    @NameInMap("weiboItems")
    public java.util.List<WeiboItem> weiboItems;

    public static GenericSearchResult build(java.util.Map<String, ?> map) throws Exception {
        GenericSearchResult self = new GenericSearchResult();
        return TeaModel.build(map, self);
    }

    public GenericSearchResult setPageItems(java.util.List<ScorePageItem> pageItems) {
        this.pageItems = pageItems;
        return this;
    }
    public java.util.List<ScorePageItem> getPageItems() {
        return this.pageItems;
    }

    public GenericSearchResult setQueryContext(QueryContext queryContext) {
        this.queryContext = queryContext;
        return this;
    }
    public QueryContext getQueryContext() {
        return this.queryContext;
    }

    public GenericSearchResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenericSearchResult setSceneItems(java.util.List<SceneItem> sceneItems) {
        this.sceneItems = sceneItems;
        return this;
    }
    public java.util.List<SceneItem> getSceneItems() {
        return this.sceneItems;
    }

    public GenericSearchResult setSearchInformation(SearchInformation searchInformation) {
        this.searchInformation = searchInformation;
        return this;
    }
    public SearchInformation getSearchInformation() {
        return this.searchInformation;
    }

    public GenericSearchResult setWeiboItems(java.util.List<WeiboItem> weiboItems) {
        this.weiboItems = weiboItems;
        return this;
    }
    public java.util.List<WeiboItem> getWeiboItems() {
        return this.weiboItems;
    }

}
