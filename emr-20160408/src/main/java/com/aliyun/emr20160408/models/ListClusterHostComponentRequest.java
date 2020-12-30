// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClusterHostComponentRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("HostInstanceId")
    public String hostInstanceId;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ComponentName")
    public String componentName;

    @NameInMap("ComponentStatus")
    public String componentStatus;

    @NameInMap("HostRole")
    public String hostRole;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListClusterHostComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterHostComponentRequest self = new ListClusterHostComponentRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterHostComponentRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListClusterHostComponentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListClusterHostComponentRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterHostComponentRequest setHostInstanceId(String hostInstanceId) {
        this.hostInstanceId = hostInstanceId;
        return this;
    }
    public String getHostInstanceId() {
        return this.hostInstanceId;
    }

    public ListClusterHostComponentRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ListClusterHostComponentRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ListClusterHostComponentRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public ListClusterHostComponentRequest setComponentStatus(String componentStatus) {
        this.componentStatus = componentStatus;
        return this;
    }
    public String getComponentStatus() {
        return this.componentStatus;
    }

    public ListClusterHostComponentRequest setHostRole(String hostRole) {
        this.hostRole = hostRole;
        return this;
    }
    public String getHostRole() {
        return this.hostRole;
    }

    public ListClusterHostComponentRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClusterHostComponentRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
