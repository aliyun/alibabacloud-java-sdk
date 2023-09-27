// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoTagLayersRequest extends TeaModel {
    /**
     * <p>The digest of the image.</p>
     */
    @NameInMap("Digest")
    public String digest;

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

    public static GetRepoTagLayersRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepoTagLayersRequest self = new GetRepoTagLayersRequest();
        return TeaModel.build(map, self);
    }

    public GetRepoTagLayersRequest setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

    public GetRepoTagLayersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRepoTagLayersRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public GetRepoTagLayersRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
