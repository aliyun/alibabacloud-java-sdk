// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class PaginationInfo extends TeaModel {
    @NameInMap("limit")
    public Integer limit;

    @NameInMap("page")
    public Integer page;

    @NameInMap("total")
    public Integer total;

    @NameInMap("totalPages")
    public Integer totalPages;

    public static PaginationInfo build(java.util.Map<String, ?> map) throws Exception {
        PaginationInfo self = new PaginationInfo();
        return TeaModel.build(map, self);
    }

    public PaginationInfo setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public PaginationInfo setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public PaginationInfo setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public PaginationInfo setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

}
