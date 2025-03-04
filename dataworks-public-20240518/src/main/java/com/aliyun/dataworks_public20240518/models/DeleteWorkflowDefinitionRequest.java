// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteWorkflowDefinitionRequest extends TeaModel {
    /**
     * <p>The ID of the workflow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>860438872620113XXXX</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static DeleteWorkflowDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkflowDefinitionRequest self = new DeleteWorkflowDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkflowDefinitionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteWorkflowDefinitionRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
