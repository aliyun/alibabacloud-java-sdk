// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetMergeRequestChangeTreeRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("fromPatchSetBizId")
    public String fromPatchSetBizId;

    @NameInMap("localId")
    public Long localId;

    @NameInMap("organizationId")
    public String organizationId;

    @NameInMap("repositoryIdentity")
    public String repositoryIdentity;

    @NameInMap("toPatchSetBizId")
    public String toPatchSetBizId;

    public static GetMergeRequestChangeTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMergeRequestChangeTreeRequest self = new GetMergeRequestChangeTreeRequest();
        return TeaModel.build(map, self);
    }

    public GetMergeRequestChangeTreeRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetMergeRequestChangeTreeRequest setFromPatchSetBizId(String fromPatchSetBizId) {
        this.fromPatchSetBizId = fromPatchSetBizId;
        return this;
    }
    public String getFromPatchSetBizId() {
        return this.fromPatchSetBizId;
    }

    public GetMergeRequestChangeTreeRequest setLocalId(Long localId) {
        this.localId = localId;
        return this;
    }
    public Long getLocalId() {
        return this.localId;
    }

    public GetMergeRequestChangeTreeRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetMergeRequestChangeTreeRequest setRepositoryIdentity(String repositoryIdentity) {
        this.repositoryIdentity = repositoryIdentity;
        return this;
    }
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

    public GetMergeRequestChangeTreeRequest setToPatchSetBizId(String toPatchSetBizId) {
        this.toPatchSetBizId = toPatchSetBizId;
        return this;
    }
    public String getToPatchSetBizId() {
        return this.toPatchSetBizId;
    }

}
