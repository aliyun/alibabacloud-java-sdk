// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class EnableNotificationRequest extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 通知对象
    @NameInMap("List")
    public java.util.List<EnableNotificationRequestList> list;

    public static EnableNotificationRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableNotificationRequest self = new EnableNotificationRequest();
        return TeaModel.build(map, self);
    }

    public EnableNotificationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableNotificationRequest setList(java.util.List<EnableNotificationRequestList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<EnableNotificationRequestList> getList() {
        return this.list;
    }

    public static class EnableNotificationRequestList extends TeaModel {
        // 聚合数据ID
        @NameInMap("AggregateDataId")
        public String aggregateDataId;

        // 应用ID
        @NameInMap("AppId")
        public String appId;

        // 专线ID
        @NameInMap("DedicatedLineId")
        public String dedicatedLineId;

        // 设备ID
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("EventObjectId")
        public String eventObjectId;

        // 监控项ID
        @NameInMap("MonitorItemId")
        public String monitorItemId;

        // 端口集ID
        @NameInMap("PortCollectionId")
        public String portCollectionId;

        // 类型
        @NameInMap("Type")
        public String type;

        public static EnableNotificationRequestList build(java.util.Map<String, ?> map) throws Exception {
            EnableNotificationRequestList self = new EnableNotificationRequestList();
            return TeaModel.build(map, self);
        }

        public EnableNotificationRequestList setAggregateDataId(String aggregateDataId) {
            this.aggregateDataId = aggregateDataId;
            return this;
        }
        public String getAggregateDataId() {
            return this.aggregateDataId;
        }

        public EnableNotificationRequestList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public EnableNotificationRequestList setDedicatedLineId(String dedicatedLineId) {
            this.dedicatedLineId = dedicatedLineId;
            return this;
        }
        public String getDedicatedLineId() {
            return this.dedicatedLineId;
        }

        public EnableNotificationRequestList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public EnableNotificationRequestList setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public EnableNotificationRequestList setEventObjectId(String eventObjectId) {
            this.eventObjectId = eventObjectId;
            return this;
        }
        public String getEventObjectId() {
            return this.eventObjectId;
        }

        public EnableNotificationRequestList setMonitorItemId(String monitorItemId) {
            this.monitorItemId = monitorItemId;
            return this;
        }
        public String getMonitorItemId() {
            return this.monitorItemId;
        }

        public EnableNotificationRequestList setPortCollectionId(String portCollectionId) {
            this.portCollectionId = portCollectionId;
            return this;
        }
        public String getPortCollectionId() {
            return this.portCollectionId;
        }

        public EnableNotificationRequestList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
