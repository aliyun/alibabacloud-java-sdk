// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDeploymentShrinkRequest extends TeaModel {
    /**
     * <p>The description of the process.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a OdpsSQL-node publishing process. The function is XXXX.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The IDs of entities to which you want to apply the process.</p>
     * <blockquote>
     * <p> A process can be applied to only a single entity and its child entities. If you specify multiple entities in the array, the process is applied only to the first entity in the array and its child entities. Make sure that the array in your request contains only one element. Extra elements will be ignored.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ObjectIds")
    public String objectIdsShrink;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Specifies whether to deploy or undeploy the entity. Valid values:</p>
     * <ul>
     * <li>Online: deploys the entity.</li>
     * <li>Offline: undeploys the entity.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Online</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateDeploymentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentShrinkRequest self = new CreateDeploymentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDeploymentShrinkRequest setObjectIdsShrink(String objectIdsShrink) {
        this.objectIdsShrink = objectIdsShrink;
        return this;
    }
    public String getObjectIdsShrink() {
        return this.objectIdsShrink;
    }

    public CreateDeploymentShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDeploymentShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
