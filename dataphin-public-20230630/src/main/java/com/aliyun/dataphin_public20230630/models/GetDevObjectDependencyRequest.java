// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDevObjectDependencyRequest extends TeaModel {
    /**
     * <p>The object source. Valid values:</p>
     * <ul>
     * <li>BLACK_BOX: logical table</li>
     * <li>DATA_PROCESS: computing node</li>
     * <li>PIPELINE: integration node</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DATA_PROCESS</p>
     */
    @NameInMap("ObjectFrom")
    public String objectFrom;

    /**
     * <p>The object ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7026498387616064</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The object type. Valid values:</p>
     * <ul>
     * <li>FILE_ID: file ID of a node</li>
     * <li>MODEL_ID: logical table</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7026498387616064</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The operator ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The project ID.</p>
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

    public GetDevObjectDependencyRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public GetDevObjectDependencyRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
