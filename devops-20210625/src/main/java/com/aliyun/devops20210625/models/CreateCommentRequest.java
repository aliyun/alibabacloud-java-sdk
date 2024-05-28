// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateCommentRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("commentType")
    public String commentType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("content")
    public String content;

    @NameInMap("draft")
    public Boolean draft;

    @NameInMap("filePath")
    public String filePath;

    @NameInMap("lineNumber")
    public Integer lineNumber;

    @NameInMap("parentCommentBizId")
    public String parentCommentBizId;

    @NameInMap("patchSetBizId")
    public String patchSetBizId;

    @NameInMap("resolved")
    public Boolean resolved;

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

    public static CreateCommentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCommentRequest self = new CreateCommentRequest();
        return TeaModel.build(map, self);
    }

    public CreateCommentRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CreateCommentRequest setCommentType(String commentType) {
        this.commentType = commentType;
        return this;
    }
    public String getCommentType() {
        return this.commentType;
    }

    public CreateCommentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateCommentRequest setDraft(Boolean draft) {
        this.draft = draft;
        return this;
    }
    public Boolean getDraft() {
        return this.draft;
    }

    public CreateCommentRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CreateCommentRequest setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }
    public Integer getLineNumber() {
        return this.lineNumber;
    }

    public CreateCommentRequest setParentCommentBizId(String parentCommentBizId) {
        this.parentCommentBizId = parentCommentBizId;
        return this;
    }
    public String getParentCommentBizId() {
        return this.parentCommentBizId;
    }

    public CreateCommentRequest setPatchSetBizId(String patchSetBizId) {
        this.patchSetBizId = patchSetBizId;
        return this;
    }
    public String getPatchSetBizId() {
        return this.patchSetBizId;
    }

    public CreateCommentRequest setResolved(Boolean resolved) {
        this.resolved = resolved;
        return this;
    }
    public Boolean getResolved() {
        return this.resolved;
    }

    public CreateCommentRequest setLocalId(Long localId) {
        this.localId = localId;
        return this;
    }
    public Long getLocalId() {
        return this.localId;
    }

    public CreateCommentRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public CreateCommentRequest setRepositoryIdentity(String repositoryIdentity) {
        this.repositoryIdentity = repositoryIdentity;
        return this;
    }
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

}
