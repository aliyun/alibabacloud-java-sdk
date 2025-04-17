// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetCodeSourceResponseBody extends TeaModel {
    /**
     * <p>The visibility of the code source. Valid values:</p>
     * <ul>
     * <li>PRIVATE: Visible only to you and the administrator of the workspace.</li>
     * <li>PUBLIC: Visible to all members in the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The code repository branch.</p>
     * 
     * <strong>example:</strong>
     * <p>master</p>
     */
    @NameInMap("CodeBranch")
    public String codeBranch;

    /**
     * <p>The code commit ID.</p>
     * 
     * <strong>example:</strong>
     * <p>44da10***********</p>
     */
    @NameInMap("CodeCommit")
    public String codeCommit;

    /**
     * <p>The address of the code repository.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://code.aliyun.com/pai-dlc/examples.git">https://code.aliyun.com/pai-dlc/examples.git</a></p>
     */
    @NameInMap("CodeRepo")
    public String codeRepo;

    /**
     * <p>The token used to access the code repository.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("CodeRepoAccessToken")
    public String codeRepoAccessToken;

    /**
     * <p>The username of the code repository.</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("CodeRepoUserName")
    public String codeRepoUserName;

    /**
     * <p>The ID of the code source.</p>
     * 
     * <strong>example:</strong>
     * <p>code-202**********</p>
     */
    @NameInMap("CodeSourceId")
    public String codeSourceId;

    /**
     * <p>The description of the code source.</p>
     * 
     * <strong>example:</strong>
     * <p>This is my data source 1.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the code source.</p>
     * 
     * <strong>example:</strong>
     * <p>MyCodeSource1</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The time when the code source was created, in the ISO8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T23:36:01.123Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time when the code source was modified, in the ISO8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T23:36:01.123Z</p>
     */
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    /**
     * <p>The local mount path of the code.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/code</p>
     */
    @NameInMap("MountPath")
    public String mountPath;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>1722********</p>
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

    public static GetCodeSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCodeSourceResponseBody self = new GetCodeSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCodeSourceResponseBody setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetCodeSourceResponseBody setCodeBranch(String codeBranch) {
        this.codeBranch = codeBranch;
        return this;
    }
    public String getCodeBranch() {
        return this.codeBranch;
    }

    public GetCodeSourceResponseBody setCodeCommit(String codeCommit) {
        this.codeCommit = codeCommit;
        return this;
    }
    public String getCodeCommit() {
        return this.codeCommit;
    }

    public GetCodeSourceResponseBody setCodeRepo(String codeRepo) {
        this.codeRepo = codeRepo;
        return this;
    }
    public String getCodeRepo() {
        return this.codeRepo;
    }

    public GetCodeSourceResponseBody setCodeRepoAccessToken(String codeRepoAccessToken) {
        this.codeRepoAccessToken = codeRepoAccessToken;
        return this;
    }
    public String getCodeRepoAccessToken() {
        return this.codeRepoAccessToken;
    }

    public GetCodeSourceResponseBody setCodeRepoUserName(String codeRepoUserName) {
        this.codeRepoUserName = codeRepoUserName;
        return this;
    }
    public String getCodeRepoUserName() {
        return this.codeRepoUserName;
    }

    public GetCodeSourceResponseBody setCodeSourceId(String codeSourceId) {
        this.codeSourceId = codeSourceId;
        return this;
    }
    public String getCodeSourceId() {
        return this.codeSourceId;
    }

    public GetCodeSourceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetCodeSourceResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetCodeSourceResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetCodeSourceResponseBody setGmtModifyTime(String gmtModifyTime) {
        this.gmtModifyTime = gmtModifyTime;
        return this;
    }
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    public GetCodeSourceResponseBody setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

    public GetCodeSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCodeSourceResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetCodeSourceResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
