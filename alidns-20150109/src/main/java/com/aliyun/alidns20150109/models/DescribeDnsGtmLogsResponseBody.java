// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmLogsResponseBody extends TeaModel {
    @NameInMap("Logs")
    public DescribeDnsGtmLogsResponseBodyLogs logs;

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

    public static DescribeDnsGtmLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmLogsResponseBody self = new DescribeDnsGtmLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmLogsResponseBody setLogs(DescribeDnsGtmLogsResponseBodyLogs logs) {
        this.logs = logs;
        return this;
    }
    public DescribeDnsGtmLogsResponseBodyLogs getLogs() {
        return this.logs;
    }

    public DescribeDnsGtmLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDnsGtmLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDnsGtmLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmLogsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeDnsGtmLogsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeDnsGtmLogsResponseBodyLogsLog extends TeaModel {
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

        @NameInMap("OperTime")
        public String operTime;

        @NameInMap("OperTimestamp")
        public Long operTimestamp;

        public static DescribeDnsGtmLogsResponseBodyLogsLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmLogsResponseBodyLogsLog self = new DescribeDnsGtmLogsResponseBodyLogsLog();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmLogsResponseBodyLogsLog setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeDnsGtmLogsResponseBodyLogsLog setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public DescribeDnsGtmLogsResponseBodyLogsLog setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public DescribeDnsGtmLogsResponseBodyLogsLog setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public DescribeDnsGtmLogsResponseBodyLogsLog setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDnsGtmLogsResponseBodyLogsLog setOperAction(String operAction) {
            this.operAction = operAction;
            return this;
        }
        public String getOperAction() {
            return this.operAction;
        }

        public DescribeDnsGtmLogsResponseBodyLogsLog setOperTime(String operTime) {
            this.operTime = operTime;
            return this;
        }
        public String getOperTime() {
            return this.operTime;
        }

        public DescribeDnsGtmLogsResponseBodyLogsLog setOperTimestamp(Long operTimestamp) {
            this.operTimestamp = operTimestamp;
            return this;
        }
        public Long getOperTimestamp() {
            return this.operTimestamp;
        }

    }

    public static class DescribeDnsGtmLogsResponseBodyLogs extends TeaModel {
        @NameInMap("Log")
        public java.util.List<DescribeDnsGtmLogsResponseBodyLogsLog> log;

        public static DescribeDnsGtmLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmLogsResponseBodyLogs self = new DescribeDnsGtmLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmLogsResponseBodyLogs setLog(java.util.List<DescribeDnsGtmLogsResponseBodyLogsLog> log) {
            this.log = log;
            return this;
        }
        public java.util.List<DescribeDnsGtmLogsResponseBodyLogsLog> getLog() {
            return this.log;
        }

    }

}
