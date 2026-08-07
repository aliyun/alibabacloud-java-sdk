// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserDocumentPermissionShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>87654321</p>
     */
    @NameInMap("DentryId")
    public Long dentryId;

    /**
     * <strong>example:</strong>
     * <p>a9E05BDRVQRkezKGCDOvkbzrJ63zgkYA</p>
     */
    @NameInMap("DentryUuid")
    public String dentryUuid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ResourceType")
    public Integer resourceType;

    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("SpaceId")
    public Long spaceId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static GetUserDocumentPermissionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserDocumentPermissionShrinkRequest self = new GetUserDocumentPermissionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetUserDocumentPermissionShrinkRequest setDentryId(Long dentryId) {
        this.dentryId = dentryId;
        return this;
    }
    public Long getDentryId() {
        return this.dentryId;
    }

    public GetUserDocumentPermissionShrinkRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public GetUserDocumentPermissionShrinkRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public GetUserDocumentPermissionShrinkRequest setSpaceId(Long spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public Long getSpaceId() {
        return this.spaceId;
    }

    public GetUserDocumentPermissionShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
