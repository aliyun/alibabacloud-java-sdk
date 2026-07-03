// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentAccuracyTestTasksResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListDataAgentAccuracyTestTasksResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>NesLo****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E0D21075-xxx-FD8AD04A63B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListDataAgentAccuracyTestTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentAccuracyTestTasksResponseBody self = new ListDataAgentAccuracyTestTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataAgentAccuracyTestTasksResponseBody setData(java.util.List<ListDataAgentAccuracyTestTasksResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDataAgentAccuracyTestTasksResponseBodyData> getData() {
        return this.data;
    }

    public ListDataAgentAccuracyTestTasksResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataAgentAccuracyTestTasksResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataAgentAccuracyTestTasksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataAgentAccuracyTestTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataAgentAccuracyTestTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataAgentAccuracyTestTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataAgentAccuracyTestTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataAgentAccuracyTestTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataAgentAccuracyTestTasksResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListDataAgentAccuracyTestTasksResponseBodyData extends TeaModel {
        /**
         * <p>The instance ID of the accuracy test to which the task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>at-106n4rg17gv9fxxxxxxxxxx</p>
         */
        @NameInMap("AccuracyTestInsId")
        public String accuracyTestInsId;

        /**
         * <p>The accuracy test task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>692abb8f-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
         */
        @NameInMap("AccuracyTestTaskId")
        public String accuracyTestTaskId;

        /**
         * <p>The number of completed test subtasks.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("FinishedTaskNumber")
        public Integer finishedTaskNumber;

        /**
         * <p>The time when the document was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-30T08:03:30.000+00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the document was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-30T08:03:30.000+00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The maximum number of concurrent sessions during the test.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxConcurrent")
        public Integer maxConcurrent;

        /**
         * <p>Specifies whether sessions are displayed after analysis. This feature is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedDelete")
        public Boolean needDelete;

        /**
         * <p>The status of the custom agent.</p>
         * 
         * <strong>example:</strong>
         * <p>0 PENDING,1 RUNNING,2 COMPLETED,3 STOPPED,4 FAILED</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The total number of subtasks in the accuracy test task.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalTaskNumber")
        public Integer totalTaskNumber;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8wfig6l33n4f4xxxxxxxxxx</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListDataAgentAccuracyTestTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataAgentAccuracyTestTasksResponseBodyData self = new ListDataAgentAccuracyTestTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataAgentAccuracyTestTasksResponseBodyData setAccuracyTestInsId(String accuracyTestInsId) {
            this.accuracyTestInsId = accuracyTestInsId;
            return this;
        }
        public String getAccuracyTestInsId() {
            return this.accuracyTestInsId;
        }

        public ListDataAgentAccuracyTestTasksResponseBodyData setAccuracyTestTaskId(String accuracyTestTaskId) {
            this.accuracyTestTaskId = accuracyTestTaskId;
            return this;
        }
        public String getAccuracyTestTaskId() {
            return this.accuracyTestTaskId;
        }

        public ListDataAgentAccuracyTestTasksResponseBodyData setFinishedTaskNumber(Integer finishedTaskNumber) {
            this.finishedTaskNumber = finishedTaskNumber;
            return this;
        }
        public Integer getFinishedTaskNumber() {
            return this.finishedTaskNumber;
        }

        public ListDataAgentAccuracyTestTasksResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDataAgentAccuracyTestTasksResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDataAgentAccuracyTestTasksResponseBodyData setMaxConcurrent(Integer maxConcurrent) {
            this.maxConcurrent = maxConcurrent;
            return this;
        }
        public Integer getMaxConcurrent() {
            return this.maxConcurrent;
        }

        public ListDataAgentAccuracyTestTasksResponseBodyData setNeedDelete(Boolean needDelete) {
            this.needDelete = needDelete;
            return this;
        }
        public Boolean getNeedDelete() {
            return this.needDelete;
        }

        public ListDataAgentAccuracyTestTasksResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDataAgentAccuracyTestTasksResponseBodyData setTotalTaskNumber(Integer totalTaskNumber) {
            this.totalTaskNumber = totalTaskNumber;
            return this;
        }
        public Integer getTotalTaskNumber() {
            return this.totalTaskNumber;
        }

        public ListDataAgentAccuracyTestTasksResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
