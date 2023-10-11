// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateSubscribedCalendarsRequest extends TeaModel {
    @NameInMap("CalendarId")
    public String calendarId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Managers")
    public java.util.List<String> managers;

    @NameInMap("Name")
    public String name;

    @NameInMap("SubscribeScope")
    public UpdateSubscribedCalendarsRequestSubscribeScope subscribeScope;

    public static UpdateSubscribedCalendarsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscribedCalendarsRequest self = new UpdateSubscribedCalendarsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubscribedCalendarsRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

    public UpdateSubscribedCalendarsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSubscribedCalendarsRequest setManagers(java.util.List<String> managers) {
        this.managers = managers;
        return this;
    }
    public java.util.List<String> getManagers() {
        return this.managers;
    }

    public UpdateSubscribedCalendarsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSubscribedCalendarsRequest setSubscribeScope(UpdateSubscribedCalendarsRequestSubscribeScope subscribeScope) {
        this.subscribeScope = subscribeScope;
        return this;
    }
    public UpdateSubscribedCalendarsRequestSubscribeScope getSubscribeScope() {
        return this.subscribeScope;
    }

    public static class UpdateSubscribedCalendarsRequestSubscribeScope extends TeaModel {
        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static UpdateSubscribedCalendarsRequestSubscribeScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateSubscribedCalendarsRequestSubscribeScope self = new UpdateSubscribedCalendarsRequestSubscribeScope();
            return TeaModel.build(map, self);
        }

        public UpdateSubscribedCalendarsRequestSubscribeScope setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

}
