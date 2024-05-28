// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateFileRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("branchName")
    public String branchName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("commitMessage")
    public String commitMessage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("content")
    public String content;

    @NameInMap("encoding")
    public String encoding;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("newPath")
    public String newPath;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("oldPath")
    public String oldPath;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static UpdateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileRequest self = new UpdateFileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public UpdateFileRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public UpdateFileRequest setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }
    public String getCommitMessage() {
        return this.commitMessage;
    }

    public UpdateFileRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateFileRequest setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    public String getEncoding() {
        return this.encoding;
    }

    public UpdateFileRequest setNewPath(String newPath) {
        this.newPath = newPath;
        return this;
    }
    public String getNewPath() {
        return this.newPath;
    }

    public UpdateFileRequest setOldPath(String oldPath) {
        this.oldPath = oldPath;
        return this;
    }
    public String getOldPath() {
        return this.oldPath;
    }

    public UpdateFileRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
