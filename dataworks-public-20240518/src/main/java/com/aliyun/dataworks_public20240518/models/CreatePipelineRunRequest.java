// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreatePipelineRunRequest extends TeaModel {
    /**
     * <p>The code of the stage to which the deployment process runs. This parameter takes effect only when the RunMode parameter is set to Auto. After the deployment process is created, it automatically runs to the specified stage.</p>
     * <blockquote>
     * <p>Notice: The specified stage is automatically completed. For example, if you set this parameter to DEV, the automatic running stops after the DEV stage reaches the desired state.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DEV</p>
     */
    @NameInMap("AutoRunUntilStage")
    public String autoRunUntilStage;

    /**
     * <p>The description of the deployment process.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a OdpsSQL-node publishing process. The function is XXXX.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of entity IDs to be deployed in this deployment process.</p>
     * <blockquote>
     * <p>Notice: Currently, only a single entity and its child entities can be deployed. Therefore, only the first entity and its child entities in the array are deployed. Make sure that the array contains only one element. Additional elements are ignored.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ObjectIds")
    public java.util.List<String> objectIds;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Configuration page to obtain the workspace ID.
     * This parameter specifies the DataWorks workspace on which the API operation is performed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The running mode of the deployment process. Default value: Normal. If you set this parameter to Auto, the deployment process automatically runs to the specified stage. This parameter must be used together with the AutoRunUntilStage parameter.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Normal</li>
     * <li>Auto</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("RunMode")
    public String runMode;

    /**
     * <p>Specifies the type of the deployment process.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Online: Goes online.</li>
     * <li>Offline: Goes offline.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Online</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreatePipelineRunRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineRunRequest self = new CreatePipelineRunRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelineRunRequest setAutoRunUntilStage(String autoRunUntilStage) {
        this.autoRunUntilStage = autoRunUntilStage;
        return this;
    }
    public String getAutoRunUntilStage() {
        return this.autoRunUntilStage;
    }

    public CreatePipelineRunRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePipelineRunRequest setObjectIds(java.util.List<String> objectIds) {
        this.objectIds = objectIds;
        return this;
    }
    public java.util.List<String> getObjectIds() {
        return this.objectIds;
    }

    public CreatePipelineRunRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreatePipelineRunRequest setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

    public CreatePipelineRunRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
