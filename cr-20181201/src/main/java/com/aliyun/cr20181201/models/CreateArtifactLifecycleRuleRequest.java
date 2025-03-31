// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateArtifactLifecycleRuleRequest extends TeaModel {
    /**
     * <p>Specify whether to automatically execute the lifecycle management rule.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Auto")
    public Boolean auto;

    /**
     * <p>Specify whether to enable lifecycle management for the artifact.</p>
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
     * <p>cri-gbwfk7qbgrxe****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>dev-backend</p>
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
     * <p>The execution cycle of the lifecycle management rule.</p>
     * 
     * <strong>example:</strong>
     * <p>WEEK</p>
     */
    @NameInMap("ScheduleTime")
    public String scheduleTime;

    /**
     * <p>The deletion scope.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The regular expression that is used to indicate which image tags are retained.</p>
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
