// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListArtifactBuildTaskLogResponseBody extends TeaModel {
    @NameInMap("BuildTaskLogs")
    public java.util.List<ListArtifactBuildTaskLogResponseBodyBuildTaskLogs> buildTaskLogs;

    @NameInMap("Code")
    public String code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("LineNumber")
        public Integer lineNumber;

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
