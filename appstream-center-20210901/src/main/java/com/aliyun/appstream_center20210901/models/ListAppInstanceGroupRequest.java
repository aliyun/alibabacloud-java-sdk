// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAppInstanceGroupRequest extends TeaModel {
    @NameInMap("AppCenterImageId")
    public String appCenterImageId;

    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    @NameInMap("BizRegionId")
    public String bizRegionId;

    @NameInMap("NodeInstanceType")
    public String nodeInstanceType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("Status")
    public java.util.List<String> status;

    public static ListAppInstanceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppInstanceGroupRequest self = new ListAppInstanceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListAppInstanceGroupRequest setAppCenterImageId(String appCenterImageId) {
        this.appCenterImageId = appCenterImageId;
        return this;
    }
    public String getAppCenterImageId() {
        return this.appCenterImageId;
    }

    public ListAppInstanceGroupRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ListAppInstanceGroupRequest setAppInstanceGroupName(String appInstanceGroupName) {
        this.appInstanceGroupName = appInstanceGroupName;
        return this;
    }
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    public ListAppInstanceGroupRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public ListAppInstanceGroupRequest setNodeInstanceType(String nodeInstanceType) {
        this.nodeInstanceType = nodeInstanceType;
        return this;
    }
    public String getNodeInstanceType() {
        return this.nodeInstanceType;
    }

    public ListAppInstanceGroupRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppInstanceGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppInstanceGroupRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ListAppInstanceGroupRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

}
