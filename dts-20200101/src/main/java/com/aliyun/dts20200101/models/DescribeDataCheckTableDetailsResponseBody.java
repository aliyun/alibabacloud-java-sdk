// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDataCheckTableDetailsResponseBody extends TeaModel {
    /**
     * <p>The number of tables with data inconsistency.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DiffTableCount")
    public Long diffTableCount;

    /**
     * <p>The dynamic error code. This parameter will be deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message used to replace the <strong>%s</strong> variable in the <strong>ErrMessage</strong> response parameter.</p>
     * <blockquote>
     * <p>For example, if <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>Type</strong>, the request parameter <strong>Type</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Type</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The Value of Input Parameter %s is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The number of tables that failed the verification.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FailedTableCount")
    public Long failedTableCount;

    /**
     * <p>The total number of rows that have been verified.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("FinishedCount")
    public Long finishedCount;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>621BB4F8-3016-4FAA-8D5A-5D3163CC****</p>
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
    public Boolean success;

    /**
     * <p>The details of the data consistency verification results for tables.</p>
     */
    @NameInMap("TableDetails")
    public java.util.List<DescribeDataCheckTableDetailsResponseBodyTableDetails> tableDetails;

    /**
     * <p>The total number of tables to be verified.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDataCheckTableDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCheckTableDetailsResponseBody self = new DescribeDataCheckTableDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataCheckTableDetailsResponseBody setDiffTableCount(Long diffTableCount) {
        this.diffTableCount = diffTableCount;
        return this;
    }
    public Long getDiffTableCount() {
        return this.diffTableCount;
    }

    public DescribeDataCheckTableDetailsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeDataCheckTableDetailsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeDataCheckTableDetailsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeDataCheckTableDetailsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeDataCheckTableDetailsResponseBody setFailedTableCount(Long failedTableCount) {
        this.failedTableCount = failedTableCount;
        return this;
    }
    public Long getFailedTableCount() {
        return this.failedTableCount;
    }

    public DescribeDataCheckTableDetailsResponseBody setFinishedCount(Long finishedCount) {
        this.finishedCount = finishedCount;
        return this;
    }
    public Long getFinishedCount() {
        return this.finishedCount;
    }

    public DescribeDataCheckTableDetailsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDataCheckTableDetailsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataCheckTableDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataCheckTableDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDataCheckTableDetailsResponseBody setTableDetails(java.util.List<DescribeDataCheckTableDetailsResponseBodyTableDetails> tableDetails) {
        this.tableDetails = tableDetails;
        return this;
    }
    public java.util.List<DescribeDataCheckTableDetailsResponseBodyTableDetails> getTableDetails() {
        return this.tableDetails;
    }

    public DescribeDataCheckTableDetailsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDataCheckTableDetailsResponseBodyTableDetails extends TeaModel {
        /**
         * <p>The time when the verification was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-18 11:26:59</p>
         */
        @NameInMap("BootTime")
        public String bootTime;

        /**
         * <p>The number of rows with data inconsistency.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DiffCount")
        public Long diffCount;

        /**
         * <p>The error code returned when the task fails. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: the number of tables without primary key exceeds the limit.</li>
         * <li><strong>2</strong>: the number of rows with data inconsistency exceeds 300.</li>
         * <li><strong>3</strong>: the table to be queried does not exist.</li>
         * <li><strong>4</strong>: the SQL statement used to query data contains a syntax error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ErrorCode")
        public Integer errorCode;

        /**
         * <p>The number of rows that have been verified in the table.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("FinishCount")
        public Long finishCount;

        /**
         * <p>The auto-increment primary key that identifies a verification result record.</p>
         * 
         * <strong>example:</strong>
         * <p>167401241974****</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the source database.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        @NameInMap("SourceDbName")
        public String sourceDbName;

        /**
         * <p>The name of the source table.</p>
         * 
         * <strong>example:</strong>
         * <p>student</p>
         */
        @NameInMap("SourceTbName")
        public String sourceTbName;

        /**
         * <p>The status of the verification result. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: completed.</li>
         * <li><strong>2</strong>: initializing.</li>
         * <li><strong>3</strong>: running.</li>
         * <li><strong>5</strong>: failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the destination database.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        @NameInMap("TargetDbName")
        public String targetDbName;

        /**
         * <p>The name of the destination table.</p>
         * 
         * <strong>example:</strong>
         * <p>person</p>
         */
        @NameInMap("TargetTbName")
        public String targetTbName;

        /**
         * <p>The total number of rows to be verified.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeDataCheckTableDetailsResponseBodyTableDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataCheckTableDetailsResponseBodyTableDetails self = new DescribeDataCheckTableDetailsResponseBodyTableDetails();
            return TeaModel.build(map, self);
        }

        public DescribeDataCheckTableDetailsResponseBodyTableDetails setBootTime(String bootTime) {
            this.bootTime = bootTime;
            return this;
        }
        public String getBootTime() {
            return this.bootTime;
        }

        public DescribeDataCheckTableDetailsResponseBodyTableDetails setDiffCount(Long diffCount) {
            this.diffCount = diffCount;
            return this;
        }
        public Long getDiffCount() {
            return this.diffCount;
        }

        public DescribeDataCheckTableDetailsResponseBodyTableDetails setErrorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public Integer getErrorCode() {
            return this.errorCode;
        }

        public DescribeDataCheckTableDetailsResponseBodyTableDetails setFinishCount(Long finishCount) {
            this.finishCount = finishCount;
            return this;
        }
        public Long getFinishCount() {
            return this.finishCount;
        }

        public DescribeDataCheckTableDetailsResponseBodyTableDetails setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDataCheckTableDetailsResponseBodyTableDetails setSourceDbName(String sourceDbName) {
            this.sourceDbName = sourceDbName;
            return this;
        }
        public String getSourceDbName() {
            return this.sourceDbName;
        }

        public DescribeDataCheckTableDetailsResponseBodyTableDetails setSourceTbName(String sourceTbName) {
            this.sourceTbName = sourceTbName;
            return this;
        }
        public String getSourceTbName() {
            return this.sourceTbName;
        }

        public DescribeDataCheckTableDetailsResponseBodyTableDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDataCheckTableDetailsResponseBodyTableDetails setTargetDbName(String targetDbName) {
            this.targetDbName = targetDbName;
            return this;
        }
        public String getTargetDbName() {
            return this.targetDbName;
        }

        public DescribeDataCheckTableDetailsResponseBodyTableDetails setTargetTbName(String targetTbName) {
            this.targetTbName = targetTbName;
            return this;
        }
        public String getTargetTbName() {
            return this.targetTbName;
        }

        public DescribeDataCheckTableDetailsResponseBodyTableDetails setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
