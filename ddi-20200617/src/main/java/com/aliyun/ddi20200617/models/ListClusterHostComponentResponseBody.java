// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListClusterHostComponentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("ComponentList")
    public ListClusterHostComponentResponseBodyComponentList componentList;

    public static ListClusterHostComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterHostComponentResponseBody self = new ListClusterHostComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterHostComponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterHostComponentResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClusterHostComponentResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClusterHostComponentResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListClusterHostComponentResponseBody setComponentList(ListClusterHostComponentResponseBodyComponentList componentList) {
        this.componentList = componentList;
        return this;
    }
    public ListClusterHostComponentResponseBodyComponentList getComponentList() {
        return this.componentList;
    }

    public static class ListClusterHostComponentResponseBodyComponentListComponent extends TeaModel {
        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("Status")
        public String status;

        @NameInMap("ServiceDisplayName")
        public String serviceDisplayName;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("ServerStatus")
        public String serverStatus;

        @NameInMap("ComponentName")
        public String componentName;

        @NameInMap("CommissionStatus")
        public String commissionStatus;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("NeedRestart")
        public Boolean needRestart;

        @NameInMap("HostId")
        public String hostId;

        @NameInMap("HostInstanceId")
        public String hostInstanceId;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("ComponentDisplayName")
        public String componentDisplayName;

        @NameInMap("PublicIp")
        public String publicIp;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("Role")
        public String role;

        @NameInMap("ServiceName")
        public String serviceName;

        public static ListClusterHostComponentResponseBodyComponentListComponent build(java.util.Map<String, ?> map) throws Exception {
            ListClusterHostComponentResponseBodyComponentListComponent self = new ListClusterHostComponentResponseBodyComponentListComponent();
            return TeaModel.build(map, self);
        }

        public ListClusterHostComponentResponseBodyComponentListComponent setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListClusterHostComponentResponseBodyComponentListComponent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClusterHostComponentResponseBodyComponentListComponent setServiceDisplayName(String serviceDisplayName) {
            this.serviceDisplayName = serviceDisplayName;
            return this;
        }
        public String getServiceDisplayName() {
            return this.serviceDisplayName;
        }

        public ListClusterHostComponentResponseBodyComponentListComponent setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public ListClusterHostComponentResponseBodyComponentListComponent setServerStatus(String serverStatus) {
            this.serverStatus = serverStatus;
            return this;
        }
        public String getServerStatus() {
            return this.serverStatus;
        }

        public ListClusterHostComponentResponseBodyComponentListComponent setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public ListClusterHostComponentResponseBodyComponentListComponent setCommissionStatus(String commissionStatus) {
            this.commissionStatus = commissionStatus;
            return this;
        }
        public String getCommissionStatus() {
            return this.commissionStatus;
        }

        public ListClusterHostComponentResponseBodyComponentListComponent setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListClusterHostComponentResponseBodyComponentListComponent setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListClusterHostComponentResponseBodyComponentListComponent setNeedRestart(Boolean needRestart) {
            this.needRestart = needRestart;
            return this;
        }
        public Boolean getNeedRestart() {
            return this.needRestart;
        }

        public ListClusterHostComponentResponseBodyComponentListComponent setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public ListClusterHostComponentResponseBodyComponentListComponent setHostInstanceId(String hostInstanceId) {
            this.hostInstanceId = hostInstanceId;
            return this;
        }
        public String getHostInstanceId() {
            return this.hostInstanceId;
        }

        public ListClusterHostComponentResponseBodyComponentListComponent setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListClusterHostComponentResponseBodyComponentListComponent setComponentDisplayName(String componentDisplayName) {
            this.componentDisplayName = componentDisplayName;
            return this;
        }
        public String getComponentDisplayName() {
            return this.componentDisplayName;
        }

        public ListClusterHostComponentResponseBodyComponentListComponent setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public ListClusterHostComponentResponseBodyComponentListComponent setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public ListClusterHostComponentResponseBodyComponentListComponent setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListClusterHostComponentResponseBodyComponentListComponent setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class ListClusterHostComponentResponseBodyComponentList extends TeaModel {
        @NameInMap("Component")
        public java.util.List<ListClusterHostComponentResponseBodyComponentListComponent> component;

        public static ListClusterHostComponentResponseBodyComponentList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterHostComponentResponseBodyComponentList self = new ListClusterHostComponentResponseBodyComponentList();
            return TeaModel.build(map, self);
        }

        public ListClusterHostComponentResponseBodyComponentList setComponent(java.util.List<ListClusterHostComponentResponseBodyComponentListComponent> component) {
            this.component = component;
            return this;
        }
        public java.util.List<ListClusterHostComponentResponseBodyComponentListComponent> getComponent() {
            return this.component;
        }

    }

}
