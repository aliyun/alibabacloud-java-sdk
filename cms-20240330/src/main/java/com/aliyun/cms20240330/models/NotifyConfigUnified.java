// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotifyConfigUnified extends TeaModel {
    @NameInMap("activeDays")
    public java.util.List<Integer> activeDays;

    @NameInMap("activeEndTime")
    public String activeEndTime;

    @NameInMap("activeStartTime")
    public String activeStartTime;

    @NameInMap("channels")
    public java.util.List<DirectNotifyChannel> channels;

    @NameInMap("notifyStrategies")
    public java.util.List<String> notifyStrategies;

    @NameInMap("silenceTimeSecs")
    public Integer silenceTimeSecs;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

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
