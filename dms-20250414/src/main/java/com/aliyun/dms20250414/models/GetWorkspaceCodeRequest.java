// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetWorkspaceCodeRequest extends TeaModel {
    /**
     * <p>If the file is a JSON file and Iac is set to true, the returned content is converted from JSON format to YAML format.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Iac")
    public String iac;

    /**
     * <p>The code file path: /Workspace/code/test.py
     * Request path.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/Workspace/code/default/test.ipynb</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The workspace ID.</p>
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
