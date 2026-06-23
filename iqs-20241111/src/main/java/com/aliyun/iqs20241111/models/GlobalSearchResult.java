// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GlobalSearchResult extends TeaModel {
    /**
     * <p>The list of web page content.</p>
     */
    @NameInMap("pageItems")
    public java.util.List<GlobalPageItem> pageItems;

    /**
     * <p>The query context.</p>
     */
    @NameInMap("queryContext")
    public GlobalQueryContext queryContext;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The scenario-specific vertical API recall results.</p>
     */
    @NameInMap("sceneItems")
    public java.util.List<GlobalSceneItem> sceneItems;

    /**
     * <p>The search information.</p>
     */
    @NameInMap("searchInformation")
    public GlobalSearchInformation searchInformation;

    public static GlobalSearchResult build(java.util.Map<String, ?> map) throws Exception {
        GlobalSearchResult self = new GlobalSearchResult();
        return TeaModel.build(map, self);
    }

    public GlobalSearchResult setPageItems(java.util.List<GlobalPageItem> pageItems) {
        this.pageItems = pageItems;
        return this;
    }
    public java.util.List<GlobalPageItem> getPageItems() {
        return this.pageItems;
    }

    public GlobalSearchResult setQueryContext(GlobalQueryContext queryContext) {
        this.queryContext = queryContext;
        return this;
    }
    public GlobalQueryContext getQueryContext() {
        return this.queryContext;
    }

    public GlobalSearchResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GlobalSearchResult setSceneItems(java.util.List<GlobalSceneItem> sceneItems) {
        this.sceneItems = sceneItems;
        return this;
    }
    public java.util.List<GlobalSceneItem> getSceneItems() {
        return this.sceneItems;
    }

    public GlobalSearchResult setSearchInformation(GlobalSearchInformation searchInformation) {
        this.searchInformation = searchInformation;
        return this;
    }
    public GlobalSearchInformation getSearchInformation() {
        return this.searchInformation;
    }

}
