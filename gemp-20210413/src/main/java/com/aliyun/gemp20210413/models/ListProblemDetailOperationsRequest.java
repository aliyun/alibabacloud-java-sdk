// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListProblemDetailOperationsRequest extends TeaModel {
    // 幂等校验
    @NameInMap("clientToken")
    public String clientToken;

    // 时间排序
    @NameInMap("createTimeSort")
    public String createTimeSort;

    // 页
    @NameInMap("pageNumber")
    public Integer pageNumber;

    // 行
    @NameInMap("pageSize")
    public Integer pageSize;

    // 故障id
    @NameInMap("problemId")
    public Long problemId;

    public static ListProblemDetailOperationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProblemDetailOperationsRequest self = new ListProblemDetailOperationsRequest();
        return TeaModel.build(map, self);
    }

    public ListProblemDetailOperationsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListProblemDetailOperationsRequest setCreateTimeSort(String createTimeSort) {
        this.createTimeSort = createTimeSort;
        return this;
    }
    public String getCreateTimeSort() {
        return this.createTimeSort;
    }

    public ListProblemDetailOperationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProblemDetailOperationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProblemDetailOperationsRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

}
