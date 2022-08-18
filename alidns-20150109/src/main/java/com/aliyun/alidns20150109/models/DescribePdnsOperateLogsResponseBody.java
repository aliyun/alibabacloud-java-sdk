// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsOperateLogsResponseBody extends TeaModel {
    @NameInMap("Logs")
    public java.util.List<DescribePdnsOperateLogsResponseBodyLogs> logs;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribePdnsOperateLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsOperateLogsResponseBody self = new DescribePdnsOperateLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePdnsOperateLogsResponseBody setLogs(java.util.List<DescribePdnsOperateLogsResponseBodyLogs> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<DescribePdnsOperateLogsResponseBodyLogs> getLogs() {
        return this.logs;
    }

    public DescribePdnsOperateLogsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribePdnsOperateLogsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePdnsOperateLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePdnsOperateLogsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePdnsOperateLogsResponseBodyLogs extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("OperateTime")
        public String operateTime;

        @NameInMap("Type")
        public String type;

        @NameInMap("content")
        public String content;

        public static DescribePdnsOperateLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribePdnsOperateLogsResponseBodyLogs self = new DescribePdnsOperateLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public DescribePdnsOperateLogsResponseBodyLogs setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribePdnsOperateLogsResponseBodyLogs setOperateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public String getOperateTime() {
            return this.operateTime;
        }

        public DescribePdnsOperateLogsResponseBodyLogs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePdnsOperateLogsResponseBodyLogs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
