// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class ListLabReservedsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListLabReservedsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListLabReservedsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLabReservedsResponseBody self = new ListLabReservedsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLabReservedsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListLabReservedsResponseBody setData(ListLabReservedsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLabReservedsResponseBodyData getData() {
        return this.data;
    }

    public ListLabReservedsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLabReservedsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLabReservedsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLabReservedsResponseBodyDataList extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("LabId")
        public String labId;

        @NameInMap("LabTitle")
        public String labTitle;

        @NameInMap("Number")
        public Long number;

        @NameInMap("ReservedId")
        public String reservedId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public Long status;

        public static ListLabReservedsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListLabReservedsResponseBodyDataList self = new ListLabReservedsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListLabReservedsResponseBodyDataList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListLabReservedsResponseBodyDataList setLabId(String labId) {
            this.labId = labId;
            return this;
        }
        public String getLabId() {
            return this.labId;
        }

        public ListLabReservedsResponseBodyDataList setLabTitle(String labTitle) {
            this.labTitle = labTitle;
            return this;
        }
        public String getLabTitle() {
            return this.labTitle;
        }

        public ListLabReservedsResponseBodyDataList setNumber(Long number) {
            this.number = number;
            return this;
        }
        public Long getNumber() {
            return this.number;
        }

        public ListLabReservedsResponseBodyDataList setReservedId(String reservedId) {
            this.reservedId = reservedId;
            return this;
        }
        public String getReservedId() {
            return this.reservedId;
        }

        public ListLabReservedsResponseBodyDataList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListLabReservedsResponseBodyDataList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class ListLabReservedsResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListLabReservedsResponseBodyDataList> list;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static ListLabReservedsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLabReservedsResponseBodyData self = new ListLabReservedsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLabReservedsResponseBodyData setList(java.util.List<ListLabReservedsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListLabReservedsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListLabReservedsResponseBodyData setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListLabReservedsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListLabReservedsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
