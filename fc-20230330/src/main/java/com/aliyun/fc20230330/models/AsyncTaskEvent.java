// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class AsyncTaskEvent extends TeaModel {
    @NameInMap("eventDetail")
    public String eventDetail;

    @NameInMap("eventId")
    public Long eventId;

    @NameInMap("status")
    public String status;

    @NameInMap("timestamp")
    public Long timestamp;

    public static AsyncTaskEvent build(java.util.Map<String, ?> map) throws Exception {
        AsyncTaskEvent self = new AsyncTaskEvent();
        return TeaModel.build(map, self);
    }

    public AsyncTaskEvent setEventDetail(String eventDetail) {
        this.eventDetail = eventDetail;
        return this;
    }
    public String getEventDetail() {
        return this.eventDetail;
    }

    public AsyncTaskEvent setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public AsyncTaskEvent setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AsyncTaskEvent setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
