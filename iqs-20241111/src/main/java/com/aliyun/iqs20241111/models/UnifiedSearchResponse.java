// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class UnifiedSearchResponse extends TeaModel {
    @NameInMap("costCredits")
    public UnifiedCostCredits costCredits;

    @NameInMap("pageItems")
    public java.util.List<UnifiedPageItem> pageItems;

    @NameInMap("queryContext")
    public UnifiedQueryContext queryContext;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("sceneItems")
    public java.util.List<UnifiedSceneItem> sceneItems;

    @NameInMap("searchInformation")
    public UnifiedSearchInformation searchInformation;

    public static UnifiedSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        UnifiedSearchResponse self = new UnifiedSearchResponse();
        return TeaModel.build(map, self);
    }

    public UnifiedSearchResponse setCostCredits(UnifiedCostCredits costCredits) {
        this.costCredits = costCredits;
        return this;
    }
    public UnifiedCostCredits getCostCredits() {
        return this.costCredits;
    }

    public UnifiedSearchResponse setPageItems(java.util.List<UnifiedPageItem> pageItems) {
        this.pageItems = pageItems;
        return this;
    }
    public java.util.List<UnifiedPageItem> getPageItems() {
        return this.pageItems;
    }

    public UnifiedSearchResponse setQueryContext(UnifiedQueryContext queryContext) {
        this.queryContext = queryContext;
        return this;
    }
    public UnifiedQueryContext getQueryContext() {
        return this.queryContext;
    }

    public UnifiedSearchResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnifiedSearchResponse setSceneItems(java.util.List<UnifiedSceneItem> sceneItems) {
        this.sceneItems = sceneItems;
        return this;
    }
    public java.util.List<UnifiedSceneItem> getSceneItems() {
        return this.sceneItems;
    }

    public UnifiedSearchResponse setSearchInformation(UnifiedSearchInformation searchInformation) {
        this.searchInformation = searchInformation;
        return this;
    }
    public UnifiedSearchInformation getSearchInformation() {
        return this.searchInformation;
    }

}
