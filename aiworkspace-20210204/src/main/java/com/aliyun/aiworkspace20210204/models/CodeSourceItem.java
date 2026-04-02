// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CodeSourceItem extends TeaModel {
    /**
     * <p>The visibility of the code source. Valid values:</p>
     * <ul>
     * <li>PRIVATE: Visible only to you and the administrator in the workspace.</li>
     * <li>PUBLIC: Visible to all users in the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

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
     * <p>The code commit ID</p>
     * 
     * <strong>example:</strong>
     * <p>44da10**********</p>
     */
    @NameInMap("CodeCommit")
    public String codeCommit;

    /**
     * <p>The address of the code repository.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://code.aliyun.com/">https://code.aliyun.com/</a>****</p>
     */
    @NameInMap("CodeRepo")
    public String codeRepo;

    /**
     * <p>The token used to access the code repository.</p>
     */
    @NameInMap("CodeRepoAccessToken")
    public String codeRepoAccessToken;

    /**
     * <p>The username of the code repository.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("CodeRepoUserName")
    public String codeRepoUserName;

    /**
     * <p>The code source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>code-202**********</p>
     */
    @NameInMap("CodeSourceId")
    public String codeSourceId;

    /**
     * <p>The code source description.</p>
     * 
     * <strong>example:</strong>
     * <p>code source of dlc examples</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The code source name.</p>
     * 
     * <strong>example:</strong>
     * <p>MyCodeSourceName1</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-18T12:52:15Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The last modified time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-18T12:52:15Z</p>
     */
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    /**
     * <p>The local mount path of the code.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/code/</p>
     */
    @NameInMap("MountPath")
    public String mountPath;

    /**
     * <p>The ID of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>1157290171663117</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CodeSourceItem build(java.util.Map<String, ?> map) throws Exception {
        CodeSourceItem self = new CodeSourceItem();
        return TeaModel.build(map, self);
    }

    public CodeSourceItem setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CodeSourceItem setCloneType(Integer cloneType) {
        this.cloneType = cloneType;
        return this;
    }
    public Integer getCloneType() {
        return this.cloneType;
    }

    public CodeSourceItem setCodeBranch(String codeBranch) {
        this.codeBranch = codeBranch;
        return this;
    }
    public String getCodeBranch() {
        return this.codeBranch;
    }

    public CodeSourceItem setCodeCommit(String codeCommit) {
        this.codeCommit = codeCommit;
        return this;
    }
    public String getCodeCommit() {
        return this.codeCommit;
    }

    public CodeSourceItem setCodeRepo(String codeRepo) {
        this.codeRepo = codeRepo;
        return this;
    }
    public String getCodeRepo() {
        return this.codeRepo;
    }

    public CodeSourceItem setCodeRepoAccessToken(String codeRepoAccessToken) {
        this.codeRepoAccessToken = codeRepoAccessToken;
        return this;
    }
    public String getCodeRepoAccessToken() {
        return this.codeRepoAccessToken;
    }

    public CodeSourceItem setCodeRepoUserName(String codeRepoUserName) {
        this.codeRepoUserName = codeRepoUserName;
        return this;
    }
    public String getCodeRepoUserName() {
        return this.codeRepoUserName;
    }

    public CodeSourceItem setCodeSourceId(String codeSourceId) {
        this.codeSourceId = codeSourceId;
        return this;
    }
    public String getCodeSourceId() {
        return this.codeSourceId;
    }

    public CodeSourceItem setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CodeSourceItem setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CodeSourceItem setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public CodeSourceItem setGmtModifyTime(String gmtModifyTime) {
        this.gmtModifyTime = gmtModifyTime;
        return this;
    }
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    public CodeSourceItem setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

    public CodeSourceItem setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CodeSourceItem setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
