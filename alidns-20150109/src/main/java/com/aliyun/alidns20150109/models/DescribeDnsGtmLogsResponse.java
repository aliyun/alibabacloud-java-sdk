// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmLogsResponse extends TeaModel {
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
    public DescribeDnsGtmLogsResponseLogs logs;

    public static DescribeDnsGtmLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmLogsResponse self = new DescribeDnsGtmLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmLogsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmLogsResponse setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeDnsGtmLogsResponse setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeDnsGtmLogsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDnsGtmLogsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDnsGtmLogsResponse setLogs(DescribeDnsGtmLogsResponseLogs logs) {
        this.logs = logs;
        return this;
    }
    public DescribeDnsGtmLogsResponseLogs getLogs() {
        return this.logs;
    }

    public static class DescribeDnsGtmLogsResponseLogsLog extends TeaModel {
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

        @NameInMap("OperTimestamp")
        @Validation(required = true)
        public Long operTimestamp;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        public static DescribeDnsGtmLogsResponseLogsLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmLogsResponseLogsLog self = new DescribeDnsGtmLogsResponseLogsLog();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmLogsResponseLogsLog setOperTime(String operTime) {
            this.operTime = operTime;
            return this;
        }
        public String getOperTime() {
            return this.operTime;
        }

        public DescribeDnsGtmLogsResponseLogsLog setOperAction(String operAction) {
            this.operAction = operAction;
            return this;
        }
        public String getOperAction() {
            return this.operAction;
        }

        public DescribeDnsGtmLogsResponseLogsLog setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public DescribeDnsGtmLogsResponseLogsLog setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public DescribeDnsGtmLogsResponseLogsLog setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public DescribeDnsGtmLogsResponseLogsLog setOperTimestamp(Long operTimestamp) {
            this.operTimestamp = operTimestamp;
            return this;
        }
        public Long getOperTimestamp() {
            return this.operTimestamp;
        }

        public DescribeDnsGtmLogsResponseLogsLog setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDnsGtmLogsResponseLogsLog setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class DescribeDnsGtmLogsResponseLogs extends TeaModel {
        @NameInMap("Log")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmLogsResponseLogsLog> log;

        public static DescribeDnsGtmLogsResponseLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmLogsResponseLogs self = new DescribeDnsGtmLogsResponseLogs();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmLogsResponseLogs setLog(java.util.List<DescribeDnsGtmLogsResponseLogsLog> log) {
            this.log = log;
            return this;
        }
        public java.util.List<DescribeDnsGtmLogsResponseLogsLog> getLog() {
            return this.log;
        }

    }

}
