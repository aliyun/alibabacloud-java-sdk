// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotifyConfigUnified extends TeaModel {
    /**
     * <p>The days of the week when notifications are sent, ranging from 1 to 7.</p>
     */
    @NameInMap("activeDays")
    public java.util.List<Integer> activeDays;

    /**
     * <p>The daily end time for the notification effective period.</p>
     * 
     * <strong>example:</strong>
     * <p>20:00</p>
     */
    @NameInMap("activeEndTime")
    public String activeEndTime;

    /**
     * <p>The daily start time for the notification effective period.</p>
     * 
     * <strong>example:</strong>
     * <p>08:00</p>
     */
    @NameInMap("activeStartTime")
    public String activeStartTime;

    /**
     * <p>The list of notification channels.</p>
     */
    @NameInMap("channels")
    public java.util.List<DirectNotifyChannel> channels;

    /**
     * <p>The list of notification policy IDs.</p>
     */
    @NameInMap("notifyStrategies")
    public java.util.List<String> notifyStrategies;

    /**
     * <p>Specifies whether to send a recovery notification. Default value: true. This setting can be independently overridden for each severity level in severityChannels.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("sendRecoverNotification")
    public Boolean sendRecoverNotification;

    /**
     * <p>The notification recipients and channels configured for each severity level. The key is the severity level: CRITICAL, ERROR, WARNING, or INFO.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;CRITICAL&quot;:{&quot;sendRecoverNotification&quot;:true}}</p>
     */
    @NameInMap("severityChannels")
    public java.util.Map<String, SeverityNotifyConfig> severityChannels;

    /**
     * <p>The mute epoch in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("silenceTimeSecs")
    public Integer silenceTimeSecs;

    /**
     * <p>The notification configuration type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DIRECT_NOTIFY</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The UTC time zone offset.</p>
     * 
     * <strong>example:</strong>
     * <p>+08:00</p>
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

    public NotifyConfigUnified setNotifyStrategies(java.util.List<String> notifyStrategies) {
        this.notifyStrategies = notifyStrategies;
        return this;
    }
    public java.util.List<String> getNotifyStrategies() {
        return this.notifyStrategies;
    }

    public NotifyConfigUnified setSendRecoverNotification(Boolean sendRecoverNotification) {
        this.sendRecoverNotification = sendRecoverNotification;
        return this;
    }
    public Boolean getSendRecoverNotification() {
        return this.sendRecoverNotification;
    }

    public NotifyConfigUnified setSeverityChannels(java.util.Map<String, SeverityNotifyConfig> severityChannels) {
        this.severityChannels = severityChannels;
        return this;
    }
    public java.util.Map<String, SeverityNotifyConfig> getSeverityChannels() {
        return this.severityChannels;
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
