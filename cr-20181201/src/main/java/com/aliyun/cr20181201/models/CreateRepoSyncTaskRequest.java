// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSyncTaskRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Override")
    public Boolean override;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RepoId")
    public String repoId;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    @NameInMap("TargetNamespace")
    public String targetNamespace;

    @NameInMap("TargetRegionId")
    public String targetRegionId;

    @NameInMap("TargetRepoName")
    public String targetRepoName;

    @NameInMap("TargetTag")
    public String targetTag;

    @NameInMap("TargetUserId")
    public String targetUserId;

    public static CreateRepoSyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoSyncTaskRequest self = new CreateRepoSyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateRepoSyncTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRepoSyncTaskRequest setOverride(Boolean override) {
        this.override = override;
        return this;
    }
    public Boolean getOverride() {
        return this.override;
    }

    public CreateRepoSyncTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRepoSyncTaskRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public CreateRepoSyncTaskRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public CreateRepoSyncTaskRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    public CreateRepoSyncTaskRequest setTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
        return this;
    }
    public String getTargetNamespace() {
        return this.targetNamespace;
    }

    public CreateRepoSyncTaskRequest setTargetRegionId(String targetRegionId) {
        this.targetRegionId = targetRegionId;
        return this;
    }
    public String getTargetRegionId() {
        return this.targetRegionId;
    }

    public CreateRepoSyncTaskRequest setTargetRepoName(String targetRepoName) {
        this.targetRepoName = targetRepoName;
        return this;
    }
    public String getTargetRepoName() {
        return this.targetRepoName;
    }

    public CreateRepoSyncTaskRequest setTargetTag(String targetTag) {
        this.targetTag = targetTag;
        return this;
    }
    public String getTargetTag() {
        return this.targetTag;
    }

    public CreateRepoSyncTaskRequest setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public String getTargetUserId() {
        return this.targetUserId;
    }

}
