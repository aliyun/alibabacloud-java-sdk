// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupSchedulingResponseBody extends TeaModel {
    @NameInMap("data")
    public GetServiceGroupSchedulingResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetServiceGroupSchedulingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceGroupSchedulingResponseBody self = new GetServiceGroupSchedulingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceGroupSchedulingResponseBody setData(GetServiceGroupSchedulingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceGroupSchedulingResponseBodyData getData() {
        return this.data;
    }

    public GetServiceGroupSchedulingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers extends TeaModel {
        @NameInMap("schedulingObjectType")
        public String schedulingObjectType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("schedulingOrder")
        public Integer schedulingOrder;

        /**
         * <strong>example:</strong>
         * <p>66666</p>
         */
        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        @NameInMap("schedulingUserIdList")
        public java.util.List<Long> schedulingUserIdList;

        /**
         * <strong>example:</strong>
         * <p>张杰</p>
         */
        @NameInMap("schedulingUserName")
        public String schedulingUserName;

        public static GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers self = new GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers setSchedulingObjectType(String schedulingObjectType) {
            this.schedulingObjectType = schedulingObjectType;
            return this;
        }
        public String getSchedulingObjectType() {
            return this.schedulingObjectType;
        }

        public GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers setSchedulingOrder(Integer schedulingOrder) {
            this.schedulingOrder = schedulingOrder;
            return this;
        }
        public Integer getSchedulingOrder() {
            return this.schedulingOrder;
        }

        public GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers setSchedulingUserId(Long schedulingUserId) {
            this.schedulingUserId = schedulingUserId;
            return this;
        }
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

        public GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers setSchedulingUserIdList(java.util.List<Long> schedulingUserIdList) {
            this.schedulingUserIdList = schedulingUserIdList;
            return this;
        }
        public java.util.List<Long> getSchedulingUserIdList() {
            return this.schedulingUserIdList;
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
        /**
         * <strong>example:</strong>
         * <p>FAST_CHOICE</p>
         */
        @NameInMap("dutyPlan")
        public String dutyPlan;

        /**
         * <strong>example:</strong>
         * <p>2222</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("schedulingUsers")
        public java.util.List<GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers> schedulingUsers;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("singleDuration")
        public Integer singleDuration;

        /**
         * <strong>example:</strong>
         * <p>DAY</p>
         */
        @NameInMap("singleDurationUnit")
        public String singleDurationUnit;

        public static GetServiceGroupSchedulingResponseBodyDataFastScheduling build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSchedulingResponseBodyDataFastScheduling self = new GetServiceGroupSchedulingResponseBodyDataFastScheduling();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupSchedulingResponseBodyDataFastScheduling setDutyPlan(String dutyPlan) {
            this.dutyPlan = dutyPlan;
            return this;
        }
        public String getDutyPlan() {
            return this.dutyPlan;
        }

        public GetServiceGroupSchedulingResponseBodyDataFastScheduling setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceGroupSchedulingResponseBodyDataFastScheduling setSchedulingUsers(java.util.List<GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers> schedulingUsers) {
            this.schedulingUsers = schedulingUsers;
            return this;
        }
        public java.util.List<GetServiceGroupSchedulingResponseBodyDataFastSchedulingSchedulingUsers> getSchedulingUsers() {
            return this.schedulingUsers;
        }

        public GetServiceGroupSchedulingResponseBodyDataFastScheduling setSingleDuration(Integer singleDuration) {
            this.singleDuration = singleDuration;
            return this;
        }
        public Integer getSingleDuration() {
            return this.singleDuration;
        }

        public GetServiceGroupSchedulingResponseBodyDataFastScheduling setSingleDurationUnit(String singleDurationUnit) {
            this.singleDurationUnit = singleDurationUnit;
            return this;
        }
        public String getSingleDurationUnit() {
            return this.singleDurationUnit;
        }

    }

    public static class GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cycleOrder")
        public Long cycleOrder;

        /**
         * <strong>example:</strong>
         * <p>2020-10-13</p>
         */
        @NameInMap("schedulingEndTime")
        public String schedulingEndTime;

        @NameInMap("schedulingObjectType")
        public String schedulingObjectType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("schedulingOrder")
        public Integer schedulingOrder;

        /**
         * <strong>example:</strong>
         * <p>2020-08-13</p>
         */
        @NameInMap("schedulingStartTime")
        public String schedulingStartTime;

        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        @NameInMap("schedulingUserIdList")
        public java.util.List<Long> schedulingUserIdList;

        /**
         * <strong>example:</strong>
         * <p>刘德华</p>
         */
        @NameInMap("schedulingUserName")
        public String schedulingUserName;

        /**
         * <strong>example:</strong>
         * <p>早班</p>
         */
        @NameInMap("shiftName")
        public String shiftName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("skipOneDay")
        public Boolean skipOneDay;

        public static GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts self = new GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts setCycleOrder(Long cycleOrder) {
            this.cycleOrder = cycleOrder;
            return this;
        }
        public Long getCycleOrder() {
            return this.cycleOrder;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts setSchedulingEndTime(String schedulingEndTime) {
            this.schedulingEndTime = schedulingEndTime;
            return this;
        }
        public String getSchedulingEndTime() {
            return this.schedulingEndTime;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts setSchedulingObjectType(String schedulingObjectType) {
            this.schedulingObjectType = schedulingObjectType;
            return this;
        }
        public String getSchedulingObjectType() {
            return this.schedulingObjectType;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts setSchedulingOrder(Integer schedulingOrder) {
            this.schedulingOrder = schedulingOrder;
            return this;
        }
        public Integer getSchedulingOrder() {
            return this.schedulingOrder;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts setSchedulingStartTime(String schedulingStartTime) {
            this.schedulingStartTime = schedulingStartTime;
            return this;
        }
        public String getSchedulingStartTime() {
            return this.schedulingStartTime;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts setSchedulingUserId(Long schedulingUserId) {
            this.schedulingUserId = schedulingUserId;
            return this;
        }
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts setSchedulingUserIdList(java.util.List<Long> schedulingUserIdList) {
            this.schedulingUserIdList = schedulingUserIdList;
            return this;
        }
        public java.util.List<Long> getSchedulingUserIdList() {
            return this.schedulingUserIdList;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts setSchedulingUserName(String schedulingUserName) {
            this.schedulingUserName = schedulingUserName;
            return this;
        }
        public String getSchedulingUserName() {
            return this.schedulingUserName;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts setShiftName(String shiftName) {
            this.shiftName = shiftName;
            return this;
        }
        public String getShiftName() {
            return this.shiftName;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts setSkipOneDay(Boolean skipOneDay) {
            this.skipOneDay = skipOneDay;
            return this;
        }
        public Boolean getSkipOneDay() {
            return this.skipOneDay;
        }

    }

    public static class GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2021-10-01 00:00:00</p>
         */
        @NameInMap("schedulingEndTime")
        public String schedulingEndTime;

        @NameInMap("schedulingObjectType")
        public String schedulingObjectType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("schedulingOrder")
        public Long schedulingOrder;

        /**
         * <strong>example:</strong>
         * <p>2021-09-01 00:00:00</p>
         */
        @NameInMap("schedulingStartTime")
        public String schedulingStartTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("schedulingUserId")
        public String schedulingUserId;

        @NameInMap("schedulingUserIdList")
        public java.util.List<Long> schedulingUserIdList;

        @NameInMap("schedulingUserName")
        public String schedulingUserName;

        @NameInMap("shiftName")
        public String shiftName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("skipOneDay")
        public Boolean skipOneDay;

        public static GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts self = new GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts setSchedulingEndTime(String schedulingEndTime) {
            this.schedulingEndTime = schedulingEndTime;
            return this;
        }
        public String getSchedulingEndTime() {
            return this.schedulingEndTime;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts setSchedulingObjectType(String schedulingObjectType) {
            this.schedulingObjectType = schedulingObjectType;
            return this;
        }
        public String getSchedulingObjectType() {
            return this.schedulingObjectType;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts setSchedulingOrder(Long schedulingOrder) {
            this.schedulingOrder = schedulingOrder;
            return this;
        }
        public Long getSchedulingOrder() {
            return this.schedulingOrder;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts setSchedulingStartTime(String schedulingStartTime) {
            this.schedulingStartTime = schedulingStartTime;
            return this;
        }
        public String getSchedulingStartTime() {
            return this.schedulingStartTime;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts setSchedulingUserId(String schedulingUserId) {
            this.schedulingUserId = schedulingUserId;
            return this;
        }
        public String getSchedulingUserId() {
            return this.schedulingUserId;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts setSchedulingUserIdList(java.util.List<Long> schedulingUserIdList) {
            this.schedulingUserIdList = schedulingUserIdList;
            return this;
        }
        public java.util.List<Long> getSchedulingUserIdList() {
            return this.schedulingUserIdList;
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

        public GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts setSkipOneDay(Boolean skipOneDay) {
            this.skipOneDay = skipOneDay;
            return this;
        }
        public Boolean getSkipOneDay() {
            return this.skipOneDay;
        }

    }

    public static class GetServiceGroupSchedulingResponseBodyDataFineScheduling extends TeaModel {
        /**
         * <p>1</p>
         * 
         * <strong>example:</strong>
         * <p>精细排班ID</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>1</p>
         * 
         * <strong>example:</strong>
         * <p>循环周期</p>
         */
        @NameInMap("period")
        public Integer period;

        /**
         * <strong>example:</strong>
         * <p>DAY</p>
         */
        @NameInMap("periodUnit")
        public String periodUnit;

        @NameInMap("schedulingFineShifts")
        public java.util.List<GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingFineShifts> schedulingFineShifts;

        @NameInMap("schedulingTemplateFineShifts")
        public java.util.List<GetServiceGroupSchedulingResponseBodyDataFineSchedulingSchedulingTemplateFineShifts> schedulingTemplateFineShifts;

        /**
         * <strong>example:</strong>
         * <p>MORNING_NIGHT</p>
         */
        @NameInMap("shiftType")
        public String shiftType;

        public static GetServiceGroupSchedulingResponseBodyDataFineScheduling build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSchedulingResponseBodyDataFineScheduling self = new GetServiceGroupSchedulingResponseBodyDataFineScheduling();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupSchedulingResponseBodyDataFineScheduling setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineScheduling setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public GetServiceGroupSchedulingResponseBodyDataFineScheduling setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
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

        public GetServiceGroupSchedulingResponseBodyDataFineScheduling setShiftType(String shiftType) {
            this.shiftType = shiftType;
            return this;
        }
        public String getShiftType() {
            return this.shiftType;
        }

    }

    public static class GetServiceGroupSchedulingResponseBodyDataUsers extends TeaModel {
        @NameInMap("userId")
        public Long userId;

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
        @NameInMap("fastScheduling")
        public GetServiceGroupSchedulingResponseBodyDataFastScheduling fastScheduling;

        @NameInMap("fineScheduling")
        public GetServiceGroupSchedulingResponseBodyDataFineScheduling fineScheduling;

        /**
         * <strong>example:</strong>
         * <p>FINE</p>
         */
        @NameInMap("schedulingWay")
        public String schedulingWay;

        /**
         * <strong>example:</strong>
         * <p>99999</p>
         */
        @NameInMap("serviceGroupId")
        public Long serviceGroupId;

        @NameInMap("users")
        public java.util.List<GetServiceGroupSchedulingResponseBodyDataUsers> users;

        public static GetServiceGroupSchedulingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSchedulingResponseBodyData self = new GetServiceGroupSchedulingResponseBodyData();
            return TeaModel.build(map, self);
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

        public GetServiceGroupSchedulingResponseBodyData setUsers(java.util.List<GetServiceGroupSchedulingResponseBodyDataUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<GetServiceGroupSchedulingResponseBodyDataUsers> getUsers() {
            return this.users;
        }

    }

}
