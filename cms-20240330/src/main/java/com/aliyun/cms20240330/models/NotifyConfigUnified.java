// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotifyConfigUnified extends TeaModel {
    /**
     * <p>The active days of the week.</p>
     */
    @NameInMap("activeDays")
    public java.util.List<Integer> activeDays;

    /**
     * <p>The end of the daily active time window. On active days, the system sends notifications only before this time. Format: <code>HH:mm</code>.</p>
     */
    @NameInMap("activeEndTime")
    public String activeEndTime;

    /**
     * <p>The start of the daily active time window. On active days, the system sends notifications only after this time. Format: <code>HH:mm</code>.</p>
     */
    @NameInMap("activeStartTime")
    public String activeStartTime;

    /**
     * <p>The notification channels that receive alerts.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("channels")
    public java.util.List<DirectNotifyChannel> channels;

    /**
     * <p>The silence time in seconds. After sending a notification, the system suppresses new notifications for the same alert for this duration.</p>
     */
    @NameInMap("silenceTimeSecs")
    public Integer silenceTimeSecs;

    /**
     * <p>The type of the notification configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The UTC offset for <code>activeStartTime</code> and <code>activeEndTime</code>. The format is <code>[+/-]HH:mm</code>. For example, <code>+08:00</code> represents the UTC+8 time zone.</p>
     */
    @NameInMap("utcOffset")
    public String utcOffset;

    public static NotifyConfigUnified build(java.util.Map<String, ?> map) throws Exception {
        NotifyConfigUnified self = new NotifyConfigUnified();
        return TeaModel.build(map, self);
    }

    public NotifyConfigUnified setActiveDays(java.util.List<Integer> activeDays) {
        this.activeDays = activeDays;
        return this;
    }
    public java.util.List<Integer> getActiveDays() {
        return this.activeDays;
    }

    public NotifyConfigUnified setActiveEndTime(String activeEndTime) {
        this.activeEndTime = activeEndTime;
        return this;
    }
    public String getActiveEndTime() {
        return this.activeEndTime;
    }

    public NotifyConfigUnified setActiveStartTime(String activeStartTime) {
        this.activeStartTime = activeStartTime;
        return this;
    }
    public String getActiveStartTime() {
        return this.activeStartTime;
    }

    public NotifyConfigUnified setChannels(java.util.List<DirectNotifyChannel> channels) {
        this.channels = channels;
        return this;
    }
    public java.util.List<DirectNotifyChannel> getChannels() {
        return this.channels;
    }

    public NotifyConfigUnified setSilenceTimeSecs(Integer silenceTimeSecs) {
        this.silenceTimeSecs = silenceTimeSecs;
        return this;
    }
    public Integer getSilenceTimeSecs() {
        return this.silenceTimeSecs;
    }

    public NotifyConfigUnified setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public NotifyConfigUnified setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
        return this;
    }
    public String getUtcOffset() {
        return this.utcOffset;
    }

}
