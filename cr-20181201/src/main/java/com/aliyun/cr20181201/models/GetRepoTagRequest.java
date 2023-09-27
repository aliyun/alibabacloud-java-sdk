// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoTagRequest extends TeaModel {
    /**
     * <p>The return value of status code.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The operation that you want to perform. Set the value to **GetRepoTag**.</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The number of milliseconds that have elapsed since the image was created.</p>
     */
    @NameInMap("Tag")
    public String tag;

    public static GetRepoTagRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepoTagRequest self = new GetRepoTagRequest();
        return TeaModel.build(map, self);
    }

    public GetRepoTagRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRepoTagRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public GetRepoTagRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
