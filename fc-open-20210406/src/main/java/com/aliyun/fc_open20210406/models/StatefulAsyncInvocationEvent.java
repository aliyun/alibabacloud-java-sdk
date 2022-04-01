// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class StatefulAsyncInvocationEvent extends TeaModel {
    // 事件详细数据。
    @NameInMap("eventDetail")
    public String eventDetail;

    // 事件ID。
    @NameInMap("eventId")
    public Long eventId;

    // 事件执行状态。
    @NameInMap("status")
    public String status;

    // 事件时间。
    @NameInMap("timestamp")
    public Long timestamp;

    public static StatefulAsyncInvocationEvent build(java.util.Map<String, ?> map) throws Exception {
        StatefulAsyncInvocationEvent self = new StatefulAsyncInvocationEvent();
        return TeaModel.build(map, self);
    }

    public StatefulAsyncInvocationEvent setEventDetail(String eventDetail) {
        this.eventDetail = eventDetail;
        return this;
    }
    public String getEventDetail() {
        return this.eventDetail;
    }

    public StatefulAsyncInvocationEvent setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public StatefulAsyncInvocationEvent setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public StatefulAsyncInvocationEvent setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
