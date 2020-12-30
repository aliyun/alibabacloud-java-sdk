// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class FetchMomentPhotosRequest extends TeaModel {
    @NameInMap("MomentId")
    public Long momentId;

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

    public static FetchMomentPhotosRequest build(java.util.Map<String, ?> map) throws Exception {
        FetchMomentPhotosRequest self = new FetchMomentPhotosRequest();
        return TeaModel.build(map, self);
    }

    public FetchMomentPhotosRequest setMomentId(Long momentId) {
        this.momentId = momentId;
        return this;
    }
    public Long getMomentId() {
        return this.momentId;
    }

    public FetchMomentPhotosRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public FetchMomentPhotosRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public FetchMomentPhotosRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public FetchMomentPhotosRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public FetchMomentPhotosRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public FetchMomentPhotosRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
