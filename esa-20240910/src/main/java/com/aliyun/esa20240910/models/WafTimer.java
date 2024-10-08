// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class WafTimer extends TeaModel {
    @NameInMap("Periods")
    public java.util.List<WafTimerPeriods> periods;

    @NameInMap("Scopes")
    public String scopes;

    @NameInMap("WeeklyPeriods")
    public java.util.List<WafTimerWeeklyPeriods> weeklyPeriods;

    @NameInMap("Zone")
    public Integer zone;

    public static WafTimer build(java.util.Map<String, ?> map) throws Exception {
        WafTimer self = new WafTimer();
        return TeaModel.build(map, self);
    }

    public WafTimer setPeriods(java.util.List<WafTimerPeriods> periods) {
        this.periods = periods;
        return this;
    }
    public java.util.List<WafTimerPeriods> getPeriods() {
        return this.periods;
    }

    public WafTimer setScopes(String scopes) {
        this.scopes = scopes;
        return this;
    }
    public String getScopes() {
        return this.scopes;
    }

    public WafTimer setWeeklyPeriods(java.util.List<WafTimerWeeklyPeriods> weeklyPeriods) {
        this.weeklyPeriods = weeklyPeriods;
        return this;
    }
    public java.util.List<WafTimerWeeklyPeriods> getWeeklyPeriods() {
        return this.weeklyPeriods;
    }

    public WafTimer setZone(Integer zone) {
        this.zone = zone;
        return this;
    }
    public Integer getZone() {
        return this.zone;
    }

    public static class WafTimerPeriods extends TeaModel {
        @NameInMap("End")
        public String end;

        @NameInMap("Start")
        public String start;

        public static WafTimerPeriods build(java.util.Map<String, ?> map) throws Exception {
            WafTimerPeriods self = new WafTimerPeriods();
            return TeaModel.build(map, self);
        }

        public WafTimerPeriods setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public WafTimerPeriods setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class WafTimerWeeklyPeriodsDailyPeriods extends TeaModel {
        @NameInMap("End")
        public String end;

        @NameInMap("Start")
        public String start;

        public static WafTimerWeeklyPeriodsDailyPeriods build(java.util.Map<String, ?> map) throws Exception {
            WafTimerWeeklyPeriodsDailyPeriods self = new WafTimerWeeklyPeriodsDailyPeriods();
            return TeaModel.build(map, self);
        }

        public WafTimerWeeklyPeriodsDailyPeriods setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public WafTimerWeeklyPeriodsDailyPeriods setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class WafTimerWeeklyPeriods extends TeaModel {
        @NameInMap("DailyPeriods")
        public java.util.List<WafTimerWeeklyPeriodsDailyPeriods> dailyPeriods;

        @NameInMap("Days")
        public String days;

        public static WafTimerWeeklyPeriods build(java.util.Map<String, ?> map) throws Exception {
            WafTimerWeeklyPeriods self = new WafTimerWeeklyPeriods();
            return TeaModel.build(map, self);
        }

        public WafTimerWeeklyPeriods setDailyPeriods(java.util.List<WafTimerWeeklyPeriodsDailyPeriods> dailyPeriods) {
            this.dailyPeriods = dailyPeriods;
            return this;
        }
        public java.util.List<WafTimerWeeklyPeriodsDailyPeriods> getDailyPeriods() {
            return this.dailyPeriods;
        }

        public WafTimerWeeklyPeriods setDays(String days) {
            this.days = days;
            return this;
        }
        public String getDays() {
            return this.days;
        }

    }

}
