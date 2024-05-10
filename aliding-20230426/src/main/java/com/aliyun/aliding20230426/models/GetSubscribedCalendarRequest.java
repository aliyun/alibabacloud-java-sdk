// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSubscribedCalendarRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CalendarId")
    public String calendarId;

    public static GetSubscribedCalendarRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubscribedCalendarRequest self = new GetSubscribedCalendarRequest();
        return TeaModel.build(map, self);
    }

    public GetSubscribedCalendarRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

}
