// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListMetastoreMigrationsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MetastoreType")
    public String metastoreType;

    @NameInMap("Name")
    public String name;

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

    public static ListMetastoreMigrationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetastoreMigrationsRequest self = new ListMetastoreMigrationsRequest();
        return TeaModel.build(map, self);
    }

    public ListMetastoreMigrationsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListMetastoreMigrationsRequest setMetastoreType(String metastoreType) {
        this.metastoreType = metastoreType;
        return this;
    }
    public String getMetastoreType() {
        return this.metastoreType;
    }

    public ListMetastoreMigrationsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMetastoreMigrationsRequest setOrderCol(String orderCol) {
        this.orderCol = orderCol;
        return this;
    }
    public String getOrderCol() {
        return this.orderCol;
    }

    public ListMetastoreMigrationsRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListMetastoreMigrationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMetastoreMigrationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMetastoreMigrationsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
