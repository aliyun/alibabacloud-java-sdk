// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetAlarmStatusResponseBody extends TeaModel {
    // request Id
    @NameInMap("RequestId")
    public String requestId;

    // 告警状态
    @NameInMap("AlarmStatus")
    public GetAlarmStatusResponseBodyAlarmStatus alarmStatus;

    public static GetAlarmStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlarmStatusResponseBody self = new GetAlarmStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlarmStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAlarmStatusResponseBody setAlarmStatus(GetAlarmStatusResponseBodyAlarmStatus alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }
    public GetAlarmStatusResponseBodyAlarmStatus getAlarmStatus() {
        return this.alarmStatus;
    }

    public static class GetAlarmStatusResponseBodyAlarmStatusResourceDevice extends TeaModel {
        // 设备名
        @NameInMap("HostName")
        public String hostName;

        // IP
        @NameInMap("Ip")
        public String ip;

        // 厂商
        @NameInMap("Vendor")
        public String vendor;

        // 型号
        @NameInMap("Model")
        public String model;

        // 状态
        @NameInMap("Status")
        public String status;

        // sn
        @NameInMap("Sn")
        public String sn;

        // 物理空间
        @NameInMap("Space")
        public String space;

        // 设备ID
        @NameInMap("DeviceId")
        public String deviceId;

        // 安全域
        @NameInMap("SecurityDomain")
        public String securityDomain;

        // 设备形态
        @NameInMap("DeviceForm")
        public String deviceForm;

        public static GetAlarmStatusResponseBodyAlarmStatusResourceDevice build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmStatusResponseBodyAlarmStatusResourceDevice self = new GetAlarmStatusResponseBodyAlarmStatusResourceDevice();
            return TeaModel.build(map, self);
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

        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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

        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice setSecurityDomain(String securityDomain) {
            this.securityDomain = securityDomain;
            return this;
        }
        public String getSecurityDomain() {
            return this.securityDomain;
        }

        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice setDeviceForm(String deviceForm) {
            this.deviceForm = deviceForm;
            return this;
        }
        public String getDeviceForm() {
            return this.deviceForm;
        }

    }

    public static class GetAlarmStatusResponseBodyAlarmStatusMonitorItem extends TeaModel {
        // 监控项名称
        @NameInMap("MonitorItemName")
        public String monitorItemName;

        // 描述
        @NameInMap("MonitorItemDescription")
        public String monitorItemDescription;

        // 安全域
        @NameInMap("SecurityDomain")
        public String securityDomain;

        // 采集类型
        @NameInMap("CollectionType")
        public String collectionType;

        // 执行间隔
        @NameInMap("ExecInterval")
        public String execInterval;

        // 监控项ID
        @NameInMap("MonitorItemId")
        public String monitorItemId;

        // 设备形态
        @NameInMap("DeviceForm")
        public String deviceForm;

        // 是否启用
        @NameInMap("Effective")
        public Long effective;

        public static GetAlarmStatusResponseBodyAlarmStatusMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmStatusResponseBodyAlarmStatusMonitorItem self = new GetAlarmStatusResponseBodyAlarmStatusMonitorItem();
            return TeaModel.build(map, self);
        }

        public GetAlarmStatusResponseBodyAlarmStatusMonitorItem setMonitorItemName(String monitorItemName) {
            this.monitorItemName = monitorItemName;
            return this;
        }
        public String getMonitorItemName() {
            return this.monitorItemName;
        }

        public GetAlarmStatusResponseBodyAlarmStatusMonitorItem setMonitorItemDescription(String monitorItemDescription) {
            this.monitorItemDescription = monitorItemDescription;
            return this;
        }
        public String getMonitorItemDescription() {
            return this.monitorItemDescription;
        }

        public GetAlarmStatusResponseBodyAlarmStatusMonitorItem setSecurityDomain(String securityDomain) {
            this.securityDomain = securityDomain;
            return this;
        }
        public String getSecurityDomain() {
            return this.securityDomain;
        }

        public GetAlarmStatusResponseBodyAlarmStatusMonitorItem setCollectionType(String collectionType) {
            this.collectionType = collectionType;
            return this;
        }
        public String getCollectionType() {
            return this.collectionType;
        }

        public GetAlarmStatusResponseBodyAlarmStatusMonitorItem setExecInterval(String execInterval) {
            this.execInterval = execInterval;
            return this;
        }
        public String getExecInterval() {
            return this.execInterval;
        }

        public GetAlarmStatusResponseBodyAlarmStatusMonitorItem setMonitorItemId(String monitorItemId) {
            this.monitorItemId = monitorItemId;
            return this;
        }
        public String getMonitorItemId() {
            return this.monitorItemId;
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

    }

    public static class GetAlarmStatusResponseBodyAlarmStatusNotificationSwitch extends TeaModel {
        // 关闭原因
        @NameInMap("Reason")
        public String reason;

        // 关闭到期时间
        @NameInMap("ExpiryTime")
        public String expiryTime;

        public static GetAlarmStatusResponseBodyAlarmStatusNotificationSwitch build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmStatusResponseBodyAlarmStatusNotificationSwitch self = new GetAlarmStatusResponseBodyAlarmStatusNotificationSwitch();
            return TeaModel.build(map, self);
        }

        public GetAlarmStatusResponseBodyAlarmStatusNotificationSwitch setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetAlarmStatusResponseBodyAlarmStatusNotificationSwitch setExpiryTime(String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        public String getExpiryTime() {
            return this.expiryTime;
        }

    }

    public static class GetAlarmStatusResponseBodyAlarmStatusAggregateData extends TeaModel {
        // 聚合方式
        @NameInMap("AggregateMode")
        public String aggregateMode;

        // 描述
        @NameInMap("AggregateDataDescription")
        public String aggregateDataDescription;

        // 数据项
        @NameInMap("DataItem")
        public String dataItem;

        // 聚合数据名称
        @NameInMap("AggregateDataName")
        public String aggregateDataName;

        // 设备ID
        @NameInMap("DeviceId")
        public String deviceId;

        // 是否聚合全部设备
        @NameInMap("IsAllDevice")
        public Integer isAllDevice;

        // 聚合数据ID
        @NameInMap("AggregateDataId")
        public String aggregateDataId;

        // 监控项ID
        @NameInMap("MonitorItemId")
        public String monitorItemId;

        public static GetAlarmStatusResponseBodyAlarmStatusAggregateData build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmStatusResponseBodyAlarmStatusAggregateData self = new GetAlarmStatusResponseBodyAlarmStatusAggregateData();
            return TeaModel.build(map, self);
        }

        public GetAlarmStatusResponseBodyAlarmStatusAggregateData setAggregateMode(String aggregateMode) {
            this.aggregateMode = aggregateMode;
            return this;
        }
        public String getAggregateMode() {
            return this.aggregateMode;
        }

        public GetAlarmStatusResponseBodyAlarmStatusAggregateData setAggregateDataDescription(String aggregateDataDescription) {
            this.aggregateDataDescription = aggregateDataDescription;
            return this;
        }
        public String getAggregateDataDescription() {
            return this.aggregateDataDescription;
        }

        public GetAlarmStatusResponseBodyAlarmStatusAggregateData setDataItem(String dataItem) {
            this.dataItem = dataItem;
            return this;
        }
        public String getDataItem() {
            return this.dataItem;
        }

        public GetAlarmStatusResponseBodyAlarmStatusAggregateData setAggregateDataName(String aggregateDataName) {
            this.aggregateDataName = aggregateDataName;
            return this;
        }
        public String getAggregateDataName() {
            return this.aggregateDataName;
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

        public GetAlarmStatusResponseBodyAlarmStatusAggregateData setAggregateDataId(String aggregateDataId) {
            this.aggregateDataId = aggregateDataId;
            return this;
        }
        public String getAggregateDataId() {
            return this.aggregateDataId;
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
        // 专线名称
        @NameInMap("DedicatedLineName")
        public String dedicatedLineName;

        // 物理空间
        @NameInMap("Space")
        public String space;

        // 端口名
        @NameInMap("PortName")
        public String portName;

        // 设备ID
        @NameInMap("DeviceId")
        public String deviceId;

        // 带宽
        @NameInMap("Bandwidth")
        public String bandwidth;

        // IP
        @NameInMap("Ip")
        public String ip;

        public static GetAlarmStatusResponseBodyAlarmStatusDedicatedLine build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmStatusResponseBodyAlarmStatusDedicatedLine self = new GetAlarmStatusResponseBodyAlarmStatusDedicatedLine();
            return TeaModel.build(map, self);
        }

        public GetAlarmStatusResponseBodyAlarmStatusDedicatedLine setDedicatedLineName(String dedicatedLineName) {
            this.dedicatedLineName = dedicatedLineName;
            return this;
        }
        public String getDedicatedLineName() {
            return this.dedicatedLineName;
        }

        public GetAlarmStatusResponseBodyAlarmStatusDedicatedLine setSpace(String space) {
            this.space = space;
            return this;
        }
        public String getSpace() {
            return this.space;
        }

        public GetAlarmStatusResponseBodyAlarmStatusDedicatedLine setPortName(String portName) {
            this.portName = portName;
            return this;
        }
        public String getPortName() {
            return this.portName;
        }

        public GetAlarmStatusResponseBodyAlarmStatusDedicatedLine setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetAlarmStatusResponseBodyAlarmStatusDedicatedLine setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public GetAlarmStatusResponseBodyAlarmStatusDedicatedLine setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class GetAlarmStatusResponseBodyAlarmStatus extends TeaModel {
        // 设备ID
        @NameInMap("DeviceId")
        public String deviceId;

        // 监控项ID
        @NameInMap("MonitorItemId")
        public String monitorItemId;

        // 采集时间
        @NameInMap("CollectionTime")
        public String collectionTime;

        // 接收时间
        @NameInMap("ReceiveTime")
        public String receiveTime;

        // 命中告警规则
        @NameInMap("AlarmRule")
        public String alarmRule;

        // 告警状态
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        // 采集结果
        @NameInMap("Result")
        public String result;

        // 异常数据项
        @NameInMap("AbnormalDataItem")
        public String abnormalDataItem;

        // 索引
        @NameInMap("UniqueKey")
        public String uniqueKey;

        // 采集状态码
        @NameInMap("ResponseCode")
        public String responseCode;

        // 设备
        @NameInMap("ResourceDevice")
        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice resourceDevice;

        // 监控项
        @NameInMap("MonitorItem")
        public GetAlarmStatusResponseBodyAlarmStatusMonitorItem monitorItem;

        // 首次异常时间
        @NameInMap("FirstAbnormalTime")
        public String firstAbnormalTime;

        // 告警开关
        @NameInMap("NotificationSwitch")
        public GetAlarmStatusResponseBodyAlarmStatusNotificationSwitch notificationSwitch;

        // 聚合数据ID
        @NameInMap("AggregateDataId")
        public String aggregateDataId;

        // 专线ID
        @NameInMap("DedicatedLineId")
        public String dedicatedLineId;

        // 聚合数据详情
        @NameInMap("AggregateData")
        public GetAlarmStatusResponseBodyAlarmStatusAggregateData aggregateData;

        // 专线详情
        @NameInMap("DedicatedLine")
        public GetAlarmStatusResponseBodyAlarmStatusDedicatedLine dedicatedLine;

        public static GetAlarmStatusResponseBodyAlarmStatus build(java.util.Map<String, ?> map) throws Exception {
            GetAlarmStatusResponseBodyAlarmStatus self = new GetAlarmStatusResponseBodyAlarmStatus();
            return TeaModel.build(map, self);
        }

        public GetAlarmStatusResponseBodyAlarmStatus setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setMonitorItemId(String monitorItemId) {
            this.monitorItemId = monitorItemId;
            return this;
        }
        public String getMonitorItemId() {
            return this.monitorItemId;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setCollectionTime(String collectionTime) {
            this.collectionTime = collectionTime;
            return this;
        }
        public String getCollectionTime() {
            return this.collectionTime;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setReceiveTime(String receiveTime) {
            this.receiveTime = receiveTime;
            return this;
        }
        public String getReceiveTime() {
            return this.receiveTime;
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

        public GetAlarmStatusResponseBodyAlarmStatus setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setAbnormalDataItem(String abnormalDataItem) {
            this.abnormalDataItem = abnormalDataItem;
            return this;
        }
        public String getAbnormalDataItem() {
            return this.abnormalDataItem;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setUniqueKey(String uniqueKey) {
            this.uniqueKey = uniqueKey;
            return this;
        }
        public String getUniqueKey() {
            return this.uniqueKey;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setResponseCode(String responseCode) {
            this.responseCode = responseCode;
            return this;
        }
        public String getResponseCode() {
            return this.responseCode;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setResourceDevice(GetAlarmStatusResponseBodyAlarmStatusResourceDevice resourceDevice) {
            this.resourceDevice = resourceDevice;
            return this;
        }
        public GetAlarmStatusResponseBodyAlarmStatusResourceDevice getResourceDevice() {
            return this.resourceDevice;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setMonitorItem(GetAlarmStatusResponseBodyAlarmStatusMonitorItem monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public GetAlarmStatusResponseBodyAlarmStatusMonitorItem getMonitorItem() {
            return this.monitorItem;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setFirstAbnormalTime(String firstAbnormalTime) {
            this.firstAbnormalTime = firstAbnormalTime;
            return this;
        }
        public String getFirstAbnormalTime() {
            return this.firstAbnormalTime;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setNotificationSwitch(GetAlarmStatusResponseBodyAlarmStatusNotificationSwitch notificationSwitch) {
            this.notificationSwitch = notificationSwitch;
            return this;
        }
        public GetAlarmStatusResponseBodyAlarmStatusNotificationSwitch getNotificationSwitch() {
            return this.notificationSwitch;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setAggregateDataId(String aggregateDataId) {
            this.aggregateDataId = aggregateDataId;
            return this;
        }
        public String getAggregateDataId() {
            return this.aggregateDataId;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setDedicatedLineId(String dedicatedLineId) {
            this.dedicatedLineId = dedicatedLineId;
            return this;
        }
        public String getDedicatedLineId() {
            return this.dedicatedLineId;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setAggregateData(GetAlarmStatusResponseBodyAlarmStatusAggregateData aggregateData) {
            this.aggregateData = aggregateData;
            return this;
        }
        public GetAlarmStatusResponseBodyAlarmStatusAggregateData getAggregateData() {
            return this.aggregateData;
        }

        public GetAlarmStatusResponseBodyAlarmStatus setDedicatedLine(GetAlarmStatusResponseBodyAlarmStatusDedicatedLine dedicatedLine) {
            this.dedicatedLine = dedicatedLine;
            return this;
        }
        public GetAlarmStatusResponseBodyAlarmStatusDedicatedLine getDedicatedLine() {
            return this.dedicatedLine;
        }

    }

}
