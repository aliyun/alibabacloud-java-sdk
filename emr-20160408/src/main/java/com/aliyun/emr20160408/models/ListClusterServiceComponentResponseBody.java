// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClusterServiceComponentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("ComponentList")
    public ListClusterServiceComponentResponseBodyComponentList componentList;

    public static ListClusterServiceComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterServiceComponentResponseBody self = new ListClusterServiceComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterServiceComponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterServiceComponentResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClusterServiceComponentResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClusterServiceComponentResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListClusterServiceComponentResponseBody setComponentList(ListClusterServiceComponentResponseBodyComponentList componentList) {
        this.componentList = componentList;
        return this;
    }
    public ListClusterServiceComponentResponseBodyComponentList getComponentList() {
        return this.componentList;
    }

    public static class ListClusterServiceComponentResponseBodyComponentListComponent extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ServiceDisplayName")
        public String serviceDisplayName;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("ServerStatus")
        public String serverStatus;

        @NameInMap("PodName")
        public String podName;

        @NameInMap("ComponentName")
        public String componentName;

        @NameInMap("CommissionStatus")
        public String commissionStatus;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("NeedRestart")
        public Boolean needRestart;

        @NameInMap("WorkloadType")
        public String workloadType;

        @NameInMap("WorkloadName")
        public String workloadName;

        @NameInMap("ComponentDisplayName")
        public String componentDisplayName;

        @NameInMap("PublicIp")
        public String publicIp;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Role")
        public String role;

        @NameInMap("DesiredCount")
        public Integer desiredCount;

        public static ListClusterServiceComponentResponseBodyComponentListComponent build(java.util.Map<String, ?> map) throws Exception {
            ListClusterServiceComponentResponseBodyComponentListComponent self = new ListClusterServiceComponentResponseBodyComponentListComponent();
            return TeaModel.build(map, self);
        }

        public ListClusterServiceComponentResponseBodyComponentListComponent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClusterServiceComponentResponseBodyComponentListComponent setServiceDisplayName(String serviceDisplayName) {
            this.serviceDisplayName = serviceDisplayName;
            return this;
        }
        public String getServiceDisplayName() {
            return this.serviceDisplayName;
        }

        public ListClusterServiceComponentResponseBodyComponentListComponent setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public ListClusterServiceComponentResponseBodyComponentListComponent setServerStatus(String serverStatus) {
            this.serverStatus = serverStatus;
            return this;
        }
        public String getServerStatus() {
            return this.serverStatus;
        }

        public ListClusterServiceComponentResponseBodyComponentListComponent setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public ListClusterServiceComponentResponseBodyComponentListComponent setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public ListClusterServiceComponentResponseBodyComponentListComponent setCommissionStatus(String commissionStatus) {
            this.commissionStatus = commissionStatus;
            return this;
        }
        public String getCommissionStatus() {
            return this.commissionStatus;
        }

        public ListClusterServiceComponentResponseBodyComponentListComponent setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListClusterServiceComponentResponseBodyComponentListComponent setNeedRestart(Boolean needRestart) {
            this.needRestart = needRestart;
            return this;
        }
        public Boolean getNeedRestart() {
            return this.needRestart;
        }

        public ListClusterServiceComponentResponseBodyComponentListComponent setWorkloadType(String workloadType) {
            this.workloadType = workloadType;
            return this;
        }
        public String getWorkloadType() {
            return this.workloadType;
        }

        public ListClusterServiceComponentResponseBodyComponentListComponent setWorkloadName(String workloadName) {
            this.workloadName = workloadName;
            return this;
        }
        public String getWorkloadName() {
            return this.workloadName;
        }

        public ListClusterServiceComponentResponseBodyComponentListComponent setComponentDisplayName(String componentDisplayName) {
            this.componentDisplayName = componentDisplayName;
            return this;
        }
        public String getComponentDisplayName() {
            return this.componentDisplayName;
        }

        public ListClusterServiceComponentResponseBodyComponentListComponent setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public ListClusterServiceComponentResponseBodyComponentListComponent setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListClusterServiceComponentResponseBodyComponentListComponent setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListClusterServiceComponentResponseBodyComponentListComponent setDesiredCount(Integer desiredCount) {
            this.desiredCount = desiredCount;
            return this;
        }
        public Integer getDesiredCount() {
            return this.desiredCount;
        }

    }

    public static class ListClusterServiceComponentResponseBodyComponentList extends TeaModel {
        @NameInMap("Component")
        public java.util.List<ListClusterServiceComponentResponseBodyComponentListComponent> component;

        public static ListClusterServiceComponentResponseBodyComponentList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterServiceComponentResponseBodyComponentList self = new ListClusterServiceComponentResponseBodyComponentList();
            return TeaModel.build(map, self);
        }

        public ListClusterServiceComponentResponseBodyComponentList setComponent(java.util.List<ListClusterServiceComponentResponseBodyComponentListComponent> component) {
            this.component = component;
            return this;
        }
        public java.util.List<ListClusterServiceComponentResponseBodyComponentListComponent> getComponent() {
            return this.component;
        }

    }

}
