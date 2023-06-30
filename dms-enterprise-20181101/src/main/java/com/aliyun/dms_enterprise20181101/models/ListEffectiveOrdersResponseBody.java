// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListEffectiveOrdersResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The information about orders.</p>
     */
    @NameInMap("OrderSummary")
    public java.util.List<ListEffectiveOrdersResponseBodyOrderSummary> orderSummary;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListEffectiveOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEffectiveOrdersResponseBody self = new ListEffectiveOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEffectiveOrdersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListEffectiveOrdersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListEffectiveOrdersResponseBody setOrderSummary(java.util.List<ListEffectiveOrdersResponseBodyOrderSummary> orderSummary) {
        this.orderSummary = orderSummary;
        return this;
    }
    public java.util.List<ListEffectiveOrdersResponseBodyOrderSummary> getOrderSummary() {
        return this.orderSummary;
    }

    public ListEffectiveOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEffectiveOrdersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEffectiveOrdersResponseBodyOrderSummaryOrderList extends TeaModel {
        /**
         * <p>The UID of the user who placed the order.</p>
         */
        @NameInMap("BuyerId")
        public String buyerId;

        /**
         * <p>The time when the instance expires.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The maximum number of database instances that you can use DMS to manage.</p>
         */
        @NameInMap("InsNum")
        public String insNum;

        /**
         * <p>The ID of the instance for the purchased service.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the order.</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>The time when the instance is started.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static ListEffectiveOrdersResponseBodyOrderSummaryOrderList build(java.util.Map<String, ?> map) throws Exception {
            ListEffectiveOrdersResponseBodyOrderSummaryOrderList self = new ListEffectiveOrdersResponseBodyOrderSummaryOrderList();
            return TeaModel.build(map, self);
        }

        public ListEffectiveOrdersResponseBodyOrderSummaryOrderList setBuyerId(String buyerId) {
            this.buyerId = buyerId;
            return this;
        }
        public String getBuyerId() {
            return this.buyerId;
        }

        public ListEffectiveOrdersResponseBodyOrderSummaryOrderList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListEffectiveOrdersResponseBodyOrderSummaryOrderList setInsNum(String insNum) {
            this.insNum = insNum;
            return this;
        }
        public String getInsNum() {
            return this.insNum;
        }

        public ListEffectiveOrdersResponseBodyOrderSummaryOrderList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEffectiveOrdersResponseBodyOrderSummaryOrderList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public ListEffectiveOrdersResponseBodyOrderSummaryOrderList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ListEffectiveOrdersResponseBodyOrderSummary extends TeaModel {
        /**
         * <p>The commodity code of DMS.</p>
         * <br>
         * <p>*   dms_pre_public_cn: DMS that uses the subscription billing method</p>
         * <p>*   dms_post_public_cn: DMS that uses the pay-as-you-go billing method</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The type of the service.</p>
         * <br>
         * <p>*   **VersionType**: DMS that supports control modes</p>
         * <p>*   **SensitiveDataProtection**: DMS that supports sensitive data protection</p>
         */
        @NameInMap("CommodityType")
        public String commodityType;

        /**
         * <p>Details about the orders.</p>
         */
        @NameInMap("OrderList")
        public java.util.List<ListEffectiveOrdersResponseBodyOrderSummaryOrderList> orderList;

        /**
         * <p>The sum of the number of instances that you can use DMS to manage in all orders.</p>
         */
        @NameInMap("TotalQuota")
        public Integer totalQuota;

        /**
         * <p>The control mode of DMS. Valid values:</p>
         * <br>
         * <p>*   **stand**: Stable Change</p>
         * <p>*   **safety**: Security Collaboration</p>
         */
        @NameInMap("VersionType")
        public String versionType;

        public static ListEffectiveOrdersResponseBodyOrderSummary build(java.util.Map<String, ?> map) throws Exception {
            ListEffectiveOrdersResponseBodyOrderSummary self = new ListEffectiveOrdersResponseBodyOrderSummary();
            return TeaModel.build(map, self);
        }

        public ListEffectiveOrdersResponseBodyOrderSummary setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListEffectiveOrdersResponseBodyOrderSummary setCommodityType(String commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public String getCommodityType() {
            return this.commodityType;
        }

        public ListEffectiveOrdersResponseBodyOrderSummary setOrderList(java.util.List<ListEffectiveOrdersResponseBodyOrderSummaryOrderList> orderList) {
            this.orderList = orderList;
            return this;
        }
        public java.util.List<ListEffectiveOrdersResponseBodyOrderSummaryOrderList> getOrderList() {
            return this.orderList;
        }

        public ListEffectiveOrdersResponseBodyOrderSummary setTotalQuota(Integer totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }
        public Integer getTotalQuota() {
            return this.totalQuota;
        }

        public ListEffectiveOrdersResponseBodyOrderSummary setVersionType(String versionType) {
            this.versionType = versionType;
            return this;
        }
        public String getVersionType() {
            return this.versionType;
        }

    }

}
