// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserDocumentPermissionRequest extends TeaModel {
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
    public GetUserDocumentPermissionRequestTenantContext tenantContext;

    public static GetUserDocumentPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserDocumentPermissionRequest self = new GetUserDocumentPermissionRequest();
        return TeaModel.build(map, self);
    }

    public GetUserDocumentPermissionRequest setDentryId(Long dentryId) {
        this.dentryId = dentryId;
        return this;
    }
    public Long getDentryId() {
        return this.dentryId;
    }

    public GetUserDocumentPermissionRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public GetUserDocumentPermissionRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public GetUserDocumentPermissionRequest setSpaceId(Long spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public Long getSpaceId() {
        return this.spaceId;
    }

    public GetUserDocumentPermissionRequest setTenantContext(GetUserDocumentPermissionRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetUserDocumentPermissionRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetUserDocumentPermissionRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetUserDocumentPermissionRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetUserDocumentPermissionRequestTenantContext self = new GetUserDocumentPermissionRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetUserDocumentPermissionRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
