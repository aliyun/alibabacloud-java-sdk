// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactLifecycleRuleResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the lifecycle management rule is automatically executed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Auto")
    public Boolean auto;

    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The time when the lifecycle management rule was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1571926439000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>Indicates whether lifecycle management is enabled for the artifact.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableDeleteTag")
    public Boolean enableDeleteTag;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xkx6vujuhay0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Indicates whether the API request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request is successful.</li>
     * <li><code>false</code>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The time when the lifecycle management rule was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>1638259914000</p>
     */
    @NameInMap("ModifiedTime")
    public Long modifiedTime;

    /**
     * <p>The name of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>test-namespace</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    /**
     * <p>The time when the lifecycle management rule is next executed.</p>
     * 
     * <strong>example:</strong>
     * <p>1701878400000</p>
     */
    @NameInMap("NextTime")
    public Long nextTime;

    @NameInMap("Policies")
    public java.util.List<GetArtifactLifecycleRuleResponseBodyPolicies> policies;

    /**
     * <p>The name of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>test-repo</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>724402D0-75CD-4794-BC20-7D37208****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of retained images.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("RetentionTagCount")
    public Long retentionTagCount;

    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cralr-a18bkiajy8****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The execution cycle of the lifecycle management rule.</p>
     * 
     * <strong>example:</strong>
     * <p>WEEK</p>
     */
    @NameInMap("ScheduleTime")
    public String scheduleTime;

    /**
     * <p>The deletion scope of artifacts.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The regular expression that indicates which image tags are retained.</p>
     * 
     * <strong>example:</strong>
     * <p>.*-alpine</p>
     */
    @NameInMap("TagRegexp")
    public String tagRegexp;

    public static GetArtifactLifecycleRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactLifecycleRuleResponseBody self = new GetArtifactLifecycleRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetArtifactLifecycleRuleResponseBody setAuto(Boolean auto) {
        this.auto = auto;
        return this;
    }
    public Boolean getAuto() {
        return this.auto;
    }

    public GetArtifactLifecycleRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetArtifactLifecycleRuleResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetArtifactLifecycleRuleResponseBody setEnableDeleteTag(Boolean enableDeleteTag) {
        this.enableDeleteTag = enableDeleteTag;
        return this;
    }
    public Boolean getEnableDeleteTag() {
        return this.enableDeleteTag;
    }

    public GetArtifactLifecycleRuleResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetArtifactLifecycleRuleResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetArtifactLifecycleRuleResponseBody setModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    public GetArtifactLifecycleRuleResponseBody setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public GetArtifactLifecycleRuleResponseBody setNextTime(Long nextTime) {
        this.nextTime = nextTime;
        return this;
    }
    public Long getNextTime() {
        return this.nextTime;
    }

    public GetArtifactLifecycleRuleResponseBody setPolicies(java.util.List<GetArtifactLifecycleRuleResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<GetArtifactLifecycleRuleResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public GetArtifactLifecycleRuleResponseBody setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public GetArtifactLifecycleRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetArtifactLifecycleRuleResponseBody setRetentionTagCount(Long retentionTagCount) {
        this.retentionTagCount = retentionTagCount;
        return this;
    }
    public Long getRetentionTagCount() {
        return this.retentionTagCount;
    }

    public GetArtifactLifecycleRuleResponseBody setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public GetArtifactLifecycleRuleResponseBody setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    public GetArtifactLifecycleRuleResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public GetArtifactLifecycleRuleResponseBody setTagRegexp(String tagRegexp) {
        this.tagRegexp = tagRegexp;
        return this;
    }
    public String getTagRegexp() {
        return this.tagRegexp;
    }

    public static class GetArtifactLifecycleRuleResponseBodyPoliciesCondition extends TeaModel {
        @NameInMap("LastPullOlderThanDays")
        public Integer lastPullOlderThanDays;

        @NameInMap("LastPushOlderThanDays")
        public Integer lastPushOlderThanDays;

        @NameInMap("LatestTagCount")
        public Integer latestTagCount;

        public static GetArtifactLifecycleRuleResponseBodyPoliciesCondition build(java.util.Map<String, ?> map) throws Exception {
            GetArtifactLifecycleRuleResponseBodyPoliciesCondition self = new GetArtifactLifecycleRuleResponseBodyPoliciesCondition();
            return TeaModel.build(map, self);
        }

        public GetArtifactLifecycleRuleResponseBodyPoliciesCondition setLastPullOlderThanDays(Integer lastPullOlderThanDays) {
            this.lastPullOlderThanDays = lastPullOlderThanDays;
            return this;
        }
        public Integer getLastPullOlderThanDays() {
            return this.lastPullOlderThanDays;
        }

        public GetArtifactLifecycleRuleResponseBodyPoliciesCondition setLastPushOlderThanDays(Integer lastPushOlderThanDays) {
            this.lastPushOlderThanDays = lastPushOlderThanDays;
            return this;
        }
        public Integer getLastPushOlderThanDays() {
            return this.lastPushOlderThanDays;
        }

        public GetArtifactLifecycleRuleResponseBodyPoliciesCondition setLatestTagCount(Integer latestTagCount) {
            this.latestTagCount = latestTagCount;
            return this;
        }
        public Integer getLatestTagCount() {
            return this.latestTagCount;
        }

    }

    public static class GetArtifactLifecycleRuleResponseBodyPoliciesFilter extends TeaModel {
        @NameInMap("TagWildcard")
        public String tagWildcard;

        public static GetArtifactLifecycleRuleResponseBodyPoliciesFilter build(java.util.Map<String, ?> map) throws Exception {
            GetArtifactLifecycleRuleResponseBodyPoliciesFilter self = new GetArtifactLifecycleRuleResponseBodyPoliciesFilter();
            return TeaModel.build(map, self);
        }

        public GetArtifactLifecycleRuleResponseBodyPoliciesFilter setTagWildcard(String tagWildcard) {
            this.tagWildcard = tagWildcard;
            return this;
        }
        public String getTagWildcard() {
            return this.tagWildcard;
        }

    }

    public static class GetArtifactLifecycleRuleResponseBodyPolicies extends TeaModel {
        @NameInMap("Condition")
        public GetArtifactLifecycleRuleResponseBodyPoliciesCondition condition;

        @NameInMap("Filter")
        public GetArtifactLifecycleRuleResponseBodyPoliciesFilter filter;

        @NameInMap("Type")
        public String type;

        public static GetArtifactLifecycleRuleResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            GetArtifactLifecycleRuleResponseBodyPolicies self = new GetArtifactLifecycleRuleResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public GetArtifactLifecycleRuleResponseBodyPolicies setCondition(GetArtifactLifecycleRuleResponseBodyPoliciesCondition condition) {
            this.condition = condition;
            return this;
        }
        public GetArtifactLifecycleRuleResponseBodyPoliciesCondition getCondition() {
            return this.condition;
        }

        public GetArtifactLifecycleRuleResponseBodyPolicies setFilter(GetArtifactLifecycleRuleResponseBodyPoliciesFilter filter) {
            this.filter = filter;
            return this;
        }
        public GetArtifactLifecycleRuleResponseBodyPoliciesFilter getFilter() {
            return this.filter;
        }

        public GetArtifactLifecycleRuleResponseBodyPolicies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
