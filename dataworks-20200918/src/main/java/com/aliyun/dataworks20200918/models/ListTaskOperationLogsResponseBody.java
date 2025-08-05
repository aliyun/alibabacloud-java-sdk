// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListTaskOperationLogsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListTaskOperationLogsResponseBodyPagingInfo pagingInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListTaskOperationLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskOperationLogsResponseBody self = new ListTaskOperationLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskOperationLogsResponseBody setPagingInfo(ListTaskOperationLogsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListTaskOperationLogsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListTaskOperationLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTaskOperationLogsResponseBodyPagingInfoOperationLogs extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("OperationContent")
        public String operationContent;

        @NameInMap("OperationSeq")
        public Long operationSeq;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("User")
        public String user;

        public static ListTaskOperationLogsResponseBodyPagingInfoOperationLogs build(java.util.Map<String, ?> map) throws Exception {
            ListTaskOperationLogsResponseBodyPagingInfoOperationLogs self = new ListTaskOperationLogsResponseBodyPagingInfoOperationLogs();
            return TeaModel.build(map, self);
        }

        public ListTaskOperationLogsResponseBodyPagingInfoOperationLogs setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListTaskOperationLogsResponseBodyPagingInfoOperationLogs setOperationContent(String operationContent) {
            this.operationContent = operationContent;
            return this;
        }
        public String getOperationContent() {
            return this.operationContent;
        }

        public ListTaskOperationLogsResponseBodyPagingInfoOperationLogs setOperationSeq(Long operationSeq) {
            this.operationSeq = operationSeq;
            return this;
        }
        public Long getOperationSeq() {
            return this.operationSeq;
        }

        public ListTaskOperationLogsResponseBodyPagingInfoOperationLogs setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public ListTaskOperationLogsResponseBodyPagingInfoOperationLogs setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class ListTaskOperationLogsResponseBodyPagingInfo extends TeaModel {
        @NameInMap("OperationLogs")
        public java.util.List<ListTaskOperationLogsResponseBodyPagingInfoOperationLogs> operationLogs;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListTaskOperationLogsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListTaskOperationLogsResponseBodyPagingInfo self = new ListTaskOperationLogsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListTaskOperationLogsResponseBodyPagingInfo setOperationLogs(java.util.List<ListTaskOperationLogsResponseBodyPagingInfoOperationLogs> operationLogs) {
            this.operationLogs = operationLogs;
            return this;
        }
        public java.util.List<ListTaskOperationLogsResponseBodyPagingInfoOperationLogs> getOperationLogs() {
            return this.operationLogs;
        }

        public ListTaskOperationLogsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListTaskOperationLogsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListTaskOperationLogsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
