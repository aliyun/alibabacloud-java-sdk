// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotifyConfigUnified extends TeaModel {
    /**
     * <p>一周中发送通知的星期，1-7</p>
     */
    @NameInMap("activeDays")
    public java.util.List<Integer> activeDays;

    /**
     * <p>每天通知生效结束时间</p>
     */
    @NameInMap("activeEndTime")
    public String activeEndTime;

    /**
     * <p>每天通知生效开始时间</p>
     */
    @NameInMap("activeStartTime")
    public String activeStartTime;

    /**
     * <p>通知渠道列表</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("channels")
    public java.util.List<DirectNotifyChannel> channels;

    /**
     * <p>通道沉默周期（秒）</p>
     */
    @NameInMap("silenceTimeSecs")
    public Integer silenceTimeSecs;

    /**
     * <p>通知配置类型</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>UTC 时区偏移量</p>
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
