// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmLogsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("Logs")
    public java.util.List<DescribeDnsGtmLogsResponseBodyLogs> logs;

    @NameInMap("TotalItems")
    public Integer totalItems;

    public static DescribeDnsGtmLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmLogsResponseBody self = new DescribeDnsGtmLogsResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeDnsGtmLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDnsGtmLogsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeDnsGtmLogsResponseBody setLogs(java.util.List<DescribeDnsGtmLogsResponseBodyLogs> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<DescribeDnsGtmLogsResponseBodyLogs> getLogs() {
        return this.logs;
    }

    public DescribeDnsGtmLogsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public static class DescribeDnsGtmLogsResponseBodyLogs extends TeaModel {
        @NameInMap("OperTimestamp")
        public Long operTimestamp;

        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("OperTime")
        public String operTime;

        @NameInMap("OperAction")
        public String operAction;

        @NameInMap("Content")
        public String content;

        @NameInMap("EntityName")
        public String entityName;

        @NameInMap("Id")
        public Long id;

        public static DescribeDnsGtmLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmLogsResponseBodyLogs self = new DescribeDnsGtmLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmLogsResponseBodyLogs setOperTimestamp(Long operTimestamp) {
            this.operTimestamp = operTimestamp;
            return this;
        }
        public Long getOperTimestamp() {
            return this.operTimestamp;
        }

        public DescribeDnsGtmLogsResponseBodyLogs setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public DescribeDnsGtmLogsResponseBodyLogs setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public DescribeDnsGtmLogsResponseBodyLogs setOperTime(String operTime) {
            this.operTime = operTime;
            return this;
        }
        public String getOperTime() {
            return this.operTime;
        }

        public DescribeDnsGtmLogsResponseBodyLogs setOperAction(String operAction) {
            this.operAction = operAction;
            return this;
        }
        public String getOperAction() {
            return this.operAction;
        }

        public DescribeDnsGtmLogsResponseBodyLogs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeDnsGtmLogsResponseBodyLogs setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public DescribeDnsGtmLogsResponseBodyLogs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
