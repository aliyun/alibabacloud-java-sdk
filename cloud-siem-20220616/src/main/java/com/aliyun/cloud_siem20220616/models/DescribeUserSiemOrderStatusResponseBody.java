// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeUserSiemOrderStatusResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public DescribeUserSiemOrderStatusResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserSiemOrderStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserSiemOrderStatusResponseBody self = new DescribeUserSiemOrderStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserSiemOrderStatusResponseBody setData(DescribeUserSiemOrderStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeUserSiemOrderStatusResponseBodyData getData() {
        return this.data;
    }

    public DescribeUserSiemOrderStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserSiemOrderStatusResponseBodyData extends TeaModel {
        /**
         * <p>The Agentic SOC Credits instance ID. If SiemOrderFrom is CREDITS_PRE_PAY, this field returns the Credits subscription instance ID for prepaid orders. If SiemOrderFrom is CREDITS_POST_PAY, this field returns the Credits pay-as-you-go instance ID. This field is empty if no Credits instance is found. For legacy orders, the Security Center instance ID is returned by SasInstanceId.</p>
         * 
         * <strong>example:</strong>
         * <p>asoc-instance-xxxxx</p>
         */
        @NameInMap("AsocInstanceId")
        public String asocInstanceId;

        /**
         * <p>The end time of the Agentic SOC Credits prepaid subscription, expressed as a 13-digit Unix timestamp in milliseconds. This field is returned only when SiemOrderFrom is CREDITS_PRE_PAY. In other cases, this field is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>1785542400456</p>
         */
        @NameInMap("AsocSubscriptionInstanceEndTime")
        public Long asocSubscriptionInstanceEndTime;

        /**
         * <p>The start time of the Agentic SOC Credits prepaid subscription, expressed as a 13-digit Unix timestamp in milliseconds. This field is returned only when SiemOrderFrom is CREDITS_PRE_PAY. In other cases, this field is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>1754006400123</p>
         */
        @NameInMap("AsocSubscriptionInstanceStartTime")
        public Long asocSubscriptionInstanceStartTime;

        /**
         * <p>Indicates whether the current account can perform order operations for threat detection and response. Valid values:</p>
         * <ul>
         * <li>true: The account can purchase, upgrade, or change specifications.</li>
         * <li>false: The account cannot perform order operations for threat detection and response.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanBuy")
        public Boolean canBuy;

        /**
         * <p>The SLS log storage capacity purchased for threat detection and response, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Capacity")
        public Integer capacity;

        /**
         * <p>The source of the log storage capacity order. Valid values:</p>
         * <ul>
         * <li>PRE_PAY_CAPACITY: a prepaid capacity order.</li>
         * <li>POST_PAY_CAPACITY: a pay-as-you-go capacity order.</li>
         * </ul>
         * <p>The capacity order source is independent of the traffic order source indicated by SiemOrderFrom.</p>
         * 
         * <strong>example:</strong>
         * <p>PRE_PAY_CAPACITY</p>
         */
        @NameInMap("CapacityOrderFrom")
        public String capacityOrderFrom;

        /**
         * <p>The SLS log storage capacity purchased for threat detection and response 1.0, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("DeliveryCapacity")
        public Integer deliveryCapacity;

        /**
         * <p>The number of days until the threat detection and response service expires.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DurationDays")
        public Long durationDays;

        /**
         * <p>The expiration time of threat detection and response, expressed as a millisecond-level timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1669823999000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The traffic capacity purchased for threat detection and response, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("FlowCapacity")
        public Integer flowCapacity;

        /**
         * <p>The Alibaba Cloud account ID that purchased threat detection and response.</p>
         * 
         * <strong>example:</strong>
         * <p>123XXXXXX</p>
         */
        @NameInMap("MainUserId")
        public Long mainUserId;

        /**
         * <p>The master account ID of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>123XXXXXX</p>
         */
        @NameInMap("MasterUserId")
        public Long masterUserId;

        /**
         * <p>The resource directory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rd-xxxxxx</p>
         */
        @NameInMap("RdId")
        public String rdId;

        /**
         * <p>Indicates whether the order is a SIEM public preview order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RdOrder")
        public Integer rdOrder;

        /**
         * <p>The Security Center instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-instance-xxxxx</p>
         */
        @NameInMap("SasInstanceId")
        public String sasInstanceId;

        /**
         * <p>The source of the traffic order. Valid values:</p>
         * <ul>
         * <li>PRE_PAY_FLOW: a prepaid traffic order for threat detection and response.</li>
         * <li>POST_PAY_FLOW: a pay-as-you-go traffic order for threat detection and response.</li>
         * <li>CREDITS_PRE_PAY: an Agentic SOC Credits prepaid subscription.</li>
         * <li>CREDITS_POST_PAY: an Agentic SOC Credits pay-as-you-go instance.</li>
         * </ul>
         * <p>This field describes the traffic order source. The log storage capacity order source is independently indicated by CapacityOrderFrom.</p>
         * 
         * <strong>example:</strong>
         * <p>CREDITS_PRE_PAY</p>
         */
        @NameInMap("SiemOrderFrom")
        public String siemOrderFrom;

        /**
         * <p>Indicates whether a valid SIEM order exists. Valid values:</p>
         * <ul>
         * <li>1: The SIEM order is valid.</li>
         * <li>0: The SIEM order is invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiemOrderStatus")
        public Integer siemOrderStatus;

        /**
         * <p>The Alibaba Cloud account ID of the current logon.</p>
         * 
         * <strong>example:</strong>
         * <p>123XXXXXX</p>
         */
        @NameInMap("SubUserId")
        public Long subUserId;

        /**
         * <p>The user type.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("UserType")
        public String userType;

        public static DescribeUserSiemOrderStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserSiemOrderStatusResponseBodyData self = new DescribeUserSiemOrderStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeUserSiemOrderStatusResponseBodyData setAsocInstanceId(String asocInstanceId) {
            this.asocInstanceId = asocInstanceId;
            return this;
        }
        public String getAsocInstanceId() {
            return this.asocInstanceId;
        }

        public DescribeUserSiemOrderStatusResponseBodyData setAsocSubscriptionInstanceEndTime(Long asocSubscriptionInstanceEndTime) {
            this.asocSubscriptionInstanceEndTime = asocSubscriptionInstanceEndTime;
            return this;
        }
        public Long getAsocSubscriptionInstanceEndTime() {
            return this.asocSubscriptionInstanceEndTime;
        }

        public DescribeUserSiemOrderStatusResponseBodyData setAsocSubscriptionInstanceStartTime(Long asocSubscriptionInstanceStartTime) {
            this.asocSubscriptionInstanceStartTime = asocSubscriptionInstanceStartTime;
            return this;
        }
        public Long getAsocSubscriptionInstanceStartTime() {
            return this.asocSubscriptionInstanceStartTime;
        }

        public DescribeUserSiemOrderStatusResponseBodyData setCanBuy(Boolean canBuy) {
            this.canBuy = canBuy;
            return this;
        }
        public Boolean getCanBuy() {
            return this.canBuy;
        }

        public DescribeUserSiemOrderStatusResponseBodyData setCapacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Integer getCapacity() {
            return this.capacity;
        }

        public DescribeUserSiemOrderStatusResponseBodyData setCapacityOrderFrom(String capacityOrderFrom) {
            this.capacityOrderFrom = capacityOrderFrom;
            return this;
        }
        public String getCapacityOrderFrom() {
            return this.capacityOrderFrom;
        }

        public DescribeUserSiemOrderStatusResponseBodyData setDeliveryCapacity(Integer deliveryCapacity) {
            this.deliveryCapacity = deliveryCapacity;
            return this;
        }
        public Integer getDeliveryCapacity() {
            return this.deliveryCapacity;
        }

        public DescribeUserSiemOrderStatusResponseBodyData setDurationDays(Long durationDays) {
            this.durationDays = durationDays;
            return this;
        }
        public Long getDurationDays() {
            return this.durationDays;
        }

        public DescribeUserSiemOrderStatusResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeUserSiemOrderStatusResponseBodyData setFlowCapacity(Integer flowCapacity) {
            this.flowCapacity = flowCapacity;
            return this;
        }
        public Integer getFlowCapacity() {
            return this.flowCapacity;
        }

        public DescribeUserSiemOrderStatusResponseBodyData setMainUserId(Long mainUserId) {
            this.mainUserId = mainUserId;
            return this;
        }
        public Long getMainUserId() {
            return this.mainUserId;
        }

        public DescribeUserSiemOrderStatusResponseBodyData setMasterUserId(Long masterUserId) {
            this.masterUserId = masterUserId;
            return this;
        }
        public Long getMasterUserId() {
            return this.masterUserId;
        }

        public DescribeUserSiemOrderStatusResponseBodyData setRdId(String rdId) {
            this.rdId = rdId;
            return this;
        }
        public String getRdId() {
            return this.rdId;
        }

        public DescribeUserSiemOrderStatusResponseBodyData setRdOrder(Integer rdOrder) {
            this.rdOrder = rdOrder;
            return this;
        }
        public Integer getRdOrder() {
            return this.rdOrder;
        }

        public DescribeUserSiemOrderStatusResponseBodyData setSasInstanceId(String sasInstanceId) {
            this.sasInstanceId = sasInstanceId;
            return this;
        }
        public String getSasInstanceId() {
            return this.sasInstanceId;
        }

        public DescribeUserSiemOrderStatusResponseBodyData setSiemOrderFrom(String siemOrderFrom) {
            this.siemOrderFrom = siemOrderFrom;
            return this;
        }
        public String getSiemOrderFrom() {
            return this.siemOrderFrom;
        }

        public DescribeUserSiemOrderStatusResponseBodyData setSiemOrderStatus(Integer siemOrderStatus) {
            this.siemOrderStatus = siemOrderStatus;
            return this;
        }
        public Integer getSiemOrderStatus() {
            return this.siemOrderStatus;
        }

        public DescribeUserSiemOrderStatusResponseBodyData setSubUserId(Long subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public Long getSubUserId() {
            return this.subUserId;
        }

        public DescribeUserSiemOrderStatusResponseBodyData setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
