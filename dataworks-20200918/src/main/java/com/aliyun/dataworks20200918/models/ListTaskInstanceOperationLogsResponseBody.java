// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListTaskInstanceOperationLogsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListTaskInstanceOperationLogsResponseBodyPagingInfo pagingInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListTaskInstanceOperationLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskInstanceOperationLogsResponseBody self = new ListTaskInstanceOperationLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskInstanceOperationLogsResponseBody setPagingInfo(ListTaskInstanceOperationLogsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListTaskInstanceOperationLogsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListTaskInstanceOperationLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("OperationContent")
        public String operationContent;

        @NameInMap("OperationSeq")
        public Long operationSeq;

        @NameInMap("TaskInstanceId")
        public Long taskInstanceId;

        @NameInMap("User")
        public String user;

        public static ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs build(java.util.Map<String, ?> map) throws Exception {
            ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs self = new ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs();
            return TeaModel.build(map, self);
        }

        public ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs setOperationContent(String operationContent) {
            this.operationContent = operationContent;
            return this;
        }
        public String getOperationContent() {
            return this.operationContent;
        }

        public ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs setOperationSeq(Long operationSeq) {
            this.operationSeq = operationSeq;
            return this;
        }
        public Long getOperationSeq() {
            return this.operationSeq;
        }

        public ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs setTaskInstanceId(Long taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }
        public Long getTaskInstanceId() {
            return this.taskInstanceId;
        }

        public ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class ListTaskInstanceOperationLogsResponseBodyPagingInfo extends TeaModel {
        @NameInMap("OperationLogs")
        public java.util.List<ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs> operationLogs;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListTaskInstanceOperationLogsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListTaskInstanceOperationLogsResponseBodyPagingInfo self = new ListTaskInstanceOperationLogsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListTaskInstanceOperationLogsResponseBodyPagingInfo setOperationLogs(java.util.List<ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs> operationLogs) {
            this.operationLogs = operationLogs;
            return this;
        }
        public java.util.List<ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs> getOperationLogs() {
            return this.operationLogs;
        }

        public ListTaskInstanceOperationLogsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListTaskInstanceOperationLogsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListTaskInstanceOperationLogsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
