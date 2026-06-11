// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotifyRouteForSubscription extends TeaModel {
    /**
     * <p>An array of objects, each defining a notification channel.</p>
     */
    @NameInMap("channels")
    public java.util.List<NotifyRouteForSubscriptionChannels> channels;

    /**
     * <p>The active period for the notification rule.</p>
     */
    @NameInMap("effectTimeRange")
    public NotifyRouteForSubscriptionEffectTimeRange effectTimeRange;

    public static NotifyRouteForSubscription build(java.util.Map<String, ?> map) throws Exception {
        NotifyRouteForSubscription self = new NotifyRouteForSubscription();
        return TeaModel.build(map, self);
    }

    public NotifyRouteForSubscription setChannels(java.util.List<NotifyRouteForSubscriptionChannels> channels) {
        this.channels = channels;
        return this;
    }
    public java.util.List<NotifyRouteForSubscriptionChannels> getChannels() {
        return this.channels;
    }

    public NotifyRouteForSubscription setEffectTimeRange(NotifyRouteForSubscriptionEffectTimeRange effectTimeRange) {
        this.effectTimeRange = effectTimeRange;
        return this;
    }
    public NotifyRouteForSubscriptionEffectTimeRange getEffectTimeRange() {
        return this.effectTimeRange;
    }

    public static class NotifyRouteForSubscriptionChannels extends TeaModel {
        /**
         * <p>The channel type. For example, <code>Email</code>, <code>SMS</code>, or <code>Webhook</code>.</p>
         */
        @NameInMap("channelType")
        public String channelType;

        /**
         * <p>A list of enabled sub-channels. Applicable to channels that support finer-grained topics or categories.</p>
         */
        @NameInMap("enabledSubChannels")
        public java.util.List<String> enabledSubChannels;

        /**
         * <p>A list of notification receivers. The receiver format depends on the <code>channelType</code>.</p>
         */
        @NameInMap("receivers")
        public java.util.List<String> receivers;

        public static NotifyRouteForSubscriptionChannels build(java.util.Map<String, ?> map) throws Exception {
            NotifyRouteForSubscriptionChannels self = new NotifyRouteForSubscriptionChannels();
            return TeaModel.build(map, self);
        }

        public NotifyRouteForSubscriptionChannels setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public NotifyRouteForSubscriptionChannels setEnabledSubChannels(java.util.List<String> enabledSubChannels) {
            this.enabledSubChannels = enabledSubChannels;
            return this;
        }
        public java.util.List<String> getEnabledSubChannels() {
            return this.enabledSubChannels;
        }

        public NotifyRouteForSubscriptionChannels setReceivers(java.util.List<String> receivers) {
            this.receivers = receivers;
            return this;
        }
        public java.util.List<String> getReceivers() {
            return this.receivers;
        }

    }

    public static class NotifyRouteForSubscriptionEffectTimeRange extends TeaModel {
        /**
         * <p>The active days of the week, specified as an array of integers.</p>
         */
        @NameInMap("dayInWeek")
        public java.util.List<Integer> dayInWeek;

        /**
         * <p>The end of the active period, in minutes from 00:00. The value ranges from 0 to 1439.</p>
         */
        @NameInMap("endTimeInMinute")
        public Integer endTimeInMinute;

        /**
         * <p>The start of the active period, in minutes from 00:00. The value ranges from 0 to 1439.</p>
         */
        @NameInMap("startTimeInMinute")
        public Integer startTimeInMinute;

        /**
         * <p>The time zone for the effect time range, specified in the IANA Time Zone Database format. For example, <code>UTC</code> or <code>Asia/Shanghai</code>.</p>
         */
        @NameInMap("timeZone")
        public String timeZone;

        public static NotifyRouteForSubscriptionEffectTimeRange build(java.util.Map<String, ?> map) throws Exception {
            NotifyRouteForSubscriptionEffectTimeRange self = new NotifyRouteForSubscriptionEffectTimeRange();
            return TeaModel.build(map, self);
        }

        public NotifyRouteForSubscriptionEffectTimeRange setDayInWeek(java.util.List<Integer> dayInWeek) {
            this.dayInWeek = dayInWeek;
            return this;
        }
        public java.util.List<Integer> getDayInWeek() {
            return this.dayInWeek;
        }

        public NotifyRouteForSubscriptionEffectTimeRange setEndTimeInMinute(Integer endTimeInMinute) {
            this.endTimeInMinute = endTimeInMinute;
            return this;
        }
        public Integer getEndTimeInMinute() {
            return this.endTimeInMinute;
        }

        public NotifyRouteForSubscriptionEffectTimeRange setStartTimeInMinute(Integer startTimeInMinute) {
            this.startTimeInMinute = startTimeInMinute;
            return this;
        }
        public Integer getStartTimeInMinute() {
            return this.startTimeInMinute;
        }

        public NotifyRouteForSubscriptionEffectTimeRange setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

}
