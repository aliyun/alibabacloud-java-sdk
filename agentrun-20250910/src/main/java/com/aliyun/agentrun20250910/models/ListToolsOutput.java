// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListToolsOutput extends TeaModel {
    @NameInMap("data")
    public java.util.List<ToolListItem> data;

    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("total")
    public Integer total;

    public static ListToolsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListToolsOutput self = new ListToolsOutput();
        return TeaModel.build(map, self);
    }

    public ListToolsOutput setData(java.util.List<ToolListItem> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ToolListItem> getData() {
        return this.data;
    }

    public ListToolsOutput setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListToolsOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListToolsOutput setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
