// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListBlueprintInstancesRequest extends TeaModel {
    @NameInMap("BlueprintInstanceId")
    public String blueprintInstanceId;

    @NameInMap("BlueprintType")
    public String blueprintType;

    @NameInMap("CreatorUid")
    public String creatorUid;

    @NameInMap("ExecuteType")
    public String executeType;

    @NameInMap("NamePrefix")
    public String namePrefix;

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

    public static ListBlueprintInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBlueprintInstancesRequest self = new ListBlueprintInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListBlueprintInstancesRequest setBlueprintInstanceId(String blueprintInstanceId) {
        this.blueprintInstanceId = blueprintInstanceId;
        return this;
    }
    public String getBlueprintInstanceId() {
        return this.blueprintInstanceId;
    }

    public ListBlueprintInstancesRequest setBlueprintType(String blueprintType) {
        this.blueprintType = blueprintType;
        return this;
    }
    public String getBlueprintType() {
        return this.blueprintType;
    }

    public ListBlueprintInstancesRequest setCreatorUid(String creatorUid) {
        this.creatorUid = creatorUid;
        return this;
    }
    public String getCreatorUid() {
        return this.creatorUid;
    }

    public ListBlueprintInstancesRequest setExecuteType(String executeType) {
        this.executeType = executeType;
        return this;
    }
    public String getExecuteType() {
        return this.executeType;
    }

    public ListBlueprintInstancesRequest setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }
    public String getNamePrefix() {
        return this.namePrefix;
    }

    public ListBlueprintInstancesRequest setOrderCol(String orderCol) {
        this.orderCol = orderCol;
        return this;
    }
    public String getOrderCol() {
        return this.orderCol;
    }

    public ListBlueprintInstancesRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListBlueprintInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBlueprintInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBlueprintInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
