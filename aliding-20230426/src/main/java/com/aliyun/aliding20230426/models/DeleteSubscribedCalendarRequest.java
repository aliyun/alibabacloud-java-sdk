// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteSubscribedCalendarRequest extends TeaModel {
    @NameInMap("CalendarId")
    public String calendarId;

    public static DeleteSubscribedCalendarRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubscribedCalendarRequest self = new DeleteSubscribedCalendarRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSubscribedCalendarRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

}
