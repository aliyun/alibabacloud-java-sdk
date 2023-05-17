// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListServiceInstancesRequest extends TeaModel {
    @NameInMap("Filter")
    public String filter;

    @NameInMap("HostIP")
    public String hostIP;

    @NameInMap("InstanceIP")
    public String instanceIP;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceStatus")
    public String instanceStatus;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("IsSpot")
    public Boolean isSpot;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Role")
    public String role;

    @NameInMap("Sort")
    public String sort;

    public static ListServiceInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstancesRequest self = new ListServiceInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceInstancesRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListServiceInstancesRequest setHostIP(String hostIP) {
        this.hostIP = hostIP;
        return this;
    }
    public String getHostIP() {
        return this.hostIP;
    }

    public ListServiceInstancesRequest setInstanceIP(String instanceIP) {
        this.instanceIP = instanceIP;
        return this;
    }
    public String getInstanceIP() {
        return this.instanceIP;
    }

    public ListServiceInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListServiceInstancesRequest setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public ListServiceInstancesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ListServiceInstancesRequest setIsSpot(Boolean isSpot) {
        this.isSpot = isSpot;
        return this;
    }
    public Boolean getIsSpot() {
        return this.isSpot;
    }

    public ListServiceInstancesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListServiceInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListServiceInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServiceInstancesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListServiceInstancesRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ListServiceInstancesRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

}
