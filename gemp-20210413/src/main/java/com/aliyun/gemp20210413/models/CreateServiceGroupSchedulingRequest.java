// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateServiceGroupSchedulingRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("fastScheduling")
    public CreateServiceGroupSchedulingRequestFastScheduling fastScheduling;

    @NameInMap("fineScheduling")
    public CreateServiceGroupSchedulingRequestFineScheduling fineScheduling;

    @NameInMap("schedulingWay")
    public String schedulingWay;

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
        @NameInMap("schedulingOrder")
        public Long schedulingOrder;

        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        public static CreateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers self = new CreateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers();
            return TeaModel.build(map, self);
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

    }

    public static class CreateServiceGroupSchedulingRequestFastScheduling extends TeaModel {
        @NameInMap("dutyPlan")
        public String dutyPlan;

        @NameInMap("schedulingUsers")
        public java.util.List<CreateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers> schedulingUsers;

        @NameInMap("singleDuration")
        public Integer singleDuration;

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
        @NameInMap("cycleOrder")
        public Integer cycleOrder;

        @NameInMap("schedulingEndTime")
        public String schedulingEndTime;

        @NameInMap("schedulingOrder")
        public Integer schedulingOrder;

        @NameInMap("schedulingStartTime")
        public String schedulingStartTime;

        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        @NameInMap("shiftName")
        public String shiftName;

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
        @NameInMap("schedulingEndTime")
        public String schedulingEndTime;

        @NameInMap("schedulingOrder")
        public Long schedulingOrder;

        @NameInMap("schedulingStartTime")
        public String schedulingStartTime;

        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        @NameInMap("schedulingUserName")
        public String schedulingUserName;

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
        @NameInMap("period")
        public Integer period;

        @NameInMap("periodUnit")
        public String periodUnit;

        @NameInMap("schedulingFineShifts")
        public java.util.List<CreateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts> schedulingFineShifts;

        @NameInMap("schedulingTemplateFineShifts")
        public java.util.List<CreateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts> schedulingTemplateFineShifts;

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
