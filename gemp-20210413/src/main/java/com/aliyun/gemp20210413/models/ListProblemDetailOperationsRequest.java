// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListProblemDetailOperationsRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("createTimeSort")
    public String createTimeSort;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

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
