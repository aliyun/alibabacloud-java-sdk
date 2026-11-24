// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateArtifactSubscriptionRuleRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the acceleration link. The subscription acceleration feature is in public preview. It improves the image subscription speed based on scheduling policies and network link optimization.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Accelerate")
    public String accelerate;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-c0o11woew0k****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ACR namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>test-ns</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    /**
     * <p>Specifies whether to overwrite images.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Override")
    public String override;

    /**
     * <p>The operating system and architecture. If the source repository contains multi-architecture images, only images with the specified operating system and architecture are subscribed to the destination repository of the Enterprise instance.</p>
     */
    @NameInMap("Platform")
    public java.util.List<String> platform;

    /**
     * <p>The ACR repository.</p>
     * 
     * <strong>example:</strong>
     * <p>test-repo</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crasr-mdbpung4i1rm****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The source namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>library</p>
     */
    @NameInMap("SourceNamespaceName")
    public String sourceNamespaceName;

    /**
     * <p>The artifact source.</p>
     * 
     * <strong>example:</strong>
     * <p>DOCKER_HUB</p>
     */
    @NameInMap("SourceProvider")
    public String sourceProvider;

    /**
     * <p>The source repository.</p>
     * 
     * <strong>example:</strong>
     * <p>nginx</p>
     */
    @NameInMap("SourceRepoName")
    public String sourceRepoName;

    /**
     * <p>The number of images to subscribe to.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("TagCount")
    public Long tagCount;

    /**
     * <ul>
     * <li>The image tags to subscribe to when matching by tag list. A maximum of 10 tags are supported.</li>
     * <li>This parameter is valid only when the rule is created by using tag list matching. It cannot be specified together with TagRegexp or TagCount.</li>
     * <li>If this parameter is not specified or an empty list is specified, the original tag list is retained and cannot be cleared. The matching method cannot be modified. To modify the matching method, delete the rule and create a new one.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>latest</p>
     */
    @NameInMap("TagList")
    public java.util.List<String> tagList;

    /**
     * <p>The image versions in the source repository to subscribe to. Regular expressions are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>release-v.*</p>
     */
    @NameInMap("TagRegexp")
    public String tagRegexp;

    public static UpdateArtifactSubscriptionRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateArtifactSubscriptionRuleRequest self = new UpdateArtifactSubscriptionRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateArtifactSubscriptionRuleRequest setAccelerate(String accelerate) {
        this.accelerate = accelerate;
        return this;
    }
    public String getAccelerate() {
        return this.accelerate;
    }

    public UpdateArtifactSubscriptionRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateArtifactSubscriptionRuleRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public UpdateArtifactSubscriptionRuleRequest setOverride(String override) {
        this.override = override;
        return this;
    }
    public String getOverride() {
        return this.override;
    }

    public UpdateArtifactSubscriptionRuleRequest setPlatform(java.util.List<String> platform) {
        this.platform = platform;
        return this;
    }
    public java.util.List<String> getPlatform() {
        return this.platform;
    }

    public UpdateArtifactSubscriptionRuleRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public UpdateArtifactSubscriptionRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public UpdateArtifactSubscriptionRuleRequest setSourceNamespaceName(String sourceNamespaceName) {
        this.sourceNamespaceName = sourceNamespaceName;
        return this;
    }
    public String getSourceNamespaceName() {
        return this.sourceNamespaceName;
    }

    public UpdateArtifactSubscriptionRuleRequest setSourceProvider(String sourceProvider) {
        this.sourceProvider = sourceProvider;
        return this;
    }
    public String getSourceProvider() {
        return this.sourceProvider;
    }

    public UpdateArtifactSubscriptionRuleRequest setSourceRepoName(String sourceRepoName) {
        this.sourceRepoName = sourceRepoName;
        return this;
    }
    public String getSourceRepoName() {
        return this.sourceRepoName;
    }

    public UpdateArtifactSubscriptionRuleRequest setTagCount(Long tagCount) {
        this.tagCount = tagCount;
        return this;
    }
    public Long getTagCount() {
        return this.tagCount;
    }

    public UpdateArtifactSubscriptionRuleRequest setTagList(java.util.List<String> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<String> getTagList() {
        return this.tagList;
    }

    public UpdateArtifactSubscriptionRuleRequest setTagRegexp(String tagRegexp) {
        this.tagRegexp = tagRegexp;
        return this;
    }
    public String getTagRegexp() {
        return this.tagRegexp;
    }

}
