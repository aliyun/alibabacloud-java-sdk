// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoBuildRuleRequest extends TeaModel {
    @NameInMap("DockerfileLocation")
    public String dockerfileLocation;

    @NameInMap("DockerfileName")
    public String dockerfileName;

    @NameInMap("ImageTag")
    public String imageTag;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PushName")
    public String pushName;

    @NameInMap("PushType")
    public String pushType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RepoId")
    public String repoId;

    public static CreateRepoBuildRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoBuildRuleRequest self = new CreateRepoBuildRuleRequest();
        return TeaModel.build(map, self);
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

    public CreateRepoBuildRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRepoBuildRuleRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

}
