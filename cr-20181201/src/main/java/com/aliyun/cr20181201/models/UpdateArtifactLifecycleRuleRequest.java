// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateArtifactLifecycleRuleRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically execute the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Auto")
    public Boolean auto;

    /**
     * <p>Specifies whether to enable DryRun mode. If DryRun mode is enabled, only the lifecycle task scan is performed and no actual data cleanup is performed. DryRun mode is disabled by default.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to enable lifecycle management.</p>
     * <p>Only one of this parameter and EnableDeleteUntaggedManifest can be set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableDeleteTag")
    public Boolean enableDeleteTag;

    /**
     * <p>Specifies whether to enable artifact cleanup.</p>
     * <p>Only one of this parameter and EnableDeleteTag can be set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableDeleteUntaggedManifest")
    public Boolean enableDeleteUntaggedManifest;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-r6ym0lerldp****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The namespace name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-ns</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    /**
     * <p>The image repository name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_1</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The number of images to retain.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("RetentionTagCount")
    public Long retentionTagCount;

    /**
     * <p>The rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cralr-luq6qiegzvx****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The execution cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>WEEK</p>
     */
    @NameInMap("ScheduleTime")
    public String scheduleTime;

    /**
     * <p>The cleanup scope.</p>
     * 
     * <strong>example:</strong>
     * <p>REPO</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The regular expression used to retain image versions.</p>
     * 
     * <strong>example:</strong>
     * <p>.<em>production_.</em></p>
     */
    @NameInMap("TagRegexp")
    public String tagRegexp;

    public static UpdateArtifactLifecycleRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateArtifactLifecycleRuleRequest self = new UpdateArtifactLifecycleRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateArtifactLifecycleRuleRequest setAuto(Boolean auto) {
        this.auto = auto;
        return this;
    }
    public Boolean getAuto() {
        return this.auto;
    }

    public UpdateArtifactLifecycleRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateArtifactLifecycleRuleRequest setEnableDeleteTag(Boolean enableDeleteTag) {
        this.enableDeleteTag = enableDeleteTag;
        return this;
    }
    public Boolean getEnableDeleteTag() {
        return this.enableDeleteTag;
    }

    public UpdateArtifactLifecycleRuleRequest setEnableDeleteUntaggedManifest(Boolean enableDeleteUntaggedManifest) {
        this.enableDeleteUntaggedManifest = enableDeleteUntaggedManifest;
        return this;
    }
    public Boolean getEnableDeleteUntaggedManifest() {
        return this.enableDeleteUntaggedManifest;
    }

    public UpdateArtifactLifecycleRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateArtifactLifecycleRuleRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public UpdateArtifactLifecycleRuleRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public UpdateArtifactLifecycleRuleRequest setRetentionTagCount(Long retentionTagCount) {
        this.retentionTagCount = retentionTagCount;
        return this;
    }
    public Long getRetentionTagCount() {
        return this.retentionTagCount;
    }

    public UpdateArtifactLifecycleRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public UpdateArtifactLifecycleRuleRequest setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    public UpdateArtifactLifecycleRuleRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public UpdateArtifactLifecycleRuleRequest setTagRegexp(String tagRegexp) {
        this.tagRegexp = tagRegexp;
        return this;
    }
    public String getTagRegexp() {
        return this.tagRegexp;
    }

}
