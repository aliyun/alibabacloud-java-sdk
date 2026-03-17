// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeBackupPlansResponseBody extends TeaModel {
    @NameInMap("BackupPlans")
    public DescribeBackupPlansResponseBodyBackupPlans backupPlans;

    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message that is returned. If the call is successful, &quot;successful&quot; is returned. If the call fails, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page. Valid values: 1 to 99. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned backup plans that meet the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
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

    public static class DescribeBackupPlansResponseBodyBackupPlansBackupPlanHitTagsHitTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Value")
        public String value;

        public static DescribeBackupPlansResponseBodyBackupPlansBackupPlanHitTagsHitTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlansResponseBodyBackupPlansBackupPlanHitTagsHitTag self = new DescribeBackupPlansResponseBodyBackupPlansBackupPlanHitTagsHitTag();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanHitTagsHitTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanHitTagsHitTag setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanHitTagsHitTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeBackupPlansResponseBodyBackupPlansBackupPlanHitTags extends TeaModel {
        @NameInMap("HitTag")
        public java.util.List<DescribeBackupPlansResponseBodyBackupPlansBackupPlanHitTagsHitTag> hitTag;

        public static DescribeBackupPlansResponseBodyBackupPlansBackupPlanHitTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlansResponseBodyBackupPlansBackupPlanHitTags self = new DescribeBackupPlansResponseBodyBackupPlansBackupPlanHitTags();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanHitTags setHitTag(java.util.List<DescribeBackupPlansResponseBodyBackupPlansBackupPlanHitTagsHitTag> hitTag) {
            this.hitTag = hitTag;
            return this;
        }
        public java.util.List<DescribeBackupPlansResponseBodyBackupPlansBackupPlanHitTagsHitTag> getHitTag() {
            return this.hitTag;
        }

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
        @NameInMap("Extra")
        public String extra;

        @NameInMap("ResourceId")
        public String resourceId;

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
        @NameInMap("BackupType")
        public String backupType;

        @NameInMap("DestinationRegionId")
        public String destinationRegionId;

        @NameInMap("DestinationRetention")
        public Long destinationRetention;

        @NameInMap("Disabled")
        public Boolean disabled;

        @NameInMap("DoCopy")
        public Boolean doCopy;

        @NameInMap("Retention")
        public Long retention;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

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
        @NameInMap("KeepAfterTrialExpiration")
        public Boolean keepAfterTrialExpiration;

        @NameInMap("TrialExpireTime")
        public Long trialExpireTime;

        @NameInMap("TrialStartTime")
        public Long trialStartTime;

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
        @NameInMap("BackupSourceGroupId")
        public String backupSourceGroupId;

        @NameInMap("BackupType")
        public String backupType;

        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("ChangeListPath")
        public String changeListPath;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreatedByTag")
        public Boolean createdByTag;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("CrossAccountRoleName")
        public String crossAccountRoleName;

        @NameInMap("CrossAccountType")
        public String crossAccountType;

        @NameInMap("CrossAccountUserId")
        public Long crossAccountUserId;

        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("DestDataSourceDetail")
        public String destDataSourceDetail;

        @NameInMap("DestDataSourceId")
        public String destDataSourceId;

        @NameInMap("DestSourceType")
        public String destSourceType;

        @NameInMap("Detail")
        public String detail;

        @NameInMap("Disabled")
        public Boolean disabled;

        @NameInMap("Exclude")
        public String exclude;

        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("HitTags")
        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanHitTags hitTags;

        @NameInMap("Include")
        public String include;

        @NameInMap("InstanceGroupId")
        public String instanceGroupId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("KeepLatestSnapshots")
        public Long keepLatestSnapshots;

        @NameInMap("LatestExecuteJobId")
        public String latestExecuteJobId;

        /**
         * <strong>example:</strong>
         * <p>job-00**************9khz</p>
         */
        @NameInMap("LatestFinishJobId")
        public String latestFinishJobId;

        @NameInMap("Options")
        public String options;

        @NameInMap("OtsDetail")
        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanOtsDetail otsDetail;

        @NameInMap("Paths")
        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanPaths paths;

        @NameInMap("PlanId")
        public String planId;

        @NameInMap("PlanName")
        public String planName;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("Resources")
        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanResources resources;

        @NameInMap("Retention")
        public Long retention;

        @NameInMap("Rules")
        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanRules rules;

        @NameInMap("Schedule")
        public String schedule;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("SpeedLimit")
        public String speedLimit;

        @NameInMap("TrialInfo")
        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanTrialInfo trialInfo;

        @NameInMap("UpdatedTime")
        public Long updatedTime;

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

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
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

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setCreatedByTag(Boolean createdByTag) {
            this.createdByTag = createdByTag;
            return this;
        }
        public Boolean getCreatedByTag() {
            return this.createdByTag;
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

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setHitTags(DescribeBackupPlansResponseBodyBackupPlansBackupPlanHitTags hitTags) {
            this.hitTags = hitTags;
            return this;
        }
        public DescribeBackupPlansResponseBodyBackupPlansBackupPlanHitTags getHitTags() {
            return this.hitTags;
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

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setLatestExecuteJobId(String latestExecuteJobId) {
            this.latestExecuteJobId = latestExecuteJobId;
            return this;
        }
        public String getLatestExecuteJobId() {
            return this.latestExecuteJobId;
        }

        public DescribeBackupPlansResponseBodyBackupPlansBackupPlan setLatestFinishJobId(String latestFinishJobId) {
            this.latestFinishJobId = latestFinishJobId;
            return this;
        }
        public String getLatestFinishJobId() {
            return this.latestFinishJobId;
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
