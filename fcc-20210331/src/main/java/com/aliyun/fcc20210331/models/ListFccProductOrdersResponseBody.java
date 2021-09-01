// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class ListFccProductOrdersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListFccProductOrdersResponseBodyData data;

    public static ListFccProductOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFccProductOrdersResponseBody self = new ListFccProductOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFccProductOrdersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFccProductOrdersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFccProductOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFccProductOrdersResponseBody setData(ListFccProductOrdersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFccProductOrdersResponseBodyData getData() {
        return this.data;
    }

    public static class ListFccProductOrdersResponseBodyDataRecords extends TeaModel {
        @NameInMap("RestCount")
        public Integer restCount;

        @NameInMap("ValidMonth")
        public Integer validMonth;

        @NameInMap("ValidYear")
        public Integer validYear;

        @NameInMap("UsedCount")
        public Integer usedCount;

        @NameInMap("ValidDay")
        public Integer validDay;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("OrderId")
        public String orderId;

        public static ListFccProductOrdersResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListFccProductOrdersResponseBodyDataRecords self = new ListFccProductOrdersResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListFccProductOrdersResponseBodyDataRecords setRestCount(Integer restCount) {
            this.restCount = restCount;
            return this;
        }
        public Integer getRestCount() {
            return this.restCount;
        }

        public ListFccProductOrdersResponseBodyDataRecords setValidMonth(Integer validMonth) {
            this.validMonth = validMonth;
            return this;
        }
        public Integer getValidMonth() {
            return this.validMonth;
        }

        public ListFccProductOrdersResponseBodyDataRecords setValidYear(Integer validYear) {
            this.validYear = validYear;
            return this;
        }
        public Integer getValidYear() {
            return this.validYear;
        }

        public ListFccProductOrdersResponseBodyDataRecords setUsedCount(Integer usedCount) {
            this.usedCount = usedCount;
            return this;
        }
        public Integer getUsedCount() {
            return this.usedCount;
        }

        public ListFccProductOrdersResponseBodyDataRecords setValidDay(Integer validDay) {
            this.validDay = validDay;
            return this;
        }
        public Integer getValidDay() {
            return this.validDay;
        }

        public ListFccProductOrdersResponseBodyDataRecords setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListFccProductOrdersResponseBodyDataRecords setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListFccProductOrdersResponseBodyDataRecords setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class ListFccProductOrdersResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Records")
        public java.util.List<ListFccProductOrdersResponseBodyDataRecords> records;

        public static ListFccProductOrdersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFccProductOrdersResponseBodyData self = new ListFccProductOrdersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFccProductOrdersResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListFccProductOrdersResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public ListFccProductOrdersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFccProductOrdersResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListFccProductOrdersResponseBodyData setRecords(java.util.List<ListFccProductOrdersResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListFccProductOrdersResponseBodyDataRecords> getRecords() {
            return this.records;
        }

    }

}
