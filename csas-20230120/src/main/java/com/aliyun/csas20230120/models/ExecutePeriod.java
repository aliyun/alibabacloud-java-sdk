// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ExecutePeriod extends TeaModel {
    /**
     * <p>The effective days of the week configuration. Used when ValidType is set to Weekly.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Monday&quot;:true,&quot;Tuesday&quot;:true,&quot;Wednesday&quot;:true,&quot;Thursday&quot;:true,&quot;Friday&quot;:true,&quot;Saturday&quot;:false,&quot;Sunday&quot;:false}</p>
     */
    @NameInMap("EffectDay")
    public ExecutePeriodEffectDay effectDay;

    /**
     * <p>The daily effective time range. Both Start and End use the 24-hour HH:mm format and are interpreted based on the current system time zone of the server. The time range cannot span across days.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Start&quot;:&quot;00:00&quot;,&quot;End&quot;:&quot;23:59&quot;}</p>
     */
    @NameInMap("EffectTime")
    public ExecutePeriodEffectTime effectTime;

    /**
     * <p>The frequency and interval configuration for periodic execution. Frequency and Interval together specify the execution cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Frequency&quot;:&quot;day&quot;,&quot;Interval&quot;:1}</p>
     */
    @NameInMap("ScheduleEffect")
    public ExecutePeriodScheduleEffect scheduleEffect;

    /**
     * <p>The execution cycle mode. Valid values:</p>
     * <ul>
     * <li><strong>Once</strong>: The single execution mode. Used in combination with ExecuteMode=Once.</li>
     * <li><strong>Interval</strong>: The periodic execution mode based on a specified frequency. Used in combination with ExecuteMode=Schedule.</li>
     * <li><strong>Weekly</strong>: The weekly execution mode where you can select effective days. Used in combination with ExecuteMode=Schedule and EffectDay.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Interval</p>
     */
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
        /**
         * <p>Specifies whether the policy takes effect on Friday when ValidType is set to Weekly. Valid values: true and false. A value of true indicates that the policy takes effect. A value of false indicates that the policy does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Friday")
        public Boolean friday;

        /**
         * <p>Specifies whether the policy takes effect on Monday when ValidType is set to Weekly. Valid values: true and false. A value of true indicates that the policy takes effect. A value of false indicates that the policy does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Monday")
        public Boolean monday;

        /**
         * <p>Specifies whether the policy takes effect on Saturday when ValidType is set to Weekly. Valid values: true and false. A value of true indicates that the policy takes effect. A value of false indicates that the policy does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Saturday")
        public Boolean saturday;

        /**
         * <p>Specifies whether the policy takes effect on Sunday when ValidType is set to Weekly. Valid values: true and false. A value of true indicates that the policy takes effect. A value of false indicates that the policy does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Sunday")
        public Boolean sunday;

        /**
         * <p>Specifies whether the policy takes effect on Thursday when ValidType is set to Weekly. Valid values: true and false. A value of true indicates that the policy takes effect. A value of false indicates that the policy does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Thursday")
        public Boolean thursday;

        /**
         * <p>Specifies whether the policy takes effect on Tuesday when ValidType is set to Weekly. Valid values: true and false. A value of true indicates that the policy takes effect. A value of false indicates that the policy does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Tuesday")
        public Boolean tuesday;

        /**
         * <p>Specifies whether the policy takes effect on Wednesday when ValidType is set to Weekly. Valid values: true and false. A value of true indicates that the policy takes effect. A value of false indicates that the policy does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>The end time of the daily effective time range. It uses the 24-hour HH:mm format and is interpreted based on the current system time zone of the server. It must not be earlier than Start.</p>
         * 
         * <strong>example:</strong>
         * <p>23:59</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The start time of the daily effective time range. It uses the 24-hour HH:mm format and is interpreted based on the current system time zone of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
         */
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
        /**
         * <p>The frequency unit for periodic execution. It is used together with Interval to specify the execution cycle. For example, a value of day indicates daily execution.</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("Frequency")
        public String frequency;

        /**
         * <p>The periodic execution interval. When Frequency is set, valid values are 1 to 10000. The unit is determined by Frequency. For example, if Frequency is set to day and Interval is set to 1, the execution interval is one day.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
