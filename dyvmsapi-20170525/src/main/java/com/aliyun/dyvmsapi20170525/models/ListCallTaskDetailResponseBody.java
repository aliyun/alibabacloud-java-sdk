// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListCallTaskDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("TotalPage")
    public Long totalPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("Total")
    public Long total;

    @NameInMap("Data")
    public java.util.List<ListCallTaskDetailResponseBodyData> data;

    public static ListCallTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCallTaskDetailResponseBody self = new ListCallTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCallTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCallTaskDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCallTaskDetailResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public ListCallTaskDetailResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCallTaskDetailResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCallTaskDetailResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListCallTaskDetailResponseBody setData(java.util.List<ListCallTaskDetailResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCallTaskDetailResponseBodyData> getData() {
        return this.data;
    }

    public static class ListCallTaskDetailResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("CalledNum")
        public String calledNum;

        @NameInMap("Caller")
        public String caller;

        @NameInMap("Id")
        public Long id;

        public static ListCallTaskDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCallTaskDetailResponseBodyData self = new ListCallTaskDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCallTaskDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCallTaskDetailResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
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

        public ListCallTaskDetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
