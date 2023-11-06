// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListContactFlowsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrderByField")
    public String orderByField;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("Type")
    public String type;

    public static ListContactFlowsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContactFlowsRequest self = new ListContactFlowsRequest();
        return TeaModel.build(map, self);
    }

    public ListContactFlowsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListContactFlowsRequest setOrderByField(String orderByField) {
        this.orderByField = orderByField;
        return this;
    }
    public String getOrderByField() {
        return this.orderByField;
    }

    public ListContactFlowsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListContactFlowsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListContactFlowsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListContactFlowsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
