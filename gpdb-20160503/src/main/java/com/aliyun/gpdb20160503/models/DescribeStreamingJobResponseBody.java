// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeStreamingJobResponseBody extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("Consistency")
    public String consistency;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     */
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

    @NameInMap("ErrorLimitCount")
    public Integer errorLimitCount;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("FallbackOffset")
    public String fallbackOffset;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("JobConfig")
    public String jobConfig;

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

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("Password")
    public String password;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SrcColumns")
    public java.util.List<String> srcColumns;

    @NameInMap("Status")
    public String status;

    @NameInMap("UpdateColumns")
    public java.util.List<String> updateColumns;

    @NameInMap("WriteMode")
    public String writeMode;

    public static DescribeStreamingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamingJobResponseBody self = new DescribeStreamingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStreamingJobResponseBody setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public DescribeStreamingJobResponseBody setConsistency(String consistency) {
        this.consistency = consistency;
        return this;
    }
    public String getConsistency() {
        return this.consistency;
    }

    public DescribeStreamingJobResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeStreamingJobResponseBody setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public DescribeStreamingJobResponseBody setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public DescribeStreamingJobResponseBody setDestColumns(java.util.List<String> destColumns) {
        this.destColumns = destColumns;
        return this;
    }
    public java.util.List<String> getDestColumns() {
        return this.destColumns;
    }

    public DescribeStreamingJobResponseBody setDestDatabase(String destDatabase) {
        this.destDatabase = destDatabase;
        return this;
    }
    public String getDestDatabase() {
        return this.destDatabase;
    }

    public DescribeStreamingJobResponseBody setDestSchema(String destSchema) {
        this.destSchema = destSchema;
        return this;
    }
    public String getDestSchema() {
        return this.destSchema;
    }

    public DescribeStreamingJobResponseBody setDestTable(String destTable) {
        this.destTable = destTable;
        return this;
    }
    public String getDestTable() {
        return this.destTable;
    }

    public DescribeStreamingJobResponseBody setErrorLimitCount(Integer errorLimitCount) {
        this.errorLimitCount = errorLimitCount;
        return this;
    }
    public Integer getErrorLimitCount() {
        return this.errorLimitCount;
    }

    public DescribeStreamingJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeStreamingJobResponseBody setFallbackOffset(String fallbackOffset) {
        this.fallbackOffset = fallbackOffset;
        return this;
    }
    public String getFallbackOffset() {
        return this.fallbackOffset;
    }

    public DescribeStreamingJobResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeStreamingJobResponseBody setJobConfig(String jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }
    public String getJobConfig() {
        return this.jobConfig;
    }

    public DescribeStreamingJobResponseBody setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
        return this;
    }
    public String getJobDescription() {
        return this.jobDescription;
    }

    public DescribeStreamingJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeStreamingJobResponseBody setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public DescribeStreamingJobResponseBody setMatchColumns(java.util.List<String> matchColumns) {
        this.matchColumns = matchColumns;
        return this;
    }
    public java.util.List<String> getMatchColumns() {
        return this.matchColumns;
    }

    public DescribeStreamingJobResponseBody setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public DescribeStreamingJobResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DescribeStreamingJobResponseBody setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public DescribeStreamingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStreamingJobResponseBody setSrcColumns(java.util.List<String> srcColumns) {
        this.srcColumns = srcColumns;
        return this;
    }
    public java.util.List<String> getSrcColumns() {
        return this.srcColumns;
    }

    public DescribeStreamingJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeStreamingJobResponseBody setUpdateColumns(java.util.List<String> updateColumns) {
        this.updateColumns = updateColumns;
        return this;
    }
    public java.util.List<String> getUpdateColumns() {
        return this.updateColumns;
    }

    public DescribeStreamingJobResponseBody setWriteMode(String writeMode) {
        this.writeMode = writeMode;
        return this;
    }
    public String getWriteMode() {
        return this.writeMode;
    }

}
