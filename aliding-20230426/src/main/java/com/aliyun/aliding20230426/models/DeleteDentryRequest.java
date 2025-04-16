// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteDentryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b9XJlZ44W3NeDGyA</p>
     */
    @NameInMap("DentryId")
    public String dentryId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nb9XJx4EPx16QGyA</p>
     */
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("TenantContext")
    public DeleteDentryRequestTenantContext tenantContext;

    @NameInMap("ToRecycleBin")
    public Boolean toRecycleBin;

    public static DeleteDentryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDentryRequest self = new DeleteDentryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDentryRequest setDentryId(String dentryId) {
        this.dentryId = dentryId;
        return this;
    }
    public String getDentryId() {
        return this.dentryId;
    }

    public DeleteDentryRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DeleteDentryRequest setTenantContext(DeleteDentryRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public DeleteDentryRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public DeleteDentryRequest setToRecycleBin(Boolean toRecycleBin) {
        this.toRecycleBin = toRecycleBin;
        return this;
    }
    public Boolean getToRecycleBin() {
        return this.toRecycleBin;
    }

    public static class DeleteDentryRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static DeleteDentryRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteDentryRequestTenantContext self = new DeleteDentryRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public DeleteDentryRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
