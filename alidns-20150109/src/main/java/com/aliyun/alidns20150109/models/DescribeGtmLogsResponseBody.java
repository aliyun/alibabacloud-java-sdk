// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmLogsResponseBody extends TeaModel {
    /**
     * <p>The list of logs returned.</p>
     */
    @NameInMap("Logs")
    public DescribeGtmLogsResponseBodyLogs logs;

    /**
     * <p>The page number of the returned page.</p>
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
     * <p>20</p>
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
     * <p>224</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>224</p>
     */
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
        /**
         * <p>The formatted message content.</p>
         * 
         * <strong>example:</strong>
         * <p>addtest-pool-1</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The ID of the object that was operated on.</p>
         * 
         * <strong>example:</strong>
         * <p>121212</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The name of the object that was operated on.</p>
         * 
         * <strong>example:</strong>
         * <p>test-pool-1</p>
         */
        @NameInMap("EntityName")
        public String entityName;

        /**
         * <p>The type of the object that was operated on.</p>
         * 
         * <strong>example:</strong>
         * <p>POOL</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The ID of the log record.</p>
         * 
         * <strong>example:</strong>
         * <p>6726</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The operation performed.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("OperAction")
        public String operAction;

        /**
         * <p>The IP address subject to the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>106.11.34.X</p>
         */
        @NameInMap("OperIp")
        public String operIp;

        /**
         * <p>The time when the operation was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-24T07:35Z</p>
         */
        @NameInMap("OperTime")
        public String operTime;

        /**
         * <p>A timestamp that indicates the time when the operation was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>1516779348000</p>
         */
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
