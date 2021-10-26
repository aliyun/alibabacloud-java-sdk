// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListCallTaskDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListCallTaskDetailResponseBodyData> data;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("TotalPage")
    public Long totalPage;

    public static ListCallTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCallTaskDetailResponseBody self = new ListCallTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCallTaskDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCallTaskDetailResponseBody setData(java.util.List<ListCallTaskDetailResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCallTaskDetailResponseBodyData> getData() {
        return this.data;
    }

    public ListCallTaskDetailResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCallTaskDetailResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCallTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCallTaskDetailResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListCallTaskDetailResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class ListCallTaskDetailResponseBodyData extends TeaModel {
        @NameInMap("CalledNum")
        public String calledNum;

        @NameInMap("Caller")
        public String caller;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Status")
        public String status;

        public static ListCallTaskDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCallTaskDetailResponseBodyData self = new ListCallTaskDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCallTaskDetailResponseBodyData setCalledNum(String calledNum) {
            this.calledNum = calledNum;
            return this;
        }
        public String getCalledNum() {
            return this.calledNum;
        }

        public ListCallTaskDetailResponseBodyData setCaller(String caller) {
            this.caller = caller;
            return this;
        }
        public String getCaller() {
            return this.caller;
        }

        public ListCallTaskDetailResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListCallTaskDetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCallTaskDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
