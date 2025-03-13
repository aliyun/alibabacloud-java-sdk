// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateCommentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f0b1e61db5961df5975a93f9129d2513</p>
     */
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GLOBAL_COMMENT</p>
     */
    @NameInMap("commentType")
    public String commentType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("draft")
    public Boolean draft;

    /**
     * <strong>example:</strong>
     * <p>/src/main/test.java</p>
     */
    @NameInMap("filePath")
    public String filePath;

    @NameInMap("fromPachSetBizId")
    public String fromPachSetBizId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("lineNumber")
    public Integer lineNumber;

    /**
     * <strong>example:</strong>
     * <p>2666ac1ac53841b0ba1b042e383279cc</p>
     */
    @NameInMap("parentCommentBizId")
    public String parentCommentBizId;

    /**
     * <strong>example:</strong>
     * <p>b7d8386be17c4ca68a07140db4836257</p>
     */
    @NameInMap("patchSetBizId")
    public String patchSetBizId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("resolved")
    public Boolean resolved;

    @NameInMap("toPatchSetBizId")
    public String toPatchSetBizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("localId")
    public Long localId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5ebbc0228123212b59xxxxx</p>
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

    public CreateCommentRequest setFromPachSetBizId(String fromPachSetBizId) {
        this.fromPachSetBizId = fromPachSetBizId;
        return this;
    }
    public String getFromPachSetBizId() {
        return this.fromPachSetBizId;
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

    public CreateCommentRequest setToPatchSetBizId(String toPatchSetBizId) {
        this.toPatchSetBizId = toPatchSetBizId;
        return this;
    }
    public String getToPatchSetBizId() {
        return this.toPatchSetBizId;
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
