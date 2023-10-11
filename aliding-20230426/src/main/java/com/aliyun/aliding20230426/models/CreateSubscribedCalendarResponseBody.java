// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateSubscribedCalendarResponseBody extends TeaModel {
    @NameInMap("calendarId")
    public String calendarId;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateSubscribedCalendarResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscribedCalendarResponseBody self = new CreateSubscribedCalendarResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSubscribedCalendarResponseBody setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

    public CreateSubscribedCalendarResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
