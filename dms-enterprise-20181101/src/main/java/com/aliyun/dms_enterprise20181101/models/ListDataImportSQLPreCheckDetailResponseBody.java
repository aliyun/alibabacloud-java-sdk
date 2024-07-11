// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataImportSQLPreCheckDetailResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The precheck information of SQL statements.</p>
     */
    @NameInMap("PreCheckSQLDetailList")
    public java.util.List<ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList> preCheckSQLDetailList;

    /**
     * <p>The request ID. You can use the ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>31853A2B-DC9D-5B39-8492-D2AC8BCF550E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The number of SQL statements.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDataImportSQLPreCheckDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataImportSQLPreCheckDetailResponseBody self = new ListDataImportSQLPreCheckDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataImportSQLPreCheckDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataImportSQLPreCheckDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataImportSQLPreCheckDetailResponseBody setPreCheckSQLDetailList(java.util.List<ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList> preCheckSQLDetailList) {
        this.preCheckSQLDetailList = preCheckSQLDetailList;
        return this;
    }
    public java.util.List<ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList> getPreCheckSQLDetailList() {
        return this.preCheckSQLDetailList;
    }

    public ListDataImportSQLPreCheckDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataImportSQLPreCheckDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataImportSQLPreCheckDetailResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList extends TeaModel {
        /**
         * <p>Indicates whether the precheck of the SQL statement was skipped. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Skip")
        public Boolean skip;

        /**
         * <p>The SQL ID, which indicates the sequence number of the SQL statement. The number starts with 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SqlId")
        public Long sqlId;

        /**
         * <p>The type of the SQL statement, such as DELETE, UPDATE, or ALTER_TABLE.</p>
         * 
         * <strong>example:</strong>
         * <p>INSERT</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>The state of the ticket. Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: The ticket was being initialized.</li>
         * <li><strong>RUNNING</strong>: The ticket was in progress.</li>
         * <li><strong>SUCCESS</strong>: The ticket was complete.</li>
         * <li><strong>TIMEOUT</strong>: The ticket was skipped due to timeout.</li>
         * <li><strong>FAIL</strong>: The ticket failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        public static ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList self = new ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList();
            return TeaModel.build(map, self);
        }

        public ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList setSkip(Boolean skip) {
            this.skip = skip;
            return this;
        }
        public Boolean getSkip() {
            return this.skip;
        }

        public ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList setSqlId(Long sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public Long getSqlId() {
            return this.sqlId;
        }

        public ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

    }

}
