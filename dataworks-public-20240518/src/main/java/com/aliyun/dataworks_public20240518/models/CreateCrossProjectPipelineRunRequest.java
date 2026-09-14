// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateCrossProjectPipelineRunRequest extends TeaModel {
    /**
     * <p>The cross-workspace deployment environment ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("DeploymentEnvironmentId")
    public Long deploymentEnvironmentId;

    /**
     * <p>The deployment description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a business process created through the API</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of top-level object IDs from the source project to deploy. The list must contain exactly one object. Child objects of composite objects such as workflows are automatically included by the system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1&quot;]</p>
     */
    @NameInMap("ObjectIds")
    public java.util.List<String> objectIds;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The deployment type. Valid values:</p>
     * <ul>
     * <li>Offline: Offline deployment.</li>
     * <li>Online: Online deployment.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Online</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateCrossProjectPipelineRunRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCrossProjectPipelineRunRequest self = new CreateCrossProjectPipelineRunRequest();
        return TeaModel.build(map, self);
    }

    public CreateCrossProjectPipelineRunRequest setDeploymentEnvironmentId(Long deploymentEnvironmentId) {
        this.deploymentEnvironmentId = deploymentEnvironmentId;
        return this;
    }
    public Long getDeploymentEnvironmentId() {
        return this.deploymentEnvironmentId;
    }

    public CreateCrossProjectPipelineRunRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCrossProjectPipelineRunRequest setObjectIds(java.util.List<String> objectIds) {
        this.objectIds = objectIds;
        return this;
    }
    public java.util.List<String> getObjectIds() {
        return this.objectIds;
    }

    public CreateCrossProjectPipelineRunRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateCrossProjectPipelineRunRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
