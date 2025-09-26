// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListCredentialsOutput extends TeaModel {
    @NameInMap("items")
    public CredentialListItem items;

    @NameInMap("pageNum")
    public String pageNum;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("total")
    public String total;

    public static ListCredentialsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListCredentialsOutput self = new ListCredentialsOutput();
        return TeaModel.build(map, self);
    }

    public ListCredentialsOutput setItems(CredentialListItem items) {
        this.items = items;
        return this;
    }
    public CredentialListItem getItems() {
        return this.items;
    }

    public ListCredentialsOutput setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
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
