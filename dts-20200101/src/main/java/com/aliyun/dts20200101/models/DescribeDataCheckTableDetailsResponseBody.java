// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDataCheckTableDetailsResponseBody extends TeaModel {
    @NameInMap("DiffRowCount")
    public Long diffRowCount;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("FailedCount")
    public Long failedCount;

    @NameInMap("FinishedCount")
    public Long finishedCount;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("InitCount")
    public Long initCount;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RunningCount")
    public Long runningCount;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TableDetails")
    public java.util.List<DescribeDataCheckTableDetailsResponseBodyTableDetails> tableDetails;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("WarningCount")
    public Long warningCount;

    public static DescribeDataCheckTableDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCheckTableDetailsResponseBody self = new DescribeDataCheckTableDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataCheckTableDetailsResponseBody setDiffRowCount(Long diffRowCount) {
        this.diffRowCount = diffRowCount;
        return this;
    }
    public Long getDiffRowCount() {
        return this.diffRowCount;
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

    public DescribeDataCheckTableDetailsResponseBody setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Long getFailedCount() {
        return this.failedCount;
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

    public DescribeDataCheckTableDetailsResponseBody setInitCount(Long initCount) {
        this.initCount = initCount;
        return this;
    }
    public Long getInitCount() {
        return this.initCount;
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

    public DescribeDataCheckTableDetailsResponseBody setRunningCount(Long runningCount) {
        this.runningCount = runningCount;
        return this;
    }
    public Long getRunningCount() {
        return this.runningCount;
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

    public DescribeDataCheckTableDetailsResponseBody setWarningCount(Long warningCount) {
        this.warningCount = warningCount;
        return this;
    }
    public Long getWarningCount() {
        return this.warningCount;
    }

    public static class DescribeDataCheckTableDetailsResponseBodyTableDetails extends TeaModel {
        @NameInMap("BootTime")
        public String bootTime;

        @NameInMap("DiffCount")
        public Long diffCount;

        @NameInMap("FinishCount")
        public Long finishCount;

        @NameInMap("Id")
        public Long id;

        @NameInMap("SourceDbName")
        public String sourceDbName;

        @NameInMap("SourceTbName")
        public String sourceTbName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TargetDbName")
        public String targetDbName;

        @NameInMap("TargetTbName")
        public String targetTbName;

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
