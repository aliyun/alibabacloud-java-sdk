// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyStreamingJobRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("Consistency")
    public String consistency;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DestColumns")
    public java.util.List<String> destColumns;

    @NameInMap("DestDatabase")
    public String destDatabase;

    @NameInMap("DestSchema")
    public String destSchema;

    @NameInMap("DestTable")
    public String destTable;

    @NameInMap("ErrorLimitCount")
    public Long errorLimitCount;

    @NameInMap("FallbackOffset")
    public String fallbackOffset;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("JobConfig")
    public String jobConfig;

    @NameInMap("JobDescription")
    public String jobDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("MatchColumns")
    public java.util.List<String> matchColumns;

    @NameInMap("Password")
    public String password;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SrcColumns")
    public java.util.List<String> srcColumns;

    @NameInMap("TryRun")
    public Boolean tryRun;

    @NameInMap("UpdateColumns")
    public java.util.List<String> updateColumns;

    @NameInMap("WriteMode")
    public String writeMode;

    public static ModifyStreamingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStreamingJobRequest self = new ModifyStreamingJobRequest();
        return TeaModel.build(map, self);
    }

    public ModifyStreamingJobRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ModifyStreamingJobRequest setConsistency(String consistency) {
        this.consistency = consistency;
        return this;
    }
    public String getConsistency() {
        return this.consistency;
    }

    public ModifyStreamingJobRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyStreamingJobRequest setDestColumns(java.util.List<String> destColumns) {
        this.destColumns = destColumns;
        return this;
    }
    public java.util.List<String> getDestColumns() {
        return this.destColumns;
    }

    public ModifyStreamingJobRequest setDestDatabase(String destDatabase) {
        this.destDatabase = destDatabase;
        return this;
    }
    public String getDestDatabase() {
        return this.destDatabase;
    }

    public ModifyStreamingJobRequest setDestSchema(String destSchema) {
        this.destSchema = destSchema;
        return this;
    }
    public String getDestSchema() {
        return this.destSchema;
    }

    public ModifyStreamingJobRequest setDestTable(String destTable) {
        this.destTable = destTable;
        return this;
    }
    public String getDestTable() {
        return this.destTable;
    }

    public ModifyStreamingJobRequest setErrorLimitCount(Long errorLimitCount) {
        this.errorLimitCount = errorLimitCount;
        return this;
    }
    public Long getErrorLimitCount() {
        return this.errorLimitCount;
    }

    public ModifyStreamingJobRequest setFallbackOffset(String fallbackOffset) {
        this.fallbackOffset = fallbackOffset;
        return this;
    }
    public String getFallbackOffset() {
        return this.fallbackOffset;
    }

    public ModifyStreamingJobRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyStreamingJobRequest setJobConfig(String jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }
    public String getJobConfig() {
        return this.jobConfig;
    }

    public ModifyStreamingJobRequest setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
        return this;
    }
    public String getJobDescription() {
        return this.jobDescription;
    }

    public ModifyStreamingJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public ModifyStreamingJobRequest setMatchColumns(java.util.List<String> matchColumns) {
        this.matchColumns = matchColumns;
        return this;
    }
    public java.util.List<String> getMatchColumns() {
        return this.matchColumns;
    }

    public ModifyStreamingJobRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyStreamingJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyStreamingJobRequest setSrcColumns(java.util.List<String> srcColumns) {
        this.srcColumns = srcColumns;
        return this;
    }
    public java.util.List<String> getSrcColumns() {
        return this.srcColumns;
    }

    public ModifyStreamingJobRequest setTryRun(Boolean tryRun) {
        this.tryRun = tryRun;
        return this;
    }
    public Boolean getTryRun() {
        return this.tryRun;
    }

    public ModifyStreamingJobRequest setUpdateColumns(java.util.List<String> updateColumns) {
        this.updateColumns = updateColumns;
        return this;
    }
    public java.util.List<String> getUpdateColumns() {
        return this.updateColumns;
    }

    public ModifyStreamingJobRequest setWriteMode(String writeMode) {
        this.writeMode = writeMode;
        return this;
    }
    public String getWriteMode() {
        return this.writeMode;
    }

}
