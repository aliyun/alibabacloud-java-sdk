// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateCodeSourceRequest extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("CodeBranch")
    public String codeBranch;

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

    @NameInMap("MountPath")
    public String mountPath;

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

    public CreateCodeSourceRequest setCodeBranch(String codeBranch) {
        this.codeBranch = codeBranch;
        return this;
    }
    public String getCodeBranch() {
        return this.codeBranch;
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
