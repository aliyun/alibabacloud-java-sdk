// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateServiceGroupSpecialDaySchedulingRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-08-19</p>
     */
    @NameInMap("schedulingDate")
    public String schedulingDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("schedulingSpecialDays")
    public java.util.List<UpdateServiceGroupSpecialDaySchedulingRequestSchedulingSpecialDays> schedulingSpecialDays;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6666</p>
     */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-19 12:00:00</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-19 08:00:00</p>
         */
        @NameInMap("schedulingStartTime")
        public String schedulingStartTime;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        @NameInMap("schedulingUserIdList")
        public java.util.List<Long> schedulingUserIdList;

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

        public UpdateServiceGroupSpecialDaySchedulingRequestSchedulingSpecialDays setSchedulingObjectType(String schedulingObjectType) {
            this.schedulingObjectType = schedulingObjectType;
            return this;
        }
        public String getSchedulingObjectType() {
            return this.schedulingObjectType;
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

        public UpdateServiceGroupSpecialDaySchedulingRequestSchedulingSpecialDays setSchedulingUserIdList(java.util.List<Long> schedulingUserIdList) {
            this.schedulingUserIdList = schedulingUserIdList;
            return this;
        }
        public java.util.List<Long> getSchedulingUserIdList() {
            return this.schedulingUserIdList;
        }

    }

}
