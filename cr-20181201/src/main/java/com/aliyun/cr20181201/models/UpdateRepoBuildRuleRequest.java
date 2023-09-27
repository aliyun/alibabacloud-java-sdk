// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateRepoBuildRuleRequest extends TeaModel {
    /**
     * <p>Building arguments.</p>
     */
    @NameInMap("BuildArgs")
    public java.util.List<String> buildArgs;

    /**
     * <p>The ID of the building rule.</p>
     */
    @NameInMap("BuildRuleId")
    public String buildRuleId;

    /**
     * <p>The path of the Dockerfile.</p>
     */
    @NameInMap("DockerfileLocation")
    public String dockerfileLocation;

    /**
     * <p>The name of the Dockerfile.</p>
     */
    @NameInMap("DockerfileName")
    public String dockerfileName;

    /**
     * <p>The tag of the image.</p>
     */
    @NameInMap("ImageTag")
    public String imageTag;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Architecture for image building. Valid values:</p>
     * <br>
     * <p>*   `linux/amd64`</p>
     * <p>*   `linux/arm64`</p>
     * <p>*   `linux/386`</p>
     * <p>*   `linux/arm/v7`</p>
     * <p>*   `linux/arm/v6`</p>
     * <br>
     * <p>Default value: `linux/amd64`</p>
     */
    @NameInMap("Platforms")
    public java.util.List<String> platforms;

    /**
     * <p>The name of the push that triggers the building rule.</p>
     */
    @NameInMap("PushName")
    public String pushName;

    /**
     * <p>The type of the push that triggers the building rule. Valid values:</p>
     * <br>
     * <p>*   `GIT_TAG`: tag push</p>
     * <p>*   `GIT_BRANCH`: branch push</p>
     */
    @NameInMap("PushType")
    public String pushType;

    /**
     * <p>The ID of the image repository.</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    public static UpdateRepoBuildRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRepoBuildRuleRequest self = new UpdateRepoBuildRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRepoBuildRuleRequest setBuildArgs(java.util.List<String> buildArgs) {
        this.buildArgs = buildArgs;
        return this;
    }
    public java.util.List<String> getBuildArgs() {
        return this.buildArgs;
    }

    public UpdateRepoBuildRuleRequest setBuildRuleId(String buildRuleId) {
        this.buildRuleId = buildRuleId;
        return this;
    }
    public String getBuildRuleId() {
        return this.buildRuleId;
    }

    public UpdateRepoBuildRuleRequest setDockerfileLocation(String dockerfileLocation) {
        this.dockerfileLocation = dockerfileLocation;
        return this;
    }
    public String getDockerfileLocation() {
        return this.dockerfileLocation;
    }

    public UpdateRepoBuildRuleRequest setDockerfileName(String dockerfileName) {
        this.dockerfileName = dockerfileName;
        return this;
    }
    public String getDockerfileName() {
        return this.dockerfileName;
    }

    public UpdateRepoBuildRuleRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public UpdateRepoBuildRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateRepoBuildRuleRequest setPlatforms(java.util.List<String> platforms) {
        this.platforms = platforms;
        return this;
    }
    public java.util.List<String> getPlatforms() {
        return this.platforms;
    }

    public UpdateRepoBuildRuleRequest setPushName(String pushName) {
        this.pushName = pushName;
        return this;
    }
    public String getPushName() {
        return this.pushName;
    }

    public UpdateRepoBuildRuleRequest setPushType(String pushType) {
        this.pushType = pushType;
        return this;
    }
    public String getPushType() {
        return this.pushType;
    }

    public UpdateRepoBuildRuleRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

}
