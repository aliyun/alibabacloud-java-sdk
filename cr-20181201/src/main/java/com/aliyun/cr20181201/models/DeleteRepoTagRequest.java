// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteRepoTagRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the image repository.</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The tag of the image.</p>
     */
    @NameInMap("Tag")
    public String tag;

    public static DeleteRepoTagRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepoTagRequest self = new DeleteRepoTagRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRepoTagRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteRepoTagRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public DeleteRepoTagRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
