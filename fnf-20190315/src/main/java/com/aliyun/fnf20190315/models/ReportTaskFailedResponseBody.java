// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ReportTaskFailedResponseBody extends TeaModel {
    /**
     * <p>The ID of the event.</p>
     */
    @NameInMap("EventId")
    public Long eventId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReportTaskFailedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportTaskFailedResponseBody self = new ReportTaskFailedResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportTaskFailedResponseBody setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public ReportTaskFailedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
