// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MaintainWindowForModify extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("effectTimeRange")
    public MaintainWindowForModifyEffectTimeRange effectTimeRange;

    @NameInMap("effective")
    public String effective;

    @NameInMap("endTime")
    public String endTime;

    @NameInMap("filterSetting")
    public FilterSetting filterSetting;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("maintainWindowName")
    public String maintainWindowName;

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
        @NameInMap("dayInWeek")
        public java.util.List<Integer> dayInWeek;

        @NameInMap("endTimeInMinute")
        public Integer endTimeInMinute;

        @NameInMap("startTimeInMinute")
        public Integer startTimeInMinute;

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
