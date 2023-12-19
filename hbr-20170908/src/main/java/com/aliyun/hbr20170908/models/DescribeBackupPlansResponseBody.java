// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeBackupPlansResponseBody extends TeaModel {
    /**
     * <p>The returned backup plans that meet the specified conditions.</p>
     */
    @NameInMap("BackupPlans")
    public DescribeBackupPlansResponseBodyBackupPlans backupPlans;

    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page. Valid values: 1 to 99. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   true: The call is successful.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned backup plans that meet the specified conditions.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeBackupPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPlansResponseBody self = new DescribeBackupPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPlansResponseBody setBackupPlans(DescribeBackupPlansResponseBodyBackupPlans backupPlans) {
        this.backupPlans = backupPlans;
        return this;
    }
    public DescribeBackupPlansResponseBodyBackupPlans getBackupPlans() {
        return this.backupPlans;
    }

    public DescribeBackupPlansResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeBackupPlansResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeBackupPlansResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupPlansResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPlansResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBackupPlansResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBackupPlansResponseBodyBackupPlansBackupPlanOtsDetailTableNames extends TeaModel {
        @NameInMap("TableName")
        public java.util.List<String> tableName;

        public static DescribeBackupPlansResponseBodyBackupPlansBackupPlanOtsDetailTableNames build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlansResponseBodyBackupPlansBackupPlanOtsDetailTableNames self = new DescribeBackupPlansResponseBodyBackupPlansBackupPlanOtsDetailTableNames();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanOtsDetailTableNames setTableName(java.util.List<String> tableName) {
            this.tableName = tableName;
            return this;
        }
        public java.util.List<String> getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeBackupPlansResponseBodyBackupPlansBackupPlanOtsDetail extends TeaModel {
        /**
         * <p>The names of the tables in the Tablestore instance.</p>
         */
        @NameInMap("TableNames")
        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanOtsDetailTableNames tableNames;

        public static DescribeBackupPlansResponseBodyBackupPlansBackupPlanOtsDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlansResponseBodyBackupPlansBackupPlanOtsDetail self = new DescribeBackupPlansResponseBodyBackupPlansBackupPlanOtsDetail();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanOtsDetail setTableNames(DescribeBackupPlansResponseBodyBackupPlansBackupPlanOtsDetailTableNames tableNames) {
            this.tableNames = tableNames;
            return this;
        }
        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanOtsDetailTableNames getTableNames() {
            return this.tableNames;
        }

    }

    public static class DescribeBackupPlansResponseBodyBackupPlansBackupPlanPaths extends TeaModel {
        @NameInMap("Path")
        public java.util.List<String> path;

        public static DescribeBackupPlansResponseBodyBackupPlansBackupPlanPaths build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlansResponseBodyBackupPlansBackupPlanPaths self = new DescribeBackupPlansResponseBodyBackupPlansBackupPlanPaths();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanPaths setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }
        public java.util.List<String> getPath() {
            return this.path;
        }

    }

    public static class DescribeBackupPlansResponseBodyBackupPlansBackupPlanResourcesResource extends TeaModel {
        /**
         * <p>Additional information about the data source.</p>
         */
        @NameInMap("Extra")
        public String extra;

        /**
         * <p>The ID of the data source.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the data source. Valid value: **UDM_DISK**.</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static DescribeBackupPlansResponseBodyBackupPlansBackupPlanResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlansResponseBodyBackupPlansBackupPlanResourcesResource self = new DescribeBackupPlansResponseBodyBackupPlansBackupPlanResourcesResource();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanResourcesResource setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanResourcesResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanResourcesResource setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class DescribeBackupPlansResponseBodyBackupPlansBackupPlanResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<DescribeBackupPlansResponseBodyBackupPlansBackupPlanResourcesResource> resource;

        public static DescribeBackupPlansResponseBodyBackupPlansBackupPlanResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlansResponseBodyBackupPlansBackupPlanResources self = new DescribeBackupPlansResponseBodyBackupPlansBackupPlanResources();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanResources setResource(java.util.List<DescribeBackupPlansResponseBodyBackupPlansBackupPlanResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeBackupPlansResponseBodyBackupPlansBackupPlanResourcesResource> getResource() {
            return this.resource;
        }

    }

    public static class DescribeBackupPlansResponseBodyBackupPlansBackupPlanRulesRule extends TeaModel {
        /**
         * <p>The backup type. Valid value: **COMPLETE**, which indicates full backup.</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The ID of the region where the remote backup vault resides.</p>
         */
        @NameInMap("DestinationRegionId")
        public String destinationRegionId;

        /**
         * <p>The retention period of the backup data. Unit: days.</p>
         */
        @NameInMap("DestinationRetention")
        public Long destinationRetention;

        /**
         * <p>Indicates whether the policy is disabled.</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>Indicates whether the snapshot data is backed up to the backup vault.</p>
         */
        @NameInMap("DoCopy")
        public Boolean doCopy;

        /**
         * <p>The retention period of the backup data. Unit: days.</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>The ID of the policy.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the policy.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The backup policy. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified in the `{startTime}` parameter and the subsequent backup jobs at an interval that is specified in the `{interval}` parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, `I|1631685600|P1D` indicates that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
         * <br>
         * <p>*   `startTime`: the time at which the system starts to run a backup job. The time follows the UNIX time format. Unit: seconds.</p>
         * <p>*   `interval`: the interval at which the system runs a backup job. The interval follows the ISO 8601 standard. For example, PT1H indicates an interval of one hour. P1D indicates an interval of one day.</p>
         */
        @NameInMap("Schedule")
        public String schedule;

        public static DescribeBackupPlansResponseBodyBackupPlansBackupPlanRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlansResponseBodyBackupPlansBackupPlanRulesRule self = new DescribeBackupPlansResponseBodyBackupPlansBackupPlanRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanRulesRule setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanRulesRule setDestinationRegionId(String destinationRegionId) {
            this.destinationRegionId = destinationRegionId;
            return this;
        }
        public String getDestinationRegionId() {
            return this.destinationRegionId;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanRulesRule setDestinationRetention(Long destinationRetention) {
            this.destinationRetention = destinationRetention;
            return this;
        }
        public Long getDestinationRetention() {
            return this.destinationRetention;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanRulesRule setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanRulesRule setDoCopy(Boolean doCopy) {
            this.doCopy = doCopy;
            return this;
        }
        public Boolean getDoCopy() {
            return this.doCopy;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanRulesRule setRetention(Long retention) {
            this.retention = retention;
            return this;
        }
        public Long getRetention() {
            return this.retention;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanRulesRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanRulesRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanRulesRule setSchedule(String schedule) {
            this.schedule = schedule;
            return this;
        }
        public String getSchedule() {
            return this.schedule;
        }

    }

    public static class DescribeBackupPlansResponseBodyBackupPlansBackupPlanRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribeBackupPlansResponseBodyBackupPlansBackupPlanRulesRule> rule;

        public static DescribeBackupPlansResponseBodyBackupPlansBackupPlanRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlansResponseBodyBackupPlansBackupPlanRules self = new DescribeBackupPlansResponseBodyBackupPlansBackupPlanRules();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanRules setRule(java.util.List<DescribeBackupPlansResponseBodyBackupPlansBackupPlanRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeBackupPlansResponseBodyBackupPlansBackupPlanRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribeBackupPlansResponseBodyBackupPlansBackupPlanTrialInfo extends TeaModel {
        /**
         * <p>Indicates whether you are billed based on the pay-as-you-go method after the free trial ends.</p>
         */
        @NameInMap("KeepAfterTrialExpiration")
        public Boolean keepAfterTrialExpiration;

        /**
         * <p>The expiration time of the free trial.</p>
         */
        @NameInMap("TrialExpireTime")
        public Long trialExpireTime;

        /**
         * <p>The start time of the free trial.</p>
         */
        @NameInMap("TrialStartTime")
        public Long trialStartTime;

        /**
         * <p>The time when the free-trial backup vault is released.</p>
         */
        @NameInMap("TrialVaultReleaseTime")
        public Long trialVaultReleaseTime;

        public static DescribeBackupPlansResponseBodyBackupPlansBackupPlanTrialInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlansResponseBodyBackupPlansBackupPlanTrialInfo self = new DescribeBackupPlansResponseBodyBackupPlansBackupPlanTrialInfo();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanTrialInfo setKeepAfterTrialExpiration(Boolean keepAfterTrialExpiration) {
            this.keepAfterTrialExpiration = keepAfterTrialExpiration;
            return this;
        }
        public Boolean getKeepAfterTrialExpiration() {
            return this.keepAfterTrialExpiration;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanTrialInfo setTrialExpireTime(Long trialExpireTime) {
            this.trialExpireTime = trialExpireTime;
            return this;
        }
        public Long getTrialExpireTime() {
            return this.trialExpireTime;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanTrialInfo setTrialStartTime(Long trialStartTime) {
            this.trialStartTime = trialStartTime;
            return this;
        }
        public Long getTrialStartTime() {
            return this.trialStartTime;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanTrialInfo setTrialVaultReleaseTime(Long trialVaultReleaseTime) {
            this.trialVaultReleaseTime = trialVaultReleaseTime;
            return this;
        }
        public Long getTrialVaultReleaseTime() {
            return this.trialVaultReleaseTime;
        }

    }

    public static class DescribeBackupPlansResponseBodyBackupPlansBackupPlan extends TeaModel {
        /**
         * <p>The ID of the data source group for backup.</p>
         */
        @NameInMap("BackupSourceGroupId")
        public String backupSourceGroupId;

        /**
         * <p>The backup type. Valid value: **COMPLETE**, which indicates full backup.</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **OSS**. This parameter indicates the name of the OSS bucket.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("ChangeListPath")
        public String changeListPath;

        /**
         * <p>The ID of the client.</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The ID of the client group.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **NAS**. This parameter indicates the time when the file system was created. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time when the backup plan was created. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         */
        @NameInMap("CrossAccountRoleName")
        public String crossAccountRoleName;

        /**
         * <p>Indicates whether data is backed up within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
         * <br>
         * <p>*   SELF_ACCOUNT</p>
         * <p>*   CROSS_ACCOUNT</p>
         */
        @NameInMap("CrossAccountType")
        public String crossAccountType;

        /**
         * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         */
        @NameInMap("CrossAccountUserId")
        public Long crossAccountUserId;

        /**
         * <p>The ID of the data source.</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("DestDataSourceDetail")
        public String destDataSourceDetail;

        @NameInMap("DestDataSourceId")
        public String destDataSourceId;

        @NameInMap("DestSourceType")
        public String destSourceType;

        /**
         * <p>The details about ECS instance backup.</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>Indicates whether the backup plan is disabled. Valid values:</p>
         * <br>
         * <p>*   true: The backup plan is disabled.</p>
         * <p>*   false: The backup plan is enabled.</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates the paths to the files that are excluded from the backup job.</p>
         */
        @NameInMap("Exclude")
        public String exclude;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **NAS**. This parameter indicates the ID of the NAS file system.</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates the paths to the files that are backed up.</p>
         */
        @NameInMap("Include")
        public String include;

        /**
         * <p>The ID of the group to which the instance belongs.</p>
         */
        @NameInMap("InstanceGroupId")
        public String instanceGroupId;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates the ID of the ECS instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the Tablestore instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Indicates whether to enable the feature of keeping at least one backup version. Valid values:</p>
         * <br>
         * <p>*   0: The feature is disabled.</p>
         * <p>*   1: The feature is enabled.</p>
         */
        @NameInMap("KeepLatestSnapshots")
        public Long keepLatestSnapshots;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates whether Windows Volume Shadow Copy Service (VSS) is used to define a source path.</p>
         */
        @NameInMap("Options")
        public String options;

        /**
         * <p>The details about the Tablestore instance.</p>
         */
        @NameInMap("OtsDetail")
        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanOtsDetail otsDetail;

        /**
         * <p>The source paths. This parameter is returned only if the **SourceType** parameter is set to **ECS_FILE**.</p>
         */
        @NameInMap("Paths")
        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanPaths paths;

        /**
         * <p>The ID of the backup plan.</p>
         */
        @NameInMap("PlanId")
        public String planId;

        /**
         * <p>The name of the backup plan.</p>
         */
        @NameInMap("PlanName")
        public String planName;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **OSS**. This parameter indicates the prefix of objects that are backed up.</p>
         */
        @NameInMap("Prefix")
        public String prefix;

        /**
         * <p>The list of backup resources. This parameter is returned only for disk backup.</p>
         */
        @NameInMap("Resources")
        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanResources resources;

        /**
         * <p>The retention period of the backup data. Unit: days.</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>The list of backup policies. This parameter is returned only for disk backup.</p>
         */
        @NameInMap("Rules")
        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanRules rules;

        /**
         * <p>The backup policy. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified in the `{startTime}` parameter and the subsequent backup jobs at an interval that is specified in the `{interval}` parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, `I|1631685600|P1D` indicates that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
         * <br>
         * <p>*   **startTime**: the time at which the system starts to run a backup job. The time follows the UNIX time format. Unit: seconds.</p>
         * <p>*   **interval**: the interval at which the system runs a backup job. The interval follows the ISO 8601 standard. For example, PT1H indicates an interval of one hour. P1D indicates an interval of one day.</p>
         */
        @NameInMap("Schedule")
        public String schedule;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <br>
         * <p>*   **ECS_FILE**: ECS files</p>
         * <p>*   **OSS**: OSS buckets</p>
         * <p>*   **NAS**: NAS file systems</p>
         * <p>*   **OTS**: Tablestore instances</p>
         * <p>*   **UDM_ECS**: ECS instances</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates the throttling rules. Format: `{start}|{end}|{bandwidth}`. Multiple throttling rules are separated with vertical bars (`|`). A specified time range cannot overlap with another one.</p>
         * <br>
         * <p>*   start: the start hour.</p>
         * <p>*   end: the end hour.</p>
         * <p>*   bandwidth: the bandwidth. Unit: KB/s.</p>
         */
        @NameInMap("SpeedLimit")
        public String speedLimit;

        /**
         * <p>The free trial information.</p>
         */
        @NameInMap("TrialInfo")
        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanTrialInfo trialInfo;

        /**
         * <p>The time when the backup plan was updated. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>The ID of the backup vault.</p>
         */
        @NameInMap("VaultId")
        public String vaultId;

        public static DescribeBackupPlansResponseBodyBackupPlansBackupPlan build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlansResponseBodyBackupPlansBackupPlan self = new DescribeBackupPlansResponseBodyBackupPlansBackupPlan();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setBackupSourceGroupId(String backupSourceGroupId) {
            this.backupSourceGroupId = backupSourceGroupId;
            return this;
        }
        public String getBackupSourceGroupId() {
            return this.backupSourceGroupId;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setChangeListPath(String changeListPath) {
            this.changeListPath = changeListPath;
            return this;
        }
        public String getChangeListPath() {
            return this.changeListPath;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setCrossAccountRoleName(String crossAccountRoleName) {
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }
        public String getCrossAccountRoleName() {
            return this.crossAccountRoleName;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setCrossAccountType(String crossAccountType) {
            this.crossAccountType = crossAccountType;
            return this;
        }
        public String getCrossAccountType() {
            return this.crossAccountType;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setCrossAccountUserId(Long crossAccountUserId) {
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }
        public Long getCrossAccountUserId() {
            return this.crossAccountUserId;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setDestDataSourceDetail(String destDataSourceDetail) {
            this.destDataSourceDetail = destDataSourceDetail;
            return this;
        }
        public String getDestDataSourceDetail() {
            return this.destDataSourceDetail;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setDestDataSourceId(String destDataSourceId) {
            this.destDataSourceId = destDataSourceId;
            return this;
        }
        public String getDestDataSourceId() {
            return this.destDataSourceId;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setDestSourceType(String destSourceType) {
            this.destSourceType = destSourceType;
            return this;
        }
        public String getDestSourceType() {
            return this.destSourceType;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setExclude(String exclude) {
            this.exclude = exclude;
            return this;
        }
        public String getExclude() {
            return this.exclude;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setInclude(String include) {
            this.include = include;
            return this;
        }
        public String getInclude() {
            return this.include;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setInstanceGroupId(String instanceGroupId) {
            this.instanceGroupId = instanceGroupId;
            return this;
        }
        public String getInstanceGroupId() {
            return this.instanceGroupId;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setKeepLatestSnapshots(Long keepLatestSnapshots) {
            this.keepLatestSnapshots = keepLatestSnapshots;
            return this;
        }
        public Long getKeepLatestSnapshots() {
            return this.keepLatestSnapshots;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setOtsDetail(DescribeBackupPlansResponseBodyBackupPlansBackupPlanOtsDetail otsDetail) {
            this.otsDetail = otsDetail;
            return this;
        }
        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanOtsDetail getOtsDetail() {
            return this.otsDetail;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setPaths(DescribeBackupPlansResponseBodyBackupPlansBackupPlanPaths paths) {
            this.paths = paths;
            return this;
        }
        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanPaths getPaths() {
            return this.paths;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setResources(DescribeBackupPlansResponseBodyBackupPlansBackupPlanResources resources) {
            this.resources = resources;
            return this;
        }
        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanResources getResources() {
            return this.resources;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setRetention(Long retention) {
            this.retention = retention;
            return this;
        }
        public Long getRetention() {
            return this.retention;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setRules(DescribeBackupPlansResponseBodyBackupPlansBackupPlanRules rules) {
            this.rules = rules;
            return this;
        }
        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanRules getRules() {
            return this.rules;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setSchedule(String schedule) {
            this.schedule = schedule;
            return this;
        }
        public String getSchedule() {
            return this.schedule;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setSpeedLimit(String speedLimit) {
            this.speedLimit = speedLimit;
            return this;
        }
        public String getSpeedLimit() {
            return this.speedLimit;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setTrialInfo(DescribeBackupPlansResponseBodyBackupPlansBackupPlanTrialInfo trialInfo) {
            this.trialInfo = trialInfo;
            return this;
        }
        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanTrialInfo getTrialInfo() {
            return this.trialInfo;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setVaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public String getVaultId() {
            return this.vaultId;
        }

    }

    public static class DescribeBackupPlansResponseBodyBackupPlans extends TeaModel {
        @NameInMap("BackupPlan")
        public java.util.List<DescribeBackupPlansResponseBodyBackupPlansBackupPlan> backupPlan;

        public static DescribeBackupPlansResponseBodyBackupPlans build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlansResponseBodyBackupPlans self = new DescribeBackupPlansResponseBodyBackupPlans();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlansResponseBodyBackupPlans setBackupPlan(java.util.List<DescribeBackupPlansResponseBodyBackupPlansBackupPlan> backupPlan) {
            this.backupPlan = backupPlan;
            return this;
        }
        public java.util.List<DescribeBackupPlansResponseBodyBackupPlansBackupPlan> getBackupPlan() {
            return this.backupPlan;
        }

    }

}
