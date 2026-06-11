// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SaveWorkspaceCodeRequest extends TeaModel {
    /**
     * <p>The content of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Description: \&quot;Example template, describe instances in some status\&quot;nFormatVersion: OOS-2019-06-01nTasks:n  - Name: SleepTaskn    Action: ACS::Sleepn    Properties:n      Duration: PT1Mn</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Specifies whether to overwrite the file if it already exists. The default value is <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>Specifies whether the file is an IaC template.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Iac")
    public Boolean iac;

    /**
     * <p>The modification time of the file.</p>
     * <p>The time must be in the ISO 8601 format: <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T10:11:12Z</p>
     */
    @NameInMap("Mtime")
    public String mtime;

    /**
     * <p>The publishing configuration, specified as a JSON string. The <code>repos</code> array specifies the target repository and branch. The <code>exclude</code> array specifies the directories to ignore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;repos&quot;:[{&quot;repo&quot;:&quot;<a href="mailto:git@xxxx.git">git@xxxx.git</a>&quot;, &quot;branch&quot;:&quot;master&quot;}], &quot;exclude&quot;:[&quot;/.dms&quot;, &quot;/username&quot;]}</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>Information about the repository.</p>
     * 
     * <strong>example:</strong>
     * <p>computing/ecs</p>
     */
    @NameInMap("Repo")
    public String repo;

    /**
     * <p>The ID of the workspace.</p>
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
