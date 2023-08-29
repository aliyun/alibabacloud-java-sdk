// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateEventShrinkRequest extends TeaModel {
    @NameInMap("Attendees")
    public String attendeesShrink;

    @NameInMap("Description")
    public String description;

    @NameInMap("End")
    public String endShrink;

    @NameInMap("Extra")
    public String extraShrink;

    @NameInMap("IsAllDay")
    public Boolean isAllDay;

    @NameInMap("Location")
    public String locationShrink;

    @NameInMap("OnlineMeetingInfo")
    public String onlineMeetingInfoShrink;

    @NameInMap("Recurrence")
    public String recurrenceShrink;

    @NameInMap("Reminders")
    public String remindersShrink;

    @NameInMap("Summary")
    public String summary;

    @NameInMap("UiConfigs")
    public String uiConfigsShrink;

    @NameInMap("calendarId")
    public String calendarId;

    @NameInMap("start")
    public String startShrink;

    public static CreateEventShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEventShrinkRequest self = new CreateEventShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateEventShrinkRequest setAttendeesShrink(String attendeesShrink) {
        this.attendeesShrink = attendeesShrink;
        return this;
    }
    public String getAttendeesShrink() {
        return this.attendeesShrink;
    }

    public CreateEventShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEventShrinkRequest setEndShrink(String endShrink) {
        this.endShrink = endShrink;
        return this;
    }
    public String getEndShrink() {
        return this.endShrink;
    }

    public CreateEventShrinkRequest setExtraShrink(String extraShrink) {
        this.extraShrink = extraShrink;
        return this;
    }
    public String getExtraShrink() {
        return this.extraShrink;
    }

    public CreateEventShrinkRequest setIsAllDay(Boolean isAllDay) {
        this.isAllDay = isAllDay;
        return this;
    }
    public Boolean getIsAllDay() {
        return this.isAllDay;
    }

    public CreateEventShrinkRequest setLocationShrink(String locationShrink) {
        this.locationShrink = locationShrink;
        return this;
    }
    public String getLocationShrink() {
        return this.locationShrink;
    }

    public CreateEventShrinkRequest setOnlineMeetingInfoShrink(String onlineMeetingInfoShrink) {
        this.onlineMeetingInfoShrink = onlineMeetingInfoShrink;
        return this;
    }
    public String getOnlineMeetingInfoShrink() {
        return this.onlineMeetingInfoShrink;
    }

    public CreateEventShrinkRequest setRecurrenceShrink(String recurrenceShrink) {
        this.recurrenceShrink = recurrenceShrink;
        return this;
    }
    public String getRecurrenceShrink() {
        return this.recurrenceShrink;
    }

    public CreateEventShrinkRequest setRemindersShrink(String remindersShrink) {
        this.remindersShrink = remindersShrink;
        return this;
    }
    public String getRemindersShrink() {
        return this.remindersShrink;
    }

    public CreateEventShrinkRequest setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public CreateEventShrinkRequest setUiConfigsShrink(String uiConfigsShrink) {
        this.uiConfigsShrink = uiConfigsShrink;
        return this;
    }
    public String getUiConfigsShrink() {
        return this.uiConfigsShrink;
    }

    public CreateEventShrinkRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

    public CreateEventShrinkRequest setStartShrink(String startShrink) {
        this.startShrink = startShrink;
        return this;
    }
    public String getStartShrink() {
        return this.startShrink;
    }

}
