// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmAlertLogsResponseBody extends TeaModel {
    @NameInMap("Logs")
    public ListCloudGtmAlertLogsResponseBodyLogs logs;

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
        @NameInMap("ActionType")
        public String actionType;

        @NameInMap("Content")
        public String content;

        @NameInMap("EntityType")
        public String entityType;

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
