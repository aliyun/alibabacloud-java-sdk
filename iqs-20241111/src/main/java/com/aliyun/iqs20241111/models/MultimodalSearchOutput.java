// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MultimodalSearchOutput extends TeaModel {
    @NameInMap("imageItems")
    public java.util.List<UnifiedImageItem> imageItems;

    @NameInMap("queryContext")
    public MultimodalQueryContext queryContext;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("searchInformation")
    public SearchInformation searchInformation;

    public static MultimodalSearchOutput build(java.util.Map<String, ?> map) throws Exception {
        MultimodalSearchOutput self = new MultimodalSearchOutput();
        return TeaModel.build(map, self);
    }

    public MultimodalSearchOutput setImageItems(java.util.List<UnifiedImageItem> imageItems) {
        this.imageItems = imageItems;
        return this;
    }
    public java.util.List<UnifiedImageItem> getImageItems() {
        return this.imageItems;
    }

    public MultimodalSearchOutput setQueryContext(MultimodalQueryContext queryContext) {
        this.queryContext = queryContext;
        return this;
    }
    public MultimodalQueryContext getQueryContext() {
        return this.queryContext;
    }

    public MultimodalSearchOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MultimodalSearchOutput setSearchInformation(SearchInformation searchInformation) {
        this.searchInformation = searchInformation;
        return this;
    }
    public SearchInformation getSearchInformation() {
        return this.searchInformation;
    }

}
