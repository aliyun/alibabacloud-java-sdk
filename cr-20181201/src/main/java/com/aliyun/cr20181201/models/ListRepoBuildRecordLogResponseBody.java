// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoBuildRecordLogResponseBody extends TeaModel {
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("BuildRecordLogs")
    public java.util.List<ListRepoBuildRecordLogResponseBodyBuildRecordLogs> buildRecordLogs;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("Code")
    public String code;

    public static ListRepoBuildRecordLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepoBuildRecordLogResponseBody self = new ListRepoBuildRecordLogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepoBuildRecordLogResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListRepoBuildRecordLogResponseBody setBuildRecordLogs(java.util.List<ListRepoBuildRecordLogResponseBodyBuildRecordLogs> buildRecordLogs) {
        this.buildRecordLogs = buildRecordLogs;
        return this;
    }
    public java.util.List<ListRepoBuildRecordLogResponseBodyBuildRecordLogs> getBuildRecordLogs() {
        return this.buildRecordLogs;
    }

    public ListRepoBuildRecordLogResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListRepoBuildRecordLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepoBuildRecordLogResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRepoBuildRecordLogResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListRepoBuildRecordLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListRepoBuildRecordLogResponseBodyBuildRecordLogs extends TeaModel {
        @NameInMap("LineNumber")
        public Integer lineNumber;

        @NameInMap("Message")
        public String message;

        @NameInMap("BuildStage")
        public String buildStage;

        public static ListRepoBuildRecordLogResponseBodyBuildRecordLogs build(java.util.Map<String, ?> map) throws Exception {
            ListRepoBuildRecordLogResponseBodyBuildRecordLogs self = new ListRepoBuildRecordLogResponseBodyBuildRecordLogs();
            return TeaModel.build(map, self);
        }

        public ListRepoBuildRecordLogResponseBodyBuildRecordLogs setLineNumber(Integer lineNumber) {
            this.lineNumber = lineNumber;
            return this;
        }
        public Integer getLineNumber() {
            return this.lineNumber;
        }

        public ListRepoBuildRecordLogResponseBodyBuildRecordLogs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListRepoBuildRecordLogResponseBodyBuildRecordLogs setBuildStage(String buildStage) {
            this.buildStage = buildStage;
            return this;
        }
        public String getBuildStage() {
            return this.buildStage;
        }

    }

}
