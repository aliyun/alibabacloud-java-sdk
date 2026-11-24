// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateArtifactSubscriptionRuleRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the acceleration link. The subscription acceleration feature is in public preview. Based on scheduling policies and network link optimization, it can improve the image subscription speed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Accelerate")
    public Boolean accelerate;

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
     * <p>This parameter is required.</p>
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
    public Boolean override;

    /**
     * <p>The operating system or architecture. If the source repository contains multi-architecture images, only images with the specified operating system or architecture are subscribed to the destination repository of the Enterprise instance.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Platform")
    public java.util.List<String> platform;

    /**
     * <p>The ACR repository.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-repo</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The source namespace. If <code>SourceProvider</code> is set to <code>DOCKER_HUB</code>, the default value is <code>library</code>. This parameter is required in other scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>library</p>
     */
    @NameInMap("SourceNamespaceName")
    public String sourceNamespaceName;

    /**
     * <p>The artifact source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DOCKER_HUB</p>
     */
    @NameInMap("SourceProvider")
    public String sourceProvider;

    /**
     * <p>The source repository.</p>
     * <p>This parameter is required.</p>
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
     */
    @NameInMap("TagCount")
    public Long tagCount;

    /**
     * <ul>
     * <li>The image tags to subscribe to when matching by tag list. A maximum of 10 tags are supported.</li>
     * <li>If TagList is specified, these tags are queried one by one. TagRegexp and TagCount cannot be specified at the same time. If TagList is not specified, TagRegexp and TagCount are used for matching, and both must be specified.</li>
     * <li>The matching method cannot be changed after the rule is created. To change the matching method, delete the rule and create a new one.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>latest</p>
     */
    @NameInMap("TagList")
    public java.util.List<String> tagList;

    /**
     * <p>The image versions to subscribe to from the source repository. Regular expressions are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>release-v.*</p>
     */
    @NameInMap("TagRegexp")
    public String tagRegexp;

    public static CreateArtifactSubscriptionRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateArtifactSubscriptionRuleRequest self = new CreateArtifactSubscriptionRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateArtifactSubscriptionRuleRequest setAccelerate(Boolean accelerate) {
        this.accelerate = accelerate;
        return this;
    }
    public Boolean getAccelerate() {
        return this.accelerate;
    }

    public CreateArtifactSubscriptionRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateArtifactSubscriptionRuleRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public CreateArtifactSubscriptionRuleRequest setOverride(Boolean override) {
        this.override = override;
        return this;
    }
    public Boolean getOverride() {
        return this.override;
    }

    public CreateArtifactSubscriptionRuleRequest setPlatform(java.util.List<String> platform) {
        this.platform = platform;
        return this;
    }
    public java.util.List<String> getPlatform() {
        return this.platform;
    }

    public CreateArtifactSubscriptionRuleRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public CreateArtifactSubscriptionRuleRequest setSourceNamespaceName(String sourceNamespaceName) {
        this.sourceNamespaceName = sourceNamespaceName;
        return this;
    }
    public String getSourceNamespaceName() {
        return this.sourceNamespaceName;
    }

    public CreateArtifactSubscriptionRuleRequest setSourceProvider(String sourceProvider) {
        this.sourceProvider = sourceProvider;
        return this;
    }
    public String getSourceProvider() {
        return this.sourceProvider;
    }

    public CreateArtifactSubscriptionRuleRequest setSourceRepoName(String sourceRepoName) {
        this.sourceRepoName = sourceRepoName;
        return this;
    }
    public String getSourceRepoName() {
        return this.sourceRepoName;
    }

    public CreateArtifactSubscriptionRuleRequest setTagCount(Long tagCount) {
        this.tagCount = tagCount;
        return this;
    }
    public Long getTagCount() {
        return this.tagCount;
    }

    public CreateArtifactSubscriptionRuleRequest setTagList(java.util.List<String> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<String> getTagList() {
        return this.tagList;
    }

    public CreateArtifactSubscriptionRuleRequest setTagRegexp(String tagRegexp) {
        this.tagRegexp = tagRegexp;
        return this;
    }
    public String getTagRegexp() {
        return this.tagRegexp;
    }

}
