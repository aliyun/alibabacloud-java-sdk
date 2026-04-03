// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListIMBotsOutput extends TeaModel {
    @NameInMap("items")
    public java.util.List<IMBotInfo> items;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("total")
    public Integer total;

    public static ListIMBotsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListIMBotsOutput self = new ListIMBotsOutput();
        return TeaModel.build(map, self);
    }

    public ListIMBotsOutput setItems(java.util.List<IMBotInfo> items) {
        this.items = items;
        return this;
    }
    public java.util.List<IMBotInfo> getItems() {
        return this.items;
    }

    public ListIMBotsOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIMBotsOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListIMBotsOutput setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
