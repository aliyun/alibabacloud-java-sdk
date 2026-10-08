// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListTaskOperationLogsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListTaskOperationLogsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
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
        /**
         * <p>The time when the operation logs are generated.</p>
         * <p>The format is a 13-digit number, such as <code>1710239005403</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The object type. Valid values:</p>
         * <ul>
         * <li>Task: node</li>
         * <li>TaskInstance: node instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TaskInstance</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The operation content.</p>
         * 
         * <strong>example:</strong>
         * <p>Freeze tasks</p>
         */
        @NameInMap("OperationContent")
        public String operationContent;

        /**
         * <p>The operation sequence number.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("OperationSeq")
        public Long operationSeq;

        /**
         * <p>The ID of the node on which the operation was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>The ID of the node instance on which the operation was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TaskInstanceId")
        public Long taskInstanceId;

        /**
         * <p>The account ID of the user who performed the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
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

        public ListTaskOperationLogsResponseBodyPagingInfoOperationLogs setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
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

        public ListTaskOperationLogsResponseBodyPagingInfoOperationLogs setTaskInstanceId(Long taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }
        public Long getTaskInstanceId() {
            return this.taskInstanceId;
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
        /**
         * <p>The list of operation logs.</p>
         */
        @NameInMap("OperationLogs")
        public java.util.List<ListTaskOperationLogsResponseBodyPagingInfoOperationLogs> operationLogs;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
