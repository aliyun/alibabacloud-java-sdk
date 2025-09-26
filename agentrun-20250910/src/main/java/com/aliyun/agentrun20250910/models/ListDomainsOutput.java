// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListDomainsOutput extends TeaModel {
    @NameInMap("items")
    public java.util.List<DomainInfo> items;

    @NameInMap("pageNumber")
    public String pageNumber;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("totalCount")
    public String totalCount;

    public static ListDomainsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListDomainsOutput self = new ListDomainsOutput();
        return TeaModel.build(map, self);
    }

    public ListDomainsOutput setItems(java.util.List<DomainInfo> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DomainInfo> getItems() {
        return this.items;
    }

    public ListDomainsOutput setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListDomainsOutput setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListDomainsOutput setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

}
