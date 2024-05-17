// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListStreamingJobsResponseBody extends TeaModel {
    @NameInMap("JobItems")
    public java.util.List<ListStreamingJobsResponseBodyJobItems> jobItems;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static ListStreamingJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStreamingJobsResponseBody self = new ListStreamingJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStreamingJobsResponseBody setJobItems(java.util.List<ListStreamingJobsResponseBodyJobItems> jobItems) {
        this.jobItems = jobItems;
        return this;
    }
    public java.util.List<ListStreamingJobsResponseBodyJobItems> getJobItems() {
        return this.jobItems;
    }

    public ListStreamingJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStreamingJobsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public ListStreamingJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStreamingJobsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListStreamingJobsResponseBodyJobItems extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("Consistency")
        public String consistency;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("DataSourceName")
        public String dataSourceName;

        @NameInMap("DestColumns")
        public java.util.List<String> destColumns;

        @NameInMap("DestDatabase")
        public String destDatabase;

        @NameInMap("DestSchema")
        public String destSchema;

        @NameInMap("DestTable")
        public String destTable;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("FallbackOffset")
        public String fallbackOffset;

        @NameInMap("JobDescription")
        public String jobDescription;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("MatchColumns")
        public java.util.List<String> matchColumns;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("Password")
        public String password;

        @NameInMap("SrcColumns")
        public java.util.List<String> srcColumns;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateColumns")
        public java.util.List<String> updateColumns;

        @NameInMap("WriteMode")
        public String writeMode;

        public static ListStreamingJobsResponseBodyJobItems build(java.util.Map<String, ?> map) throws Exception {
            ListStreamingJobsResponseBodyJobItems self = new ListStreamingJobsResponseBodyJobItems();
            return TeaModel.build(map, self);
        }

        public ListStreamingJobsResponseBodyJobItems setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ListStreamingJobsResponseBodyJobItems setConsistency(String consistency) {
            this.consistency = consistency;
            return this;
        }
        public String getConsistency() {
            return this.consistency;
        }

        public ListStreamingJobsResponseBodyJobItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListStreamingJobsResponseBodyJobItems setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListStreamingJobsResponseBodyJobItems setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public ListStreamingJobsResponseBodyJobItems setDestColumns(java.util.List<String> destColumns) {
            this.destColumns = destColumns;
            return this;
        }
        public java.util.List<String> getDestColumns() {
            return this.destColumns;
        }

        public ListStreamingJobsResponseBodyJobItems setDestDatabase(String destDatabase) {
            this.destDatabase = destDatabase;
            return this;
        }
        public String getDestDatabase() {
            return this.destDatabase;
        }

        public ListStreamingJobsResponseBodyJobItems setDestSchema(String destSchema) {
            this.destSchema = destSchema;
            return this;
        }
        public String getDestSchema() {
            return this.destSchema;
        }

        public ListStreamingJobsResponseBodyJobItems setDestTable(String destTable) {
            this.destTable = destTable;
            return this;
        }
        public String getDestTable() {
            return this.destTable;
        }

        public ListStreamingJobsResponseBodyJobItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListStreamingJobsResponseBodyJobItems setFallbackOffset(String fallbackOffset) {
            this.fallbackOffset = fallbackOffset;
            return this;
        }
        public String getFallbackOffset() {
            return this.fallbackOffset;
        }

        public ListStreamingJobsResponseBodyJobItems setJobDescription(String jobDescription) {
            this.jobDescription = jobDescription;
            return this;
        }
        public String getJobDescription() {
            return this.jobDescription;
        }

        public ListStreamingJobsResponseBodyJobItems setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListStreamingJobsResponseBodyJobItems setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListStreamingJobsResponseBodyJobItems setMatchColumns(java.util.List<String> matchColumns) {
            this.matchColumns = matchColumns;
            return this;
        }
        public java.util.List<String> getMatchColumns() {
            return this.matchColumns;
        }

        public ListStreamingJobsResponseBodyJobItems setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListStreamingJobsResponseBodyJobItems setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListStreamingJobsResponseBodyJobItems setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ListStreamingJobsResponseBodyJobItems setSrcColumns(java.util.List<String> srcColumns) {
            this.srcColumns = srcColumns;
            return this;
        }
        public java.util.List<String> getSrcColumns() {
            return this.srcColumns;
        }

        public ListStreamingJobsResponseBodyJobItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStreamingJobsResponseBodyJobItems setUpdateColumns(java.util.List<String> updateColumns) {
            this.updateColumns = updateColumns;
            return this;
        }
        public java.util.List<String> getUpdateColumns() {
            return this.updateColumns;
        }

        public ListStreamingJobsResponseBodyJobItems setWriteMode(String writeMode) {
            this.writeMode = writeMode;
            return this;
        }
        public String getWriteMode() {
            return this.writeMode;
        }

    }

}
