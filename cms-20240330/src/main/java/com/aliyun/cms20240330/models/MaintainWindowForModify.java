// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MaintainWindowForModify extends TeaModel {
    /**
     * <p>Description.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Effective time range.</p>
     */
    @NameInMap("effectTimeRange")
    public MaintainWindowForModifyEffectTimeRange effectTimeRange;

    /**
     * <p>Crontab expression.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li><ul>
     * <li>14-18 ? * *</li>
     * </ul>
     * </li>
     * </ul>
     */
    @NameInMap("effective")
    public String effective;

    /**
     * <p>Effective end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-05 09:30:40</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>Filtering conditions.</p>
     */
    @NameInMap("filterSetting")
    public FilterSetting filterSetting;

    /**
     * <p>Name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test strategy</p>
     */
    @NameInMap("maintainWindowName")
    public String maintainWindowName;

    /**
     * <p>Effective start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-04-11 07:55:00</p>
     */
    @NameInMap("startTime")
    public String startTime;

    public static MaintainWindowForModify build(java.util.Map<String, ?> map) throws Exception {
        MaintainWindowForModify self = new MaintainWindowForModify();
        return TeaModel.build(map, self);
    }

    public MaintainWindowForModify setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public MaintainWindowForModify setEffectTimeRange(MaintainWindowForModifyEffectTimeRange effectTimeRange) {
        this.effectTimeRange = effectTimeRange;
        return this;
    }
    public MaintainWindowForModifyEffectTimeRange getEffectTimeRange() {
        return this.effectTimeRange;
    }

    public MaintainWindowForModify setEffective(String effective) {
        this.effective = effective;
        return this;
    }
    public String getEffective() {
        return this.effective;
    }

    public MaintainWindowForModify setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public MaintainWindowForModify setFilterSetting(FilterSetting filterSetting) {
        this.filterSetting = filterSetting;
        return this;
    }
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    public MaintainWindowForModify setMaintainWindowName(String maintainWindowName) {
        this.maintainWindowName = maintainWindowName;
        return this;
    }
    public String getMaintainWindowName() {
        return this.maintainWindowName;
    }

    public MaintainWindowForModify setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class MaintainWindowForModifyEffectTimeRange extends TeaModel {
        /**
         * <p>Effective days (Monday to Sunday).</p>
         */
        @NameInMap("dayInWeek")
        public java.util.List<Integer> dayInWeek;

        /**
         * <p>End time (in minutes).</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("endTimeInMinute")
        public Integer endTimeInMinute;

        /**
         * <p>Start time (in minutes).</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("startTimeInMinute")
        public Integer startTimeInMinute;

        /**
         * <p>Time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>+08:00</p>
         */
        @NameInMap("timeZone")
        public String timeZone;

        public static MaintainWindowForModifyEffectTimeRange build(java.util.Map<String, ?> map) throws Exception {
            MaintainWindowForModifyEffectTimeRange self = new MaintainWindowForModifyEffectTimeRange();
            return TeaModel.build(map, self);
        }

        public MaintainWindowForModifyEffectTimeRange setDayInWeek(java.util.List<Integer> dayInWeek) {
            this.dayInWeek = dayInWeek;
            return this;
        }
        public java.util.List<Integer> getDayInWeek() {
            return this.dayInWeek;
        }

        public MaintainWindowForModifyEffectTimeRange setEndTimeInMinute(Integer endTimeInMinute) {
            this.endTimeInMinute = endTimeInMinute;
            return this;
        }
        public Integer getEndTimeInMinute() {
            return this.endTimeInMinute;
        }

        public MaintainWindowForModifyEffectTimeRange setStartTimeInMinute(Integer startTimeInMinute) {
            this.startTimeInMinute = startTimeInMinute;
            return this;
        }
        public Integer getStartTimeInMinute() {
            return this.startTimeInMinute;
        }

        public MaintainWindowForModifyEffectTimeRange setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

}
