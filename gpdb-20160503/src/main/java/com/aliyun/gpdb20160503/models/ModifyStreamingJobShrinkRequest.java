// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyStreamingJobShrinkRequest extends TeaModel {
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
    public String destColumnsShrink;

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
    public String matchColumnsShrink;

    @NameInMap("Password")
    public String password;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SrcColumns")
    public String srcColumnsShrink;

    @NameInMap("TryRun")
    public Boolean tryRun;

    @NameInMap("UpdateColumns")
    public String updateColumnsShrink;

    @NameInMap("WriteMode")
    public String writeMode;

    public static ModifyStreamingJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStreamingJobShrinkRequest self = new ModifyStreamingJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyStreamingJobShrinkRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ModifyStreamingJobShrinkRequest setConsistency(String consistency) {
        this.consistency = consistency;
        return this;
    }
    public String getConsistency() {
        return this.consistency;
    }

    public ModifyStreamingJobShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyStreamingJobShrinkRequest setDestColumnsShrink(String destColumnsShrink) {
        this.destColumnsShrink = destColumnsShrink;
        return this;
    }
    public String getDestColumnsShrink() {
        return this.destColumnsShrink;
    }

    public ModifyStreamingJobShrinkRequest setDestDatabase(String destDatabase) {
        this.destDatabase = destDatabase;
        return this;
    }
    public String getDestDatabase() {
        return this.destDatabase;
    }

    public ModifyStreamingJobShrinkRequest setDestSchema(String destSchema) {
        this.destSchema = destSchema;
        return this;
    }
    public String getDestSchema() {
        return this.destSchema;
    }

    public ModifyStreamingJobShrinkRequest setDestTable(String destTable) {
        this.destTable = destTable;
        return this;
    }
    public String getDestTable() {
        return this.destTable;
    }

    public ModifyStreamingJobShrinkRequest setErrorLimitCount(Long errorLimitCount) {
        this.errorLimitCount = errorLimitCount;
        return this;
    }
    public Long getErrorLimitCount() {
        return this.errorLimitCount;
    }

    public ModifyStreamingJobShrinkRequest setFallbackOffset(String fallbackOffset) {
        this.fallbackOffset = fallbackOffset;
        return this;
    }
    public String getFallbackOffset() {
        return this.fallbackOffset;
    }

    public ModifyStreamingJobShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyStreamingJobShrinkRequest setJobConfig(String jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }
    public String getJobConfig() {
        return this.jobConfig;
    }

    public ModifyStreamingJobShrinkRequest setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
        return this;
    }
    public String getJobDescription() {
        return this.jobDescription;
    }

    public ModifyStreamingJobShrinkRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public ModifyStreamingJobShrinkRequest setMatchColumnsShrink(String matchColumnsShrink) {
        this.matchColumnsShrink = matchColumnsShrink;
        return this;
    }
    public String getMatchColumnsShrink() {
        return this.matchColumnsShrink;
    }

    public ModifyStreamingJobShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyStreamingJobShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyStreamingJobShrinkRequest setSrcColumnsShrink(String srcColumnsShrink) {
        this.srcColumnsShrink = srcColumnsShrink;
        return this;
    }
    public String getSrcColumnsShrink() {
        return this.srcColumnsShrink;
    }

    public ModifyStreamingJobShrinkRequest setTryRun(Boolean tryRun) {
        this.tryRun = tryRun;
        return this;
    }
    public Boolean getTryRun() {
        return this.tryRun;
    }

    public ModifyStreamingJobShrinkRequest setUpdateColumnsShrink(String updateColumnsShrink) {
        this.updateColumnsShrink = updateColumnsShrink;
        return this;
    }
    public String getUpdateColumnsShrink() {
        return this.updateColumnsShrink;
    }

    public ModifyStreamingJobShrinkRequest setWriteMode(String writeMode) {
        this.writeMode = writeMode;
        return this;
    }
    public String getWriteMode() {
        return this.writeMode;
    }

}
