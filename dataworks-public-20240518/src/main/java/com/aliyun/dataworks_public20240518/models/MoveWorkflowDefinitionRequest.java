// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class MoveWorkflowDefinitionRequest extends TeaModel {
    /**
     * <p>The unique identifier of the Data Studio workflow.</p>
     * <blockquote>
     * <p> This field is of the Long type in SDK versions prior to 8.0.0, and of the String type in SDK versions 8.0.0 and later. This change does not affect normal SDK usage; the parameter will still be returned according to the type defined in the SDK. However, compilation failures may occur due to the type change only when upgrading the SDK across version 8.0.0. In this case, you must manually update the data type.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>543217824470354XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The path to which you want to move the workflow. You do not need to specify a workflow name in the path.</p>
     * <p>For example, if you want to move the test workflow to root/demo/test, you must set this parameter to root/demo.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>root/demo</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the ID. This parameter indicates the DataWorks workspace to which the API operation is applied.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static MoveWorkflowDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveWorkflowDefinitionRequest self = new MoveWorkflowDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public MoveWorkflowDefinitionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public MoveWorkflowDefinitionRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public MoveWorkflowDefinitionRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
