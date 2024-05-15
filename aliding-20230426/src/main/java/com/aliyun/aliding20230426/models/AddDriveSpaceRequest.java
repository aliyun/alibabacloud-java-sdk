// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddDriveSpaceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("TenantContext")
    public AddDriveSpaceRequestTenantContext tenantContext;

    public static AddDriveSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDriveSpaceRequest self = new AddDriveSpaceRequest();
        return TeaModel.build(map, self);
    }

    public AddDriveSpaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddDriveSpaceRequest setTenantContext(AddDriveSpaceRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public AddDriveSpaceRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class AddDriveSpaceRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static AddDriveSpaceRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            AddDriveSpaceRequestTenantContext self = new AddDriveSpaceRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public AddDriveSpaceRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
