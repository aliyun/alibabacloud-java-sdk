// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class WafTimer extends TeaModel {
    /**
     * <p>生效时间段。</p>
     */
    @NameInMap("Periods")
    public java.util.List<WafTimerPeriods> periods;

    /**
     * <p>定时类型：永久生效（permanent/&lt;空&gt;）/时间段生效（periods）/weekly（周期生效）。</p>
     * 
     * <strong>example:</strong>
     * <p>permanent</p>
     */
    @NameInMap("Scopes")
    public String scopes;

    /**
     * <p>每周生效时间段。</p>
     */
    @NameInMap("WeeklyPeriods")
    public java.util.List<WafTimerWeeklyPeriods> weeklyPeriods;

    /**
     * <p>时区，不填则默认为UTC+00:00。<br>例：8表示东8区，-8表示西8区<br>范围：-12 - +14。</p>
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
         * <p>结束时间，值为RFC3339格式的UTC时间。</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T01:00:00Z</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>起始时间，值为RFC3339格式的UTC时间。</p>
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
         * <p>结束时间，格式为HH:mm:ss。</p>
         * 
         * <strong>example:</strong>
         * <p>01:00:00</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>起始时间，格式为HH:mm:ss。</p>
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
         * <p>该周期内的生效时间。</p>
         */
        @NameInMap("DailyPeriods")
        public java.util.List<WafTimerWeeklyPeriodsDailyPeriods> dailyPeriods;

        /**
         * <p>周期，多个使用逗号分隔，1-7分别代表周一-周日。<br>例：周一，周三值为&quot;1,3&quot;。</p>
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
