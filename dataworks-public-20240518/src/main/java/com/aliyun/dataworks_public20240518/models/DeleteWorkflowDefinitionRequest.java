// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteWorkflowDefinitionRequest extends TeaModel {
    /**
     * <p>The unique identifier of the data development workflow.</p>
     * <blockquote>
     * <p>Notice: This field was of the Long type in SDK versions earlier than 8.0.0 and is of the String type in SDK 8.0.0 and later. <strong>This change does not affect normal SDK usage, and the parameter is still returned in the type defined in the SDK</strong>. Only when you upgrade the SDK across version 8.0.0, the type change may cause project compilation failures, and you need to manually correct the data type.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>860438872620113XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace configuration page to obtain the workspace ID.</p>
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

    public DeleteWorkflowDefinitionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
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
