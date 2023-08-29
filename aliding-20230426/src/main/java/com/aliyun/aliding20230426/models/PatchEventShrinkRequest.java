// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class PatchEventShrinkRequest extends TeaModel {
    @NameInMap("Attendees")
    public String attendeesShrink;

    @NameInMap("CalendarId")
    public String calendarId;

    @NameInMap("Description")
    public String description;

    @NameInMap("End")
    public String endShrink;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("Extra")
    public String extraShrink;

    @NameInMap("IsAllDay")
    public Boolean isAllDay;

    @NameInMap("Location")
    public String locationShrink;

    @NameInMap("Recurrence")
    public String recurrenceShrink;

    @NameInMap("Reminders")
    public String remindersShrink;

    @NameInMap("Start")
    public String startShrink;

    @NameInMap("Summary")
    public String summary;

    public static PatchEventShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PatchEventShrinkRequest self = new PatchEventShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PatchEventShrinkRequest setAttendeesShrink(String attendeesShrink) {
        this.attendeesShrink = attendeesShrink;
        return this;
    }
    public String getAttendeesShrink() {
        return this.attendeesShrink;
    }

    public PatchEventShrinkRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

    public PatchEventShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PatchEventShrinkRequest setEndShrink(String endShrink) {
        this.endShrink = endShrink;
        return this;
    }
    public String getEndShrink() {
        return this.endShrink;
    }

    public PatchEventShrinkRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public PatchEventShrinkRequest setExtraShrink(String extraShrink) {
        this.extraShrink = extraShrink;
        return this;
    }
    public String getExtraShrink() {
        return this.extraShrink;
    }

    public PatchEventShrinkRequest setIsAllDay(Boolean isAllDay) {
        this.isAllDay = isAllDay;
        return this;
    }
    public Boolean getIsAllDay() {
        return this.isAllDay;
    }

    public PatchEventShrinkRequest setLocationShrink(String locationShrink) {
        this.locationShrink = locationShrink;
        return this;
    }
    public String getLocationShrink() {
        return this.locationShrink;
    }

    public PatchEventShrinkRequest setRecurrenceShrink(String recurrenceShrink) {
        this.recurrenceShrink = recurrenceShrink;
        return this;
    }
    public String getRecurrenceShrink() {
        return this.recurrenceShrink;
    }

    public PatchEventShrinkRequest setRemindersShrink(String remindersShrink) {
        this.remindersShrink = remindersShrink;
        return this;
    }
    public String getRemindersShrink() {
        return this.remindersShrink;
    }

    public PatchEventShrinkRequest setStartShrink(String startShrink) {
        this.startShrink = startShrink;
        return this;
    }
    public String getStartShrink() {
        return this.startShrink;
    }

    public PatchEventShrinkRequest setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

}
