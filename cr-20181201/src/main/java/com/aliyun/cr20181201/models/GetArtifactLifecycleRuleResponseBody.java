// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactLifecycleRuleResponseBody extends TeaModel {
    @NameInMap("Auto")
    public Boolean auto;

    @NameInMap("Code")
    public String code;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("EnableDeleteTag")
    public Boolean enableDeleteTag;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("ModifiedTime")
    public Long modifiedTime;

    @NameInMap("NamespaceName")
    public String namespaceName;

    @NameInMap("NextTime")
    public Long nextTime;

    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RetentionTagCount")
    public Long retentionTagCount;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("ScheduleTime")
    public String scheduleTime;

    @NameInMap("Scope")
    public String scope;

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

}
