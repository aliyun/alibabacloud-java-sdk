// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmLogsResponseBody extends TeaModel {
    /**
     * <p>The returned logs.</p>
     */
    @NameInMap("Logs")
    public DescribeDnsGtmLogsResponseBodyLogs logs;

    /**
     * <p>The number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>50C60A29-2E93-425A-ABA8-068686E28873</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned on all pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The formatted message content.</p>
         * 
         * <strong>example:</strong>
         * <p>addtest-pool-1</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The ID of the object on which the operation was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>121212</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The name of the object on which the operation was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>test-pool-1</p>
         */
        @NameInMap("EntityName")
        public String entityName;

        /**
         * <p>The type of the object on which the operation was performed.</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The ID of the record.</p>
         * 
         * <strong>example:</strong>
         * <p>6726</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The operation performed.</p>
         */
        @NameInMap("OperAction")
        public String operAction;

        /**
         * <p>The time when the operation was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-24T07:35Z</p>
         */
        @NameInMap("OperTime")
        public String operTime;

        /**
         * <p>The timestamp of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1516779348000</p>
         */
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
