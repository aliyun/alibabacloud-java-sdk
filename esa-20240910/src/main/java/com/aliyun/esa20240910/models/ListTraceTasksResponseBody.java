// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListTraceTasksResponseBody extends TeaModel {
    /**
     * <p>The number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The returned list information.</p>
     */
    @NameInMap("List")
    public java.util.List<ListTraceTasksResponseBodyList> list;

    /**
     * <p>The page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The page size. Valid values: any integer from 1 to 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4E09C5D7-E1CF-4CAA-A45E-8727F4C8FD70</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListTraceTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTraceTasksResponseBody self = new ListTraceTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTraceTasksResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListTraceTasksResponseBody setList(java.util.List<ListTraceTasksResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListTraceTasksResponseBodyList> getList() {
        return this.list;
    }

    public ListTraceTasksResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListTraceTasksResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTraceTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTraceTasksResponseBodyList extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1077********7468</p>
         */
        @NameInMap("Aliuid")
        public String aliuid;

        /**
         * <p>The IP address of the local DNS server.</p>
         * 
         * <strong>example:</strong>
         * <p>xx.xx.xx.xx</p>
         */
        @NameInMap("ClientAddr")
        public String clientAddr;

        /**
         * <p>The client IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>xx.xx.xx.xx</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The time when the report was created. Format: yyyy-MM-dd HH:mm:ss. Time zone: UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-10 15:11:47</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The diagnose ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f2a18ad5</p>
         */
        @NameInMap("DiagnoseId")
        public String diagnoseId;

        /**
         * <p>The diagnostic URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cdn.dns-detect.alicdn.com/diagnose/xxxxxx">http://cdn.dns-detect.alicdn.com/diagnose/xxxxxx</a></p>
         */
        @NameInMap("DiagnoseUrl")
        public String diagnoseUrl;

        /**
         * <p>The domain name to diagnose.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">http://www.example.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The expiration time. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1669285111</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The remaining number of available diagnostic attempts.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RemainDiagnoseTimes")
        public Long remainDiagnoseTimes;

        /**
         * <p>The report generation status. Valid values:</p>
         * <ul>
         * <li>0: Succeeded.</li>
         * <li>1: Failed.</li>
         * <li>2: Timed out.</li>
         * <li>3: Running.</li>
         * <li>4: Waiting.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The status of the diagnostic URL. Valid values:</p>
         * <ul>
         * <li>1: active</li>
         * <li>0: expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>000000xxxxxxxxxxxxxxxxxxxxxxxxxxxx475e</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The time consumed to generate the report.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TimeConsuming")
        public Long timeConsuming;

        /**
         * <p>The diagnostic trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>000000xxxxxxxxxxxxxxxxxxxxxx25941e</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static ListTraceTasksResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListTraceTasksResponseBodyList self = new ListTraceTasksResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListTraceTasksResponseBodyList setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public ListTraceTasksResponseBodyList setClientAddr(String clientAddr) {
            this.clientAddr = clientAddr;
            return this;
        }
        public String getClientAddr() {
            return this.clientAddr;
        }

        public ListTraceTasksResponseBodyList setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public ListTraceTasksResponseBodyList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTraceTasksResponseBodyList setDiagnoseId(String diagnoseId) {
            this.diagnoseId = diagnoseId;
            return this;
        }
        public String getDiagnoseId() {
            return this.diagnoseId;
        }

        public ListTraceTasksResponseBodyList setDiagnoseUrl(String diagnoseUrl) {
            this.diagnoseUrl = diagnoseUrl;
            return this;
        }
        public String getDiagnoseUrl() {
            return this.diagnoseUrl;
        }

        public ListTraceTasksResponseBodyList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListTraceTasksResponseBodyList setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public ListTraceTasksResponseBodyList setRemainDiagnoseTimes(Long remainDiagnoseTimes) {
            this.remainDiagnoseTimes = remainDiagnoseTimes;
            return this;
        }
        public Long getRemainDiagnoseTimes() {
            return this.remainDiagnoseTimes;
        }

        public ListTraceTasksResponseBodyList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListTraceTasksResponseBodyList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ListTraceTasksResponseBodyList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListTraceTasksResponseBodyList setTimeConsuming(Long timeConsuming) {
            this.timeConsuming = timeConsuming;
            return this;
        }
        public Long getTimeConsuming() {
            return this.timeConsuming;
        }

        public ListTraceTasksResponseBodyList setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

}
