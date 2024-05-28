// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateFileRequest extends TeaModel {
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
    @NameInMap("filePath")
    public String filePath;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static CreateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileRequest self = new CreateFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CreateFileRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public CreateFileRequest setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }
    public String getCommitMessage() {
        return this.commitMessage;
    }

    public CreateFileRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateFileRequest setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    public String getEncoding() {
        return this.encoding;
    }

    public CreateFileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CreateFileRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
