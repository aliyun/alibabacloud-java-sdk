// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupSchedulingPreviewRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("endTime")
    public String endTime;

    @NameInMap("fastScheduling")
    public GetServiceGroupSchedulingPreviewRequestFastScheduling fastScheduling;

    @NameInMap("fineScheduling")
    public GetServiceGroupSchedulingPreviewRequestFineScheduling fineScheduling;

    @NameInMap("schedulingWay")
    public String schedulingWay;

    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    @NameInMap("startTime")
    public String startTime;

    public static GetServiceGroupSchedulingPreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceGroupSchedulingPreviewRequest self = new GetServiceGroupSchedulingPreviewRequest();
        return TeaModel.build(map, self);
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

    public GetServiceGroupSchedulingPreviewRequest setSchedulingWay(String schedulingWay) {
        this.schedulingWay = schedulingWay;
        return this;
    }
    public String getSchedulingWay() {
        return this.schedulingWay;
    }

    public GetServiceGroupSchedulingPreviewRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public GetServiceGroupSchedulingPreviewRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class GetServiceGroupSchedulingPreviewRequestFastSchedulingSchedulingUsers extends TeaModel {
        @NameInMap("schedulingOrder")
        public Integer schedulingOrder;

        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        public static GetServiceGroupSchedulingPreviewRequestFastSchedulingSchedulingUsers build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSchedulingPreviewRequestFastSchedulingSchedulingUsers self = new GetServiceGroupSchedulingPreviewRequestFastSchedulingSchedulingUsers();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupSchedulingPreviewRequestFastSchedulingSchedulingUsers setSchedulingOrder(Integer schedulingOrder) {
            this.schedulingOrder = schedulingOrder;
            return this;
        }
        public Integer getSchedulingOrder() {
            return this.schedulingOrder;
        }

        public GetServiceGroupSchedulingPreviewRequestFastSchedulingSchedulingUsers setSchedulingUserId(Long schedulingUserId) {
            this.schedulingUserId = schedulingUserId;
            return this;
        }
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

    }

    public static class GetServiceGroupSchedulingPreviewRequestFastScheduling extends TeaModel {
        // FAST_CHOICE
        @NameInMap("dutyPlan")
        public String dutyPlan;

        @NameInMap("schedulingUsers")
        public java.util.List<GetServiceGroupSchedulingPreviewRequestFastSchedulingSchedulingUsers> schedulingUsers;

        @NameInMap("singleDuration")
        public Integer singleDuration;

        // DAY
        @NameInMap("singleDurationUnit")
        public String singleDurationUnit;

        public static GetServiceGroupSchedulingPreviewRequestFastScheduling build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSchedulingPreviewRequestFastScheduling self = new GetServiceGroupSchedulingPreviewRequestFastScheduling();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupSchedulingPreviewRequestFastScheduling setDutyPlan(String dutyPlan) {
            this.dutyPlan = dutyPlan;
            return this;
        }
        public String getDutyPlan() {
            return this.dutyPlan;
        }

        public GetServiceGroupSchedulingPreviewRequestFastScheduling setSchedulingUsers(java.util.List<GetServiceGroupSchedulingPreviewRequestFastSchedulingSchedulingUsers> schedulingUsers) {
            this.schedulingUsers = schedulingUsers;
            return this;
        }
        public java.util.List<GetServiceGroupSchedulingPreviewRequestFastSchedulingSchedulingUsers> getSchedulingUsers() {
            return this.schedulingUsers;
        }

        public GetServiceGroupSchedulingPreviewRequestFastScheduling setSingleDuration(Integer singleDuration) {
            this.singleDuration = singleDuration;
            return this;
        }
        public Integer getSingleDuration() {
            return this.singleDuration;
        }

        public GetServiceGroupSchedulingPreviewRequestFastScheduling setSingleDurationUnit(String singleDurationUnit) {
            this.singleDurationUnit = singleDurationUnit;
            return this;
        }
        public String getSingleDurationUnit() {
            return this.singleDurationUnit;
        }

    }

    public static class GetServiceGroupSchedulingPreviewRequestFineSchedulingSchedulingFineShifts extends TeaModel {
        @NameInMap("schedulingEndTime")
        public String schedulingEndTime;

        @NameInMap("schedulingOrder")
        public Long schedulingOrder;

        @NameInMap("schedulingStartTime")
        public String schedulingStartTime;

        @NameInMap("shiftName")
        public String shiftName;

        public static GetServiceGroupSchedulingPreviewRequestFineSchedulingSchedulingFineShifts build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSchedulingPreviewRequestFineSchedulingSchedulingFineShifts self = new GetServiceGroupSchedulingPreviewRequestFineSchedulingSchedulingFineShifts();
            return TeaModel.build(map, self);
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

        public GetServiceGroupSchedulingPreviewRequestFineSchedulingSchedulingFineShifts setSchedulingStartTime(String schedulingStartTime) {
            this.schedulingStartTime = schedulingStartTime;
            return this;
        }
        public String getSchedulingStartTime() {
            return this.schedulingStartTime;
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
        @NameInMap("period")
        public Integer period;

        @NameInMap("periodUnit")
        public String periodUnit;

        @NameInMap("schedulingFineShifts")
        public java.util.List<GetServiceGroupSchedulingPreviewRequestFineSchedulingSchedulingFineShifts> schedulingFineShifts;

        @NameInMap("shiftType")
        public String shiftType;

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

        public GetServiceGroupSchedulingPreviewRequestFineScheduling setSchedulingFineShifts(java.util.List<GetServiceGroupSchedulingPreviewRequestFineSchedulingSchedulingFineShifts> schedulingFineShifts) {
            this.schedulingFineShifts = schedulingFineShifts;
            return this;
        }
        public java.util.List<GetServiceGroupSchedulingPreviewRequestFineSchedulingSchedulingFineShifts> getSchedulingFineShifts() {
            return this.schedulingFineShifts;
        }

        public GetServiceGroupSchedulingPreviewRequestFineScheduling setShiftType(String shiftType) {
            this.shiftType = shiftType;
            return this;
        }
        public String getShiftType() {
            return this.shiftType;
        }

    }

}
