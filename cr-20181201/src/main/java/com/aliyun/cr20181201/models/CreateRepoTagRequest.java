// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoTagRequest extends TeaModel {
    /**
     * <p>The source image tag.</p>
     */
    @NameInMap("FromTag")
    public String fromTag;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the namespace.</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    /**
     * <p>The name of the image repository.</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The image tag that you want to create.</p>
     */
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
