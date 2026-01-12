// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListKnowledgeBasesOutput extends TeaModel {
    @NameInMap("items")
    public java.util.List<KnowledgeBase> items;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("total")
    public Long total;

    public static ListKnowledgeBasesOutput build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBasesOutput self = new ListKnowledgeBasesOutput();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBasesOutput setItems(java.util.List<KnowledgeBase> items) {
        this.items = items;
        return this;
    }
    public java.util.List<KnowledgeBase> getItems() {
        return this.items;
    }

    public ListKnowledgeBasesOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListKnowledgeBasesOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListKnowledgeBasesOutput setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
