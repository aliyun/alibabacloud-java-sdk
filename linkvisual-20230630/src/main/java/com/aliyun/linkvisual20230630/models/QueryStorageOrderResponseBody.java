// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryStorageOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryStorageOrderResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryStorageOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStorageOrderResponseBody self = new QueryStorageOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStorageOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStorageOrderResponseBody setData(QueryStorageOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryStorageOrderResponseBodyData getData() {
        return this.data;
    }

    public QueryStorageOrderResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryStorageOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStorageOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryStorageOrderResponseBodyData extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("Copies")
        public Integer copies;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EndTimeUTC")
        public String endTimeUTC;

        @NameInMap("IdentityId")
        public String identityId;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("OrderType")
        public Integer orderType;

        @NameInMap("OutOrderNo")
        public String outOrderNo;

        @NameInMap("PaymentStatus")
        public Integer paymentStatus;

        @NameInMap("PreConsume")
        public Integer preConsume;

        @NameInMap("Price")
        public String price;

        @NameInMap("RecordType")
        public Integer recordType;

        @NameInMap("Specification")
        public String specification;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StartTimeUTC")
        public String startTimeUTC;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        public static QueryStorageOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryStorageOrderResponseBodyData self = new QueryStorageOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryStorageOrderResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QueryStorageOrderResponseBodyData setCopies(Integer copies) {
            this.copies = copies;
            return this;
        }
        public Integer getCopies() {
            return this.copies;
        }

        public QueryStorageOrderResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryStorageOrderResponseBodyData setEndTimeUTC(String endTimeUTC) {
            this.endTimeUTC = endTimeUTC;
            return this;
        }
        public String getEndTimeUTC() {
            return this.endTimeUTC;
        }

        public QueryStorageOrderResponseBodyData setIdentityId(String identityId) {
            this.identityId = identityId;
            return this;
        }
        public String getIdentityId() {
            return this.identityId;
        }

        public QueryStorageOrderResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryStorageOrderResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryStorageOrderResponseBodyData setOrderType(Integer orderType) {
            this.orderType = orderType;
            return this;
        }
        public Integer getOrderType() {
            return this.orderType;
        }

        public QueryStorageOrderResponseBodyData setOutOrderNo(String outOrderNo) {
            this.outOrderNo = outOrderNo;
            return this;
        }
        public String getOutOrderNo() {
            return this.outOrderNo;
        }

        public QueryStorageOrderResponseBodyData setPaymentStatus(Integer paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }
        public Integer getPaymentStatus() {
            return this.paymentStatus;
        }

        public QueryStorageOrderResponseBodyData setPreConsume(Integer preConsume) {
            this.preConsume = preConsume;
            return this;
        }
        public Integer getPreConsume() {
            return this.preConsume;
        }

        public QueryStorageOrderResponseBodyData setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public QueryStorageOrderResponseBodyData setRecordType(Integer recordType) {
            this.recordType = recordType;
            return this;
        }
        public Integer getRecordType() {
            return this.recordType;
        }

        public QueryStorageOrderResponseBodyData setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public QueryStorageOrderResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryStorageOrderResponseBodyData setStartTimeUTC(String startTimeUTC) {
            this.startTimeUTC = startTimeUTC;
            return this;
        }
        public String getStartTimeUTC() {
            return this.startTimeUTC;
        }

        public QueryStorageOrderResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryStorageOrderResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryStorageOrderResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
