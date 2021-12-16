// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoTagRequest extends TeaModel {
    @NameInMap("FromTag")
    public String fromTag;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NamespaceName")
    public String namespaceName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("ToTag")
    public String toTag;

    public static CreateRepoTagRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoTagRequest self = new CreateRepoTagRequest();
        return TeaModel.build(map, self);
    }

    public CreateRepoTagRequest setFromTag(String fromTag) {
        this.fromTag = fromTag;
        return this;
    }
    public String getFromTag() {
        return this.fromTag;
    }

    public CreateRepoTagRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRepoTagRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public CreateRepoTagRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRepoTagRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public CreateRepoTagRequest setToTag(String toTag) {
        this.toTag = toTag;
        return this;
    }
    public String getToTag() {
        return this.toTag;
    }

}
