// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotifyRouteForSubscription extends TeaModel {
    /**
     * <p>The list of notification channels.</p>
     */
    @NameInMap("channels")
    public java.util.List<NotifyRouteForSubscriptionChannels> channels;

    /**
     * <p>The effective period configuration.</p>
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
         * <p>The channel type.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("channelType")
        public String channelType;

        /**
         * <p>The list of enabled sub-channels.</p>
         */
        @NameInMap("enabledSubChannels")
        public java.util.List<String> enabledSubChannels;

        /**
         * <p>The list of receivers.</p>
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
         * <p>The effective days of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday).</p>
         */
        @NameInMap("dayInWeek")
        public java.util.List<Integer> dayInWeek;

        /**
         * <p>The end time of the day, in minutes from 0:00.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("endTimeInMinute")
        public Integer endTimeInMinute;

        /**
         * <p>The start time of the day, in minutes from 0:00.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("startTimeInMinute")
        public Integer startTimeInMinute;

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>1700000000</p>
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
