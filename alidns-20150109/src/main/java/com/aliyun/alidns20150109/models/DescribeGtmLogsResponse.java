// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmLogsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalItems")
    @Validation(required = true)
    public Integer totalItems;

    @NameInMap("TotalPages")
    @Validation(required = true)
    public Integer totalPages;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Logs")
    @Validation(required = true)
    public DescribeGtmLogsResponseLogs logs;

    public static DescribeGtmLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmLogsResponse self = new DescribeGtmLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmLogsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmLogsResponse setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeGtmLogsResponse setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeGtmLogsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGtmLogsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGtmLogsResponse setLogs(DescribeGtmLogsResponseLogs logs) {
        this.logs = logs;
        return this;
    }
    public DescribeGtmLogsResponseLogs getLogs() {
        return this.logs;
    }

    public static class DescribeGtmLogsResponseLogsLog extends TeaModel {
        @NameInMap("OperTime")
        @Validation(required = true)
        public String operTime;

        @NameInMap("OperAction")
        @Validation(required = true)
        public String operAction;

        @NameInMap("EntityType")
        @Validation(required = true)
        public String entityType;

        @NameInMap("EntityId")
        @Validation(required = true)
        public String entityId;

        @NameInMap("EntityName")
        @Validation(required = true)
        public String entityName;

        @NameInMap("OperIp")
        @Validation(required = true)
        public String operIp;

        @NameInMap("OperTimestamp")
        @Validation(required = true)
        public Long operTimestamp;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        public static DescribeGtmLogsResponseLogsLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmLogsResponseLogsLog self = new DescribeGtmLogsResponseLogsLog();
            return TeaModel.build(map, self);
        }

        public DescribeGtmLogsResponseLogsLog setOperTime(String operTime) {
            this.operTime = operTime;
            return this;
        }
        public String getOperTime() {
            return this.operTime;
        }

        public DescribeGtmLogsResponseLogsLog setOperAction(String operAction) {
            this.operAction = operAction;
            return this;
        }
        public String getOperAction() {
            return this.operAction;
        }

        public DescribeGtmLogsResponseLogsLog setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public DescribeGtmLogsResponseLogsLog setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public DescribeGtmLogsResponseLogsLog setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public DescribeGtmLogsResponseLogsLog setOperIp(String operIp) {
            this.operIp = operIp;
            return this;
        }
        public String getOperIp() {
            return this.operIp;
        }

        public DescribeGtmLogsResponseLogsLog setOperTimestamp(Long operTimestamp) {
            this.operTimestamp = operTimestamp;
            return this;
        }
        public Long getOperTimestamp() {
            return this.operTimestamp;
        }

        public DescribeGtmLogsResponseLogsLog setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeGtmLogsResponseLogsLog setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class DescribeGtmLogsResponseLogs extends TeaModel {
        @NameInMap("Log")
        @Validation(required = true)
        public java.util.List<DescribeGtmLogsResponseLogsLog> log;

        public static DescribeGtmLogsResponseLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmLogsResponseLogs self = new DescribeGtmLogsResponseLogs();
            return TeaModel.build(map, self);
        }

        public DescribeGtmLogsResponseLogs setLog(java.util.List<DescribeGtmLogsResponseLogsLog> log) {
            this.log = log;
            return this;
        }
        public java.util.List<DescribeGtmLogsResponseLogsLog> getLog() {
            return this.log;
        }

    }

}
