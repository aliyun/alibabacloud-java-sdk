// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeUserBuyStatusResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeUserBuyStatusResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserBuyStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBuyStatusResponseBody self = new DescribeUserBuyStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserBuyStatusResponseBody setData(DescribeUserBuyStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeUserBuyStatusResponseBodyData getData() {
        return this.data;
    }

    public DescribeUserBuyStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserBuyStatusResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the logon Alibaba Cloud account can be used to place orders for the threat analysis feature, such as purchase, upgrade, and specifications change orders. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("CanBuy")
        public Boolean canBuy;

        /**
         * <p>The log storage capacity that is purchased for the threat analysis feature. Unit: GB.</p>
         */
        @NameInMap("Capacity")
        public Integer capacity;

        /**
         * <p>The number of days before the expiration time of the threat analysis feature.</p>
         */
        @NameInMap("DurationDays")
        public Long durationDays;

        /**
         * <p>The timestamp when the threat analysis feature expires. Unit: milliseconds.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to purchase the threat analysis feature.</p>
         */
        @NameInMap("MainUserId")
        public Long mainUserId;

        /**
         * <p>The username of the Alibaba Cloud account that is used to purchase the threat analysis feature.</p>
         */
        @NameInMap("MainUserName")
        public String mainUserName;

        /**
         * <p>The ID of the management account of the resource directory.</p>
         */
        @NameInMap("MasterUserId")
        public Long masterUserId;

        /**
         * <p>The display name of the management account of the resource directory.</p>
         */
        @NameInMap("MasterUserName")
        public String masterUserName;

        @NameInMap("RdOrder")
        public Integer rdOrder;

        /**
         * <p>The instance ID of Security Center.</p>
         */
        @NameInMap("SasInstanceId")
        public String sasInstanceId;

        /**
         * <p>The ID of the logon Alibaba Cloud account.</p>
         */
        @NameInMap("SubUserId")
        public Long subUserId;

        /**
         * <p>The username of the logon Alibaba Cloud account.</p>
         */
        @NameInMap("SubUserName")
        public String subUserName;

        public static DescribeUserBuyStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserBuyStatusResponseBodyData self = new DescribeUserBuyStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeUserBuyStatusResponseBodyData setCanBuy(Boolean canBuy) {
            this.canBuy = canBuy;
            return this;
        }
        public Boolean getCanBuy() {
            return this.canBuy;
        }

        public DescribeUserBuyStatusResponseBodyData setCapacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Integer getCapacity() {
            return this.capacity;
        }

        public DescribeUserBuyStatusResponseBodyData setDurationDays(Long durationDays) {
            this.durationDays = durationDays;
            return this;
        }
        public Long getDurationDays() {
            return this.durationDays;
        }

        public DescribeUserBuyStatusResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeUserBuyStatusResponseBodyData setMainUserId(Long mainUserId) {
            this.mainUserId = mainUserId;
            return this;
        }
        public Long getMainUserId() {
            return this.mainUserId;
        }

        public DescribeUserBuyStatusResponseBodyData setMainUserName(String mainUserName) {
            this.mainUserName = mainUserName;
            return this;
        }
        public String getMainUserName() {
            return this.mainUserName;
        }

        public DescribeUserBuyStatusResponseBodyData setMasterUserId(Long masterUserId) {
            this.masterUserId = masterUserId;
            return this;
        }
        public Long getMasterUserId() {
            return this.masterUserId;
        }

        public DescribeUserBuyStatusResponseBodyData setMasterUserName(String masterUserName) {
            this.masterUserName = masterUserName;
            return this;
        }
        public String getMasterUserName() {
            return this.masterUserName;
        }

        public DescribeUserBuyStatusResponseBodyData setRdOrder(Integer rdOrder) {
            this.rdOrder = rdOrder;
            return this;
        }
        public Integer getRdOrder() {
            return this.rdOrder;
        }

        public DescribeUserBuyStatusResponseBodyData setSasInstanceId(String sasInstanceId) {
            this.sasInstanceId = sasInstanceId;
            return this;
        }
        public String getSasInstanceId() {
            return this.sasInstanceId;
        }

        public DescribeUserBuyStatusResponseBodyData setSubUserId(Long subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public Long getSubUserId() {
            return this.subUserId;
        }

        public DescribeUserBuyStatusResponseBodyData setSubUserName(String subUserName) {
            this.subUserName = subUserName;
            return this;
        }
        public String getSubUserName() {
            return this.subUserName;
        }

    }

}
