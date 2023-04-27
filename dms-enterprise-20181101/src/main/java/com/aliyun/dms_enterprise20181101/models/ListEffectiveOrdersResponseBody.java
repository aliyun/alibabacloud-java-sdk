// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListEffectiveOrdersResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("OrderSummary")
    public java.util.List<ListEffectiveOrdersResponseBodyOrderSummary> orderSummary;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("BuyerId")
        public String buyerId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InsNum")
        public String insNum;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OrderId")
        public String orderId;

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
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CommodityType")
        public String commodityType;

        @NameInMap("OrderList")
        public java.util.List<ListEffectiveOrdersResponseBodyOrderSummaryOrderList> orderList;

        @NameInMap("TotalQuota")
        public Integer totalQuota;

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
