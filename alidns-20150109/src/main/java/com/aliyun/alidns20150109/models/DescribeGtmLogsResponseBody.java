// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmLogsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("Logs")
    public java.util.List<DescribeGtmLogsResponseBodyLogs> logs;

    @NameInMap("TotalItems")
    public Integer totalItems;

    public static DescribeGtmLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmLogsResponseBody self = new DescribeGtmLogsResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeGtmLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGtmLogsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeGtmLogsResponseBody setLogs(java.util.List<DescribeGtmLogsResponseBodyLogs> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<DescribeGtmLogsResponseBodyLogs> getLogs() {
        return this.logs;
    }

    public DescribeGtmLogsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public static class DescribeGtmLogsResponseBodyLogs extends TeaModel {
        @NameInMap("OperTimestamp")
        public Long operTimestamp;

        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("OperTime")
        public String operTime;

        @NameInMap("OperIp")
        public String operIp;

        @NameInMap("OperAction")
        public String operAction;

        @NameInMap("Content")
        public String content;

        @NameInMap("EntityName")
        public String entityName;

        @NameInMap("Id")
        public Long id;

        public static DescribeGtmLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmLogsResponseBodyLogs self = new DescribeGtmLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public DescribeGtmLogsResponseBodyLogs setOperTimestamp(Long operTimestamp) {
            this.operTimestamp = operTimestamp;
            return this;
        }
        public Long getOperTimestamp() {
            return this.operTimestamp;
        }

        public DescribeGtmLogsResponseBodyLogs setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public DescribeGtmLogsResponseBodyLogs setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public DescribeGtmLogsResponseBodyLogs setOperTime(String operTime) {
            this.operTime = operTime;
            return this;
        }
        public String getOperTime() {
            return this.operTime;
        }

        public DescribeGtmLogsResponseBodyLogs setOperIp(String operIp) {
            this.operIp = operIp;
            return this;
        }
        public String getOperIp() {
            return this.operIp;
        }

        public DescribeGtmLogsResponseBodyLogs setOperAction(String operAction) {
            this.operAction = operAction;
            return this;
        }
        public String getOperAction() {
            return this.operAction;
        }

        public DescribeGtmLogsResponseBodyLogs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeGtmLogsResponseBodyLogs setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public DescribeGtmLogsResponseBodyLogs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
