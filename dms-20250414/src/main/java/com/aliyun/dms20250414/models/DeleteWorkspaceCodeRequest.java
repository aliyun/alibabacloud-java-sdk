// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceCodeRequest extends TeaModel {
    /**
     * <p>The full path of the code file or directory. The path must be prefixed with <code>/Workspace/code/</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/Workspace/code/default/test.ipynb</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The repository information.</p>
     * 
     * <strong>example:</strong>
     * <p>database/adb</p>
     */
    @NameInMap("Repo")
    public String repo;

    /**
     * <p>Specifies whether the item to delete is a symbolic link.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Symlink")
    public Boolean symlink;

    /**
     * <p>The ID of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteWorkspaceCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceCodeRequest self = new DeleteWorkspaceCodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceCodeRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DeleteWorkspaceCodeRequest setRepo(String repo) {
        this.repo = repo;
        return this;
    }
    public String getRepo() {
        return this.repo;
    }

    public DeleteWorkspaceCodeRequest setSymlink(Boolean symlink) {
        this.symlink = symlink;
        return this;
    }
    public Boolean getSymlink() {
        return this.symlink;
    }

    public DeleteWorkspaceCodeRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
