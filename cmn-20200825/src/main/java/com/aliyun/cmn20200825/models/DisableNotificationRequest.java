// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DisableNotificationRequest extends TeaModel {
    @NameInMap("ExpiryTime")
    public String expiryTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("List")
    public java.util.List<DisableNotificationRequestList> list;

    @NameInMap("Reason")
    public String reason;

    public static DisableNotificationRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableNotificationRequest self = new DisableNotificationRequest();
        return TeaModel.build(map, self);
    }

    public DisableNotificationRequest setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }
    public String getExpiryTime() {
        return this.expiryTime;
    }

    public DisableNotificationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DisableNotificationRequest setList(java.util.List<DisableNotificationRequestList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DisableNotificationRequestList> getList() {
        return this.list;
    }

    public DisableNotificationRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public static class DisableNotificationRequestList extends TeaModel {
        @NameInMap("AggregateDataId")
        public String aggregateDataId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("DedicatedLineId")
        public String dedicatedLineId;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("EventObjectId")
        public String eventObjectId;

        @NameInMap("MonitorItemId")
        public String monitorItemId;

        @NameInMap("PortCollectionId")
        public String portCollectionId;

        @NameInMap("Type")
        public String type;

        public static DisableNotificationRequestList build(java.util.Map<String, ?> map) throws Exception {
            DisableNotificationRequestList self = new DisableNotificationRequestList();
            return TeaModel.build(map, self);
        }

        public DisableNotificationRequestList setAggregateDataId(String aggregateDataId) {
            this.aggregateDataId = aggregateDataId;
            return this;
        }
        public String getAggregateDataId() {
            return this.aggregateDataId;
        }

        public DisableNotificationRequestList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DisableNotificationRequestList setDedicatedLineId(String dedicatedLineId) {
            this.dedicatedLineId = dedicatedLineId;
            return this;
        }
        public String getDedicatedLineId() {
            return this.dedicatedLineId;
        }

        public DisableNotificationRequestList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DisableNotificationRequestList setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DisableNotificationRequestList setEventObjectId(String eventObjectId) {
            this.eventObjectId = eventObjectId;
            return this;
        }
        public String getEventObjectId() {
            return this.eventObjectId;
        }

        public DisableNotificationRequestList setMonitorItemId(String monitorItemId) {
            this.monitorItemId = monitorItemId;
            return this;
        }
        public String getMonitorItemId() {
            return this.monitorItemId;
        }

        public DisableNotificationRequestList setPortCollectionId(String portCollectionId) {
            this.portCollectionId = portCollectionId;
            return this;
        }
        public String getPortCollectionId() {
            return this.portCollectionId;
        }

        public DisableNotificationRequestList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
