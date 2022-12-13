// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateServiceGroupSpecialDaySchedulingRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("schedulingDate")
    public String schedulingDate;

    @NameInMap("schedulingSpecialDays")
    public java.util.List<UpdateServiceGroupSpecialDaySchedulingRequestSchedulingSpecialDays> schedulingSpecialDays;

    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    public static UpdateServiceGroupSpecialDaySchedulingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceGroupSpecialDaySchedulingRequest self = new UpdateServiceGroupSpecialDaySchedulingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceGroupSpecialDaySchedulingRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateServiceGroupSpecialDaySchedulingRequest setSchedulingDate(String schedulingDate) {
        this.schedulingDate = schedulingDate;
        return this;
    }
    public String getSchedulingDate() {
        return this.schedulingDate;
    }

    public UpdateServiceGroupSpecialDaySchedulingRequest setSchedulingSpecialDays(java.util.List<UpdateServiceGroupSpecialDaySchedulingRequestSchedulingSpecialDays> schedulingSpecialDays) {
        this.schedulingSpecialDays = schedulingSpecialDays;
        return this;
    }
    public java.util.List<UpdateServiceGroupSpecialDaySchedulingRequestSchedulingSpecialDays> getSchedulingSpecialDays() {
        return this.schedulingSpecialDays;
    }

    public UpdateServiceGroupSpecialDaySchedulingRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public static class UpdateServiceGroupSpecialDaySchedulingRequestSchedulingSpecialDays extends TeaModel {
        @NameInMap("schedulingEndTime")
        public String schedulingEndTime;

        @NameInMap("schedulingOrder")
        public Integer schedulingOrder;

        @NameInMap("schedulingStartTime")
        public String schedulingStartTime;

        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        public static UpdateServiceGroupSpecialDaySchedulingRequestSchedulingSpecialDays build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceGroupSpecialDaySchedulingRequestSchedulingSpecialDays self = new UpdateServiceGroupSpecialDaySchedulingRequestSchedulingSpecialDays();
            return TeaModel.build(map, self);
        }

        public UpdateServiceGroupSpecialDaySchedulingRequestSchedulingSpecialDays setSchedulingEndTime(String schedulingEndTime) {
            this.schedulingEndTime = schedulingEndTime;
            return this;
        }
        public String getSchedulingEndTime() {
            return this.schedulingEndTime;
        }

        public UpdateServiceGroupSpecialDaySchedulingRequestSchedulingSpecialDays setSchedulingOrder(Integer schedulingOrder) {
            this.schedulingOrder = schedulingOrder;
            return this;
        }
        public Integer getSchedulingOrder() {
            return this.schedulingOrder;
        }

        public UpdateServiceGroupSpecialDaySchedulingRequestSchedulingSpecialDays setSchedulingStartTime(String schedulingStartTime) {
            this.schedulingStartTime = schedulingStartTime;
            return this;
        }
        public String getSchedulingStartTime() {
            return this.schedulingStartTime;
        }

        public UpdateServiceGroupSpecialDaySchedulingRequestSchedulingSpecialDays setSchedulingUserId(Long schedulingUserId) {
            this.schedulingUserId = schedulingUserId;
            return this;
        }
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

    }

}
