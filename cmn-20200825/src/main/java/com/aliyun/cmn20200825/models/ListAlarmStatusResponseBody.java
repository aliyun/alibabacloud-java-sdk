// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListAlarmStatusResponseBody extends TeaModel {
    // TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
    @NameInMap("TotalCount")
    public Integer totalCount;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("NextToken")
    public String nextToken;

    // MaxResults本次请求所返回的最大记录条数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 告警状态列表
    @NameInMap("AlarmStatus")
    public java.util.List<ListAlarmStatusResponseBodyAlarmStatus> alarmStatus;

    public static ListAlarmStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmStatusResponseBody self = new ListAlarmStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlarmStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAlarmStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlarmStatusResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAlarmStatusResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAlarmStatusResponseBody setAlarmStatus(java.util.List<ListAlarmStatusResponseBodyAlarmStatus> alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }
    public java.util.List<ListAlarmStatusResponseBodyAlarmStatus> getAlarmStatus() {
        return this.alarmStatus;
    }

    public static class ListAlarmStatusResponseBodyAlarmStatusResourceDevice extends TeaModel {
        // 设备名
        @NameInMap("HostName")
        public String hostName;

        public static ListAlarmStatusResponseBodyAlarmStatusResourceDevice build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmStatusResponseBodyAlarmStatusResourceDevice self = new ListAlarmStatusResponseBodyAlarmStatusResourceDevice();
            return TeaModel.build(map, self);
        }

        public ListAlarmStatusResponseBodyAlarmStatusResourceDevice setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

    }

    public static class ListAlarmStatusResponseBodyAlarmStatusMonitorItem extends TeaModel {
        // 监控项名称
        @NameInMap("MonitorItemName")
        public String monitorItemName;

        public static ListAlarmStatusResponseBodyAlarmStatusMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmStatusResponseBodyAlarmStatusMonitorItem self = new ListAlarmStatusResponseBodyAlarmStatusMonitorItem();
            return TeaModel.build(map, self);
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
        // 关闭原因
        @NameInMap("Reason")
        public String reason;

        // 关闭到期时间
        @NameInMap("ExpiryTime")
        public String expiryTime;

        public static ListAlarmStatusResponseBodyAlarmStatusNotificationSwitch build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmStatusResponseBodyAlarmStatusNotificationSwitch self = new ListAlarmStatusResponseBodyAlarmStatusNotificationSwitch();
            return TeaModel.build(map, self);
        }

        public ListAlarmStatusResponseBodyAlarmStatusNotificationSwitch setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListAlarmStatusResponseBodyAlarmStatusNotificationSwitch setExpiryTime(String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        public String getExpiryTime() {
            return this.expiryTime;
        }

    }

    public static class ListAlarmStatusResponseBodyAlarmStatusAggregateData extends TeaModel {
        // 聚合数据名称
        @NameInMap("AggregateDataName")
        public String aggregateDataName;

        // 数据项
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
        // 专线名称
        @NameInMap("DedicatedLineName")
        public String dedicatedLineName;

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

    }

    public static class ListAlarmStatusResponseBodyAlarmStatus extends TeaModel {
        // 设备ID
        @NameInMap("DeviceId")
        public String deviceId;

        // 监控项ID
        @NameInMap("MonitorItemId")
        public String monitorItemId;

        // 检测时间
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
        public ListAlarmStatusResponseBodyAlarmStatusResourceDevice resourceDevice;

        // 监控项
        @NameInMap("MonitorItem")
        public ListAlarmStatusResponseBodyAlarmStatusMonitorItem monitorItem;

        // 首次异常时间
        @NameInMap("FirstAbnormalTime")
        public String firstAbnormalTime;

        // 告警开关配置
        @NameInMap("NotificationSwitch")
        public ListAlarmStatusResponseBodyAlarmStatusNotificationSwitch notificationSwitch;

        // 聚合数据ID
        @NameInMap("AggregateDataId")
        public String aggregateDataId;

        // 聚合数据
        @NameInMap("AggregateData")
        public ListAlarmStatusResponseBodyAlarmStatusAggregateData aggregateData;

        // 专线ID
        @NameInMap("DedicatedLineId")
        public String dedicatedLineId;

        // 专线
        @NameInMap("DedicatedLine")
        public ListAlarmStatusResponseBodyAlarmStatusDedicatedLine dedicatedLine;

        public static ListAlarmStatusResponseBodyAlarmStatus build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmStatusResponseBodyAlarmStatus self = new ListAlarmStatusResponseBodyAlarmStatus();
            return TeaModel.build(map, self);
        }

        public ListAlarmStatusResponseBodyAlarmStatus setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setMonitorItemId(String monitorItemId) {
            this.monitorItemId = monitorItemId;
            return this;
        }
        public String getMonitorItemId() {
            return this.monitorItemId;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setCollectionTime(String collectionTime) {
            this.collectionTime = collectionTime;
            return this;
        }
        public String getCollectionTime() {
            return this.collectionTime;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setReceiveTime(String receiveTime) {
            this.receiveTime = receiveTime;
            return this;
        }
        public String getReceiveTime() {
            return this.receiveTime;
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

        public ListAlarmStatusResponseBodyAlarmStatus setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setAbnormalDataItem(String abnormalDataItem) {
            this.abnormalDataItem = abnormalDataItem;
            return this;
        }
        public String getAbnormalDataItem() {
            return this.abnormalDataItem;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setUniqueKey(String uniqueKey) {
            this.uniqueKey = uniqueKey;
            return this;
        }
        public String getUniqueKey() {
            return this.uniqueKey;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setResponseCode(String responseCode) {
            this.responseCode = responseCode;
            return this;
        }
        public String getResponseCode() {
            return this.responseCode;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setResourceDevice(ListAlarmStatusResponseBodyAlarmStatusResourceDevice resourceDevice) {
            this.resourceDevice = resourceDevice;
            return this;
        }
        public ListAlarmStatusResponseBodyAlarmStatusResourceDevice getResourceDevice() {
            return this.resourceDevice;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setMonitorItem(ListAlarmStatusResponseBodyAlarmStatusMonitorItem monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public ListAlarmStatusResponseBodyAlarmStatusMonitorItem getMonitorItem() {
            return this.monitorItem;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setFirstAbnormalTime(String firstAbnormalTime) {
            this.firstAbnormalTime = firstAbnormalTime;
            return this;
        }
        public String getFirstAbnormalTime() {
            return this.firstAbnormalTime;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setNotificationSwitch(ListAlarmStatusResponseBodyAlarmStatusNotificationSwitch notificationSwitch) {
            this.notificationSwitch = notificationSwitch;
            return this;
        }
        public ListAlarmStatusResponseBodyAlarmStatusNotificationSwitch getNotificationSwitch() {
            return this.notificationSwitch;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setAggregateDataId(String aggregateDataId) {
            this.aggregateDataId = aggregateDataId;
            return this;
        }
        public String getAggregateDataId() {
            return this.aggregateDataId;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setAggregateData(ListAlarmStatusResponseBodyAlarmStatusAggregateData aggregateData) {
            this.aggregateData = aggregateData;
            return this;
        }
        public ListAlarmStatusResponseBodyAlarmStatusAggregateData getAggregateData() {
            return this.aggregateData;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setDedicatedLineId(String dedicatedLineId) {
            this.dedicatedLineId = dedicatedLineId;
            return this;
        }
        public String getDedicatedLineId() {
            return this.dedicatedLineId;
        }

        public ListAlarmStatusResponseBodyAlarmStatus setDedicatedLine(ListAlarmStatusResponseBodyAlarmStatusDedicatedLine dedicatedLine) {
            this.dedicatedLine = dedicatedLine;
            return this;
        }
        public ListAlarmStatusResponseBodyAlarmStatusDedicatedLine getDedicatedLine() {
            return this.dedicatedLine;
        }

    }

}
