// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateServiceGroupSchedulingRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("fastScheduling")
    public UpdateServiceGroupSchedulingRequestFastScheduling fastScheduling;

    @NameInMap("fineScheduling")
    public UpdateServiceGroupSchedulingRequestFineScheduling fineScheduling;

    @NameInMap("schedulingWay")
    public String schedulingWay;

    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    public static UpdateServiceGroupSchedulingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceGroupSchedulingRequest self = new UpdateServiceGroupSchedulingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceGroupSchedulingRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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

    public UpdateServiceGroupSchedulingRequest setSchedulingWay(String schedulingWay) {
        this.schedulingWay = schedulingWay;
        return this;
    }
    public String getSchedulingWay() {
        return this.schedulingWay;
    }

    public UpdateServiceGroupSchedulingRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public static class UpdateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers extends TeaModel {
        @NameInMap("schedulingObjectType")
        public String schedulingObjectType;

        @NameInMap("schedulingOrder")
        public Integer schedulingOrder;

        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        @NameInMap("schedulingUserIdList")
        public java.util.List<Long> schedulingUserIdList;

        public static UpdateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers self = new UpdateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers();
            return TeaModel.build(map, self);
        }

        public UpdateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers setSchedulingObjectType(String schedulingObjectType) {
            this.schedulingObjectType = schedulingObjectType;
            return this;
        }
        public String getSchedulingObjectType() {
            return this.schedulingObjectType;
        }

        public UpdateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers setSchedulingOrder(Integer schedulingOrder) {
            this.schedulingOrder = schedulingOrder;
            return this;
        }
        public Integer getSchedulingOrder() {
            return this.schedulingOrder;
        }

        public UpdateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers setSchedulingUserId(Long schedulingUserId) {
            this.schedulingUserId = schedulingUserId;
            return this;
        }
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

        public UpdateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers setSchedulingUserIdList(java.util.List<Long> schedulingUserIdList) {
            this.schedulingUserIdList = schedulingUserIdList;
            return this;
        }
        public java.util.List<Long> getSchedulingUserIdList() {
            return this.schedulingUserIdList;
        }

    }

    public static class UpdateServiceGroupSchedulingRequestFastScheduling extends TeaModel {
        @NameInMap("dutyPlan")
        public String dutyPlan;

        @NameInMap("id")
        public Long id;

        @NameInMap("schedulingUsers")
        public java.util.List<UpdateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers> schedulingUsers;

        @NameInMap("singleDuration")
        public Integer singleDuration;

        @NameInMap("singleDurationUnit")
        public String singleDurationUnit;

        public static UpdateServiceGroupSchedulingRequestFastScheduling build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceGroupSchedulingRequestFastScheduling self = new UpdateServiceGroupSchedulingRequestFastScheduling();
            return TeaModel.build(map, self);
        }

        public UpdateServiceGroupSchedulingRequestFastScheduling setDutyPlan(String dutyPlan) {
            this.dutyPlan = dutyPlan;
            return this;
        }
        public String getDutyPlan() {
            return this.dutyPlan;
        }

        public UpdateServiceGroupSchedulingRequestFastScheduling setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateServiceGroupSchedulingRequestFastScheduling setSchedulingUsers(java.util.List<UpdateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers> schedulingUsers) {
            this.schedulingUsers = schedulingUsers;
            return this;
        }
        public java.util.List<UpdateServiceGroupSchedulingRequestFastSchedulingSchedulingUsers> getSchedulingUsers() {
            return this.schedulingUsers;
        }

        public UpdateServiceGroupSchedulingRequestFastScheduling setSingleDuration(Integer singleDuration) {
            this.singleDuration = singleDuration;
            return this;
        }
        public Integer getSingleDuration() {
            return this.singleDuration;
        }

        public UpdateServiceGroupSchedulingRequestFastScheduling setSingleDurationUnit(String singleDurationUnit) {
            this.singleDurationUnit = singleDurationUnit;
            return this;
        }
        public String getSingleDurationUnit() {
            return this.singleDurationUnit;
        }

    }

    public static class UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts extends TeaModel {
        @NameInMap("cycleOrder")
        public Integer cycleOrder;

        @NameInMap("schedulingEndTime")
        public String schedulingEndTime;

        @NameInMap("schedulingObjectType")
        public String schedulingObjectType;

        @NameInMap("schedulingOrder")
        public Long schedulingOrder;

        @NameInMap("schedulingStartTime")
        public String schedulingStartTime;

        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        @NameInMap("schedulingUserIdList")
        public java.util.List<Long> schedulingUserIdList;

        @NameInMap("shiftName")
        public String shiftName;

        @NameInMap("skipOneDay")
        public Boolean skipOneDay;

        public static UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts self = new UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts();
            return TeaModel.build(map, self);
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setCycleOrder(Integer cycleOrder) {
            this.cycleOrder = cycleOrder;
            return this;
        }
        public Integer getCycleOrder() {
            return this.cycleOrder;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setSchedulingEndTime(String schedulingEndTime) {
            this.schedulingEndTime = schedulingEndTime;
            return this;
        }
        public String getSchedulingEndTime() {
            return this.schedulingEndTime;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setSchedulingObjectType(String schedulingObjectType) {
            this.schedulingObjectType = schedulingObjectType;
            return this;
        }
        public String getSchedulingObjectType() {
            return this.schedulingObjectType;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setSchedulingOrder(Long schedulingOrder) {
            this.schedulingOrder = schedulingOrder;
            return this;
        }
        public Long getSchedulingOrder() {
            return this.schedulingOrder;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setSchedulingStartTime(String schedulingStartTime) {
            this.schedulingStartTime = schedulingStartTime;
            return this;
        }
        public String getSchedulingStartTime() {
            return this.schedulingStartTime;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setSchedulingUserId(Long schedulingUserId) {
            this.schedulingUserId = schedulingUserId;
            return this;
        }
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts setSchedulingUserIdList(java.util.List<Long> schedulingUserIdList) {
            this.schedulingUserIdList = schedulingUserIdList;
            return this;
        }
        public java.util.List<Long> getSchedulingUserIdList() {
            return this.schedulingUserIdList;
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

    }

    public static class UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts extends TeaModel {
        @NameInMap("schedulingEndTime")
        public String schedulingEndTime;

        @NameInMap("schedulingObjectType")
        public String schedulingObjectType;

        @NameInMap("schedulingOrder")
        public Integer schedulingOrder;

        @NameInMap("schedulingStartTime")
        public String schedulingStartTime;

        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        @NameInMap("schedulingUserIdList")
        public java.util.List<Long> schedulingUserIdList;

        @NameInMap("shiftName")
        public String shiftName;

        @NameInMap("skipOneDay")
        public Boolean skipOneDay;

        public static UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts self = new UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts();
            return TeaModel.build(map, self);
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts setSchedulingEndTime(String schedulingEndTime) {
            this.schedulingEndTime = schedulingEndTime;
            return this;
        }
        public String getSchedulingEndTime() {
            return this.schedulingEndTime;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts setSchedulingObjectType(String schedulingObjectType) {
            this.schedulingObjectType = schedulingObjectType;
            return this;
        }
        public String getSchedulingObjectType() {
            return this.schedulingObjectType;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts setSchedulingOrder(Integer schedulingOrder) {
            this.schedulingOrder = schedulingOrder;
            return this;
        }
        public Integer getSchedulingOrder() {
            return this.schedulingOrder;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts setSchedulingStartTime(String schedulingStartTime) {
            this.schedulingStartTime = schedulingStartTime;
            return this;
        }
        public String getSchedulingStartTime() {
            return this.schedulingStartTime;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts setSchedulingUserId(Long schedulingUserId) {
            this.schedulingUserId = schedulingUserId;
            return this;
        }
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

        public UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts setSchedulingUserIdList(java.util.List<Long> schedulingUserIdList) {
            this.schedulingUserIdList = schedulingUserIdList;
            return this;
        }
        public java.util.List<Long> getSchedulingUserIdList() {
            return this.schedulingUserIdList;
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
        @NameInMap("id")
        public Long id;

        @NameInMap("period")
        public Integer period;

        @NameInMap("periodUnit")
        public String periodUnit;

        @NameInMap("schedulingFineShifts")
        public java.util.List<UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingFineShifts> schedulingFineShifts;

        @NameInMap("schedulingTemplateFineShifts")
        public java.util.List<UpdateServiceGroupSchedulingRequestFineSchedulingSchedulingTemplateFineShifts> schedulingTemplateFineShifts;

        @NameInMap("shiftType")
        public String shiftType;

        public static UpdateServiceGroupSchedulingRequestFineScheduling build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceGroupSchedulingRequestFineScheduling self = new UpdateServiceGroupSchedulingRequestFineScheduling();
            return TeaModel.build(map, self);
        }

        public UpdateServiceGroupSchedulingRequestFineScheduling setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
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

        public UpdateServiceGroupSchedulingRequestFineScheduling setShiftType(String shiftType) {
            this.shiftType = shiftType;
            return this;
        }
        public String getShiftType() {
            return this.shiftType;
        }

    }

}
