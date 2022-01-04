// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListMigrationWorkflowInstancesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrderCol")
    public String orderCol;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public String status;

    public static ListMigrationWorkflowInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMigrationWorkflowInstancesRequest self = new ListMigrationWorkflowInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListMigrationWorkflowInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListMigrationWorkflowInstancesRequest setOrderCol(String orderCol) {
        this.orderCol = orderCol;
        return this;
    }
    public String getOrderCol() {
        return this.orderCol;
    }

    public ListMigrationWorkflowInstancesRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListMigrationWorkflowInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMigrationWorkflowInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMigrationWorkflowInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
