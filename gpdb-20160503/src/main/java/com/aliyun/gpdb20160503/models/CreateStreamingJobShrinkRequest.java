// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateStreamingJobShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test-account</p>
     */
    @NameInMap("Account")
    public String account;

    /**
     * <strong>example:</strong>
     * <p>ATLEAST / EXACTLY</p>
     */
    @NameInMap("Consistency")
    public String consistency;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp10g78o9807yv9h3</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("DestColumns")
    public String destColumnsShrink;

    /**
     * <strong>example:</strong>
     * <p>dest-db</p>
     */
    @NameInMap("DestDatabase")
    public String destDatabase;

    @NameInMap("DestSchema")
    public String destSchema;

    /**
     * <strong>example:</strong>
     * <p>dest-table</p>
     */
    @NameInMap("DestTable")
    public String destTable;

    @NameInMap("ErrorLimitCount")
    public Long errorLimitCount;

    /**
     * <strong>example:</strong>
     * <p>earliest /  latest</p>
     */
    @NameInMap("FallbackOffset")
    public String fallbackOffset;

    /**
     * <strong>example:</strong>
     * <p>group_name。</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("JobConfig")
    public String jobConfig;

    /**
     * <strong>example:</strong>
     * <p>test-job</p>
     */
    @NameInMap("JobDescription")
    public String jobDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-job</p>
     */
    @NameInMap("JobName")
    public String jobName;

    @NameInMap("MatchColumns")
    public String matchColumnsShrink;

    /**
     * <strong>example:</strong>
     * <p>basic / professional</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <strong>example:</strong>
     * <p>pwd123</p>
     */
    @NameInMap("Password")
    public String password;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SrcColumns")
    public String srcColumnsShrink;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TryRun")
    public Boolean tryRun;

    @NameInMap("UpdateColumns")
    public String updateColumnsShrink;

    /**
     * <strong>example:</strong>
     * <p>insert/update/merge</p>
     */
    @NameInMap("WriteMode")
    public String writeMode;

    public static CreateStreamingJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamingJobShrinkRequest self = new CreateStreamingJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateStreamingJobShrinkRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public CreateStreamingJobShrinkRequest setConsistency(String consistency) {
        this.consistency = consistency;
        return this;
    }
    public String getConsistency() {
        return this.consistency;
    }

    public CreateStreamingJobShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateStreamingJobShrinkRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateStreamingJobShrinkRequest setDestColumnsShrink(String destColumnsShrink) {
        this.destColumnsShrink = destColumnsShrink;
        return this;
    }
    public String getDestColumnsShrink() {
        return this.destColumnsShrink;
    }

    public CreateStreamingJobShrinkRequest setDestDatabase(String destDatabase) {
        this.destDatabase = destDatabase;
        return this;
    }
    public String getDestDatabase() {
        return this.destDatabase;
    }

    public CreateStreamingJobShrinkRequest setDestSchema(String destSchema) {
        this.destSchema = destSchema;
        return this;
    }
    public String getDestSchema() {
        return this.destSchema;
    }

    public CreateStreamingJobShrinkRequest setDestTable(String destTable) {
        this.destTable = destTable;
        return this;
    }
    public String getDestTable() {
        return this.destTable;
    }

    public CreateStreamingJobShrinkRequest setErrorLimitCount(Long errorLimitCount) {
        this.errorLimitCount = errorLimitCount;
        return this;
    }
    public Long getErrorLimitCount() {
        return this.errorLimitCount;
    }

    public CreateStreamingJobShrinkRequest setFallbackOffset(String fallbackOffset) {
        this.fallbackOffset = fallbackOffset;
        return this;
    }
    public String getFallbackOffset() {
        return this.fallbackOffset;
    }

    public CreateStreamingJobShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateStreamingJobShrinkRequest setJobConfig(String jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }
    public String getJobConfig() {
        return this.jobConfig;
    }

    public CreateStreamingJobShrinkRequest setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
        return this;
    }
    public String getJobDescription() {
        return this.jobDescription;
    }

    public CreateStreamingJobShrinkRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateStreamingJobShrinkRequest setMatchColumnsShrink(String matchColumnsShrink) {
        this.matchColumnsShrink = matchColumnsShrink;
        return this;
    }
    public String getMatchColumnsShrink() {
        return this.matchColumnsShrink;
    }

    public CreateStreamingJobShrinkRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateStreamingJobShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateStreamingJobShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateStreamingJobShrinkRequest setSrcColumnsShrink(String srcColumnsShrink) {
        this.srcColumnsShrink = srcColumnsShrink;
        return this;
    }
    public String getSrcColumnsShrink() {
        return this.srcColumnsShrink;
    }

    public CreateStreamingJobShrinkRequest setTryRun(Boolean tryRun) {
        this.tryRun = tryRun;
        return this;
    }
    public Boolean getTryRun() {
        return this.tryRun;
    }

    public CreateStreamingJobShrinkRequest setUpdateColumnsShrink(String updateColumnsShrink) {
        this.updateColumnsShrink = updateColumnsShrink;
        return this;
    }
    public String getUpdateColumnsShrink() {
        return this.updateColumnsShrink;
    }

    public CreateStreamingJobShrinkRequest setWriteMode(String writeMode) {
        this.writeMode = writeMode;
        return this;
    }
    public String getWriteMode() {
        return this.writeMode;
    }

}
