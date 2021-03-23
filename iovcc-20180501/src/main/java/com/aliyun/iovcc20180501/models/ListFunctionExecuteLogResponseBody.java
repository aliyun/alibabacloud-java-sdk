// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListFunctionExecuteLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LogList")
    public ListFunctionExecuteLogResponseBodyLogList logList;

    public static ListFunctionExecuteLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionExecuteLogResponseBody self = new ListFunctionExecuteLogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFunctionExecuteLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFunctionExecuteLogResponseBody setLogList(ListFunctionExecuteLogResponseBodyLogList logList) {
        this.logList = logList;
        return this;
    }
    public ListFunctionExecuteLogResponseBodyLogList getLogList() {
        return this.logList;
    }

    public static class ListFunctionExecuteLogResponseBodyLogListLogs extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("BackEndRequestId")
        public String backEndRequestId;

        public static ListFunctionExecuteLogResponseBodyLogListLogs build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionExecuteLogResponseBodyLogListLogs self = new ListFunctionExecuteLogResponseBodyLogListLogs();
            return TeaModel.build(map, self);
        }

        public ListFunctionExecuteLogResponseBodyLogListLogs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListFunctionExecuteLogResponseBodyLogListLogs setBackEndRequestId(String backEndRequestId) {
            this.backEndRequestId = backEndRequestId;
            return this;
        }
        public String getBackEndRequestId() {
            return this.backEndRequestId;
        }

    }

    public static class ListFunctionExecuteLogResponseBodyLogListPagination extends TeaModel {
        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("HasNextPage")
        public Boolean hasNextPage;

        public static ListFunctionExecuteLogResponseBodyLogListPagination build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionExecuteLogResponseBodyLogListPagination self = new ListFunctionExecuteLogResponseBodyLogListPagination();
            return TeaModel.build(map, self);
        }

        public ListFunctionExecuteLogResponseBodyLogListPagination setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListFunctionExecuteLogResponseBodyLogListPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFunctionExecuteLogResponseBodyLogListPagination setHasNextPage(Boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
            return this;
        }
        public Boolean getHasNextPage() {
            return this.hasNextPage;
        }

    }

    public static class ListFunctionExecuteLogResponseBodyLogList extends TeaModel {
        @NameInMap("Logs")
        public java.util.List<ListFunctionExecuteLogResponseBodyLogListLogs> logs;

        @NameInMap("Pagination")
        public ListFunctionExecuteLogResponseBodyLogListPagination pagination;

        public static ListFunctionExecuteLogResponseBodyLogList build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionExecuteLogResponseBodyLogList self = new ListFunctionExecuteLogResponseBodyLogList();
            return TeaModel.build(map, self);
        }

        public ListFunctionExecuteLogResponseBodyLogList setLogs(java.util.List<ListFunctionExecuteLogResponseBodyLogListLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<ListFunctionExecuteLogResponseBodyLogListLogs> getLogs() {
            return this.logs;
        }

        public ListFunctionExecuteLogResponseBodyLogList setPagination(ListFunctionExecuteLogResponseBodyLogListPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ListFunctionExecuteLogResponseBodyLogListPagination getPagination() {
            return this.pagination;
        }

    }

}
