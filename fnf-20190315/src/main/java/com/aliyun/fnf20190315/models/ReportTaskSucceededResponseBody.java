// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ReportTaskSucceededResponseBody extends TeaModel {
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

    public static ReportTaskSucceededResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportTaskSucceededResponseBody self = new ReportTaskSucceededResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportTaskSucceededResponseBody setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public ReportTaskSucceededResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
