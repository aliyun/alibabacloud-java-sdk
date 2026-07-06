// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreatePipelineRunRequest extends TeaModel {
    /**
     * <p>The code of the stage in the publish process. This parameter takes effect only when RunMode is set to Auto. After the publish process is created, it automatically runs to the specified stage.</p>
     * <blockquote>
     * <p>Notice: The specified stage is automatically completed. For example, if you set this parameter to DEV, the automatic run stops after the DEV stage reaches the desired state.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DEV</p>
     */
    @NameInMap("AutoRunUntilStage")
    public String autoRunUntilStage;

    /**
     * <p>The description of the publish process.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a OdpsSQL-node publishing process. The function is XXXX.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of entity IDs that you want to publish in this publish process.</p>
     * <blockquote>
     * <p>Notice: Only a single entity and its child entities can be published at a time. Only the first entity in this array and its child entities are published. Make sure that the length of this array is 1. Entities beyond the first one are ignored.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ObjectIds")
    public java.util.List<String> objectIds;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace configuration page to obtain the workspace ID.
     * This parameter specifies the DataWorks workspace for this API call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The run mode of the publish process. Default value: Normal. If you set this parameter to Auto, the publish process is automatically driven to the specified stage. This parameter is used together with the AutoRunUntilStage parameter.</p>
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
     * <p>Specifies whether the publish process is used to bring an entity online or offline.</p>
     * <ul>
     * <li><p>Online: online</p>
     * </li>
     * <li><p>Offline: offline</p>
     * </li>
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
