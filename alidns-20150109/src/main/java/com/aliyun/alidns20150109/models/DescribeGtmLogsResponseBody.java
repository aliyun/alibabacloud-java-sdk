// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmLogsResponseBody extends TeaModel {
    @NameInMap("Logs")
    public DescribeGtmLogsResponseBodyLogs logs;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItems")
    public Integer totalItems;

    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeGtmLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmLogsResponseBody self = new DescribeGtmLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmLogsResponseBody setLogs(DescribeGtmLogsResponseBodyLogs logs) {
        this.logs = logs;
        return this;
    }
    public DescribeGtmLogsResponseBodyLogs getLogs() {
        return this.logs;
    }

    public DescribeGtmLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGtmLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGtmLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmLogsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeGtmLogsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeGtmLogsResponseBodyLogsLog extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("EntityName")
        public String entityName;

        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("OperAction")
        public String operAction;

        @NameInMap("OperIp")
        public String operIp;

        @NameInMap("OperTime")
        public String operTime;

        @NameInMap("OperTimestamp")
        public Long operTimestamp;

        public static DescribeGtmLogsResponseBodyLogsLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmLogsResponseBodyLogsLog self = new DescribeGtmLogsResponseBodyLogsLog();
            return TeaModel.build(map, self);
        }

        public DescribeGtmLogsResponseBodyLogsLog setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeGtmLogsResponseBodyLogsLog setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public DescribeGtmLogsResponseBodyLogsLog setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public DescribeGtmLogsResponseBodyLogsLog setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public DescribeGtmLogsResponseBodyLogsLog setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeGtmLogsResponseBodyLogsLog setOperAction(String operAction) {
            this.operAction = operAction;
            return this;
        }
        public String getOperAction() {
            return this.operAction;
        }

        public DescribeGtmLogsResponseBodyLogsLog setOperIp(String operIp) {
            this.operIp = operIp;
            return this;
        }
        public String getOperIp() {
            return this.operIp;
        }

        public DescribeGtmLogsResponseBodyLogsLog setOperTime(String operTime) {
            this.operTime = operTime;
            return this;
        }
        public String getOperTime() {
            return this.operTime;
        }

        public DescribeGtmLogsResponseBodyLogsLog setOperTimestamp(Long operTimestamp) {
            this.operTimestamp = operTimestamp;
            return this;
        }
        public Long getOperTimestamp() {
            return this.operTimestamp;
        }

    }

    public static class DescribeGtmLogsResponseBodyLogs extends TeaModel {
        @NameInMap("Log")
        public java.util.List<DescribeGtmLogsResponseBodyLogsLog> log;

        public static DescribeGtmLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmLogsResponseBodyLogs self = new DescribeGtmLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public DescribeGtmLogsResponseBodyLogs setLog(java.util.List<DescribeGtmLogsResponseBodyLogsLog> log) {
            this.log = log;
            return this;
        }
        public java.util.List<DescribeGtmLogsResponseBodyLogsLog> getLog() {
            return this.log;
        }

    }

}
