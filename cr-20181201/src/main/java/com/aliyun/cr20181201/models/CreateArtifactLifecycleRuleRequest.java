// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateArtifactLifecycleRuleRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically execute the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Auto")
    public Boolean auto;

    /**
     * <p>Specifies whether to enable DryRun mode. If DryRun mode is enabled, only the lifecycle task scan is performed and no actual data cleanup is executed. This mode is disabled by default.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
     * <p>cri-gbwfk7qbgrxe****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The namespace name.</p>
     * 
     * <strong>example:</strong>
     * <p>dev-backend</p>
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
     * <p>INSTANCE</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The regular expression used to match image versions to retain.</p>
     * 
     * <strong>example:</strong>
     * <p>release-.*</p>
     */
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

    public CreateArtifactLifecycleRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateArtifactLifecycleRuleRequest setEnableDeleteTag(Boolean enableDeleteTag) {
        this.enableDeleteTag = enableDeleteTag;
        return this;
    }
    public Boolean getEnableDeleteTag() {
        return this.enableDeleteTag;
    }

    public CreateArtifactLifecycleRuleRequest setEnableDeleteUntaggedManifest(Boolean enableDeleteUntaggedManifest) {
        this.enableDeleteUntaggedManifest = enableDeleteUntaggedManifest;
        return this;
    }
    public Boolean getEnableDeleteUntaggedManifest() {
        return this.enableDeleteUntaggedManifest;
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
