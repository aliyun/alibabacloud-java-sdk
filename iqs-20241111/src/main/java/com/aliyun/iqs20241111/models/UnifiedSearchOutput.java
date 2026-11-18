// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class UnifiedSearchOutput extends TeaModel {
    /**
     * <p>The consumed credits information.</p>
     */
    @NameInMap("costCredits")
    public UnifiedCostCredits costCredits;

    /**
     * <p>The web page search results.</p>
     */
    @NameInMap("pageItems")
    public java.util.List<UnifiedPageItem> pageItems;

    /**
     * <p>The search context information.</p>
     */
    @NameInMap("queryContext")
    public UnifiedQueryContext queryContext;

    /**
     * <p>The web page results.</p>
     * 
     * <strong>example:</strong>
     * <p>35E5608A-A737-2038-****-D9D34C6BFD9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The vertical API scenario-based results.</p>
     */
    @NameInMap("sceneItems")
    public java.util.List<UnifiedSceneItem> sceneItems;

    /**
     * <p>The basic search information.</p>
     */
    @NameInMap("searchInformation")
    public UnifiedSearchInformation searchInformation;

    public static UnifiedSearchOutput build(java.util.Map<String, ?> map) throws Exception {
        UnifiedSearchOutput self = new UnifiedSearchOutput();
        return TeaModel.build(map, self);
    }

    public UnifiedSearchOutput setCostCredits(UnifiedCostCredits costCredits) {
        this.costCredits = costCredits;
        return this;
    }
    public UnifiedCostCredits getCostCredits() {
        return this.costCredits;
    }

    public UnifiedSearchOutput setPageItems(java.util.List<UnifiedPageItem> pageItems) {
        this.pageItems = pageItems;
        return this;
    }
    public java.util.List<UnifiedPageItem> getPageItems() {
        return this.pageItems;
    }

    public UnifiedSearchOutput setQueryContext(UnifiedQueryContext queryContext) {
        this.queryContext = queryContext;
        return this;
    }
    public UnifiedQueryContext getQueryContext() {
        return this.queryContext;
    }

    public UnifiedSearchOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnifiedSearchOutput setSceneItems(java.util.List<UnifiedSceneItem> sceneItems) {
        this.sceneItems = sceneItems;
        return this;
    }
    public java.util.List<UnifiedSceneItem> getSceneItems() {
        return this.sceneItems;
    }

    public UnifiedSearchOutput setSearchInformation(UnifiedSearchInformation searchInformation) {
        this.searchInformation = searchInformation;
        return this;
    }
    public UnifiedSearchInformation getSearchInformation() {
        return this.searchInformation;
    }

}
