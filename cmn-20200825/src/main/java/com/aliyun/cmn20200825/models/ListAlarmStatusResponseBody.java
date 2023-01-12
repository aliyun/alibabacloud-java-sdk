// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListAlarmStatusResponseBody extends TeaModel {
    @NameInMap("AlarmStatus")
    public java.util.List<ListAlarmStatusResponseBodyAlarmStatus> alarmStatus;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistics")
    public java.util.List<ListAlarmStatusResponseBodyStatistics> statistics;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAlarmStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmStatusResponseBody self = new ListAlarmStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlarmStatusResponseBody setAlarmStatus(java.util.List<ListAlarmStatusResponseBodyAlarmStatus> alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }
    public java.util.List<ListAlarmStatusResponseBodyAlarmStatus> getAlarmStatus() {
        return this.alarmStatus;
    }

    public ListAlarmStatusResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAlarmStatusResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAlarmStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlarmStatusResponseBody setStatistics(java.util.List<ListAlarmStatusResponseBodyStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.List<ListAlarmStatusResponseBodyStatistics> getStatistics() {
        return this.statistics;
    }

    public ListAlarmStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAlarmStatusResponseBodyAlarmStatusAggregateData extends TeaModel {
        @NameInMap("AggregateDataName")
        public String aggregateDataName;

        @NameInMap("DataItem")
        public String dataItem;

        public static ListAlarmStatusResponseBodyAlarmStatusAggregateData build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmStatusResponseBodyAlarmStatusAggregateData self = new ListAlarmStatusResponseBodyAlarmStatusAggregateData();
            return TeaModel.build(map, self);
        }

        public ListAlarmStatusResponseBodyAlarmStatusAggregateData setAggregateDataName(String aggregateDataName) {
            this.aggregateDataName = aggregateDataName;
            return this;
        }
        public String getAggregateDataName() {
            return this.aggregateDataName;
        }

        public ListAlarmStatusResponseBodyAlarmStatusAggregateData setDataItem(String dataItem) {
            this.dataItem = dataItem;
            return this;
        }
        public String getDataItem() {
            return this.dataItem;
        }

    }

    public static class ListAlarmStatusResponseBodyAlarmStatusDedicatedLine extends TeaModel {
        @NameInMap("DedicatedLineName")
        public String dedicatedLineName;

        @NameInMap("PhysicalSpace")
        public String physicalSpace;

        public static ListAlarmStatusResponseBodyAlarmStatusDedicatedLine build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmStatusResponseBodyAlarmStatusDedicatedLine self = new ListAlarmStatusResponseBodyAlarmStatusDedicatedLine();
            return TeaModel.build(map, self);
        }

        public ListAlarmStatusResponseBodyAlarmStatusDedicatedLine setDedicatedLineName(String dedicatedLineName) {
            this.dedicatedLineName = dedicatedLineName;
            return this;
        }
        public String getDedicatedLineName() {
            return this.dedicatedLineName;
        }

        public ListAlarmStatusResponseBodyAlarmStatusDedicatedLine setPhysicalSpace(String physicalSpace) {
            this.physicalSpace = physicalSpace;
            return this;
        }
        public String getPhysicalSpace() {
            return this.physicalSpace;
        }

    }

    public static class ListAlarmStatusResponseBodyAlarmStatusMonitorItem extends TeaModel {
        @NameInMap("CollectionType")
        public String collectionType;

        @NameInMap("MonitorItemDescription")
        public String monitorItemDescription;

        @NameInMap("MonitorItemName")
        public String monitorItemName;

        public static ListAlarmStatusResponseBodyAlarmStatusMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmStatusResponseBodyAlarmStatusMonitorItem self = new ListAlarmStatusResponseBodyAlarmStatusMonitorItem();
            return TeaModel.build(map, self);
        }

        public ListAlarmStatusResponseBodyAlarmStatusMonitorItem setCollectionType(String collectionType) {
            this.collectionType = collectionType;
            return this;
        }
        public String getCollectionType() {
            return this.collectionType;
        }

        public ListAlarmStatusResponseBodyAlarmStatusMonitorItem setMonitorItemDescription(String monitorItemDescription) {
            this.monitorItemDescription = monitorItemDescription;
            return this;
        }
        public String getMonitorItemDescription() {
            return this.monitorItemDescription;
        }

        public ListAlarmStatusResponseBodyAlarmStatusMonitorItem setMonitorItemName(String monitorItemName) {
            this.monitorItemName = monitorItemName;
            return this;
        }
        public String getMonitorItemName() {
            return this.monitorItemName;
        }

    }

    public static class ListAlarmStatusResponseBodyAlarmStatusNotificationSwitch extends TeaModel {
        @NameInMap("ExpiryTime")
        public String expiryTime;

        @NameInMap("Reason")
        public String reason;

        public static ListAlarmStatusResponseBodyAlarmStatusNotificationSwitch build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmStatusResponseBodyAlarmStatusNotificationSwitch self = new ListAlarmStatusResponseBodyAlarmStatusNotificationSwitch();
            return TeaModel.build(map, self);
        }

        public ListAlarmStatusResponseBodyAlarmStatusNotificationSwitch setExpiryTime(String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        public String getExpiryTime() {
            return this.expiryTime;
        }

        public ListAlarmStatusResponseBodyAlarmStatusNotificationSwitch setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class ListAlarmStatusResponseBodyAlarmStatusPortCollection extends TeaModel {
        @NameInMap("PortCollectionName")
        public String portCollectionName;

        public static ListAlarmStatusResponseBodyAlarmStatusPortCollection build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmStatusResponseBodyAlarmStatusPortCollection self = new ListAlarmStatusResponseBodyAlarmStatusPortCollection();
            return TeaModel.build(map, self);
        }

        public ListAlarmStatusResponseBodyAlarmStatusPortCollection setPortCollectionName(String portCollectionName) {
            this.portCollectionName = portCollectionName;
            return this;
        }
        public String getPortCollectionName() {
            return this.portCollectionName;
        }

    }

    public static class ListAlarmStatusResponseBodyAlarmStatusResourceApp extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Port")
        public String port;

        @NameInMap("SecurityDomain")
        public String securityDomain;

        @NameInMap("Type")
        public String type;

        public static ListAlarmStatusResponseBodyAlarmStatusResourceApp build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmStatusResponseBodyAlarmStatusResourceApp self = new ListAlarmStatusResponseBodyAlarmStatusResourceApp();
            return TeaModel.build(map, self);
        }

        public ListAlarmStatusResponseBodyAlarmStatusResourceApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAlarmStatusResponseBodyAlarmStatusResourceApp setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListAlarmStatusResponseBodyAlarmStatusResourceApp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListAlarmStatusResponseBodyAlarmStatusResourceApp setSecurityDomain(String securityDomain) {
            this.securityDomain = securityDomain;
            return this;
        }
        public String getSecurityDomain() {
            return this.securityDomain;
        }

        public ListAlarmStatusResponseBodyAlarmStatusResourceApp setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAlarmStatusResponseBodyAlarmStatusResourceDevice extends TeaModel {
        @NameInMap("City")
        public String city;

        @NameInMap("DeviceForm")
        public String deviceForm;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("PhysicalSpace")
        public String physicalSpace;

        public static ListAlarmStatusResponseBodyAlarmStatusResourceDevice build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmStatusResponseBodyAlarmStatusResourceDevice self = new ListAlarmStatusResponseBodyAlarmStatusResourceDevice();
            return TeaModel.build(map, self);
        }

        public ListAlarmStatusResponseBodyAlarmStatusResourceDevice setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListAlarmStatusResponseBodyAlarmStatusResourceDevice setDeviceForm(String deviceForm) {
            this.deviceForm = deviceForm;
            return this;
        }
        public String getDeviceForm() {
            return this.deviceForm;
        }

        public ListAlarmStatusResponseBodyAlarmStatusResourceDevice setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListAlarmStatusResponseBodyAlarmStatusResourceDevice setPhysicalSpace(String physicalSpace) {
            this.physicalSpace = physicalSpace;
            return this;
        }
        public String getPhysicalSpace() {
            return this.physicalSpace;
        }

    }

    public static class ListAlarmStatusResponseBodyAlarmStatus extends TeaModel {
        @NameInMap("AbnormalDataItem")
        public String abnormalDataItem;

        @NameInMap("AgentIp")
        public String agentIp;

        @NameInMap("AggregateData")
        public ListAlarmStatusResponseBodyAlarmStatusAggregateData aggregateData;

        @NameInMap("AggregateDataId")
        public String aggregateDataId;

        @NameInMap("AlarmRule")
        public String alarmRule;

        @NameInMap("AlarmStatus")
        public String alarmStatus;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("CollectionTime")
        public String collectionTime;

        @NameInMap("DedicatedLine")
        public ListAlarmStatusResponseBodyAlarmStatusDedicatedLine dedicatedLine;

        @NameInMap("DedicatedLineId")
        public String dedicatedLineId;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("FirstAbnormalTime")
        public String firstAbnormalTime;

        @NameInMap("MonitorItem")
        public ListAlarmStatusResponseBodyAlarmStatusMonitorItem monitorItem;

        @NameInMap("MonitorItemId")
        public String monitorItemId;

        @NameInMap("NotificationSwitch")
        public ListAlarmStatusResponseBodyAlarmStatusNotificationSwitch notificationSwitch;

        @NameInMap("PortCollection")
        public ListAlarmStatusResponseBodyAlarmStatusPortCollection portCollection;

        @NameInMap("PortCollectionId")
        public String portCollectionId;

        @NameInMap("ReceiveTime")
        public String receiveTime;

        @NameInMap("ResourceApp")
        public ListAlarmStatusResponseBodyAlarmStatusResourceApp resourceApp;

        @NameInMap("ResourceDevice")
        public ListAlarmStatusResponseBodyAlarmStatusResourceDevice resourceDevice;

        @NameInMap("ResponseCode")
        public String responseCode;

        @NameInMap("Result")
        public String result;

        @NameInMap("UniqueKey")
        public String uniqueKey;

        public static ListAlarmStatusResponseBodyAlarmStatus build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmStatusResponseBodyAlarmStatus self = new ListAlarmStatusResponseBodyAlarmStatus();
            return TeaModel.build(map, self);
        }

        public ListAlarmStatusResponseBodyAlarmStatus setAbnormalDataItem(String abnormalDataItem) {
            this.abnormalDataItem = abnormalDataItem;
            return this;
        }
        public String getAbnormalDataItem() {
            return this.abnormalDataItem;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setAgentIp(String agentIp) {
            this.agentIp = agentIp;
            return this;
        }
        public String getAgentIp() {
            return this.agentIp;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setAggregateData(ListAlarmStatusResponseBodyAlarmStatusAggregateData aggregateData) {
            this.aggregateData = aggregateData;
            return this;
        }
        public ListAlarmStatusResponseBodyAlarmStatusAggregateData getAggregateData() {
            return this.aggregateData;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setAggregateDataId(String aggregateDataId) {
            this.aggregateDataId = aggregateDataId;
            return this;
        }
        public String getAggregateDataId() {
            return this.aggregateDataId;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setAlarmRule(String alarmRule) {
            this.alarmRule = alarmRule;
            return this;
        }
        public String getAlarmRule() {
            return this.alarmRule;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setCollectionTime(String collectionTime) {
            this.collectionTime = collectionTime;
            return this;
        }
        public String getCollectionTime() {
            return this.collectionTime;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setDedicatedLine(ListAlarmStatusResponseBodyAlarmStatusDedicatedLine dedicatedLine) {
            this.dedicatedLine = dedicatedLine;
            return this;
        }
        public ListAlarmStatusResponseBodyAlarmStatusDedicatedLine getDedicatedLine() {
            return this.dedicatedLine;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setDedicatedLineId(String dedicatedLineId) {
            this.dedicatedLineId = dedicatedLineId;
            return this;
        }
        public String getDedicatedLineId() {
            return this.dedicatedLineId;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setFirstAbnormalTime(String firstAbnormalTime) {
            this.firstAbnormalTime = firstAbnormalTime;
            return this;
        }
        public String getFirstAbnormalTime() {
            return this.firstAbnormalTime;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setMonitorItem(ListAlarmStatusResponseBodyAlarmStatusMonitorItem monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public ListAlarmStatusResponseBodyAlarmStatusMonitorItem getMonitorItem() {
            return this.monitorItem;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setMonitorItemId(String monitorItemId) {
            this.monitorItemId = monitorItemId;
            return this;
        }
        public String getMonitorItemId() {
            return this.monitorItemId;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setNotificationSwitch(ListAlarmStatusResponseBodyAlarmStatusNotificationSwitch notificationSwitch) {
            this.notificationSwitch = notificationSwitch;
            return this;
        }
        public ListAlarmStatusResponseBodyAlarmStatusNotificationSwitch getNotificationSwitch() {
            return this.notificationSwitch;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setPortCollection(ListAlarmStatusResponseBodyAlarmStatusPortCollection portCollection) {
            this.portCollection = portCollection;
            return this;
        }
        public ListAlarmStatusResponseBodyAlarmStatusPortCollection getPortCollection() {
            return this.portCollection;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setPortCollectionId(String portCollectionId) {
            this.portCollectionId = portCollectionId;
            return this;
        }
        public String getPortCollectionId() {
            return this.portCollectionId;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setReceiveTime(String receiveTime) {
            this.receiveTime = receiveTime;
            return this;
        }
        public String getReceiveTime() {
            return this.receiveTime;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setResourceApp(ListAlarmStatusResponseBodyAlarmStatusResourceApp resourceApp) {
            this.resourceApp = resourceApp;
            return this;
        }
        public ListAlarmStatusResponseBodyAlarmStatusResourceApp getResourceApp() {
            return this.resourceApp;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setResourceDevice(ListAlarmStatusResponseBodyAlarmStatusResourceDevice resourceDevice) {
            this.resourceDevice = resourceDevice;
            return this;
        }
        public ListAlarmStatusResponseBodyAlarmStatusResourceDevice getResourceDevice() {
            return this.resourceDevice;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setResponseCode(String responseCode) {
            this.responseCode = responseCode;
            return this;
        }
        public String getResponseCode() {
            return this.responseCode;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setUniqueKey(String uniqueKey) {
            this.uniqueKey = uniqueKey;
            return this;
        }
        public String getUniqueKey() {
            return this.uniqueKey;
        }

    }

    public static class ListAlarmStatusResponseBodyStatistics extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Status")
        public String status;

        public static ListAlarmStatusResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmStatusResponseBodyStatistics self = new ListAlarmStatusResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public ListAlarmStatusResponseBodyStatistics setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListAlarmStatusResponseBodyStatistics setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
