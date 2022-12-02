// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetAlarmStatusResponseBody extends TeaModel {
    @NameInMap("AlarmStatus")
    public GetAlarmStatusResponseBodyAlarmStatus alarmStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAlarmStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlarmStatusResponseBody self = new GetAlarmStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlarmStatusResponseBody setAlarmStatus(GetAlarmStatusResponseBodyAlarmStatus alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }
    public GetAlarmStatusResponseBodyAlarmStatus getAlarmStatus() {
        return this.alarmStatus;
    }

    public GetAlarmStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAlarmStatusResponseBodyAlarmStatusAggregateData extends TeaModel {
        @NameInMap("AggregateDataDescription")
        public String aggregateDataDescription;

        @NameInMap("AggregateDataId")
        public String aggregateDataId;

        @NameInMap("AggregateDataName")
        public String aggregateDataName;

        @NameInMap("AggregateMode")
        public String aggregateMode;

        @NameInMap("DataItem")
        public String dataItem;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("IsAllDevice")
        public Integer isAllDevice;

        @NameInMap("MonitorItemId")
        public String monitorItemId;

        public static GetAlarmStatusResponseBodyAlarmStatusAggregateData build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmStatusResponseBodyAlarmStatusAggregateData self = new GetAlarmStatusResponseBodyAlarmStatusAggregateData();
            return TeaModel.build(map, self);
        }

        public GetAlarmStatusResponseBodyAlarmStatusAggregateData setAggregateDataDescription(String aggregateDataDescription) {
            this.aggregateDataDescription = aggregateDataDescription;
            return this;
        }
        public String getAggregateDataDescription() {
            return this.aggregateDataDescription;
        }

        public GetAlarmStatusResponseBodyAlarmStatusAggregateData setAggregateDataId(String aggregateDataId) {
            this.aggregateDataId = aggregateDataId;
            return this;
        }
        public String getAggregateDataId() {
            return this.aggregateDataId;
        }

        public GetAlarmStatusResponseBodyAlarmStatusAggregateData setAggregateDataName(String aggregateDataName) {
            this.aggregateDataName = aggregateDataName;
            return this;
        }
        public String getAggregateDataName() {
            return this.aggregateDataName;
        }

        public GetAlarmStatusResponseBodyAlarmStatusAggregateData setAggregateMode(String aggregateMode) {
            this.aggregateMode = aggregateMode;
            return this;
        }
        public String getAggregateMode() {
            return this.aggregateMode;
        }

        public GetAlarmStatusResponseBodyAlarmStatusAggregateData setDataItem(String dataItem) {
            this.dataItem = dataItem;
            return this;
        }
        public String getDataItem() {
            return this.dataItem;
        }

        public GetAlarmStatusResponseBodyAlarmStatusAggregateData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetAlarmStatusResponseBodyAlarmStatusAggregateData setIsAllDevice(Integer isAllDevice) {
            this.isAllDevice = isAllDevice;
            return this;
        }
        public Integer getIsAllDevice() {
            return this.isAllDevice;
        }

        public GetAlarmStatusResponseBodyAlarmStatusAggregateData setMonitorItemId(String monitorItemId) {
            this.monitorItemId = monitorItemId;
            return this;
        }
        public String getMonitorItemId() {
            return this.monitorItemId;
        }

    }

    public static class GetAlarmStatusResponseBodyAlarmStatusDedicatedLine extends TeaModel {
        @NameInMap("Bandwidth")
        public String bandwidth;

        @NameInMap("DedicatedLineGateway")
        public String dedicatedLineGateway;

        @NameInMap("DedicatedLineName")
        public String dedicatedLineName;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("PortName")
        public String portName;

        @NameInMap("Space")
        public String space;

        public static GetAlarmStatusResponseBodyAlarmStatusDedicatedLine build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmStatusResponseBodyAlarmStatusDedicatedLine self = new GetAlarmStatusResponseBodyAlarmStatusDedicatedLine();
            return TeaModel.build(map, self);
        }

        public GetAlarmStatusResponseBodyAlarmStatusDedicatedLine setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public GetAlarmStatusResponseBodyAlarmStatusDedicatedLine setDedicatedLineGateway(String dedicatedLineGateway) {
            this.dedicatedLineGateway = dedicatedLineGateway;
            return this;
        }
        public String getDedicatedLineGateway() {
            return this.dedicatedLineGateway;
        }

        public GetAlarmStatusResponseBodyAlarmStatusDedicatedLine setDedicatedLineName(String dedicatedLineName) {
            this.dedicatedLineName = dedicatedLineName;
            return this;
        }
        public String getDedicatedLineName() {
            return this.dedicatedLineName;
        }

        public GetAlarmStatusResponseBodyAlarmStatusDedicatedLine setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetAlarmStatusResponseBodyAlarmStatusDedicatedLine setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetAlarmStatusResponseBodyAlarmStatusDedicatedLine setPortName(String portName) {
            this.portName = portName;
            return this;
        }
        public String getPortName() {
            return this.portName;
        }

        public GetAlarmStatusResponseBodyAlarmStatusDedicatedLine setSpace(String space) {
            this.space = space;
            return this;
        }
        public String getSpace() {
            return this.space;
        }

    }

    public static class GetAlarmStatusResponseBodyAlarmStatusMonitorItem extends TeaModel {
        @NameInMap("CollectionType")
        public String collectionType;

        @NameInMap("DeviceForm")
        public String deviceForm;

        @NameInMap("Effective")
        public Long effective;

        @NameInMap("ExecInterval")
        public String execInterval;

        @NameInMap("MonitorItemDescription")
        public String monitorItemDescription;

        @NameInMap("MonitorItemId")
        public String monitorItemId;

        @NameInMap("MonitorItemName")
        public String monitorItemName;

        @NameInMap("SecurityDomain")
        public String securityDomain;

        public static GetAlarmStatusResponseBodyAlarmStatusMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmStatusResponseBodyAlarmStatusMonitorItem self = new GetAlarmStatusResponseBodyAlarmStatusMonitorItem();
            return TeaModel.build(map, self);
        }

        public GetAlarmStatusResponseBodyAlarmStatusMonitorItem setCollectionType(String collectionType) {
            this.collectionType = collectionType;
            return this;
        }
        public String getCollectionType() {
            return this.collectionType;
        }

        public GetAlarmStatusResponseBodyAlarmStatusMonitorItem setDeviceForm(String deviceForm) {
            this.deviceForm = deviceForm;
            return this;
        }
        public String getDeviceForm() {
            return this.deviceForm;
        }

        public GetAlarmStatusResponseBodyAlarmStatusMonitorItem setEffective(Long effective) {
            this.effective = effective;
            return this;
        }
        public Long getEffective() {
            return this.effective;
        }

        public GetAlarmStatusResponseBodyAlarmStatusMonitorItem setExecInterval(String execInterval) {
            this.execInterval = execInterval;
            return this;
        }
        public String getExecInterval() {
            return this.execInterval;
        }

        public GetAlarmStatusResponseBodyAlarmStatusMonitorItem setMonitorItemDescription(String monitorItemDescription) {
            this.monitorItemDescription = monitorItemDescription;
            return this;
        }
        public String getMonitorItemDescription() {
            return this.monitorItemDescription;
        }

        public GetAlarmStatusResponseBodyAlarmStatusMonitorItem setMonitorItemId(String monitorItemId) {
            this.monitorItemId = monitorItemId;
            return this;
        }
        public String getMonitorItemId() {
            return this.monitorItemId;
        }

        public GetAlarmStatusResponseBodyAlarmStatusMonitorItem setMonitorItemName(String monitorItemName) {
            this.monitorItemName = monitorItemName;
            return this;
        }
        public String getMonitorItemName() {
            return this.monitorItemName;
        }

        public GetAlarmStatusResponseBodyAlarmStatusMonitorItem setSecurityDomain(String securityDomain) {
            this.securityDomain = securityDomain;
            return this;
        }
        public String getSecurityDomain() {
            return this.securityDomain;
        }

    }

    public static class GetAlarmStatusResponseBodyAlarmStatusNotificationSwitch extends TeaModel {
        @NameInMap("ExpiryTime")
        public String expiryTime;

        @NameInMap("Reason")
        public String reason;

        public static GetAlarmStatusResponseBodyAlarmStatusNotificationSwitch build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmStatusResponseBodyAlarmStatusNotificationSwitch self = new GetAlarmStatusResponseBodyAlarmStatusNotificationSwitch();
            return TeaModel.build(map, self);
        }

        public GetAlarmStatusResponseBodyAlarmStatusNotificationSwitch setExpiryTime(String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        public String getExpiryTime() {
            return this.expiryTime;
        }

        public GetAlarmStatusResponseBodyAlarmStatusNotificationSwitch setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class GetAlarmStatusResponseBodyAlarmStatusPortCollectionPortListResourceDevice extends TeaModel {
        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("SecurityDomain")
        public String securityDomain;

        public static GetAlarmStatusResponseBodyAlarmStatusPortCollectionPortListResourceDevice build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmStatusResponseBodyAlarmStatusPortCollectionPortListResourceDevice self = new GetAlarmStatusResponseBodyAlarmStatusPortCollectionPortListResourceDevice();
            return TeaModel.build(map, self);
        }

        public GetAlarmStatusResponseBodyAlarmStatusPortCollectionPortListResourceDevice setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetAlarmStatusResponseBodyAlarmStatusPortCollectionPortListResourceDevice setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetAlarmStatusResponseBodyAlarmStatusPortCollectionPortListResourceDevice setSecurityDomain(String securityDomain) {
            this.securityDomain = securityDomain;
            return this;
        }
        public String getSecurityDomain() {
            return this.securityDomain;
        }

    }

    public static class GetAlarmStatusResponseBodyAlarmStatusPortCollectionPortList extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("PortName")
        public String portName;

        @NameInMap("ResourceDevice")
        public GetAlarmStatusResponseBodyAlarmStatusPortCollectionPortListResourceDevice resourceDevice;

        public static GetAlarmStatusResponseBodyAlarmStatusPortCollectionPortList build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmStatusResponseBodyAlarmStatusPortCollectionPortList self = new GetAlarmStatusResponseBodyAlarmStatusPortCollectionPortList();
            return TeaModel.build(map, self);
        }

        public GetAlarmStatusResponseBodyAlarmStatusPortCollectionPortList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetAlarmStatusResponseBodyAlarmStatusPortCollectionPortList setPortName(String portName) {
            this.portName = portName;
            return this;
        }
        public String getPortName() {
            return this.portName;
        }

        public GetAlarmStatusResponseBodyAlarmStatusPortCollectionPortList setResourceDevice(GetAlarmStatusResponseBodyAlarmStatusPortCollectionPortListResourceDevice resourceDevice) {
            this.resourceDevice = resourceDevice;
            return this;
        }
        public GetAlarmStatusResponseBodyAlarmStatusPortCollectionPortListResourceDevice getResourceDevice() {
            return this.resourceDevice;
        }

    }

    public static class GetAlarmStatusResponseBodyAlarmStatusPortCollection extends TeaModel {
        @NameInMap("PortCollectionDescription")
        public String portCollectionDescription;

        @NameInMap("PortCollectionId")
        public String portCollectionId;

        @NameInMap("PortCollectionName")
        public String portCollectionName;

        @NameInMap("PortList")
        public java.util.List<GetAlarmStatusResponseBodyAlarmStatusPortCollectionPortList> portList;

        public static GetAlarmStatusResponseBodyAlarmStatusPortCollection build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmStatusResponseBodyAlarmStatusPortCollection self = new GetAlarmStatusResponseBodyAlarmStatusPortCollection();
            return TeaModel.build(map, self);
        }

        public GetAlarmStatusResponseBodyAlarmStatusPortCollection setPortCollectionDescription(String portCollectionDescription) {
            this.portCollectionDescription = portCollectionDescription;
            return this;
        }
        public String getPortCollectionDescription() {
            return this.portCollectionDescription;
        }

        public GetAlarmStatusResponseBodyAlarmStatusPortCollection setPortCollectionId(String portCollectionId) {
            this.portCollectionId = portCollectionId;
            return this;
        }
        public String getPortCollectionId() {
            return this.portCollectionId;
        }

        public GetAlarmStatusResponseBodyAlarmStatusPortCollection setPortCollectionName(String portCollectionName) {
            this.portCollectionName = portCollectionName;
            return this;
        }
        public String getPortCollectionName() {
            return this.portCollectionName;
        }

        public GetAlarmStatusResponseBodyAlarmStatusPortCollection setPortList(java.util.List<GetAlarmStatusResponseBodyAlarmStatusPortCollectionPortList> portList) {
            this.portList = portList;
            return this;
        }
        public java.util.List<GetAlarmStatusResponseBodyAlarmStatusPortCollectionPortList> getPortList() {
            return this.portList;
        }

    }

    public static class GetAlarmStatusResponseBodyAlarmStatusResourceApp extends TeaModel {
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

        public static GetAlarmStatusResponseBodyAlarmStatusResourceApp build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmStatusResponseBodyAlarmStatusResourceApp self = new GetAlarmStatusResponseBodyAlarmStatusResourceApp();
            return TeaModel.build(map, self);
        }

        public GetAlarmStatusResponseBodyAlarmStatusResourceApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAlarmStatusResponseBodyAlarmStatusResourceApp setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetAlarmStatusResponseBodyAlarmStatusResourceApp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetAlarmStatusResponseBodyAlarmStatusResourceApp setSecurityDomain(String securityDomain) {
            this.securityDomain = securityDomain;
            return this;
        }
        public String getSecurityDomain() {
            return this.securityDomain;
        }

        public GetAlarmStatusResponseBodyAlarmStatusResourceApp setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetAlarmStatusResponseBodyAlarmStatusResourceDevice extends TeaModel {
        @NameInMap("DeviceForm")
        public String deviceForm;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Model")
        public String model;

        @NameInMap("SecurityDomain")
        public String securityDomain;

        @NameInMap("Sn")
        public String sn;

        @NameInMap("Space")
        public String space;

        @NameInMap("Status")
        public String status;

        @NameInMap("Vendor")
        public String vendor;

        public static GetAlarmStatusResponseBodyAlarmStatusResourceDevice build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmStatusResponseBodyAlarmStatusResourceDevice self = new GetAlarmStatusResponseBodyAlarmStatusResourceDevice();
            return TeaModel.build(map, self);
        }

        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice setDeviceForm(String deviceForm) {
            this.deviceForm = deviceForm;
            return this;
        }
        public String getDeviceForm() {
            return this.deviceForm;
        }

        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice setSecurityDomain(String securityDomain) {
            this.securityDomain = securityDomain;
            return this;
        }
        public String getSecurityDomain() {
            return this.securityDomain;
        }

        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice setSpace(String space) {
            this.space = space;
            return this;
        }
        public String getSpace() {
            return this.space;
        }

        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class GetAlarmStatusResponseBodyAlarmStatus extends TeaModel {
        @NameInMap("AbnormalDataItem")
        public String abnormalDataItem;

        @NameInMap("AgentIp")
        public String agentIp;

        @NameInMap("AggregateData")
        public GetAlarmStatusResponseBodyAlarmStatusAggregateData aggregateData;

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
        public GetAlarmStatusResponseBodyAlarmStatusDedicatedLine dedicatedLine;

        @NameInMap("DedicatedLineId")
        public String dedicatedLineId;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("FirstAbnormalTime")
        public String firstAbnormalTime;

        @NameInMap("MonitorItem")
        public GetAlarmStatusResponseBodyAlarmStatusMonitorItem monitorItem;

        @NameInMap("MonitorItemId")
        public String monitorItemId;

        @NameInMap("NotificationSwitch")
        public GetAlarmStatusResponseBodyAlarmStatusNotificationSwitch notificationSwitch;

        @NameInMap("PortCollection")
        public GetAlarmStatusResponseBodyAlarmStatusPortCollection portCollection;

        @NameInMap("PortCollectionId")
        public String portCollectionId;

        @NameInMap("ReceiveTime")
        public String receiveTime;

        @NameInMap("ResourceApp")
        public GetAlarmStatusResponseBodyAlarmStatusResourceApp resourceApp;

        @NameInMap("ResourceDevice")
        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice resourceDevice;

        @NameInMap("ResponseCode")
        public String responseCode;

        @NameInMap("Result")
        public String result;

        @NameInMap("UniqueKey")
        public String uniqueKey;

        public static GetAlarmStatusResponseBodyAlarmStatus build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmStatusResponseBodyAlarmStatus self = new GetAlarmStatusResponseBodyAlarmStatus();
            return TeaModel.build(map, self);
        }

        public GetAlarmStatusResponseBodyAlarmStatus setAbnormalDataItem(String abnormalDataItem) {
            this.abnormalDataItem = abnormalDataItem;
            return this;
        }
        public String getAbnormalDataItem() {
            return this.abnormalDataItem;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setAgentIp(String agentIp) {
            this.agentIp = agentIp;
            return this;
        }
        public String getAgentIp() {
            return this.agentIp;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setAggregateData(GetAlarmStatusResponseBodyAlarmStatusAggregateData aggregateData) {
            this.aggregateData = aggregateData;
            return this;
        }
        public GetAlarmStatusResponseBodyAlarmStatusAggregateData getAggregateData() {
            return this.aggregateData;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setAggregateDataId(String aggregateDataId) {
            this.aggregateDataId = aggregateDataId;
            return this;
        }
        public String getAggregateDataId() {
            return this.aggregateDataId;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setAlarmRule(String alarmRule) {
            this.alarmRule = alarmRule;
            return this;
        }
        public String getAlarmRule() {
            return this.alarmRule;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setCollectionTime(String collectionTime) {
            this.collectionTime = collectionTime;
            return this;
        }
        public String getCollectionTime() {
            return this.collectionTime;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setDedicatedLine(GetAlarmStatusResponseBodyAlarmStatusDedicatedLine dedicatedLine) {
            this.dedicatedLine = dedicatedLine;
            return this;
        }
        public GetAlarmStatusResponseBodyAlarmStatusDedicatedLine getDedicatedLine() {
            return this.dedicatedLine;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setDedicatedLineId(String dedicatedLineId) {
            this.dedicatedLineId = dedicatedLineId;
            return this;
        }
        public String getDedicatedLineId() {
            return this.dedicatedLineId;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setFirstAbnormalTime(String firstAbnormalTime) {
            this.firstAbnormalTime = firstAbnormalTime;
            return this;
        }
        public String getFirstAbnormalTime() {
            return this.firstAbnormalTime;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setMonitorItem(GetAlarmStatusResponseBodyAlarmStatusMonitorItem monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public GetAlarmStatusResponseBodyAlarmStatusMonitorItem getMonitorItem() {
            return this.monitorItem;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setMonitorItemId(String monitorItemId) {
            this.monitorItemId = monitorItemId;
            return this;
        }
        public String getMonitorItemId() {
            return this.monitorItemId;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setNotificationSwitch(GetAlarmStatusResponseBodyAlarmStatusNotificationSwitch notificationSwitch) {
            this.notificationSwitch = notificationSwitch;
            return this;
        }
        public GetAlarmStatusResponseBodyAlarmStatusNotificationSwitch getNotificationSwitch() {
            return this.notificationSwitch;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setPortCollection(GetAlarmStatusResponseBodyAlarmStatusPortCollection portCollection) {
            this.portCollection = portCollection;
            return this;
        }
        public GetAlarmStatusResponseBodyAlarmStatusPortCollection getPortCollection() {
            return this.portCollection;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setPortCollectionId(String portCollectionId) {
            this.portCollectionId = portCollectionId;
            return this;
        }
        public String getPortCollectionId() {
            return this.portCollectionId;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setReceiveTime(String receiveTime) {
            this.receiveTime = receiveTime;
            return this;
        }
        public String getReceiveTime() {
            return this.receiveTime;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setResourceApp(GetAlarmStatusResponseBodyAlarmStatusResourceApp resourceApp) {
            this.resourceApp = resourceApp;
            return this;
        }
        public GetAlarmStatusResponseBodyAlarmStatusResourceApp getResourceApp() {
            return this.resourceApp;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setResourceDevice(GetAlarmStatusResponseBodyAlarmStatusResourceDevice resourceDevice) {
            this.resourceDevice = resourceDevice;
            return this;
        }
        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice getResourceDevice() {
            return this.resourceDevice;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setResponseCode(String responseCode) {
            this.responseCode = responseCode;
            return this;
        }
        public String getResponseCode() {
            return this.responseCode;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setUniqueKey(String uniqueKey) {
            this.uniqueKey = uniqueKey;
            return this;
        }
        public String getUniqueKey() {
            return this.uniqueKey;
        }

    }

}
