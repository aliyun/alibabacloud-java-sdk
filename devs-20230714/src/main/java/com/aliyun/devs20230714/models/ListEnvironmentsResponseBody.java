// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListEnvironmentsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<Environment> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListEnvironmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentsResponseBody self = new ListEnvironmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentsResponseBody setData(java.util.List<Environment> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Environment> getData() {
        return this.data;
    }

    public ListEnvironmentsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListEnvironmentsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListEnvironmentsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
