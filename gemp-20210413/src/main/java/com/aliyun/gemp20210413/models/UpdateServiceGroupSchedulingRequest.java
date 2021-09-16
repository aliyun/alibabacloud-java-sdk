// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateServiceGroupSchedulingRequest extends TeaModel {
    // 服务组ID
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    // 排班方式 FAST 快速排班 FINE 精细排班
    @NameInMap("schedulingWay")
    public String schedulingWay;

    // 快速排班
    @NameInMap("fastScheduling")
    public UpdateServiceGroupSchedulingRequestFastScheduling fastScheduling;

    // 精细排班
    @NameInMap("fineScheduling")
    public UpdateServiceGroupSchedulingRequestFineScheduling fineScheduling;

    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateServiceGroupSchedulingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceGroupSchedulingRequest self = new UpdateServiceGroupSchedulingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceGroupSchedulingRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public UpdateServiceGroupSchedulingRequest setSchedulingWay(String schedulingWay) {
        this.schedulingWay = schedulingWay;
        return this;
    }
    public String getSchedulingWay() {
        return this.schedulingWay;
    }

    public UpdateServiceGroupSchedulingRequest setFastScheduling(UpdateServiceGroupSchedulingRequestFastScheduling fastScheduling) {
        this.fastScheduling = fastScheduling;
        return this;
    }
    public UpdateServiceGroupSchedulingRequestFastScheduling getFastScheduling() {
        return this.fastScheduling;
    }

    public UpdateServiceGroupSchedulingRequest setFineScheduling(UpdateServiceGroupSchedulingRequestFineScheduling fineScheduling) {
        this.fineScheduling = fineScheduling;
        return this;
    }
    public UpdateServiceGroupSchedulingRequestFineScheduling getFineScheduling() {
        return this.fineScheduling;
    }

    public UpdateServiceGroupSchedulingRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers extends TeaModel {
        // 轮班用户ID
        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        // 排班顺序
        @NameInMap("schedulingOrder")
        public Integer schedulingOrder;

        public static UpdateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers self = new UpdateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers();
            return TeaModel.build(map, self);
        }

        public UpdateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers setSchedulingUserId(Long schedulingUserId) {
            this.schedulingUserId = schedulingUserId;
            return this;
        }
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

        public UpdateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers setSchedulingOrder(Integer schedulingOrder) {
            this.schedulingOrder = schedulingOrder;
            return this;
        }
        public Integer getSchedulingOrder() {
            return this.schedulingOrder;
        }

    }

    public static class UpdateServiceGroupSchedulingRequestFastScheduling extends TeaModel {
        // 每人排班时长
        @NameInMap("singleDuration")
        public Integer singleDuration;

        // 值班方案 dutyPlan FAST_CHOICE 快速选择   CUSTOM  自定义
        @NameInMap("dutyPlan")
        public String dutyPlan;

        // 每人排班时长单位 HOUR 小时 DAY 天
        @NameInMap("singleDurationUnit")
        public String singleDurationUnit;

        // 快速轮班用户
        @NameInMap("schedulingUsers")
        public java.util.List<UpdateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers> schedulingUsers;

        // 快速排班ID
        @NameInMap("id")
        public Long id;

        public static UpdateServiceGroupSchedulingRequestFastScheduling build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceGroupSchedulingRequestFastScheduling self = new UpdateServiceGroupSchedulingRequestFastScheduling();
            return TeaModel.build(map, self);
        }

        public UpdateServiceGroupSchedulingRequestFastScheduling setSingleDuration(Integer singleDuration) {
            this.singleDuration = singleDuration;
            return this;
        }
        public Integer getSingleDuration() {
            return this.singleDuration;
        }

        public UpdateServiceGroupSchedulingRequestFastScheduling setDutyPlan(String dutyPlan) {
            this.dutyPlan = dutyPlan;
            return this;
        }
        public String getDutyPlan() {
            return this.dutyPlan;
        }

        public UpdateServiceGroupSchedulingRequestFastScheduling setSingleDurationUnit(String singleDurationUnit) {
            this.singleDurationUnit = singleDurationUnit;
            return this;
        }
        public String getSingleDurationUnit() {
            return this.singleDurationUnit;
        }

        public UpdateServiceGroupSchedulingRequestFastScheduling setSchedulingUsers(java.util.List<UpdateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers> schedulingUsers) {
            this.schedulingUsers = schedulingUsers;
            return this;
        }
        public java.util.List<UpdateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers> getSchedulingUsers() {
            return this.schedulingUsers;
        }

        public UpdateServiceGroupSchedulingRequestFastScheduling setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts extends TeaModel {
        // 排班开始时间
        @NameInMap("schedulingStartTime")
        public String schedulingStartTime;

        // 排班结束时间
        @NameInMap("schedulingEndTime")
        public String schedulingEndTime;

        // 排班顺序
        @NameInMap("schedulingOrder")
        public Long schedulingOrder;

        // 班次名称
        @NameInMap("shiftName")
        public String shiftName;

        // 是否跨天
        @NameInMap("skipOneDay")
        public Boolean skipOneDay;

        // 排班用户ID
        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        // 轮训次序
        @NameInMap("cycleOrder")
        public Integer cycleOrder;

        public static UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts self = new UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts();
            return TeaModel.build(map, self);
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setSchedulingStartTime(String schedulingStartTime) {
            this.schedulingStartTime = schedulingStartTime;
            return this;
        }
        public String getSchedulingStartTime() {
            return this.schedulingStartTime;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setSchedulingEndTime(String schedulingEndTime) {
            this.schedulingEndTime = schedulingEndTime;
            return this;
        }
        public String getSchedulingEndTime() {
            return this.schedulingEndTime;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setSchedulingOrder(Long schedulingOrder) {
            this.schedulingOrder = schedulingOrder;
            return this;
        }
        public Long getSchedulingOrder() {
            return this.schedulingOrder;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setShiftName(String shiftName) {
            this.shiftName = shiftName;
            return this;
        }
        public String getShiftName() {
            return this.shiftName;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setSkipOneDay(Boolean skipOneDay) {
            this.skipOneDay = skipOneDay;
            return this;
        }
        public Boolean getSkipOneDay() {
            return this.skipOneDay;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setSchedulingUserId(Long schedulingUserId) {
            this.schedulingUserId = schedulingUserId;
            return this;
        }
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setCycleOrder(Integer cycleOrder) {
            this.cycleOrder = cycleOrder;
            return this;
        }
        public Integer getCycleOrder() {
            return this.cycleOrder;
        }

    }

    public static class UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts extends TeaModel {
        // 排班开始时间
        @NameInMap("schedulingStartTime")
        public String schedulingStartTime;

        // 排班结束时间
        @NameInMap("schedulingEndTime")
        public String schedulingEndTime;

        // 排班顺序
        @NameInMap("schedulingOrder")
        public Integer schedulingOrder;

        // 排班用户ID
        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        // 班次名称
        @NameInMap("shiftName")
        public String shiftName;

        // 是否跨天
        @NameInMap("skipOneDay")
        public Boolean skipOneDay;

        public static UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts self = new UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts();
            return TeaModel.build(map, self);
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts setSchedulingStartTime(String schedulingStartTime) {
            this.schedulingStartTime = schedulingStartTime;
            return this;
        }
        public String getSchedulingStartTime() {
            return this.schedulingStartTime;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts setSchedulingEndTime(String schedulingEndTime) {
            this.schedulingEndTime = schedulingEndTime;
            return this;
        }
        public String getSchedulingEndTime() {
            return this.schedulingEndTime;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts setSchedulingOrder(Integer schedulingOrder) {
            this.schedulingOrder = schedulingOrder;
            return this;
        }
        public Integer getSchedulingOrder() {
            return this.schedulingOrder;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts setSchedulingUserId(Long schedulingUserId) {
            this.schedulingUserId = schedulingUserId;
            return this;
        }
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts setShiftName(String shiftName) {
            this.shiftName = shiftName;
            return this;
        }
        public String getShiftName() {
            return this.shiftName;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts setSkipOneDay(Boolean skipOneDay) {
            this.skipOneDay = skipOneDay;
            return this;
        }
        public Boolean getSkipOneDay() {
            return this.skipOneDay;
        }

    }

    public static class UpdateServiceGroupSchedulingRequestFineScheduling extends TeaModel {
        // 循环周期
        @NameInMap("period")
        public Integer period;

        // 循环周期单位 HOUR 小时 DAY 天
        @NameInMap("periodUnit")
        public String periodUnit;

        // 班次类型 MORNING_NIGHT 早晚班 MORNING_NOON_NIGHT 早中晚班 CUSTOM 自定义
        @NameInMap("shiftType")
        public String shiftType;

        // 精细排班班次人员信息
        @NameInMap("schedulingFineShifts")
        public java.util.List<UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts> schedulingFineShifts;

        // 精细排班模版
        @NameInMap("schedulingTemplateFineShifts")
        public java.util.List<UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts> schedulingTemplateFineShifts;

        // 精细排班ID
        @NameInMap("id")
        public Long id;

        public static UpdateServiceGroupSchedulingRequestFineScheduling build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceGroupSchedulingRequestFineScheduling self = new UpdateServiceGroupSchedulingRequestFineScheduling();
            return TeaModel.build(map, self);
        }

        public UpdateServiceGroupSchedulingRequestFineScheduling setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public UpdateServiceGroupSchedulingRequestFineScheduling setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public UpdateServiceGroupSchedulingRequestFineScheduling setShiftType(String shiftType) {
            this.shiftType = shiftType;
            return this;
        }
        public String getShiftType() {
            return this.shiftType;
        }

        public UpdateServiceGroupSchedulingRequestFineScheduling setSchedulingFineShifts(java.util.List<UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts> schedulingFineShifts) {
            this.schedulingFineShifts = schedulingFineShifts;
            return this;
        }
        public java.util.List<UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts> getSchedulingFineShifts() {
            return this.schedulingFineShifts;
        }

        public UpdateServiceGroupSchedulingRequestFineScheduling setSchedulingTemplateFineShifts(java.util.List<UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts> schedulingTemplateFineShifts) {
            this.schedulingTemplateFineShifts = schedulingTemplateFineShifts;
            return this;
        }
        public java.util.List<UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts> getSchedulingTemplateFineShifts() {
            return this.schedulingTemplateFineShifts;
        }

        public UpdateServiceGroupSchedulingRequestFineScheduling setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
