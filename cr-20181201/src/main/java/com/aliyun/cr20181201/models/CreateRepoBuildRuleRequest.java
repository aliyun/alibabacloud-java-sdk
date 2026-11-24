// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoBuildRuleRequest extends TeaModel {
    /**
     * <p>The build arguments.</p>
     */
    @NameInMap("BuildArgs")
    public java.util.List<String> buildArgs;

    /**
     * <p>The Dockerfile path.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("DockerfileLocation")
    public String dockerfileLocation;

    /**
     * <p>The Dockerfile name.</p>
     * 
     * <strong>example:</strong>
     * <p>Dockerfile</p>
     */
    @NameInMap("DockerfileName")
    public String dockerfileName;

    /**
     * <p>The image version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v0.9.5</p>
     */
    @NameInMap("ImageTag")
    public String imageTag;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xkx6vujuhay0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The image architecture. Valid values:</p>
     * <ul>
     * <li><p><code>linux/amd64</code></p>
     * </li>
     * <li><p><code>linux/arm64</code></p>
     * </li>
     * <li><p><code>linux/386</code></p>
     * </li>
     * <li><p><code>linux/arm/v7</code></p>
     * </li>
     * <li><p><code>linux/arm/v6</code></p>
     * </li>
     * </ul>
     * <p>Default value: <code>linux/amd64</code>.</p>
     */
    @NameInMap("Platforms")
    public java.util.List<String> platforms;

    /**
     * <p>The trigger name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>master</p>
     */
    @NameInMap("PushName")
    public String pushName;

    /**
     * <p>The push type. Valid values:</p>
     * <ul>
     * <li><p><code>GIT_TAG</code>: Triggered by tag.</p>
     * </li>
     * <li><p><code>GIT_BRANCH</code>: Triggered by branch.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GIT_BRANCH</p>
     */
    @NameInMap("PushType")
    public String pushType;

    /**
     * <p>The image repository ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-8dz3aedjqlmk****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    public static CreateRepoBuildRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoBuildRuleRequest self = new CreateRepoBuildRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRepoBuildRuleRequest setBuildArgs(java.util.List<String> buildArgs) {
        this.buildArgs = buildArgs;
        return this;
    }
    public java.util.List<String> getBuildArgs() {
        return this.buildArgs;
    }

    public CreateRepoBuildRuleRequest setDockerfileLocation(String dockerfileLocation) {
        this.dockerfileLocation = dockerfileLocation;
        return this;
    }
    public String getDockerfileLocation() {
        return this.dockerfileLocation;
    }

    public CreateRepoBuildRuleRequest setDockerfileName(String dockerfileName) {
        this.dockerfileName = dockerfileName;
        return this;
    }
    public String getDockerfileName() {
        return this.dockerfileName;
    }

    public CreateRepoBuildRuleRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public CreateRepoBuildRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRepoBuildRuleRequest setPlatforms(java.util.List<String> platforms) {
        this.platforms = platforms;
        return this;
    }
    public java.util.List<String> getPlatforms() {
        return this.platforms;
    }

    public CreateRepoBuildRuleRequest setPushName(String pushName) {
        this.pushName = pushName;
        return this;
    }
    public String getPushName() {
        return this.pushName;
    }

    public CreateRepoBuildRuleRequest setPushType(String pushType) {
        this.pushType = pushType;
        return this;
    }
    public String getPushType() {
        return this.pushType;
    }

    public CreateRepoBuildRuleRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

}
