// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SubscribeCalendarRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CalendarId")
    public String calendarId;

    public static SubscribeCalendarRequest build(java.util.Map<String, ?> map) throws Exception {
        SubscribeCalendarRequest self = new SubscribeCalendarRequest();
        return TeaModel.build(map, self);
    }

    public SubscribeCalendarRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

}
