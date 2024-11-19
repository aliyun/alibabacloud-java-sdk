// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CopyDentryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b9XJljElJv6RPGyA</p>
     */
    @NameInMap("DentryId")
    public String dentryId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>24458420428</p>
     */
    @NameInMap("SpaceId")
    public String spaceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b9XJljElJv6RPG</p>
     */
    @NameInMap("TargetSpaceId")
    public String targetSpaceId;

    @NameInMap("TenantContext")
    public CopyDentryRequestTenantContext tenantContext;

    /**
     * <strong>example:</strong>
     * <p>b9XJljElJv6RPGyA2</p>
     */
    @NameInMap("ToNextDentryId")
    public String toNextDentryId;

    /**
     * <strong>example:</strong>
     * <p>b9XJljElJv6RPGyA4</p>
     */
    @NameInMap("ToParentDentryId")
    public String toParentDentryId;

    /**
     * <strong>example:</strong>
     * <p>b9XJljElJv6RPGyA3</p>
     */
    @NameInMap("ToPrevDentryId")
    public String toPrevDentryId;

    public static CopyDentryRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyDentryRequest self = new CopyDentryRequest();
        return TeaModel.build(map, self);
    }

    public CopyDentryRequest setDentryId(String dentryId) {
        this.dentryId = dentryId;
        return this;
    }
    public String getDentryId() {
        return this.dentryId;
    }

    public CopyDentryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CopyDentryRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public CopyDentryRequest setTargetSpaceId(String targetSpaceId) {
        this.targetSpaceId = targetSpaceId;
        return this;
    }
    public String getTargetSpaceId() {
        return this.targetSpaceId;
    }

    public CopyDentryRequest setTenantContext(CopyDentryRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CopyDentryRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public CopyDentryRequest setToNextDentryId(String toNextDentryId) {
        this.toNextDentryId = toNextDentryId;
        return this;
    }
    public String getToNextDentryId() {
        return this.toNextDentryId;
    }

    public CopyDentryRequest setToParentDentryId(String toParentDentryId) {
        this.toParentDentryId = toParentDentryId;
        return this;
    }
    public String getToParentDentryId() {
        return this.toParentDentryId;
    }

    public CopyDentryRequest setToPrevDentryId(String toPrevDentryId) {
        this.toPrevDentryId = toPrevDentryId;
        return this;
    }
    public String getToPrevDentryId() {
        return this.toPrevDentryId;
    }

    public static class CopyDentryRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static CopyDentryRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CopyDentryRequestTenantContext self = new CopyDentryRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CopyDentryRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
