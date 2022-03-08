// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetAlarmStatusResponseBody extends TeaModel {
    // 告警状态
    @NameInMap("AlarmStatus")
    public GetAlarmStatusResponseBodyAlarmStatus alarmStatus;

    // request Id
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
        // 描述
        @NameInMap("AggregateDataDescription")
        public String aggregateDataDescription;

        // 聚合数据ID
        @NameInMap("AggregateDataId")
        public String aggregateDataId;

        // 聚合数据名称
        @NameInMap("AggregateDataName")
        public String aggregateDataName;

        // 聚合方式
        @NameInMap("AggregateMode")
        public String aggregateMode;

        // 数据项
        @NameInMap("DataItem")
        public String dataItem;

        // 设备ID
        @NameInMap("DeviceId")
        public String deviceId;

        // 是否聚合全部设备
        @NameInMap("IsAllDevice")
        public Integer isAllDevice;

        // 监控项ID
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
        // 带宽
        @NameInMap("Bandwidth")
        public String bandwidth;

        // 对端IP
        @NameInMap("DedicatedLineGateway")
        public String dedicatedLineGateway;

        // 专线名称
        @NameInMap("DedicatedLineName")
        public String dedicatedLineName;

        // 设备ID
        @NameInMap("DeviceId")
        public String deviceId;

        // IP
        @NameInMap("Ip")
        public String ip;

        // 端口名
        @NameInMap("PortName")
        public String portName;

        // 物理空间
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
        // 采集类型
        @NameInMap("CollectionType")
        public String collectionType;

        // 设备形态
        @NameInMap("DeviceForm")
        public String deviceForm;

        // 是否启用
        @NameInMap("Effective")
        public Long effective;

        // 执行间隔
        @NameInMap("ExecInterval")
        public String execInterval;

        // 描述
        @NameInMap("MonitorItemDescription")
        public String monitorItemDescription;

        // 监控项ID
        @NameInMap("MonitorItemId")
        public String monitorItemId;

        // 监控项名称
        @NameInMap("MonitorItemName")
        public String monitorItemName;

        // 安全域
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
        // 关闭到期时间
        @NameInMap("ExpiryTime")
        public String expiryTime;

        // 关闭原因
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
        // 设备名
        @NameInMap("HostName")
        public String hostName;

        // IP
        @NameInMap("Ip")
        public String ip;

        // 安全域
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
        // 设备ID
        @NameInMap("DeviceId")
        public String deviceId;

        // 端口名
        @NameInMap("PortName")
        public String portName;

        // 设备详情
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
        // 端口集描述
        @NameInMap("PortCollectionDescription")
        public String portCollectionDescription;

        // 端口集ID
        @NameInMap("PortCollectionId")
        public String portCollectionId;

        // 端口集名称
        @NameInMap("PortCollectionName")
        public String portCollectionName;

        // 端口列表
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
        // 应用ID
        @NameInMap("AppId")
        public String appId;

        // 监控域名
        @NameInMap("Domain")
        public String domain;

        // 端口
        @NameInMap("Port")
        public String port;

        // 所属探针
        @NameInMap("SecurityDomain")
        public String securityDomain;

        // 资源类型
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
        // 设备形态
        @NameInMap("DeviceForm")
        public String deviceForm;

        // 设备ID
        @NameInMap("DeviceId")
        public String deviceId;

        // 设备名
        @NameInMap("HostName")
        public String hostName;

        // IP
        @NameInMap("Ip")
        public String ip;

        // 型号
        @NameInMap("Model")
        public String model;

        // 安全域
        @NameInMap("SecurityDomain")
        public String securityDomain;

        // sn
        @NameInMap("Sn")
        public String sn;

        // 物理空间
        @NameInMap("Space")
        public String space;

        // 状态
        @NameInMap("Status")
        public String status;

        // 厂商
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
        // 异常数据项
        @NameInMap("AbnormalDataItem")
        public String abnormalDataItem;

        // 采集探针IP
        @NameInMap("AgentIp")
        public String agentIp;

        // 聚合数据详情
        @NameInMap("AggregateData")
        public GetAlarmStatusResponseBodyAlarmStatusAggregateData aggregateData;

        // 聚合数据ID
        @NameInMap("AggregateDataId")
        public String aggregateDataId;

        // 命中告警规则
        @NameInMap("AlarmRule")
        public String alarmRule;

        // 告警状态
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        // 应用ID
        @NameInMap("AppId")
        public String appId;

        // 采集时间
        @NameInMap("CollectionTime")
        public String collectionTime;

        // 专线详情
        @NameInMap("DedicatedLine")
        public GetAlarmStatusResponseBodyAlarmStatusDedicatedLine dedicatedLine;

        // 专线ID
        @NameInMap("DedicatedLineId")
        public String dedicatedLineId;

        // 设备ID
        @NameInMap("DeviceId")
        public String deviceId;

        // 首次异常时间
        @NameInMap("FirstAbnormalTime")
        public String firstAbnormalTime;

        // 监控项
        @NameInMap("MonitorItem")
        public GetAlarmStatusResponseBodyAlarmStatusMonitorItem monitorItem;

        // 监控项ID
        @NameInMap("MonitorItemId")
        public String monitorItemId;

        // 告警开关
        @NameInMap("NotificationSwitch")
        public GetAlarmStatusResponseBodyAlarmStatusNotificationSwitch notificationSwitch;

        @NameInMap("PortCollection")
        public GetAlarmStatusResponseBodyAlarmStatusPortCollection portCollection;

        // 端口集ID
        @NameInMap("PortCollectionId")
        public String portCollectionId;

        // 接收时间
        @NameInMap("ReceiveTime")
        public String receiveTime;

        // 应用
        @NameInMap("ResourceApp")
        public GetAlarmStatusResponseBodyAlarmStatusResourceApp resourceApp;

        // 设备
        @NameInMap("ResourceDevice")
        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice resourceDevice;

        // 采集状态码
        @NameInMap("ResponseCode")
        public String responseCode;

        // 采集结果
        @NameInMap("Result")
        public String result;

        // 索引
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
