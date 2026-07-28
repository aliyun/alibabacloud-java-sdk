// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DissociateParameterSetRequest extends TeaModel {
    /**
     * <p>The list of parameter set IDs to be associated with the resource. Maximum length: 5.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("parameterSetIds")
    public java.util.List<String> parameterSetIds;

    /**
     * <p>The resource ID. If the resource type is ModuleVersion, the value is a combination of <moduleId>-<moduleversion>, such as mod-34535345df123fr-v3.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mod-39cd1e5e58c50e79dd8cd901cd</p>
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
     * <p>Module</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static DissociateParameterSetRequest build(java.util.Map<String, ?> map) throws Exception {
        DissociateParameterSetRequest self = new DissociateParameterSetRequest();
        return TeaModel.build(map, self);
    }

    public DissociateParameterSetRequest setParameterSetIds(java.util.List<String> parameterSetIds) {
        this.parameterSetIds = parameterSetIds;
        return this;
    }
    public java.util.List<String> getParameterSetIds() {
        return this.parameterSetIds;
    }

    public DissociateParameterSetRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DissociateParameterSetRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
