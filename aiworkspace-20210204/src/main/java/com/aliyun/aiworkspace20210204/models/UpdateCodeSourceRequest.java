// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateCodeSourceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dev</p>
     */
    @NameInMap("CodeBranch")
    public String codeBranch;

    @NameInMap("CodeCommit")
    public String codeCommit;

    @NameInMap("CodeRepo")
    public String codeRepo;

    @NameInMap("CodeRepoAccessToken")
    public String codeRepoAccessToken;

    @NameInMap("CodeRepoUserName")
    public String codeRepoUserName;

    @NameInMap("Description")
    public String description;

    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>/root/code/code-source-1</p>
     */
    @NameInMap("MountPath")
    public String mountPath;

    public static UpdateCodeSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCodeSourceRequest self = new UpdateCodeSourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCodeSourceRequest setCodeBranch(String codeBranch) {
        this.codeBranch = codeBranch;
        return this;
    }
    public String getCodeBranch() {
        return this.codeBranch;
    }

    public UpdateCodeSourceRequest setCodeCommit(String codeCommit) {
        this.codeCommit = codeCommit;
        return this;
    }
    public String getCodeCommit() {
        return this.codeCommit;
    }

    public UpdateCodeSourceRequest setCodeRepo(String codeRepo) {
        this.codeRepo = codeRepo;
        return this;
    }
    public String getCodeRepo() {
        return this.codeRepo;
    }

    public UpdateCodeSourceRequest setCodeRepoAccessToken(String codeRepoAccessToken) {
        this.codeRepoAccessToken = codeRepoAccessToken;
        return this;
    }
    public String getCodeRepoAccessToken() {
        return this.codeRepoAccessToken;
    }

    public UpdateCodeSourceRequest setCodeRepoUserName(String codeRepoUserName) {
        this.codeRepoUserName = codeRepoUserName;
        return this;
    }
    public String getCodeRepoUserName() {
        return this.codeRepoUserName;
    }

    public UpdateCodeSourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCodeSourceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateCodeSourceRequest setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

}
