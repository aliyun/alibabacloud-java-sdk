// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class AssociateParameterSetRequest extends TeaModel {
    /**
     * <p>The list of parameter set IDs to associate with the resource. Maximum length: 5.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("parameterSetIds")
    public java.util.List<String> parameterSetIds;

    /**
     * <p>The resource ID. When the resource type is ModuleVersion, the value is a concatenation of <moduleId>-<moduleversion>, such as mod-34535345df123fr-v3.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task-433aead756057ffdf5326bf1e12ed</p>
     */
    @NameInMap("resourceId")
    public String resourceId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li>Module: template</li>
     * <li>ModuleVersion: template version</li>
     * <li>Task: node</li>
     * <li>Stack: resource stack.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Task</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static AssociateParameterSetRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateParameterSetRequest self = new AssociateParameterSetRequest();
        return TeaModel.build(map, self);
    }

    public AssociateParameterSetRequest setParameterSetIds(java.util.List<String> parameterSetIds) {
        this.parameterSetIds = parameterSetIds;
        return this;
    }
    public java.util.List<String> getParameterSetIds() {
        return this.parameterSetIds;
    }

    public AssociateParameterSetRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public AssociateParameterSetRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
