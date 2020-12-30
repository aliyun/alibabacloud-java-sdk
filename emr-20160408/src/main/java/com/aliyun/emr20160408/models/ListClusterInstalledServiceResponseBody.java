// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClusterInstalledServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClusterInstalledServiceList")
    public ListClusterInstalledServiceResponseBodyClusterInstalledServiceList clusterInstalledServiceList;

    public static ListClusterInstalledServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterInstalledServiceResponseBody self = new ListClusterInstalledServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterInstalledServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterInstalledServiceResponseBody setClusterInstalledServiceList(ListClusterInstalledServiceResponseBodyClusterInstalledServiceList clusterInstalledServiceList) {
        this.clusterInstalledServiceList = clusterInstalledServiceList;
        return this;
    }
    public ListClusterInstalledServiceResponseBodyClusterInstalledServiceList getClusterInstalledServiceList() {
        return this.clusterInstalledServiceList;
    }

    public static class ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledServiceServiceActionListServiceAction extends TeaModel {
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

        public static ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledServiceServiceActionListServiceAction build(java.util.Map<String, ?> map) throws Exception {
            ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledServiceServiceActionListServiceAction self = new ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledServiceServiceActionListServiceAction();
            return TeaModel.build(map, self);
        }

        public ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledServiceServiceActionListServiceAction setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledServiceServiceActionListServiceAction setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledServiceServiceActionListServiceAction setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledServiceServiceActionListServiceAction setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledServiceServiceActionListServiceAction setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledServiceServiceActionList extends TeaModel {
        @NameInMap("ServiceAction")
        public java.util.List<ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledServiceServiceActionListServiceAction> serviceAction;

        public static ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledServiceServiceActionList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledServiceServiceActionList self = new ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledServiceServiceActionList();
            return TeaModel.build(map, self);
        }

        public ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledServiceServiceActionList setServiceAction(java.util.List<ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledServiceServiceActionListServiceAction> serviceAction) {
            this.serviceAction = serviceAction;
            return this;
        }
        public java.util.List<ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledServiceServiceActionListServiceAction> getServiceAction() {
            return this.serviceAction;
        }

    }

    public static class ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledService extends TeaModel {
        @NameInMap("ServiceEcmVersion")
        public String serviceEcmVersion;

        @NameInMap("ServiceDisplayName")
        public String serviceDisplayName;

        @NameInMap("ServiceActionList")
        public ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledServiceServiceActionList serviceActionList;

        @NameInMap("notStartedNum")
        public Integer notStartedNum;

        @NameInMap("ServiceVersion")
        public String serviceVersion;

        @NameInMap("comment")
        public String comment;

        @NameInMap("abnormalNum")
        public Integer abnormalNum;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("onlyClient")
        public Boolean onlyClient;

        @NameInMap("serviceStatus")
        public String serviceStatus;

        @NameInMap("needRestartNum")
        public Integer needRestartNum;

        public static ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledService build(java.util.Map<String, ?> map) throws Exception {
            ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledService self = new ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledService();
            return TeaModel.build(map, self);
        }

        public ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledService setServiceEcmVersion(String serviceEcmVersion) {
            this.serviceEcmVersion = serviceEcmVersion;
            return this;
        }
        public String getServiceEcmVersion() {
            return this.serviceEcmVersion;
        }

        public ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledService setServiceDisplayName(String serviceDisplayName) {
            this.serviceDisplayName = serviceDisplayName;
            return this;
        }
        public String getServiceDisplayName() {
            return this.serviceDisplayName;
        }

        public ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledService setServiceActionList(ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledServiceServiceActionList serviceActionList) {
            this.serviceActionList = serviceActionList;
            return this;
        }
        public ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledServiceServiceActionList getServiceActionList() {
            return this.serviceActionList;
        }

        public ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledService setNotStartedNum(Integer notStartedNum) {
            this.notStartedNum = notStartedNum;
            return this;
        }
        public Integer getNotStartedNum() {
            return this.notStartedNum;
        }

        public ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledService setServiceVersion(String serviceVersion) {
            this.serviceVersion = serviceVersion;
            return this;
        }
        public String getServiceVersion() {
            return this.serviceVersion;
        }

        public ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledService setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledService setAbnormalNum(Integer abnormalNum) {
            this.abnormalNum = abnormalNum;
            return this;
        }
        public Integer getAbnormalNum() {
            return this.abnormalNum;
        }

        public ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledService setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledService setOnlyClient(Boolean onlyClient) {
            this.onlyClient = onlyClient;
            return this;
        }
        public Boolean getOnlyClient() {
            return this.onlyClient;
        }

        public ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledService setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledService setNeedRestartNum(Integer needRestartNum) {
            this.needRestartNum = needRestartNum;
            return this;
        }
        public Integer getNeedRestartNum() {
            return this.needRestartNum;
        }

    }

    public static class ListClusterInstalledServiceResponseBodyClusterInstalledServiceList extends TeaModel {
        @NameInMap("ClusterInstalledService")
        public java.util.List<ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledService> clusterInstalledService;

        public static ListClusterInstalledServiceResponseBodyClusterInstalledServiceList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterInstalledServiceResponseBodyClusterInstalledServiceList self = new ListClusterInstalledServiceResponseBodyClusterInstalledServiceList();
            return TeaModel.build(map, self);
        }

        public ListClusterInstalledServiceResponseBodyClusterInstalledServiceList setClusterInstalledService(java.util.List<ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledService> clusterInstalledService) {
            this.clusterInstalledService = clusterInstalledService;
            return this;
        }
        public java.util.List<ListClusterInstalledServiceResponseBodyClusterInstalledServiceListClusterInstalledService> getClusterInstalledService() {
            return this.clusterInstalledService;
        }

    }

}
