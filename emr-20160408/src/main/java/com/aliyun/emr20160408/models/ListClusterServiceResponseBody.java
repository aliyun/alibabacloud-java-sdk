// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClusterServiceResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ClusterServiceList")
    public ListClusterServiceResponseBodyClusterServiceList clusterServiceList;

    public static ListClusterServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterServiceResponseBody self = new ListClusterServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterServiceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListClusterServiceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClusterServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterServiceResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClusterServiceResponseBody setClusterServiceList(ListClusterServiceResponseBodyClusterServiceList clusterServiceList) {
        this.clusterServiceList = clusterServiceList;
        return this;
    }
    public ListClusterServiceResponseBodyClusterServiceList getClusterServiceList() {
        return this.clusterServiceList;
    }

    public static class ListClusterServiceResponseBodyClusterServiceListClusterServiceServiceActionListServiceAction extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("ComponentName")
        public String componentName;

        @NameInMap("Command")
        public String command;

        @NameInMap("ActionName")
        public String actionName;

        @NameInMap("ServiceName")
        public String serviceName;

        public static ListClusterServiceResponseBodyClusterServiceListClusterServiceServiceActionListServiceAction build(java.util.Map<String, ?> map) throws Exception {
            ListClusterServiceResponseBodyClusterServiceListClusterServiceServiceActionListServiceAction self = new ListClusterServiceResponseBodyClusterServiceListClusterServiceServiceActionListServiceAction();
            return TeaModel.build(map, self);
        }

        public ListClusterServiceResponseBodyClusterServiceListClusterServiceServiceActionListServiceAction setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListClusterServiceResponseBodyClusterServiceListClusterServiceServiceActionListServiceAction setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public ListClusterServiceResponseBodyClusterServiceListClusterServiceServiceActionListServiceAction setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public ListClusterServiceResponseBodyClusterServiceListClusterServiceServiceActionListServiceAction setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public ListClusterServiceResponseBodyClusterServiceListClusterServiceServiceActionListServiceAction setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class ListClusterServiceResponseBodyClusterServiceListClusterServiceServiceActionList extends TeaModel {
        @NameInMap("ServiceAction")
        public java.util.List<ListClusterServiceResponseBodyClusterServiceListClusterServiceServiceActionListServiceAction> serviceAction;

        public static ListClusterServiceResponseBodyClusterServiceListClusterServiceServiceActionList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterServiceResponseBodyClusterServiceListClusterServiceServiceActionList self = new ListClusterServiceResponseBodyClusterServiceListClusterServiceServiceActionList();
            return TeaModel.build(map, self);
        }

        public ListClusterServiceResponseBodyClusterServiceListClusterServiceServiceActionList setServiceAction(java.util.List<ListClusterServiceResponseBodyClusterServiceListClusterServiceServiceActionListServiceAction> serviceAction) {
            this.serviceAction = serviceAction;
            return this;
        }
        public java.util.List<ListClusterServiceResponseBodyClusterServiceListClusterServiceServiceActionListServiceAction> getServiceAction() {
            return this.serviceAction;
        }

    }

    public static class ListClusterServiceResponseBodyClusterServiceListClusterService extends TeaModel {
        @NameInMap("ServiceDisplayName")
        public String serviceDisplayName;

        @NameInMap("NotStartInfo")
        public String notStartInfo;

        @NameInMap("ClientType")
        public Boolean clientType;

        @NameInMap("InstallStatus")
        public Boolean installStatus;

        @NameInMap("ServiceActionList")
        public ListClusterServiceResponseBodyClusterServiceListClusterServiceServiceActionList serviceActionList;

        @NameInMap("NeedRestartNum")
        public Integer needRestartNum;

        @NameInMap("ServiceStatus")
        public String serviceStatus;

        @NameInMap("HealthStatus")
        public String healthStatus;

        @NameInMap("NeedRestartInfo")
        public String needRestartInfo;

        @NameInMap("StoppedNum")
        public Integer stoppedNum;

        @NameInMap("ServiceVersion")
        public String serviceVersion;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("AbnormalNum")
        public Integer abnormalNum;

        public static ListClusterServiceResponseBodyClusterServiceListClusterService build(java.util.Map<String, ?> map) throws Exception {
            ListClusterServiceResponseBodyClusterServiceListClusterService self = new ListClusterServiceResponseBodyClusterServiceListClusterService();
            return TeaModel.build(map, self);
        }

        public ListClusterServiceResponseBodyClusterServiceListClusterService setServiceDisplayName(String serviceDisplayName) {
            this.serviceDisplayName = serviceDisplayName;
            return this;
        }
        public String getServiceDisplayName() {
            return this.serviceDisplayName;
        }

        public ListClusterServiceResponseBodyClusterServiceListClusterService setNotStartInfo(String notStartInfo) {
            this.notStartInfo = notStartInfo;
            return this;
        }
        public String getNotStartInfo() {
            return this.notStartInfo;
        }

        public ListClusterServiceResponseBodyClusterServiceListClusterService setClientType(Boolean clientType) {
            this.clientType = clientType;
            return this;
        }
        public Boolean getClientType() {
            return this.clientType;
        }

        public ListClusterServiceResponseBodyClusterServiceListClusterService setInstallStatus(Boolean installStatus) {
            this.installStatus = installStatus;
            return this;
        }
        public Boolean getInstallStatus() {
            return this.installStatus;
        }

        public ListClusterServiceResponseBodyClusterServiceListClusterService setServiceActionList(ListClusterServiceResponseBodyClusterServiceListClusterServiceServiceActionList serviceActionList) {
            this.serviceActionList = serviceActionList;
            return this;
        }
        public ListClusterServiceResponseBodyClusterServiceListClusterServiceServiceActionList getServiceActionList() {
            return this.serviceActionList;
        }

        public ListClusterServiceResponseBodyClusterServiceListClusterService setNeedRestartNum(Integer needRestartNum) {
            this.needRestartNum = needRestartNum;
            return this;
        }
        public Integer getNeedRestartNum() {
            return this.needRestartNum;
        }

        public ListClusterServiceResponseBodyClusterServiceListClusterService setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public ListClusterServiceResponseBodyClusterServiceListClusterService setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public ListClusterServiceResponseBodyClusterServiceListClusterService setNeedRestartInfo(String needRestartInfo) {
            this.needRestartInfo = needRestartInfo;
            return this;
        }
        public String getNeedRestartInfo() {
            return this.needRestartInfo;
        }

        public ListClusterServiceResponseBodyClusterServiceListClusterService setStoppedNum(Integer stoppedNum) {
            this.stoppedNum = stoppedNum;
            return this;
        }
        public Integer getStoppedNum() {
            return this.stoppedNum;
        }

        public ListClusterServiceResponseBodyClusterServiceListClusterService setServiceVersion(String serviceVersion) {
            this.serviceVersion = serviceVersion;
            return this;
        }
        public String getServiceVersion() {
            return this.serviceVersion;
        }

        public ListClusterServiceResponseBodyClusterServiceListClusterService setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListClusterServiceResponseBodyClusterServiceListClusterService setAbnormalNum(Integer abnormalNum) {
            this.abnormalNum = abnormalNum;
            return this;
        }
        public Integer getAbnormalNum() {
            return this.abnormalNum;
        }

    }

    public static class ListClusterServiceResponseBodyClusterServiceList extends TeaModel {
        @NameInMap("ClusterService")
        public java.util.List<ListClusterServiceResponseBodyClusterServiceListClusterService> clusterService;

        public static ListClusterServiceResponseBodyClusterServiceList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterServiceResponseBodyClusterServiceList self = new ListClusterServiceResponseBodyClusterServiceList();
            return TeaModel.build(map, self);
        }

        public ListClusterServiceResponseBodyClusterServiceList setClusterService(java.util.List<ListClusterServiceResponseBodyClusterServiceListClusterService> clusterService) {
            this.clusterService = clusterService;
            return this;
        }
        public java.util.List<ListClusterServiceResponseBodyClusterServiceListClusterService> getClusterService() {
            return this.clusterService;
        }

    }

}
