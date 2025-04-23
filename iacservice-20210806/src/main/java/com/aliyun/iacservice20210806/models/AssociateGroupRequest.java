// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class AssociateGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>p-433aead7560571a87349d054b4</p>
     */
    @NameInMap("projectId")
    public String projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("resourceIds")
    public java.util.List<String> resourceIds;

    /**
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
