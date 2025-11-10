// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PutWorkspaceRequest extends TeaModel {
    /**
     * <p>Description of the workspace</p>
     * 
     * <strong>example:</strong>
     * <p>workspace test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Display name of the workspace</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>Name of the Log Service project</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sls-project-test-001</p>
     */
    @NameInMap("slsProject")
    public String slsProject;

    public static PutWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        PutWorkspaceRequest self = new PutWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public PutWorkspaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PutWorkspaceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public PutWorkspaceRequest setSlsProject(String slsProject) {
        this.slsProject = slsProject;
        return this;
    }
    public String getSlsProject() {
        return this.slsProject;
    }

}
