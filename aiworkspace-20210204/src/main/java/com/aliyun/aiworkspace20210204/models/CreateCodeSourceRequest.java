// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateCodeSourceRequest extends TeaModel {
    /**
     * <p>The visibility of the code configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The clone mode. Valid values:</p>
     * <ul>
     * <li>0 (default): creates a new subdirectory.</li>
     * <li>1: tiles to the current directory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CloneType")
    public Integer cloneType;

    /**
     * <p>The code branch.</p>
     * 
     * <strong>example:</strong>
     * <p>master</p>
     */
    @NameInMap("CodeBranch")
    public String codeBranch;

    /**
     * <p>The CommitID of the code. CodeCommit takes priority over CodeBranch. If you specify CodeCommit, CodeBranch does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>171de********a9d900d</p>
     */
    @NameInMap("CodeCommit")
    public String codeCommit;

    /**
     * <p>The URL of the code repository. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://code.aliyun.com/">https://code.aliyun.com/</a>******</p>
     */
    @NameInMap("CodeRepo")
    public String codeRepo;

    /**
     * <p>The access token of the code repository.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("CodeRepoAccessToken")
    public String codeRepoAccessToken;

    /**
     * <p>The username of the code repository.</p>
     * 
     * <strong>example:</strong>
     * <p>use***</p>
     */
    @NameInMap("CodeRepoUserName")
    public String codeRepoUserName;

    /**
     * <p>The description of the code configuration, which helps distinguish different code configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>code source of dlc examples</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the code configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyCodeSource1</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The local mount directory for the code. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/code/code-source-1</p>
     */
    @NameInMap("MountPath")
    public String mountPath;

    /**
     * <p>The workspace ID. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateCodeSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCodeSourceRequest self = new CreateCodeSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateCodeSourceRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreateCodeSourceRequest setCloneType(Integer cloneType) {
        this.cloneType = cloneType;
        return this;
    }
    public Integer getCloneType() {
        return this.cloneType;
    }

    public CreateCodeSourceRequest setCodeBranch(String codeBranch) {
        this.codeBranch = codeBranch;
        return this;
    }
    public String getCodeBranch() {
        return this.codeBranch;
    }

    public CreateCodeSourceRequest setCodeCommit(String codeCommit) {
        this.codeCommit = codeCommit;
        return this;
    }
    public String getCodeCommit() {
        return this.codeCommit;
    }

    public CreateCodeSourceRequest setCodeRepo(String codeRepo) {
        this.codeRepo = codeRepo;
        return this;
    }
    public String getCodeRepo() {
        return this.codeRepo;
    }

    public CreateCodeSourceRequest setCodeRepoAccessToken(String codeRepoAccessToken) {
        this.codeRepoAccessToken = codeRepoAccessToken;
        return this;
    }
    public String getCodeRepoAccessToken() {
        return this.codeRepoAccessToken;
    }

    public CreateCodeSourceRequest setCodeRepoUserName(String codeRepoUserName) {
        this.codeRepoUserName = codeRepoUserName;
        return this;
    }
    public String getCodeRepoUserName() {
        return this.codeRepoUserName;
    }

    public CreateCodeSourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCodeSourceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateCodeSourceRequest setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

    public CreateCodeSourceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
