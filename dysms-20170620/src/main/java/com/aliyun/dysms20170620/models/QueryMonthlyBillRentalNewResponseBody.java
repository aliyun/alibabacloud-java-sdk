// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryMonthlyBillRentalNewResponseBody extends TeaModel {
    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Records")
    public java.util.List<QueryMonthlyBillRentalNewResponseBodyRecords> records;

    @NameInMap("RentalSum")
    public String rentalSum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static QueryMonthlyBillRentalNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlyBillRentalNewResponseBody self = new QueryMonthlyBillRentalNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMonthlyBillRentalNewResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryMonthlyBillRentalNewResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMonthlyBillRentalNewResponseBody setRecords(java.util.List<QueryMonthlyBillRentalNewResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<QueryMonthlyBillRentalNewResponseBodyRecords> getRecords() {
        return this.records;
    }

    public QueryMonthlyBillRentalNewResponseBody setRentalSum(String rentalSum) {
        this.rentalSum = rentalSum;
        return this;
    }
    public String getRentalSum() {
        return this.rentalSum;
    }

    public QueryMonthlyBillRentalNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMonthlyBillRentalNewResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QueryMonthlyBillRentalNewResponseBodyRecords extends TeaModel {
        @NameInMap("BillTime")
        public Long billTime;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("OfferTime")
        public Long offerTime;

        @NameInMap("Rental")
        public String rental;

        @NameInMap("SubItemId")
        public String subItemId;

        @NameInMap("SubItemName")
        public String subItemName;

        public static QueryMonthlyBillRentalNewResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyBillRentalNewResponseBodyRecords self = new QueryMonthlyBillRentalNewResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public QueryMonthlyBillRentalNewResponseBodyRecords setBillTime(Long billTime) {
            this.billTime = billTime;
            return this;
        }
        public Long getBillTime() {
            return this.billTime;
        }

        public QueryMonthlyBillRentalNewResponseBodyRecords setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QueryMonthlyBillRentalNewResponseBodyRecords setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public QueryMonthlyBillRentalNewResponseBodyRecords setOfferTime(Long offerTime) {
            this.offerTime = offerTime;
            return this;
        }
        public Long getOfferTime() {
            return this.offerTime;
        }

        public QueryMonthlyBillRentalNewResponseBodyRecords setRental(String rental) {
            this.rental = rental;
            return this;
        }
        public String getRental() {
            return this.rental;
        }

        public QueryMonthlyBillRentalNewResponseBodyRecords setSubItemId(String subItemId) {
            this.subItemId = subItemId;
            return this;
        }
        public String getSubItemId() {
            return this.subItemId;
        }

        public QueryMonthlyBillRentalNewResponseBodyRecords setSubItemName(String subItemName) {
            this.subItemName = subItemName;
            return this;
        }
        public String getSubItemName() {
            return this.subItemName;
        }

    }

}
