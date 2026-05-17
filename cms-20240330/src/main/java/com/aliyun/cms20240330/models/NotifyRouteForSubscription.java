// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class NotifyRouteForSubscription extends TeaModel {
    @NameInMap("channels")
    public java.util.List<NotifyRouteForSubscriptionChannels> channels;

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
        @NameInMap("channelType")
        public String channelType;

        @NameInMap("enabledSubChannels")
        public java.util.List<String> enabledSubChannels;

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
        @NameInMap("dayInWeek")
        public java.util.List<Integer> dayInWeek;

        @NameInMap("endTimeInMinute")
        public Integer endTimeInMinute;

        @NameInMap("startTimeInMinute")
        public Integer startTimeInMinute;

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
