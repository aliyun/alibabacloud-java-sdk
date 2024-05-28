// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListMergeRequestCommentsRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("commentType")
    public String commentType;

    @NameInMap("filePath")
    public String filePath;

    @NameInMap("patchSetBizIds")
    public java.util.List<String> patchSetBizIds;

    @NameInMap("resolved")
    public Boolean resolved;

    @NameInMap("state")
    public String state;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("localId")
    public Long localId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("repositoryIdentity")
    public String repositoryIdentity;

    public static ListMergeRequestCommentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMergeRequestCommentsRequest self = new ListMergeRequestCommentsRequest();
        return TeaModel.build(map, self);
    }

    public ListMergeRequestCommentsRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListMergeRequestCommentsRequest setCommentType(String commentType) {
        this.commentType = commentType;
        return this;
    }
    public String getCommentType() {
        return this.commentType;
    }

    public ListMergeRequestCommentsRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public ListMergeRequestCommentsRequest setPatchSetBizIds(java.util.List<String> patchSetBizIds) {
        this.patchSetBizIds = patchSetBizIds;
        return this;
    }
    public java.util.List<String> getPatchSetBizIds() {
        return this.patchSetBizIds;
    }

    public ListMergeRequestCommentsRequest setResolved(Boolean resolved) {
        this.resolved = resolved;
        return this;
    }
    public Boolean getResolved() {
        return this.resolved;
    }

    public ListMergeRequestCommentsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListMergeRequestCommentsRequest setLocalId(Long localId) {
        this.localId = localId;
        return this;
    }
    public Long getLocalId() {
        return this.localId;
    }

    public ListMergeRequestCommentsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListMergeRequestCommentsRequest setRepositoryIdentity(String repositoryIdentity) {
        this.repositoryIdentity = repositoryIdentity;
        return this;
    }
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

}
