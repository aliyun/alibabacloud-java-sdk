// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class AsyncTaskEvent extends TeaModel {
    /**
     * <p>The details of the event payload.</p>
     * 
     * <strong>example:</strong>
     * <p>body</p>
     */
    @NameInMap("eventDetail")
    public String eventDetail;

    /**
     * <p>The event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("eventId")
    public Long eventId;

    /**
     * <p>The state of the event.</p>
     * <ul>
     * <li>Enqueued: The asynchronous invocation is enqueued and is waiting to be executed.</li>
     * <li>Succeeded: The invocation is successful.</li>
     * <li>Failed: The invocation fails.</li>
     * <li>Running: The invocation is being executed.</li>
     * <li>Stopped: The invocation is terminated.</li>
     * <li>Stopping: The invocation is being terminated.</li>
     * <li>Invalid: The invocation is invalid and not executed due to specific reasons. For example, the function is deleted.</li>
     * <li>Expired: The maximum validity period of messages is specified for asynchronous invocation. The invocation is discarded and not executed because the specified maximum validity period of has elapsed.</li>
     * <li>Retrying: The asynchronous invocation is being retried due to an execution error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The timestamp when the event occurred. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1647420449721</p>
     */
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
