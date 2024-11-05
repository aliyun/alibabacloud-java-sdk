// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GenericSearchResult extends TeaModel {
    @NameInMap("pageItems")
    public java.util.List<ScorePageItem> pageItems;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("searchInformation")
    public SearchInformation searchInformation;

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

    public GenericSearchResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
