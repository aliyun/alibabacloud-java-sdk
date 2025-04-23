// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CloneGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>p-433aead7560571a87349d054b4</p>
     */
    @NameInMap("projectId")
    public String projectId;

    @NameInMap("resourceTypes")
    public java.util.List<String> resourceTypes;

    public static CloneGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneGroupRequest self = new CloneGroupRequest();
        return TeaModel.build(map, self);
    }

    public CloneGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CloneGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CloneGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CloneGroupRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CloneGroupRequest setResourceTypes(java.util.List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

}
