// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDevObjectDependencyRequest extends TeaModel {
    /**
     * <p>Development object source.</p>
     * <ul>
     * <li>BLACK_BOX: Logical table</li>
     * <li>DATA_PROCESS: Compute task</li>
     * <li>PIPELINE: Integration task</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DATA_PROCESS</p>
     */
    @NameInMap("ObjectFrom")
    public String objectFrom;

    /**
     * <p>Object ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7026498387616064</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>Development object type.</p>
     * <ul>
     * <li>FILE_ID: Task FileId</li>
     * <li>MODEL_ID: Logical table</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7026498387616064</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>Tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>Project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7021037162911616L</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetDevObjectDependencyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDevObjectDependencyRequest self = new GetDevObjectDependencyRequest();
        return TeaModel.build(map, self);
    }

    public GetDevObjectDependencyRequest setObjectFrom(String objectFrom) {
        this.objectFrom = objectFrom;
        return this;
    }
    public String getObjectFrom() {
        return this.objectFrom;
    }

    public GetDevObjectDependencyRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public GetDevObjectDependencyRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public GetDevObjectDependencyRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetDevObjectDependencyRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
