// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListSavedQueryRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("OrderCol")
    public String orderCol;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListSavedQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSavedQueryRequest self = new ListSavedQueryRequest();
        return TeaModel.build(map, self);
    }

    public ListSavedQueryRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListSavedQueryRequest setOrderCol(String orderCol) {
        this.orderCol = orderCol;
        return this;
    }
    public String getOrderCol() {
        return this.orderCol;
    }

    public ListSavedQueryRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListSavedQueryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSavedQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSavedQueryRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
