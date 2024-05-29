// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDataCheckTableDetailsResponseBody extends TeaModel {
    /**
     * <p>The number of tables that contain inconsistent data.</p>
     */
    @NameInMap("DiffTableCount")
    public Long diffTableCount;

    /**
     * <p>The dynamic error code. This parameter will be discontinued in the future.</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the \\*\\*%s\\*\\* variable in the **ErrMessage** parameter.</p>
     * <br>
     * <p>> For example, if the returned value of the **ErrMessage** parameter is **The Value of Input Parameter %s is not valid** and the return value of the **DynamicMessage** parameter is **Type**, the specified **Type** parameter is invalid.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The total number of data rows that were verified.</p>
     */
    @NameInMap("FinishedCount")
    public Long finishedCount;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The details of the data verification result.</p>
     */
    @NameInMap("TableDetails")
    public java.util.List<DescribeDataCheckTableDetailsResponseBodyTableDetails> tableDetails;

    /**
     * <p>The total number of tables on which data verification was performed.</p>
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
         * <p>The time when data verification was performed.</p>
         */
        @NameInMap("BootTime")
        public String bootTime;

        /**
         * <p>The number of data rows that contain inconsistent data.</p>
         */
        @NameInMap("DiffCount")
        public Long diffCount;

        /**
         * <p>任务运行出错时，返回报错信息的错误编码。</p>
         * <br>
         * <p>- **1**：无主键表数量超过限制。</p>
         * <p>- **2**：差异数据超过300行。</p>
         * <p>- **3**：待查询的表不存在。</p>
         * <p>- **4**：查询数据的SQL语法错误。</p>
         */
        @NameInMap("ErrorCode")
        public Integer errorCode;

        /**
         * <p>The number of data rows that were verified.</p>
         */
        @NameInMap("FinishCount")
        public Long finishCount;

        /**
         * <p>The auto-increment primary key that is used to identify a data record in a verification result.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the source database.</p>
         */
        @NameInMap("SourceDbName")
        public String sourceDbName;

        /**
         * <p>The name of the source table.</p>
         */
        @NameInMap("SourceTbName")
        public String sourceTbName;

        /**
         * <p>The status of the data verification result. Valid values:</p>
         * <br>
         * <p>*   **0**: The data verification task was complete.</p>
         * <p>*   **2**: The data verification task was initialized.</p>
         * <p>*   **3**: The data verification task was running.</p>
         * <p>*   **5**: The data verification task failed.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the destination database.</p>
         */
        @NameInMap("TargetDbName")
        public String targetDbName;

        /**
         * <p>The name of the destination table.</p>
         */
        @NameInMap("TargetTbName")
        public String targetTbName;

        /**
         * <p>The total number of data rows.</p>
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
