// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListOperationLogsRequest extends TeaModel {
    @NameInMap("EntityStatus")
    public String entityStatus;

    // 以逗号分隔的日志类型，包含 Resource
    @NameInMap("EntityTypes")
    public String entityTypes;

    // 以逗号分隔的操作状态
    @NameInMap("OperationStatus")
    public String operationStatus;

    // 以逗号分隔的操作
    @NameInMap("Operations")
    public String operations;

    // 排序顺序， 顺序：ASC，倒序：DESC
    @NameInMap("Order")
    public String order;

    // 当前页，页码从1开始
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 每页返回的输出数目
    @NameInMap("PageSize")
    public Integer pageSize;

    // 排序字段
    @NameInMap("SortBy")
    public String sortBy;

    public static ListOperationLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationLogsRequest self = new ListOperationLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationLogsRequest setEntityStatus(String entityStatus) {
        this.entityStatus = entityStatus;
        return this;
    }
    public String getEntityStatus() {
        return this.entityStatus;
    }

    public ListOperationLogsRequest setEntityTypes(String entityTypes) {
        this.entityTypes = entityTypes;
        return this;
    }
    public String getEntityTypes() {
        return this.entityTypes;
    }

    public ListOperationLogsRequest setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }
    public String getOperationStatus() {
        return this.operationStatus;
    }

    public ListOperationLogsRequest setOperations(String operations) {
        this.operations = operations;
        return this;
    }
    public String getOperations() {
        return this.operations;
    }

    public ListOperationLogsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListOperationLogsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListOperationLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOperationLogsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
