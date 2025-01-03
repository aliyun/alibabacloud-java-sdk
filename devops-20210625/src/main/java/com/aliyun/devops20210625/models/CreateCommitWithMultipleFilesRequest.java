// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateCommitWithMultipleFilesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f0b1e61db5961df5975a93f9129d2513</p>
     */
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("actions")
    public java.util.List<CreateCommitWithMultipleFilesRequestActions> actions;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>master</p>
     */
    @NameInMap("branch")
    public String branch;

    /**
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("commitMessage")
    public String commitMessage;

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

    public static CreateCommitWithMultipleFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCommitWithMultipleFilesRequest self = new CreateCommitWithMultipleFilesRequest();
        return TeaModel.build(map, self);
    }

    public CreateCommitWithMultipleFilesRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CreateCommitWithMultipleFilesRequest setActions(java.util.List<CreateCommitWithMultipleFilesRequestActions> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<CreateCommitWithMultipleFilesRequestActions> getActions() {
        return this.actions;
    }

    public CreateCommitWithMultipleFilesRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public CreateCommitWithMultipleFilesRequest setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }
    public String getCommitMessage() {
        return this.commitMessage;
    }

    public CreateCommitWithMultipleFilesRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public CreateCommitWithMultipleFilesRequest setRepositoryIdentity(String repositoryIdentity) {
        this.repositoryIdentity = repositoryIdentity;
        return this;
    }
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

    public static class CreateCommitWithMultipleFilesRequestActions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>create</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>src/test.java</p>
         */
        @NameInMap("filePath")
        public String filePath;

        /**
         * <strong>example:</strong>
         * <p>src/main/test.java</p>
         */
        @NameInMap("previousPath")
        public String previousPath;

        public static CreateCommitWithMultipleFilesRequestActions build(java.util.Map<String, ?> map) throws Exception {
            CreateCommitWithMultipleFilesRequestActions self = new CreateCommitWithMultipleFilesRequestActions();
            return TeaModel.build(map, self);
        }

        public CreateCommitWithMultipleFilesRequestActions setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CreateCommitWithMultipleFilesRequestActions setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateCommitWithMultipleFilesRequestActions setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public CreateCommitWithMultipleFilesRequestActions setPreviousPath(String previousPath) {
            this.previousPath = previousPath;
            return this;
        }
        public String getPreviousPath() {
            return this.previousPath;
        }

    }

}
