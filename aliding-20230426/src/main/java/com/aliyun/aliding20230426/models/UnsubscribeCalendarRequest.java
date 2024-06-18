// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UnsubscribeCalendarRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MzM5Mxxx</p>
     */
    @NameInMap("CalendarId")
    public String calendarId;

    public static UnsubscribeCalendarRequest build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeCalendarRequest self = new UnsubscribeCalendarRequest();
        return TeaModel.build(map, self);
    }

    public UnsubscribeCalendarRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

}
