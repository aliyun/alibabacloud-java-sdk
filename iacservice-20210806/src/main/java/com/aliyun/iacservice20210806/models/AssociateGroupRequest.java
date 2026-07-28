// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class AssociateGroupRequest extends TeaModel {
    /**
     * <p>The idempotence token. Format: [0-9a-zA-Z-]{1,64}. Use a UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>p-433aead7560571a87349d054b4</p>
     */
    @NameInMap("projectId")
    public String projectId;

    /**
     * <p>The list of resource IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("resourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li>SceneTestingTask: scenario-based testing task.</li>
     * <li>Task: regular task.</li>
     * <li>Module: template.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Task</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static AssociateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateGroupRequest self = new AssociateGroupRequest();
        return TeaModel.build(map, self);
    }

    public AssociateGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateGroupRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AssociateGroupRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public AssociateGroupRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
