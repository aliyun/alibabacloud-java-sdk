// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateArtifactLifecycleRuleRequest extends TeaModel {
    @NameInMap("Auto")
    public Boolean auto;

    @NameInMap("EnableDeleteTag")
    public Boolean enableDeleteTag;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NamespaceName")
    public String namespaceName;

    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("RetentionTagCount")
    public Long retentionTagCount;

    @NameInMap("ScheduleTime")
    public String scheduleTime;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("TagRegexp")
    public String tagRegexp;

    public static CreateArtifactLifecycleRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateArtifactLifecycleRuleRequest self = new CreateArtifactLifecycleRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateArtifactLifecycleRuleRequest setAuto(Boolean auto) {
        this.auto = auto;
        return this;
    }
    public Boolean getAuto() {
        return this.auto;
    }

    public CreateArtifactLifecycleRuleRequest setEnableDeleteTag(Boolean enableDeleteTag) {
        this.enableDeleteTag = enableDeleteTag;
        return this;
    }
    public Boolean getEnableDeleteTag() {
        return this.enableDeleteTag;
    }

    public CreateArtifactLifecycleRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateArtifactLifecycleRuleRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public CreateArtifactLifecycleRuleRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public CreateArtifactLifecycleRuleRequest setRetentionTagCount(Long retentionTagCount) {
        this.retentionTagCount = retentionTagCount;
        return this;
    }
    public Long getRetentionTagCount() {
        return this.retentionTagCount;
    }

    public CreateArtifactLifecycleRuleRequest setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    public CreateArtifactLifecycleRuleRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateArtifactLifecycleRuleRequest setTagRegexp(String tagRegexp) {
        this.tagRegexp = tagRegexp;
        return this;
    }
    public String getTagRegexp() {
        return this.tagRegexp;
    }

}
