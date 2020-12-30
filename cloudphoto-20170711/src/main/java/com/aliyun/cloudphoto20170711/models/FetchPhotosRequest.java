// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class FetchPhotosRequest extends TeaModel {
    @NameInMap("State")
    public String state;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("Order")
    public String order;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    public static FetchPhotosRequest build(java.util.Map<String, ?> map) throws Exception {
        FetchPhotosRequest self = new FetchPhotosRequest();
        return TeaModel.build(map, self);
    }

    public FetchPhotosRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public FetchPhotosRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public FetchPhotosRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public FetchPhotosRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public FetchPhotosRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public FetchPhotosRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public FetchPhotosRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
