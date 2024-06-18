// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateSubscribedCalendarsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>M5MjkxNDUxQHVzZXJzLmRpbmd0YWxrLmNv</p>
     */
    @NameInMap("CalendarId")
    public String calendarId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Managers")
    public String managersShrink;

    @NameInMap("Name")
    public String name;

    @NameInMap("SubscribeScope")
    public String subscribeScopeShrink;

    public static UpdateSubscribedCalendarsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscribedCalendarsShrinkRequest self = new UpdateSubscribedCalendarsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubscribedCalendarsShrinkRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

    public UpdateSubscribedCalendarsShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSubscribedCalendarsShrinkRequest setManagersShrink(String managersShrink) {
        this.managersShrink = managersShrink;
        return this;
    }
    public String getManagersShrink() {
        return this.managersShrink;
    }

    public UpdateSubscribedCalendarsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSubscribedCalendarsShrinkRequest setSubscribeScopeShrink(String subscribeScopeShrink) {
        this.subscribeScopeShrink = subscribeScopeShrink;
        return this;
    }
    public String getSubscribeScopeShrink() {
        return this.subscribeScopeShrink;
    }

}
