// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListCredentialsOutput extends TeaModel {
    @NameInMap("items")
    public java.util.List<CredentialListItem> items;

    @NameInMap("pageNumber")
    public String pageNumber;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("total")
    public String total;

    public static ListCredentialsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListCredentialsOutput self = new ListCredentialsOutput();
        return TeaModel.build(map, self);
    }

    public ListCredentialsOutput setItems(java.util.List<CredentialListItem> items) {
        this.items = items;
        return this;
    }
    public java.util.List<CredentialListItem> getItems() {
        return this.items;
    }

    public ListCredentialsOutput setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListCredentialsOutput setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListCredentialsOutput setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

}
