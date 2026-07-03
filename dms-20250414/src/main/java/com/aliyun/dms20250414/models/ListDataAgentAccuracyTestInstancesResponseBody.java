// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentAccuracyTestInstancesResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListDataAgentAccuracyTestInstancesResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The maximum number of entries returned per page. You can use this parameter together with NextToken to implement paging.</p>
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
     * <p>zCXS*****</p>
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
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E0D21075-xxx-FD8AD04A63B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The operation timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1768270172</p>
     */
    @NameInMap("Timestamp")
    public String timestamp;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Total")
    public String total;

    public static ListDataAgentAccuracyTestInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentAccuracyTestInstancesResponseBody self = new ListDataAgentAccuracyTestInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataAgentAccuracyTestInstancesResponseBody setData(java.util.List<ListDataAgentAccuracyTestInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDataAgentAccuracyTestInstancesResponseBodyData> getData() {
        return this.data;
    }

    public ListDataAgentAccuracyTestInstancesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataAgentAccuracyTestInstancesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataAgentAccuracyTestInstancesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataAgentAccuracyTestInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataAgentAccuracyTestInstancesResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListDataAgentAccuracyTestInstancesResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListDataAgentAccuracyTestInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataAgentAccuracyTestInstancesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListDataAgentAccuracyTestInstancesResponseBody setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public ListDataAgentAccuracyTestInstancesResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class ListDataAgentAccuracyTestInstancesResponseBodyData extends TeaModel {
        /**
         * <p>The accuracy test instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>at-106n4rg17gv9fxxxxxxxxxx</p>
         */
        @NameInMap("AccuracyTestInsId")
        public String accuracyTestInsId;

        /**
         * <p>The custom agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-4x8uzp5wjqu4xxxxxxxxxx</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>The UID of the workspace creator.</p>
         * 
         * <strong>example:</strong>
         * <p>20282*****7591</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The test set file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f-8*******01m</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-30T07:31:09.000+00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-30T07:31:09.000+00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The language used for the analysis task.</p>
         * 
         * <strong>example:</strong>
         * <p>CHINESE</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The maximum number of concurrent sessions during testing.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxConcurrent")
        public String maxConcurrent;

        /**
         * <p>The analysis mode to be tested.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <p>The custom agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent测试名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether sessions are displayed after analysis. This feature is not currently supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedDelete")
        public String needDelete;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8wfig6l33n4f4xxxxxxxxxx</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListDataAgentAccuracyTestInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataAgentAccuracyTestInstancesResponseBodyData self = new ListDataAgentAccuracyTestInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataAgentAccuracyTestInstancesResponseBodyData setAccuracyTestInsId(String accuracyTestInsId) {
            this.accuracyTestInsId = accuracyTestInsId;
            return this;
        }
        public String getAccuracyTestInsId() {
            return this.accuracyTestInsId;
        }

        public ListDataAgentAccuracyTestInstancesResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListDataAgentAccuracyTestInstancesResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListDataAgentAccuracyTestInstancesResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListDataAgentAccuracyTestInstancesResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDataAgentAccuracyTestInstancesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDataAgentAccuracyTestInstancesResponseBodyData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListDataAgentAccuracyTestInstancesResponseBodyData setMaxConcurrent(String maxConcurrent) {
            this.maxConcurrent = maxConcurrent;
            return this;
        }
        public String getMaxConcurrent() {
            return this.maxConcurrent;
        }

        public ListDataAgentAccuracyTestInstancesResponseBodyData setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public ListDataAgentAccuracyTestInstancesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataAgentAccuracyTestInstancesResponseBodyData setNeedDelete(String needDelete) {
            this.needDelete = needDelete;
            return this;
        }
        public String getNeedDelete() {
            return this.needDelete;
        }

        public ListDataAgentAccuracyTestInstancesResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
