// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateArtifactLifecycleRuleRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically execute the lifecycle management rule.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Auto")
    public Boolean auto;

    /**
     * <p>Specifies whether to enable lifecycle management for the artifact.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableDeleteTag")
    public Boolean enableDeleteTag;

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
     * <p>The name of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>test-ns</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    /**
     * <p>The name of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>test_1</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The number of images that you want to retain.</p>
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
     * <p>REPO</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The regular expression that indicates which image tags you want to retain.</p>
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

    public UpdateArtifactLifecycleRuleRequest setEnableDeleteTag(Boolean enableDeleteTag) {
        this.enableDeleteTag = enableDeleteTag;
        return this;
    }
    public Boolean getEnableDeleteTag() {
        return this.enableDeleteTag;
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
