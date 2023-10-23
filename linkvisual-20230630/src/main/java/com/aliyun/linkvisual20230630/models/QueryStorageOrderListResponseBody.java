// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryStorageOrderListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryStorageOrderListResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryStorageOrderListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStorageOrderListResponseBody self = new QueryStorageOrderListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStorageOrderListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStorageOrderListResponseBody setData(QueryStorageOrderListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryStorageOrderListResponseBodyData getData() {
        return this.data;
    }

    public QueryStorageOrderListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryStorageOrderListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStorageOrderListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryStorageOrderListResponseBodyDataStorageOrderList extends TeaModel {
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

        public static QueryStorageOrderListResponseBodyDataStorageOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryStorageOrderListResponseBodyDataStorageOrderList self = new QueryStorageOrderListResponseBodyDataStorageOrderList();
            return TeaModel.build(map, self);
        }

        public QueryStorageOrderListResponseBodyDataStorageOrderList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QueryStorageOrderListResponseBodyDataStorageOrderList setCopies(Integer copies) {
            this.copies = copies;
            return this;
        }
        public Integer getCopies() {
            return this.copies;
        }

        public QueryStorageOrderListResponseBodyDataStorageOrderList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryStorageOrderListResponseBodyDataStorageOrderList setEndTimeUTC(String endTimeUTC) {
            this.endTimeUTC = endTimeUTC;
            return this;
        }
        public String getEndTimeUTC() {
            return this.endTimeUTC;
        }

        public QueryStorageOrderListResponseBodyDataStorageOrderList setIdentityId(String identityId) {
            this.identityId = identityId;
            return this;
        }
        public String getIdentityId() {
            return this.identityId;
        }

        public QueryStorageOrderListResponseBodyDataStorageOrderList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryStorageOrderListResponseBodyDataStorageOrderList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryStorageOrderListResponseBodyDataStorageOrderList setOrderType(Integer orderType) {
            this.orderType = orderType;
            return this;
        }
        public Integer getOrderType() {
            return this.orderType;
        }

        public QueryStorageOrderListResponseBodyDataStorageOrderList setOutOrderNo(String outOrderNo) {
            this.outOrderNo = outOrderNo;
            return this;
        }
        public String getOutOrderNo() {
            return this.outOrderNo;
        }

        public QueryStorageOrderListResponseBodyDataStorageOrderList setPaymentStatus(Integer paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }
        public Integer getPaymentStatus() {
            return this.paymentStatus;
        }

        public QueryStorageOrderListResponseBodyDataStorageOrderList setPreConsume(Integer preConsume) {
            this.preConsume = preConsume;
            return this;
        }
        public Integer getPreConsume() {
            return this.preConsume;
        }

        public QueryStorageOrderListResponseBodyDataStorageOrderList setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public QueryStorageOrderListResponseBodyDataStorageOrderList setRecordType(Integer recordType) {
            this.recordType = recordType;
            return this;
        }
        public Integer getRecordType() {
            return this.recordType;
        }

        public QueryStorageOrderListResponseBodyDataStorageOrderList setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public QueryStorageOrderListResponseBodyDataStorageOrderList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryStorageOrderListResponseBodyDataStorageOrderList setStartTimeUTC(String startTimeUTC) {
            this.startTimeUTC = startTimeUTC;
            return this;
        }
        public String getStartTimeUTC() {
            return this.startTimeUTC;
        }

        public QueryStorageOrderListResponseBodyDataStorageOrderList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryStorageOrderListResponseBodyDataStorageOrderList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryStorageOrderListResponseBodyDataStorageOrderList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class QueryStorageOrderListResponseBodyData extends TeaModel {
        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("StorageOrderList")
        public java.util.List<QueryStorageOrderListResponseBodyDataStorageOrderList> storageOrderList;

        @NameInMap("Total")
        public Integer total;

        public static QueryStorageOrderListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryStorageOrderListResponseBodyData self = new QueryStorageOrderListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryStorageOrderListResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryStorageOrderListResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryStorageOrderListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryStorageOrderListResponseBodyData setStorageOrderList(java.util.List<QueryStorageOrderListResponseBodyDataStorageOrderList> storageOrderList) {
            this.storageOrderList = storageOrderList;
            return this;
        }
        public java.util.List<QueryStorageOrderListResponseBodyDataStorageOrderList> getStorageOrderList() {
            return this.storageOrderList;
        }

        public QueryStorageOrderListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
