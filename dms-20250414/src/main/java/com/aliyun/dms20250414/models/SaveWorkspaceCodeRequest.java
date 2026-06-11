// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SaveWorkspaceCodeRequest extends TeaModel {
    /**
     * <p>The code content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>print(123)</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Specifies whether to forcibly overwrite the file. If set to true, the file is overwritten regardless of whether it has been modified by others.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>Specifies whether the file is an infrastructure as code template file. Set this parameter to true for YAML configuration files that are edited in the visual editor.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Iac")
    public Boolean iac;

    /**
     * <p>The file modification time. The GetWorkspaceCode operation returns this mtime value. When you call SaveWorkspaceCode, include this mtime value to check whether the file has been changed on the server. If the mtime values do not match, the save operation fails, which indicates that the server-side version has been modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T10:11:12Z</p>
     */
    @NameInMap("Mtime")
    public String mtime;

    /**
     * <p>The file path to save.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/Workspace/code/test.py</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The repository information. Specify this parameter when creating a git repository directory during the save operation.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:git@codeup.aliyun.com">git@codeup.aliyun.com</a>:test/abc.git</p>
     */
    @NameInMap("Repo")
    public String repo;

    /**
     * <p>The workspace ID (numeric ID).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SaveWorkspaceCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveWorkspaceCodeRequest self = new SaveWorkspaceCodeRequest();
        return TeaModel.build(map, self);
    }

    public SaveWorkspaceCodeRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SaveWorkspaceCodeRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public SaveWorkspaceCodeRequest setIac(Boolean iac) {
        this.iac = iac;
        return this;
    }
    public Boolean getIac() {
        return this.iac;
    }

    public SaveWorkspaceCodeRequest setMtime(String mtime) {
        this.mtime = mtime;
        return this;
    }
    public String getMtime() {
        return this.mtime;
    }

    public SaveWorkspaceCodeRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public SaveWorkspaceCodeRequest setRepo(String repo) {
        this.repo = repo;
        return this;
    }
    public String getRepo() {
        return this.repo;
    }

    public SaveWorkspaceCodeRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
