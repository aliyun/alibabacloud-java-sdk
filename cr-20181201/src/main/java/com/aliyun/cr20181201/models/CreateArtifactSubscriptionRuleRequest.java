// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateArtifactSubscriptionRuleRequest extends TeaModel {
    /**
     * <p>Indicates whether an acceleration link is enabled for image subscription. The subscription acceleration feature is in public preview. The feature is optimized based on scheduling policies and network links to accelerate image subscription.</p>
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
     * <p>The name of the Container Registry namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-ns</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    /**
     * <p>Indicates whether the original image is overwritten.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Override")
    public Boolean override;

    /**
     * <p>The operating system and architecture. If the source repository contains a multi-arch image, only the specified operating system and architecture are subscribed to the destination repository of the Enterprise Edition instance. Subscribe to the destination repository of an Enterprise Edition instance</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Platform")
    public java.util.List<String> platform;

    /**
     * <p>The name of the Container Registry repository.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-repo</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The source namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>library</p>
     */
    @NameInMap("SourceNamespaceName")
    public String sourceNamespaceName;

    /**
     * <p>The source of the artifact.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>DOCKER_HUB: Docker Hub</li>
     * <li>GCR: GCR</li>
     * <li>QUAY: Quay.io</li>
     * </ul>
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
     * <p>The number of subscribed images.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TagCount")
    public Long tagCount;

    /**
     * <p>The image tag in the subscription source repository. Regular expressions are supported.</p>
     * <p>This parameter is required.</p>
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

    public CreateArtifactSubscriptionRuleRequest setTagRegexp(String tagRegexp) {
        this.tagRegexp = tagRegexp;
        return this;
    }
    public String getTagRegexp() {
        return this.tagRegexp;
    }

}
