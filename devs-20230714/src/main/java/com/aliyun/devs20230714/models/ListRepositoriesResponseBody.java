// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListRepositoriesResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<Repository> data;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ListRepositoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoriesResponseBody self = new ListRepositoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoriesResponseBody setData(java.util.List<Repository> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Repository> getData() {
        return this.data;
    }

    public ListRepositoriesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListRepositoriesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRepositoriesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
