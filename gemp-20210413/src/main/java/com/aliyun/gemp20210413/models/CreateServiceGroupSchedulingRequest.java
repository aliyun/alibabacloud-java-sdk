// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateServiceGroupSchedulingRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("fastScheduling")
    public CreateServiceGroupSchedulingRequestFastScheduling fastScheduling;

    @NameInMap("fineScheduling")
    public CreateServiceGroupSchedulingRequestFineScheduling fineScheduling;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FAST</p>
     */
    @NameInMap("schedulingWay")
    public String schedulingWay;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    public static CreateServiceGroupSchedulingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceGroupSchedulingRequest self = new CreateServiceGroupSchedulingRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceGroupSchedulingRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateServiceGroupSchedulingRequest setFastScheduling(CreateServiceGroupSchedulingRequestFastScheduling fastScheduling) {
        this.fastScheduling = fastScheduling;
        return this;
    }
    public CreateServiceGroupSchedulingRequestFastScheduling getFastScheduling() {
        return this.fastScheduling;
    }

    public CreateServiceGroupSchedulingRequest setFineScheduling(CreateServiceGroupSchedulingRequestFineScheduling fineScheduling) {
        this.fineScheduling = fineScheduling;
        return this;
    }
    public CreateServiceGroupSchedulingRequestFineScheduling getFineScheduling() {
        return this.fineScheduling;
    }

    public CreateServiceGroupSchedulingRequest setSchedulingWay(String schedulingWay) {
        this.schedulingWay = schedulingWay;
        return this;
    }
    public String getSchedulingWay() {
        return this.schedulingWay;
    }

    public CreateServiceGroupSchedulingRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public static class CreateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers extends TeaModel {
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
         * <p>6666</p>
         */
        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        @NameInMap("schedulingUserIdList")
        public java.util.List<Long> schedulingUserIdList;

        public static CreateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers self = new CreateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers();
            return TeaModel.build(map, self);
        }

        public CreateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers setSchedulingObjectType(String schedulingObjectType) {
            this.schedulingObjectType = schedulingObjectType;
            return this;
        }
        public String getSchedulingObjectType() {
            return this.schedulingObjectType;
        }

        public CreateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers setSchedulingOrder(Long schedulingOrder) {
            this.schedulingOrder = schedulingOrder;
            return this;
        }
        public Long getSchedulingOrder() {
            return this.schedulingOrder;
        }

        public CreateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers setSchedulingUserId(Long schedulingUserId) {
            this.schedulingUserId = schedulingUserId;
            return this;
        }
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

        public CreateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers setSchedulingUserIdList(java.util.List<Long> schedulingUserIdList) {
            this.schedulingUserIdList = schedulingUserIdList;
            return this;
        }
        public java.util.List<Long> getSchedulingUserIdList() {
            return this.schedulingUserIdList;
        }

    }

    public static class CreateServiceGroupSchedulingRequestFastScheduling extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FAST_CHOICE</p>
         */
        @NameInMap("dutyPlan")
        public String dutyPlan;

        @NameInMap("schedulingUsers")
        public java.util.List<CreateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers> schedulingUsers;

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

        public static CreateServiceGroupSchedulingRequestFastScheduling build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceGroupSchedulingRequestFastScheduling self = new CreateServiceGroupSchedulingRequestFastScheduling();
            return TeaModel.build(map, self);
        }

        public CreateServiceGroupSchedulingRequestFastScheduling setDutyPlan(String dutyPlan) {
            this.dutyPlan = dutyPlan;
            return this;
        }
        public String getDutyPlan() {
            return this.dutyPlan;
        }

        public CreateServiceGroupSchedulingRequestFastScheduling setSchedulingUsers(java.util.List<CreateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers> schedulingUsers) {
            this.schedulingUsers = schedulingUsers;
            return this;
        }
        public java.util.List<CreateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers> getSchedulingUsers() {
            return this.schedulingUsers;
        }

        public CreateServiceGroupSchedulingRequestFastScheduling setSingleDuration(Integer singleDuration) {
            this.singleDuration = singleDuration;
            return this;
        }
        public Integer getSingleDuration() {
            return this.singleDuration;
        }

        public CreateServiceGroupSchedulingRequestFastScheduling setSingleDurationUnit(String singleDurationUnit) {
            this.singleDurationUnit = singleDurationUnit;
            return this;
        }
        public String getSingleDurationUnit() {
            return this.singleDurationUnit;
        }

    }

    public static class CreateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cycleOrder")
        public Integer cycleOrder;

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
         * <p>11</p>
         */
        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        @NameInMap("schedulingUserIdList")
        public java.util.List<Long> schedulingUserIdList;

        /**
         * <strong>example:</strong>
         * <p>早班</p>
         */
        @NameInMap("shiftName")
        public String shiftName;

        /**
         * <strong>example:</strong>
         * <p>fasle</p>
         */
        @NameInMap("skipOneDay")
        public Boolean skipOneDay;

        public static CreateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts self = new CreateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts();
            return TeaModel.build(map, self);
        }

        public CreateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setCycleOrder(Integer cycleOrder) {
            this.cycleOrder = cycleOrder;
            return this;
        }
        public Integer getCycleOrder() {
            return this.cycleOrder;
        }

        public CreateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setSchedulingEndTime(String schedulingEndTime) {
            this.schedulingEndTime = schedulingEndTime;
            return this;
        }
        public String getSchedulingEndTime() {
            return this.schedulingEndTime;
        }

        public CreateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setSchedulingObjectType(String schedulingObjectType) {
            this.schedulingObjectType = schedulingObjectType;
            return this;
        }
        public String getSchedulingObjectType() {
            return this.schedulingObjectType;
        }

        public CreateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setSchedulingOrder(Integer schedulingOrder) {
            this.schedulingOrder = schedulingOrder;
            return this;
        }
        public Integer getSchedulingOrder() {
            return this.schedulingOrder;
        }

        public CreateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setSchedulingStartTime(String schedulingStartTime) {
            this.schedulingStartTime = schedulingStartTime;
            return this;
        }
        public String getSchedulingStartTime() {
            return this.schedulingStartTime;
        }

        public CreateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setSchedulingUserId(Long schedulingUserId) {
            this.schedulingUserId = schedulingUserId;
            return this;
        }
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

        public CreateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setSchedulingUserIdList(java.util.List<Long> schedulingUserIdList) {
            this.schedulingUserIdList = schedulingUserIdList;
            return this;
        }
        public java.util.List<Long> getSchedulingUserIdList() {
            return this.schedulingUserIdList;
        }

        public CreateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setShiftName(String shiftName) {
            this.shiftName = shiftName;
            return this;
        }
        public String getShiftName() {
            return this.shiftName;
        }

        public CreateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setSkipOneDay(Boolean skipOneDay) {
            this.skipOneDay = skipOneDay;
            return this;
        }
        public Boolean getSkipOneDay() {
            return this.skipOneDay;
        }

    }

    public static class CreateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2021-10-01 08:00:00</p>
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
         * <p>2021-09-01 08:00:00</p>
         */
        @NameInMap("schedulingStartTime")
        public String schedulingStartTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        @NameInMap("schedulingUserIdList")
        public java.util.List<Long> schedulingUserIdList;

        @NameInMap("schedulingUserName")
        public String schedulingUserName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("skipOneDay")
        public Boolean skipOneDay;

        public static CreateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts self = new CreateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts();
            return TeaModel.build(map, self);
        }

        public CreateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts setSchedulingEndTime(String schedulingEndTime) {
            this.schedulingEndTime = schedulingEndTime;
            return this;
        }
        public String getSchedulingEndTime() {
            return this.schedulingEndTime;
        }

        public CreateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts setSchedulingObjectType(String schedulingObjectType) {
            this.schedulingObjectType = schedulingObjectType;
            return this;
        }
        public String getSchedulingObjectType() {
            return this.schedulingObjectType;
        }

        public CreateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts setSchedulingOrder(Long schedulingOrder) {
            this.schedulingOrder = schedulingOrder;
            return this;
        }
        public Long getSchedulingOrder() {
            return this.schedulingOrder;
        }

        public CreateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts setSchedulingStartTime(String schedulingStartTime) {
            this.schedulingStartTime = schedulingStartTime;
            return this;
        }
        public String getSchedulingStartTime() {
            return this.schedulingStartTime;
        }

        public CreateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts setSchedulingUserId(Long schedulingUserId) {
            this.schedulingUserId = schedulingUserId;
            return this;
        }
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

        public CreateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts setSchedulingUserIdList(java.util.List<Long> schedulingUserIdList) {
            this.schedulingUserIdList = schedulingUserIdList;
            return this;
        }
        public java.util.List<Long> getSchedulingUserIdList() {
            return this.schedulingUserIdList;
        }

        public CreateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts setSchedulingUserName(String schedulingUserName) {
            this.schedulingUserName = schedulingUserName;
            return this;
        }
        public String getSchedulingUserName() {
            return this.schedulingUserName;
        }

        public CreateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts setSkipOneDay(Boolean skipOneDay) {
            this.skipOneDay = skipOneDay;
            return this;
        }
        public Boolean getSkipOneDay() {
            return this.skipOneDay;
        }

    }

    public static class CreateServiceGroupSchedulingRequestFineScheduling extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
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
        public java.util.List<CreateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts> schedulingFineShifts;

        @NameInMap("schedulingTemplateFineShifts")
        public java.util.List<CreateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts> schedulingTemplateFineShifts;

        /**
         * <strong>example:</strong>
         * <p>MORNING_NIGHT</p>
         */
        @NameInMap("shiftType")
        public String shiftType;

        public static CreateServiceGroupSchedulingRequestFineScheduling build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceGroupSchedulingRequestFineScheduling self = new CreateServiceGroupSchedulingRequestFineScheduling();
            return TeaModel.build(map, self);
        }

        public CreateServiceGroupSchedulingRequestFineScheduling setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public CreateServiceGroupSchedulingRequestFineScheduling setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public CreateServiceGroupSchedulingRequestFineScheduling setSchedulingFineShifts(java.util.List<CreateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts> schedulingFineShifts) {
            this.schedulingFineShifts = schedulingFineShifts;
            return this;
        }
        public java.util.List<CreateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts> getSchedulingFineShifts() {
            return this.schedulingFineShifts;
        }

        public CreateServiceGroupSchedulingRequestFineScheduling setSchedulingTemplateFineShifts(java.util.List<CreateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts> schedulingTemplateFineShifts) {
            this.schedulingTemplateFineShifts = schedulingTemplateFineShifts;
            return this;
        }
        public java.util.List<CreateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts> getSchedulingTemplateFineShifts() {
            return this.schedulingTemplateFineShifts;
        }

        public CreateServiceGroupSchedulingRequestFineScheduling setShiftType(String shiftType) {
            this.shiftType = shiftType;
            return this;
        }
        public String getShiftType() {
            return this.shiftType;
        }

    }

}
