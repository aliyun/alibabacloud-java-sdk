// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnTaskListResponseBody extends TeaModel {
    @NameInMap("Content")
    public DescribeCdnTaskListResponseBodyContent content;

    /**
     * <strong>example:</strong>
     * <p>4E09C5D7-E1CF-4CAA-A45E-8727F4C8FD70</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnTaskListResponseBody self = new DescribeCdnTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnTaskListResponseBody setContent(DescribeCdnTaskListResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public DescribeCdnTaskListResponseBodyContent getContent() {
        return this.content;
    }

    public DescribeCdnTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnTaskListResponseBodyContentList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1077********7468</p>
         */
        @NameInMap("Aliuid")
        public String aliuid;

        /**
         * <strong>example:</strong>
         * <p>xx.xx.xx.xx</p>
         */
        @NameInMap("ClientAddr")
        public String clientAddr;

        /**
         * <strong>example:</strong>
         * <p>xx.xx.xx.xx</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <strong>example:</strong>
         * <p>2022-12-10 15:11:47</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>f2a18ad5</p>
         */
        @NameInMap("DiagnoseId")
        public String diagnoseId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://cdn.dns-detect.alicdn.com/diagnose/xxxxxx">http://cdn.dns-detect.alicdn.com/diagnose/xxxxxx</a></p>
         */
        @NameInMap("DiagnoseUrl")
        public String diagnoseUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">http://www.example.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>1669285111</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RemainDiagnoseTimes")
        public Long remainDiagnoseTimes;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <strong>example:</strong>
         * <p>000000xxxxxxxxxxxxxxxxxxxxxxxxxxxx475e</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>1s</p>
         */
        @NameInMap("TimeConsuming")
        public Long timeConsuming;

        /**
         * <strong>example:</strong>
         * <p>000000xxxxxxxxxxxxxxxxxxxxxx25941e</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static DescribeCdnTaskListResponseBodyContentList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnTaskListResponseBodyContentList self = new DescribeCdnTaskListResponseBodyContentList();
            return TeaModel.build(map, self);
        }

        public DescribeCdnTaskListResponseBodyContentList setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public DescribeCdnTaskListResponseBodyContentList setClientAddr(String clientAddr) {
            this.clientAddr = clientAddr;
            return this;
        }
        public String getClientAddr() {
            return this.clientAddr;
        }

        public DescribeCdnTaskListResponseBodyContentList setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeCdnTaskListResponseBodyContentList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCdnTaskListResponseBodyContentList setDiagnoseId(String diagnoseId) {
            this.diagnoseId = diagnoseId;
            return this;
        }
        public String getDiagnoseId() {
            return this.diagnoseId;
        }

        public DescribeCdnTaskListResponseBodyContentList setDiagnoseUrl(String diagnoseUrl) {
            this.diagnoseUrl = diagnoseUrl;
            return this;
        }
        public String getDiagnoseUrl() {
            return this.diagnoseUrl;
        }

        public DescribeCdnTaskListResponseBodyContentList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeCdnTaskListResponseBodyContentList setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeCdnTaskListResponseBodyContentList setRemainDiagnoseTimes(Long remainDiagnoseTimes) {
            this.remainDiagnoseTimes = remainDiagnoseTimes;
            return this;
        }
        public Long getRemainDiagnoseTimes() {
            return this.remainDiagnoseTimes;
        }

        public DescribeCdnTaskListResponseBodyContentList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeCdnTaskListResponseBodyContentList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public DescribeCdnTaskListResponseBodyContentList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeCdnTaskListResponseBodyContentList setTimeConsuming(Long timeConsuming) {
            this.timeConsuming = timeConsuming;
            return this;
        }
        public Long getTimeConsuming() {
            return this.timeConsuming;
        }

        public DescribeCdnTaskListResponseBodyContentList setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class DescribeCdnTaskListResponseBodyContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Long count;

        @NameInMap("List")
        public java.util.List<DescribeCdnTaskListResponseBodyContentList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        public static DescribeCdnTaskListResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnTaskListResponseBodyContent self = new DescribeCdnTaskListResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeCdnTaskListResponseBodyContent setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeCdnTaskListResponseBodyContent setList(java.util.List<DescribeCdnTaskListResponseBodyContentList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DescribeCdnTaskListResponseBodyContentList> getList() {
            return this.list;
        }

        public DescribeCdnTaskListResponseBodyContent setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeCdnTaskListResponseBodyContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
