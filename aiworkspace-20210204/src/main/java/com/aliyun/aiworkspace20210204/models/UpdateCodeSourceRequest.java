// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateCodeSourceRequest extends TeaModel {
    /**
     * <p>The name of the code branch.</p>
     * 
     * <strong>example:</strong>
     * <p>dev</p>
     */
    @NameInMap("CodeBranch")
    public String codeBranch;

    /**
     * <p>The code commit ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3a6*****</p>
     */
    @NameInMap("CodeCommit")
    public String codeCommit;

    /**
     * <p>The address of the code repository.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://code.aliyun.com/">https://code.aliyun.com/</a>******</p>
     */
    @NameInMap("CodeRepo")
    public String codeRepo;

    /**
     * <p>The access token corresponding to the username.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("CodeRepoAccessToken")
    public String codeRepoAccessToken;

    /**
     * <p>The username used to access the code repository.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-user</p>
     */
    @NameInMap("CodeRepoUserName")
    public String codeRepoUserName;

    /**
     * <p>The description of the code build.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the code build.</p>
     * 
     * <strong>example:</strong>
     * <p>MyCodeSource1</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The default mount path.</p>
     * 
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
