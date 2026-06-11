// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetWorkspaceCodeRequest extends TeaModel {
    /**
     * <p>If the file is in JSON format, set this parameter to <code>true</code> to convert the returned content to YAML format.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Iac")
    public String iac;

    /**
     * <p>The path to the code file. For example: <code>/Workspace/code/test.py</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/Workspace/code/default/test.ipynb</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The ID of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetWorkspaceCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceCodeRequest self = new GetWorkspaceCodeRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceCodeRequest setIac(String iac) {
        this.iac = iac;
        return this;
    }
    public String getIac() {
        return this.iac;
    }

    public GetWorkspaceCodeRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public GetWorkspaceCodeRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
