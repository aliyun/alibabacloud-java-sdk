// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ExecutePeriod extends TeaModel {
    @NameInMap("EffectDay")
    public ExecutePeriodEffectDay effectDay;

    @NameInMap("EffectTime")
    public ExecutePeriodEffectTime effectTime;

    @NameInMap("ScheduleEffect")
    public ExecutePeriodScheduleEffect scheduleEffect;

    @NameInMap("ValidType")
    public String validType;

    public static ExecutePeriod build(java.util.Map<String, ?> map) throws Exception {
        ExecutePeriod self = new ExecutePeriod();
        return TeaModel.build(map, self);
    }

    public ExecutePeriod setEffectDay(ExecutePeriodEffectDay effectDay) {
        this.effectDay = effectDay;
        return this;
    }
    public ExecutePeriodEffectDay getEffectDay() {
        return this.effectDay;
    }

    public ExecutePeriod setEffectTime(ExecutePeriodEffectTime effectTime) {
        this.effectTime = effectTime;
        return this;
    }
    public ExecutePeriodEffectTime getEffectTime() {
        return this.effectTime;
    }

    public ExecutePeriod setScheduleEffect(ExecutePeriodScheduleEffect scheduleEffect) {
        this.scheduleEffect = scheduleEffect;
        return this;
    }
    public ExecutePeriodScheduleEffect getScheduleEffect() {
        return this.scheduleEffect;
    }

    public ExecutePeriod setValidType(String validType) {
        this.validType = validType;
        return this;
    }
    public String getValidType() {
        return this.validType;
    }

    public static class ExecutePeriodEffectDay extends TeaModel {
        @NameInMap("Friday")
        public Boolean friday;

        @NameInMap("Monday")
        public Boolean monday;

        @NameInMap("Saturday")
        public Boolean saturday;

        @NameInMap("Sunday")
        public Boolean sunday;

        @NameInMap("Thursday")
        public Boolean thursday;

        @NameInMap("Tuesday")
        public Boolean tuesday;

        @NameInMap("Wednesday")
        public Boolean wednesday;

        public static ExecutePeriodEffectDay build(java.util.Map<String, ?> map) throws Exception {
            ExecutePeriodEffectDay self = new ExecutePeriodEffectDay();
            return TeaModel.build(map, self);
        }

        public ExecutePeriodEffectDay setFriday(Boolean friday) {
            this.friday = friday;
            return this;
        }
        public Boolean getFriday() {
            return this.friday;
        }

        public ExecutePeriodEffectDay setMonday(Boolean monday) {
            this.monday = monday;
            return this;
        }
        public Boolean getMonday() {
            return this.monday;
        }

        public ExecutePeriodEffectDay setSaturday(Boolean saturday) {
            this.saturday = saturday;
            return this;
        }
        public Boolean getSaturday() {
            return this.saturday;
        }

        public ExecutePeriodEffectDay setSunday(Boolean sunday) {
            this.sunday = sunday;
            return this;
        }
        public Boolean getSunday() {
            return this.sunday;
        }

        public ExecutePeriodEffectDay setThursday(Boolean thursday) {
            this.thursday = thursday;
            return this;
        }
        public Boolean getThursday() {
            return this.thursday;
        }

        public ExecutePeriodEffectDay setTuesday(Boolean tuesday) {
            this.tuesday = tuesday;
            return this;
        }
        public Boolean getTuesday() {
            return this.tuesday;
        }

        public ExecutePeriodEffectDay setWednesday(Boolean wednesday) {
            this.wednesday = wednesday;
            return this;
        }
        public Boolean getWednesday() {
            return this.wednesday;
        }

    }

    public static class ExecutePeriodEffectTime extends TeaModel {
        @NameInMap("End")
        public String end;

        @NameInMap("Start")
        public String start;

        public static ExecutePeriodEffectTime build(java.util.Map<String, ?> map) throws Exception {
            ExecutePeriodEffectTime self = new ExecutePeriodEffectTime();
            return TeaModel.build(map, self);
        }

        public ExecutePeriodEffectTime setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public ExecutePeriodEffectTime setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class ExecutePeriodScheduleEffect extends TeaModel {
        @NameInMap("Frequency")
        public String frequency;

        @NameInMap("Interval")
        public Long interval;

        public static ExecutePeriodScheduleEffect build(java.util.Map<String, ?> map) throws Exception {
            ExecutePeriodScheduleEffect self = new ExecutePeriodScheduleEffect();
            return TeaModel.build(map, self);
        }

        public ExecutePeriodScheduleEffect setFrequency(String frequency) {
            this.frequency = frequency;
            return this;
        }
        public String getFrequency() {
            return this.frequency;
        }

        public ExecutePeriodScheduleEffect setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

    }

}
