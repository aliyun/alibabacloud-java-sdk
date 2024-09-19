// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDeploymentShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ObjectIds")
    public String objectIdsShrink;

    /**
     * <p>项目Id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
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

    public CreateDeploymentShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
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
