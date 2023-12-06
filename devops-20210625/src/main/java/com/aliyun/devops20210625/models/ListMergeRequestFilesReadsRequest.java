// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListMergeRequestFilesReadsRequest extends TeaModel {
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

    public static ListMergeRequestFilesReadsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMergeRequestFilesReadsRequest self = new ListMergeRequestFilesReadsRequest();
        return TeaModel.build(map, self);
    }

    public ListMergeRequestFilesReadsRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListMergeRequestFilesReadsRequest setFromPatchSetBizId(String fromPatchSetBizId) {
        this.fromPatchSetBizId = fromPatchSetBizId;
        return this;
    }
    public String getFromPatchSetBizId() {
        return this.fromPatchSetBizId;
    }

    public ListMergeRequestFilesReadsRequest setLocalId(Long localId) {
        this.localId = localId;
        return this;
    }
    public Long getLocalId() {
        return this.localId;
    }

    public ListMergeRequestFilesReadsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListMergeRequestFilesReadsRequest setRepositoryIdentity(String repositoryIdentity) {
        this.repositoryIdentity = repositoryIdentity;
        return this;
    }
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

    public ListMergeRequestFilesReadsRequest setToPatchSetBizId(String toPatchSetBizId) {
        this.toPatchSetBizId = toPatchSetBizId;
        return this;
    }
    public String getToPatchSetBizId() {
        return this.toPatchSetBizId;
    }

}
