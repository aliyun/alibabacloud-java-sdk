// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class DeleteWorkflowDefinitionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
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
