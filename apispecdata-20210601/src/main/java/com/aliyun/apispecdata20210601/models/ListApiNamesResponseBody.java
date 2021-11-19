// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apispecdata20210601.models;

import com.aliyun.tea.*;

public class ListApiNamesResponseBody extends TeaModel {
    // 数组，返回示例目录。
    @NameInMap("ApiNames")
    public java.util.List<String> apiNames;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListApiNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApiNamesResponseBody self = new ListApiNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApiNamesResponseBody setApiNames(java.util.List<String> apiNames) {
        this.apiNames = apiNames;
        return this;
    }
    public java.util.List<String> getApiNames() {
        return this.apiNames;
    }

    public ListApiNamesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApiNamesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApiNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApiNamesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
