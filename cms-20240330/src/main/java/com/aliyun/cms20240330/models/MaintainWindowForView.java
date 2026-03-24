// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MaintainWindowForView extends TeaModel {
    /**
     * <p>创建时间</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>描述</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>生效时间范围</p>
     */
    @NameInMap("effectTimeRange")
    public MaintainWindowForViewEffectTimeRange effectTimeRange;

    /**
     * <p>Crontab 表达式</p>
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
     * <p>是否启用</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>生效结束时间</p>
     * 
     * <strong>example:</strong>
     * <p>2024-11-26 12:02:01</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>筛选条件</p>
     */
    @NameInMap("filterSetting")
    public FilterSetting filterSetting;

    /**
     * <p>UUID</p>
     * 
     * <strong>example:</strong>
     * <p>123-12-312-31-23123</p>
     */
    @NameInMap("maintainWindowId")
    public String maintainWindowId;

    /**
     * <p>名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试策略</p>
     */
    @NameInMap("maintainWindowName")
    public String maintainWindowName;

    /**
     * <p>生效开始时间</p>
     * 
     * <strong>example:</strong>
     * <p>2024-11-26 10:02:01</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>更新时间</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-07T02:19:05Z</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    /**
     * <p>用户id</p>
     * 
     * <strong>example:</strong>
     * <p>12312312***</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <p>workspace</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static MaintainWindowForView build(java.util.Map<String, ?> map) throws Exception {
        MaintainWindowForView self = new MaintainWindowForView();
        return TeaModel.build(map, self);
    }

    public MaintainWindowForView setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public MaintainWindowForView setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public MaintainWindowForView setEffectTimeRange(MaintainWindowForViewEffectTimeRange effectTimeRange) {
        this.effectTimeRange = effectTimeRange;
        return this;
    }
    public MaintainWindowForViewEffectTimeRange getEffectTimeRange() {
        return this.effectTimeRange;
    }

    public MaintainWindowForView setEffective(String effective) {
        this.effective = effective;
        return this;
    }
    public String getEffective() {
        return this.effective;
    }

    public MaintainWindowForView setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public MaintainWindowForView setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public MaintainWindowForView setFilterSetting(FilterSetting filterSetting) {
        this.filterSetting = filterSetting;
        return this;
    }
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    public MaintainWindowForView setMaintainWindowId(String maintainWindowId) {
        this.maintainWindowId = maintainWindowId;
        return this;
    }
    public String getMaintainWindowId() {
        return this.maintainWindowId;
    }

    public MaintainWindowForView setMaintainWindowName(String maintainWindowName) {
        this.maintainWindowName = maintainWindowName;
        return this;
    }
    public String getMaintainWindowName() {
        return this.maintainWindowName;
    }

    public MaintainWindowForView setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public MaintainWindowForView setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public MaintainWindowForView setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public MaintainWindowForView setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class MaintainWindowForViewEffectTimeRange extends TeaModel {
        /**
         * <p>生效天(周一到周日)</p>
         */
        @NameInMap("dayInWeek")
        public java.util.List<Integer> dayInWeek;

        /**
         * <p>结束时间(分钟数)</p>
         * 
         * <strong>example:</strong>
         * <p>360</p>
         */
        @NameInMap("endTimeInMinute")
        public Integer endTimeInMinute;

        /**
         * <p>开始时间(分钟数)</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("startTimeInMinute")
        public Integer startTimeInMinute;

        /**
         * <p>时区</p>
         * 
         * <strong>example:</strong>
         * <p>+08:00</p>
         */
        @NameInMap("timeZone")
        public String timeZone;

        public static MaintainWindowForViewEffectTimeRange build(java.util.Map<String, ?> map) throws Exception {
            MaintainWindowForViewEffectTimeRange self = new MaintainWindowForViewEffectTimeRange();
            return TeaModel.build(map, self);
        }

        public MaintainWindowForViewEffectTimeRange setDayInWeek(java.util.List<Integer> dayInWeek) {
            this.dayInWeek = dayInWeek;
            return this;
        }
        public java.util.List<Integer> getDayInWeek() {
            return this.dayInWeek;
        }

        public MaintainWindowForViewEffectTimeRange setEndTimeInMinute(Integer endTimeInMinute) {
            this.endTimeInMinute = endTimeInMinute;
            return this;
        }
        public Integer getEndTimeInMinute() {
            return this.endTimeInMinute;
        }

        public MaintainWindowForViewEffectTimeRange setStartTimeInMinute(Integer startTimeInMinute) {
            this.startTimeInMinute = startTimeInMinute;
            return this;
        }
        public Integer getStartTimeInMinute() {
            return this.startTimeInMinute;
        }

        public MaintainWindowForViewEffectTimeRange setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

}
