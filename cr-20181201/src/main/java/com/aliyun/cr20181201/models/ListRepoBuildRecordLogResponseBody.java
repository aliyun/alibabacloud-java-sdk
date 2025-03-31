// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoBuildRecordLogResponseBody extends TeaModel {
    /**
     * <p>The log content of the image building record.</p>
     */
    @NameInMap("BuildRecordLogs")
    public java.util.List<ListRepoBuildRecordLogResponseBodyBuildRecordLogs> buildRecordLogs;

    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4CE1F661-75DD-4EBD-A4AD-057B26834ABB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListRepoBuildRecordLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepoBuildRecordLogResponseBody self = new ListRepoBuildRecordLogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepoBuildRecordLogResponseBody setBuildRecordLogs(java.util.List<ListRepoBuildRecordLogResponseBodyBuildRecordLogs> buildRecordLogs) {
        this.buildRecordLogs = buildRecordLogs;
        return this;
    }
    public java.util.List<ListRepoBuildRecordLogResponseBodyBuildRecordLogs> getBuildRecordLogs() {
        return this.buildRecordLogs;
    }

    public ListRepoBuildRecordLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRepoBuildRecordLogResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListRepoBuildRecordLogResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListRepoBuildRecordLogResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRepoBuildRecordLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepoBuildRecordLogResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListRepoBuildRecordLogResponseBodyBuildRecordLogs extends TeaModel {
        /**
         * <p>The stage of the building that is recorded in the log entry.</p>
         * 
         * <strong>example:</strong>
         * <p>GIT_CLONE</p>
         */
        @NameInMap("BuildStage")
        public String buildStage;

        /**
         * <p>The line number of the log entry.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LineNumber")
        public Integer lineNumber;

        /**
         * <p>The content of the log.</p>
         * 
         * <strong>example:</strong>
         * <p>fetch stage begin</p>
         */
        @NameInMap("Message")
        public String message;

        public static ListRepoBuildRecordLogResponseBodyBuildRecordLogs build(java.util.Map<String, ?> map) throws Exception {
            ListRepoBuildRecordLogResponseBodyBuildRecordLogs self = new ListRepoBuildRecordLogResponseBodyBuildRecordLogs();
            return TeaModel.build(map, self);
        }

        public ListRepoBuildRecordLogResponseBodyBuildRecordLogs setBuildStage(String buildStage) {
            this.buildStage = buildStage;
            return this;
        }
        public String getBuildStage() {
            return this.buildStage;
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

    }

}
