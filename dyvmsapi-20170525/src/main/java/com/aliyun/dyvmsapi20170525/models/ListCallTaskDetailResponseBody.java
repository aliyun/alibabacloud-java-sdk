// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListCallTaskDetailResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>*   The value OK indicates that the request was successful.</p>
     * <p>*   For more information about other response codes, see [API error codes](~~112502~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the task.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListCallTaskDetailResponseBodyData> data;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of called numbers.</p>
     */
    @NameInMap("Total")
    public Long total;

    /**
     * <p>The total number of pages.</p>
     */
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
        /**
         * <p>The called number.</p>
         */
        @NameInMap("CalledNum")
        public String calledNum;

        /**
         * <p>The calling number.</p>
         */
        @NameInMap("Caller")
        public String caller;

        /**
         * <p>The call duration. Unit: seconds.</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>This parameter is unavailable.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The task state. Valid values:</p>
         * <br>
         * <p>*   **SUCCESS**: The task was successful.</p>
         * <p>*   **FAIL**: The task failed.</p>
         * <p>*   **INIT**: The task was not started.</p>
         */
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
