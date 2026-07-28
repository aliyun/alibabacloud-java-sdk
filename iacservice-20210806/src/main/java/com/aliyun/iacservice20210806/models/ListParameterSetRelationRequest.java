// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListParameterSetRelationRequest extends TeaModel {
    /**
     * <p>The ID of the resource. For ModuleVersion, concatenate <moduleId>-<versionId>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mod-edf123fr-v3</p>
     */
    @NameInMap("resourceId")
    public String resourceId;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <ul>
     * <li>Module</li>
     * <li>ModuleVersion</li>
     * <li>Task</li>
     * <li>SceneTestingTask</li>
     * <li>Stack.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Module</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static ListParameterSetRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListParameterSetRelationRequest self = new ListParameterSetRelationRequest();
        return TeaModel.build(map, self);
    }

    public ListParameterSetRelationRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListParameterSetRelationRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
