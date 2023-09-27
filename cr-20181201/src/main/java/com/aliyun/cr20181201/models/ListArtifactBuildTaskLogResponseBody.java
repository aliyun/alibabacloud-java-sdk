// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListArtifactBuildTaskLogResponseBody extends TeaModel {
    /**
     * <p>The log entries of the artifact build task.</p>
     */
    @NameInMap("BuildTaskLogs")
    public java.util.List<ListArtifactBuildTaskLogResponseBodyBuildTaskLogs> buildTaskLogs;

    /**
     * <p>The response code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the API call is successful.</p>
     * <br>
     * <p>*   `true`: successful</p>
     * <p>*   `false`: failed</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of log entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListArtifactBuildTaskLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactBuildTaskLogResponseBody self = new ListArtifactBuildTaskLogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListArtifactBuildTaskLogResponseBody setBuildTaskLogs(java.util.List<ListArtifactBuildTaskLogResponseBodyBuildTaskLogs> buildTaskLogs) {
        this.buildTaskLogs = buildTaskLogs;
        return this;
    }
    public java.util.List<ListArtifactBuildTaskLogResponseBodyBuildTaskLogs> getBuildTaskLogs() {
        return this.buildTaskLogs;
    }

    public ListArtifactBuildTaskLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListArtifactBuildTaskLogResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListArtifactBuildTaskLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListArtifactBuildTaskLogResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListArtifactBuildTaskLogResponseBodyBuildTaskLogs extends TeaModel {
        /**
         * <p>The row number of the log entry.</p>
         */
        @NameInMap("LineNumber")
        public Integer lineNumber;

        /**
         * <p>The content of the log entry.</p>
         */
        @NameInMap("Message")
        public String message;

        public static ListArtifactBuildTaskLogResponseBodyBuildTaskLogs build(java.util.Map<String, ?> map) throws Exception {
            ListArtifactBuildTaskLogResponseBodyBuildTaskLogs self = new ListArtifactBuildTaskLogResponseBodyBuildTaskLogs();
            return TeaModel.build(map, self);
        }

        public ListArtifactBuildTaskLogResponseBodyBuildTaskLogs setLineNumber(Integer lineNumber) {
            this.lineNumber = lineNumber;
            return this;
        }
        public Integer getLineNumber() {
            return this.lineNumber;
        }

        public ListArtifactBuildTaskLogResponseBodyBuildTaskLogs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
