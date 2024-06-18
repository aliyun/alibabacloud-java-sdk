// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateSubscribedCalendarResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>M5MjkxNDUxQHVzZXJzLmRpbmd0YWxrLmxxxxxxx</p>
     */
    @NameInMap("calendarId")
    public String calendarId;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
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
