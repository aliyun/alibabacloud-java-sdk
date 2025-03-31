// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactSubscriptionRuleResponseBody extends TeaModel {
    /**
     * <p>Indicates whether an acceleration link is enabled for image subscription. The subscription acceleration feature is in public preview. The feature is optimized based on scheduling policies and network links to accelerate image subscription.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Accelerate")
    public Boolean accelerate;

    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The time when the subscription rule was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1570759546000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-hpdfkc6utbaq****</p>
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
     * <p>The time when the subscription rule was modified.</p>
     * 
     * <strong>example:</strong>
     * <p>1638259914000</p>
     */
    @NameInMap("ModifiedTime")
    public Long modifiedTime;

    /**
     * <p>The name of the Container Registry namespace.</p>
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
     * <p>The operating system and architecture. If the source repository contains multi-arch images, only the images with the specified operating system and architecture are subscribed to the destination repository of the Enterprise Edition instance.</p>
     */
    @NameInMap("Platform")
    public java.util.List<String> platform;

    /**
     * <p>The name of the Container Registry repository.</p>
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
     * <p>D4978DCC-ECBD-40B0-A714-EE6959B22C77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>crasr-mdbpung4i1rm****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The name of the source namespace.</p>
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
     * <p>The number of subscribed images.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TagCount")
    public Long tagCount;

    /**
     * <p>The image tag in the subscription source repository. Regular expressions are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>release-v.*</p>
     */
    @NameInMap("TagRegexp")
    public String tagRegexp;

    public static GetArtifactSubscriptionRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactSubscriptionRuleResponseBody self = new GetArtifactSubscriptionRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetArtifactSubscriptionRuleResponseBody setAccelerate(Boolean accelerate) {
        this.accelerate = accelerate;
        return this;
    }
    public Boolean getAccelerate() {
        return this.accelerate;
    }

    public GetArtifactSubscriptionRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetArtifactSubscriptionRuleResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetArtifactSubscriptionRuleResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetArtifactSubscriptionRuleResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetArtifactSubscriptionRuleResponseBody setModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    public GetArtifactSubscriptionRuleResponseBody setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public GetArtifactSubscriptionRuleResponseBody setOverride(Boolean override) {
        this.override = override;
        return this;
    }
    public Boolean getOverride() {
        return this.override;
    }

    public GetArtifactSubscriptionRuleResponseBody setPlatform(java.util.List<String> platform) {
        this.platform = platform;
        return this;
    }
    public java.util.List<String> getPlatform() {
        return this.platform;
    }

    public GetArtifactSubscriptionRuleResponseBody setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public GetArtifactSubscriptionRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetArtifactSubscriptionRuleResponseBody setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public GetArtifactSubscriptionRuleResponseBody setSourceNamespaceName(String sourceNamespaceName) {
        this.sourceNamespaceName = sourceNamespaceName;
        return this;
    }
    public String getSourceNamespaceName() {
        return this.sourceNamespaceName;
    }

    public GetArtifactSubscriptionRuleResponseBody setSourceProvider(String sourceProvider) {
        this.sourceProvider = sourceProvider;
        return this;
    }
    public String getSourceProvider() {
        return this.sourceProvider;
    }

    public GetArtifactSubscriptionRuleResponseBody setSourceRepoName(String sourceRepoName) {
        this.sourceRepoName = sourceRepoName;
        return this;
    }
    public String getSourceRepoName() {
        return this.sourceRepoName;
    }

    public GetArtifactSubscriptionRuleResponseBody setTagCount(Long tagCount) {
        this.tagCount = tagCount;
        return this;
    }
    public Long getTagCount() {
        return this.tagCount;
    }

    public GetArtifactSubscriptionRuleResponseBody setTagRegexp(String tagRegexp) {
        this.tagRegexp = tagRegexp;
        return this;
    }
    public String getTagRegexp() {
        return this.tagRegexp;
    }

}
