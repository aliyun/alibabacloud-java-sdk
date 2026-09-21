// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class WafTimer extends TeaModel {
    /**
     * <p>The effective periods.</p>
     */
    @NameInMap("Periods")
    public java.util.List<WafTimerPeriods> periods;

    /**
     * <p>The timer type: permanently effective (permanent/empty), effective during time periods (periods), or periodically effective (weekly).</p>
     * 
     * <strong>example:</strong>
     * <p>permanent</p>
     */
    @NameInMap("Scopes")
    public String scopes;

    /**
     * <p>The weekly effective periods.</p>
     */
    @NameInMap("WeeklyPeriods")
    public java.util.List<WafTimerWeeklyPeriods> weeklyPeriods;

    /**
     * <p>The time zone. Default value: UTC+00:00.<br>Example: 8 indicates UTC+8, -8 indicates UTC-8.<br>Valid range: -12 to +14.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
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
        /**
         * <p>The end time in RFC 3339 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T01:00:00Z</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The start time in RFC 3339 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T00:00:00Z</p>
         */
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
        /**
         * <p>The end time in HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>01:00:00</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The start time in HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
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
        /**
         * <p>The effective period within the epoch.</p>
         */
        @NameInMap("DailyPeriods")
        public java.util.List<WafTimerWeeklyPeriodsDailyPeriods> dailyPeriods;

        /**
         * <p>The days of the week, separated by commas. Values 1-7 represent Monday through Sunday.<br>Example: Monday and Wednesday is &quot;1,3&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
