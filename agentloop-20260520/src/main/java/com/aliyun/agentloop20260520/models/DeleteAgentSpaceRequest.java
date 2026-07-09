// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DeleteAgentSpaceRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete the associated Hybrid Cloud Monitoring workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("deleteCmsWorkspace")
    public Boolean deleteCmsWorkspace;

    /**
     * <p>Specifies whether to delete the associated MSE namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("deleteMseNamespace")
    public Boolean deleteMseNamespace;

    /**
     * <p>Specifies whether to delete the associated SLS project.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("deleteSlsProject")
    public Boolean deleteSlsProject;

    public static DeleteAgentSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentSpaceRequest self = new DeleteAgentSpaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgentSpaceRequest setDeleteCmsWorkspace(Boolean deleteCmsWorkspace) {
        this.deleteCmsWorkspace = deleteCmsWorkspace;
        return this;
    }
    public Boolean getDeleteCmsWorkspace() {
        return this.deleteCmsWorkspace;
    }

    public DeleteAgentSpaceRequest setDeleteMseNamespace(Boolean deleteMseNamespace) {
        this.deleteMseNamespace = deleteMseNamespace;
        return this;
    }
    public Boolean getDeleteMseNamespace() {
        return this.deleteMseNamespace;
    }

    public DeleteAgentSpaceRequest setDeleteSlsProject(Boolean deleteSlsProject) {
        this.deleteSlsProject = deleteSlsProject;
        return this;
    }
    public Boolean getDeleteSlsProject() {
        return this.deleteSlsProject;
    }

}
