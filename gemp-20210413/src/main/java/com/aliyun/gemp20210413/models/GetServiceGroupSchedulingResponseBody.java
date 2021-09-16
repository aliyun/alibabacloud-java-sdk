// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupSchedulingResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 排班详情
    @NameInMap("data")
    public GetServiceGroupSchedulingResponseBodyData data;

    public static GetServiceGroupSchedulingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceGroupSchedulingResponseBody self = new GetServiceGroupSchedulingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceGroupSchedulingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceGroupSchedulingResponseBody setData(GetServiceGroupSchedulingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceGroupSchedulingResponseBodyData getData() {
        return this.data;
    }

    public static class GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers extends TeaModel {
        // 轮班用户ID
        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        // 排班顺序
        @NameInMap("schedulingOrder")
        public Integer schedulingOrder;

        // 轮班用户名字
        @NameInMap("schedulingUserName")
        public String schedulingUserName;

        public static GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers self = new GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers setSchedulingUserId(Long schedulingUserId) {
            this.schedulingUserId = schedulingUserId;
            return this;
        }
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

        public GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers setSchedulingOrder(Integer schedulingOrder) {
            this.schedulingOrder = schedulingOrder;
            return this;
        }
        public Integer getSchedulingOrder() {
            return this.schedulingOrder;
        }

        public GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers setSchedulingUserName(String schedulingUserName) {
            this.schedulingUserName = schedulingUserName;
            return this;
        }
        public String getSchedulingUserName() {
            return this.schedulingUserName;
        }

    }

    public static class GetServiceGroupSchedulingResponseBodyDataFastScheduling extends TeaModel {
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
        public java.util.List<GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers> schedulingUsers;

        // 快速排班ID
        @NameInMap("id")
        public Long id;

        public static GetServiceGroupSchedulingResponseBodyDataFastScheduling build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSchedulingResponseBodyDataFastScheduling self = new GetServiceGroupSchedulingResponseBodyDataFastScheduling();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupSchedulingResponseBodyDataFastScheduling setSingleDuration(Integer singleDuration) {
            this.singleDuration = singleDuration;
            return this;
        }
        public Integer getSingleDuration() {
            return this.singleDuration;
        }

        public GetServiceGroupSchedulingResponseBodyDataFastScheduling setDutyPlan(String dutyPlan) {
            this.dutyPlan = dutyPlan;
            return this;
        }
        public String getDutyPlan() {
            return this.dutyPlan;
        }

        public GetServiceGroupSchedulingResponseBodyDataFastScheduling setSingleDurationUnit(String singleDurationUnit) {
            this.singleDurationUnit = singleDurationUnit;
            return this;
        }
        public String getSingleDurationUnit() {
            return this.singleDurationUnit;
        }

        public GetServiceGroupSchedulingResponseBodyDataFastScheduling setSchedulingUsers(java.util.List<GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers> schedulingUsers) {
            this.schedulingUsers = schedulingUsers;
            return this;
        }
        public java.util.List<GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers> getSchedulingUsers() {
            return this.schedulingUsers;
        }

        public GetServiceGroupSchedulingResponseBodyDataFastScheduling setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts extends TeaModel {
        // 排班开始时间
        @NameInMap("schedulingStartTime")
        public String schedulingStartTime;

        // 排班结束时间
        @NameInMap("schedulingEndTime")
        public String schedulingEndTime;

        // 排班顺序
        @NameInMap("schedulingOrder")
        public Integer schedulingOrder;

        // 班次名称
        @NameInMap("shiftName")
        public String shiftName;

        // 循环次序
        @NameInMap("cycleOrder")
        public Long cycleOrder;

        // 排班用户ID
        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        // 是否跨天
        @NameInMap("skipOneDay")
        public Boolean skipOneDay;

        // 排班用户名字
        @NameInMap("schedulingUserName")
        public String schedulingUserName;

        public static GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts self = new GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts setSchedulingStartTime(String schedulingStartTime) {
            this.schedulingStartTime = schedulingStartTime;
            return this;
        }
        public String getSchedulingStartTime() {
            return this.schedulingStartTime;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts setSchedulingEndTime(String schedulingEndTime) {
            this.schedulingEndTime = schedulingEndTime;
            return this;
        }
        public String getSchedulingEndTime() {
            return this.schedulingEndTime;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts setSchedulingOrder(Integer schedulingOrder) {
            this.schedulingOrder = schedulingOrder;
            return this;
        }
        public Integer getSchedulingOrder() {
            return this.schedulingOrder;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts setShiftName(String shiftName) {
            this.shiftName = shiftName;
            return this;
        }
        public String getShiftName() {
            return this.shiftName;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts setCycleOrder(Long cycleOrder) {
            this.cycleOrder = cycleOrder;
            return this;
        }
        public Long getCycleOrder() {
            return this.cycleOrder;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts setSchedulingUserId(Long schedulingUserId) {
            this.schedulingUserId = schedulingUserId;
            return this;
        }
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts setSkipOneDay(Boolean skipOneDay) {
            this.skipOneDay = skipOneDay;
            return this;
        }
        public Boolean getSkipOneDay() {
            return this.skipOneDay;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts setSchedulingUserName(String schedulingUserName) {
            this.schedulingUserName = schedulingUserName;
            return this;
        }
        public String getSchedulingUserName() {
            return this.schedulingUserName;
        }

    }

    public static class GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts extends TeaModel {
        // 排班开始时间
        @NameInMap("schedulingStartTime")
        public String schedulingStartTime;

        // 排班结束时间
        @NameInMap("schedulingEndTime")
        public String schedulingEndTime;

        // 排班顺序
        @NameInMap("schedulingOrder")
        public Long schedulingOrder;

        // 用户ID
        @NameInMap("schedulingUserId")
        public String schedulingUserId;

        // 是否跨天
        @NameInMap("skipOneDay")
        public Boolean skipOneDay;

        // 排班用户名字
        @NameInMap("schedulingUserName")
        public String schedulingUserName;

        // 班次名称
        @NameInMap("shiftName")
        public String shiftName;

        public static GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts self = new GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts setSchedulingStartTime(String schedulingStartTime) {
            this.schedulingStartTime = schedulingStartTime;
            return this;
        }
        public String getSchedulingStartTime() {
            return this.schedulingStartTime;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts setSchedulingEndTime(String schedulingEndTime) {
            this.schedulingEndTime = schedulingEndTime;
            return this;
        }
        public String getSchedulingEndTime() {
            return this.schedulingEndTime;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts setSchedulingOrder(Long schedulingOrder) {
            this.schedulingOrder = schedulingOrder;
            return this;
        }
        public Long getSchedulingOrder() {
            return this.schedulingOrder;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts setSchedulingUserId(String schedulingUserId) {
            this.schedulingUserId = schedulingUserId;
            return this;
        }
        public String getSchedulingUserId() {
            return this.schedulingUserId;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts setSkipOneDay(Boolean skipOneDay) {
            this.skipOneDay = skipOneDay;
            return this;
        }
        public Boolean getSkipOneDay() {
            return this.skipOneDay;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts setSchedulingUserName(String schedulingUserName) {
            this.schedulingUserName = schedulingUserName;
            return this;
        }
        public String getSchedulingUserName() {
            return this.schedulingUserName;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts setShiftName(String shiftName) {
            this.shiftName = shiftName;
            return this;
        }
        public String getShiftName() {
            return this.shiftName;
        }

    }

    public static class GetServiceGroupSchedulingResponseBodyDataFineScheduling extends TeaModel {
        // 1
        @NameInMap("period")
        public Integer period;

        // 1
        @NameInMap("id")
        public Long id;

        // 循环周期单位 HOUR 小时 DAY 天
        @NameInMap("periodUnit")
        public String periodUnit;

        // 班次类型 MORNING_NIGHT 早晚班 MORNING_NOON_NIGHT 早中晚班 CUSTOM 自定义
        @NameInMap("shiftType")
        public String shiftType;

        // 精细排班班次人员信息
        @NameInMap("schedulingFineShifts")
        public java.util.List<GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts> schedulingFineShifts;

        // 精细排班模版
        @NameInMap("schedulingTemplateFineShifts")
        public java.util.List<GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts> schedulingTemplateFineShifts;

        public static GetServiceGroupSchedulingResponseBodyDataFineScheduling build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSchedulingResponseBodyDataFineScheduling self = new GetServiceGroupSchedulingResponseBodyDataFineScheduling();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupSchedulingResponseBodyDataFineScheduling setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineScheduling setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineScheduling setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineScheduling setShiftType(String shiftType) {
            this.shiftType = shiftType;
            return this;
        }
        public String getShiftType() {
            return this.shiftType;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineScheduling setSchedulingFineShifts(java.util.List<GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts> schedulingFineShifts) {
            this.schedulingFineShifts = schedulingFineShifts;
            return this;
        }
        public java.util.List<GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts> getSchedulingFineShifts() {
            return this.schedulingFineShifts;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineScheduling setSchedulingTemplateFineShifts(java.util.List<GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts> schedulingTemplateFineShifts) {
            this.schedulingTemplateFineShifts = schedulingTemplateFineShifts;
            return this;
        }
        public java.util.List<GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts> getSchedulingTemplateFineShifts() {
            return this.schedulingTemplateFineShifts;
        }

    }

    public static class GetServiceGroupSchedulingResponseBodyDataUsers extends TeaModel {
        // 用户ID
        @NameInMap("userId")
        public Long userId;

        // 用户名字
        @NameInMap("userName")
        public String userName;

        public static GetServiceGroupSchedulingResponseBodyDataUsers build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSchedulingResponseBodyDataUsers self = new GetServiceGroupSchedulingResponseBodyDataUsers();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupSchedulingResponseBodyDataUsers setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public GetServiceGroupSchedulingResponseBodyDataUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class GetServiceGroupSchedulingResponseBodyData extends TeaModel {
        // 排班方式 FAST 快速排班 FINE 精细排班
        @NameInMap("schedulingWay")
        public String schedulingWay;

        // 服务组ID
        @NameInMap("serviceGroupId")
        public Long serviceGroupId;

        // 快速排班
        @NameInMap("fastScheduling")
        public GetServiceGroupSchedulingResponseBodyDataFastScheduling fastScheduling;

        // 精细排班
        @NameInMap("fineScheduling")
        public GetServiceGroupSchedulingResponseBodyDataFineScheduling fineScheduling;

        // 已经排班
        @NameInMap("users")
        public java.util.List<GetServiceGroupSchedulingResponseBodyDataUsers> users;

        public static GetServiceGroupSchedulingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSchedulingResponseBodyData self = new GetServiceGroupSchedulingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupSchedulingResponseBodyData setSchedulingWay(String schedulingWay) {
            this.schedulingWay = schedulingWay;
            return this;
        }
        public String getSchedulingWay() {
            return this.schedulingWay;
        }

        public GetServiceGroupSchedulingResponseBodyData setServiceGroupId(Long serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

        public GetServiceGroupSchedulingResponseBodyData setFastScheduling(GetServiceGroupSchedulingResponseBodyDataFastScheduling fastScheduling) {
            this.fastScheduling = fastScheduling;
            return this;
        }
        public GetServiceGroupSchedulingResponseBodyDataFastScheduling getFastScheduling() {
            return this.fastScheduling;
        }

        public GetServiceGroupSchedulingResponseBodyData setFineScheduling(GetServiceGroupSchedulingResponseBodyDataFineScheduling fineScheduling) {
            this.fineScheduling = fineScheduling;
            return this;
        }
        public GetServiceGroupSchedulingResponseBodyDataFineScheduling getFineScheduling() {
            return this.fineScheduling;
        }

        public GetServiceGroupSchedulingResponseBodyData setUsers(java.util.List<GetServiceGroupSchedulingResponseBodyDataUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<GetServiceGroupSchedulingResponseBodyDataUsers> getUsers() {
            return this.users;
        }

    }

}
