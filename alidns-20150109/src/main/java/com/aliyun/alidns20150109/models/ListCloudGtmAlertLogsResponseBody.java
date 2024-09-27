// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmAlertLogsResponseBody extends TeaModel {
    /**
     * <p>The alert logs.</p>
     */
    @NameInMap("Logs")
    public ListCloudGtmAlertLogsResponseBodyLogs logs;

    /**
     * <p>Current page number, starting from 1, default is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of rows per page when paginating queries, with a maximum value of 100 and a default of 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Unique request identification code.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of alarm log entries.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static ListCloudGtmAlertLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmAlertLogsResponseBody self = new ListCloudGtmAlertLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmAlertLogsResponseBody setLogs(ListCloudGtmAlertLogsResponseBodyLogs logs) {
        this.logs = logs;
        return this;
    }
    public ListCloudGtmAlertLogsResponseBodyLogs getLogs() {
        return this.logs;
    }

    public ListCloudGtmAlertLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCloudGtmAlertLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCloudGtmAlertLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudGtmAlertLogsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public ListCloudGtmAlertLogsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class ListCloudGtmAlertLogsResponseBodyLogsLog extends TeaModel {
        /**
         * <p>Alert type:</p>
         * <ul>
         * <li>ALERT</li>
         * <li>RESUME</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALERT</p>
         */
        @NameInMap("ActionType")
        public String actionType;

        /**
         * <p>The alert content.</p>
         * 
         * <strong>example:</strong>
         * <p>The alert content.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Alarm object types:</p>
         * <ul>
         * <li>GTM_ADDRESS: Address</li>
         * <li>GTM_ADDRESS_POOL: Address Pool</li>
         * <li>GTM_INSTANCE: Instance</li>
         * <li>GTM_MONITOR_TEMPLATE: Health Check Template</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GTM_ADDRESS</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>Alert log time (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1711328826977</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static ListCloudGtmAlertLogsResponseBodyLogsLog build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmAlertLogsResponseBodyLogsLog self = new ListCloudGtmAlertLogsResponseBodyLogsLog();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmAlertLogsResponseBodyLogsLog setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public ListCloudGtmAlertLogsResponseBodyLogsLog setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListCloudGtmAlertLogsResponseBodyLogsLog setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ListCloudGtmAlertLogsResponseBodyLogsLog setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class ListCloudGtmAlertLogsResponseBodyLogs extends TeaModel {
        @NameInMap("Log")
        public java.util.List<ListCloudGtmAlertLogsResponseBodyLogsLog> log;

        public static ListCloudGtmAlertLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmAlertLogsResponseBodyLogs self = new ListCloudGtmAlertLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmAlertLogsResponseBodyLogs setLog(java.util.List<ListCloudGtmAlertLogsResponseBodyLogsLog> log) {
            this.log = log;
            return this;
        }
        public java.util.List<ListCloudGtmAlertLogsResponseBodyLogsLog> getLog() {
            return this.log;
        }

    }

}
