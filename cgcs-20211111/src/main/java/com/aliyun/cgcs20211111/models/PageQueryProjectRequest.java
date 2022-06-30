// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class PageQueryProjectRequest extends TeaModel {
    // projectId or projectName like
    @NameInMap("KeySearch")
    public String keySearch;

    // 请求操作人Id
    @NameInMap("OperatorId")
    public String operatorId;

    // 请求操作人类型
    @NameInMap("OperatorType")
    public String operatorType;

    // 当前页码，默认1
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页项数，默认20,最大100
    @NameInMap("PageSize")
    public Integer pageSize;

    public static PageQueryProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PageQueryProjectRequest self = new PageQueryProjectRequest();
        return TeaModel.build(map, self);
    }

    public PageQueryProjectRequest setKeySearch(String keySearch) {
        this.keySearch = keySearch;
        return this;
    }
    public String getKeySearch() {
        return this.keySearch;
    }

    public PageQueryProjectRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public PageQueryProjectRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public PageQueryProjectRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public PageQueryProjectRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
