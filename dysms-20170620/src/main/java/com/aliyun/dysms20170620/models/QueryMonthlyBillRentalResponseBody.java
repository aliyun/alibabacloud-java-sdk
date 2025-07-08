// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryMonthlyBillRentalResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryMonthlyBillRentalResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryMonthlyBillRentalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlyBillRentalResponseBody self = new QueryMonthlyBillRentalResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMonthlyBillRentalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMonthlyBillRentalResponseBody setData(QueryMonthlyBillRentalResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMonthlyBillRentalResponseBodyData getData() {
        return this.data;
    }

    public QueryMonthlyBillRentalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMonthlyBillRentalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMonthlyBillRentalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMonthlyBillRentalResponseBodyDataRecords extends TeaModel {
        @NameInMap("billTime")
        public Long billTime;

        @NameInMap("itemId")
        public String itemId;

        @NameInMap("itemName")
        public String itemName;

        @NameInMap("offerTime")
        public Long offerTime;

        @NameInMap("rental")
        public String rental;

        @NameInMap("subItemId")
        public String subItemId;

        @NameInMap("subItemName")
        public String subItemName;

        public static QueryMonthlyBillRentalResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyBillRentalResponseBodyDataRecords self = new QueryMonthlyBillRentalResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public QueryMonthlyBillRentalResponseBodyDataRecords setBillTime(Long billTime) {
            this.billTime = billTime;
            return this;
        }
        public Long getBillTime() {
            return this.billTime;
        }

        public QueryMonthlyBillRentalResponseBodyDataRecords setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QueryMonthlyBillRentalResponseBodyDataRecords setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public QueryMonthlyBillRentalResponseBodyDataRecords setOfferTime(Long offerTime) {
            this.offerTime = offerTime;
            return this;
        }
        public Long getOfferTime() {
            return this.offerTime;
        }

        public QueryMonthlyBillRentalResponseBodyDataRecords setRental(String rental) {
            this.rental = rental;
            return this;
        }
        public String getRental() {
            return this.rental;
        }

        public QueryMonthlyBillRentalResponseBodyDataRecords setSubItemId(String subItemId) {
            this.subItemId = subItemId;
            return this;
        }
        public String getSubItemId() {
            return this.subItemId;
        }

        public QueryMonthlyBillRentalResponseBodyDataRecords setSubItemName(String subItemName) {
            this.subItemName = subItemName;
            return this;
        }
        public String getSubItemName() {
            return this.subItemName;
        }

    }

    public static class QueryMonthlyBillRentalResponseBodyData extends TeaModel {
        @NameInMap("pageNo")
        public Integer pageNo;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("records")
        public java.util.List<QueryMonthlyBillRentalResponseBodyDataRecords> records;

        @NameInMap("rentalSum")
        public String rentalSum;

        @NameInMap("total")
        public Long total;

        public static QueryMonthlyBillRentalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyBillRentalResponseBodyData self = new QueryMonthlyBillRentalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMonthlyBillRentalResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryMonthlyBillRentalResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryMonthlyBillRentalResponseBodyData setRecords(java.util.List<QueryMonthlyBillRentalResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<QueryMonthlyBillRentalResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public QueryMonthlyBillRentalResponseBodyData setRentalSum(String rentalSum) {
            this.rentalSum = rentalSum;
            return this;
        }
        public String getRentalSum() {
            return this.rentalSum;
        }

        public QueryMonthlyBillRentalResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
