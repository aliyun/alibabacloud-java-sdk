// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListCallTaskDetailResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/112502.html">API error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D692AC3D-CBA8-417F-BEB9-5B73718922D4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of called numbers.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Total")
    public Long total;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>1300000****</p>
         */
        @NameInMap("CalledNum")
        public String calledNum;

        /**
         * <p>The calling number.</p>
         * 
         * <strong>example:</strong>
         * <p>0571000****</p>
         */
        @NameInMap("Caller")
        public String caller;

        /**
         * <p>The call duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>This parameter is unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The task state. Valid values:</p>
         * <ul>
         * <li><strong>SUCCESS</strong>: The task was successful.</li>
         * <li><strong>FAIL</strong>: The task failed.</li>
         * <li><strong>INIT</strong>: The task was not started.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FAIL</p>
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
