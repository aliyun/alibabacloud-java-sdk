// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListEmrHiveAuditLogsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListEmrHiveAuditLogsResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    public static ListEmrHiveAuditLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEmrHiveAuditLogsResponseBody self = new ListEmrHiveAuditLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEmrHiveAuditLogsResponseBody setData(ListEmrHiveAuditLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEmrHiveAuditLogsResponseBodyData getData() {
        return this.data;
    }

    public ListEmrHiveAuditLogsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListEmrHiveAuditLogsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListEmrHiveAuditLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEmrHiveAuditLogsResponseBodyDataPagedData extends TeaModel {
        @NameInMap("Database")
        public String database;

        @NameInMap("EventTime")
        public Long eventTime;

        @NameInMap("Groups")
        public java.util.List<String> groups;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Table")
        public String table;

        @NameInMap("User")
        public String user;

        public static ListEmrHiveAuditLogsResponseBodyDataPagedData build(java.util.Map<String, ?> map) throws Exception {
            ListEmrHiveAuditLogsResponseBodyDataPagedData self = new ListEmrHiveAuditLogsResponseBodyDataPagedData();
            return TeaModel.build(map, self);
        }

        public ListEmrHiveAuditLogsResponseBodyDataPagedData setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public ListEmrHiveAuditLogsResponseBodyDataPagedData setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

        public ListEmrHiveAuditLogsResponseBodyDataPagedData setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<String> getGroups() {
            return this.groups;
        }

        public ListEmrHiveAuditLogsResponseBodyDataPagedData setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListEmrHiveAuditLogsResponseBodyDataPagedData setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public ListEmrHiveAuditLogsResponseBodyDataPagedData setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class ListEmrHiveAuditLogsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PagedData")
        public java.util.List<ListEmrHiveAuditLogsResponseBodyDataPagedData> pagedData;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListEmrHiveAuditLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEmrHiveAuditLogsResponseBodyData self = new ListEmrHiveAuditLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEmrHiveAuditLogsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListEmrHiveAuditLogsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListEmrHiveAuditLogsResponseBodyData setPagedData(java.util.List<ListEmrHiveAuditLogsResponseBodyDataPagedData> pagedData) {
            this.pagedData = pagedData;
            return this;
        }
        public java.util.List<ListEmrHiveAuditLogsResponseBodyDataPagedData> getPagedData() {
            return this.pagedData;
        }

        public ListEmrHiveAuditLogsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
