// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteDriveSpaceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("TenantContext")
    public DeleteDriveSpaceRequestTenantContext tenantContext;

    public static DeleteDriveSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDriveSpaceRequest self = new DeleteDriveSpaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDriveSpaceRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DeleteDriveSpaceRequest setTenantContext(DeleteDriveSpaceRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public DeleteDriveSpaceRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class DeleteDriveSpaceRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static DeleteDriveSpaceRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteDriveSpaceRequestTenantContext self = new DeleteDriveSpaceRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public DeleteDriveSpaceRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
