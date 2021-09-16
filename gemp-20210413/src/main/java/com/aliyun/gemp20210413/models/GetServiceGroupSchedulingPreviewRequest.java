// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupSchedulingPreviewRequest extends TeaModel {
    // 服务组ID
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    // 排班方式 FAST 快速排班 FINE 精细排班
    @NameInMap("schedulingWay")
    public String schedulingWay;

    // 快速排班
    @NameInMap("fastScheduling")
    public GetServiceGroupSchedulingPreviewRequestFastScheduling fastScheduling;

    // 精细排
    @NameInMap("fineScheduling")
    public GetServiceGroupSchedulingPreviewRequestFineScheduling fineScheduling;

    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    // 排班结束时间
    @NameInMap("endTime")
    public String endTime;

    // 排班开始时间
    @NameInMap("startTime")
    public String startTime;

    public static GetServiceGroupSchedulingPreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceGroupSchedulingPreviewRequest self = new GetServiceGroupSchedulingPreviewRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceGroupSchedulingPreviewRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public GetServiceGroupSchedulingPreviewRequest setSchedulingWay(String schedulingWay) {
        this.schedulingWay = schedulingWay;
        return this;
    }
    public String getSchedulingWay() {
        return this.schedulingWay;
    }

    public GetServiceGroupSchedulingPreviewRequest setFastScheduling(GetServiceGroupSchedulingPreviewRequestFastScheduling fastScheduling) {
        this.fastScheduling = fastScheduling;
        return this;
    }
    public GetServiceGroupSchedulingPreviewRequestFastScheduling getFastScheduling() {
        return this.fastScheduling;
    }

    public GetServiceGroupSchedulingPreviewRequest setFineScheduling(GetServiceGroupSchedulingPreviewRequestFineScheduling fineScheduling) {
        this.fineScheduling = fineScheduling;
        return this;
    }
    public GetServiceGroupSchedulingPreviewRequestFineScheduling getFineScheduling() {
        return this.fineScheduling;
    }

    public GetServiceGroupSchedulingPreviewRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetServiceGroupSchedulingPreviewRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetServiceGroupSchedulingPreviewRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class GetServiceGroupSchedulingPreviewRequestFastSchedulingSchedulingUsers extends TeaModel {
        // 轮班用户ID
        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        // 排班顺序
        @NameInMap("schedulingOrder")
        public Integer schedulingOrder;

        public static GetServiceGroupSchedulingPreviewRequestFastSchedulingSchedulingUsers build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSchedulingPreviewRequestFastSchedulingSchedulingUsers self = new GetServiceGroupSchedulingPreviewRequestFastSchedulingSchedulingUsers();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupSchedulingPreviewRequestFastSchedulingSchedulingUsers setSchedulingUserId(Long schedulingUserId) {
            this.schedulingUserId = schedulingUserId;
            return this;
        }
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

        public GetServiceGroupSchedulingPreviewRequestFastSchedulingSchedulingUsers setSchedulingOrder(Integer schedulingOrder) {
            this.schedulingOrder = schedulingOrder;
            return this;
        }
        public Integer getSchedulingOrder() {
            return this.schedulingOrder;
        }

    }

    public static class GetServiceGroupSchedulingPreviewRequestFastScheduling extends TeaModel {
        // 每人排班时长
        @NameInMap("singleDuration")
        public Integer singleDuration;

        // 值班方案 dutyPlan FAST_CHOICE 快速选择 CUSTOM 自定义
        @NameInMap("dutyPlan")
        public String dutyPlan;

        // 每人排班时长单位 HOUR 小时 DAY 天
        @NameInMap("singleDurationUnit")
        public String singleDurationUnit;

        // 快速轮班用户
        @NameInMap("schedulingUsers")
        public java.util.List<GetServiceGroupSchedulingPreviewRequestFastSchedulingSchedulingUsers> schedulingUsers;

        public static GetServiceGroupSchedulingPreviewRequestFastScheduling build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSchedulingPreviewRequestFastScheduling self = new GetServiceGroupSchedulingPreviewRequestFastScheduling();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupSchedulingPreviewRequestFastScheduling setSingleDuration(Integer singleDuration) {
            this.singleDuration = singleDuration;
            return this;
        }
        public Integer getSingleDuration() {
            return this.singleDuration;
        }

        public GetServiceGroupSchedulingPreviewRequestFastScheduling setDutyPlan(String dutyPlan) {
            this.dutyPlan = dutyPlan;
            return this;
        }
        public String getDutyPlan() {
            return this.dutyPlan;
        }

        public GetServiceGroupSchedulingPreviewRequestFastScheduling setSingleDurationUnit(String singleDurationUnit) {
            this.singleDurationUnit = singleDurationUnit;
            return this;
        }
        public String getSingleDurationUnit() {
            return this.singleDurationUnit;
        }

        public GetServiceGroupSchedulingPreviewRequestFastScheduling setSchedulingUsers(java.util.List<GetServiceGroupSchedulingPreviewRequestFastSchedulingSchedulingUsers> schedulingUsers) {
            this.schedulingUsers = schedulingUsers;
            return this;
        }
        public java.util.List<GetServiceGroupSchedulingPreviewRequestFastSchedulingSchedulingUsers> getSchedulingUsers() {
            return this.schedulingUsers;
        }

    }

    public static class GetServiceGroupSchedulingPreviewRequestFineSchedulingSchedulingFineShifts extends TeaModel {
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

        public static GetServiceGroupSchedulingPreviewRequestFineSchedulingSchedulingFineShifts build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSchedulingPreviewRequestFineSchedulingSchedulingFineShifts self = new GetServiceGroupSchedulingPreviewRequestFineSchedulingSchedulingFineShifts();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupSchedulingPreviewRequestFineSchedulingSchedulingFineShifts setSchedulingStartTime(String schedulingStartTime) {
            this.schedulingStartTime = schedulingStartTime;
            return this;
        }
        public String getSchedulingStartTime() {
            return this.schedulingStartTime;
        }

        public GetServiceGroupSchedulingPreviewRequestFineSchedulingSchedulingFineShifts setSchedulingEndTime(String schedulingEndTime) {
            this.schedulingEndTime = schedulingEndTime;
            return this;
        }
        public String getSchedulingEndTime() {
            return this.schedulingEndTime;
        }

        public GetServiceGroupSchedulingPreviewRequestFineSchedulingSchedulingFineShifts setSchedulingOrder(Long schedulingOrder) {
            this.schedulingOrder = schedulingOrder;
            return this;
        }
        public Long getSchedulingOrder() {
            return this.schedulingOrder;
        }

        public GetServiceGroupSchedulingPreviewRequestFineSchedulingSchedulingFineShifts setShiftName(String shiftName) {
            this.shiftName = shiftName;
            return this;
        }
        public String getShiftName() {
            return this.shiftName;
        }

    }

    public static class GetServiceGroupSchedulingPreviewRequestFineScheduling extends TeaModel {
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
        public java.util.List<GetServiceGroupSchedulingPreviewRequestFineSchedulingSchedulingFineShifts> schedulingFineShifts;

        public static GetServiceGroupSchedulingPreviewRequestFineScheduling build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSchedulingPreviewRequestFineScheduling self = new GetServiceGroupSchedulingPreviewRequestFineScheduling();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupSchedulingPreviewRequestFineScheduling setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public GetServiceGroupSchedulingPreviewRequestFineScheduling setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public GetServiceGroupSchedulingPreviewRequestFineScheduling setShiftType(String shiftType) {
            this.shiftType = shiftType;
            return this;
        }
        public String getShiftType() {
            return this.shiftType;
        }

        public GetServiceGroupSchedulingPreviewRequestFineScheduling setSchedulingFineShifts(java.util.List<GetServiceGroupSchedulingPreviewRequestFineSchedulingSchedulingFineShifts> schedulingFineShifts) {
            this.schedulingFineShifts = schedulingFineShifts;
            return this;
        }
        public java.util.List<GetServiceGroupSchedulingPreviewRequestFineSchedulingSchedulingFineShifts> getSchedulingFineShifts() {
            return this.schedulingFineShifts;
        }

    }

}
