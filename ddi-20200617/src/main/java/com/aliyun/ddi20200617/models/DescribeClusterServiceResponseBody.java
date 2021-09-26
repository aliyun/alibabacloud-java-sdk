// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeClusterServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceInfo")
    public DescribeClusterServiceResponseBodyServiceInfo serviceInfo;

    public static DescribeClusterServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterServiceResponseBody self = new DescribeClusterServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterServiceResponseBody setServiceInfo(DescribeClusterServiceResponseBodyServiceInfo serviceInfo) {
        this.serviceInfo = serviceInfo;
        return this;
    }
    public DescribeClusterServiceResponseBodyServiceInfo getServiceInfo() {
        return this.serviceInfo;
    }

    public static class DescribeClusterServiceResponseBodyServiceInfoServiceActionListServiceAction extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("ActionName")
        public String actionName;

        @NameInMap("ComponentName")
        public String componentName;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Command")
        public String command;

        public static DescribeClusterServiceResponseBodyServiceInfoServiceActionListServiceAction build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceResponseBodyServiceInfoServiceActionListServiceAction self = new DescribeClusterServiceResponseBodyServiceInfoServiceActionListServiceAction();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceResponseBodyServiceInfoServiceActionListServiceAction setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeClusterServiceResponseBodyServiceInfoServiceActionListServiceAction setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public DescribeClusterServiceResponseBodyServiceInfoServiceActionListServiceAction setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public DescribeClusterServiceResponseBodyServiceInfoServiceActionListServiceAction setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DescribeClusterServiceResponseBodyServiceInfoServiceActionListServiceAction setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class DescribeClusterServiceResponseBodyServiceInfoServiceActionList extends TeaModel {
        @NameInMap("ServiceAction")
        public java.util.List<DescribeClusterServiceResponseBodyServiceInfoServiceActionListServiceAction> serviceAction;

        public static DescribeClusterServiceResponseBodyServiceInfoServiceActionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceResponseBodyServiceInfoServiceActionList self = new DescribeClusterServiceResponseBodyServiceInfoServiceActionList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceResponseBodyServiceInfoServiceActionList setServiceAction(java.util.List<DescribeClusterServiceResponseBodyServiceInfoServiceActionListServiceAction> serviceAction) {
            this.serviceAction = serviceAction;
            return this;
        }
        public java.util.List<DescribeClusterServiceResponseBodyServiceInfoServiceActionListServiceAction> getServiceAction() {
            return this.serviceAction;
        }

    }

    public static class DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryListClusterServiceSummary extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        @NameInMap("DesiredStoppedValue")
        public Integer desiredStoppedValue;

        @NameInMap("AlertInfo")
        public String alertInfo;

        @NameInMap("Category")
        public String category;

        public static DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryListClusterServiceSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryListClusterServiceSummary self = new DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryListClusterServiceSummary();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryListClusterServiceSummary setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryListClusterServiceSummary setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryListClusterServiceSummary setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryListClusterServiceSummary setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryListClusterServiceSummary setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryListClusterServiceSummary setDesiredStoppedValue(Integer desiredStoppedValue) {
            this.desiredStoppedValue = desiredStoppedValue;
            return this;
        }
        public Integer getDesiredStoppedValue() {
            return this.desiredStoppedValue;
        }

        public DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryListClusterServiceSummary setAlertInfo(String alertInfo) {
            this.alertInfo = alertInfo;
            return this;
        }
        public String getAlertInfo() {
            return this.alertInfo;
        }

        public DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryListClusterServiceSummary setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

    }

    public static class DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryList extends TeaModel {
        @NameInMap("ClusterServiceSummary")
        public java.util.List<DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryListClusterServiceSummary> clusterServiceSummary;

        public static DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryList self = new DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryList setClusterServiceSummary(java.util.List<DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryListClusterServiceSummary> clusterServiceSummary) {
            this.clusterServiceSummary = clusterServiceSummary;
            return this;
        }
        public java.util.List<DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryListClusterServiceSummary> getClusterServiceSummary() {
            return this.clusterServiceSummary;
        }

    }

    public static class DescribeClusterServiceResponseBodyServiceInfoNeedRestartHostIdList extends TeaModel {
        @NameInMap("Service")
        public java.util.List<String> service;

        public static DescribeClusterServiceResponseBodyServiceInfoNeedRestartHostIdList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceResponseBodyServiceInfoNeedRestartHostIdList self = new DescribeClusterServiceResponseBodyServiceInfoNeedRestartHostIdList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceResponseBodyServiceInfoNeedRestartHostIdList setService(java.util.List<String> service) {
            this.service = service;
            return this;
        }
        public java.util.List<String> getService() {
            return this.service;
        }

    }

    public static class DescribeClusterServiceResponseBodyServiceInfoNeedRestartComponentNameList extends TeaModel {
        @NameInMap("Service")
        public java.util.List<String> service;

        public static DescribeClusterServiceResponseBodyServiceInfoNeedRestartComponentNameList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceResponseBodyServiceInfoNeedRestartComponentNameList self = new DescribeClusterServiceResponseBodyServiceInfoNeedRestartComponentNameList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceResponseBodyServiceInfoNeedRestartComponentNameList setService(java.util.List<String> service) {
            this.service = service;
            return this;
        }
        public java.util.List<String> getService() {
            return this.service;
        }

    }

    public static class DescribeClusterServiceResponseBodyServiceInfo extends TeaModel {
        @NameInMap("NeedRestartInfo")
        public String needRestartInfo;

        @NameInMap("ServiceVersion")
        public String serviceVersion;

        @NameInMap("ServiceStatus")
        public String serviceStatus;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("NeedRestartNum")
        public Integer needRestartNum;

        @NameInMap("ServiceActionList")
        public DescribeClusterServiceResponseBodyServiceInfoServiceActionList serviceActionList;

        @NameInMap("ClusterServiceSummaryList")
        public DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryList clusterServiceSummaryList;

        @NameInMap("NeedRestartHostIdList")
        public DescribeClusterServiceResponseBodyServiceInfoNeedRestartHostIdList needRestartHostIdList;

        @NameInMap("NeedRestartComponentNameList")
        public DescribeClusterServiceResponseBodyServiceInfoNeedRestartComponentNameList needRestartComponentNameList;

        public static DescribeClusterServiceResponseBodyServiceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceResponseBodyServiceInfo self = new DescribeClusterServiceResponseBodyServiceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceResponseBodyServiceInfo setNeedRestartInfo(String needRestartInfo) {
            this.needRestartInfo = needRestartInfo;
            return this;
        }
        public String getNeedRestartInfo() {
            return this.needRestartInfo;
        }

        public DescribeClusterServiceResponseBodyServiceInfo setServiceVersion(String serviceVersion) {
            this.serviceVersion = serviceVersion;
            return this;
        }
        public String getServiceVersion() {
            return this.serviceVersion;
        }

        public DescribeClusterServiceResponseBodyServiceInfo setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public DescribeClusterServiceResponseBodyServiceInfo setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DescribeClusterServiceResponseBodyServiceInfo setNeedRestartNum(Integer needRestartNum) {
            this.needRestartNum = needRestartNum;
            return this;
        }
        public Integer getNeedRestartNum() {
            return this.needRestartNum;
        }

        public DescribeClusterServiceResponseBodyServiceInfo setServiceActionList(DescribeClusterServiceResponseBodyServiceInfoServiceActionList serviceActionList) {
            this.serviceActionList = serviceActionList;
            return this;
        }
        public DescribeClusterServiceResponseBodyServiceInfoServiceActionList getServiceActionList() {
            return this.serviceActionList;
        }

        public DescribeClusterServiceResponseBodyServiceInfo setClusterServiceSummaryList(DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryList clusterServiceSummaryList) {
            this.clusterServiceSummaryList = clusterServiceSummaryList;
            return this;
        }
        public DescribeClusterServiceResponseBodyServiceInfoClusterServiceSummaryList getClusterServiceSummaryList() {
            return this.clusterServiceSummaryList;
        }

        public DescribeClusterServiceResponseBodyServiceInfo setNeedRestartHostIdList(DescribeClusterServiceResponseBodyServiceInfoNeedRestartHostIdList needRestartHostIdList) {
            this.needRestartHostIdList = needRestartHostIdList;
            return this;
        }
        public DescribeClusterServiceResponseBodyServiceInfoNeedRestartHostIdList getNeedRestartHostIdList() {
            return this.needRestartHostIdList;
        }

        public DescribeClusterServiceResponseBodyServiceInfo setNeedRestartComponentNameList(DescribeClusterServiceResponseBodyServiceInfoNeedRestartComponentNameList needRestartComponentNameList) {
            this.needRestartComponentNameList = needRestartComponentNameList;
            return this;
        }
        public DescribeClusterServiceResponseBodyServiceInfoNeedRestartComponentNameList getNeedRestartComponentNameList() {
            return this.needRestartComponentNameList;
        }

    }

}
