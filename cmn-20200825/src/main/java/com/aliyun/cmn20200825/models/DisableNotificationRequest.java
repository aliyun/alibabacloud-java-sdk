// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DisableNotificationRequest extends TeaModel {
    // 到期时间
    @NameInMap("ExpiryTime")
    public String expiryTime;

    // 关闭原因
    @NameInMap("Reason")
    public String reason;

    // 关闭通知的对象
    @NameInMap("List")
    public java.util.List<DisableNotificationRequestList> list;

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

    public DisableNotificationRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public DisableNotificationRequest setList(java.util.List<DisableNotificationRequestList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DisableNotificationRequestList> getList() {
        return this.list;
    }

    public static class DisableNotificationRequestList extends TeaModel {
        // 设备ID
        @NameInMap("DeviceId")
        public String deviceId;

        // 监控项ID
        @NameInMap("MonitorItemId")
        public String monitorItemId;

        // 聚合数据ID
        @NameInMap("AggregateDataId")
        public String aggregateDataId;

        // 类型
        @NameInMap("Type")
        public String type;

        // 专线ID
        @NameInMap("DedicatedLineId")
        public String dedicatedLineId;

        public static DisableNotificationRequestList build(java.util.Map<String, ?> map) throws Exception {
            DisableNotificationRequestList self = new DisableNotificationRequestList();
            return TeaModel.build(map, self);
        }

        public DisableNotificationRequestList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DisableNotificationRequestList setMonitorItemId(String monitorItemId) {
            this.monitorItemId = monitorItemId;
            return this;
        }
        public String getMonitorItemId() {
            return this.monitorItemId;
        }

        public DisableNotificationRequestList setAggregateDataId(String aggregateDataId) {
            this.aggregateDataId = aggregateDataId;
            return this;
        }
        public String getAggregateDataId() {
            return this.aggregateDataId;
        }

        public DisableNotificationRequestList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DisableNotificationRequestList setDedicatedLineId(String dedicatedLineId) {
            this.dedicatedLineId = dedicatedLineId;
            return this;
        }
        public String getDedicatedLineId() {
            return this.dedicatedLineId;
        }

    }

}
