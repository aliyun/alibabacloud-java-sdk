// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetDocumentChunkListRequest extends TeaModel {
    @NameInMap("chunkIdList")
    public java.util.List<String> chunkIdList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>182364872346</p>
     */
    @NameInMap("docId")
    public String docId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dsjgfdjgfxxx</p>
     */
    @NameInMap("libraryId")
    public String libraryId;

    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>gmtCreate</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("searchQuery")
    public String searchQuery;

    public static GetDocumentChunkListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentChunkListRequest self = new GetDocumentChunkListRequest();
        return TeaModel.build(map, self);
    }

    public GetDocumentChunkListRequest setChunkIdList(java.util.List<String> chunkIdList) {
        this.chunkIdList = chunkIdList;
        return this;
    }
    public java.util.List<String> getChunkIdList() {
        return this.chunkIdList;
    }

    public GetDocumentChunkListRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public GetDocumentChunkListRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public GetDocumentChunkListRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public GetDocumentChunkListRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetDocumentChunkListRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GetDocumentChunkListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetDocumentChunkListRequest setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
        return this;
    }
    public String getSearchQuery() {
        return this.searchQuery;
    }

}
