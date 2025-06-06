// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListToolsetsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<Toolset> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListToolsetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListToolsetsResponseBody self = new ListToolsetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListToolsetsResponseBody setData(java.util.List<Toolset> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Toolset> getData() {
        return this.data;
    }

    public ListToolsetsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListToolsetsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListToolsetsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
